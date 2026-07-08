package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_with_guest_anchor_notify_mg_when_mg_finish")
public final class CohostWithGuestAnchorNotifyMGOnlyWhenMGFinishOptSetting {
    public static final CohostWithGuestAnchorNotifyMGOnlyWhenMGFinishOptSetting INSTANCE = new CohostWithGuestAnchorNotifyMGOnlyWhenMGFinishOptSetting();
    public static final Configs DEFAULT = new Configs(true, true, 7000);

    public final Configs getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Configs configs = DEFAULT;
        Configs configs2 = (Configs) settingsManager.getValueSafely("cohost_with_guest_anchor_notify_mg_when_mg_finish", configs);
        return configs2 != null ? configs2 : configs;
    }

    public final boolean isEnabled() {
        return getValue().isEnabled;
    }

    public final boolean isTimeOutEnabled() {
        return isEnabled() && getValue().timeOutMs > 0;
    }

    public final long timeOutMs() {
        return getValue().timeOutMs;
    }

    public static final class Configs {
        public static final TypeAdapter ADAPTER = new CohostWithGuestAnchorNotifyMGOnlyWhenMGFinishOptSetting_Configs_OptTypeAdapter(NormalGson.singleton());

        @C09CT("is_enabled")
        public boolean isEnabled;

        @C09CT("mark_mg_finish_after_session_destroy")
        public boolean markMgFinishAfterSessionDestroy;

        @C09CT("time_out_ms")
        public long timeOutMs;

        public Configs() {
            this(true, true, 7000L);
        }

        public Configs(boolean z, boolean z2, long j) {
            this.isEnabled = z;
            this.markMgFinishAfterSessionDestroy = z2;
            this.timeOutMs = j;
        }
    }
}
