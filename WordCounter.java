import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WordCounter 
{
    public static void main(String[] args) 
    {
        System.out.println("---Welcome to WordCounter---");

        // Create the main frame
        JFrame frame = new JFrame("Word Counter");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        JTextArea textArea = new JTextArea(" ");
        JButton countButton = new JButton("Count Words");
        JLabel resultLabel = new JLabel("Word Count: 0");

        // Set layout and add components
        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);
        frame.add(countButton, BorderLayout.SOUTH);
        frame.add(resultLabel, BorderLayout.NORTH);

        // Make the frame visible
        frame.setVisible(true);

        countButton.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText();
                String[] words = text.trim().split("\\s+");
                int wordCount = words.length;
                resultLabel.setText("Word Count: " + wordCount);
            }
        });
    }
}