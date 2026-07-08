package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_with_guest_competition_notify_setting")
public final class CohostWithGuestNotifySetting {
    public static final CohostWithGuestNotifySetting INSTANCE = new CohostWithGuestNotifySetting();
    public static final Configs DEFAULT = new Configs(true, true);

    public final Configs getValue() {
        return (Configs) SettingsManager.INSTANCE.getValueSafely("cohost_with_guest_competition_notify_setting", DEFAULT);
    }

    public static final class Configs {
        public static final TypeAdapter ADAPTER = new CohostWithGuestNotifySetting_Configs_OptTypeAdapter(NormalGson.singleton());

        @C09CT("cohost_linked")
        public boolean coHostLinked;

        @C09CT("cohost_widget_create_for_audience")
        public boolean cohostWidgetCreatedForAudience;

        public Configs() {
            this(true, true);
        }

        public Configs(boolean z, boolean z2) {
            this.coHostLinked = z;
            this.cohostWidgetCreatedForAudience = z2;
        }
    }
}
