package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubConfig {
    public static final TypeAdapter ADAPTER = new FansClubConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("live_native_gecko_enter_room_res_config")
    public List<BarrageEnterRoomResConfig> barrageEnterRoomConfigList;

    @C09CT("live_native_barrage_gecko_source_config")
    public List<BarrageGradeResConfig> barrageResConfigList;

    @C09CT("fans_club_dynamic_config")
    public FansClubDynamicConfig fansClubDynamicConfig;

    @C09CT("fans_club_entrance_lottie_resource_config")
    public FansClubLottieConfig fansClubLottieConfig;

    @C09CT("live_native_entrance_gecko_source_config")
    public List<FansEntranceResConfig> fansEntranceGeckoConfigList;

    @C09CT("gecko_resource_download_config")
    public GeckoResourceDownloadConfig geckoResourceDownloadConfig;

    public FansClubConfig() {
        this(null, null, null, null, null, null);
    }

    public FansClubConfig(List<BarrageGradeResConfig> list, FansClubDynamicConfig fansClubDynamicConfig, List<FansEntranceResConfig> list2, List<BarrageEnterRoomResConfig> list3, GeckoResourceDownloadConfig geckoResourceDownloadConfig, FansClubLottieConfig fansClubLottieConfig) {
        this.barrageResConfigList = list;
        this.fansClubDynamicConfig = fansClubDynamicConfig;
        this.fansEntranceGeckoConfigList = list2;
        this.barrageEnterRoomConfigList = list3;
        this.geckoResourceDownloadConfig = geckoResourceDownloadConfig;
        this.fansClubLottieConfig = fansClubLottieConfig;
    }
}
