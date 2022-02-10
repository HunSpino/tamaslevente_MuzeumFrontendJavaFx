module com.example.tamaslevente_muzeumfrontendjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tamaslevente_muzeumfrontendjavafx to javafx.fxml;
    exports com.example.tamaslevente_muzeumfrontendjavafx;
}