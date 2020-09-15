package com.r.b.c.dj.djapp.service;

import com.r.b.c.dj.djapp.model.StockIndex;
import com.r.b.c.dj.djapp.repository.StockIndexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockRepositoryService {

    @Autowired
    private StockIndexRepository stockIndexRepository;

    public int addWeeklyIndex(StockIndex stockIndex) {
        StockIndex sIndex = stockIndexRepository.saveStockIndex(stockIndex);
        return sIndex != null ? 1 : 0;
    }

    public List<StockIndex> getAllWeeklyIndex() {
        return stockIndexRepository.getAllStockIndex();
    }

    public List<StockIndex> getSelectedIndices(String stockName) {
        return stockIndexRepository.getSelectedIndices(stockName);
    }

    public void deleteCollection() {
        stockIndexRepository.deleteStockIndexCollection();
    }
}
