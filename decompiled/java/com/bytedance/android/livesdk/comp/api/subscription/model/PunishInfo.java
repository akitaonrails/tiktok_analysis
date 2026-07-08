package com.bytedance.android.livesdk.comp.api.subscription.model;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class PunishInfo {

    @C09CT("punish_id")
    public final String punishId;

    @C09CT("punish_type")
    public final String punishType;

    @C09CT("violation_uid")
    public final long violationUid;

    public PunishInfo(String str, String str2, long j) {
        this.punishType = str;
        this.punishId = str2;
        this.violationUid = j;
    }
}
