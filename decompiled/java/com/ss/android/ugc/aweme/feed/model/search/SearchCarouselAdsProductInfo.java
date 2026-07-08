package com.ss.android.ugc.aweme.feed.model.search;

import X.C09CT;
import com.ss.android.ugc.aweme.commercialize.model.JumpData;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class SearchCarouselAdsProductInfo implements Serializable {

    @C09CT("height")
    public int height;

    @C09CT("jump_data")
    public final JumpData jumpData;

    @C09CT("product_id")
    public String productId;

    @C09CT("uri")
    public final String uri = "";

    @C09CT("url_list")
    public List<String> urlList;

    @C09CT("width")
    public int width;

    public final int getHeight() {
        return this.height;
    }

    public final JumpData getJumpData() {
        return this.jumpData;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getUri() {
        return this.uri;
    }

    public final List<String> getUrlList() {
        return this.urlList;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setProductId(String str) {
        this.productId = str;
    }

    public final void setUrlList(List<String> list) {
        this.urlList = list;
    }

    public final void setWidth(int i) {
        this.width = i;
    }
}
