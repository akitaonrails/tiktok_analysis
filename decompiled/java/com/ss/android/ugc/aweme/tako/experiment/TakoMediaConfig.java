package com.ss.android.ugc.aweme.tako.experiment;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class TakoMediaConfig {

    @C09CT("audio")
    public final TakoAudioConfig audio;

    @C09CT("video")
    public final TakoVideoConfig video;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoMediaConfig)) {
            return false;
        }
        TakoMediaConfig takoMediaConfig = (TakoMediaConfig) obj;
        return Intrinsics.LJFF(this.video, takoMediaConfig.video) && Intrinsics.LJFF(this.audio, takoMediaConfig.audio);
    }

    public final int hashCode() {
        return (this.video.hashCode() * 31) + this.audio.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoMediaConfig(video=");
        sbLIZ.append(this.video);
        sbLIZ.append(", audio=");
        sbLIZ.append(this.audio);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoMediaConfig() {
        this(new TakoVideoConfig(360, 640, 2, 240000, 300000, 150000), new TakoAudioConfig(new TakoAudioDuckingConfig(-20.0d, -30.0d, 1.0d, 0.001d, 1.0d, 0.01d, 1.0d, false)));
    }

    public TakoMediaConfig(TakoVideoConfig takoVideoConfig, TakoAudioConfig takoAudioConfig) {
        this.video = takoVideoConfig;
        this.audio = takoAudioConfig;
    }
}
