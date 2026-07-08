package com.ss.bytertc.engine.avclient;

import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class LyraxAVClientChatAgentOption {
    public static final Companion Companion = new Companion();
    public String agentUserID;
    public boolean enable;
    public String featureName;
    public String projectKey;
    public String rtcToken;

    public static final class Companion {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LyraxAVClientChatAgentOption)) {
            return false;
        }
        LyraxAVClientChatAgentOption lyraxAVClientChatAgentOption = (LyraxAVClientChatAgentOption) obj;
        return this.enable == lyraxAVClientChatAgentOption.enable && Intrinsics.LJFF(this.agentUserID, lyraxAVClientChatAgentOption.agentUserID) && Intrinsics.LJFF(this.rtcToken, lyraxAVClientChatAgentOption.rtcToken) && Intrinsics.LJFF(this.featureName, lyraxAVClientChatAgentOption.featureName) && Intrinsics.LJFF(this.projectKey, lyraxAVClientChatAgentOption.projectKey);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public int hashCode() {
        boolean z = this.enable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((((((r0 * 31) + this.agentUserID.hashCode()) * 31) + this.rtcToken.hashCode()) * 31) + this.featureName.hashCode()) * 31) + this.projectKey.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyraxAVClientChatAgentOption(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", agentUserID=");
        sbLIZ.append(this.agentUserID);
        sbLIZ.append(", rtcToken=");
        sbLIZ.append(this.rtcToken);
        sbLIZ.append(", featureName=");
        sbLIZ.append(this.featureName);
        sbLIZ.append(", projectKey=");
        sbLIZ.append(this.projectKey);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LyraxAVClientChatAgentOption() {
        this(false, "", "", "AIChat", "Tako_AIChat");
    }

    public final void setAgentUserID(String str) {
        this.agentUserID = str;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setFeatureName(String str) {
        this.featureName = str;
    }

    public final void setProjectKey(String str) {
        this.projectKey = str;
    }

    public final void setRtcToken(String str) {
        this.rtcToken = str;
    }

    public LyraxAVClientChatAgentOption(boolean z, String str, String str2, String str3, String str4) {
        this.enable = z;
        this.agentUserID = str;
        this.rtcToken = str2;
        this.featureName = str3;
        this.projectKey = str4;
    }
}
