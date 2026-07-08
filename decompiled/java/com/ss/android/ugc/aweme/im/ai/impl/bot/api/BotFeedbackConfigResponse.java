package com.ss.android.ugc.aweme.im.ai.impl.bot.api;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class BotFeedbackConfigResponse implements Serializable {

    @C09CT("creator_reasons")
    public final List<BotFeedbackReason> creatorReasons;

    @C09CT("extra")
    public final BotFeedbackConfigExtra extra;

    @C09CT("log_pb")
    public final BotFeedbackConfigLogPb logPb;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    @C09CT("user_reasons")
    public final List<BotFeedbackReason> userReasons;

    public BotFeedbackConfigResponse() {
        this(null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BotFeedbackConfigResponse)) {
            return false;
        }
        BotFeedbackConfigResponse botFeedbackConfigResponse = (BotFeedbackConfigResponse) obj;
        return Intrinsics.LJFF(this.statusCode, botFeedbackConfigResponse.statusCode) && Intrinsics.LJFF(this.statusMsg, botFeedbackConfigResponse.statusMsg) && Intrinsics.LJFF(this.creatorReasons, botFeedbackConfigResponse.creatorReasons) && Intrinsics.LJFF(this.userReasons, botFeedbackConfigResponse.userReasons) && Intrinsics.LJFF(this.extra, botFeedbackConfigResponse.extra) && Intrinsics.LJFF(this.logPb, botFeedbackConfigResponse.logPb);
    }

    public int hashCode() {
        Integer num = this.statusCode;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.statusMsg;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<BotFeedbackReason> list = this.creatorReasons;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<BotFeedbackReason> list2 = this.userReasons;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        BotFeedbackConfigExtra botFeedbackConfigExtra = this.extra;
        int iHashCode5 = (iHashCode4 + (botFeedbackConfigExtra == null ? 0 : botFeedbackConfigExtra.hashCode())) * 31;
        BotFeedbackConfigLogPb botFeedbackConfigLogPb = this.logPb;
        return iHashCode5 + (botFeedbackConfigLogPb != null ? botFeedbackConfigLogPb.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BotFeedbackConfigResponse(statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(", creatorReasons=");
        sbLIZ.append(this.creatorReasons);
        sbLIZ.append(", userReasons=");
        sbLIZ.append(this.userReasons);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(", logPb=");
        sbLIZ.append(this.logPb);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BotFeedbackConfigResponse(Integer num, String str, List<BotFeedbackReason> list, List<BotFeedbackReason> list2, BotFeedbackConfigExtra botFeedbackConfigExtra, BotFeedbackConfigLogPb botFeedbackConfigLogPb) {
        this.statusCode = num;
        this.statusMsg = str;
        this.creatorReasons = list;
        this.userReasons = list2;
        this.extra = botFeedbackConfigExtra;
        this.logPb = botFeedbackConfigLogPb;
    }
}
