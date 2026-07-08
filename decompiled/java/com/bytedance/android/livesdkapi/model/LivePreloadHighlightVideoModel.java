package com.bytedance.android.livesdkapi.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class LivePreloadHighlightVideoModel implements Serializable {

    @C09CT("anchorId")
    public String anchorId;

    @C09CT("fileId")
    public String fileId;

    @C09CT("roomId")
    public String roomId;

    @C09CT("videoID")
    public String videoID;

    @C09CT("videoUrl")
    public String videoUrl;

    public LivePreloadHighlightVideoModel() {
        this(null, null, null, null, null);
    }

    public final void setAnchorId(String str) {
        this.anchorId = str;
    }

    public final void setFileId(String str) {
        this.fileId = str;
    }

    public final void setRoomId(String str) {
        this.roomId = str;
    }

    public final void setVideoID(String str) {
        this.videoID = str;
    }

    public final void setVideoUrl(String str) {
        this.videoUrl = str;
    }

    public LivePreloadHighlightVideoModel(String str, String str2, String str3, String str4, String str5) {
        this.videoUrl = str;
        this.videoID = str2;
        this.anchorId = str3;
        this.roomId = str4;
        this.fileId = str5;
    }
}
