package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_video_frame_elapse_opt_settings")
public final class TTLHVideoFrameElapseOptSettings {
    public static final TTLHVideoFrameElapseOptSettings INSTANCE = new TTLHVideoFrameElapseOptSettings();
    public static final TTLHVideoQualitySettings DEFAULT = new TTLHVideoQualitySettings();

    public final TTLHVideoQualitySettings getConfigs() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        TTLHVideoQualitySettings tTLHVideoQualitySettings = DEFAULT;
        TTLHVideoQualitySettings tTLHVideoQualitySettings2 = (TTLHVideoQualitySettings) settingsManager.getValueSafely("ttlh_video_frame_elapse_opt_settings", tTLHVideoQualitySettings);
        return tTLHVideoQualitySettings2 != null ? tTLHVideoQualitySettings2 : tTLHVideoQualitySettings;
    }

    public static final class TTLHVideoQualitySettings implements Serializable {
        public static final TypeAdapter ADAPTER;

        @C09CT("config")
        public int config;

        @C09CT("offset_time")
        public long offsetTime;

        @C09CT("type")
        public int type;

        static {
            NormalGson.singleton();
            ADAPTER = new TTLHVideoFrameElapseOptSettings_TTLHVideoQualitySettings_OptTypeAdapter();
        }

        public final int getConfig() {
            return this.config;
        }

        public final long getOffsetTime() {
            return this.offsetTime;
        }

        public final int getType() {
            return this.type;
        }

        public final void setConfig(int i) {
            this.config = i;
        }

        public final void setOffsetTime(long j) {
            this.offsetTime = j;
        }

        public final void setType(int i) {
            this.type = i;
        }
    }
}
