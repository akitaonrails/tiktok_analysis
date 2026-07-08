package com.bytedance.netecho.result;

import X.C2188811AlT;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class IcmpDetectResult extends Result {
    public final int errorCode;
    public final int errorStage;
    public final IcmpPacketResult[] packetResults;
    public final boolean success;

    public final IcmpDetectResult copy(boolean z, IcmpPacketResult[] icmpPacketResultArr, int i, int i2) {
        return new IcmpDetectResult(z, icmpPacketResultArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IcmpDetectResult) {
                IcmpDetectResult icmpDetectResult = (IcmpDetectResult) obj;
                if (this.success != icmpDetectResult.success || !Intrinsics.LJFF(this.packetResults, icmpDetectResult.packetResults) || this.errorStage != icmpDetectResult.errorStage || this.errorCode != icmpDetectResult.errorCode) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z = this.success;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        IcmpPacketResult[] icmpPacketResultArr = this.packetResults;
        return ((((i + (icmpPacketResultArr != null ? Arrays.hashCode(icmpPacketResultArr) : 0)) * 31) + this.errorStage) * 31) + this.errorCode;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IcmpDetectResult(success=");
        sbLIZ.append(this.success);
        sbLIZ.append(", packetResults=");
        sbLIZ.append(Arrays.toString(this.packetResults));
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

    public final IcmpPacketResult[] getPacketResults() {
        return this.packetResults;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public IcmpDetectResult(boolean z, IcmpPacketResult[] icmpPacketResultArr, int i, int i2) {
        this.success = z;
        this.packetResults = icmpPacketResultArr;
        this.errorStage = i;
        this.errorCode = i2;
    }
}
