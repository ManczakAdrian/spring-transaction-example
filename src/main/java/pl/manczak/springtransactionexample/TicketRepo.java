package pl.manczak.springtransactionexample;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepo extends JpaRepository <Ticket, Long> {
}
