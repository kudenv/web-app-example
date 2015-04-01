package com.apress.springrecipes.court.config;

import com.apress.springrecipes.court.service.ReservationServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by dkuvikov on 3/27/15.
 */
//@Configuration
//@ComponentScan("com.apress.springrecipes.court.service")
public class ServiceConfiguration {

    //@Bean
    public ReservationServiceImpl reservationService(){
        return new ReservationServiceImpl();
    }
}
