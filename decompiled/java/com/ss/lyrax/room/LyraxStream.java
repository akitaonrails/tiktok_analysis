package com.ss.lyrax.room;

import X.C2188811AlT;
import com.ss.lyrax.stream.LyraxStreamIndex;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxStream {
    public boolean hasAudio;
    public boolean hasVideo;
    public boolean isScreen;
    public String streamId;
    public LyraxStreamIndex streamIndex;
    public String userId;
    public List<LyraxVideoStreamDescription> videoStreamDescriptions;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyraxStream{ userId='");
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

    public LyraxStream() {
    }

    public static LyraxStream create(String str, LyraxStreamIndex lyraxStreamIndex, String str2, boolean z, boolean z2, boolean z3) {
        return new LyraxStream(str, lyraxStreamIndex, str2, z, z2, z3, null);
    }

    public LyraxStream(String str, LyraxStreamIndex lyraxStreamIndex, String str2, boolean z, boolean z2, boolean z3, List<LyraxVideoStreamDescription> list) {
        this.userId = str;
        this.streamIndex = lyraxStreamIndex;
        this.streamId = str2;
        this.isScreen = z;
        this.hasVideo = z2;
        this.hasAudio = z3;
        this.videoStreamDescriptions = list;
    }

    public static LyraxStream createWithStreamDescriptions(String str, LyraxStreamIndex lyraxStreamIndex, String str2, boolean z, boolean z2, boolean z3, LyraxVideoStreamDescription[] lyraxVideoStreamDescriptionArr) {
        return new LyraxStream(str, lyraxStreamIndex, str2, z, z2, z3, Arrays.asList(lyraxVideoStreamDescriptionArr));
    }
}
