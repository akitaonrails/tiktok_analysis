package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftGuideFansClubFallbackParams {
    public static final TypeAdapter ADAPTER;

    @C09CT("fallback_gift_id")
    public long fallbackGiftId;

    @C09CT("guide_type")
    public String guideType;

    static {
        NormalGson.singleton();
        ADAPTER = new GiftGuideFansClubFallbackParams_OptTypeAdapter();
    }

    public GiftGuideFansClubFallbackParams() {
        this("gift_guide_popup", 5655L);
    }

    public GiftGuideFansClubFallbackParams(String str, long j) {
        this.guideType = str;
        this.fallbackGiftId = j;
    }
}
