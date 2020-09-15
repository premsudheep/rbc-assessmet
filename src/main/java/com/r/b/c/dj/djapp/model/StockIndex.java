package com.r.b.c.dj.djapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "stockIndex")
public class StockIndex implements Serializable {
    @Id
    //@Indexed(unique = true)
    private long id;
    private String quarter;
    private String stock;
    private String date;
    private String open;
    private String high;
    private String low;
    private String close;
    private String volume;
    private String percentChangePrice;
    private String percentChangeVolumeOverLastWeek;
    private String previousWeeksVolume;
    private String nextWeeksOpen;
    private String nextWeeksClose;
    private String percentChangeNextWeeksPrice;
    private String daysToNextDividend;
    private String percentReturnNextDividend;

    public StockIndex(String quarter, String stock, String date, String open, String high, String low, String close, String volume, String percentChangePrice, String percentChangeVolumeOverLastWeek, String previousWeeksVolume, String nextWeeksOpen, String nextWeeksClose, String percentChangeNextWeeksPrice, String daysToNextDividend, String percentReturnNextDividend) {
        //this.id = id;
        this.quarter = quarter;
        this.stock = stock;
        this.date = date;
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
        this.volume = volume;
        this.percentChangePrice = percentChangePrice;
        this.percentChangeVolumeOverLastWeek = percentChangeVolumeOverLastWeek;
        this.previousWeeksVolume = previousWeeksVolume;
        this.nextWeeksOpen = nextWeeksOpen;
        this.nextWeeksClose = nextWeeksClose;
        this.percentChangeNextWeeksPrice = percentChangeNextWeeksPrice;
        this.daysToNextDividend = daysToNextDividend;
        this.percentReturnNextDividend = percentReturnNextDividend;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQuarter() {
        return quarter;
    }

    public String getStock() {
        return stock;
    }

    public String getDate() {
        return date;
    }

    public String getOpen() {
        return open;
    }

    public String getHigh() {
        return high;
    }

    public String getLow() {
        return low;
    }

    public String getClose() {
        return close;
    }

    public String getVolume() {
        return volume;
    }

    public String getPercentChangePrice() {
        return percentChangePrice;
    }

    public String getPercentChangeVolumeOverLastWeek() {
        return percentChangeVolumeOverLastWeek;
    }

    public String getPreviousWeeksVolume() {
        return previousWeeksVolume;
    }

    public String getNextWeeksOpen() {
        return nextWeeksOpen;
    }

    public String getNextWeeksClose() {
        return nextWeeksClose;
    }

    public String getPercentChangeNextWeeksPrice() {
        return percentChangeNextWeeksPrice;
    }

    public String getDaysToNextDividend() {
        return daysToNextDividend;
    }

    public String getPercentReturnNextDividend() {
        return percentReturnNextDividend;
    }

    public void setQuarter(String quarter) {
        this.quarter = quarter;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public void setClose(String close) {
        this.close = close;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public void setPercentChangePrice(String percentChangePrice) {
        this.percentChangePrice = percentChangePrice;
    }

    public void setPercentChangeVolumeOverLastWeek(String percentChangeVolumeOverLastWeek) {
        this.percentChangeVolumeOverLastWeek = percentChangeVolumeOverLastWeek;
    }

    public void setPreviousWeeksVolume(String previousWeeksVolume) {
        this.previousWeeksVolume = previousWeeksVolume;
    }

    public void setNextWeeksOpen(String nextWeeksOpen) {
        this.nextWeeksOpen = nextWeeksOpen;
    }

    public void setNextWeeksClose(String nextWeeksClose) {
        this.nextWeeksClose = nextWeeksClose;
    }

    public void setPercentChangeNextWeeksPrice(String percentChangeNextWeeksPrice) {
        this.percentChangeNextWeeksPrice = percentChangeNextWeeksPrice;
    }

    public void setDaysToNextDividend(String daysToNextDividend) {
        this.daysToNextDividend = daysToNextDividend;
    }

    public void setPercentReturnNextDividend(String percentReturnNextDividend) {
        this.percentReturnNextDividend = percentReturnNextDividend;
    }

    @Override
    public String toString() {
        return "DataAttributeBean{" +
                //"id='" + id + '\'' +
                "quarter='" + quarter + '\'' +
                ", stock='" + stock + '\'' +
                ", date='" + date + '\'' +
                ", open='" + open + '\'' +
                ", high='" + high + '\'' +
                ", low='" + low + '\'' +
                ", close='" + close + '\'' +
                ", volume='" + volume + '\'' +
                ", percentChangePrice='" + percentChangePrice + '\'' +
                ", percentChangeVolumeOverLastWeek='" + percentChangeVolumeOverLastWeek + '\'' +
                ", previousWeeksVolume='" + previousWeeksVolume + '\'' +
                ", nextWeeksOpen='" + nextWeeksOpen + '\'' +
                ", nextWeeksClose='" + nextWeeksClose + '\'' +
                ", percentChangeNextWeeksPrice='" + percentChangeNextWeeksPrice + '\'' +
                ", daysToNextDividend='" + daysToNextDividend + '\'' +
                ", percentReturnNextDividend='" + percentReturnNextDividend + '\'' +
                '}';
    }
}
