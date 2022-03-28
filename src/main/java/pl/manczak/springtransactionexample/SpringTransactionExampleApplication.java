package pl.manczak.springtransactionexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.sql.SQLException;

@SpringBootApplication
public class SpringTransactionExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringTransactionExampleApplication.class, args);
    }

    private final ReservationService reservationService;

    public SpringTransactionExampleApplication(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void get() throws SQLException {
         reservationService.save();

    }
}
