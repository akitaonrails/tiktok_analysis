package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubGuideEntranceAIConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("algo_enable")
    public int algoEnable;

    @C09CT("algo_pkg_name")
    public String algoPkgName;

    @C09CT("biz_name")
    public String bizName;

    static {
        NormalGson.singleton();
        ADAPTER = new FansClubGuideEntranceAIConfig_OptTypeAdapter();
    }

    public FansClubGuideEntranceAIConfig() {
        this(0, "", "");
    }

    public FansClubGuideEntranceAIConfig(int i, String str, String str2) {
        this.algoEnable = i;
        this.algoPkgName = str;
        this.bizName = str2;
    }
}
