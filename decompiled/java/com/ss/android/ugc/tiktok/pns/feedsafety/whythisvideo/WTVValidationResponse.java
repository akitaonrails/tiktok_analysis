package com.ss.android.ugc.tiktok.pns.feedsafety.whythisvideo;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.RecReasonsStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class WTVValidationResponse {

    @C09CT("extra")
    public final Extra extra;

    @C09CT("log_pb")
    public final LogPbBean logPb;

    @C09CT("rec_reason")
    public final RecReasonsStruct recReason;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public WTVValidationResponse() {
        this(null, null, null, 0, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WTVValidationResponse)) {
            return false;
        }
        WTVValidationResponse wTVValidationResponse = (WTVValidationResponse) obj;
        return Intrinsics.LJFF(this.extra, wTVValidationResponse.extra) && Intrinsics.LJFF(this.logPb, wTVValidationResponse.logPb) && Intrinsics.LJFF(this.recReason, wTVValidationResponse.recReason) && this.statusCode == wTVValidationResponse.statusCode && Intrinsics.LJFF(this.statusMsg, wTVValidationResponse.statusMsg);
    }

    public final int hashCode() {
        Extra extra = this.extra;
        int iHashCode = (extra == null ? 0 : extra.hashCode()) * 31;
        LogPbBean logPbBean = this.logPb;
        int iHashCode2 = (iHashCode + (logPbBean == null ? 0 : logPbBean.hashCode())) * 31;
        RecReasonsStruct recReasonsStruct = this.recReason;
        int iHashCode3 = (((iHashCode2 + (recReasonsStruct == null ? 0 : recReasonsStruct.hashCode())) * 31) + this.statusCode) * 31;
        String str = this.statusMsg;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WTVValidationResponse(extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(", logPb=");
        sbLIZ.append(this.logPb);
        sbLIZ.append(", recReason=");
        sbLIZ.append(this.recReason);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public WTVValidationResponse(Extra extra, LogPbBean logPbBean, RecReasonsStruct recReasonsStruct, int i, String str) {
        this.extra = extra;
        this.logPb = logPbBean;
        this.recReason = recReasonsStruct;
        this.statusCode = i;
        this.statusMsg = str;
    }
}
