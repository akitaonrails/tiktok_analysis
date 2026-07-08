package com.ss.android.ugc.aweme.pns.usercommunication.api;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class NetworkUniversalPopupDispatchResponse implements Serializable {

    @C09CT("log_pb")
    public final NetworkUniversalPopupLogResponse log;

    @C09CT("msc_config")
    public final String mscConfig;

    @C09CT("policy_notices")
    public final List<PolicyNoticeUPSdk> policyNotices;

    @C09CT("popup_responses")
    public final List<NetworkUniversalPopupResponse> popupResponses;

    @C09CT("status_code")
    public final Integer status_code;

    @C09CT("status_msg")
    public final String status_msg;

    public NetworkUniversalPopupDispatchResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final NetworkUniversalPopupDispatchResponse copy(List<PolicyNoticeUPSdk> list, List<NetworkUniversalPopupResponse> list2, Integer num, String str, String str2, NetworkUniversalPopupLogResponse networkUniversalPopupLogResponse) {
        return new NetworkUniversalPopupDispatchResponse(list, list2, num, str, str2, networkUniversalPopupLogResponse);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NetworkUniversalPopupDispatchResponse(policyNotices=");
        sbLIZ.append(this.policyNotices);
        sbLIZ.append(", popupResponses=");
        sbLIZ.append(this.popupResponses);
        sbLIZ.append(", status_code=");
        sbLIZ.append(this.status_code);
        sbLIZ.append(", status_msg=");
        sbLIZ.append(this.status_msg);
        sbLIZ.append(", mscConfig=");
        sbLIZ.append(this.mscConfig);
        sbLIZ.append(", log=");
        sbLIZ.append(this.log);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public NetworkUniversalPopupDispatchResponse(List<PolicyNoticeUPSdk> list, List<NetworkUniversalPopupResponse> list2, Integer num, String str, String str2, NetworkUniversalPopupLogResponse networkUniversalPopupLogResponse) {
        this.policyNotices = list;
        this.popupResponses = list2;
        this.status_code = num;
        this.status_msg = str;
        this.mscConfig = str2;
        this.log = networkUniversalPopupLogResponse;
    }

    public NetworkUniversalPopupDispatchResponse(List list, List list2, Integer num, String str, String str2, NetworkUniversalPopupLogResponse networkUniversalPopupLogResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? 0 : num, (i & 8) != 0 ? "" : str, (i & 16) == 0 ? str2 : "", (i & 32) != 0 ? new NetworkUniversalPopupLogResponse("") : networkUniversalPopupLogResponse);
    }
}
