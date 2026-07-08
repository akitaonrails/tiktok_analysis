package com.bytedance.netecho.result;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes24.dex */
public final class TcpDetectResult extends Result {
    public final int errorCode;
    public final int errorStage;
    public final boolean success;

    public final TcpDetectResult copy(boolean z, int i, int i2) {
        return new TcpDetectResult(z, i, i2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TcpDetectResult) {
                TcpDetectResult tcpDetectResult = (TcpDetectResult) obj;
                if (this.success != tcpDetectResult.success || this.errorStage != tcpDetectResult.errorStage || this.errorCode != tcpDetectResult.errorCode) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.success;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((r0 * 31) + this.errorStage) * 31) + this.errorCode;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TcpDetectResult(success=");
        sbLIZ.append(this.success);
        sbLIZ.append(", errorStage=");
        sbLIZ.append(this.errorStage);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.errorCode);
        sbLIZ.append(")");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final int getErrorStage() {
        return this.errorStage;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public TcpDetectResult(boolean z, int i, int i2) {
        this.success = z;
        this.errorStage = i;
        this.errorCode = i2;
    }
}
