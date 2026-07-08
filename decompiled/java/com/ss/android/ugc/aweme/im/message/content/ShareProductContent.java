package com.ss.android.ugc.aweme.im.message.content;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;

/* JADX INFO: loaded from: classes15.dex */
public final class ShareProductContent extends BaseContent {

    @C09CT("product_picture")
    public UrlModel picture;

    @C09CT("seller_avatar")
    public UrlModel sellerAvatar;

    @C09CT("product_title")
    public String title = "";

    @C09CT("product_price")
    public String price = "";

    @C09CT("product_sales")
    public String sales = "";

    @C09CT("product_query_params")
    public String queryParams = "";

    @C09CT("seller_name")
    public String sellerName = "";

    @C09CT("product_id")
    public String productId = "";

    public final UrlModel getPicture() {
        return this.picture;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getQueryParams() {
        return this.queryParams;
    }

    public final String getSales() {
        return this.sales;
    }

    public final UrlModel getSellerAvatar() {
        return this.sellerAvatar;
    }

    public final String getSellerName() {
        return this.sellerName;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setPicture(UrlModel urlModel) {
        this.picture = urlModel;
    }

    public final void setPrice(String str) {
        this.price = str;
    }

    public final void setProductId(String str) {
        this.productId = str;
    }

    public final void setQueryParams(String str) {
        this.queryParams = str;
    }

    public final void setSales(String str) {
        this.sales = str;
    }

    public final void setSellerAvatar(UrlModel urlModel) {
        this.sellerAvatar = urlModel;
    }

    public final void setSellerName(String str) {
        this.sellerName = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
