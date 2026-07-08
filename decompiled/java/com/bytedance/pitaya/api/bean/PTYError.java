package com.bytedance.pitaya.api.bean;

import X.C2188811AlT;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class PTYError implements ReflectionCall {
    public final int code;
    public final String domain;
    public final List<String> stacks;
    public final int subCode;
    public final String summary;

    public final PTYError copy(String str, int i, int i2, String str2, List<String> list) {
        return new PTYError(str, i, i2, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PTYError)) {
            return false;
        }
        PTYError pTYError = (PTYError) obj;
        return Intrinsics.LJFF(this.domain, pTYError.domain) && this.code == pTYError.code && this.subCode == pTYError.subCode && Intrinsics.LJFF(this.summary, pTYError.summary) && Intrinsics.LJFF(this.stacks, pTYError.stacks);
    }

    public int hashCode() {
        String str = this.domain;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.code) * 31) + this.subCode) * 31;
        String str2 = this.summary;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.stacks;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PTYError(domain=");
        sbLIZ.append(this.domain);
        sbLIZ.append(", code=");
        sbLIZ.append(this.code);
        sbLIZ.append(", subCode=");
        sbLIZ.append(this.subCode);
        sbLIZ.append(", summary=");
        sbLIZ.append(this.summary);
        sbLIZ.append(", stacks=");
        sbLIZ.append(this.stacks);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final List<String> getStacks() {
        return this.stacks;
    }

    public final int getSubCode() {
        return this.subCode;
    }

    public final String getSummary() {
        return this.summary;
    }

    public PTYError(String str, int i, int i2, String str2, List<String> list) {
        this.domain = str;
        this.code = i;
        this.subCode = i2;
        this.summary = str2;
        this.stacks = list;
    }
}
