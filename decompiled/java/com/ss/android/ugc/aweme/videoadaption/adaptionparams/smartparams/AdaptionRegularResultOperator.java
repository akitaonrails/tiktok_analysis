package com.ss.android.ugc.aweme.videoadaption.adaptionparams.smartparams;

import X.C2188811AlT;
import X.InterfaceC1869707Tz;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionParams;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class AdaptionRegularResultOperator implements InterfaceC1869707Tz {
    public Boolean isIntextOccludeDesc;
    public Boolean isIntextOccludeInteraction;
    public Boolean isIntextOccludeTab;
    public Boolean isIntextOut;
    public boolean needSave;
    public VideoAdaptionResult oldResult;
    public VideoAdaptionParams params;
    public double transXRegular;
    public double transYRegular;
    public double widthScaleRegular = getOldWidthScaleRegular();

    private final VideoAdaptionParams component1() {
        return this.params;
    }

    private final VideoAdaptionResult component2() {
        return this.oldResult;
    }

    private final double getXBiasRegular() {
        return (((double) 1) - this.widthScaleRegular) / ((double) 2);
    }

    private final double getYBiasRegular() {
        return (((double) 1) - getHeightScaleRegular()) / ((double) 2);
    }

    private final void setContainerScale(double d) {
    }

    private final void setHeight(int i) {
    }

    private final void setHeightScaleRegular(double d) {
    }

    private final void setOldWidthScaleRegular(double d) {
    }

    private final void setTranslateX(float f) {
    }

    private final void setTranslateY(float f) {
    }

    private final void setVideoScale(double d) {
    }

    private final void setVideoScaleRegular(double d) {
    }

    private final void setWidth(int i) {
    }

    private final void setXBiasRegular(double d) {
    }

    private final void setYBiasRegular(double d) {
    }

    public final AdaptionRegularResultOperator copy(VideoAdaptionParams videoAdaptionParams, VideoAdaptionResult videoAdaptionResult) {
        return new AdaptionRegularResultOperator(videoAdaptionParams, videoAdaptionResult);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdaptionRegularResultOperator)) {
            return false;
        }
        AdaptionRegularResultOperator adaptionRegularResultOperator = (AdaptionRegularResultOperator) obj;
        return Intrinsics.LJFF(this.params, adaptionRegularResultOperator.params) && Intrinsics.LJFF(this.oldResult, adaptionRegularResultOperator.oldResult);
    }

    public int hashCode() {
        return (this.params.hashCode() * 31) + this.oldResult.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdaptionRegularResultOperator(params=");
        sbLIZ.append(this.params);
        sbLIZ.append(", oldResult=");
        sbLIZ.append(this.oldResult);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    private final double getContainerScale() {
        return ((double) this.params.getContainerHeight()) / ((double) this.params.getContainerWidth());
    }

    private final double getHeightScaleRegular() {
        return this.widthScaleRegular * getVideoScaleRegular();
    }

    private final double getOldWidthScaleRegular() {
        return ((double) this.oldResult.getWidth()) / ((double) this.params.getContainerWidth());
    }

    private final double getVideoScale() {
        return ((double) this.oldResult.getHeight()) / ((double) this.oldResult.getWidth());
    }

    public final float getTranslateX() {
        return (float) (this.transXRegular * ((double) this.params.getContainerWidth()));
    }

    public final float getTranslateY() {
        return (float) (this.transYRegular * ((double) this.params.getContainerHeight()));
    }

    public final int getWidth() {
        return (int) (this.widthScaleRegular * ((double) this.params.getContainerWidth()));
    }

    public final boolean isShrink() {
        return this.widthScaleRegular < getOldWidthScaleRegular();
    }

    public final double alignToBottomTransY() {
        return getYBiasRegular();
    }

    public final int getHeight() {
        return (int) (getHeightScaleRegular() * ((double) this.params.getContainerHeight()));
    }

    public final double getVideoScaleRegular() {
        return getVideoScale() / getContainerScale();
    }

    public final boolean getNeedSave() {
        return this.needSave;
    }

    public final double getTranslateXRegular() {
        return this.transXRegular;
    }

    public final double getTranslateYRegular() {
        return this.transYRegular;
    }

    public final double getWidthScaleRegular() {
        return this.widthScaleRegular;
    }

    public final Boolean isIntextOccludeDesc() {
        return this.isIntextOccludeDesc;
    }

    public final Boolean isIntextOccludeInteraction() {
        return this.isIntextOccludeInteraction;
    }

    public final Boolean isIntextOccludeTab() {
        return this.isIntextOccludeTab;
    }

    public final Boolean isIntextOut() {
        return this.isIntextOut;
    }

    public final double getRectBottom(double d) {
        return (d * getHeightScaleRegular()) + getYBiasRegular() + this.transYRegular;
    }

    public final double getRectLeft(double d) {
        return (d * this.widthScaleRegular) + getXBiasRegular() + this.transXRegular;
    }

    public final double getRectRight(double d) {
        return (d * this.widthScaleRegular) + getXBiasRegular() + this.transXRegular;
    }

    public final double getRectTop(double d) {
        return (d * getHeightScaleRegular()) + getYBiasRegular() + this.transYRegular;
    }

    public final void setIntextOccludeDesc(Boolean bool) {
        this.isIntextOccludeDesc = bool;
    }

    public final void setIntextOccludeInteraction(Boolean bool) {
        this.isIntextOccludeInteraction = bool;
    }

    public final void setIntextOccludeTab(Boolean bool) {
        this.isIntextOccludeTab = bool;
    }

    public final void setIntextOut(Boolean bool) {
        this.isIntextOut = bool;
    }

    public final void setNeedSave(boolean z) {
        this.needSave = z;
    }

    public AdaptionRegularResultOperator(VideoAdaptionParams videoAdaptionParams, VideoAdaptionResult videoAdaptionResult) {
        this.params = videoAdaptionParams;
        this.oldResult = videoAdaptionResult;
    }

    public final void updateRegularResult(Double d, Double d2, Double d3) {
        if (d != null) {
            this.widthScaleRegular = d.doubleValue();
        }
        if (d2 != null) {
            this.transXRegular = d2.doubleValue();
        }
        if (d3 != null) {
            this.transYRegular = d3.doubleValue();
        }
    }
}
