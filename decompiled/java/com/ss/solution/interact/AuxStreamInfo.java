package com.ss.solution.interact;

import X.C2188811AlT;
import com.ss.lyrax.stream.LyraxStreamIndex;

/* JADX INFO: loaded from: classes21.dex */
public class AuxStreamInfo {
    public final String mInteractId;
    public final String mStreamId;
    public final LyraxStreamIndex mStreamIndex;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AuxStreamInfo{mInteractId='");
        sbLIZ.append(this.mInteractId);
        sbLIZ.append('\'');
        sbLIZ.append(", mStreamId='");
        sbLIZ.append(this.mStreamId);
        sbLIZ.append('\'');
        sbLIZ.append(", mStreamIndex=");
        sbLIZ.append(this.mStreamIndex);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getInteractId() {
        return this.mInteractId;
    }

    public String getStreamId() {
        return this.mStreamId;
    }

    public LyraxStreamIndex getStreamIndex() {
        return this.mStreamIndex;
    }

    public AuxStreamInfo(String str, String str2, LyraxStreamIndex lyraxStreamIndex) {
        this.mInteractId = str;
        this.mStreamId = str2;
        this.mStreamIndex = lyraxStreamIndex;
    }
}
