package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class AssetDetail {

    @C09CT("balance_additional_info")
    public final String cashBalance;

    @C09CT("jump_link")
    public final String jumpLink;

    @C09CT("layout_type")
    public final int layoutType;

    @C09CT("balance")
    public final String pointBalance;

    public AssetDetail() {
        this(null, null, null, 0);
    }

    public AssetDetail(String str, String str2, String str3, int i) {
        this.jumpLink = str;
        this.pointBalance = str2;
        this.cashBalance = str3;
        this.layoutType = i;
    }
}
