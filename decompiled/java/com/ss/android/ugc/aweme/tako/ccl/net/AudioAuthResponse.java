package com.ss.android.ugc.aweme.tako.ccl.net;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class AudioAuthResponse extends TakoBaseResponse {

    @C09CT("agent_user_id")
    public final String agentUserID;

    @C09CT("rtc_app_id")
    public final String appId;

    @C09CT("idc")
    public final String idc;

    @C09CT("rtc_room_id")
    public final String roomId;

    @C09CT("stream_access_host")
    public final String streamAccessHost;

    @C09CT("stream_id")
    public final String streamId;

    @C09CT("stream_token")
    public final String streamToken;

    @C09CT("rtc_token")
    public final String token;

    @C09CT("rtc_user_id")
    public final String userId;

    public AudioAuthResponse() {
        this("", "", "", "", "", "", "", "", null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioAuthResponse)) {
            return false;
        }
        AudioAuthResponse audioAuthResponse = (AudioAuthResponse) obj;
        return Intrinsics.LJFF(this.appId, audioAuthResponse.appId) && Intrinsics.LJFF(this.userId, audioAuthResponse.userId) && Intrinsics.LJFF(this.roomId, audioAuthResponse.roomId) && Intrinsics.LJFF(this.token, audioAuthResponse.token) && Intrinsics.LJFF(this.idc, audioAuthResponse.idc) && Intrinsics.LJFF(this.agentUserID, audioAuthResponse.agentUserID) && Intrinsics.LJFF(this.streamId, audioAuthResponse.streamId) && Intrinsics.LJFF(this.streamToken, audioAuthResponse.streamToken) && Intrinsics.LJFF(this.streamAccessHost, audioAuthResponse.streamAccessHost);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((this.appId.hashCode() * 31) + this.userId.hashCode()) * 31) + this.roomId.hashCode()) * 31) + this.token.hashCode()) * 31) + this.idc.hashCode()) * 31) + this.agentUserID.hashCode()) * 31) + this.streamId.hashCode()) * 31) + this.streamToken.hashCode()) * 31;
        String str = this.streamAccessHost;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AudioAuthResponse(appId=");
        sbLIZ.append(this.appId);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.roomId);
        sbLIZ.append(", token=");
        sbLIZ.append(this.token);
        sbLIZ.append(", idc=");
        sbLIZ.append(this.idc);
        sbLIZ.append(", agentUserID=");
        sbLIZ.append(this.agentUserID);
        sbLIZ.append(", streamId=");
        sbLIZ.append(this.streamId);
        sbLIZ.append(", streamToken=");
        sbLIZ.append(this.streamToken);
        sbLIZ.append(", streamAccessHost=");
        sbLIZ.append(this.streamAccessHost);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AudioAuthResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        super(null, 0, "");
        this.appId = str;
        this.userId = str2;
        this.roomId = str3;
        this.token = str4;
        this.idc = str5;
        this.agentUserID = str6;
        this.streamId = str7;
        this.streamToken = str8;
        this.streamAccessHost = str9;
    }
}
