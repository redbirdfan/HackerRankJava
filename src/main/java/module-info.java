module com.example.hackerrankjava {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.hackerrankjava to javafx.fxml;
    exports com.example.hackerrankjava;
}