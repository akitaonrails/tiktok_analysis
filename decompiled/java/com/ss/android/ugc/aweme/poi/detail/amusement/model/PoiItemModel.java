package com.ss.android.ugc.aweme.poi.detail.amusement.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiItemModel {

    @C09CT("aweme")
    public final Aweme aweme;

    @C09CT("item_type")
    public final Integer itemType;

    public PoiItemModel() {
        this(null, null);
    }

    public PoiItemModel(Integer num, Aweme aweme) {
        this.itemType = num;
        this.aweme = aweme;
    }
}
