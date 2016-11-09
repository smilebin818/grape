package com.yan.co.grape.entity;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by yanbin on 2016/11/09.
 */
public class NewsInfo {
    public ImageView productImg;
    public TextView productTitle;
    public TextView productInfo;

    public ImageView getProductImg() {
        return productImg;
    }

    public void setProductImg(ImageView productImg) {
        this.productImg = productImg;
    }

    public TextView getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(TextView productTitle) {
        this.productTitle = productTitle;
    }

    public TextView getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(TextView productInfo) {
        this.productInfo = productInfo;
    }
}
