package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AutoCutAgentProgressInfo {
    public static final int $stable = 8;

    @C09CT("messages")
    public final List<String> messages;

    @C09CT("phase_name")
    public final String phaseName;

    @C09CT("progress_percent")
    public final Integer progressPercent;

    @C09CT("result_message")
    public final String resultMessage;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final String status;

    public AutoCutAgentProgressInfo() {
        this(null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoCutAgentProgressInfo)) {
            return false;
        }
        AutoCutAgentProgressInfo autoCutAgentProgressInfo = (AutoCutAgentProgressInfo) obj;
        return Intrinsics.LJFF(this.phaseName, autoCutAgentProgressInfo.phaseName) && Intrinsics.LJFF(this.progressPercent, autoCutAgentProgressInfo.progressPercent) && Intrinsics.LJFF(this.status, autoCutAgentProgressInfo.status) && Intrinsics.LJFF(this.messages, autoCutAgentProgressInfo.messages) && Intrinsics.LJFF(this.resultMessage, autoCutAgentProgressInfo.resultMessage);
    }

    public int hashCode() {
        String str = this.phaseName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.progressPercent;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.status;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.messages;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.resultMessage;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutAgentProgressInfo(phaseName=");
        sbLIZ.append(this.phaseName);
        sbLIZ.append(", progressPercent=");
        sbLIZ.append(this.progressPercent);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", messages=");
        sbLIZ.append(this.messages);
        sbLIZ.append(", resultMessage=");
        sbLIZ.append(this.resultMessage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AutoCutAgentProgressInfo(String str, Integer num, String str2, List<String> list, String str3) {
        this.phaseName = str;
        this.progressPercent = num;
        this.status = str2;
        this.messages = list;
        this.resultMessage = str3;
    }
}
