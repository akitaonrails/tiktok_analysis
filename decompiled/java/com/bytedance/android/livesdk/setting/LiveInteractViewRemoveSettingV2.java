package com.bytedance.android.livesdk.setting;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.google.gson.TypeAdapter;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_interact_view_remove_setting_v2")
public final class LiveInteractViewRemoveSettingV2 {
    public static final Config DEFAULT;
    public static final LiveInteractViewRemoveSettingV2 INSTANCE = new LiveInteractViewRemoveSettingV2();
    public static final int removeViewMask;
    public static final Config value;

    private final int viewIdToBit(int i) {
        if (i == R.id.bnr) {
            return 1;
        }
        if (i == R.id.id6) {
            return 2;
        }
        if (i == R.id.cga) {
            return 8;
        }
        if (i == R.id.fce) {
            return 16;
        }
        if (i == R.id.fdx) {
            return 32;
        }
        if (i == R.id.weq) {
            return 64;
        }
        if (i == R.id.qfy) {
            return 128;
        }
        if (i == R.id.mxe) {
            return 256;
        }
        if (i == R.id.irl) {
            return 512;
        }
        if (i == R.id.cei) {
            return 1024;
        }
        if (i == R.id.s8c) {
            return SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
        }
        if (i == R.id.wqh) {
            return SpeechEngineDefines.TTS_WORK_MODE_BOTH;
        }
        if (i == R.id.ike) {
            return 8192;
        }
        if (i == R.id.sql) {
            return 16384;
        }
        if (i == R.id.cej) {
            return 32768;
        }
        if (i == R.id.kwa) {
            return 65536;
        }
        return i == R.id.ccg ? 131072 : 0;
    }

    static {
        Config config = new Config(false, false, null);
        DEFAULT = config;
        Config config2 = (Config) SettingsManager.INSTANCE.getValueSafely("live_interact_view_remove_setting_v2", config);
        if (config2 != null) {
            config = config2;
        }
        value = config;
        Integer num = config.removeViewMask;
        removeViewMask = num != null ? num.intValue() : 0;
    }

    public final boolean isViewRemoved(int i) {
        int iViewIdToBit;
        Config config = value;
        if (!config.enableRemove) {
            return false;
        }
        if (config.enableRemoveAll) {
            return true;
        }
        int i2 = removeViewMask;
        if (i2 == 0 || i == -1 || (iViewIdToBit = viewIdToBit(i)) == 0 || (i2 & iViewIdToBit) != iViewIdToBit) {
            return false;
        }
        return true;
    }

    public static final class Config {
        public static final TypeAdapter ADAPTER = new LiveInteractViewRemoveSettingV2_Config_OptTypeAdapter(NormalGson.singleton());

        @C09CT("enable_remove")
        public boolean enableRemove;

        @C09CT("enable_remove_all")
        public boolean enableRemoveAll;

        @C09CT("remove_view_mask")
        public Integer removeViewMask;

        public Config() {
            this(false, false, null);
        }

        public Config(boolean z, boolean z2, Integer num) {
            this.enableRemove = z;
            this.enableRemoveAll = z2;
            this.removeViewMask = num;
        }
    }
}
