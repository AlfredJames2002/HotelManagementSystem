package com.mycompany.hotelmanagement;

import javax.swing.*;

public class HotelManagement {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() { //prevents threading issues
            public void run() {
                new LoginGUI();
            }
        });
    }
}
