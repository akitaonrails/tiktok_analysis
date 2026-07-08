package com.bytedance.pns.pns_ttmachine_adapter;

/* JADX INFO: loaded from: classes14.dex */
public class TTMStatePreprocessTimeStatistics {
    public final int bindBdiSymbolTotalTime;
    public final long cuid;
    public final int decodeTotalTime;
    public final int preprocessTotalTime;

    public int getBindBdiSymbolTotalTime() {
        return this.bindBdiSymbolTotalTime;
    }

    public long getCuid() {
        return this.cuid;
    }

    public int getDecodeTotalTime() {
        return this.decodeTotalTime;
    }

    public int getPreprocessTotalTime() {
        return this.preprocessTotalTime;
    }

    public TTMStatePreprocessTimeStatistics(long j, int i, int i2, int i3) {
        this.cuid = j;
        this.preprocessTotalTime = i;
        this.decodeTotalTime = i2;
        this.bindBdiSymbolTotalTime = i3;
    }
}
