package com.ss.bytertc.engine;

/* JADX INFO: loaded from: classes21.dex */
public class PostProcessParameter {
    public String anchorIDCName;
    public String streamName;

    public String getAnchorIDCName() {
        return this.anchorIDCName;
    }

    public String getStreamName() {
        return this.streamName;
    }

    public void setAnchorIDCName(String str) {
        this.anchorIDCName = str;
    }

    public void setStreamName(String str) {
        this.streamName = str;
    }

    public PostProcessParameter(String str, String str2) {
        this.anchorIDCName = str;
        this.streamName = str2;
    }
}
