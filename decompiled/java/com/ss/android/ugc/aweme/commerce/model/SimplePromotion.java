package com.ss.android.ugc.aweme.commerce.model;

import X.C09CT;
import X.C13BV;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class SimplePromotion extends CommerceBaseResponse implements Serializable {

    @C09CT("comment_area")
    public String commentArea;

    @C09CT("elastic_images")
    public List<? extends UrlModel> elasticImages;

    @C09CT("jump_to_url")
    public boolean jumpToUrl;

    @C09CT("label")
    public List<String> labels;

    @C09CT("meta_param")
    public String metaParam;

    @C09CT("price")
    public int price;

    @C09CT("promotion_source")
    public int promotionSource;

    @C09CT("sales")
    public int sales;

    @C09CT("visitor")
    public PromotionVisitor visitor;

    @C09CT("promotion_id")
    public String promotionId = "";

    @C09CT("product_id")
    public String productId = "";

    @C09CT("title")
    public String title = "";

    @C09CT("elastic_title")
    public String elasticTitle = "";

    @C09CT("card_url")
    public String cardUrl = "";

    public final String getLongTitle() {
        return !TextUtils.isEmpty(this.title) ? this.title : this.elasticTitle;
    }

    public final String getShortTitle() {
        return TextUtils.isEmpty(this.elasticTitle) ? this.title : this.elasticTitle;
    }

    public SimplePromotion() {
        C13BV c13bv = C13BV.INSTANCE;
        this.elasticImages = c13bv;
        this.labels = c13bv;
    }

    public final String getCardUrl() {
        return this.cardUrl;
    }

    public final String getCommentArea() {
        return this.commentArea;
    }

    public final List<UrlModel> getElasticImages() {
        return this.elasticImages;
    }

    public final String getElasticTitle() {
        return this.elasticTitle;
    }

    public final boolean getJumpToUrl() {
        return this.jumpToUrl;
    }

    public final List<String> getLabels() {
        return this.labels;
    }

    public final String getMetaParam() {
        return this.metaParam;
    }

    public final int getPrice() {
        return this.price;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getPromotionId() {
        return this.promotionId;
    }

    public final int getPromotionSource() {
        return this.promotionSource;
    }

    public final int getSales() {
        return this.sales;
    }

    public final String getTitle() {
        return this.title;
    }

    public final PromotionVisitor getVisitor() {
        return this.visitor;
    }

    public final void setCardUrl(String str) {
        this.cardUrl = str;
    }

    public final void setCommentArea(String str) {
        this.commentArea = str;
    }

    public final void setElasticImages(List<? extends UrlModel> list) {
        this.elasticImages = list;
    }

    public final void setElasticTitle(String str) {
        this.elasticTitle = str;
    }

    public final void setJumpToUrl(boolean z) {
        this.jumpToUrl = z;
    }

    public final void setLabels(List<String> list) {
        this.labels = list;
    }

    public final void setMetaParam(String str) {
        this.metaParam = str;
    }

    public final void setPrice(int i) {
        this.price = i;
    }

    public final void setProductId(String str) {
        this.productId = str;
    }

    public final void setPromotionId(String str) {
        this.promotionId = str;
    }

    public final void setPromotionSource(int i) {
        this.promotionSource = i;
    }

    public final void setSales(int i) {
        this.sales = i;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setVisitor(PromotionVisitor promotionVisitor) {
        this.visitor = promotionVisitor;
    }
}
