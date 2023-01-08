package pl.infoshare.validation.raise.model;

import lombok.Value;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AcceptedRaise {
    private static final String ID_FORMAT = "%s-%s";
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd.MMM.yyyy");

    private final String id;
    private final LocalDate date;
    private final BigDecimal acceptedSalary;

    public AcceptedRaise(String id, LocalDate date, BigDecimal acceptedSalary) {
        this.id = id;
        this.date = date;
        this.acceptedSalary = acceptedSalary;
    }

    public static AcceptedRaise forRequest(RaiseRequest raiseRequest) {
        var date = raiseRequest.getProposedRaiseDate();
        var proposedSalary = raiseRequest.getProposedSalary().intValue();
        var id = String.format(ID_FORMAT, date.format(DATE_FORMATTER), proposedSalary);

        return new AcceptedRaise(id, date, raiseRequest.getProposedSalary());
    }

    public String getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public BigDecimal getAcceptedSalary() {
        return acceptedSalary;
    }
}
