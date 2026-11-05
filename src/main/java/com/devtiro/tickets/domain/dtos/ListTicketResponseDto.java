package com.devtiro.tickets.domain.dtos;

import com.devtiro.tickets.domain.entities.TicketStatusEnm;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListTicketResponseDto {
    private UUID id;
    private TicketStatusEnm status;
    private ListTicketTicketTypeResponseDto ticketType;
}
