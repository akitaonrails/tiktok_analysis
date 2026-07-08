package com.bytedance.android.livesdk.livesetting.message;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes35.dex */
public final class LiveGamePauseSeiModel {
    public static final TypeAdapter ADAPTER = new LiveGamePauseSeiModel_OptTypeAdapter(NormalGson.singleton());

    @C09CT("im_fallback_enable")
    public boolean imFallbackEnable;

    @C09CT("is_anchor_enable")
    public boolean isAnchorEnable;

    @C09CT("is_audience_enable")
    public boolean isAudienceEnable;

    @C09CT("time_interval")
    public long timeInterval;

    public LiveGamePauseSeiModel() {
        this(false, false, 1000L, false);
    }

    public final boolean getImFallbackEnable() {
        return this.imFallbackEnable;
    }

    public final long getTimeInterval() {
        return this.timeInterval;
    }

    public final boolean isAnchorEnable() {
        return this.isAnchorEnable;
    }

    public final boolean isAudienceEnable() {
        return this.isAudienceEnable;
    }

    public final void setAnchorEnable(boolean z) {
        this.isAnchorEnable = z;
    }

    public final void setAudienceEnable(boolean z) {
        this.isAudienceEnable = z;
    }

    public final void setImFallbackEnable(boolean z) {
        this.imFallbackEnable = z;
    }

    public final void setTimeInterval(long j) {
        this.timeInterval = j;
    }

    public LiveGamePauseSeiModel(boolean z, boolean z2, long j, boolean z3) {
        this.isAudienceEnable = z;
        this.isAnchorEnable = z2;
        this.timeInterval = j;
        this.imFallbackEnable = z3;
    }
}
