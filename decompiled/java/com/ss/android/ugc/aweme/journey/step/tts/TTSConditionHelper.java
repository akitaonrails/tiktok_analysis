package com.ss.android.ugc.aweme.journey.step.tts;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C09CT;
import X.C09JN;
import X.C0DMM;
import X.C0S4U;
import X.C0X52;
import X.C0XQ7;
import X.C11NZ;
import X.C11S5;
import X.C19248410Sc;
import X.C19248710Sf;
import X.C19315910hZ;
import X.C19EG;
import X.C452501pT;
import X.InterfaceC1501160pAQ;
import com.bytedance.router.SmartRouter;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.journey.step.tts.TTSConditionHelper;
import com.ss.android.ugc.aweme.launcher.service.appsflyer.IAppsflyerApi;
import com.ss.android.ugc.aweme.profile.model.TTMallTabRelatedUserInfo;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class TTSConditionHelper {
    public static int LIZIZ;
    public static final TTSConditionHelper LIZ = new TTSConditionHelper();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1714));

    public interface LandingPageConfigApi {
        @InterfaceC1501160pAQ("tiktok/v1/landing_page/config")
        C11NZ<C0X52<LandingPageConfigResponse>> getLandingPageConfig();
    }

    public static void LIZ() {
        if (Intrinsics.LJFF(((IAppsflyerApi) ServiceManager.get().getService(IAppsflyerApi.class)).LJFF(), "ug")) {
            ((LandingPageConfigApi) LIZJ.getValue()).getLandingPageConfig().LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLJLI(new C09JN() { // from class: X.0CQE
                @Override // X.C09JN
                public final void accept(Object obj) {
                    int iIntValue;
                    C1C7U.LIZ("TTSConditionHelper@1360.judgeUseTTSAfterAgegate$dispose$1");
                    TTSConditionHelper.LandingPageConfigResponse landingPageConfigResponse = (TTSConditionHelper.LandingPageConfigResponse) ((C0X52) obj).LIZIZ;
                    TTSConditionHelper tTSConditionHelper = TTSConditionHelper.LIZ;
                    Integer num = landingPageConfigResponse.config;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    tTSConditionHelper.getClass();
                    TTSConditionHelper.LIZIZ = iIntValue;
                    C1C7U.LIZIZ("TTSConditionHelper@1360.judgeUseTTSAfterAgegate$dispose$1");
                }
            });
        }
    }

    public static void LIZIZ() {
        MainActivityScope mainActivityScopeLIZJ;
        HomeTabAbility homeTabAbilityLIZ;
        MainActivityScope mainActivityScopeLIZJ2;
        HomeTabAbility homeTabAbilityLIZ2;
        TTMallTabRelatedUserInfo tTMallTabRelatedUserInfo;
        String strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        if (strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId == null || strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId.length() == 0) {
            C19248410Sc.LIZ.getClass();
            C19248410Sc.LIZIZ("no_device_id");
            return;
        }
        String storeRegionUpperCase = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).getStoreRegionUpperCase();
        C19315910hZ.LIZ.getClass();
        if (!(!C19315910hZ.LJIIIZ.contains(storeRegionUpperCase)) && !((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin() && LIZIZ <= 0) {
            C19248410Sc.LIZ.getClass();
            C19248410Sc.LIZIZ("no_adult");
            return;
        }
        if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin() && ((tTMallTabRelatedUserInfo = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().mallTabUserInfo) == null || !tTMallTabRelatedUserInfo.isMallTabDisplay())) {
            C19248410Sc.LIZ.getClass();
            C19248410Sc.LIZIZ("ec_not_enable");
            return;
        }
        C19248710Sf c19248710Sf = C19248710Sf.LIZIZ;
        C19EG c19egLJII = c19248710Sf.LJII();
        boolean zZd1 = (c19egLJII == null || (mainActivityScopeLIZJ2 = C0S4U.LIZJ(c19egLJII)) == null || (homeTabAbilityLIZ2 = C0DMM.LIZ(mainActivityScopeLIZJ2)) == null) ? false : homeTabAbilityLIZ2.zd1();
        C19EG c19egLJII2 = c19248710Sf.LJII();
        String strLJIIIIZZ = (zZd1 || ((c19egLJII2 == null || (mainActivityScopeLIZJ = C0S4U.LIZJ(c19egLJII2)) == null || (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) == null) ? false : homeTabAbilityLIZ.dR("Shop"))) ? ((IAppsflyerApi) ServiceManager.get().getService(IAppsflyerApi.class)).LJIIIIZZ() : ((IAppsflyerApi) ServiceManager.get().getService(IAppsflyerApi.class)).LIZIZ();
        if (strLJIIIIZZ == null || strLJIIIIZZ.length() == 0) {
            C19248410Sc.LIZ.getClass();
            C19248410Sc.LIZIZ("deeplink_empty");
        } else {
            C19248410Sc.LIZ.getClass();
            C19248410Sc.LIZIZ(null);
            SmartRouter.buildRoute(c19248710Sf.LJII(), strLJIIIIZZ).open();
        }
    }

    public static final class LandingPageConfigResponse {

        @C09CT("config")
        public final Integer config;

        public LandingPageConfigResponse() {
            this(null);
        }

        public LandingPageConfigResponse(Integer num) {
            this.config = num;
        }
    }
}
