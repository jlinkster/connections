package com.jlinkster.cucumber.stepdefs;

import com.jlinkster.ConnectionsApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = ConnectionsApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
