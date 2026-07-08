package com.bytedance.android.livesdk.comp.api.pcs.data.model;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class TetrisAdParam {

    @C09CT("ad_id")
    public final String adId;

    @C09CT("adv_id")
    public final String advId;

    @C09CT("creative_id")
    public final String creativeId;

    @C09CT("pixel_code")
    public final String pixelCode;

    public TetrisAdParam() {
        this(null, null, null, null);
    }

    public TetrisAdParam(String str, String str2, String str3, String str4) {
        this.adId = str;
        this.advId = str2;
        this.creativeId = str3;
        this.pixelCode = str4;
    }
}
