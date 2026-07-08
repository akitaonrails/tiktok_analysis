package com.bytedance.android.livesdk.rank.api;

import X.C09CT;
import X.EnumC1083240eIM;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.HashMap;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_rank_lynx_config")
public final class LiveRankLynxConfig {
    public static final Config DEFAULT;
    public static final LiveRankLynxConfig INSTANCE = new LiveRankLynxConfig();

    public static final class Config {
        public static final TypeAdapter ADAPTER = new LiveRankLynxConfig_Config_OptTypeAdapter(NormalGson.singleton());

        @C09CT("rank_schema_config_list")
        public HashMap<Integer, HashMap<Long, String>> rankSchemaConfigList;

        public Config() {
            this(new HashMap());
        }

        public Config(HashMap<Integer, HashMap<Long, String>> map) {
            this.rankSchemaConfigList = map;
        }
    }

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put(Long.valueOf(EnumC1083240eIM.RANK_DIALOG.getScene()), "");
        map2.put(Long.valueOf(EnumC1083240eIM.RANK_PAGE.getScene()), "");
        map2.put(Long.valueOf(EnumC1083240eIM.BOTTOM_BAR.getScene()), "");
        map.put(-1, map2);
        DEFAULT = new Config(map);
    }

    public final Config getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Config config = DEFAULT;
        Config config2 = (Config) settingsManager.getValueSafely("live_rank_lynx_config", config);
        return config2 != null ? config2 : config;
    }
}
