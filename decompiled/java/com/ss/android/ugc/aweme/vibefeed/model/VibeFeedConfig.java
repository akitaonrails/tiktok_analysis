package com.ss.android.ugc.aweme.vibefeed.model;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class VibeFeedConfig {

    @C09CT("entrance_fail_reason")
    public final Integer checkReason;

    @C09CT("entrance_status")
    public final Integer enable;

    @C09CT("extra_info")
    public final String extraInfo;

    @C09CT("feed_status")
    public final Integer feedStatus;

    @C09CT("invite_timestamp")
    public final Long inviteTimeStamp;

    @C09CT("is_inviter")
    public final Boolean isInviter;

    public VibeFeedConfig() {
        this(0, Boolean.TRUE, null, null, null, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VibeFeedConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", isInviter=");
        sbLIZ.append(this.isInviter);
        sbLIZ.append(", inviteTimeStamp=");
        sbLIZ.append(this.inviteTimeStamp);
        sbLIZ.append(", feedStatus=");
        sbLIZ.append(this.feedStatus);
        sbLIZ.append(", checkReason=");
        sbLIZ.append(this.checkReason);
        sbLIZ.append(", extraInfo=");
        sbLIZ.append(this.extraInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VibeFeedConfig(Integer num, Boolean bool, Long l, Integer num2, Integer num3, String str) {
        this.enable = num;
        this.isInviter = bool;
        this.inviteTimeStamp = l;
        this.feedStatus = num2;
        this.checkReason = num3;
        this.extraInfo = str;
    }
}
