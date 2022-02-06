// import statements
package com.company;
import java.io.File;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

public class Main implements ActionListener {

    //Creating 9 buttons and the frame where the program will run
    JFrame frame;
    JButton button1 = new JButton("▢");
    JButton button2 = new JButton("▢");
    JButton button3 = new JButton("▢");
    JButton button4 = new JButton("▢");
    JButton button5 = new JButton("▢");
    JButton button6 = new JButton("▢");
    JButton button7 = new JButton("▢");
    JButton button8 = new JButton("▢");
    JButton button9 = new JButton("▢");

    //Assigning the audioclip which will help with providing the sounds
    AudioClip click;

    //Main constructor
    Main() {

        //Creating the frame and giving it a title and a background color
        frame = new JFrame("Simplistic Launchpad - Press To Begin");
        frame.setBackground(Color.white);

        // adding buttons to the frame
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);

        //setting the grid layout with 3 rows and 3 columns
        frame.setLayout(new GridLayout(3, 3));

        //Giving the frame a size and making it visible
        frame.setSize(1000, 1000);
        frame.setVisible(true);

        //Customizing the fonts of the buttons' text
        button1.setFont(new Font("Arial", Font.PLAIN, 200));
        button2.setFont(new Font("Arial", Font.PLAIN, 200));
        button3.setFont(new Font("Arial", Font.PLAIN, 200));
        button4.setFont(new Font("Arial", Font.PLAIN, 200));
        button5.setFont(new Font("Arial", Font.PLAIN, 200));
        button6.setFont(new Font("Arial", Font.PLAIN, 200));
        button7.setFont(new Font("Arial", Font.PLAIN, 200));
        button8.setFont(new Font("Arial", Font.PLAIN, 200));
        button9.setFont(new Font("Arial", Font.PLAIN, 200));

        //Making the buttons' borders not painted
        button1.setBorderPainted(false);
        button2.setBorderPainted(false);
        button3.setBorderPainted(false);
        button4.setBorderPainted(false);
        button5.setBorderPainted(false);
        button6.setBorderPainted(false);
        button7.setBorderPainted(false);
        button8.setBorderPainted(false);
        button9.setBorderPainted(false);

        //Assigning a background color for the frame
        frame.getContentPane().setBackground(Color.black);

        //Making the buttons clickable
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);

    }

    // main method
    public static void main(String args[]) {
        new Main();
        feedbackFunction();
        }

    //The function which decides what happens when each button is pressed
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button1) {
            button1.setBackground(Color.yellow);
            frame.getContentPane().setBackground(Color.yellow);
            button1.setBorderPainted(false);
            try {
                File sound = new File("src/com/company/sound1.wav");
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(sound));
                clip.start();
            } catch (Exception y) {
                System.out.println("Got exception" + y);
            }
        }
        if (e.getSource() == button2) {
            button2.setBackground(Color.red);
            frame.getContentPane().setBackground(Color.red);
            button2.setBorderPainted(false);
            try {
                File sound = new File("src/com/company/sound2.wav");
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(sound));
                clip.start();
            } catch (Exception y) {
                System.out.println("Got exception" + y);
            }
        }
        if (e.getSource() == button3) {
            button3.setBackground(Color.black);
            frame.getContentPane().setBackground(Color.cyan);
            button3.setBorderPainted(false);
            try {
                File sound = new File("src/com/company/sound3.wav");
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(sound));
                clip.start();
            } catch (Exception y) {
                System.out.println("Got exception" + y);
            }
        }
        if (e.getSource() == button4) {
            button4.setBackground(Color.white);
            frame.getContentPane().setBackground(Color.magenta);
            button4.setBorderPainted(false);
            try {
                File sound = new File("src/com/company/sound4.wav");
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(sound));
                clip.start();
            } catch (Exception y) {
                System.out.println("Got exception" + y);
            }
        }
        if (e.getSource() == button5) {
            button5.setBackground(Color.blue);
            frame.getContentPane().setBackground(Color.blue);
            button5.setBorderPainted(false);
            try {
                File sound = new File("src/com/company/sound5.wav");
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(sound));
                clip.start();
            } catch (Exception y) {
                System.out.println("Got exception" + y);
            }
        }
        if (e.getSource() == button6) {
            button6.setBackground(Color.orange);
            frame.getContentPane().setBackground(Color.orange);
            button6.setBorderPainted(false);
            try {
                File sound = new File("src/com/company/sound6.wav");
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(sound));
                clip.start();
            } catch (Exception y) {
                System.out.println("Got exception" + y);
            }
        }
        if (e.getSource() == button7) {
            button7.setBackground(Color.pink);
            frame.getContentPane().setBackground(Color.pink);
            button7.setBorderPainted(false);
            try {
                File sound = new File("src/com/company/sound7.wav");
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(sound));
                clip.start();
            } catch (Exception y) {
                System.out.println("Got exception" + y);
            }
        }
        if (e.getSource() == button8) {
            button8.setBackground(Color.gray);
            frame.getContentPane().setBackground(Color.gray);
            button8.setBorderPainted(false);
            try {
                File sound = new File("src/com/company/sound10.wav");
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(sound));
                clip.start();
            } catch (Exception y) {
                System.out.println("Got exception" + y);
            }
        }
        if (e.getSource() == button9) {
            button9.setBackground(Color.green);
            frame.getContentPane().setBackground(Color.green);
            button9.setBorderPainted(false);
            try {
                File sound = new File("src/com/company/sound9.wav");
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(sound));
                clip.start();
            } catch (Exception y) {
                System.out.println("Got exception" + y);
            }
        }
    }

    //Function used to ask for feedback from the user
    public static void feedbackFunction(){
        //Assigning scanner and asking for the user to give feedback as an integer
        Scanner scanner1 = new Scanner(System.in);
        System.out.println();
        System.out.println("Did you enjoy the program? Please rate it on a scale from 10 to 20: ");
        int worksOnlyOnce = 0;
        int input = scanner1.nextInt();

        //Specifying that the input needs to be an integer over or equal to 10 but less than or equal to 20
        while(input >=10 && input <= 20) {
            while(worksOnlyOnce == 0){
                System.out.println("Thank you for your feedback!");
                worksOnlyOnce = worksOnlyOnce + 1;
            }
        }
    }
}