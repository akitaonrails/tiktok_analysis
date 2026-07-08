package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public final class DialogCustomData implements Serializable {

    @C09CT("sub_price_groups")
    public final Map<String, SubPriceInfo> subPriceList;

    @C09CT("sub_prices")
    public final List<PriceItem> subPrices;

    public DialogCustomData() {
        this(null, null);
    }

    public DialogCustomData(List<PriceItem> list, Map<String, SubPriceInfo> map) {
        this.subPrices = list;
        this.subPriceList = map;
    }
}
