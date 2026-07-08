package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveConsumingFunOptConfig {
    public static final TypeAdapter ADAPTER = new LiveConsumingFunOptConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("inbox_cache_opt")
    public boolean inboxCacheOpt;

    @C09CT("setting_raw_opt")
    public boolean settingRawOpt;

    public LiveConsumingFunOptConfig() {
        this(false, false);
    }

    public final boolean getInboxCacheOpt() {
        return this.inboxCacheOpt;
    }

    public final boolean getSettingRawOpt() {
        return this.settingRawOpt;
    }

    public final void setInboxCacheOpt(boolean z) {
        this.inboxCacheOpt = z;
    }

    public final void setSettingRawOpt(boolean z) {
        this.settingRawOpt = z;
    }

    public LiveConsumingFunOptConfig(boolean z, boolean z2) {
        this.settingRawOpt = z;
        this.inboxCacheOpt = z2;
    }
}
