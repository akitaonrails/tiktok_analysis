package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class ClassRankBottomStarImageFileConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("class_rank_type")
    public int classRankType;

    @C09CT("dark_star_file_name")
    public String darkStarFileName;

    @C09CT("light_star_file_name")
    public String lightStarFileName;

    static {
        NormalGson.singleton();
        ADAPTER = new ClassRankBottomStarImageFileConfig_OptTypeAdapter();
    }

    public ClassRankBottomStarImageFileConfig() {
        this(0, "", "");
    }

    public ClassRankBottomStarImageFileConfig(int i, String str, String str2) {
        this.classRankType = i;
        this.lightStarFileName = str;
        this.darkStarFileName = str2;
    }
}
