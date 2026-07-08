package com.ss.lyrax.transcoder;

/* JADX INFO: loaded from: classes.dex */
public class LyraxTranscoderFeatureOptions {
    public String agentUserId;
    public String anchorUserId;
    public String roomId;

    public String getAgentUserId() {
        return this.agentUserId;
    }

    public String getAnchorUserId() {
        return this.anchorUserId;
    }

    public String getRoomId() {
        return this.roomId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LyraxTranscoderFeatureOptions lyraxTranscoderFeatureOptions = (LyraxTranscoderFeatureOptions) obj;
        if (this.agentUserId.equals(lyraxTranscoderFeatureOptions.agentUserId) && this.anchorUserId.equals(lyraxTranscoderFeatureOptions.anchorUserId) && this.roomId.equals(lyraxTranscoderFeatureOptions.roomId)) {
            return true;
        }
        return false;
    }

    public LyraxTranscoderFeatureOptions(String str, String str2, String str3) {
        this.agentUserId = str;
        this.anchorUserId = str2;
        this.roomId = str3;
    }
}
