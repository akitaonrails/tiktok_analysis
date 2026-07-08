package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class LevelSystemResourceConfig {
    public static final TypeAdapter ADAPTER = new LevelSystemResourceConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("barrage_effect_strategy")
    public int effectStrategy;

    @C09CT("fans_gecko_enter_room_res_config")
    public List<BarrageEnterRoomResConfig> fansBarrageEnterRoomConfigList;

    @C09CT("fans_club_native_gecko_source_video_config")
    public List<BarrageGradeResConfig> fansBarrageResConfigList;

    @C09CT("gecko_ondemand_config")
    public LevelSystemGeckoOnDemandConfig geckoOnDemandConfig;

    @C09CT("level_gecko_enter_room_res_config")
    public List<BarrageEnterRoomResConfig> levelBarrageEnterRoomConfigList;

    @C09CT("user_level_native_gecko_source_video_config")
    public List<BarrageGradeResConfig> levelBarrageResConfigList;

    public LevelSystemResourceConfig() {
        this(0, null, null, null, null, null);
    }

    public LevelSystemResourceConfig(int i, List<BarrageGradeResConfig> list, List<BarrageGradeResConfig> list2, List<BarrageEnterRoomResConfig> list3, List<BarrageEnterRoomResConfig> list4, LevelSystemGeckoOnDemandConfig levelSystemGeckoOnDemandConfig) {
        this.effectStrategy = i;
        this.levelBarrageResConfigList = list;
        this.fansBarrageResConfigList = list2;
        this.levelBarrageEnterRoomConfigList = list3;
        this.fansBarrageEnterRoomConfigList = list4;
        this.geckoOnDemandConfig = levelSystemGeckoOnDemandConfig;
    }
}
