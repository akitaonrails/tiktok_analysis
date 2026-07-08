package com.bytedance.pitaya.api.bean;

import X.C2188811AlT;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class PTYLLMResult implements ReflectionCall {
    public final PTYError error;
    public final String output;

    public final PTYLLMResult copy(PTYError pTYError, String str) {
        return new PTYLLMResult(pTYError, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PTYLLMResult)) {
            return false;
        }
        PTYLLMResult pTYLLMResult = (PTYLLMResult) obj;
        return Intrinsics.LJFF(this.error, pTYLLMResult.error) && Intrinsics.LJFF(this.output, pTYLLMResult.output);
    }

    public int hashCode() {
        PTYError pTYError = this.error;
        return ((pTYError == null ? 0 : pTYError.hashCode()) * 31) + this.output.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PTYLLMResult(error=");
        sbLIZ.append(this.error);
        sbLIZ.append(", output=");
        sbLIZ.append(this.output);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final PTYError getError() {
        return this.error;
    }

    public final String getOutput() {
        return this.output;
    }

    public PTYLLMResult(PTYError pTYError, String str) {
        this.error = pTYError;
        this.output = str;
    }
}
