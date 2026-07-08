package com.ss.android.ugc.aweme.ecommerce.review;

import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes33.dex */
public final class EcAnchorReviewsBizData implements Serializable {
    public String productId;
    public AnchorProductInfo productInfo;
    public Integer reviewCount;
    public String sellerId;

    public EcAnchorReviewsBizData() {
        this(null, null, null, null);
    }

    public final void setProductId(String str) {
        this.productId = str;
    }

    public final void setProductInfo(AnchorProductInfo anchorProductInfo) {
        this.productInfo = anchorProductInfo;
    }

    public final void setReviewCount(Integer num) {
        this.reviewCount = num;
    }

    public final void setSellerId(String str) {
        this.sellerId = str;
    }

    public EcAnchorReviewsBizData(String str, String str2, Integer num, AnchorProductInfo anchorProductInfo) {
        this.productId = str;
        this.sellerId = str2;
        this.reviewCount = num;
        this.productInfo = anchorProductInfo;
    }
}
