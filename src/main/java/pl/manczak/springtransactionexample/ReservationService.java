package pl.manczak.springtransactionexample;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

@Service
public class ReservationService {

    private TicketRepo ticketRepo;

    public ReservationService(TicketRepo ticketRepo) {
        this.ticketRepo = ticketRepo;

    }

    @Transactional(rollbackFor = SQLException.class)
    public void save() throws SQLException {
        Ticket ticket = new Ticket();
        ticket.setName("to Canada");
        ticketRepo.save(ticket);
        throw new  SQLException ("problem!");

    }
}
