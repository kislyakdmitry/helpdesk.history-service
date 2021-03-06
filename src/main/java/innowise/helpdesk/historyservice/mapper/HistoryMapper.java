package innowise.helpdesk.historyservice.mapper;

import innowise.helpdesk.historyservice.dto.HistoryDto;
import innowise.helpdesk.historyservice.model.History;
import org.springframework.stereotype.Component;

@Component
public class HistoryMapper {

    public History mapHistoryDtoToHistory(HistoryDto historyDto){
        return  History.builder()
                .ticketId(historyDto.getTicketId())
                .created(historyDto.getCreated())
                .action(historyDto.getAction())
                .userId(historyDto.getUserId())
                .description(historyDto.getDescription())
                .build();
    }

    public HistoryDto mapHistoryToSaveHistoryDto(History history){
        return HistoryDto.builder()
                .ticketId(history.getTicketId())
                .created(history.getCreated())
                .action(history.getAction())
                .userId(history.getUserId())
                .description(history.getDescription())
                .build();
    }

}