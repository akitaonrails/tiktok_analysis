package com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCWorkflowArchConfig {

    @C09CT("trace_id")
    public final String customTraceId;

    @C09CT("extra")
    public final String extra;

    @C09CT("resource_id")
    public final String resourceId;

    @C09CT("source")
    public final String source;

    @C09CT("trigger_type")
    public final String triggerType;

    public AIGCWorkflowArchConfig() {
        this(null, "", "", null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGCWorkflowArchConfig)) {
            return false;
        }
        AIGCWorkflowArchConfig aIGCWorkflowArchConfig = (AIGCWorkflowArchConfig) obj;
        return Intrinsics.LJFF(this.source, aIGCWorkflowArchConfig.source) && Intrinsics.LJFF(this.triggerType, aIGCWorkflowArchConfig.triggerType) && Intrinsics.LJFF(this.resourceId, aIGCWorkflowArchConfig.resourceId) && Intrinsics.LJFF(this.extra, aIGCWorkflowArchConfig.extra) && Intrinsics.LJFF(this.customTraceId, aIGCWorkflowArchConfig.customTraceId);
    }

    public final int hashCode() {
        String str = this.source;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.triggerType.hashCode()) * 31) + this.resourceId.hashCode()) * 31;
        String str2 = this.extra;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.customTraceId;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCWorkflowArchConfig(source=");
        sbLIZ.append(this.source);
        sbLIZ.append(", triggerType=");
        sbLIZ.append(this.triggerType);
        sbLIZ.append(", resourceId=");
        sbLIZ.append(this.resourceId);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(", customTraceId=");
        sbLIZ.append(this.customTraceId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AIGCWorkflowArchConfig(String str, String str2, String str3, String str4, String str5) {
        this.source = str;
        this.triggerType = str2;
        this.resourceId = str3;
        this.extra = str4;
        this.customTraceId = str5;
    }
}
