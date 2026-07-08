package com.ss.android.ugc.aweme.aigc.quality.trace;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.scene.Scene;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class TraceErrorContext {

    @C09CT("error_code")
    public Integer errorCode;

    @C09CT("detailed_error_msg")
    public String errorDetailedMessage;

    @C09CT("simple_error_msg")
    public String errorMessage;

    @C09CT(Scene.SCENE_SERVICE)
    public String functionName;

    public TraceErrorContext() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraceErrorContext)) {
            return false;
        }
        TraceErrorContext traceErrorContext = (TraceErrorContext) obj;
        return Intrinsics.LJFF(this.functionName, traceErrorContext.functionName) && Intrinsics.LJFF(this.errorCode, traceErrorContext.errorCode) && Intrinsics.LJFF(this.errorMessage, traceErrorContext.errorMessage) && Intrinsics.LJFF(this.errorDetailedMessage, traceErrorContext.errorDetailedMessage);
    }

    public final int hashCode() {
        String str = this.functionName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.errorCode;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.errorMessage;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.errorDetailedMessage;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TraceErrorContext(functionName=");
        sbLIZ.append(this.functionName);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.errorCode);
        sbLIZ.append(", errorMessage=");
        sbLIZ.append(this.errorMessage);
        sbLIZ.append(", errorDetailedMessage=");
        sbLIZ.append(this.errorDetailedMessage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TraceErrorContext(String str, Integer num, String str2, String str3) {
        this.functionName = str;
        this.errorCode = num;
        this.errorMessage = str2;
        this.errorDetailedMessage = str3;
    }
}
