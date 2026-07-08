package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class BgGovernorStagesConfig {
    public static final TypeAdapter ADAPTER = new BgGovernorStagesConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("IMMEDIATE")
    public BgGovernorStageOption immediate = new BgGovernorStageOption();

    /* JADX INFO: renamed from: short, reason: not valid java name */
    @C09CT("SHORT")
    public BgGovernorStageOption f25short = new BgGovernorStageOption();

    @C09CT("MEDIUM")
    public BgGovernorStageOption medium = new BgGovernorStageOption();

    /* JADX INFO: renamed from: long, reason: not valid java name */
    @C09CT("LONG")
    public BgGovernorStageOption f24long = new BgGovernorStageOption();

    @C09CT("CRITICAL")
    public BgGovernorStageOption critical = new BgGovernorStageOption();

    public final BgGovernorStageOption getCritical() {
        return this.critical;
    }

    public final BgGovernorStageOption getImmediate() {
        return this.immediate;
    }

    public final BgGovernorStageOption getLong() {
        return this.f24long;
    }

    public final BgGovernorStageOption getMedium() {
        return this.medium;
    }

    public final BgGovernorStageOption getShort() {
        return this.f25short;
    }

    public final void setCritical(BgGovernorStageOption bgGovernorStageOption) {
        this.critical = bgGovernorStageOption;
    }

    public final void setImmediate(BgGovernorStageOption bgGovernorStageOption) {
        this.immediate = bgGovernorStageOption;
    }

    public final void setLong(BgGovernorStageOption bgGovernorStageOption) {
        this.f24long = bgGovernorStageOption;
    }

    public final void setMedium(BgGovernorStageOption bgGovernorStageOption) {
        this.medium = bgGovernorStageOption;
    }

    public final void setShort(BgGovernorStageOption bgGovernorStageOption) {
        this.f25short = bgGovernorStageOption;
    }
}
