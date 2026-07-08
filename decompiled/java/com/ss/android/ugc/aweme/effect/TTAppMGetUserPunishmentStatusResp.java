package com.ss.android.ugc.aweme.effect;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class TTAppMGetUserPunishmentStatusResp {

    @C09CT("message")
    public final String message;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("user_punishment_status")
    public final int userPunishmentStatus;

    public TTAppMGetUserPunishmentStatusResp(int i, Integer num, String str) {
        this.userPunishmentStatus = i;
        this.statusCode = num;
        this.message = str;
    }
}
