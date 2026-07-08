package com.ss.android.ugc.aweme.search.pages.result.pov.model;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1771006we;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class Top1SummaryCardSyncConfig implements Serializable, InterfaceC1771006we {

    @C09CT("graphics_style")
    public final Integer graphicsStyle;

    @C09CT("preview_loading_texts")
    public final List<String> previewLoadingTexts;

    @C09CT("searching_sources")
    public final List<SourceFromEntity> searchingSources;

    @C09CT("shimmer_effect")
    public final Integer shimmerEffect;

    @C09CT("stage_code")
    public final Integer stageCode;

    @C09CT("step_style")
    public final Integer stepStyle;

    public Top1SummaryCardSyncConfig() {
        this(null, null, null, null, null, null);
    }

    public final Top1SummaryCardSyncConfig copy(Integer num, Integer num2, Integer num3, Integer num4, List<String> list, List<SourceFromEntity> list2) {
        return new Top1SummaryCardSyncConfig(num, num2, num3, num4, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Top1SummaryCardSyncConfig)) {
            return false;
        }
        Top1SummaryCardSyncConfig top1SummaryCardSyncConfig = (Top1SummaryCardSyncConfig) obj;
        return Intrinsics.LJFF(this.graphicsStyle, top1SummaryCardSyncConfig.graphicsStyle) && Intrinsics.LJFF(this.stepStyle, top1SummaryCardSyncConfig.stepStyle) && Intrinsics.LJFF(this.shimmerEffect, top1SummaryCardSyncConfig.shimmerEffect) && Intrinsics.LJFF(this.stageCode, top1SummaryCardSyncConfig.stageCode) && Intrinsics.LJFF(this.previewLoadingTexts, top1SummaryCardSyncConfig.previewLoadingTexts) && Intrinsics.LJFF(this.searchingSources, top1SummaryCardSyncConfig.searchingSources);
    }

    public int hashCode() {
        Integer num = this.graphicsStyle;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.stepStyle;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.shimmerEffect;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.stageCode;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List<String> list = this.previewLoadingTexts;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<SourceFromEntity> list2 = this.searchingSources;
        return iHashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Top1SummaryCardSyncConfig(graphicsStyle=");
        sbLIZ.append(this.graphicsStyle);
        sbLIZ.append(", stepStyle=");
        sbLIZ.append(this.stepStyle);
        sbLIZ.append(", shimmerEffect=");
        sbLIZ.append(this.shimmerEffect);
        sbLIZ.append(", stageCode=");
        sbLIZ.append(this.stageCode);
        sbLIZ.append(", previewLoadingTexts=");
        sbLIZ.append(this.previewLoadingTexts);
        sbLIZ.append(", searchingSources=");
        sbLIZ.append(this.searchingSources);
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

    public final List<String> getPreviewLoadingTexts() {
        return this.previewLoadingTexts;
    }

    public final List<SourceFromEntity> getSearchingSources() {
        return this.searchingSources;
    }

    @Override // X.InterfaceC1771006we
    public Integer getShimmerEffect() {
        return this.shimmerEffect;
    }

    public final Integer getStageCode() {
        return this.stageCode;
    }

    @Override // X.InterfaceC1771006we
    public Integer getStepStyle() {
        return this.stepStyle;
    }

    public Top1SummaryCardSyncConfig(Integer num, Integer num2, Integer num3, Integer num4, List<String> list, List<SourceFromEntity> list2) {
        this.graphicsStyle = num;
        this.stepStyle = num2;
        this.shimmerEffect = num3;
        this.stageCode = num4;
        this.previewLoadingTexts = list;
        this.searchingSources = list2;
    }
}
