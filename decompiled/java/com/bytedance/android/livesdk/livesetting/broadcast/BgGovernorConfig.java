package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class BgGovernorConfig {
    public static final TypeAdapter ADAPTER = new BgGovernorConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("media_session")
    public boolean enableMediaSession;

    @C09CT("enabled")
    public boolean enabled;

    @C09CT("stages")
    public BgGovernorStagesConfig stages = new BgGovernorStagesConfig();

    public final boolean getEnableMediaSession() {
        return this.enableMediaSession;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final BgGovernorStagesConfig getStages() {
        return this.stages;
    }

    public final void setEnableMediaSession(boolean z) {
        this.enableMediaSession = z;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final void setStages(BgGovernorStagesConfig bgGovernorStagesConfig) {
        this.stages = bgGovernorStagesConfig;
    }
}
