package ttp.orbu.sdk.configuration.model;

import ttpobfuscated.zb;

/* JADX INFO: loaded from: classes24.dex */
public final class EventSetting {
    public final String eventType;
    public final int maxEventBatchSize;
    public final zb reportingFrequency;

    public String toString() {
        return "EventSetting(eventType=" + this.eventType + ", reportingFrequency=" + this.reportingFrequency + ", maxEventBatchSize=" + this.maxEventBatchSize + ')';
    }

    public EventSetting(String str, zb zbVar, int i) {
        this.eventType = str;
        this.reportingFrequency = zbVar;
        this.maxEventBatchSize = i;
    }
}
