package hu.bme.mit.train.controller;

import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainSensor;
import hu.bme.mit.train.interfaces.TrainUser;
import hu.bme.mit.train.system.TrainSystem;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainControllerImplTest {

    TrainController controller;
    TrainSensor sensor;
    TrainUser user;

    @Before
    public void before() {
        TrainSystem system = new TrainSystem();
        controller = system.getController();
        sensor = system.getSensor();
        user = system.getUser();

        sensor.overrideSpeedLimit(50);
    }

    @Test
    public void SetSpeed_tesz_by_me() {
        controller.setSpeedLimit(10);
        sensor.getSpeedLimit();
        Assert.assertEquals(10, controller.getReferenceSpeed());
    }

}