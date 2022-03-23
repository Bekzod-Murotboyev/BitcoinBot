package uz.pdp.bitcoin;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import uz.pdp.bitcoin.bot.BitcoinBot;
import uz.pdp.bitcoin.service.TelegramBot;
import uz.pdp.bitcoin.service.UserService;

@EnableFeignClients
@RequiredArgsConstructor
@SpringBootApplication
public class BitcoinBotApplication {
    public static void main(String[] args) {
        SpringApplication.run(BitcoinBotApplication.class, args);
    }
}
