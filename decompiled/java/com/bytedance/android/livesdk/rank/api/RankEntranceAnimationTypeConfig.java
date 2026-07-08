package com.bytedance.android.livesdk.rank.api;

import X.C09CT;
import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
@SettingsKey("live_rank_entrance_animation_config")
public final class RankEntranceAnimationTypeConfig {
    public static final Config DEFAULT;
    public static final RankEntranceAnimationTypeConfig INSTANCE = new RankEntranceAnimationTypeConfig();
    public static HashMap<Integer, RankAnimationType> configValue;

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Config {
        public static final TypeAdapter ADAPTER = new RankEntranceAnimationTypeConfig_Config_OptTypeAdapter(NormalGson.singleton());

        @C09CT("rank_entrance_animation_type_list")
        public List<RankAnimationType> rankEntranceAnimationTypeList;

        public Config() {
            this(new ArrayList());
        }

        public Config(List<RankAnimationType> list) {
            this.rankEntranceAnimationTypeList = list;
        }
    }

    static {
        RankAnimationType rankAnimationType = RankAnimationType.LIZ;
        DEFAULT = new Config(C1697810uHb.LJIIJJI(RankAnimationType.LIZ, RankAnimationType.LIZIZ, RankAnimationType.LIZJ, RankAnimationType.LIZLLL, RankAnimationType.LJ, RankAnimationType.LJFF, RankAnimationType.LJI, RankAnimationType.LJII, RankAnimationType.LJIIIIZZ, RankAnimationType.LJIIIZ, RankAnimationType.LJIIJ, RankAnimationType.LJIIJJI, RankAnimationType.LJIIL, RankAnimationType.LJIILIIL, RankAnimationType.LJIILJJIL, RankAnimationType.LJIILL, RankAnimationType.LJIILLIIL, RankAnimationType.LJIIZILJ, RankAnimationType.LJIJ, RankAnimationType.LJIJI, RankAnimationType.LJIJJ));
    }

    public final HashMap<Integer, RankAnimationType> getValue() {
        HashMap<Integer, RankAnimationType> map = configValue;
        if (map != null) {
            return map;
        }
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Config config = DEFAULT;
        Config config2 = (Config) settingsManager.getValueSafely("live_rank_entrance_animation_config", config);
        if (config2 == null) {
            config2 = config;
        }
        List<RankAnimationType> list = config2.rankEntranceAnimationTypeList;
        if (list.isEmpty()) {
            list = config.rankEntranceAnimationTypeList;
        }
        HashMap<Integer, RankAnimationType> map2 = new HashMap<>();
        for (RankAnimationType rankAnimationType : list) {
            map2.put(Integer.valueOf(rankAnimationType.type), rankAnimationType);
        }
        configValue = map2;
        return map2;
    }
}
