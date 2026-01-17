package org.firstinspires.ftc.teamcode.hardware;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.hardware.rev.RevTouchSensor;
import com.qualcomm.robotcore.hardware.AnalogInput;

public class RobotHardware {

    // Drive
    public DcMotor frontLeft, backLeft, frontRight, backRight;

    // Intake
    public DcMotor intakeMotor;

    // Shooter
    public DcMotor flywheelMotor;
    public DcMotor turretMotor;
    public DcMotor indexerMotor;
    public CRServo hoodServo;
    public AnalogInput hoodPot;
    public RevTouchSensor leftLimit;
    public RevTouchSensor rightLimit;
    public Servo rgbLight;

    public void init(HardwareMap hwMap) {

        // Drive
        frontLeft  = hwMap.get(DcMotor.class, "front left");
        backLeft   = hwMap.get(DcMotor.class, "back left");
        frontRight = hwMap.get(DcMotor.class, "front right");
        backRight  = hwMap.get(DcMotor.class, "back right");

        frontRight.setDirection(DcMotor.Direction.REVERSE);
        backRight.setDirection(DcMotor.Direction.REVERSE);

        // Intake
        intakeMotor = hwMap.get(DcMotorEx.class, "Intake");

        // Shooter
        flywheelMotor = hwMap.get(DcMotor.class, "flywheel");
        turretMotor   = hwMap.get(DcMotorEx.class, "lazysusan");
        indexerMotor  = hwMap.get(DcMotorEx.class, "Indexer");
        hoodServo     = hwMap.get(CRServo.class, "hood");
        leftLimit     = hwMap.get(RevTouchSensor.class, "left-limitSwitch");
        rightLimit    = hwMap.get(RevTouchSensor.class, "right-limitSwitch");
        hoodPot       = hwMap.get(AnalogInput.class, "potentiometer");
        rgbLight      = hwMap.get(Servo.class, "rgbIndicator");
    }
}

