package com.ss.android.ugc.aweme.persistence.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCWorkflowPersistenceNode {

    @C09CT("config")
    public final String config;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("nodeConfig")
    public final String nodeConfig;

    @C09CT("nodeName")
    public final String nodeName;

    public AIGCWorkflowPersistenceNode() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGCWorkflowPersistenceNode)) {
            return false;
        }
        AIGCWorkflowPersistenceNode aIGCWorkflowPersistenceNode = (AIGCWorkflowPersistenceNode) obj;
        return Intrinsics.LJFF(this.id, aIGCWorkflowPersistenceNode.id) && Intrinsics.LJFF(this.nodeName, aIGCWorkflowPersistenceNode.nodeName) && Intrinsics.LJFF(this.config, aIGCWorkflowPersistenceNode.config) && Intrinsics.LJFF(this.nodeConfig, aIGCWorkflowPersistenceNode.nodeConfig);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nodeName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.config;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nodeConfig;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCWorkflowPersistenceNode(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", nodeName=");
        sbLIZ.append(this.nodeName);
        sbLIZ.append(", config=");
        sbLIZ.append(this.config);
        sbLIZ.append(", nodeConfig=");
        sbLIZ.append(this.nodeConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AIGCWorkflowPersistenceNode(String str, String str2, String str3, String str4) {
        this.id = str;
        this.nodeName = str2;
        this.config = str3;
        this.nodeConfig = str4;
    }
}
