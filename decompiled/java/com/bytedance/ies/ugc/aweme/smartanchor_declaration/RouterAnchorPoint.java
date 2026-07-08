package com.bytedance.ies.ugc.aweme.smartanchor_declaration;

import X.AbstractC1538690q8x;
import X.AbstractC1538890q9H;
import X.C07E6;
import X.C0BVC;
import X.C0N2J;
import X.C0PB5;
import X.C0XQ7;
import X.C0XQS;
import X.C0XQT;
import X.C1207504nx;
import X.C1367960lha;
import X.C1388190mED;
import X.C13BV;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1557990qe5;
import X.C1865310ydl;
import X.C1865320ydm;
import X.C19252910Tv;
import X.C19273410ai;
import X.C1976907ol;
import X.C1EE1;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C279340AxA;
import X.C286730BLr;
import X.C286740BLs;
import X.C290860Bae;
import X.C294800Bh0;
import X.C296250BjL;
import X.C296830BkH;
import X.C854720Xfy;
import X.InterfaceC19274110ap;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.OpenResultCallback;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.RouteManager;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.airemix.api.service.AIRemixRouterInterceptor;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ILoginService;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.ad.ucp.IUcpService;
import com.ss.android.ugc.aweme.app.services.ILauncherService;
import com.ss.android.ugc.aweme.autofill.iab.TtopAutofillInterceptor;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.UcpRouterInterceptor;
import com.ss.android.ugc.aweme.compliance.api.interfaces.IFundraiserService;
import com.ss.android.ugc.aweme.compliance.business.fundraiser.FundraiserInterceptor;
import com.ss.android.ugc.aweme.compliance.privacy.route.ContactsAndLocationRedirectInterceptor;
import com.ss.android.ugc.aweme.compliance.privacy.route.PrivacySettingsMainRedirectInterceptor;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.ChatSetRouter;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPairingRouter;
import com.ss.android.ugc.aweme.detail.route.DetailRouterInterceptor;
import com.ss.android.ugc.aweme.donation.IDonationService;
import com.ss.android.ugc.aweme.donation.detail.DonationInterceptor;
import com.ss.android.ugc.aweme.drama.IDramaInterceptService;
import com.ss.android.ugc.aweme.drama.app.referrer.PineDramaTTReferrerInterceptor;
import com.ss.android.ugc.aweme.dsp.subscribe.schema.MusicLoadingInterceptor;
import com.ss.android.ugc.aweme.ecommerce.debug.IEcomDebugService;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.ecommerce.service.IEcSchemaService;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService;
import com.ss.android.ugc.aweme.ecommerce.ug.deeplink.service.IEcUgDeeplinkService;
import com.ss.android.ugc.aweme.favorites.business.music.MusicCollectionRouteInterceptor;
import com.ss.android.ugc.aweme.favorites.business.music.MusicDetailFromFavoriteInterceptor;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.feed.flexible.IFlexiblePanelService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService;
import com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service;
import com.ss.android.ugc.aweme.im.creative.common.api.navigation.IMCreativeSAFRouteInterceptor;
import com.ss.android.ugc.aweme.im.sdk.common.controller.router.DmRouterInterceptor;
import com.ss.android.ugc.aweme.im.sdk.resourcemanage.DMResourceManagementSchemaInterceptor;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.resourcemanage.IDMResourceManagementService;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import com.ss.android.ugc.aweme.im.whee.ug.impl.interceptor.IMWheeUGRouterAnchorTask;
import com.ss.android.ugc.aweme.inbox.router.BulletinBoardSheetInterceptor;
import com.ss.android.ugc.aweme.inbox.router.BulletinCreateProcessOptInterceptor;
import com.ss.android.ugc.aweme.inbox.router.BulletinEditProcessOptInterceptor;
import com.ss.android.ugc.aweme.inbox.router.BulletinHybridInterceptor;
import com.ss.android.ugc.aweme.inbox.router.MergedNotificationInterceptor;
import com.ss.android.ugc.aweme.inbox.tablet.router.TabletInboxInterceptor;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.settings.TEARouterInterceptor;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.service.IEcommerceInfluencerService;
import com.ss.android.ugc.aweme.inteceptor.AnalyticsDetailInterceptor;
import com.ss.android.ugc.aweme.inteceptor.PhotoAnalyticsDetailInterceptor;
import com.ss.android.ugc.aweme.lemon.router.Lemon8AppIntroInterceptor;
import com.ss.android.ugc.aweme.localservice.preload.LSCommonPageInterceptor;
import com.ss.android.ugc.aweme.minis.route.MinisRouteInterceptor;
import com.ss.android.ugc.aweme.music.MusicThirdPartyInterceptor;
import com.ss.android.ugc.aweme.music.addtodsp.spi.IMusicAddToDspService;
import com.ss.android.ugc.aweme.music.dsp.dm.router.MusicDsp2ttDmInterceptor;
import com.ss.android.ugc.aweme.nows.router.NowsHostDfRouteInterceptor;
import com.ss.android.ugc.aweme.offline.ec.ug.debug.IEcUgDebugService;
import com.ss.android.ugc.aweme.ogc.news.INewsService;
import com.ss.android.ugc.aweme.outreach.dispersion.spi.OutreachOperationService;
import com.ss.android.ugc.aweme.pipo.cashier.IPIPOCashierService;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperExService;
import com.ss.android.ugc.aweme.poi.map.PoiMapPageInterceptor;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewPageInterceptor;
import com.ss.android.ugc.aweme.poi.search.PoiSearchPageInterceptor;
import com.ss.android.ugc.aweme.poi.thirdparty.PoiThirdPartyDisclaimerInterceptor;
import com.ss.android.ugc.aweme.poi.thirdparty.PoiThirdPartyDisclaimerLayerInterceptor;
import com.ss.android.ugc.aweme.poi.thirdparty.PoiThirdPartyInterceptor;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.dishes.PoiDishesGalleryInterceptor;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.reviews.PoiReviewsGalleryInterceptor;
import com.ss.android.ugc.aweme.poi.videopublish.retag.PoiRequestAwemeInterceptor;
import com.ss.android.ugc.aweme.qrcode.aab.QRCodeVERouterIntercept;
import com.ss.android.ugc.aweme.reducemotion.ReduceMotionSmartRouteInterceptor;
import com.ss.android.ugc.aweme.router.AccountInterceptor;
import com.ss.android.ugc.aweme.router.ChallengeUrlInterceptor;
import com.ss.android.ugc.aweme.router.DraftRouterInterceptor;
import com.ss.android.ugc.aweme.router.ExploreSchemaInterceptor;
import com.ss.android.ugc.aweme.router.FeedbackSubmitInterceptor;
import com.ss.android.ugc.aweme.router.LiveHighlightGeneralPopupInterceptor;
import com.ss.android.ugc.aweme.router.LivePreviewPageInterceptor;
import com.ss.android.ugc.aweme.router.LoginRouterInterceptor;
import com.ss.android.ugc.aweme.router.MixDetailInterceptor;
import com.ss.android.ugc.aweme.router.OpenChatExtInterceptor;
import com.ss.android.ugc.aweme.router.RecordPermissionInterceptor;
import com.ss.android.ugc.aweme.router.RecordPermissionInterceptorNew;
import com.ss.android.ugc.aweme.router.RouterOpen;
import com.ss.android.ugc.aweme.router.SignupOrLoginActivityInterceptorForET;
import com.ss.android.ugc.aweme.router.StartTemplatePreviewInterceptor;
import com.ss.android.ugc.aweme.router.StartUseTemplateInterceptor;
import com.ss.android.ugc.aweme.router.UploadActionInterceptor;
import com.ss.android.ugc.aweme.router.UrlPathParamsInterceptor;
import com.ss.android.ugc.aweme.router.pgc.PgcSubContainerInterceptor;
import com.ss.android.ugc.aweme.router.pgc.PgcWebcastSubscribeInterceptor;
import com.ss.android.ugc.aweme.saas.ecommerce.service.IECommerceTTDependencyService;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.entry.core.viewmodel.SearchInterceptor;
import com.ss.android.ugc.aweme.search.entry.core.viewmodel.SearchRootPageNodeInterceptor;
import com.ss.android.ugc.aweme.search.performance.core.config.LandingPagePreloadConfig;
import com.ss.android.ugc.aweme.search.performance.core.utils.SearchLandingPagePreloadHelper;
import com.ss.android.ugc.aweme.search.thirdpartylandingpage.core.viewmodel.SearchThirdPartyInterceptor;
import com.ss.android.ugc.aweme.series.common.interceptor.SeriesInterceptor;
import com.ss.android.ugc.aweme.series.deeplink.DramaTabRouterInterceptor;
import com.ss.android.ugc.aweme.series.innerfeed.interceptor.SeriesInnerFeedInterceptor;
import com.ss.android.ugc.aweme.series.innerfeed.interceptor.SeriesInnerFeedMonitorInterceptor;
import com.ss.android.ugc.aweme.service.IAnalyticsDetailService;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.aweme.service.INearbyFeedService;
import com.ss.android.ugc.aweme.service.IPaidContentNavigatorService;
import com.ss.android.ugc.aweme.service.IPhotoAnalyticsDetailService;
import com.ss.android.ugc.aweme.service.IPostModeService;
import com.ss.android.ugc.aweme.service.appdiff.IPineDramaInnerFeedRouterService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.IRouterService;
import com.ss.android.ugc.aweme.services.external.ITangramService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.setting.services.IAppUpdateService;
import com.ss.android.ugc.aweme.socialavatar.api.mixstudio.MixStudioRouteService;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.push.MixStudioReadyInterceptor;
import com.ss.android.ugc.aweme.spi.IPluggableFallbackService;
import com.ss.android.ugc.aweme.tako.common.router.TakoChatPageInterceptor;
import com.ss.android.ugc.aweme.texttoimage.ITextToImageService;
import com.ss.android.ugc.aweme.texttoimage.OpenTextImageInterceptor;
import com.ss.android.ugc.aweme.texttoimage.TextImageAIGCInterceptor;
import com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewPageInterceptor;
import com.ss.android.ugc.aweme.vibefeed.feed.entrance.VibeFeedRouteInterceptor;
import com.ss.android.ugc.aweme.vibefeed.service.IVibeEntranceService;
import com.ss.android.ugc.tiktok.addyours.service.IAddYoursService;
import com.ss.android.ugc.tiktok.pns.activitycenter.api.IActivityCenterService;
import com.ss.android.ugc.tiktok.pns.activitycenter.watchhistory.WatchHistoryInterceptor;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes29.dex */
public class RouterAnchorPoint implements InterfaceC19274110ap {
    public static InterfaceC19274110ap getPoint() {
        return new RouterAnchorPoint();
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [X.0XQu] */
    @Override // X.InterfaceC19274110ap
    public void run(Object obj) {
        DMResourceManagementSchemaInterceptor dMResourceManagementSchemaInterceptorLJIIJ;
        IInterceptor iInterceptorR2;
        IInterceptor iInterceptorLJIIL;
        MusicCollectionRouteInterceptor musicCollectionRouteInterceptorLJI;
        MusicDetailFromFavoriteInterceptor musicDetailFromFavoriteInterceptorLJJJJIZL;
        RouterOpen routerOpenLIZ;
        IInterceptor iInterceptorStartCreateTemplateRouter;
        IInterceptor iInterceptorTangramRouter;
        DonationInterceptor donationInterceptorLIZJ;
        FundraiserInterceptor fundraiserInterceptorLJ;
        WatchHistoryInterceptor watchHistoryInterceptorLIZIZ;
        DmRouterInterceptor dmRouterInterceptorLJIJI;
        IInterceptor iInterceptorOpenEditPageRouter;
        IInterceptor iInterceptorOpenTextEditRouter;
        VibeFeedRouteInterceptor vibeFeedRouteInterceptorLJIIJ;
        SeriesInnerFeedMonitorInterceptor seriesInnerFeedMonitorInterceptorLIZ;
        SeriesInterceptor seriesInterceptorLIZLLL;
        SeriesInnerFeedInterceptor seriesInnerFeedInterceptorLJI;
        DramaTabRouterInterceptor dramaTabRouterInterceptorLJ;
        IInterceptor iInterceptorLJIIIIZZ;
        AnalyticsDetailInterceptor analyticsDetailInterceptorLIZIZ;
        PhotoAnalyticsDetailInterceptor photoAnalyticsDetailInterceptorLIZIZ;
        IInterceptor iInterceptorGu;
        C13BV c13bvLIZ;
        List<IInterceptor> listLIZ;
        List<IInterceptor> listLIZIZ;
        OpenResultCallback openResultCallbackLIZ;
        List<IInterceptor> listLIZ2;
        TextImageAIGCInterceptor textImageAIGCInterceptorLJIIZILJ;
        OpenTextImageInterceptor openTextImageInterceptorLJJIIZI;
        List<IInterceptor> listLIZ3;
        IAVPublishService iAVPublishServicePublishService;
        IInterceptor draftNotificationDeeplinkInterceptor;
        List<IInterceptor> listLIZ4;
        UcpRouterInterceptor interceptor;
        MixStudioReadyInterceptor interceptor2;
        C13BV c13bvLIZ2;
        IRouterService iRouterServiceRouterService;
        IRouterService iRouterServiceRouterService2;
        List<IInterceptor> listLIZ5;
        List<IInterceptor> listLIZLLL;
        List<IInterceptor> listLJJIJIL;
        List<IInterceptor> listLJIJJLI;
        List<IInterceptor> listLIZ6;
        List<IInterceptor> eCommerceRouterInterceptors;
        List<IInterceptor> listLIZJ;
        IIMChatService imChatService;
        IRouterService iRouterServiceRouterService3;
        List<IInterceptor> listLJI;
        List<IInterceptor> eComPipeRouterInterceptors;
        List<IInterceptor> listLIZIZ2;
        IInterceptor iInterceptor;
        SmartRouter.addInterceptor(new AIRemixRouterInterceptor());
        SmartRouter.addInterceptor(new TtopAutofillInterceptor());
        new C19273410ai();
        if (C1207504nx.LIZ() && !C19273410ai.LIZ) {
            synchronized (C19273410ai.class) {
                try {
                    if (!C19273410ai.LIZ) {
                        SmartRouter.addInterceptor(new ContactsAndLocationRedirectInterceptor());
                        SmartRouter.addInterceptor(new PrivacySettingsMainRedirectInterceptor());
                        C19273410ai.LIZ = true;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        SmartRouter.addInterceptor(new FamilyPairingRouter());
        SmartRouter.addInterceptor(new ChatSetRouter());
        IFeedDebugService iFeedDebugService = (IFeedDebugService) PluggableExtentionKt.pluggableSpi$default(IFeedDebugService.class, false, false, false, 14, null);
        if (iFeedDebugService != null) {
            iFeedDebugService.LJIILIIL();
        }
        Object objLJJJJLL = C1EE1.LIZIZ.LJJJJLL();
        IInterceptor iInterceptorLIZJ = null;
        if ((objLJJJJLL instanceof IInterceptor) && (iInterceptor = (IInterceptor) objLJJJJLL) != null) {
            SmartRouter.addInterceptor(iInterceptor);
        }
        SmartRouter.addInterceptor(new DetailRouterInterceptor());
        SmartRouter.addInterceptor(new PineDramaTTReferrerInterceptor());
        SmartRouter.addInterceptor(new MusicLoadingInterceptor());
        new IMWheeUGRouterAnchorTask().anchor(obj);
        SmartRouter.addInterceptor(new BulletinHybridInterceptor());
        SmartRouter.addInterceptor(new BulletinCreateProcessOptInterceptor());
        SmartRouter.addInterceptor(new BulletinBoardSheetInterceptor());
        if (C296830BkH.LIZ()) {
            SmartRouter.addInterceptor(new BulletinEditProcessOptInterceptor());
        }
        SmartRouter.addInterceptor(new MergedNotificationInterceptor());
        if (C19252910Tv.LIZIZ.LIZLLL().LJIIL().LJI()) {
            SmartRouter.addInterceptor(new TabletInboxInterceptor());
        }
        SmartRouter.addInterceptor(new TEARouterInterceptor());
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        AbstractC1538890q9H abstractC1538890q9H = new AbstractC1538890q9H() { // from class: X.0kYy
            @Override // X.AbstractC1538680q8w
            public final void LIZ(SparkContext sparkContext) {
                sparkContext.LJJJJZ(new C1339400kxW(0));
            }

            @Override // X.AbstractC1538680q8w
            public final boolean LIZJ(Uri uri) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                if (uri != null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "tea_drag_list");
                } else {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
                }
                return Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "1");
            }
        };
        c1537900q7g.getClass();
        C1541950qED.LJ.add(abstractC1538890q9H);
        C1537900q7g.LJIIIIZZ(new AbstractC1538690q8x() { // from class: X.0kZ1
            @Override // X.AbstractC1538690q8x
            public final String LJI() {
                return "ecom_influence";
            }

            @Override // X.AbstractC1538690q8x
            public final void LJ(SparkContext sparkContext, String str) {
                super.LJ(sparkContext, str);
                sparkContext.LJJJJZ(new C1339400kxW(1));
            }
        });
        SmartRouter.addInterceptor(new Lemon8AppIntroInterceptor());
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisAnchorTask, anchor:");
        sbLIZ.append(obj);
        C2188811AlT.LIZIZ(sbLIZ);
        SmartRouter.addInterceptor(new MinisRouteInterceptor());
        SmartRouter.addInterceptor(new MusicDsp2ttDmInterceptor());
        SmartRouter.addInterceptor(new MusicThirdPartyInterceptor());
        SmartRouter.addInterceptor(new PoiThirdPartyInterceptor());
        SmartRouter.addInterceptor(new PoiThirdPartyDisclaimerInterceptor());
        SmartRouter.addInterceptor(new PoiThirdPartyDisclaimerLayerInterceptor());
        if (C286740BLs.LIZ() || C286730BLr.LIZ() || ((Number) C279340AxA.LIZ.getValue()).intValue() == 1 || C0BVC.LIZ()) {
            SmartRouter.addInterceptor(new LSCommonPageInterceptor());
        }
        SmartRouter.addInterceptor(new PoiSearchPageInterceptor());
        SmartRouter.addInterceptor(new PoiMapPageInterceptor());
        SmartRouter.addInterceptor(new PoiReviewPageInterceptor());
        SmartRouter.addInterceptor(new PoiRequestAwemeInterceptor());
        SmartRouter.addInterceptor(new PoiDishesGalleryInterceptor());
        SmartRouter.addInterceptor(new PoiReviewsGalleryInterceptor());
        SmartRouter.addInterceptor(new QRCodeVERouterIntercept());
        SmartRouter.addInterceptor(new UrlPathParamsInterceptor());
        SmartRouter.addInterceptor(new DraftRouterInterceptor());
        SmartRouter.addInterceptor(new PgcSubContainerInterceptor());
        SmartRouter.addInterceptor(new PgcWebcastSubscribeInterceptor());
        SmartRouter.addInterceptor(new MixDetailInterceptor());
        SmartRouter.addInterceptor(new AccountInterceptor());
        SmartRouter.addInterceptor(new SignupOrLoginActivityInterceptorForET());
        System.out.println("Cofig will add challenge");
        SmartRouter.addInterceptor(new ChallengeUrlInterceptor());
        IDMResourceManagementService iDMResourceManagementService = (IDMResourceManagementService) PluggableExtentionKt.pluggableSpi$default(IDMResourceManagementService.class, false, false, false, 14, null);
        if (iDMResourceManagementService != null) {
            dMResourceManagementSchemaInterceptorLJIIJ = iDMResourceManagementService.LJIIJ();
        } else {
            dMResourceManagementSchemaInterceptorLJIIJ = null;
        }
        SmartRouter.addInterceptor(dMResourceManagementSchemaInterceptorLJIIJ);
        IEcSchemaService iEcSchemaService = (IEcSchemaService) PluggableExtentionKt.pluggableSpi$default(IEcSchemaService.class, false, false, false, 14, null);
        if (iEcSchemaService != null && (listLIZIZ2 = iEcSchemaService.LIZIZ()) != null) {
            Iterator<IInterceptor> it2 = listLIZIZ2.iterator();
            while (it2.hasNext()) {
                SmartRouter.addInterceptor(it2.next());
            }
        }
        IECommerceService iECommerceService = (IECommerceService) PluggableExtentionKt.pluggableSpi$default(IECommerceService.class, false, false, false, 14, null);
        if (iECommerceService != null && (eComPipeRouterInterceptors = iECommerceService.getEComPipeRouterInterceptors()) != null) {
            Iterator<IInterceptor> it3 = eComPipeRouterInterceptors.iterator();
            while (it3.hasNext()) {
                SmartRouter.addInterceptor(it3.next());
            }
        }
        IFriendsFeedService iFriendsFeedService = (IFriendsFeedService) PluggableExtentionKt.pluggableSpi$default(IFriendsFeedService.class, false, false, false, 14, null);
        if (iFriendsFeedService != null) {
            iInterceptorR2 = iFriendsFeedService.r2();
        } else {
            iInterceptorR2 = null;
        }
        SmartRouter.addInterceptor(iInterceptorR2);
        INearbyFeedService iNearbyFeedService = (INearbyFeedService) PluggableExtentionKt.pluggableSpi$default(INearbyFeedService.class, false, false, false, 14, null);
        if (iNearbyFeedService != null) {
            iInterceptorLJIIL = iNearbyFeedService.LJIIL();
        } else {
            iInterceptorLJIIL = null;
        }
        SmartRouter.addInterceptor(iInterceptorLJIIL);
        IFavoriteService iFavoriteService = (IFavoriteService) PluggableExtentionKt.pluggableSpi$default(IFavoriteService.class, false, false, false, 14, null);
        if (iFavoriteService != null) {
            musicCollectionRouteInterceptorLJI = iFavoriteService.LJI();
        } else {
            musicCollectionRouteInterceptorLJI = null;
        }
        SmartRouter.addInterceptor(musicCollectionRouteInterceptorLJI);
        IFavoriteService iFavoriteService2 = (IFavoriteService) PluggableExtentionKt.pluggableSpi$default(IFavoriteService.class, false, false, false, 14, null);
        if (iFavoriteService2 != null) {
            musicDetailFromFavoriteInterceptorLJJJJIZL = iFavoriteService2.LJJJJIZL();
        } else {
            musicDetailFromFavoriteInterceptorLJJJJIZL = null;
        }
        SmartRouter.addInterceptor(musicDetailFromFavoriteInterceptorLJJJJIZL);
        IECommerceShowcaseService iECommerceShowcaseService = (IECommerceShowcaseService) PluggableExtentionKt.pluggableSpi$default(IECommerceShowcaseService.class, false, false, false, 14, null);
        if (iECommerceShowcaseService != null && (listLJI = iECommerceShowcaseService.LJI()) != null) {
            Iterator<IInterceptor> it4 = listLJI.iterator();
            while (it4.hasNext()) {
                SmartRouter.addInterceptor(it4.next());
            }
        }
        ILauncherService iLauncherService = (ILauncherService) PluggableExtentionKt.pluggableSpi$default(ILauncherService.class, false, false, false, 14, null);
        if (iLauncherService != null) {
            routerOpenLIZ = iLauncherService.LIZ();
        } else {
            routerOpenLIZ = null;
        }
        SmartRouter.addInterceptor(routerOpenLIZ);
        SmartRouter.addInterceptor(new UrlPathParamsInterceptor());
        SmartRouter.addInterceptor(new LivePreviewPageInterceptor());
        SmartRouter.addInterceptor(new LiveHighlightGeneralPopupInterceptor());
        SmartRouter.addInterceptor(new RecordPermissionInterceptor());
        SmartRouter.addInterceptor(new RecordPermissionInterceptorNew());
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService != null && (iRouterServiceRouterService3 = iExternalService.routerService()) != null) {
            iInterceptorStartCreateTemplateRouter = iRouterServiceRouterService3.startCreateTemplateRouter();
        } else {
            iInterceptorStartCreateTemplateRouter = null;
        }
        SmartRouter.addInterceptor(iInterceptorStartCreateTemplateRouter);
        if (C290860Bae.LIZ()) {
            SmartRouter.addInterceptor(new StartTemplatePreviewInterceptor());
            SmartRouter.addInterceptor(new StartUseTemplateInterceptor());
        }
        SmartRouter.addInterceptor(new UploadActionInterceptor());
        ITangramService iTangramService = (ITangramService) PluggableExtentionKt.pluggableSpi$default(ITangramService.class, false, false, false, 14, null);
        if (iTangramService != null) {
            iInterceptorTangramRouter = iTangramService.tangramRouter();
        } else {
            iInterceptorTangramRouter = null;
        }
        SmartRouter.addInterceptor(iInterceptorTangramRouter);
        SmartRouter.addInterceptor(new DraftRouterInterceptor());
        SmartRouter.addInterceptor(new OpenChatExtInterceptor());
        SmartRouter.addInterceptor(new LoginRouterInterceptor());
        IDonationService iDonationService = (IDonationService) PluggableExtentionKt.pluggableSpi$default(IDonationService.class, false, false, false, 14, null);
        if (iDonationService != null) {
            donationInterceptorLIZJ = iDonationService.LIZJ();
        } else {
            donationInterceptorLIZJ = null;
        }
        SmartRouter.addInterceptor(donationInterceptorLIZJ);
        IFundraiserService iFundraiserService = (IFundraiserService) PluggableExtentionKt.pluggableSpi$default(IFundraiserService.class, false, false, false, 14, null);
        if (iFundraiserService != null) {
            fundraiserInterceptorLJ = iFundraiserService.LJ();
        } else {
            fundraiserInterceptorLJ = null;
        }
        SmartRouter.addInterceptor(fundraiserInterceptorLJ);
        IActivityCenterService iActivityCenterService = (IActivityCenterService) PluggableExtentionKt.pluggableSpi$default(IActivityCenterService.class, false, false, false, 14, null);
        if (iActivityCenterService != null) {
            watchHistoryInterceptorLIZIZ = iActivityCenterService.LIZIZ();
        } else {
            watchHistoryInterceptorLIZIZ = null;
        }
        SmartRouter.addInterceptor(watchHistoryInterceptorLIZIZ);
        SmartRouter.addInterceptor(new FeedbackSubmitInterceptor());
        IIMService iIMService = (IIMService) PluggableExtentionKt.pluggableSpi$default(IIMService.class, false, false, false, 12, null);
        if (iIMService != null && (imChatService = iIMService.getImChatService()) != null) {
            dmRouterInterceptorLJIJI = imChatService.LJIJI();
        } else {
            dmRouterInterceptorLJIJI = null;
        }
        SmartRouter.addInterceptor(dmRouterInterceptorLJIJI);
        IECommerceTTDependencyService iECommerceTTDependencyService = (IECommerceTTDependencyService) PluggableExtentionKt.pluggableSpi$default(IECommerceTTDependencyService.class, false, false, false, 14, null);
        if (iECommerceTTDependencyService != null && (listLIZJ = iECommerceTTDependencyService.LIZJ()) != null) {
            Iterator<IInterceptor> it5 = listLIZJ.iterator();
            while (it5.hasNext()) {
                SmartRouter.addInterceptor(it5.next());
            }
        }
        IECommerceService iECommerceService2 = (IECommerceService) PluggableExtentionKt.pluggableSpi$default(IECommerceService.class, false, false, false, 14, null);
        if (iECommerceService2 != null && (eCommerceRouterInterceptors = iECommerceService2.getECommerceRouterInterceptors()) != null) {
            Iterator<IInterceptor> it6 = eCommerceRouterInterceptors.iterator();
            while (it6.hasNext()) {
                SmartRouter.addInterceptor(it6.next());
            }
        }
        IEcUgDeeplinkService iEcUgDeeplinkService = (IEcUgDeeplinkService) PluggableExtentionKt.pluggableSpi$default(IEcUgDeeplinkService.class, false, false, false, 14, null);
        if (iEcUgDeeplinkService != null && (listLIZ6 = iEcUgDeeplinkService.LIZ()) != null) {
            Iterator<IInterceptor> it7 = listLIZ6.iterator();
            while (it7.hasNext()) {
                SmartRouter.addInterceptor(it7.next());
            }
        }
        IEcUgDebugService iEcUgDebugService = (IEcUgDebugService) PluggableExtentionKt.pluggableSpi$default(IEcUgDebugService.class, false, false, false, 14, null);
        if (iEcUgDebugService != null) {
            iEcUgDebugService.LIZ();
        }
        IECommerceMallService iECommerceMallService = (IECommerceMallService) PluggableExtentionKt.pluggableSpi$default(IECommerceMallService.class, false, false, false, 14, null);
        if (iECommerceMallService != null && (listLJIJJLI = iECommerceMallService.LJIJJLI()) != null) {
            Iterator<IInterceptor> it8 = listLJIJJLI.iterator();
            while (it8.hasNext()) {
                SmartRouter.addInterceptor(it8.next());
            }
        }
        IEcomSearchService iEcomSearchService = (IEcomSearchService) PluggableExtentionKt.pluggableSpi$default(IEcomSearchService.class, false, false, false, 14, null);
        if (iEcomSearchService != null && (listLJJIJIL = iEcomSearchService.LJJIJIL()) != null) {
            Iterator<IInterceptor> it9 = listLJJIJIL.iterator();
            while (it9.hasNext()) {
                SmartRouter.addInterceptor(it9.next());
            }
        }
        IEcommerceInfluencerService iEcommerceInfluencerService = (IEcommerceInfluencerService) PluggableExtentionKt.pluggableSpi$default(IEcommerceInfluencerService.class, false, false, false, 14, null);
        if (iEcommerceInfluencerService != null && (listLIZLLL = iEcommerceInfluencerService.LIZLLL()) != null) {
            Iterator<IInterceptor> it10 = listLIZLLL.iterator();
            while (it10.hasNext()) {
                SmartRouter.addInterceptor(it10.next());
            }
        }
        IAppUpdateService iAppUpdateService = (IAppUpdateService) PluggableExtentionKt.pluggableSpi$default(IAppUpdateService.class, false, false, false, 14, null);
        if (iAppUpdateService != null && (listLIZ5 = iAppUpdateService.LIZ()) != null) {
            Iterator<IInterceptor> it11 = listLIZ5.iterator();
            while (it11.hasNext()) {
                SmartRouter.addInterceptor(it11.next());
            }
        }
        IExternalService iExternalService2 = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService2 != null && (iRouterServiceRouterService2 = iExternalService2.routerService()) != null) {
            iInterceptorOpenEditPageRouter = iRouterServiceRouterService2.openEditPageRouter();
        } else {
            iInterceptorOpenEditPageRouter = null;
        }
        SmartRouter.addInterceptor(iInterceptorOpenEditPageRouter);
        IExternalService iExternalService3 = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService3 != null && (iRouterServiceRouterService = iExternalService3.routerService()) != null) {
            iInterceptorOpenTextEditRouter = iRouterServiceRouterService.openTextEditRouter();
        } else {
            iInterceptorOpenTextEditRouter = null;
        }
        SmartRouter.addInterceptor(iInterceptorOpenTextEditRouter);
        C1367960lha.LIZ.getClass();
        SmartRouter.addInterceptor(C1367960lha.LIZ().LJIILIIL());
        SmartRouter.addInterceptor(C1367960lha.LIZ().LLIIIL());
        SmartRouter.addInterceptor(C1367960lha.LIZ().LLFII());
        IVibeEntranceService iVibeEntranceServiceLIZ = C1557990qe5.LIZ();
        if (iVibeEntranceServiceLIZ != null) {
            vibeFeedRouteInterceptorLJIIJ = iVibeEntranceServiceLIZ.LJIIJ();
        } else {
            vibeFeedRouteInterceptorLJIIJ = null;
        }
        SmartRouter.addInterceptor(vibeFeedRouteInterceptorLJIIJ);
        IPaidContentNavigatorService iPaidContentNavigatorService = (IPaidContentNavigatorService) PluggableExtentionKt.pluggableSpi$default(IPaidContentNavigatorService.class, false, false, false, 14, null);
        if (iPaidContentNavigatorService != null) {
            seriesInnerFeedMonitorInterceptorLIZ = iPaidContentNavigatorService.LIZ();
        } else {
            seriesInnerFeedMonitorInterceptorLIZ = null;
        }
        SmartRouter.addInterceptor(seriesInnerFeedMonitorInterceptorLIZ);
        IPaidContentNavigatorService iPaidContentNavigatorService2 = (IPaidContentNavigatorService) PluggableExtentionKt.pluggableSpi$default(IPaidContentNavigatorService.class, false, false, false, 14, null);
        if (iPaidContentNavigatorService2 != null) {
            seriesInterceptorLIZLLL = iPaidContentNavigatorService2.LIZLLL();
        } else {
            seriesInterceptorLIZLLL = null;
        }
        SmartRouter.addInterceptor(seriesInterceptorLIZLLL);
        IPaidContentNavigatorService iPaidContentNavigatorService3 = (IPaidContentNavigatorService) PluggableExtentionKt.pluggableSpi$default(IPaidContentNavigatorService.class, false, false, false, 14, null);
        if (iPaidContentNavigatorService3 != null) {
            seriesInnerFeedInterceptorLJI = iPaidContentNavigatorService3.LJI();
        } else {
            seriesInnerFeedInterceptorLJI = null;
        }
        SmartRouter.addInterceptor(seriesInnerFeedInterceptorLJI);
        IPaidContentNavigatorService iPaidContentNavigatorService4 = (IPaidContentNavigatorService) PluggableExtentionKt.pluggableSpi$default(IPaidContentNavigatorService.class, false, false, false, 14, null);
        if (iPaidContentNavigatorService4 != null) {
            dramaTabRouterInterceptorLJ = iPaidContentNavigatorService4.LJ();
        } else {
            dramaTabRouterInterceptorLJ = null;
        }
        SmartRouter.addInterceptor(dramaTabRouterInterceptorLJ);
        IPaidContentNavigatorService iPaidContentNavigatorService5 = (IPaidContentNavigatorService) PluggableExtentionKt.pluggableSpi$default(IPaidContentNavigatorService.class, false, false, false, 14, null);
        if (iPaidContentNavigatorService5 != null) {
            iPaidContentNavigatorService5.LJFF();
        }
        SmartRouter.addInterceptor(null);
        IPineDramaInnerFeedRouterService.LIZ.getClass();
        C1865320ydm.LIZIZ.getValue().LIZ();
        SmartRouter.addInterceptor(null);
        IGatekeeperExService.LIZ.getClass();
        C1865310ydl.LIZIZ.getValue().LIZIZ();
        SmartRouter.addInterceptor(null);
        IAddYoursService iAddYoursService = (IAddYoursService) PluggableExtentionKt.pluggableSpi$default(IAddYoursService.class, false, false, false, 14, null);
        if (iAddYoursService != null) {
            iInterceptorLJIIIIZZ = iAddYoursService.LJIIIIZZ();
        } else {
            iInterceptorLJIIIIZZ = null;
        }
        SmartRouter.addInterceptor(iInterceptorLJIIIIZZ);
        IAnalyticsDetailService iAnalyticsDetailService = (IAnalyticsDetailService) PluggableExtentionKt.pluggableSpi$default(IAnalyticsDetailService.class, false, false, false, 14, null);
        if (iAnalyticsDetailService != null) {
            analyticsDetailInterceptorLIZIZ = iAnalyticsDetailService.LIZIZ();
        } else {
            analyticsDetailInterceptorLIZIZ = null;
        }
        SmartRouter.addInterceptor(analyticsDetailInterceptorLIZIZ);
        IPhotoAnalyticsDetailService iPhotoAnalyticsDetailService = (IPhotoAnalyticsDetailService) PluggableExtentionKt.pluggableSpi$default(IPhotoAnalyticsDetailService.class, false, false, false, 14, null);
        if (iPhotoAnalyticsDetailService != null) {
            photoAnalyticsDetailInterceptorLIZIZ = iPhotoAnalyticsDetailService.LIZIZ();
        } else {
            photoAnalyticsDetailInterceptorLIZIZ = null;
        }
        SmartRouter.addInterceptor(photoAnalyticsDetailInterceptorLIZIZ);
        IPostModeService iPostModeService = (IPostModeService) PluggableExtentionKt.pluggableSpi$default(IPostModeService.class, false, false, false, 14, null);
        if (iPostModeService != null) {
            iInterceptorLIZJ = iPostModeService.LIZJ();
        }
        SmartRouter.addInterceptor(iInterceptorLIZJ);
        IEcomDebugService iEcomDebugService = (IEcomDebugService) PluggableExtentionKt.pluggableSpi$default(IEcomDebugService.class, false, false, false, 14, null);
        if (iEcomDebugService != null && (c13bvLIZ2 = iEcomDebugService.LIZ()) != null) {
            Iterator it12 = c13bvLIZ2.iterator();
            while (it12.hasNext()) {
                SmartRouter.addInterceptor((IInterceptor) it12.next());
            }
        }
        MixStudioRouteService mixStudioRouteService = (MixStudioRouteService) PluggableExtentionKt.pluggableSpi$default(MixStudioRouteService.class, false, false, false, 14, null);
        if (mixStudioRouteService != null && (interceptor2 = mixStudioRouteService.getInterceptor()) != null) {
            SmartRouter.addInterceptor(interceptor2);
        }
        IUcpService iUcpService = (IUcpService) PluggableExtentionKt.pluggableSpi$default(IUcpService.class, false, false, false, 14, null);
        if (iUcpService != null && (interceptor = iUcpService.getInterceptor()) != null) {
            SmartRouter.addInterceptor(interceptor);
        }
        IMusicAddToDspService iMusicAddToDspService = (IMusicAddToDspService) PluggableExtentionKt.pluggableSpi$default(IMusicAddToDspService.class, false, false, false, 14, null);
        if (iMusicAddToDspService != null && (listLIZ4 = iMusicAddToDspService.LIZ()) != null) {
            Iterator<IInterceptor> it13 = listLIZ4.iterator();
            while (it13.hasNext()) {
                SmartRouter.addInterceptor(it13.next());
            }
        }
        IExternalService iExternalService4 = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService4 != null && (iAVPublishServicePublishService = iExternalService4.publishService()) != null && (draftNotificationDeeplinkInterceptor = iAVPublishServicePublishService.getDraftNotificationDeeplinkInterceptor()) != null) {
            SmartRouter.addInterceptor(draftNotificationDeeplinkInterceptor);
        }
        IPIPOCashierService iPIPOCashierService = (IPIPOCashierService) PluggableExtentionKt.pluggableSpi$default(IPIPOCashierService.class, false, false, false, 14, null);
        if (iPIPOCashierService != null && (listLIZ3 = iPIPOCashierService.LIZ()) != null) {
            Iterator<IInterceptor> it14 = listLIZ3.iterator();
            while (it14.hasNext()) {
                SmartRouter.addInterceptor(it14.next());
            }
        }
        ITextToImageService iTextToImageService = (ITextToImageService) PluggableExtentionKt.pluggableSpi$default(ITextToImageService.class, false, false, false, 14, null);
        if (iTextToImageService != null && (openTextImageInterceptorLJJIIZI = iTextToImageService.LJJIIZI()) != null) {
            SmartRouter.addInterceptor(openTextImageInterceptorLJJIIZI);
        }
        ITextToImageService iTextToImageService2 = (ITextToImageService) PluggableExtentionKt.pluggableSpi$default(ITextToImageService.class, false, false, false, 14, null);
        if (iTextToImageService2 != null && (textImageAIGCInterceptorLJIIZILJ = iTextToImageService2.LJIIZILJ()) != null) {
            SmartRouter.addInterceptor(textImageAIGCInterceptorLJIIZILJ);
        }
        OutreachOperationService outreachOperationService = (OutreachOperationService) PluggableExtentionKt.pluggableSpi$default(OutreachOperationService.class, false, false, false, 14, null);
        if (outreachOperationService != null && (listLIZ2 = outreachOperationService.LIZ()) != null) {
            Iterator<IInterceptor> it15 = listLIZ2.iterator();
            while (it15.hasNext()) {
                SmartRouter.addInterceptor(it15.next());
            }
        }
        IPluggableFallbackService iPluggableFallbackService = (IPluggableFallbackService) PluggableExtentionKt.pluggableSpi$default(IPluggableFallbackService.class, false, false, false, 14, null);
        if (iPluggableFallbackService != null && (openResultCallbackLIZ = iPluggableFallbackService.LIZ()) != null) {
            RouteManager.getInstance().addGlobalResultCallback(openResultCallbackLIZ);
        }
        INewsService.LIZ.getClass();
        INewsService value = C0N2J.LIZIZ.getValue();
        if (value != null && (listLIZIZ = value.LIZIZ()) != null) {
            Iterator<IInterceptor> it16 = listLIZIZ.iterator();
            while (it16.hasNext()) {
                SmartRouter.addInterceptor(it16.next());
            }
        }
        IFlexiblePanelService iFlexiblePanelService = (IFlexiblePanelService) PluggableExtentionKt.pluggableSpi$default(IFlexiblePanelService.class, false, false, false, 14, null);
        if (iFlexiblePanelService != null && (listLIZ = iFlexiblePanelService.LIZ()) != null) {
            Iterator<IInterceptor> it17 = listLIZ.iterator();
            while (it17.hasNext()) {
                SmartRouter.addInterceptor(it17.next());
            }
        }
        IDramaInterceptService iDramaInterceptService = (IDramaInterceptService) PluggableExtentionKt.pluggableSpi$default(IDramaInterceptService.class, false, false, false, 14, null);
        if (iDramaInterceptService != null && (c13bvLIZ = iDramaInterceptService.LIZ()) != null) {
            Iterator it18 = c13bvLIZ.iterator();
            while (it18.hasNext()) {
                SmartRouter.addInterceptor((IInterceptor) it18.next());
            }
        }
        SmartRouter.addInterceptor(new ReduceMotionSmartRouteInterceptor());
        IFriendsTabV3Service iFriendsTabV3Service = (IFriendsTabV3Service) PluggableExtentionKt.pluggableSpi$default(IFriendsTabV3Service.class, false, false, false, 14, null);
        if (iFriendsTabV3Service != null && (iInterceptorGu = iFriendsTabV3Service.Gu()) != null) {
            SmartRouter.addInterceptor(iInterceptorGu);
        }
        SmartRouter.addInterceptor(new NowsHostDfRouteInterceptor());
        if (C296250BjL.LIZ()) {
            SmartRouter.addInterceptor(new IMCreativeSAFRouteInterceptor());
        }
        if (C294800Bh0.LIZ()) {
            SmartRouter.addInterceptor(new ExploreSchemaInterceptor());
        }
        SmartRouter.addInterceptor(new SearchInterceptor());
        SmartRouter.addInterceptor(new SearchThirdPartyInterceptor());
        if (((LandingPagePreloadConfig) C0PB5.LIZIZ.getValue()).enableTriggerWhenJump) {
            SmartRouter.addInterceptor(new SearchLandingPagePreloadHelper.SearchLandingPagePreloadInterceptor());
        }
        if (((Boolean) C07E6.LIZIZ.getValue()).booleanValue()) {
            SmartRouter.addInterceptor(new SearchRootPageNodeInterceptor());
        }
        SmartRouter.addInterceptor(new TakoChatPageInterceptor());
        SmartRouter.addInterceptor(new TTEPEffectPreviewPageInterceptor());
        final ?? r1 = new Object() { // from class: X.0XQu
        };
        SmartRouter.addInterceptor(new IInterceptor() { // from class: com.ss.android.ugc.aweme.ug.shortcut.ContentPreferenceRouterAnchorTask$anchor$1
            @Override // com.bytedance.router.interceptor.IInterceptor
            public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
                return C1976907ol.LIZ(this, routeIntent);
            }

            @Override // com.bytedance.router.interceptor.IInterceptor
            public final boolean matchInterceptRules(RouteIntent routeIntent) {
                String url;
                if (routeIntent == null || (url = routeIntent.getUrl()) == null || !a0.LJJIIZI(url, "//contentpreference", false)) {
                    return false;
                }
                return true;
            }

            @Override // com.bytedance.router.interceptor.IInterceptor
            public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
                IMandatoryLoginService iMandatoryLoginService;
                Activity activityLIZ;
                ILoginService iLoginServiceLIZJ;
                getClass();
                if (C0XQ7.LJFF().isLogin() || (iMandatoryLoginService = (IMandatoryLoginService) PluggableExtentionKt.pluggableSpi$default(IMandatoryLoginService.class, false, false, false, 14, null)) == null || !iMandatoryLoginService.shouldShowForcedLogin(true)) {
                    return false;
                }
                C854720Xfy c854720Xfy = new C854720Xfy(context, 6);
                Bundle bundle = new Bundle();
                bundle.putBoolean("is_skippable_dialog", true);
                bundle.putBoolean("need_callback", true);
                if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                    C0XQS c0xqs = new C0XQS();
                    c0xqs.LIZ = activityLIZ;
                    c0xqs.LJ = c854720Xfy;
                    c0xqs.LIZLLL = bundle;
                    C0XQT c0xqtLIZ = c0xqs.LIZ();
                    IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
                    if (iAccountService != null && (iLoginServiceLIZJ = iAccountService.LIZJ()) != null) {
                        iLoginServiceLIZJ.showLoginAndRegisterView(c0xqtLIZ);
                    }
                }
                return true;
            }
        });
    }
}
