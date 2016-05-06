/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package legorob;
import ShefRobot.*;
/**
 *
 * @author Hao Xu
 */
public class Movement extends Robot{
        Robot myRobot = new Robot();
        Motor leftMotor = myRobot.getLargeMotor(Motor.Port.B);
        Motor rightMotor = myRobot.getLargeMotor(Motor.Port.C);
        Speaker speaker = myRobot.getSpeaker();
        Motor rotor = myRobot.getLargeMotor(Motor.Port.D);
        
        
    public void setMovingSpeed(int val){
        leftMotor.setSpeed(val);
        rightMotor.setSpeed(val);
       
            
    }    
    public void Forward(){

            leftMotor.forward();
            rightMotor.forward();
           
    }
    public void Backward(){
        
        leftMotor.backward();
        rightMotor.backward();
    }
    public void stop(){
        leftMotor.stop();
        rightMotor.stop();
        rotor.stop();
    }
    public void left(){
        rightMotor.forward();
        leftMotor.stop();
    }

    public void right() {
        rightMotor.stop();
        leftMotor.forward();
    }
    public void rotorup(){
        rotor.setSpeed(20);
        rotor.forward();
        myRobot.sleep(100);
        rotor.stop();
    }
    public void rotorleft(){
          rotor.forward();
                myRobot.sleep(120);
                rotor.stop();
    }
    public void rotorright(){
        rotor.backward();
                myRobot.sleep(120);
                rotor.stop();
    }
}
