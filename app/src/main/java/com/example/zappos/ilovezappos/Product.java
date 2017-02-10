package com.example.zappos.ilovezappos;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by divyasingh on 2/6/17.
 */

public class Product
{
    @Getter
    @Setter
    private String statusCode;


    public List<Results> getResults() {
        return results;
    }

    private List<Results> results;

    public String getTerm() {
        return term;
    }

    private String term;

    @Getter @Setter
    private String originalTerm;

    @Getter @Setter
    private String currentResultCount;

    @Getter @Setter
    private String totalResultCount;

    @Override
    public String toString()
    {
        return "ClassPojo [statusCode = "+statusCode+", results = "+results+", term = "+term+", originalTerm = "+originalTerm+", currentResultCount = "+currentResultCount+", totalResultCount = "+totalResultCount+"]";
    }
}

class Results
{
    public String getStyleId() {
        return styleId;
    }

    public void setStyleId(String styleId) {
        this.styleId = styleId;
    }

    private String styleId;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    private String price;

    private String originalPrice;

    private String productUrl;

    private String colorId;

    public String getProductName() {
        return productName;
    }

    private String productName;

    private String brandName;

    public String getThumbnailImageUrl() {
        return thumbnailImageUrl;
    }

    private String thumbnailImageUrl;

    private String percentOff;

    private String productId;

    @Override
    public String toString()
    {
        return "ClassPojo [styleId = "+styleId+", price = "+price+", originalPrice = "+originalPrice+", productUrl = "+productUrl+", colorId = "+colorId+", productName = "+productName+", brandName = "+brandName+", thumbnailImageUrl = "+thumbnailImageUrl+", percentOff = "+percentOff+", productId = "+productId+"]";
    }
}