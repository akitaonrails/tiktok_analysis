package com.ss.lyrax.video;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxPipelineEvent {
    public final int eventType;
    public final int nodeMask;
    public final long sequenceNumber;

    public int getEventType() {
        return this.eventType;
    }

    public int getNodeMask() {
        return this.nodeMask;
    }

    public long getSequenceNumber() {
        return this.sequenceNumber;
    }

    public LyraxPipelineEvent(long j, int i, int i2) {
        this.sequenceNumber = j;
        this.eventType = i;
        this.nodeMask = i2;
    }

    public static LyraxPipelineEvent create(long j, int i, int i2) {
        return new LyraxPipelineEvent(j, i, i2);
    }
}
