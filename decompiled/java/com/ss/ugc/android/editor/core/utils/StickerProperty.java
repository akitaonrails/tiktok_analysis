package com.ss.ugc.android.editor.core.utils;

import X.C1169104hl;
import X.C13BV;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C363530ENb;
import X.C363540ENc;
import com.bytedance.ies.nle.editor_jni.NLEMatrix;
import com.bytedance.ies.nle.editor_jni.NLESegmentSticker;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class StickerProperty {
    public C1169104hl boundingBoxWithoutRotate;
    public final C1169104hl position;
    public final C363540ENc rotation;
    public final C1169104hl scale;

    public StickerProperty() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerProperty)) {
            return false;
        }
        StickerProperty stickerProperty = (StickerProperty) obj;
        return Intrinsics.LJFF(this.position, stickerProperty.position) && Intrinsics.LJFF(this.scale, stickerProperty.scale) && Intrinsics.LJFF(this.rotation, stickerProperty.rotation) && Intrinsics.LJFF(this.boundingBoxWithoutRotate, stickerProperty.boundingBoxWithoutRotate);
    }

    public int hashCode() {
        return (((((this.position.hashCode() * 31) + this.scale.hashCode()) * 31) + this.rotation.hashCode()) * 31) + this.boundingBoxWithoutRotate.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StickerProperty(position=");
        sbLIZ.append(this.position);
        sbLIZ.append(", scale=");
        sbLIZ.append(this.scale);
        sbLIZ.append(", rotation=");
        sbLIZ.append(this.rotation);
        sbLIZ.append(", boundingBoxWithoutRotate=");
        sbLIZ.append(this.boundingBoxWithoutRotate);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setBoundingBoxWithoutRotate(C1169104hl c1169104hl) {
        this.boundingBoxWithoutRotate = c1169104hl;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public StickerProperty(NLESegmentSticker nLESegmentSticker, NLETrackSlot nLETrackSlot, NLEMatrix nLEMatrix) {
        float transformX;
        float transformY;
        Float[] fArr = new Float[2];
        if (nLEMatrix != null) {
            transformX = nLEMatrix.getTransformX();
        } else {
            transformX = nLETrackSlot.getTransformX();
        }
        fArr[0] = Float.valueOf(transformX);
        if (nLEMatrix != null) {
            transformY = nLEMatrix.getTransformY();
        } else {
            transformY = nLETrackSlot.getTransformY();
        }
        fArr[1] = Float.valueOf(transformY);
        this(new C1169104hl(C1697810uHb.LJIIJJI(fArr)), new C1169104hl(C1697810uHb.LJIIJJI(Float.valueOf(nLETrackSlot.getScale()), Float.valueOf(nLETrackSlot.getScale()))), new C363540ENc(-nLETrackSlot.getRotation()), null, 8, null);
    }

    public StickerProperty(C1169104hl c1169104hl, C1169104hl c1169104hl2, C363540ENc c363540ENc, C1169104hl c1169104hl3) {
        this.position = c1169104hl;
        this.scale = c1169104hl2;
        this.rotation = c363540ENc;
        this.boundingBoxWithoutRotate = c1169104hl3;
    }

    public StickerProperty(C1169104hl c1169104hl, C1169104hl c1169104hl2, C363540ENc c363540ENc, C1169104hl c1169104hl3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C1169104hl(C1697810uHb.LJIIJJI(Float.valueOf(0.0f), Float.valueOf(0.0f))) : c1169104hl, (i & 2) != 0 ? new C1169104hl(C1697810uHb.LJIIJJI(Float.valueOf(1.0f), Float.valueOf(1.0f))) : c1169104hl2, (i & 4) != 0 ? C363530ENb.LIZ : c363540ENc, (i & 8) != 0 ? new C1169104hl(C13BV.INSTANCE) : c1169104hl3);
    }
}
