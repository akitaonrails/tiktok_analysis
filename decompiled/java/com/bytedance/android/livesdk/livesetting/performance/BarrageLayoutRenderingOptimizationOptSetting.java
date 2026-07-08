package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_barrage_layout_rendering_optimization_opt_setting")
public final class BarrageLayoutRenderingOptimizationOptSetting {
    public static final BarrageLayoutRenderingOptimizationOptSetting INSTANCE = new BarrageLayoutRenderingOptimizationOptSetting();
    public static final Config DEFAULT = new Config(C1697810uHb.LJ(8, 10));

    public static final class Config {
        public static final TypeAdapter ADAPTER = new BarrageLayoutRenderingOptimizationOptSetting_Config_OptTypeAdapter(NormalGson.singleton());

        @C09CT("barrage_message_type_list")
        public List<Integer> barrageMessageTypeList;

        public Config() {
            this(new ArrayList());
        }

        public Config(List<Integer> list) {
            this.barrageMessageTypeList = list;
        }
    }

    public final Config getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Config config = DEFAULT;
        Config config2 = (Config) settingsManager.getValueSafely("live_barrage_layout_rendering_optimization_opt_setting", config);
        return config2 != null ? config2 : config;
    }
}
