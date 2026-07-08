package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class LinkLayerListUser {

    @C09CT("app_version")
    public String appVersion;

    @C09CT("linkmic_id")
    public String linkMicId;

    @C09CT("user")
    public Player linkUser;

    @C09CT("linked_time_nano")
    public long linkedTimeNano;

    @C09CT("linker_session_id")
    public String linkerSessionId;

    @C09CT("pos")
    public MicPositionData positionData;

    @C09CT("user_type")
    public int userType;

    public LinkLayerListUser() {
        this(null, "", null, 0L, "", 0, "");
    }

    public LinkLayerListUser(Player player, String str, MicPositionData micPositionData, long j, String str2, int i, String str3) {
        this.linkUser = player;
        this.linkMicId = str;
        this.positionData = micPositionData;
        this.linkedTimeNano = j;
        this.appVersion = str2;
        this.userType = i;
        this.linkerSessionId = str3;
    }
}
