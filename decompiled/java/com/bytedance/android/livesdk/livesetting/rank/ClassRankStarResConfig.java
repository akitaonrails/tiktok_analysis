package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class ClassRankStarResConfig {
    public static final TypeAdapter ADAPTER = new ClassRankStarResConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("live_class_rank_gecko_channel_name")
    public String classRankChannel;

    @C09CT("live_class_rank_bottom_bar_star_image_config")
    public List<ClassRankBottomStarImageFileConfig> classRankStarFileConfigList;

    @C09CT("live_class_rank_download_gecko_channel")
    public Boolean downloadClassRankGecko;

    public ClassRankStarResConfig() {
        this(null, Boolean.FALSE, null);
    }

    public ClassRankStarResConfig(String str, Boolean bool, List<ClassRankBottomStarImageFileConfig> list) {
        this.classRankChannel = str;
        this.downloadClassRankGecko = bool;
        this.classRankStarFileConfigList = list;
    }
}
