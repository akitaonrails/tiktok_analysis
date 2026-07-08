package com.bytedance.android.livesdk.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class GiftBoxInfo {

    @C09CT("capacity")
    public long capacity;

    @C09CT("is_primary_box")
    public boolean isPrimaryBox;

    @C09CT("scheme_url")
    public String schemeUrl;

    public GiftBoxInfo() {
        this(0L, false, null);
    }

    public GiftBoxInfo(long j, boolean z, String str) {
        this.capacity = j;
        this.isPrimaryBox = z;
        this.schemeUrl = str;
    }
}
