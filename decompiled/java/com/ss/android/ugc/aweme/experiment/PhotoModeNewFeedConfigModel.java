package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C1697810uHb;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class PhotoModeNewFeedConfigModel {

    @C09CT("components_allow")
    public final List<String> allowComponents;

    @C09CT("background_color_style")
    public final int backgroundColorStyle;

    @C09CT("bg_update_interval")
    public final long bgUpdateInterval;

    @C09CT("block_check_color")
    public final boolean blockCheckColor;

    @C09CT("client_filter_component_scene")
    public final List<String> clientFilterComponentScene;

    @C09CT("fetch_background_color_config")
    public final PhotoModePhotoBackgroundGradientConfig colorConfig;

    @C09CT("dotH")
    public final long dotH;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("image_ratio_3_4_opt")
    public final boolean enable34RatioOpt;

    @C09CT("enable_fix_crash")
    public final boolean enableCrashFix;

    @C09CT("enable_cta_adapt")
    public final boolean enableCtaAdapt;

    @C09CT("enable_new_feed_layout_style")
    public final boolean enableNewFeedLayoutStyle;

    @C09CT("performance_enable")
    public final boolean enablePerf;

    @C09CT("enable_perf_track")
    public final boolean enablePerfTrack;

    @C09CT("enable_scaling")
    public final boolean enableScaling;

    @C09CT("enable_track")
    public final boolean enableTrack;

    @C09CT("enable_color_opt")
    public final boolean extractColorOpt;

    @C09CT("fixed_background_color")
    public final String fixedBackgroundColor;

    @C09CT("fling_value")
    public final float flingValue;

    @C09CT("scaled_final_image_anchor_type")
    public final int pagerAnchorType;

    @C09CT("repostH")
    public final long repostH;

    @C09CT("repost_jump_fix")
    public final boolean repostJumpFix;

    @C09CT("ui_delay")
    public final long uiPieceDelayTime;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoModeNewFeedConfigModel)) {
            return false;
        }
        PhotoModeNewFeedConfigModel photoModeNewFeedConfigModel = (PhotoModeNewFeedConfigModel) obj;
        return this.enable == photoModeNewFeedConfigModel.enable && this.enablePerf == photoModeNewFeedConfigModel.enablePerf && this.enable34RatioOpt == photoModeNewFeedConfigModel.enable34RatioOpt && this.enableTrack == photoModeNewFeedConfigModel.enableTrack && this.enableCrashFix == photoModeNewFeedConfigModel.enableCrashFix && this.uiPieceDelayTime == photoModeNewFeedConfigModel.uiPieceDelayTime && this.enablePerfTrack == photoModeNewFeedConfigModel.enablePerfTrack && this.extractColorOpt == photoModeNewFeedConfigModel.extractColorOpt && Float.compare(this.flingValue, photoModeNewFeedConfigModel.flingValue) == 0 && this.enableCtaAdapt == photoModeNewFeedConfigModel.enableCtaAdapt && this.blockCheckColor == photoModeNewFeedConfigModel.blockCheckColor && this.repostJumpFix == photoModeNewFeedConfigModel.repostJumpFix && this.repostH == photoModeNewFeedConfigModel.repostH && this.dotH == photoModeNewFeedConfigModel.dotH && this.bgUpdateInterval == photoModeNewFeedConfigModel.bgUpdateInterval && this.pagerAnchorType == photoModeNewFeedConfigModel.pagerAnchorType && Intrinsics.LJFF(this.clientFilterComponentScene, photoModeNewFeedConfigModel.clientFilterComponentScene) && Intrinsics.LJFF(this.allowComponents, photoModeNewFeedConfigModel.allowComponents) && this.enableNewFeedLayoutStyle == photoModeNewFeedConfigModel.enableNewFeedLayoutStyle && this.enableScaling == photoModeNewFeedConfigModel.enableScaling && this.backgroundColorStyle == photoModeNewFeedConfigModel.backgroundColorStyle && Intrinsics.LJFF(this.fixedBackgroundColor, photoModeNewFeedConfigModel.fixedBackgroundColor) && Intrinsics.LJFF(this.colorConfig, photoModeNewFeedConfigModel.colorConfig);
    }

    public final String toString() {
        return "PhotoModeNewFeedConfigModel(enable=" + this.enable + ", enablePerf=" + this.enablePerf + ", enable34RatioOpt=" + this.enable34RatioOpt + ", enableTrack=" + this.enableTrack + ", enableCrashFix=" + this.enableCrashFix + ", uiPieceDelayTime=" + this.uiPieceDelayTime + ", enablePerfTrack=" + this.enablePerfTrack + ", extractColorOpt=" + this.extractColorOpt + ", flingValue=" + this.flingValue + ", enableCtaAdapt=" + this.enableCtaAdapt + ", blockCheckColor=" + this.blockCheckColor + ", repostJumpFix=" + this.repostJumpFix + ", repostH=" + this.repostH + ", dotH=" + this.dotH + ", bgUpdateInterval=" + this.bgUpdateInterval + ", pagerAnchorType=" + this.pagerAnchorType + ", clientFilterComponentScene=" + this.clientFilterComponentScene + ", allowComponents=" + this.allowComponents + ", enableNewFeedLayoutStyle=" + this.enableNewFeedLayoutStyle + ", enableScaling=" + this.enableScaling + ", backgroundColorStyle=" + this.backgroundColorStyle + ", fixedBackgroundColor=" + this.fixedBackgroundColor + ", colorConfig=" + this.colorConfig + ')';
    }

    public PhotoModeNewFeedConfigModel() {
        this(false, false, true, true, true, 1500L, true, true, -1.0f, true, true, true, 28L, 23L, 30L, 0, C1697810uHb.LJIIJJI("homepage_hot", "personal_homepage", "publish_preview"), null, false, false, 0, "#FFD4D4D4", new PhotoModePhotoBackgroundGradientConfig(true, true, 0, 1.0f, 0.0f, 0.0f, 0.0f, 0.01f, 0.87f, 1.0f, 0.0f));
    }

    public final int hashCode() {
        int iZ2 = ((((((((((((((((((((((((((((((C786410Ut5.Z2(this.enable) * 31) + C786410Ut5.Z2(this.enablePerf)) * 31) + C786410Ut5.Z2(this.enable34RatioOpt)) * 31) + C786410Ut5.Z2(this.enableTrack)) * 31) + C786410Ut5.Z2(this.enableCrashFix)) * 31) + C786410Ut5.Y2(this.uiPieceDelayTime)) * 31) + C786410Ut5.Z2(this.enablePerfTrack)) * 31) + C786410Ut5.Z2(this.extractColorOpt)) * 31) + Float.floatToIntBits(this.flingValue)) * 31) + C786410Ut5.Z2(this.enableCtaAdapt)) * 31) + C786410Ut5.Z2(this.blockCheckColor)) * 31) + C786410Ut5.Z2(this.repostJumpFix)) * 31) + C786410Ut5.Y2(this.repostH)) * 31) + C786410Ut5.Y2(this.dotH)) * 31) + C786410Ut5.Y2(this.bgUpdateInterval)) * 31) + this.pagerAnchorType) * 31;
        List<String> list = this.clientFilterComponentScene;
        int iHashCode = (iZ2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.allowComponents;
        int iHashCode2 = (((((((iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31) + C786410Ut5.Z2(this.enableNewFeedLayoutStyle)) * 31) + C786410Ut5.Z2(this.enableScaling)) * 31) + this.backgroundColorStyle) * 31;
        String str = this.fixedBackgroundColor;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.colorConfig.hashCode();
    }

    public PhotoModeNewFeedConfigModel(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j, boolean z6, boolean z7, float f, boolean z8, boolean z9, boolean z10, long j2, long j3, long j4, int i, List<String> list, List<String> list2, boolean z11, boolean z12, int i2, String str, PhotoModePhotoBackgroundGradientConfig photoModePhotoBackgroundGradientConfig) {
        this.enable = z;
        this.enablePerf = z2;
        this.enable34RatioOpt = z3;
        this.enableTrack = z4;
        this.enableCrashFix = z5;
        this.uiPieceDelayTime = j;
        this.enablePerfTrack = z6;
        this.extractColorOpt = z7;
        this.flingValue = f;
        this.enableCtaAdapt = z8;
        this.blockCheckColor = z9;
        this.repostJumpFix = z10;
        this.repostH = j2;
        this.dotH = j3;
        this.bgUpdateInterval = j4;
        this.pagerAnchorType = i;
        this.clientFilterComponentScene = list;
        this.allowComponents = list2;
        this.enableNewFeedLayoutStyle = z11;
        this.enableScaling = z12;
        this.backgroundColorStyle = i2;
        this.fixedBackgroundColor = str;
        this.colorConfig = photoModePhotoBackgroundGradientConfig;
    }
}
