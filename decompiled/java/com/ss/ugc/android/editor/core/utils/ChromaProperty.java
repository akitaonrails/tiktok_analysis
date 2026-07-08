package com.ss.ugc.android.editor.core.utils;

import X.C2188811AlT;
import X.C363530ENb;
import X.C363540ENc;
import com.bytedance.ies.nle.editor_jni.NLEMatrix;
import com.bytedance.ies.nle.editor_jni.NLESegmentChromaChannel;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ChromaProperty {
    public final C363540ENc intensity;
    public final C363540ENc shadow;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChromaProperty)) {
            return false;
        }
        ChromaProperty chromaProperty = (ChromaProperty) obj;
        return Intrinsics.LJFF(this.intensity, chromaProperty.intensity) && Intrinsics.LJFF(this.shadow, chromaProperty.shadow);
    }

    public int hashCode() {
        return (this.intensity.hashCode() * 31) + this.shadow.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChromaProperty(intensity=");
        sbLIZ.append(this.intensity);
        sbLIZ.append(", shadow=");
        sbLIZ.append(this.shadow);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ChromaProperty() {
        this(C363530ENb.LIZ, C363530ENb.LIZ);
    }

    public ChromaProperty(C363540ENc c363540ENc, C363540ENc c363540ENc2) {
        this.intensity = c363540ENc;
        this.shadow = c363540ENc2;
    }

    public ChromaProperty(NLESegmentChromaChannel nLESegmentChromaChannel, NLETrackSlot nLETrackSlot, NLEMatrix nLEMatrix) {
        this(new C363540ENc(nLESegmentChromaChannel.getIntensity()), new C363540ENc(nLESegmentChromaChannel.getShadow()));
    }
}
