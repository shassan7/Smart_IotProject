/* ------------------------------------------------------------------------------------
 * SmartDevice.java
 * 
 * Copyright (c) 2023 Venos Tech. All rights reserved
 * 
 * Related Documents: 
 *    Specification Document 
 *    Design Document
 * 
 *
 * 
 * Associated Files: IoTController.java (one to many)
 *                   Account (parent class)
 * ------------------------------------------------------------------------------------
 */
public class User extends Account {

    public User(String firstName, String lastName, String email, String password) {
	super(firstName, lastName, email, password);
    }

}
