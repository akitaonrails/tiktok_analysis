package com.ss.android.ugc.aweme.search.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class LocalServiceLiveInfo implements Serializable {

    @C09CT("anchor_brand_cover")
    public final UrlModel anchorBrandCover;

    @C09CT("anchor_label_text")
    public final String anchorLabelText;

    @C09CT("is_ls_live")
    public final Integer isLsLive;

    @C09CT("product_list")
    public final List<LsLiveProductInfo> productList;

    public final Integer isLsLive() {
        return this.isLsLive;
    }

    public LocalServiceLiveInfo(Integer num, String str, UrlModel urlModel, List<LsLiveProductInfo> list) {
        this.isLsLive = num;
        this.anchorLabelText = str;
        this.anchorBrandCover = urlModel;
        this.productList = list;
    }
}
