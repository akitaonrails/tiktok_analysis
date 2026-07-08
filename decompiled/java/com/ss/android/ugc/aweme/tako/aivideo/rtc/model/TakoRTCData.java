package com.ss.android.ugc.aweme.tako.aivideo.rtc.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class TakoRTCData {

    @C09CT("biz_extra")
    public final String bizExtra;

    @C09CT("biz_type")
    public final String bizType;

    @C09CT("business_id")
    public final String businessID;

    @C09CT("event_from")
    public final String eventFrom;

    @C09CT("event_to")
    public final String eventTo;

    @C09CT("payload")
    public final String payload;

    @C09CT("round_id")
    public final int roundId;

    @C09CT("session_id")
    public final String sessionId;

    @C09CT("timestamp")
    public final long timestamp;

    @C09CT("type")
    public final String type;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoRTCData)) {
            return false;
        }
        TakoRTCData takoRTCData = (TakoRTCData) obj;
        return Intrinsics.LJFF(this.businessID, takoRTCData.businessID) && Intrinsics.LJFF(this.eventFrom, takoRTCData.eventFrom) && Intrinsics.LJFF(this.eventTo, takoRTCData.eventTo) && this.timestamp == takoRTCData.timestamp && Intrinsics.LJFF(this.type, takoRTCData.type) && Intrinsics.LJFF(this.bizType, takoRTCData.bizType) && Intrinsics.LJFF(this.sessionId, takoRTCData.sessionId) && this.roundId == takoRTCData.roundId && Intrinsics.LJFF(this.payload, takoRTCData.payload) && Intrinsics.LJFF(this.bizExtra, takoRTCData.bizExtra);
    }

    public final int hashCode() {
        return (((((((((((((((((this.businessID.hashCode() * 31) + this.eventFrom.hashCode()) * 31) + this.eventTo.hashCode()) * 31) + C786410Ut5.Y2(this.timestamp)) * 31) + this.type.hashCode()) * 31) + this.bizType.hashCode()) * 31) + this.sessionId.hashCode()) * 31) + this.roundId) * 31) + this.payload.hashCode()) * 31) + this.bizExtra.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoRTCData(businessID=");
        sbLIZ.append(this.businessID);
        sbLIZ.append(", eventFrom=");
        sbLIZ.append(this.eventFrom);
        sbLIZ.append(", eventTo=");
        sbLIZ.append(this.eventTo);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.timestamp);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", bizType=");
        sbLIZ.append(this.bizType);
        sbLIZ.append(", sessionId=");
        sbLIZ.append(this.sessionId);
        sbLIZ.append(", roundId=");
        sbLIZ.append(this.roundId);
        sbLIZ.append(", payload=");
        sbLIZ.append(this.payload);
        sbLIZ.append(", bizExtra=");
        sbLIZ.append(this.bizExtra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoRTCData() {
        this("", "", "", -1L, "", "", "", -1, "", "");
    }

    public TakoRTCData(String str, String str2, String str3, long j, String str4, String str5, String str6, int i, String str7, String str8) {
        this.businessID = str;
        this.eventFrom = str2;
        this.eventTo = str3;
        this.timestamp = j;
        this.type = str4;
        this.bizType = str5;
        this.sessionId = str6;
        this.roundId = i;
        this.payload = str7;
        this.bizExtra = str8;
    }
}
