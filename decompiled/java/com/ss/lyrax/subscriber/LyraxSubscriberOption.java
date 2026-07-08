package com.ss.lyrax.subscriber;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxSubscriberOption {
    public boolean enableLowLatency;
    public String renderId;
    public String streamId;

    public boolean enableLowLatency() {
        return this.enableLowLatency;
    }

    public String getRenderId() {
        return this.renderId;
    }

    public String getStreamId() {
        return this.streamId;
    }

    public void setEnableLowLatency(boolean z) {
        this.enableLowLatency = z;
    }

    public void setRenderId(String str) {
        this.renderId = str;
    }

    public void setStreamId(String str) {
        this.streamId = str;
    }
}
