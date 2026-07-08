package com.ss.android.ugc.aweme.search.ecom.data;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class ShopIcon {

    @C09CT("icon")
    public final LabelIcon icon;

    @C09CT("icon_type")
    public final Integer iconType;

    public ShopIcon() {
        this(null, null);
    }

    public ShopIcon(Integer num, LabelIcon labelIcon) {
        this.iconType = num;
        this.icon = labelIcon;
    }
}
