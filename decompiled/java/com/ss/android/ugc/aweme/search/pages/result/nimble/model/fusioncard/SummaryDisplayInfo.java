package com.ss.android.ugc.aweme.search.pages.result.nimble.model.fusioncard;

import X.C09CT;
import X.InterfaceC1120204Zs;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.SourceFromEntity;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SummaryDisplayInfo implements Serializable, InterfaceC1120204Zs {

    @C09CT("animation_config")
    public final AnimationConfig animationConfig;

    @C09CT("back_ground")
    public final BackGround backGround;

    @C09CT("is_rejected_answer")
    public final Boolean isRejectedAnswer;

    @C09CT("label_text")
    public final String labelText;

    @C09CT("landing_retry_text")
    public final String landingRetryText;

    @C09CT("landing_retry_toast_text")
    public final String landingRetryToastText;

    @C09CT("loading_time_duration")
    public final Long loadingTimeDuration;

    @C09CT("max_height")
    public final Double maxHeight;

    @C09CT("more_detail_action")
    public final Integer moreDetailAction;

    @C09CT("more_detail_text")
    public final String moreDetailText;

    @C09CT("preview_loading_texts")
    public final List<String> previewLoadingTexts;

    @C09CT("preview_retry_texts")
    public final List<String> previewRetryTexts;

    @C09CT("searching_sources")
    public final List<SourceFromEntity> searchingSources;

    @C09CT("see_more_config")
    public final Top1SeeMoreButtonConfig seeMoreConfig;

    @C09CT("see_more_optimize")
    public final Boolean seeMoreOptimize;

    @C09CT("source_style")
    public final Integer sourceStyle;

    public SummaryDisplayInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final SummaryDisplayInfo copy(List<String> list, List<String> list2, Long l, String str, Integer num, Top1SeeMoreButtonConfig top1SeeMoreButtonConfig, Double d, String str2, List<SourceFromEntity> list3, String str3, String str4, Boolean bool, Boolean bool2, Integer num2, AnimationConfig animationConfig, BackGround backGround) {
        return new SummaryDisplayInfo(list, list2, l, str, num, top1SeeMoreButtonConfig, d, str2, list3, str3, str4, bool, bool2, num2, animationConfig, backGround);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SummaryDisplayInfo)) {
            return false;
        }
        SummaryDisplayInfo summaryDisplayInfo = (SummaryDisplayInfo) obj;
        return Intrinsics.LJFF(this.previewLoadingTexts, summaryDisplayInfo.previewLoadingTexts) && Intrinsics.LJFF(this.previewRetryTexts, summaryDisplayInfo.previewRetryTexts) && Intrinsics.LJFF(this.loadingTimeDuration, summaryDisplayInfo.loadingTimeDuration) && Intrinsics.LJFF(this.moreDetailText, summaryDisplayInfo.moreDetailText) && Intrinsics.LJFF(this.moreDetailAction, summaryDisplayInfo.moreDetailAction) && Intrinsics.LJFF(this.seeMoreConfig, summaryDisplayInfo.seeMoreConfig) && Intrinsics.LJFF(this.maxHeight, summaryDisplayInfo.maxHeight) && Intrinsics.LJFF(this.labelText, summaryDisplayInfo.labelText) && Intrinsics.LJFF(this.searchingSources, summaryDisplayInfo.searchingSources) && Intrinsics.LJFF(this.landingRetryToastText, summaryDisplayInfo.landingRetryToastText) && Intrinsics.LJFF(this.landingRetryText, summaryDisplayInfo.landingRetryText) && Intrinsics.LJFF(this.seeMoreOptimize, summaryDisplayInfo.seeMoreOptimize) && Intrinsics.LJFF(this.isRejectedAnswer, summaryDisplayInfo.isRejectedAnswer) && Intrinsics.LJFF(this.sourceStyle, summaryDisplayInfo.sourceStyle) && Intrinsics.LJFF(this.animationConfig, summaryDisplayInfo.animationConfig) && Intrinsics.LJFF(this.backGround, summaryDisplayInfo.backGround);
    }

    public int hashCode() {
        List<String> list = this.previewLoadingTexts;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.previewRetryTexts;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Long l = this.loadingTimeDuration;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.moreDetailText;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.moreDetailAction;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Top1SeeMoreButtonConfig top1SeeMoreButtonConfig = this.seeMoreConfig;
        int iHashCode6 = (iHashCode5 + (top1SeeMoreButtonConfig == null ? 0 : top1SeeMoreButtonConfig.hashCode())) * 31;
        Double d = this.maxHeight;
        int iHashCode7 = (iHashCode6 + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.labelText;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<SourceFromEntity> list3 = this.searchingSources;
        int iHashCode9 = (iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str3 = this.landingRetryToastText;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.landingRetryText;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.seeMoreOptimize;
        int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isRejectedAnswer;
        int iHashCode13 = (iHashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num2 = this.sourceStyle;
        int iHashCode14 = (iHashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        AnimationConfig animationConfig = this.animationConfig;
        int iHashCode15 = (iHashCode14 + (animationConfig == null ? 0 : animationConfig.hashCode())) * 31;
        BackGround backGround = this.backGround;
        return iHashCode15 + (backGround != null ? backGround.hashCode() : 0);
    }

    public String toString() {
        return "SummaryDisplayInfo(previewLoadingTexts=" + this.previewLoadingTexts + ", previewRetryTexts=" + this.previewRetryTexts + ", loadingTimeDuration=" + this.loadingTimeDuration + ", moreDetailText=" + this.moreDetailText + ", moreDetailAction=" + this.moreDetailAction + ", seeMoreConfig=" + this.seeMoreConfig + ", maxHeight=" + this.maxHeight + ", labelText=" + this.labelText + ", searchingSources=" + this.searchingSources + ", landingRetryToastText=" + this.landingRetryToastText + ", landingRetryText=" + this.landingRetryText + ", seeMoreOptimize=" + this.seeMoreOptimize + ", isRejectedAnswer=" + this.isRejectedAnswer + ", sourceStyle=" + this.sourceStyle + ", animationConfig=" + this.animationConfig + ", backGround=" + this.backGround + ')';
    }

    public final AnimationConfig getAnimationConfig() {
        return this.animationConfig;
    }

    public final BackGround getBackGround() {
        return this.backGround;
    }

    public final String getLabelText() {
        return this.labelText;
    }

    @Override // X.InterfaceC1120204Zs
    public String getLandingRetryText() {
        return this.landingRetryText;
    }

    public String getLandingRetryToastText() {
        return this.landingRetryToastText;
    }

    @Override // X.InterfaceC1120204Zs
    public Long getLoadingTimeDuration() {
        return this.loadingTimeDuration;
    }

    public final Double getMaxHeight() {
        return this.maxHeight;
    }

    public final Integer getMoreDetailAction() {
        return this.moreDetailAction;
    }

    public final String getMoreDetailText() {
        return this.moreDetailText;
    }

    @Override // X.InterfaceC1120204Zs
    public List<String> getPreviewLoadingTexts() {
        return this.previewLoadingTexts;
    }

    @Override // X.InterfaceC1120204Zs
    public List<String> getPreviewRetryTexts() {
        return this.previewRetryTexts;
    }

    public final List<SourceFromEntity> getSearchingSources() {
        return this.searchingSources;
    }

    public final Top1SeeMoreButtonConfig getSeeMoreConfig() {
        return this.seeMoreConfig;
    }

    public final Boolean getSeeMoreOptimize() {
        return this.seeMoreOptimize;
    }

    public final Integer getSourceStyle() {
        return this.sourceStyle;
    }

    public final Boolean isRejectedAnswer() {
        return this.isRejectedAnswer;
    }

    public SummaryDisplayInfo(List<String> list, List<String> list2, Long l, String str, Integer num, Top1SeeMoreButtonConfig top1SeeMoreButtonConfig, Double d, String str2, List<SourceFromEntity> list3, String str3, String str4, Boolean bool, Boolean bool2, Integer num2, AnimationConfig animationConfig, BackGround backGround) {
        this.previewLoadingTexts = list;
        this.previewRetryTexts = list2;
        this.loadingTimeDuration = l;
        this.moreDetailText = str;
        this.moreDetailAction = num;
        this.seeMoreConfig = top1SeeMoreButtonConfig;
        this.maxHeight = d;
        this.labelText = str2;
        this.searchingSources = list3;
        this.landingRetryToastText = str3;
        this.landingRetryText = str4;
        this.seeMoreOptimize = bool;
        this.isRejectedAnswer = bool2;
        this.sourceStyle = num2;
        this.animationConfig = animationConfig;
        this.backGround = backGround;
    }
}
