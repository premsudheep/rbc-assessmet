package com.r.b.c.dj.djapp.repository;

import com.r.b.c.dj.djapp.model.StockIndex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockIndexRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    public StockIndex saveStockIndex(StockIndex stockIndex) {
        return mongoTemplate.insert(stockIndex);
    }

    public List<StockIndex> getAllStockIndex() {
        return mongoTemplate.findAll(StockIndex.class, "stockIndex");
    }

    public List<StockIndex> getSelectedIndices(String stockName) {
        Query query = new Query();
        query.addCriteria(Criteria.where("stock").is(stockName));
        return mongoTemplate.find(query, StockIndex.class, "stockIndex");
    }

    public void deleteStockIndexCollection() {
        mongoTemplate.dropCollection(StockIndex.class);
    }
}
