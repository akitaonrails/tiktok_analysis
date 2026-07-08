package com.ss.android.ugc.aweme.videoadaption.adaptionparams.resultoperator;

import X.C2188811AlT;
import X.EnumC20563615dK;
import X.EnumC20564215dQ;
import X.InterfaceC20567015ds;

/* JADX INFO: loaded from: classes32.dex */
public final class ThresholdAdaptionResultOperator implements InterfaceC20567015ds {
    public final EnumC20563615dK adaptionScaleType;
    public final EnumC20564215dQ alignType;
    public final float areaDiff;

    public final ThresholdAdaptionResultOperator copy(EnumC20563615dK enumC20563615dK, EnumC20564215dQ enumC20564215dQ, float f) {
        return new ThresholdAdaptionResultOperator(enumC20563615dK, enumC20564215dQ, f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThresholdAdaptionResultOperator)) {
            return false;
        }
        ThresholdAdaptionResultOperator thresholdAdaptionResultOperator = (ThresholdAdaptionResultOperator) obj;
        return this.adaptionScaleType == thresholdAdaptionResultOperator.adaptionScaleType && this.alignType == thresholdAdaptionResultOperator.alignType && Float.compare(this.areaDiff, thresholdAdaptionResultOperator.areaDiff) == 0;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ThresholdAdaptionResultOperator(adaptionScaleType=");
        sbLIZ.append(this.adaptionScaleType);
        sbLIZ.append(", alignType=");
        sbLIZ.append(this.alignType);
        sbLIZ.append(", areaDiff=");
        sbLIZ.append(this.areaDiff);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int hashCode() {
        return (((this.adaptionScaleType.hashCode() * 31) + this.alignType.hashCode()) * 31) + Float.floatToIntBits(this.areaDiff);
    }

    @Override // X.InterfaceC20567015ds
    public EnumC20563615dK getAdaptionScaleType() {
        return this.adaptionScaleType;
    }

    @Override // X.InterfaceC20567015ds
    public EnumC20564215dQ getAlignType() {
        return this.alignType;
    }

    @Override // X.InterfaceC20567015ds
    public float getAreaDiff() {
        return this.areaDiff;
    }

    public ThresholdAdaptionResultOperator(EnumC20563615dK enumC20563615dK, EnumC20564215dQ enumC20564215dQ, float f) {
        this.adaptionScaleType = enumC20563615dK;
        this.alignType = enumC20564215dQ;
        this.areaDiff = f;
    }
}
