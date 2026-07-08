package com.ss.ugc.android.editor.core.utils;

import X.C1169104hl;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C363530ENb;
import X.C363540ENc;
import com.bytedance.ies.nle.editor_jni.NLEMatrix;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class VideoProperty {
    public final C363540ENc alpha;
    public final C1169104hl position;
    public final C363540ENc rotation;
    public final C363540ENc scale;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoProperty)) {
            return false;
        }
        VideoProperty videoProperty = (VideoProperty) obj;
        return Intrinsics.LJFF(this.alpha, videoProperty.alpha) && Intrinsics.LJFF(this.position, videoProperty.position) && Intrinsics.LJFF(this.rotation, videoProperty.rotation) && Intrinsics.LJFF(this.scale, videoProperty.scale);
    }

    public int hashCode() {
        return (((((this.alpha.hashCode() * 31) + this.position.hashCode()) * 31) + this.rotation.hashCode()) * 31) + this.scale.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoProperty(alpha=");
        sbLIZ.append(this.alpha);
        sbLIZ.append(", position=");
        sbLIZ.append(this.position);
        sbLIZ.append(", rotation=");
        sbLIZ.append(this.rotation);
        sbLIZ.append(", scale=");
        sbLIZ.append(this.scale);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VideoProperty() {
        this(C363530ENb.LIZ, new C1169104hl(C1697810uHb.LJIIJJI(Float.valueOf(0.0f), Float.valueOf(0.0f))), C363530ENb.LIZ, C363530ENb.LIZ);
    }

    public VideoProperty(NLESegmentVideo nLESegmentVideo, NLETrackSlot nLETrackSlot, NLEMatrix nLEMatrix) {
        float transformX;
        float transformY;
        C363540ENc c363540ENc = new C363540ENc(nLESegmentVideo.getAlpha());
        Float[] fArr = new Float[2];
        if (nLEMatrix != null) {
            transformX = nLEMatrix.getTransformX();
        } else {
            transformX = nLETrackSlot.getTransformX();
        }
        float f = 2;
        fArr[0] = Float.valueOf(transformX * f);
        if (nLEMatrix != null) {
            transformY = nLEMatrix.getTransformY();
        } else {
            transformY = nLETrackSlot.getTransformY();
        }
        fArr[1] = Float.valueOf(transformY * f);
        this(c363540ENc, new C1169104hl(C1697810uHb.LJIIJJI(fArr)), new C363540ENc(nLETrackSlot.getRotation()), new C363540ENc(nLETrackSlot.getScale()));
    }

    public VideoProperty(C363540ENc c363540ENc, C1169104hl c1169104hl, C363540ENc c363540ENc2, C363540ENc c363540ENc3) {
        this.alpha = c363540ENc;
        this.position = c1169104hl;
        this.rotation = c363540ENc2;
        this.scale = c363540ENc3;
    }
}
