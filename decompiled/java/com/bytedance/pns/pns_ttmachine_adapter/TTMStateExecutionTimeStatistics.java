package com.bytedance.pns.pns_ttmachine_adapter;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes14.dex */
public class TTMStateExecutionTimeStatistics {
    public final int callBdiTotalTime;
    public final int callJniMethodTime;
    public final int callUsrBdiTotalTime;
    public final long cuid;
    public final int runEngineTotalTime;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTMStateExecutionTimeStatistics{cuid=");
        sbLIZ.append(this.cuid);
        sbLIZ.append(", runEngineTotalTime=");
        sbLIZ.append(this.runEngineTotalTime);
        sbLIZ.append(", callBdiTotalTime=");
        sbLIZ.append(this.callBdiTotalTime);
        sbLIZ.append(", callUsrBdiTotalTime=");
        sbLIZ.append(this.callUsrBdiTotalTime);
        sbLIZ.append(", callJniMethodTime=");
        sbLIZ.append(this.callJniMethodTime);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int getCallBdiTotalTime() {
        return this.callBdiTotalTime;
    }

    public int getCallJniMethodTime() {
        return this.callJniMethodTime;
    }

    public int getCallUsrBdiTotalTime() {
        return this.callUsrBdiTotalTime;
    }

    public long getCuid() {
        return this.cuid;
    }

    public int getRunEngineTotalTime() {
        return this.runEngineTotalTime;
    }

    public TTMStateExecutionTimeStatistics(long j, int i, int i2, int i3, int i4) {
        this.cuid = j;
        this.runEngineTotalTime = i;
        this.callBdiTotalTime = i2;
        this.callUsrBdiTotalTime = i3;
        this.callJniMethodTime = i4;
    }
}
