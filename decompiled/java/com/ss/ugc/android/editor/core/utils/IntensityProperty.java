package com.ss.ugc.android.editor.core.utils;

import X.C2188811AlT;
import X.C363530ENb;
import X.C363540ENc;
import com.bytedance.ies.nle.editor_jni.NLEMatrix;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class IntensityProperty {
    public final C363540ENc intensity;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IntensityProperty) && Intrinsics.LJFF(this.intensity, ((IntensityProperty) obj).intensity);
    }

    public int hashCode() {
        return this.intensity.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IntensityProperty(intensity=");
        sbLIZ.append(this.intensity);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IntensityProperty() {
        this(C363530ENb.LIZ);
    }

    public IntensityProperty(C363540ENc c363540ENc) {
        this.intensity = c363540ENc;
    }

    public IntensityProperty(NLESegmentFilter nLESegmentFilter, NLETrackSlot nLETrackSlot, NLEMatrix nLEMatrix) {
        this(new C363540ENc(nLESegmentFilter.getIntensity()));
    }
}
