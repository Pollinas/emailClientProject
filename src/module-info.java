module emailClientProject {
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.web;
    requires javafx.controls;

    opens com.barosanu;
    opens com.barosanu.view;
    opens com.barosanu.controller;
}