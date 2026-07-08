package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_interact_view_async")
public final class LiveInteractViewAsyncOpt {
    public static final Config DEFAULT;
    public static final LiveInteractViewAsyncOpt INSTANCE = new LiveInteractViewAsyncOpt();
    public static final Config value;

    static {
        Config config = new Config(false, false, null, false);
        DEFAULT = config;
        value = (Config) SettingsManager.INSTANCE.getValueSafely("live_interact_view_async", config);
    }

    public final boolean enable() {
        Config config = value;
        return config != null && config.enable;
    }

    public final boolean reuseThread() {
        Config config = value;
        return config != null && config.reuseThread;
    }

    public final boolean enablePreload() {
        Config config;
        return enable() && (config = value) != null && config.enablePreload;
    }

    public final int getThreadPriority(int i) {
        Integer num;
        Config config = value;
        if (config != null && (num = config.threadPriority) != null) {
            return num.intValue();
        }
        return i;
    }

    public static final class Config {
        public static final TypeAdapter ADAPTER = new LiveInteractViewAsyncOpt_Config_OptTypeAdapter(NormalGson.singleton());

        @C09CT("enable")
        public boolean enable;

        @C09CT("enable_preload")
        public boolean enablePreload;

        @C09CT("reuse_thread")
        public boolean reuseThread;

        @C09CT("thread_priority")
        public Integer threadPriority;

        public Config() {
            this(false, false, null, false);
        }

        public Config(boolean z, boolean z2, Integer num, boolean z3) {
            this.enable = z;
            this.reuseThread = z2;
            this.threadPriority = num;
            this.enablePreload = z3;
        }
    }
}
