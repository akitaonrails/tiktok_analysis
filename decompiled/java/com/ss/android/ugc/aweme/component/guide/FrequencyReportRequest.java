package com.ss.android.ugc.aweme.component.guide;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class FrequencyReportRequest implements Serializable {

    @C09CT("action")
    public final String action;

    @C09CT("user_info_type")
    public final String contentType;

    @C09CT("entrance")
    public final String entrance;

    @C09CT("event_id")
    public final String eventId;

    @C09CT("extra_info")
    public final String extraInfo;

    @C09CT("time_stamp")
    public final String timestamp;

    public FrequencyReportRequest() {
        this(UUID.randomUUID().toString(), String.valueOf(System.currentTimeMillis()), null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrequencyReportRequest)) {
            return false;
        }
        FrequencyReportRequest frequencyReportRequest = (FrequencyReportRequest) obj;
        return Intrinsics.LJFF(this.eventId, frequencyReportRequest.eventId) && Intrinsics.LJFF(this.timestamp, frequencyReportRequest.timestamp) && Intrinsics.LJFF(this.entrance, frequencyReportRequest.entrance) && Intrinsics.LJFF(this.contentType, frequencyReportRequest.contentType) && Intrinsics.LJFF(this.extraInfo, frequencyReportRequest.extraInfo) && Intrinsics.LJFF(this.action, frequencyReportRequest.action);
    }

    public int hashCode() {
        int iHashCode = ((this.eventId.hashCode() * 31) + this.timestamp.hashCode()) * 31;
        String str = this.entrance;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.contentType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.extraInfo;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.action;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FrequencyReportRequest(eventId=");
        sbLIZ.append(this.eventId);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.timestamp);
        sbLIZ.append(", entrance=");
        sbLIZ.append(this.entrance);
        sbLIZ.append(", contentType=");
        sbLIZ.append(this.contentType);
        sbLIZ.append(", extraInfo=");
        sbLIZ.append(this.extraInfo);
        sbLIZ.append(", action=");
        sbLIZ.append(this.action);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FrequencyReportRequest(String str, String str2, String str3, String str4, String str5, String str6) {
        this.eventId = str;
        this.timestamp = str2;
        this.entrance = str3;
        this.contentType = str4;
        this.extraInfo = str5;
        this.action = str6;
    }
}
