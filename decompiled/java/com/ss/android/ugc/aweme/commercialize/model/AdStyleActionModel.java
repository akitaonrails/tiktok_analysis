package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideConfig;
import com.ss.android.ugc.aweme.feed.model.ad.AdOneStopLandingPageConfig;
import com.ss.android.ugc.aweme.feed.model.ad.LandingPageAppInterceptorConfig;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AdStyleActionModel implements Serializable {

    @C09CT("comment_channel_config")
    public final CommentChannelConfig commentChannelConfig;

    @C09CT("corner_radius")
    public final CornerRadiusActionModel cornerRadius;

    @C09CT("drama_block_ad_config")
    public final DramaBlockingAdModel dramaBlockingAdConfig;

    @C09CT("external_guide_config")
    public final AdExternalGuideConfig externalGuideConfig;

    @C09CT("iab_small_window_config")
    public final IabSmallWindowConfig iabSmallWindowConfig;

    @C09CT("jump_target_page_config")
    public final JumpTargetPageConfig jumpTargetPageConfig;

    @C09CT("landing_page_app_interceptor_config")
    public final LandingPageAppInterceptorConfig landingPageAppInterceptorConfig;

    @C09CT("landing_page_config")
    public final AdOneStopLandingPageConfig landingPageConfig;

    @C09CT("landing_page_survey")
    public final LandingPageSurveyModel landingPageSurvey;

    @C09CT("like_effect")
    public final LikeEffectModel likeEffect;

    @C09CT("logo_spotlight_info")
    public final LogoSpotlightInfo logoSpotlightInfo;

    @C09CT("open_landing_page_config")
    public final OpenLandingPageConfigModel openLandingPageConfig;

    public AdStyleActionModel() {
        this(null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public AdStyleActionModel(OpenLandingPageConfigModel openLandingPageConfigModel, LikeEffectModel likeEffectModel, JumpTargetPageConfig jumpTargetPageConfig, LogoSpotlightInfo logoSpotlightInfo, LandingPageAppInterceptorConfig landingPageAppInterceptorConfig, AdExternalGuideConfig adExternalGuideConfig, AdOneStopLandingPageConfig adOneStopLandingPageConfig, DramaBlockingAdModel dramaBlockingAdModel, IabSmallWindowConfig iabSmallWindowConfig, CommentChannelConfig commentChannelConfig, CornerRadiusActionModel cornerRadiusActionModel, LandingPageSurveyModel landingPageSurveyModel) {
        this.openLandingPageConfig = openLandingPageConfigModel;
        this.likeEffect = likeEffectModel;
        this.jumpTargetPageConfig = jumpTargetPageConfig;
        this.logoSpotlightInfo = logoSpotlightInfo;
        this.landingPageAppInterceptorConfig = landingPageAppInterceptorConfig;
        this.externalGuideConfig = adExternalGuideConfig;
        this.landingPageConfig = adOneStopLandingPageConfig;
        this.dramaBlockingAdConfig = dramaBlockingAdModel;
        this.iabSmallWindowConfig = iabSmallWindowConfig;
        this.commentChannelConfig = commentChannelConfig;
        this.cornerRadius = cornerRadiusActionModel;
        this.landingPageSurvey = landingPageSurveyModel;
    }
}
