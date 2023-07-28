package com.dh.accountservice.domain.mapper;

import com.dh.accountservice.domain.dto.request.TransferenceRequestDto;
import com.dh.accountservice.domain.dto.request.TransferenceResponseDto;
import com.dh.accountservice.domain.dto.response.AccountByTransferenceDto;
import com.dh.accountservice.domain.dto.response.AccountResponseDto;
import com.dh.accountservice.domain.model.Account;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-29T10:26:43-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class AccountMapperImpl extends AccountMapper {

    @Override
    public AccountResponseDto accountToAccountResponseDto(Account account) {
        if ( account == null ) {
            return null;
        }

        AccountResponseDto accountResponseDto = new AccountResponseDto();

        accountResponseDto.setCvu( account.getCvu() );
        accountResponseDto.setAlias( account.getAlias() );
        accountResponseDto.setAvailableAmount( account.getAvailableAmount() );

        return accountResponseDto;
    }

    @Override
    public AccountByTransferenceDto accountToAccountByTransferenceDto(Account account) {
        if ( account == null ) {
            return null;
        }

        AccountByTransferenceDto accountByTransferenceDto = new AccountByTransferenceDto();

        accountByTransferenceDto.setId( account.getId() );
        accountByTransferenceDto.setCvu( account.getCvu() );
        accountByTransferenceDto.setAvailableAmount( account.getAvailableAmount() );
        accountByTransferenceDto.setUserId( account.getUserId() );

        return accountByTransferenceDto;
    }

    @Override
    public TransferenceResponseDto transferenceRequestDtoToTransferenceResponseDto(TransferenceRequestDto transferenceRequestDto) {
        if ( transferenceRequestDto == null ) {
            return null;
        }

        TransferenceResponseDto transferenceResponseDto = new TransferenceResponseDto();

        transferenceResponseDto.setDestination( transferenceRequestDto.getDestination() );
        transferenceResponseDto.setOrigin( transferenceRequestDto.getOrigin() );
        transferenceResponseDto.setAmount( transferenceRequestDto.getAmount() );
        transferenceResponseDto.setDated( transferenceRequestDto.getDated() );

        return transferenceResponseDto;
    }
}
