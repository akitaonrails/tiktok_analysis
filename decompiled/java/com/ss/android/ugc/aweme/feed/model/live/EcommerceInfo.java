package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class EcommerceInfo implements Serializable {

    @C09CT("is_ecom")
    public Boolean isEcom;

    @C09CT("product_cnt")
    public Integer productCnt;

    @C09CT("reviews_tab_anchor")
    public AnchorCommonStruct reviewsTabAnchor;

    @C09CT("should_redirect_one_step_order")
    public Boolean shouldRedirectOneStepOrder;

    @C09CT("spu_list")
    public List<String> spuList;

    public final Boolean isEcom() {
        return this.isEcom;
    }

    public final void setEcom(Boolean bool) {
        this.isEcom = bool;
    }

    public final void setProductCnt(Integer num) {
        this.productCnt = num;
    }

    public final void setReviewsTabAnchor(AnchorCommonStruct anchorCommonStruct) {
        this.reviewsTabAnchor = anchorCommonStruct;
    }

    public final void setShouldRedirectOneStepOrder(Boolean bool) {
        this.shouldRedirectOneStepOrder = bool;
    }

    public final void setSpuList(List<String> list) {
        this.spuList = list;
    }

    public EcommerceInfo(Boolean bool, Integer num, List<String> list, AnchorCommonStruct anchorCommonStruct, Boolean bool2) {
        this.isEcom = bool;
        this.productCnt = num;
        this.spuList = list;
        this.reviewsTabAnchor = anchorCommonStruct;
        this.shouldRedirectOneStepOrder = bool2;
    }
}
