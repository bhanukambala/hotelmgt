package org.dxctraining.ui;

import org.dxctraining.JavaConfig;
import org.dxctraining.entities.*;
import org.dxctraining.exceptions.*;
import org.dxctraining.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.*;

public class GuestUi {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(JavaConfig.class);
        context.refresh();

    }

}