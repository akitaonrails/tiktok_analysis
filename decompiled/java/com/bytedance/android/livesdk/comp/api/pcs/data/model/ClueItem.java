package com.bytedance.android.livesdk.comp.api.pcs.data.model;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class ClueItem {

    @C09CT("brick_index")
    public final String brickIndex;

    @C09CT("encrypt_type")
    public final int encryptType;

    @C09CT("is_prefill")
    public final boolean isPrefill;

    @C09CT("is_skip")
    public final boolean isSkip;

    @C09CT("source")
    public final String source;

    @C09CT("value")
    public final String value;

    public ClueItem() {
        this("", false, "", false, "", 0);
    }

    public ClueItem(String str, boolean z, String str2, boolean z2, String str3, int i) {
        this.brickIndex = str;
        this.isPrefill = z;
        this.value = str2;
        this.isSkip = z2;
        this.source = str3;
        this.encryptType = i;
    }
}
