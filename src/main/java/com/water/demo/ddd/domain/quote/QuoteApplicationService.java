package com.water.demo.ddd.domain.quote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.water.demo.ddd.domain.quote.command.GenerateCarPolicyQuoteCommand;
import com.water.demo.ddd.domain.quote.command.GenerateHomePolicyQuoteCommand;
import com.water.demo.ddd.domain.quote.model.CarPolicyQuote;
import com.water.demo.ddd.domain.quote.model.HomePolicyQuote;
import com.water.demo.ddd.domain.quote.model.PolicyQuote;
import com.water.demo.ddd.domain.quote.repository.CarPolicyQuoteRepository;
import com.water.demo.ddd.domain.quote.repository.HomePolicyQuoteRepository;
import com.water.demo.ddd.domain.quote.service.QuoteService;

@Service
@Transactional
public class QuoteApplicationService {

    @Autowired
    private QuoteService quoteService;

    @Autowired
    private CarPolicyQuoteRepository carPolicyQuoteRepository;

    @Autowired
    private HomePolicyQuoteRepository homePolicyQuoteRepository;

    public PolicyQuote generateQuote(GenerateHomePolicyQuoteCommand command) {
        HomePolicyQuote homePolicyQuote = quoteService.generateHomePolicyQuote(command);

        homePolicyQuoteRepository.save(homePolicyQuote);

        return homePolicyQuote;
    }

    public PolicyQuote generateQuote(GenerateCarPolicyQuoteCommand command) {
        CarPolicyQuote carPolicyQuote = quoteService.generateCarPolicyQuote(command);

        carPolicyQuoteRepository.save(carPolicyQuote);

        return carPolicyQuote;
    }
}
