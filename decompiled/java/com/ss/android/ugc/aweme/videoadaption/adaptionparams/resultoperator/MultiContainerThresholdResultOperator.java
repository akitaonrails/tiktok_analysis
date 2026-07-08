package com.ss.android.ugc.aweme.videoadaption.adaptionparams.resultoperator;

import X.EnumC20563615dK;
import X.EnumC20564215dQ;
import X.InterfaceC20564415dS;
import X.InterfaceC20567015ds;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.AdaptionPaddingValues;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class MultiContainerThresholdResultOperator implements InterfaceC20564415dS, InterfaceC20567015ds {
    public final EnumC20563615dK adaptionScaleType;
    public final float adjustContainerHeight;
    public final float adjustContainerWidth;
    public final EnumC20564215dQ alignType;
    public final float areaDiff;
    public final float bottomHeight;
    public final int bottomType;
    public final Boolean ocrEffective;
    public final float topHeight;
    public final int topType;
    public final VideoAdaptionParams videoAdaptionParams;

    public final MultiContainerThresholdResultOperator copy(int i, int i2, float f, float f2, float f3, float f4, EnumC20563615dK enumC20563615dK, EnumC20564215dQ enumC20564215dQ, float f5, VideoAdaptionParams videoAdaptionParams, Boolean bool) {
        return new MultiContainerThresholdResultOperator(i, i2, f, f2, f3, f4, enumC20563615dK, enumC20564215dQ, f5, videoAdaptionParams, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiContainerThresholdResultOperator)) {
            return false;
        }
        MultiContainerThresholdResultOperator multiContainerThresholdResultOperator = (MultiContainerThresholdResultOperator) obj;
        return this.topType == multiContainerThresholdResultOperator.topType && this.bottomType == multiContainerThresholdResultOperator.bottomType && Float.compare(this.topHeight, multiContainerThresholdResultOperator.topHeight) == 0 && Float.compare(this.bottomHeight, multiContainerThresholdResultOperator.bottomHeight) == 0 && Float.compare(this.adjustContainerHeight, multiContainerThresholdResultOperator.adjustContainerHeight) == 0 && Float.compare(this.adjustContainerWidth, multiContainerThresholdResultOperator.adjustContainerWidth) == 0 && this.adaptionScaleType == multiContainerThresholdResultOperator.adaptionScaleType && this.alignType == multiContainerThresholdResultOperator.alignType && Float.compare(this.areaDiff, multiContainerThresholdResultOperator.areaDiff) == 0 && Intrinsics.LJFF(this.videoAdaptionParams, multiContainerThresholdResultOperator.videoAdaptionParams) && Intrinsics.LJFF(this.ocrEffective, multiContainerThresholdResultOperator.ocrEffective);
    }

    public String toString() {
        return "MultiContainerThresholdResultOperator(topType=" + this.topType + ", bottomType=" + this.bottomType + ", topHeight=" + this.topHeight + ", bottomHeight=" + this.bottomHeight + ", adjustContainerHeight=" + this.adjustContainerHeight + ", adjustContainerWidth=" + this.adjustContainerWidth + ", adaptionScaleType=" + this.adaptionScaleType + ", alignType=" + this.alignType + ", areaDiff=" + this.areaDiff + ", videoAdaptionParams=" + this.videoAdaptionParams + ", ocrEffective=" + this.ocrEffective + ')';
    }

    @Override // X.InterfaceC20564415dS
    public AdaptionPaddingValues getPaddingValues() {
        return new AdaptionPaddingValues(0, (int) getTopHeight(), 0, (int) getBottomHeight());
    }

    public int hashCode() {
        int iFloatToIntBits = ((((((((((((((((((this.topType * 31) + this.bottomType) * 31) + Float.floatToIntBits(this.topHeight)) * 31) + Float.floatToIntBits(this.bottomHeight)) * 31) + Float.floatToIntBits(this.adjustContainerHeight)) * 31) + Float.floatToIntBits(this.adjustContainerWidth)) * 31) + this.adaptionScaleType.hashCode()) * 31) + this.alignType.hashCode()) * 31) + Float.floatToIntBits(this.areaDiff)) * 31) + this.videoAdaptionParams.hashCode()) * 31;
        Boolean bool = this.ocrEffective;
        return iFloatToIntBits + (bool == null ? 0 : bool.hashCode());
    }

    @Override // X.InterfaceC20564415dS, X.InterfaceC20568815eA
    public float getAdjustContainerRatio() {
        return getAdjustContainerHeight() / getAdjustContainerWidth();
    }

    @Override // X.InterfaceC20567015ds
    public EnumC20563615dK getAdaptionScaleType() {
        return this.adaptionScaleType;
    }

    @Override // X.InterfaceC20564415dS, X.InterfaceC20568815eA
    public float getAdjustContainerHeight() {
        return this.adjustContainerHeight;
    }

    @Override // X.InterfaceC20564415dS, X.InterfaceC20568815eA
    public float getAdjustContainerWidth() {
        return this.adjustContainerWidth;
    }

    @Override // X.InterfaceC20567015ds
    public EnumC20564215dQ getAlignType() {
        return this.alignType;
    }

    @Override // X.InterfaceC20567015ds
    public float getAreaDiff() {
        return this.areaDiff;
    }

    @Override // X.InterfaceC20564415dS
    public float getBottomHeight() {
        return this.bottomHeight;
    }

    @Override // X.InterfaceC20564415dS
    public int getBottomType() {
        return this.bottomType;
    }

    @Override // X.InterfaceC20564415dS
    public Boolean getOcrEffective() {
        return this.ocrEffective;
    }

    @Override // X.InterfaceC20564415dS
    public float getTopHeight() {
        return this.topHeight;
    }

    @Override // X.InterfaceC20564415dS
    public int getTopType() {
        return this.topType;
    }

    public final VideoAdaptionParams getVideoAdaptionParams() {
        return this.videoAdaptionParams;
    }

    public MultiContainerThresholdResultOperator(int i, int i2, float f, float f2, float f3, float f4, EnumC20563615dK enumC20563615dK, EnumC20564215dQ enumC20564215dQ, float f5, VideoAdaptionParams videoAdaptionParams, Boolean bool) {
        this.topType = i;
        this.bottomType = i2;
        this.topHeight = f;
        this.bottomHeight = f2;
        this.adjustContainerHeight = f3;
        this.adjustContainerWidth = f4;
        this.adaptionScaleType = enumC20563615dK;
        this.alignType = enumC20564215dQ;
        this.areaDiff = f5;
        this.videoAdaptionParams = videoAdaptionParams;
        this.ocrEffective = bool;
    }
}
