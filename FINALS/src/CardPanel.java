
import finals.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardPanel extends JPanel {
    private String eventName; 

    public CardPanel(String eventName) {
        
        // NEW: Store the event name passed into the constructor
        this.eventName = eventName;
        
        // --- 1. Panel Configuration ---
        setPreferredSize(new Dimension(550, 120)); 
        setMaximumSize(new Dimension(600, 120)); 
        setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        setBackground(Color.WHITE);
        setLayout(new BorderLayout(10, 5)); 

        // --- 2. Left Section: Event Details ---
        JPanel detailsPanel = new JPanel();
        detailsPanel.setLayout(new BoxLayout(detailsPanel, BoxLayout.Y_AXIS));
        detailsPanel.setBackground(Color.WHITE);
        detailsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Use the eventName field
        JLabel nameLabel = new JLabel("Event: " + this.eventName); 
        nameLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
        
        JLabel descriptionLabel = new JLabel("<html><p>Detailed description, date, and time for the event...</p></html>");
        
        detailsPanel.add(nameLabel);
        detailsPanel.add(Box.createVerticalStrut(5)); 
        detailsPanel.add(descriptionLabel);
        
        // --- 3. Right Section: Register Button ---
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.setBackground(Color.WHITE);
        
        JButton registerButton = new JButton("Register");
        registerButton.setBackground(new Color(40, 167, 69));
        registerButton.setForeground(Color.BLACK);
        registerButton.setFocusPainted(false);
        registerButton.setPreferredSize(new Dimension(100, 30));

        // Action Listener for the Register Button
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(CardPanel.this, 
                        "Registered for " + eventName + "!", 
                        "Registration Successful", 
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        
        buttonPanel.add(registerButton);

        // --- 4. Assemble the CardPanel ---
        add(detailsPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.EAST);
    }
    
    // 2. NEW: Public method to allow MAINMENU to retrieve the event name
    public String getEventName() {
        return eventName;
    }
}