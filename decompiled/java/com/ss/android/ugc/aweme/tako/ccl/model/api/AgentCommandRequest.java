package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class AgentCommandRequest {

    @C09CT("arguments")
    public final String arguments;

    @C09CT("aweme_id")
    public final String awemeId;

    @C09CT("command")
    public final String command;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("metadata")
    public final Map<String, String> metadata;

    @C09CT("timeout")
    public final long timeoutMS;

    public AgentCommandRequest() {
        this("", "", null, 0L, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgentCommandRequest)) {
            return false;
        }
        AgentCommandRequest agentCommandRequest = (AgentCommandRequest) obj;
        return Intrinsics.LJFF(this.id, agentCommandRequest.id) && Intrinsics.LJFF(this.command, agentCommandRequest.command) && Intrinsics.LJFF(this.arguments, agentCommandRequest.arguments) && this.timeoutMS == agentCommandRequest.timeoutMS && Intrinsics.LJFF(this.metadata, agentCommandRequest.metadata) && Intrinsics.LJFF(this.awemeId, agentCommandRequest.awemeId);
    }

    public final int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.command.hashCode()) * 31;
        String str = this.arguments;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Y2(this.timeoutMS)) * 31;
        Map<String, String> map = this.metadata;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.awemeId;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AgentCommandRequest(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", command=");
        sbLIZ.append(this.command);
        sbLIZ.append(", arguments=");
        sbLIZ.append(this.arguments);
        sbLIZ.append(", timeoutMS=");
        sbLIZ.append(this.timeoutMS);
        sbLIZ.append(", metadata=");
        sbLIZ.append(this.metadata);
        sbLIZ.append(", awemeId=");
        sbLIZ.append(this.awemeId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AgentCommandRequest(String str, String str2, String str3, long j, Map<String, String> map, String str4) {
        this.id = str;
        this.command = str2;
        this.arguments = str3;
        this.timeoutMS = j;
        this.metadata = map;
        this.awemeId = str4;
    }
}
