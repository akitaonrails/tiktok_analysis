package com.ss.ugc.android.editor.core.utils;

import X.C1169104hl;
import X.C13BV;
import X.C1697810uHb;
import X.C363530ENb;
import X.C363540ENc;
import com.bytedance.ies.nle.editor_jni.NLEMatrix;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLEStyText;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class TextProperty {
    public final C1169104hl backgroundColor;
    public C1169104hl boundingBoxWithoutRotate;
    public final C1169104hl outlineColor;
    public final C363540ENc outlineWidth;
    public final C1169104hl position;
    public final C363540ENc rotation;
    public final C1169104hl scale;
    public final C1169104hl shadowColor;
    public final C1169104hl shadowOffset;
    public final C363540ENc shadowSmoothing;
    public final C1169104hl textColor;

    public TextProperty() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextProperty)) {
            return false;
        }
        TextProperty textProperty = (TextProperty) obj;
        return Intrinsics.LJFF(this.position, textProperty.position) && Intrinsics.LJFF(this.scale, textProperty.scale) && Intrinsics.LJFF(this.rotation, textProperty.rotation) && Intrinsics.LJFF(this.textColor, textProperty.textColor) && Intrinsics.LJFF(this.backgroundColor, textProperty.backgroundColor) && Intrinsics.LJFF(this.shadowColor, textProperty.shadowColor) && Intrinsics.LJFF(this.shadowSmoothing, textProperty.shadowSmoothing) && Intrinsics.LJFF(this.shadowOffset, textProperty.shadowOffset) && Intrinsics.LJFF(this.outlineWidth, textProperty.outlineWidth) && Intrinsics.LJFF(this.outlineColor, textProperty.outlineColor) && Intrinsics.LJFF(this.boundingBoxWithoutRotate, textProperty.boundingBoxWithoutRotate);
    }

    public int hashCode() {
        return (((((((((((((((((((this.position.hashCode() * 31) + this.scale.hashCode()) * 31) + this.rotation.hashCode()) * 31) + this.textColor.hashCode()) * 31) + this.backgroundColor.hashCode()) * 31) + this.shadowColor.hashCode()) * 31) + this.shadowSmoothing.hashCode()) * 31) + this.shadowOffset.hashCode()) * 31) + this.outlineWidth.hashCode()) * 31) + this.outlineColor.hashCode()) * 31) + this.boundingBoxWithoutRotate.hashCode();
    }

    public String toString() {
        return "TextProperty(position=" + this.position + ", scale=" + this.scale + ", rotation=" + this.rotation + ", textColor=" + this.textColor + ", backgroundColor=" + this.backgroundColor + ", shadowColor=" + this.shadowColor + ", shadowSmoothing=" + this.shadowSmoothing + ", shadowOffset=" + this.shadowOffset + ", outlineWidth=" + this.outlineWidth + ", outlineColor=" + this.outlineColor + ", boundingBoxWithoutRotate=" + this.boundingBoxWithoutRotate + ')';
    }

    public final void setBoundingBoxWithoutRotate(C1169104hl c1169104hl) {
        this.boundingBoxWithoutRotate = c1169104hl;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextProperty(NLESegmentTextSticker nLESegmentTextSticker, NLETrackSlot nLETrackSlot, NLEMatrix nLEMatrix) {
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
        this(new C1169104hl(C1697810uHb.LJIIJJI(fArr)), new C1169104hl(C1697810uHb.LJIIJJI(Float.valueOf(nLETrackSlot.getScale()), Float.valueOf(nLETrackSlot.getScale()))), new C363540ENc(-nLETrackSlot.getRotation()), new C1169104hl(NLEStyText.ARGB2RGBA(nLESegmentTextSticker.getStyle().getTextColor())), new C1169104hl(NLEStyText.ARGB2RGBA(nLESegmentTextSticker.getStyle().getBackgroundColor())), new C1169104hl(NLEStyText.ARGB2RGBA(nLESegmentTextSticker.getStyle().getShadowColor())), new C363540ENc(((double) nLESegmentTextSticker.getStyle().getShadowSmoothing()) / ((double) 18.0f)), new C1169104hl(C1697810uHb.LJIIJJI(Float.valueOf(nLESegmentTextSticker.getStyle().getShadowOffsetX() / 18.0f), Float.valueOf(nLESegmentTextSticker.getStyle().getShadowOffsetY() / 18.0f))), new C363540ENc(nLESegmentTextSticker.getStyle().getOutlineWidth()), new C1169104hl(NLEStyText.ARGB2RGBA(nLESegmentTextSticker.getStyle().getOutlineColor())), null, 1024, null);
    }

    public TextProperty(C1169104hl c1169104hl, C1169104hl c1169104hl2, C363540ENc c363540ENc, C1169104hl c1169104hl3, C1169104hl c1169104hl4, C1169104hl c1169104hl5, C363540ENc c363540ENc2, C1169104hl c1169104hl6, C363540ENc c363540ENc3, C1169104hl c1169104hl7, C1169104hl c1169104hl8) {
        this.position = c1169104hl;
        this.scale = c1169104hl2;
        this.rotation = c363540ENc;
        this.textColor = c1169104hl3;
        this.backgroundColor = c1169104hl4;
        this.shadowColor = c1169104hl5;
        this.shadowSmoothing = c363540ENc2;
        this.shadowOffset = c1169104hl6;
        this.outlineWidth = c363540ENc3;
        this.outlineColor = c1169104hl7;
        this.boundingBoxWithoutRotate = c1169104hl8;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextProperty(C1169104hl c1169104hl, C1169104hl c1169104hl2, C363540ENc c363540ENc, C1169104hl c1169104hl3, C1169104hl c1169104hl4, C1169104hl c1169104hl5, C363540ENc c363540ENc2, C1169104hl c1169104hl6, C363540ENc c363540ENc3, C1169104hl c1169104hl7, C1169104hl c1169104hl8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        C1169104hl c1169104hl9 = c1169104hl;
        C1169104hl c1169104hl10 = c1169104hl2;
        C1169104hl c1169104hl11 = c1169104hl4;
        C1169104hl c1169104hl12 = c1169104hl3;
        C1169104hl c1169104hl13 = c1169104hl6;
        C1169104hl c1169104hl14 = c1169104hl5;
        C1169104hl c1169104hl15 = c1169104hl8;
        C1169104hl c1169104hl16 = c1169104hl7;
        int i2 = i & 1;
        Float fValueOf = Float.valueOf(0.0f);
        this(i2 != 0 ? new C1169104hl(C1697810uHb.LJIIJJI(fValueOf, fValueOf)) : c1169104hl9, (i & 2) != 0 ? new C1169104hl(C1697810uHb.LJIIJJI(Float.valueOf(1.0f), Float.valueOf(1.0f))) : c1169104hl10, (i & 4) != 0 ? C363530ENb.LIZ : c363540ENc, (i & 8) != 0 ? new C1169104hl(C1697810uHb.LJIIJJI(fValueOf, fValueOf, fValueOf, fValueOf)) : c1169104hl12, (i & 16) != 0 ? new C1169104hl(C1697810uHb.LJIIJJI(fValueOf, fValueOf, fValueOf, fValueOf)) : c1169104hl11, (i & 32) != 0 ? new C1169104hl(C1697810uHb.LJIIJJI(fValueOf, fValueOf, fValueOf, fValueOf)) : c1169104hl14, (i & 64) != 0 ? C363530ENb.LIZ : c363540ENc2, (i & 128) != 0 ? new C1169104hl(C1697810uHb.LJIIJJI(fValueOf, fValueOf)) : c1169104hl13, (i & 256) != 0 ? C363530ENb.LIZ : c363540ENc3, (i & 512) != 0 ? new C1169104hl(C1697810uHb.LJIIJJI(fValueOf, fValueOf, fValueOf, fValueOf)) : c1169104hl16, (i & 1024) != 0 ? new C1169104hl(C13BV.INSTANCE) : c1169104hl15);
    }
}
