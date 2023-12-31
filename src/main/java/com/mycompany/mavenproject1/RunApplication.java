package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.controllers.BuddyInfoRepository;
import com.mycompany.mavenproject1.controllers.AddressBookRepository;
import com.mycompany.mavenproject1.models.AddressBook;
import com.mycompany.mavenproject1.models.BuddyInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author Mohammad 101162465
 */
@SpringBootApplication
public class RunApplication {
    private static final Logger log = LoggerFactory.getLogger(RunApplication.class);
   
    
    @Bean
    public CommandLineRunner demo(BuddyInfoRepository buddyRepository,
            AddressBookRepository bookRepository) {
        return (args) -> {
            var jimmy = new BuddyInfo("jimmy", "613-111-2222", "102 Favella Circle");
            var timmy = new BuddyInfo("timmy", "613-222-3333", "511 Kinderheim Street");
            var himmy = new BuddyInfo("himmy", "613-333-4444", "940 Industry Road");
            var billy = new BuddyInfo("billy", "613-444-5555", "1738 Fett Avenue");
            var willy = new BuddyInfo("willy", "613-555-6666", "488 Wayward Boulevard");
            var book = new AddressBook();
            book.addBuddy(new BuddyInfo("harold", "613-741-7410", "17 Stone Street"));
            book.addBuddy(new BuddyInfo("garold", "613-852-8520", "7 Mile Street"));
            book.addBuddy(new BuddyInfo("larold", "613-963-9630", "8 Mile Street"));
            book.addBuddy(new BuddyInfo("walter", "613-147-1470", "908 Negra Arroya Lane"));
            book.addBuddy(new BuddyInfo("donald", "613-258-2580", "70 Ward Circle"));
            buddyRepository.save(jimmy);
            buddyRepository.save(timmy);
            buddyRepository.save(himmy);
            buddyRepository.save(billy);
            buddyRepository.save(willy);
            /*log.info("Buddies found with findAll():");
            log.info("-----------------------------");
            buddyRepository.findAll().forEach(b -> {
                log.info(b.toString());
            });
*/
          /*  BuddyInfo buddy = buddyRepository.findById(3L);
            log.info("Buddy found with findById(3L):");
            log.info("-----------------------------");
            log.info(buddy.toString());
            log.info("");
            */
          /*
            log.info("Buddy found with findByName('jimmy'):");
            log.info("--------------------------------------------");
            buddyRepository.findByName("jimmy").forEach(result -> {
                log.info(result.toString());
            });*/
             bookRepository.save(book);
            log.info("Address books found with findAll():");
            log.info("-----------------------------");
            bookRepository.findAll().forEach(a -> {
                log.info(a.toString());
            });
                      
        };    
    }

   
    public static void main(String[] args) {
        SpringApplication.run(RunApplication.class, args);
    }
}
