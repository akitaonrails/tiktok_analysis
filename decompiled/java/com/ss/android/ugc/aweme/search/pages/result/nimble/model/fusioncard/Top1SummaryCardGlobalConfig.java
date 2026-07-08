package com.ss.android.ugc.aweme.search.pages.result.nimble.model.fusioncard;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1771006we;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class Top1SummaryCardGlobalConfig implements Serializable, InterfaceC1771006we {

    @C09CT("graphics_style")
    public final Integer graphicsStyle;

    @C09CT("retry_times")
    public final Integer retryTimes;

    @C09CT("shimmer_effect")
    public final Integer shimmerEffect;

    @C09CT("step_style")
    public final Integer stepStyle;

    public Top1SummaryCardGlobalConfig() {
        this(null, null, null, null);
    }

    public final Top1SummaryCardGlobalConfig copy(Integer num, Integer num2, Integer num3, Integer num4) {
        return new Top1SummaryCardGlobalConfig(num, num2, num3, num4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Top1SummaryCardGlobalConfig)) {
            return false;
        }
        Top1SummaryCardGlobalConfig top1SummaryCardGlobalConfig = (Top1SummaryCardGlobalConfig) obj;
        return Intrinsics.LJFF(this.retryTimes, top1SummaryCardGlobalConfig.retryTimes) && Intrinsics.LJFF(this.graphicsStyle, top1SummaryCardGlobalConfig.graphicsStyle) && Intrinsics.LJFF(this.stepStyle, top1SummaryCardGlobalConfig.stepStyle) && Intrinsics.LJFF(this.shimmerEffect, top1SummaryCardGlobalConfig.shimmerEffect);
    }

    public int hashCode() {
        Integer num = this.retryTimes;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.graphicsStyle;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.stepStyle;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.shimmerEffect;
        return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Top1SummaryCardGlobalConfig(retryTimes=");
        sbLIZ.append(this.retryTimes);
        sbLIZ.append(", graphicsStyle=");
        sbLIZ.append(this.graphicsStyle);
        sbLIZ.append(", stepStyle=");
        sbLIZ.append(this.stepStyle);
        sbLIZ.append(", shimmerEffect=");
        sbLIZ.append(this.shimmerEffect);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public boolean isGraphicLoadingStyle() {
        Integer graphicsStyle = getGraphicsStyle();
        return graphicsStyle != null && graphicsStyle.intValue() == 2;
    }

    @Override // X.InterfaceC1771006we
    public boolean isLinearLoadingStyle() {
        Integer graphicsStyle = getGraphicsStyle();
        return graphicsStyle != null && graphicsStyle.intValue() == 1;
    }

    @Override // X.InterfaceC1771006we
    public boolean isNewLoadingStyle() {
        return isOneStepStyle() || isSeveralStepsStyle();
    }

    @Override // X.InterfaceC1771006we
    public boolean isOneStepStyle() {
        Integer stepStyle = getStepStyle();
        return stepStyle != null && stepStyle.intValue() == 1;
    }

    @Override // X.InterfaceC1771006we
    public boolean isSeveralStepsStyle() {
        Integer stepStyle = getStepStyle();
        return stepStyle != null && stepStyle.intValue() == 2;
    }

    @Override // X.InterfaceC1771006we
    public boolean isShimmerEnabled() {
        Integer shimmerEffect = getShimmerEffect();
        return shimmerEffect != null && shimmerEffect.intValue() == 1;
    }

    @Override // X.InterfaceC1771006we
    public Integer getGraphicsStyle() {
        return this.graphicsStyle;
    }

    public final Integer getRetryTimes() {
        return this.retryTimes;
    }

    @Override // X.InterfaceC1771006we
    public Integer getShimmerEffect() {
        return this.shimmerEffect;
    }

    @Override // X.InterfaceC1771006we
    public Integer getStepStyle() {
        return this.stepStyle;
    }

    public Top1SummaryCardGlobalConfig(Integer num, Integer num2, Integer num3, Integer num4) {
        this.retryTimes = num;
        this.graphicsStyle = num2;
        this.stepStyle = num3;
        this.shimmerEffect = num4;
    }
}
