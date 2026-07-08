package com.ss.android.ugc.aweme.vision.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Sku implements Serializable {

    @C09CT("sku_id")
    public String skuId;

    @C09CT("sku_props")
    public List<SkuProp> skuProps;

    public Sku() {
        this(null, null);
    }

    public final void setSkuId(String str) {
        this.skuId = str;
    }

    public final void setSkuProps(List<SkuProp> list) {
        this.skuProps = list;
    }

    public Sku(String str, List<SkuProp> list) {
        this.skuId = str;
        this.skuProps = list;
    }
}
