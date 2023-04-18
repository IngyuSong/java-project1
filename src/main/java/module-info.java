module com.likelion.project3 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.likelion.project3 to javafx.fxml;
    exports com.likelion.project3;
}