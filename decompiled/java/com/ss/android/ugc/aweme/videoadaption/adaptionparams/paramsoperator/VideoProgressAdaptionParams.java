package com.ss.android.ugc.aweme.videoadaption.adaptionparams.paramsoperator;

import X.C2188811AlT;
import X.InterfaceC1604490rr5;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class VideoProgressAdaptionParams implements InterfaceC1604490rr5 {
    public final VideoAdaptionResult finalResult;
    public final VideoAdaptionResult initResult;

    public final VideoProgressAdaptionParams copy(VideoAdaptionResult videoAdaptionResult, VideoAdaptionResult videoAdaptionResult2) {
        return new VideoProgressAdaptionParams(videoAdaptionResult, videoAdaptionResult2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoProgressAdaptionParams)) {
            return false;
        }
        VideoProgressAdaptionParams videoProgressAdaptionParams = (VideoProgressAdaptionParams) obj;
        return Intrinsics.LJFF(this.initResult, videoProgressAdaptionParams.initResult) && Intrinsics.LJFF(this.finalResult, videoProgressAdaptionParams.finalResult);
    }

    public int hashCode() {
        int iHashCode = this.initResult.hashCode() * 31;
        VideoAdaptionResult videoAdaptionResult = this.finalResult;
        return iHashCode + (videoAdaptionResult == null ? 0 : videoAdaptionResult.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoProgressAdaptionParams(initResult=");
        sbLIZ.append(this.initResult);
        sbLIZ.append(", finalResult=");
        sbLIZ.append(this.finalResult);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final VideoAdaptionResult getFinalResult() {
        return this.finalResult;
    }

    public final VideoAdaptionResult getInitResult() {
        return this.initResult;
    }

    public VideoProgressAdaptionParams(VideoAdaptionResult videoAdaptionResult, VideoAdaptionResult videoAdaptionResult2) {
        this.initResult = videoAdaptionResult;
        this.finalResult = videoAdaptionResult2;
    }
}
