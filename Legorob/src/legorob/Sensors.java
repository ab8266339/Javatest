
package legorob;

import ShefRobot.Robot;
import ShefRobot.Sensor;

/**
 *
 * @author eia14hx
 */
public class Sensors extends Robot{
    Robot myRobot = new Robot();
    Sensor ultrasonic = myRobot.getUltrasonicSensor(Sensor.Port.S1);
    

    public float[] getRawSample(){
        float[] rawSample = ultrasonic.getRawSample();
        
        return rawSample;
    }
    public void range(){
        
    }
}  