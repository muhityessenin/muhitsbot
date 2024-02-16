package kz.telegrambot.muhitsbot.service;

import kz.telegrambot.muhitsbot.exception.ServiceException;
import org.springframework.stereotype.Service;
@Service
public interface ExchangeRatesService {
    String getUSDExchangeRate() throws ServiceException;
    String getEURExchangeRate() throws ServiceException;
}
