package com.bytedance.router.mapping;

import com.bytedance.pipo.stellar.base.interceptor.StellarInterceptor;
import com.bytedance.pipo.ttpay.onboarding.TTPayOnBoardingInterceptor;
import com.bytedance.pipo.ttpay.recharge.util.RechargeInterceptor;
import com.bytedance.router.IInterceptorInitializer;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.aigc.aiplayground.navigate.AIVideoToolInterceptor;
import com.ss.android.ugc.aweme.aigc.offline.push.system.AIGCOfflineRouteInterceptor;
import com.ss.android.ugc.aweme.autofill.iab.TtopAutofillInterceptor;
import com.ss.android.ugc.aweme.compliance.privacy.route.ContactsAndLocationRedirectInterceptor;
import com.ss.android.ugc.aweme.compliance.privacy.route.PrivacySettingsMainRedirectInterceptor;
import com.ss.android.ugc.aweme.component.bio.router.BiometricEnrollInterceptor;
import com.ss.android.ugc.aweme.component.guide.InfoCollectGuideInterceptor;
import com.ss.android.ugc.aweme.external.router.AIGCMiddlePageInterceptor;
import com.ss.android.ugc.aweme.external.router.AIPortraitCustomizeTabVEPluginInterceptor;
import com.ss.android.ugc.aweme.external.router.AIPortraitDetailVEPluginInterceptor;
import com.ss.android.ugc.aweme.external.router.AIPortraitTabVEPluginInterceptor;
import com.ss.android.ugc.aweme.external.router.CameoCloudDraftListVEPluginInterceptor;
import com.ss.android.ugc.aweme.favorites.business.music.MusicCollectionRouteInterceptor;
import com.ss.android.ugc.aweme.favorites.business.music.MusicDetailFromFavoriteInterceptor;
import com.ss.android.ugc.aweme.inteceptor.AnalyticsDetailInterceptor;
import com.ss.android.ugc.aweme.inteceptor.PhotoAnalyticsDetailInterceptor;
import com.ss.android.ugc.aweme.minis.route.MinisRouteInterceptor;
import com.ss.android.ugc.aweme.notification.DiggListRouterInterceptor;
import com.ss.android.ugc.aweme.ogc.news.NewsRouterInterceptor;
import com.ss.android.ugc.aweme.openauthorize.DeeplinkAuthorizeParseInterceptor;
import com.ss.android.ugc.aweme.openauthorize.OpenAuthorizeParseInterceptor;
import com.ss.android.ugc.aweme.pipo.register.RefundSilentRegisterInterceptor;
import com.ss.android.ugc.aweme.poi.claim.route.PoiClaimInterceptor;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailPageInterceptor;
import com.ss.android.ugc.aweme.poi.map.PoiMapPageInterceptor;
import com.ss.android.ugc.aweme.poi.osp.PoiOrderSubmitInterceptor;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewPageInterceptor;
import com.ss.android.ugc.aweme.poi.search.PoiSearchPageInterceptor;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.dishes.PoiDishesGalleryInterceptor;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.reviews.PoiReviewsGalleryInterceptor;
import com.ss.android.ugc.aweme.poi.videopublish.retag.PoiRequestAwemeInterceptor;
import com.ss.android.ugc.aweme.router.StartTemplatePreviewInterceptor;
import com.ss.android.ugc.aweme.router.StartUseTemplateInterceptor;
import com.ss.android.ugc.aweme.series.common.interceptor.SeriesInterceptor;
import com.ss.android.ugc.aweme.series.deeplink.DramaTabRouterInterceptor;
import com.ss.android.ugc.aweme.series.innerfeed.interceptor.SeriesInnerFeedInterceptor;
import com.ss.android.ugc.aweme.series.innerfeed.interceptor.SeriesInnerFeedMonitorInterceptor;
import com.ss.android.ugc.aweme.setting.experiment.InboxMsgInterceptor;
import com.ss.android.ugc.aweme.setting.experiment.MarketInterceptor;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.push.MixStudioReadyInterceptor;
import com.ss.android.ugc.aweme.story.route.StoryDetailInterceptor;
import com.ss.android.ugc.aweme.texttoimage.TextImageAIGCInterceptor;
import com.ss.android.ugc.aweme.verify.bio.BioVerifyInterceptor;
import com.ss.android.ugc.gamora.editorpro.creationflow.scheme.EditorProUriRootHandler;
import com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcAvatarInterceptor;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public class SmartRouterInterceptor implements IInterceptorInitializer {
    @Override // com.bytedance.router.IInterceptorInitializer
    public void initAssignInterceptors(Map<String, IInterceptor> map) {
        map.put("AIPortraitCustomizeTabVEPluginInterceptor", new AIPortraitCustomizeTabVEPluginInterceptor());
        map.put("AIPortraitDetailVEPluginInterceptor", new AIPortraitDetailVEPluginInterceptor());
        map.put("AIPortraitTabVEPluginInterceptor", new AIPortraitTabVEPluginInterceptor());
        map.put("AnalyticsDetailInterceptor", new AnalyticsDetailInterceptor());
        map.put("BioVerifyInterceptor", new BioVerifyInterceptor());
        map.put("BiometricEnrollRouter", new BiometricEnrollInterceptor());
        map.put("CameoCloudDraftListVEPluginInterceptor", new CameoCloudDraftListVEPluginInterceptor());
        map.put("ContactsAndLocationRedirectInterceptor", new ContactsAndLocationRedirectInterceptor());
        map.put("DeeplinkAuthorizeParseInterceptor", new DeeplinkAuthorizeParseInterceptor());
        map.put("DiggListRouter_Interceptor", new DiggListRouterInterceptor());
        map.put("DramaTabRouterInterceptor", new DramaTabRouterInterceptor());
        map.put("InboxMsgInterceptor", new InboxMsgInterceptor());
        map.put("InfoCollectRouter", new InfoCollectGuideInterceptor());
        map.put("MarketInterceptor", new MarketInterceptor());
        map.put("MixStudioReadyInterceptor", new MixStudioReadyInterceptor());
        map.put("MusicCollectPrivacyInterceptor", new MusicCollectionRouteInterceptor());
        map.put("MusicDetailFromFavoriteInterceptor", new MusicDetailFromFavoriteInterceptor());
        map.put("OpenAuthorizeParseInterceptor", new OpenAuthorizeParseInterceptor());
        map.put("PaidContentInterceptor", new SeriesInterceptor());
        map.put("PhotoAnalyticsDetailInterceptor", new PhotoAnalyticsDetailInterceptor());
        map.put("PoiClaimInterceptor", new PoiClaimInterceptor());
        map.put("PoiDetailPageInterceptor", new PoiDetailPageInterceptor());
        map.put("PoiDishesGalleryInterceptor", new PoiDishesGalleryInterceptor());
        map.put("PoiMapPageInterceptor", new PoiMapPageInterceptor());
        map.put("PoiOrderSubmitInterceptor", new PoiOrderSubmitInterceptor());
        map.put("PoiRequestAwemeInterceptor", new PoiRequestAwemeInterceptor());
        map.put("PoiReviewPageInterceptor", new PoiReviewPageInterceptor());
        map.put("PoiReviewsGalleryInterceptor", new PoiReviewsGalleryInterceptor());
        map.put("PoiSearchPageInterceptor", new PoiSearchPageInterceptor());
        map.put("PrivacySettingsMainRedirectInterceptor", new PrivacySettingsMainRedirectInterceptor());
        map.put("ProfileAigcAvatarInterceptor", new ProfileAigcAvatarInterceptor());
        map.put("RefundSilentRegisterInterceptor", new RefundSilentRegisterInterceptor());
        map.put("SeriesInnerFeedInterceptor", new SeriesInnerFeedInterceptor());
        map.put("SeriesInnerFeedMonitorInterceptor", new SeriesInnerFeedMonitorInterceptor());
        map.put("StartTemplatePreviewInterceptor", new StartTemplatePreviewInterceptor());
        map.put("StartUseTemplateInterceptor", new StartUseTemplateInterceptor());
        map.put("TTPayOnBoardingRouter", new TTPayOnBoardingInterceptor());
        map.put("ai_live_photo_middle_page_interceptor", new AIGCMiddlePageInterceptor());
        map.put("text_image_aigc_interceptor", new TextImageAIGCInterceptor());
    }

    @Override // com.bytedance.router.IInterceptorInitializer
    public void initInterceptors(List<IInterceptor> list) {
        list.add(new AIVideoToolInterceptor());
        list.add(new NewsRouterInterceptor());
        list.add(new TtopAutofillInterceptor());
        list.add(new MinisRouteInterceptor());
        list.add(new AIGCOfflineRouteInterceptor());
        list.add(new RechargeInterceptor());
        list.add(new StoryDetailInterceptor());
        list.add(new StellarInterceptor());
        list.add(new EditorProUriRootHandler());
    }

    public void initSafeInterceptors(List<IInterceptor> list) {
    }
}
