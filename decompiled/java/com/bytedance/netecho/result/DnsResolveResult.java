package com.bytedance.netecho.result;

import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class DnsResolveResult extends Result {
    public final String ip;
    public final boolean success;
    public final String throwableMsg;

    public final DnsResolveResult copy(boolean z, String str, String str2) {
        return new DnsResolveResult(z, str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DnsResolveResult) {
                DnsResolveResult dnsResolveResult = (DnsResolveResult) obj;
                if (this.success != dnsResolveResult.success || !Intrinsics.LJFF(this.ip, dnsResolveResult.ip) || !Intrinsics.LJFF(this.throwableMsg, dnsResolveResult.throwableMsg)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public int hashCode() {
        boolean z = this.success;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.ip;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.throwableMsg;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DnsResolveResult(success=");
        sbLIZ.append(this.success);
        sbLIZ.append(", ip=");
        sbLIZ.append(this.ip);
        sbLIZ.append(", throwableMsg=");
        sbLIZ.append(this.throwableMsg);
        sbLIZ.append(")");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getIp() {
        return this.ip;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final String getThrowableMsg() {
        return this.throwableMsg;
    }

    public DnsResolveResult(boolean z, String str, String str2) {
        this.success = z;
        this.ip = str;
        this.throwableMsg = str2;
    }
}
