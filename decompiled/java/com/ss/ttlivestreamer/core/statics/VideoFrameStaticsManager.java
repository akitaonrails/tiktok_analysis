package com.ss.ttlivestreamer.core.statics;

import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class VideoFrameStaticsManager {
    public volatile long ptr = nativeCreate();

    private native long nativeCreate();

    private native void nativeGetRecordInfos(long j, Map<String, String> map, long j2);

    private native void nativeRecord(long j, int i, int i2, int i3, long j2);

    private native void nativeRelease(long j);

    public synchronized void release() {
        long j = this.ptr;
        this.ptr = 0L;
        if (j != 0) {
            nativeRelease(j);
        }
    }

    public synchronized void getRecordInfos(Map<String, String> map, long j) {
        if (this.ptr != 0) {
            nativeGetRecordInfos(this.ptr, map, j);
        }
    }

    public synchronized void record(int i, int i2, int i3, long j) {
        if (this.ptr != 0) {
            nativeRecord(this.ptr, i, i2, i3, j);
        }
    }
}
