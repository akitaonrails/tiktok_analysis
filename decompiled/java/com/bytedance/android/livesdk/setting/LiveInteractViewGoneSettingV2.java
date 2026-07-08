package com.bytedance.android.livesdk.setting;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.google.gson.TypeAdapter;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes4.dex */
@SettingsKey(preciseExperiment = false, value = "live_interact_view_gone_setting_v2")
public final class LiveInteractViewGoneSettingV2 {
    public static final Config DEFAULT;
    public static final LiveInteractViewGoneSettingV2 INSTANCE = new LiveInteractViewGoneSettingV2();
    public static final int goneViewMask;
    public static final Config value;

    private final int viewIdToBit(int i) {
        if (i == R.id.qhj) {
            return 1;
        }
        if (i == R.id.mo8) {
            return 2;
        }
        if (i == R.id.pve) {
            return 4;
        }
        if (i == R.id.uoc) {
            return 8;
        }
        if (i == R.id.yci) {
            return 16;
        }
        if (i == R.id.v96) {
            return 32;
        }
        if (i == R.id.ir1) {
            return 64;
        }
        if (i == R.id.gf3) {
            return 128;
        }
        if (i == R.id.h5d) {
            return 256;
        }
        if (i == R.id.n7j) {
            return 512;
        }
        if (i == R.id.g_e) {
            return 1024;
        }
        if (i == R.id.wu1) {
            return SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
        }
        if (i == R.id.dc9) {
            return SpeechEngineDefines.TTS_WORK_MODE_BOTH;
        }
        if (i == R.id.ddh) {
            return 8192;
        }
        if (i == R.id.s8f) {
            return 16384;
        }
        if (i == R.id.s8b) {
            return 32768;
        }
        if (i == R.id.bpl) {
            return 65536;
        }
        if (i == R.id.mw2) {
            return 131072;
        }
        if (i == R.id.mxm) {
            return 262144;
        }
        if (i == R.id.n5o) {
            return 524288;
        }
        if (i == R.id.io_) {
            return 1048576;
        }
        if (i == R.id.tfq) {
            return 2097152;
        }
        if (i == R.id.yjr) {
            return 4194304;
        }
        if (i == R.id.bss) {
            return 8388608;
        }
        if (i == R.id.gf0) {
            return 16777216;
        }
        if (i == R.id.video_animate_container) {
            return 33554432;
        }
        if (i == R.id.o1w) {
            return 67108864;
        }
        return i == R.id.qjn ? 134217728 : 0;
    }

    static {
        Config config = new Config(false, null);
        DEFAULT = config;
        Config config2 = (Config) SettingsManager.INSTANCE.getValueSafely("live_interact_view_gone_setting_v2", config);
        if (config2 != null) {
            config = config2;
        }
        value = config;
        Integer num = config.goneViewMask;
        goneViewMask = num != null ? num.intValue() : 0;
    }

    public final boolean enable() {
        return value.enable;
    }

    public final boolean isViewGone(int i) {
        int i2;
        int iViewIdToBit;
        if (!value.enable || (i2 = goneViewMask) == 0 || i == -1 || (iViewIdToBit = viewIdToBit(i)) == 0 || (i2 & iViewIdToBit) != iViewIdToBit) {
            return false;
        }
        return true;
    }

    public static final class Config {
        public static final TypeAdapter ADAPTER = new LiveInteractViewGoneSettingV2_Config_OptTypeAdapter(NormalGson.singleton());

        @C09CT("enable")
        public boolean enable;

        @C09CT("gone_view_mask")
        public Integer goneViewMask;

        public Config() {
            this(false, null);
        }

        public Config(boolean z, Integer num) {
            this.enable = z;
            this.goneViewMask = num;
        }
    }
}
