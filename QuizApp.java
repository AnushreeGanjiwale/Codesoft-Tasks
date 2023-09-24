import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuizApp extends JFrame {
    private JLabel questionLabel;
    private JRadioButton[] options;
    private JButton submitButton;
    private ButtonGroup optionGroup;
    private int currentQuestion = 0;
    private int score = 0;

    private String[][] questions = {
            {"What is the capital of France?", "Paris", "London", "Berlin", "Madrid"},
            {"What is 2 + 2?", "4", "3", "5", "2"},
            {"Which planet is known as the Red Planet?", "Mars", "Venus", "Jupiter", "Saturn"},
    };

    private String[] correctAnswers = {"Paris", "4", "Mars"};

    public QuizApp() {
        setTitle("Quiz App");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);

        questionLabel = new JLabel(questions[currentQuestion][0]);
        options = new JRadioButton[4];
        optionGroup = new ButtonGroup();
        for (int i = 0; i < 4; i++) {
            options[i] = new JRadioButton(questions[currentQuestion][i + 1]);
            optionGroup.add(options[i]);
        }
        submitButton = new JButton("Submit");

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkAnswer();
                if (currentQuestion < questions.length - 1) {
                    currentQuestion++;
                    displayQuestion();
                } else {
                    showResult();
                }
            }
        });

        setLayout(new GridLayout(6, 1));
        add(questionLabel);
        for (int i = 0; i < 4; i++) {
            add(options[i]);
        }
        add(submitButton);

        displayQuestion();
    }

    private void displayQuestion() {
        questionLabel.setText(questions[currentQuestion][0]);
        for (int i = 0; i < 4; i++) {
            options[i].setText(questions[currentQuestion][i + 1]);
            options[i].setSelected(false);
        }
    }

    private void checkAnswer() {
        for (int i = 0; i < 4; i++) {
            if (options[i].isSelected() && options[i].getText().equals(correctAnswers[currentQuestion])) {
                score++;
                break;
            }
        }
    }

    private void showResult() {
        JOptionPane.showMessageDialog(this, "Quiz completed!\nYour score is: " + score + " out of " + questions.length);
        System.exit(0);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new QuizApp().setVisible(true);
            }
        });
    }
}

