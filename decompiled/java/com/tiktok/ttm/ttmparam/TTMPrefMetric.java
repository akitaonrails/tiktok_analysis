package com.tiktok.ttm.ttmparam;

/* JADX INFO: loaded from: classes14.dex */
public class TTMPrefMetric {
    public long end;
    public long start;
    public String tag;

    public static TTMPrefMetric createAndStart(String str) {
        return null;
    }

    public void endAndPrint() {
        this.end = System.nanoTime();
    }

    public TTMPrefMetric(String str) {
        this.tag = str;
    }
}
