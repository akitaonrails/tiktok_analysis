package com.ss.android.ugc.aweme.commerce.anywhere;

import X.AbstractC1387200mCc;
import X.C086I;
import X.C0PRW;
import X.C0PS4;
import X.C0PSJ;
import X.C0PYE;
import X.C0Q8L;
import X.C0QDS;
import X.C0QEQ;
import X.C0QER;
import X.C0QJN;
import X.C0WZX;
import X.C0XPD;
import X.C0XQ7;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1398110mUD;
import X.C1611210s1v;
import X.C1701330uNH;
import X.C1906580ziK;
import X.C1ER1;
import X.C2204961BRm;
import X.C2214201BlK;
import X.C2421209eE;
import X.C650940Pg4;
import X.C650950Pg5;
import X.C650960Pg6;
import X.C664000Q2s;
import X.C664030Q2v;
import X.C669560QOc;
import X.C672110QXx;
import X.C786410Ut5;
import X.C844470XAv;
import X.InterfaceC1603190roz;
import X.InterfaceC816150Vzx;
import Y.ARunnableS113S0100000_13;
import Y.ARunnableS124S0100000_24;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.anchor.service.IAnchorListService;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public class AnyDoorRouterImpl implements InterfaceC816150Vzx {
    public static final C1611210s1v Companion = new Object() { // from class: X.0s1v
    };

    private final Context getContext() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LIZ();
    }

    public final void cleanSplashVideo() {
        ((ISplashAdService) ServiceManager.get().getService(ISplashAdService.class)).LJIJ();
    }

    public final Class<?> getComposePbModelClass() {
        return ComposePbAndJson.class;
    }

    private final void checkSplashData(Context context) {
        ISplashAdService iSplashAdService = (ISplashAdService) ServiceManager.get().getService(ISplashAdService.class);
        if (iSplashAdService != null) {
            iSplashAdService.LJIILLIIL();
        }
    }

    private final void fetchAnchorList(Context context) {
        ((IAnchorListService) ServiceManager.get().getService(IAnchorListService.class)).LIZ();
    }

    private final void refreshStartAtlasAccount(Context context) {
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIJ("Restart after 3s");
            c1389890mGx.LJIIJJI();
        }
        C0XPD.LIZIZ(C2214201BlK.LJFF(), "Anywhere", "click_repost_button", null, null);
    }

    private final void refreshUserInfo(Context context) {
        if (C0XQ7.LJFF().isLogin()) {
            C0XQ7.LJFF().LJI();
            IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
            Boolean bool = Boolean.FALSE;
            iAccountUserServiceLJFF.LJJIII(bool, bool);
        }
    }

    private final void synSetting(Context context) {
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIJ("coming soon..");
            c1389890mGx.LJIIJJI();
        }
    }

    public final Class<?> getModelByPath(String str) {
        if (Intrinsics.LJFF(str, "feed")) {
            return FeedItemList.class;
        }
        return null;
    }

    public final void preloadFeed(String str) {
        ISplashAdService iSplashAdService;
        try {
            Gson gson = ((GsonProvider) ServiceManager.get().getService(GsonProvider.class)).getGson();
            if (gson == null) {
                gson = new Gson();
            }
            FeedItemList feedItemList = (FeedItemList) gson.LJII(str, FeedItemList.class);
            if (feedItemList != null && !C086I.LIZIZ(feedItemList.preloadAds) && (iSplashAdService = (ISplashAdService) ServiceManager.get().getService(ISplashAdService.class)) != null) {
                C844470XAv.LIZ.getClass();
                iSplashAdService.LJIJJ(C844470XAv.LIZ(), feedItemList.preloadAds);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void tryConsumeSplash$commercialize_from_main_release(Context context) {
        checkSplashData(context);
    }

    public final void tryOpenCommerceChallenge$commercialize_from_main_release(Context context) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//challenge/detail/1572018483564545");
        smartRouteBuildRoute.withParam("is_commerce", "1");
        smartRouteBuildRoute.open();
    }

    public final void tryOpenCommonChallenge$commercialize_from_main_release(Context context) {
        SmartRouter.buildRoute(context, "aweme://challenge/detail/0?hashtag=any_door&is_commerce=0").open();
    }

    public final void tryOpenDiscovery$commercialize_from_main_release(Context context) {
        tryOpenSearchPage$commercialize_from_main_release(context);
    }

    public final void tryOpenMyProfile$commercialize_from_main_release(Context context) {
        SmartRouter.buildRoute(context, "aweme://user/profile?sec_uid=MS4wLjABAAAATmLP1Fku8Ml_6vNt554lml47qGBxkB7GOy0Fob8TvhI").open();
        refreshUserInfo(context);
    }

    public final void tryOpenPublishPage$commercialize_from_main_release(final Context context) {
        final RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.creationId("");
        builder.shootWay("direct_shoot");
        builder.groupId(C1398110mUD.LIZIZ);
        builder.enterFrom(ComplianceServiceProvider.LJIL().LJIILJJIL());
        builder.fromMain(true);
        builder.musicType(1);
        builder.translationType(3);
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService(context, "direct_shoot", new IExternalService.ServiceLoadCallback() { // from class: X.0s27
            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onDismiss() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onFailed() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onOK() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j) {
                asyncAVService.uiService().recordService().startRecord(context, builder.build());
            }
        });
    }

    public final void tryOpenSearchPage$commercialize_from_main_release(Context context) {
        C0QEQ c0qeqNewBuilder = C0QER.Companion.newBuilder();
        c0qeqNewBuilder.LIZ = "homepage_hot";
        c0qeqNewBuilder.LJIIL = "";
        C0QER c0qerLJ = c0qeqNewBuilder.LJ();
        C1ER1.LIZIZ.B(new C0QDS(context, new SearchResultParam(), c0qerLJ, new C650950Pg5(new C650960Pg6(new C664000Q2s("homepage_hot", null, true, true, "", "", 0, 0, false, "", "", ""), new C0Q8L(null, null, null), new C664030Q2v(null, null, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE), new C650940Pg4(null, "", Boolean.FALSE, ""), new C0PYE(0L), new C669560QOc(new C672110QXx(null, null, null, null, null), false, "", false, false, "", "", "", "", "", "", "", null, "", null, "", null, null, false, null, null, false, null, "", null), new C0QJN("", null, null, null, null, null)), new C0PSJ(new C0PRW(0, null, null, null, null, null, null, null, false, null, false, null, 4095, null), new C0PS4(-1, 0, "", new LinkedHashMap(), "", "", ""))), "", null));
    }

    public final void tryOpenSearchResultPage$commercialize_from_main_release(Context context) {
        SmartRouter.buildRoute(context, "//search?keyword=FPX NB&display_keyword=search&enter_from=anywheredoor&search_from=anywheredoor").open();
    }

    public final void tryOpenUserProfile$commercialize_from_main_release(Context context) {
        SmartRouter.buildRoute(context, "aweme://user/profile?sec_uid=MS4wLjABAAAATmLP1Fku8Ml_6vNt554lml47qGBxkB7GOy0Fob8TvhI").open();
        refreshUserInfo(context);
    }

    public final void tryRefreshAndPopFeedPage$commercialize_from_main_release(Context context) {
        ActivityStack.getActivityStack();
        AbstractC1387200mCc[] abstractC1387200mCcArrLJII = C1906580ziK.LJII();
        int length = abstractC1387200mCcArrLJII.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            AbstractC1387200mCc abstractC1387200mCc = abstractC1387200mCcArrLJII[i];
            if (abstractC1387200mCc.LIZ instanceof InterfaceC1603190roz) {
                Activity activityLIZIZ = abstractC1387200mCc.LIZIZ();
                if (activityLIZIZ != null) {
                    Intent intentLIZIZ = C2421209eE.LIZIZ(getContext());
                    intentLIZIZ.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
                    INVOKEVIRTUAL_com_ss_android_ugc_aweme_commerce_anywhere_AnyDoorRouterImpl_com_bytedance_router_monitor_page_PageLancet_startActivity(getContext(), intentLIZIZ);
                    C786410Ut5.LJLIIL(500L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS124S0100000_24(activityLIZIZ, 17));
                    return;
                }
            } else {
                i++;
            }
        }
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIJ("【AnyWhereDoor】Main Activity Not Found!");
            c1389890mGx.LJIIJJI();
        }
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_commerce_anywhere_AnyDoorRouterImpl_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(Context context, Intent intent) {
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHDlq8w/zHKvXP93haOCOExRjTuH/ViptiXD6J/", null));
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_commerce_anywhere_AnyDoorRouterImpl_com_bytedance_router_monitor_page_PageLancet_startActivity(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_commerce_anywhere_AnyDoorRouterImpl_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(context, intent);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void startRoute(String str, Context context) {
        switch (str.hashCode()) {
            case -1849961962:
                if (str.equals("my_profile")) {
                    tryOpenMyProfile$commercialize_from_main_release(context);
                }
                break;
            case -1157333237:
                if (str.equals("normal_challenge")) {
                    tryOpenCommonChallenge$commercialize_from_main_release(context);
                }
                break;
            case -906336856:
                if (str.equals("search")) {
                    tryOpenSearchPage$commercialize_from_main_release(context);
                }
                break;
            case -895866265:
                if (str.equals("splash")) {
                    tryConsumeSplash$commercialize_from_main_release(context);
                }
                break;
            case -169343402:
                if (str.equals("shutdown")) {
                    Activity activityLIZ = C1388190mED.LIZ(context);
                    if (activityLIZ != null) {
                        C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                        c1389890mGx.LJIIJ("Please relogin startAtlas account");
                        c1389890mGx.LJIIJJI();
                    }
                    C786410Ut5.LJLIIL(3000L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS113S0100000_13(context, 93));
                }
                break;
            case -121207376:
                if (str.equals("discovery")) {
                    tryOpenDiscovery$commercialize_from_main_release(context);
                }
                break;
            case 3138974:
                if (str.equals("feed")) {
                    tryRefreshAndPopFeedPage$commercialize_from_main_release(context);
                }
                break;
            case 461177713:
                if (str.equals("search_query")) {
                    tryOpenSearchResultPage$commercialize_from_main_release(context);
                }
                break;
            case 1210177285:
                if (str.equals("anchor_request")) {
                    fetchAnchorList(context);
                }
                break;
            case 1216225589:
                if (str.equals("user_profile")) {
                    tryOpenUserProfile$commercialize_from_main_release(context);
                }
                break;
            case 1402633315:
                if (str.equals("challenge")) {
                    tryOpenCommerceChallenge$commercialize_from_main_release(context);
                }
                break;
            case 1434631203:
                if (str.equals("settings")) {
                    synSetting(context);
                }
                break;
            case 1880910712:
                if (str.equals("create_video")) {
                    tryOpenPublishPage$commercialize_from_main_release(context);
                }
                break;
            case 2122459230:
                if (str.equals("star_atlas")) {
                    refreshStartAtlasAccount(context);
                }
                break;
        }
    }
}
