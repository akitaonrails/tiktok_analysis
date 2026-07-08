package com.ss.android.ugc.aweme.feed.model.search;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class SearchLiveCommdityStruct implements Serializable {

    @C09CT("cover")
    public String cover;

    @C09CT("height")
    public int height;

    @C09CT("price")
    public String price = "";

    @C09CT("product_id")
    public String productId;

    @C09CT("promotion_id")
    public String promotionId;

    @C09CT("scheme")
    public String scheme;

    @C09CT("source")
    public String source;

    @C09CT("title")
    public String title;

    public final String getCover() {
        return this.cover;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getPromotionId() {
        return this.promotionId;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setCover(String str) {
        this.cover = str;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setPrice(String str) {
        this.price = str;
    }

    public final void setProductId(String str) {
        this.productId = str;
    }

    public final void setPromotionId(String str) {
        this.promotionId = str;
    }

    public final void setScheme(String str) {
        this.scheme = str;
    }

    public final void setSource(String str) {
        this.source = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
