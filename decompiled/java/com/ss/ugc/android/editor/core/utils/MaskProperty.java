package com.ss.ugc.android.editor.core.utils;

import X.C07TF;
import X.C2188811AlT;
import X.C363530ENb;
import com.bytedance.ies.nle.editor_jni.NLEMatrix;
import com.bytedance.ies.nle.editor_jni.NLESegmentMask;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class MaskProperty {
    public final C07TF centerX;
    public final C07TF centerY;
    public final C07TF feather;
    public final C07TF height;
    public final C07TF rotation;
    public final C07TF roundCorner;
    public final C07TF width;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaskProperty)) {
            return false;
        }
        MaskProperty maskProperty = (MaskProperty) obj;
        return Intrinsics.LJFF(this.width, maskProperty.width) && Intrinsics.LJFF(this.height, maskProperty.height) && Intrinsics.LJFF(this.centerX, maskProperty.centerX) && Intrinsics.LJFF(this.centerY, maskProperty.centerY) && Intrinsics.LJFF(this.rotation, maskProperty.rotation) && Intrinsics.LJFF(this.feather, maskProperty.feather) && Intrinsics.LJFF(this.roundCorner, maskProperty.roundCorner);
    }

    public int hashCode() {
        return (((((((((((this.width.hashCode() * 31) + this.height.hashCode()) * 31) + this.centerX.hashCode()) * 31) + this.centerY.hashCode()) * 31) + this.rotation.hashCode()) * 31) + this.feather.hashCode()) * 31) + this.roundCorner.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MaskProperty(width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", centerX=");
        sbLIZ.append(this.centerX);
        sbLIZ.append(", centerY=");
        sbLIZ.append(this.centerY);
        sbLIZ.append(", rotation=");
        sbLIZ.append(this.rotation);
        sbLIZ.append(", feather=");
        sbLIZ.append(this.feather);
        sbLIZ.append(", roundCorner=");
        sbLIZ.append(this.roundCorner);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MaskProperty() {
        this(C363530ENb.LIZIZ, C363530ENb.LIZIZ, C363530ENb.LIZIZ, C363530ENb.LIZIZ, C363530ENb.LIZIZ, C363530ENb.LIZIZ, C363530ENb.LIZIZ);
    }

    public MaskProperty(NLESegmentMask nLESegmentMask, NLETrackSlot nLETrackSlot, NLEMatrix nLEMatrix) {
        this(new C07TF(nLESegmentMask.getWidth()), new C07TF(nLESegmentMask.getHeight()), new C07TF(nLESegmentMask.getCenterX()), new C07TF(nLESegmentMask.getCenterY()), new C07TF(nLESegmentMask.getRotation()), new C07TF(nLESegmentMask.getFeather()), new C07TF(nLESegmentMask.getRoundCorner()));
    }

    public MaskProperty(C07TF c07tf, C07TF c07tf2, C07TF c07tf3, C07TF c07tf4, C07TF c07tf5, C07TF c07tf6, C07TF c07tf7) {
        this.width = c07tf;
        this.height = c07tf2;
        this.centerX = c07tf3;
        this.centerY = c07tf4;
        this.rotation = c07tf5;
        this.feather = c07tf6;
        this.roundCorner = c07tf7;
    }
}
