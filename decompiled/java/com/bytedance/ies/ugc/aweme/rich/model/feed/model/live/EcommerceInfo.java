package com.bytedance.ies.ugc.aweme.rich.model.feed.model.live;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class EcommerceInfo implements Serializable {

    @C09CT("is_ecom")
    public Boolean isEcom;

    @C09CT("product_cnt")
    public Integer productCnt;

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

    public final void setSpuList(List<String> list) {
        this.spuList = list;
    }

    public EcommerceInfo(Boolean bool, Integer num, List<String> list) {
        this.isEcom = bool;
        this.productCnt = num;
        this.spuList = list;
    }
}
