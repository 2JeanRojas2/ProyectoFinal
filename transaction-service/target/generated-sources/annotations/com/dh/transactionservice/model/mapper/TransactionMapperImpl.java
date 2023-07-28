package com.dh.transactionservice.model.mapper;

import com.dh.transactionservice.model.Transaction;
import com.dh.transactionservice.model.dto.response.TransactionResponseDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-29T10:24:57-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class TransactionMapperImpl implements TransactionMapper {

    @Override
    public List<TransactionResponseDto> transactionListToTransactionResponseDtoList(List<Transaction> transactions) {
        if ( transactions == null ) {
            return null;
        }

        List<TransactionResponseDto> list = new ArrayList<TransactionResponseDto>( transactions.size() );
        for ( Transaction transaction : transactions ) {
            list.add( transactionToTransactionResponseDto( transaction ) );
        }

        return list;
    }

    protected TransactionResponseDto transactionToTransactionResponseDto(Transaction transaction) {
        if ( transaction == null ) {
            return null;
        }

        TransactionResponseDto transactionResponseDto = new TransactionResponseDto();

        transactionResponseDto.setAmount( transaction.getAmount() );
        transactionResponseDto.setDated( transaction.getDated() );
        transactionResponseDto.setDescription( transaction.getDescription() );
        transactionResponseDto.setDestination( transaction.getDestination() );
        transactionResponseDto.setOrigin( transaction.getOrigin() );
        transactionResponseDto.setType( transaction.getType() );
        transactionResponseDto.setCategory( transaction.getCategory() );

        return transactionResponseDto;
    }
}
