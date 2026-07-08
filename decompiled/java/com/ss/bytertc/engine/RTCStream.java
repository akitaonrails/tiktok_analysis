package com.ss.bytertc.engine;

import X.C2188811AlT;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class RTCStream {
    public boolean hasAudio;
    public boolean hasVideo;
    public boolean isScreen;
    public String userId;
    public List<VideoStreamDescription> videoStreamDescriptions;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RTCStream{ userId='");
        sbLIZ.append(this.userId);
        sbLIZ.append('\'');
        sbLIZ.append(", isScreen=");
        sbLIZ.append(this.isScreen);
        sbLIZ.append(", hasVideo=");
        sbLIZ.append(this.hasVideo);
        sbLIZ.append(", hasAudio=");
        sbLIZ.append(this.hasAudio);
        sbLIZ.append(", videoStreamDescriptions=");
        sbLIZ.append(this.videoStreamDescriptions);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RTCStream() {
    }

    public static RTCStream create(String str, boolean z, boolean z2, boolean z3) {
        return new RTCStream(str, z, z2, z3, null);
    }

    public RTCStream(String str, boolean z, boolean z2, boolean z3, List<VideoStreamDescription> list) {
        this.userId = str;
        this.isScreen = z;
        this.hasVideo = z2;
        this.hasAudio = z3;
        this.videoStreamDescriptions = list;
    }

    public static RTCStream createWithStreamDescriptions(String str, boolean z, boolean z2, boolean z3, VideoStreamDescription[] videoStreamDescriptionArr) {
        return new RTCStream(str, z, z2, z3, Arrays.asList(videoStreamDescriptionArr));
    }
}
