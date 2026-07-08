package com.ss.android.ugc.aweme.im.streak.api.pet;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakAcceptShareInfoResponse {

    @C09CT("avatar_url")
    public final String avatarUrl;

    @C09CT("egg_url")
    public final String eggUrl;

    @C09CT("log_pb")
    public final LogPb logPb;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    @C09CT("target_secuid")
    public final String targetSecUid;

    @C09CT("target_uid")
    public final String targetUid;

    @C09CT("username")
    public final String userName;

    public StreakAcceptShareInfoResponse() {
        this(null, null, null, null, null, null, null, null);
    }

    public StreakAcceptShareInfoResponse(String str, String str2, String str3, String str4, String str5, Integer num, String str6, LogPb logPb) {
        this.targetUid = str;
        this.avatarUrl = str2;
        this.userName = str3;
        this.eggUrl = str4;
        this.targetSecUid = str5;
        this.statusCode = num;
        this.statusMsg = str6;
        this.logPb = logPb;
    }
}
