package com.ss.android.ugc.aweme.videoadaption.adaptionparams.resultoperator;

import X.C2188811AlT;
import X.InterfaceC20564415dS;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.AdaptionPaddingValues;

/* JADX INFO: loaded from: classes32.dex */
public final class MultiContainerThresholdResultInnerOperator implements InterfaceC20564415dS {
    public final float adjustContainerHeight;
    public final float adjustContainerWidth;
    public final float bottomHeight;
    public final int bottomType;
    public final float topHeight;
    public final int topType;

    public final MultiContainerThresholdResultInnerOperator copy(int i, int i2, float f, float f2, float f3, float f4) {
        return new MultiContainerThresholdResultInnerOperator(i, i2, f, f2, f3, f4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiContainerThresholdResultInnerOperator)) {
            return false;
        }
        MultiContainerThresholdResultInnerOperator multiContainerThresholdResultInnerOperator = (MultiContainerThresholdResultInnerOperator) obj;
        return this.topType == multiContainerThresholdResultInnerOperator.topType && this.bottomType == multiContainerThresholdResultInnerOperator.bottomType && Float.compare(this.topHeight, multiContainerThresholdResultInnerOperator.topHeight) == 0 && Float.compare(this.bottomHeight, multiContainerThresholdResultInnerOperator.bottomHeight) == 0 && Float.compare(this.adjustContainerHeight, multiContainerThresholdResultInnerOperator.adjustContainerHeight) == 0 && Float.compare(this.adjustContainerWidth, multiContainerThresholdResultInnerOperator.adjustContainerWidth) == 0;
    }

    @Override // X.InterfaceC20564415dS
    public Boolean getOcrEffective() {
        return null;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiContainerThresholdResultInnerOperator(topType=");
        sbLIZ.append(this.topType);
        sbLIZ.append(", bottomType=");
        sbLIZ.append(this.bottomType);
        sbLIZ.append(", topHeight=");
        sbLIZ.append(this.topHeight);
        sbLIZ.append(", bottomHeight=");
        sbLIZ.append(this.bottomHeight);
        sbLIZ.append(", adjustContainerHeight=");
        sbLIZ.append(this.adjustContainerHeight);
        sbLIZ.append(", adjustContainerWidth=");
        sbLIZ.append(this.adjustContainerWidth);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC20564415dS
    public AdaptionPaddingValues getPaddingValues() {
        return new AdaptionPaddingValues(0, (int) getTopHeight(), 0, (int) getBottomHeight());
    }

    public int hashCode() {
        return (((((((((this.topType * 31) + this.bottomType) * 31) + Float.floatToIntBits(this.topHeight)) * 31) + Float.floatToIntBits(this.bottomHeight)) * 31) + Float.floatToIntBits(this.adjustContainerHeight)) * 31) + Float.floatToIntBits(this.adjustContainerWidth);
    }

    @Override // X.InterfaceC20564415dS, X.InterfaceC20568815eA
    public float getAdjustContainerRatio() {
        return getAdjustContainerHeight() / getAdjustContainerWidth();
    }

    @Override // X.InterfaceC20564415dS, X.InterfaceC20568815eA
    public float getAdjustContainerHeight() {
        return this.adjustContainerHeight;
    }

    @Override // X.InterfaceC20564415dS, X.InterfaceC20568815eA
    public float getAdjustContainerWidth() {
        return this.adjustContainerWidth;
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
    public float getTopHeight() {
        return this.topHeight;
    }

    @Override // X.InterfaceC20564415dS
    public int getTopType() {
        return this.topType;
    }

    public MultiContainerThresholdResultInnerOperator(int i, int i2, float f, float f2, float f3, float f4) {
        this.topType = i;
        this.bottomType = i2;
        this.topHeight = f;
        this.bottomHeight = f2;
        this.adjustContainerHeight = f3;
        this.adjustContainerWidth = f4;
    }
}
