package com.ss.ugc.android.editor.core.utils;

import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.ies.nle.editor_jni.NLEMatrix;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class VideoVolumeProperty {
    public final String curve;
    public final double volume;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVolumeProperty)) {
            return false;
        }
        VideoVolumeProperty videoVolumeProperty = (VideoVolumeProperty) obj;
        return Double.compare(this.volume, videoVolumeProperty.volume) == 0 && Intrinsics.LJFF(this.curve, videoVolumeProperty.curve);
    }

    public int hashCode() {
        return (C786410Ut5.X2(this.volume) * 31) + this.curve.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoVolumeProperty(volume=");
        sbLIZ.append(this.volume);
        sbLIZ.append(", curve=");
        sbLIZ.append(this.curve);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VideoVolumeProperty() {
        this(1.0d, "");
    }

    public VideoVolumeProperty(double d, String str) {
        this.volume = d;
        this.curve = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public VideoVolumeProperty(NLESegmentAudio nLESegmentAudio, NLETrackSlot nLETrackSlot, NLEMatrix nLEMatrix) {
        float volume;
        double d;
        if (nLESegmentAudio instanceof NLESegmentVideo) {
            NLESegmentVideo nLESegmentVideo = (NLESegmentVideo) nLESegmentAudio;
            if (nLESegmentVideo.getEnableAudio()) {
                volume = nLESegmentVideo.getVolume();
            } else {
                d = 0.0d;
                this(d, "");
            }
        } else {
            volume = nLESegmentAudio.getVolume();
        }
        d = volume;
        this(d, "");
    }
}
