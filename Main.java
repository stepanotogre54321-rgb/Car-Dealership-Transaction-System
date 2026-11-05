package chbcars;

import chbcars.data.DataStore;
import chbcars.ui.Dialogs;
import chbcars.ui.LoginFrame;
import chbcars.ui.Theme;
import chbcars.util.ErrorHandler;
import javax.swing.SwingUtilities;

/** Program entry point: chb cars.ph Car Dealership Management System. */
public class Main {

    public static void main(String[] args) {
      
            DataStore.get().initialize(); 
            Theme.install();
            LoginFrame login = new LoginFrame();
            login.setVisible(true);
          
            }
        ;
    }

