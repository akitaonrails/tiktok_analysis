package com.ss.android.ugc.aweme.component.searchcomponent.shopheader;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class ShopTagInfo {

    @C09CT("text")
    public String text;

    @C09CT("type")
    public final int type;

    public ShopTagInfo() {
        this(0, null);
    }

    public ShopTagInfo(int i, String str) {
        this.type = i;
        this.text = str;
    }
}
