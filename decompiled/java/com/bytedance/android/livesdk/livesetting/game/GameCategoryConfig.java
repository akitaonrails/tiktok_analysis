package com.bytedance.android.livesdk.livesetting.game;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.io.Serializable;

/* JADX INFO: loaded from: classes36.dex */
public final class GameCategoryConfig implements Serializable {
    public static final TypeAdapter ADAPTER = new GameCategoryConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("complexity_low")
    public long[] complexityLow = new long[0];

    @C09CT("complexity_default")
    public long[] complexityDefault = new long[0];

    @C09CT("complexity_high")
    public long[] complexityHigh = new long[0];

    @C09CT("business_low")
    public long[] businessLow = new long[0];

    @C09CT("business_default")
    public long[] businessDefault = new long[0];

    @C09CT("business_high")
    public long[] businessHigh = new long[0];

    public final long[] getBusinessDefault() {
        return this.businessDefault;
    }

    public final long[] getBusinessHigh() {
        return this.businessHigh;
    }

    public final long[] getBusinessLow() {
        return this.businessLow;
    }

    public final long[] getComplexityDefault() {
        return this.complexityDefault;
    }

    public final long[] getComplexityHigh() {
        return this.complexityHigh;
    }

    public final long[] getComplexityLow() {
        return this.complexityLow;
    }

    public final void setBusinessDefault(long[] jArr) {
        this.businessDefault = jArr;
    }

    public final void setBusinessHigh(long[] jArr) {
        this.businessHigh = jArr;
    }

    public final void setBusinessLow(long[] jArr) {
        this.businessLow = jArr;
    }

    public final void setComplexityDefault(long[] jArr) {
        this.complexityDefault = jArr;
    }

    public final void setComplexityHigh(long[] jArr) {
        this.complexityHigh = jArr;
    }

    public final void setComplexityLow(long[] jArr) {
        this.complexityLow = jArr;
    }
}
