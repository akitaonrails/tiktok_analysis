package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubLottieConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("fans_club_entrance_finish_all_task_lottie_name")
    public String finishAllTaskLottieName;

    @C09CT("fans_club_entrance_lottie_channel")
    public String lottieChannel;

    @C09CT("fans_club_entrance_weak_guide_lottie_name")
    public String weakGuideLottieName;

    static {
        NormalGson.singleton();
        ADAPTER = new FansClubLottieConfig_OptTypeAdapter();
    }

    public FansClubLottieConfig() {
        this("", "", "");
    }

    public FansClubLottieConfig(String str, String str2, String str3) {
        this.lottieChannel = str;
        this.weakGuideLottieName = str2;
        this.finishAllTaskLottieName = str3;
    }
}
