package com.ss.lyrax.room;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxPostProcessParameter {
    public String anchorIdcName;
    public String liveStreamId;

    public String getAnchorIdcName() {
        return this.anchorIdcName;
    }

    public String getLiveStreamId() {
        return this.liveStreamId;
    }

    public LyraxPostProcessParameter(String str, String str2) {
        this.liveStreamId = str;
        this.anchorIdcName = str2;
    }
}
