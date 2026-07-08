package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class BgGovernorStageOption {
    public static final TypeAdapter ADAPTER = new BgGovernorStageOption_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enabled")
    public boolean enabled = true;

    @C09CT("delay_ms")
    public long delayMs = -1;

    @C09CT("actions")
    public List<String> actions = C13BV.INSTANCE;

    public final List<String> getActions() {
        return this.actions;
    }

    public final long getDelayMs() {
        return this.delayMs;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final void setActions(List<String> list) {
        this.actions = list;
    }

    public final void setDelayMs(long j) {
        this.delayMs = j;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }
}
