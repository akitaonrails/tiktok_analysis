package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class GradeInfoApiConfig {
    public static final TypeAdapter ADAPTER = new GradeInfoApiConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_enter_room_user_level_api_opt")
    public boolean enableEnterRoomUserLevelApiOpt;

    @C09CT("enable_fans_club_api_opt")
    public boolean enableFansClubApiOpt;

    @C09CT("enable_gift_panel_user_level_api_opt")
    public boolean enableGiftPanelUserLevelApiOpt;

    @C09CT("fans_club_api_interval")
    public long fansClubApiInterval;

    @C09CT("user_level_api_interval")
    public long userLevelApiInterval;

    public GradeInfoApiConfig() {
        this(86400L, 86400L, false, false, false);
    }

    public GradeInfoApiConfig(long j, long j2, boolean z, boolean z2, boolean z3) {
        this.userLevelApiInterval = j;
        this.fansClubApiInterval = j2;
        this.enableEnterRoomUserLevelApiOpt = z;
        this.enableFansClubApiOpt = z2;
        this.enableGiftPanelUserLevelApiOpt = z3;
    }
}
