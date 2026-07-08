package com.ss.android.ugc.aweme.services;

import X.AbstractC1387200mCc;
import X.C01GW;
import X.C06MM;
import X.C08FF;
import X.C0C5P;
import X.C0WZX;
import X.C0XGR;
import X.C0XQ7;
import X.C0XQS;
import X.C0XQT;
import X.C0XR9;
import X.C0XTR;
import X.C10SN;
import X.C10SP;
import X.C10SV;
import X.C1514430pVp;
import X.C1701330uNH;
import X.C1906580ziK;
import X.C1C7U;
import X.C20684815ws;
import X.C2097908Jt;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2254308sP;
import X.C2344009Gk;
import X.C259800zU;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC19241510Pl;
import X.EnumC19242110Pr;
import X.InterfaceC2044707zh;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ILoginService;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.account.login.prevlogin.PrevLoginPlatformService;
import com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.journey.INewUserJourneyService;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.plugin.personalizednuj.PersonalizedNUJV2Data;
import com.ss.android.ugc.aweme.settings.DynamicMandatoryLoginRegionConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class MandatoryLoginService implements IMandatoryLoginService {
    public String forcedLoginReason;
    public boolean hasRequestComplianceApi;
    public final C01GW hybridABForcedLogin$delegate;
    public final Keva keva;
    public boolean loggedInitialMandatoryLoginDecision;
    public boolean loggedInitialNujMandatoryLoginDecision;
    public final C01GW runtimeLogHelper$delegate;
    public boolean skipLoginForTest;
    public static final Companion Companion = new Companion();
    public static final int $stable = 8;

    public static final class Companion {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class HybridABForcedLogin {
            public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
            public static final /* synthetic */ HybridABForcedLogin[] $VALUES;
            public static final C0028Companion Companion;
            public static final Map<Integer, HybridABForcedLogin> map;
            public final int value;
            public static final HybridABForcedLogin CONTROL = new HybridABForcedLogin("CONTROL", 0, 0);
            public static final HybridABForcedLogin FORCE_LOGIN = new HybridABForcedLogin("FORCE_LOGIN", 1, 1);
            public static final HybridABForcedLogin CONTROL_AAB = new HybridABForcedLogin("CONTROL_AAB", 2, 2);

            public static final /* synthetic */ HybridABForcedLogin[] $values() {
                return new HybridABForcedLogin[]{CONTROL, FORCE_LOGIN, CONTROL_AAB};
            }

            public static InterfaceC2044707zh<HybridABForcedLogin> getEntries() {
                return $ENTRIES;
            }

            static {
                HybridABForcedLogin[] hybridABForcedLoginArr$values = $values();
                $VALUES = hybridABForcedLoginArr$values;
                $ENTRIES = new C2254308sP(hybridABForcedLoginArr$values);
                Companion = new C0028Companion();
                HybridABForcedLogin[] hybridABForcedLoginArrValues = values();
                int iLIZIZ = C2097908Jt.LIZIZ(hybridABForcedLoginArrValues.length);
                LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
                for (HybridABForcedLogin hybridABForcedLogin : hybridABForcedLoginArrValues) {
                    linkedHashMap.put(Integer.valueOf(hybridABForcedLogin.value), hybridABForcedLogin);
                }
                map = linkedHashMap;
            }

            public static HybridABForcedLogin[] values() {
                return (HybridABForcedLogin[]) $VALUES.clone();
            }

            public final int getValue() {
                return this.value;
            }

            /* JADX INFO: renamed from: com.ss.android.ugc.aweme.services.MandatoryLoginService$Companion$HybridABForcedLogin$Companion, reason: collision with other inner class name */
            public static final class C0028Companion {
                public final HybridABForcedLogin getValue(int i) {
                    HybridABForcedLogin hybridABForcedLogin = HybridABForcedLogin.map.get(Integer.valueOf(i));
                    if (hybridABForcedLogin == null) {
                        return HybridABForcedLogin.CONTROL;
                    }
                    return hybridABForcedLogin;
                }
            }

            public static HybridABForcedLogin valueOf(String str) {
                return (HybridABForcedLogin) C08FF.LIZ(HybridABForcedLogin.class, str);
            }

            public HybridABForcedLogin(String str, int i, int i2) {
                this.value = i2;
            }
        }
    }

    private final boolean isMockPopup() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.IMandatoryLoginService
    public boolean disableForTest() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.IMandatoryLoginService
    public void skipLoginForTest() {
        this.skipLoginForTest = true;
    }

    private final Companion.HybridABForcedLogin getHybridABForcedLogin() {
        return (Companion.HybridABForcedLogin) this.hybridABForcedLogin$delegate.getValue();
    }

    private final C10SP getRuntimeLogHelper() {
        return (C10SP) this.runtimeLogHelper$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.IMandatoryLoginService
    public Bundle getLoginActivityBundle() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_fullscreen_dialog", true);
        C786410Ut5.LJJJI("enter_from", "cold_launch", bundle);
        C786410Ut5.LJJJI("enter_method", "reopen", bundle);
        bundle.putBoolean("is_skippable_dialog", !enableForcedLogin(false));
        return bundle;
    }

    @Override // com.ss.android.ugc.aweme.IMandatoryLoginService
    public boolean shouldShowLoginTabFirst() {
        IAccountService iAccountService;
        AccountUserService accountUserServiceLJIIJ;
        IAccountService iAccountService2 = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        return ((!Intrinsics.LJFF("US", iAccountService2 != null ? iAccountService2.getStoreRegionUpperCase() : null) || (iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null)) == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null || accountUserServiceLJIIJ.isLogin()) && new PrevLoginPlatformService().LJFF() == C0XR9.NONE) ? false : true;
    }

    public MandatoryLoginService() {
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIILL(StateOwner.LL);
        this.keva = Keva.getRepo("mandatory_login_repo");
        this.hybridABForcedLogin$delegate = C452501pT.LIZIZ(new MandatoryLoginService$hybridABForcedLogin$2(this));
        this.runtimeLogHelper$delegate = C452501pT.LIZIZ(new MandatoryLoginService$runtimeLogHelper$2());
    }

    @Override // com.ss.android.ugc.aweme.IMandatoryLoginService
    public String getForcedLoginReason() {
        return this.forcedLoginReason;
    }

    @Override // com.ss.android.ugc.aweme.IMandatoryLoginService
    public boolean getHasRequestComplianceApi() {
        return this.hasRequestComplianceApi;
    }

    private final Companion.HybridABForcedLogin isSmartForceLogin(boolean z) {
        List<IPluginService.PluginData> currentPluginListPluginData;
        IPluginService.PluginDataWrapper pluginDataWrapper;
        PersonalizedNUJV2Data personalizedNUJV2Data;
        PersonalizedNUJV2Data personalizedNUJV2Data2;
        Boolean bool;
        int i = this.keva.getInt("smart_forced_login", -1);
        if (i < 0) {
            if (z) {
                IPluginService iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
                IPluginService.PluginData pluginData = null;
                boolean z2 = true;
                if (iPluginService != null && (currentPluginListPluginData = iPluginService.getCurrentPluginListPluginData()) != null) {
                    Iterator<IPluginService.PluginData> it2 = currentPluginListPluginData.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        IPluginService.PluginData next = it2.next();
                        if (next.id == EnumC19241510Pl.PERSONALIZED_NUJ_V2_DATA.getValue()) {
                            pluginData = next;
                            break;
                        }
                    }
                    IPluginService.PluginData pluginData2 = pluginData;
                    if (pluginData2 != null && Intrinsics.LJFF(pluginData2.showConfig.shouldShow, Boolean.TRUE)) {
                        String str = pluginData2.abExposeVid;
                        if (str != null) {
                            C0C5P.LIZJ().getClass();
                            C0C5P.LIZ(str);
                        }
                        IPluginService.PluginDataWrapper pluginDataWrapper2 = pluginData2.configData;
                        if ((pluginDataWrapper2 == null || (personalizedNUJV2Data2 = pluginDataWrapper2.personalizedNUJV2Data) == null || (bool = personalizedNUJV2Data2.isForceLogin) == null || !bool.booleanValue()) && ((pluginDataWrapper = pluginData2.configData) == null || (personalizedNUJV2Data = pluginDataWrapper.personalizedNUJV2Data) == null || personalizedNUJV2Data.smartLoginType != EnumC19242110Pr.FORCE_LOGIN.getValue())) {
                            z2 = false;
                        }
                        logSmartLoginResultExpo(pluginData2);
                        if (z2) {
                            Keva keva = this.keva;
                            Companion.HybridABForcedLogin hybridABForcedLogin = Companion.HybridABForcedLogin.FORCE_LOGIN;
                            keva.storeInt("smart_forced_login", hybridABForcedLogin.getValue());
                            return hybridABForcedLogin;
                        }
                        Keva keva2 = this.keva;
                        Companion.HybridABForcedLogin hybridABForcedLogin2 = Companion.HybridABForcedLogin.CONTROL;
                        keva2.storeInt("smart_forced_login", hybridABForcedLogin2.getValue());
                        return hybridABForcedLogin2;
                    }
                }
                Keva keva3 = this.keva;
                Companion.HybridABForcedLogin hybridABForcedLogin3 = Companion.HybridABForcedLogin.CONTROL;
                keva3.storeInt("smart_forced_login", hybridABForcedLogin3.getValue());
                return hybridABForcedLogin3;
            }
            return Companion.HybridABForcedLogin.CONTROL;
        }
        Companion.HybridABForcedLogin hybridABForcedLogin4 = Companion.HybridABForcedLogin.FORCE_LOGIN;
        if (i != hybridABForcedLogin4.getValue()) {
            return Companion.HybridABForcedLogin.CONTROL;
        }
        return hybridABForcedLogin4;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void logSmartLoginResultExpo(com.ss.android.ugc.aweme.plugin.IPluginService.PluginData r7) {
        /*
            r6 = this;
            r3 = 0
            if (r7 == 0) goto L9a
            com.ss.android.ugc.aweme.plugin.IPluginService$PluginDataWrapper r0 = r7.configData
            if (r0 == 0) goto L9a
            com.ss.android.ugc.aweme.plugin.personalizednuj.PersonalizedNUJV2Data r0 = r0.personalizedNUJV2Data
            if (r0 == 0) goto L9a
            int r0 = r0.smartLoginType
        Ld:
            java.lang.String r4 = ""
            switch(r0) {
                case 0: goto L7e;
                case 1: goto L7b;
                case 2: goto L78;
                case 3: goto L92;
                case 4: goto L96;
                case 5: goto L92;
                case 6: goto L75;
                case 7: goto L72;
                default: goto L12;
            }
        L12:
            r5 = r4
        L13:
            if (r7 == 0) goto L2a
            com.ss.android.ugc.aweme.plugin.IPluginService$PluginDataWrapper r0 = r7.configData
            if (r0 == 0) goto L2a
            com.ss.android.ugc.aweme.plugin.personalizednuj.PersonalizedNUJV2Data r0 = r0.personalizedNUJV2Data
            if (r0 == 0) goto L2a
            int r1 = r0.personalizedNUJLabel
            r0 = 1
            if (r1 == r0) goto L6f
            r0 = 2
            if (r1 == r0) goto L6c
            r0 = 3
            if (r1 != r0) goto L2a
            java.lang.String r4 = "row"
        L2a:
            X.09Gk r2 = new X.09Gk
            r2.<init>()
            java.lang.String r0 = "result_type"
            r2.LJIIIIZZ(r0, r4)
            java.lang.String r0 = "result_value"
            r2.LJIIIIZZ(r0, r5)
            java.lang.String r0 = "plugin_repo"
            com.bytedance.keva.Keva r1 = com.bytedance.keva.Keva.getRepo(r0)
            java.lang.String r0 = "reinstall_check_result"
            int r1 = r1.getInt(r0, r3)
            java.lang.String r0 = "device_check_result"
            r2.LIZJ(r1, r0)
            if (r7 == 0) goto L6a
            com.ss.android.ugc.aweme.plugin.IPluginService$PluginDataWrapper r0 = r7.configData
            if (r0 == 0) goto L6a
            com.ss.android.ugc.aweme.plugin.personalizednuj.PersonalizedNUJV2Data r0 = r0.personalizedNUJV2Data
        L52:
            X.C19242210Ps.LIZ(r2, r0)
            X.C10SV.LIZ(r2)
            java.lang.Boolean r0 = X.C1514430pVp.LIZLLL()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L69
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "smart_login_result_expo"
            X.C20684815ws.LJIILLIIL(r0, r1)
        L69:
            return
        L6a:
            r0 = 0
            goto L52
        L6c:
            java.lang.String r4 = "eea"
            goto L2a
        L6f:
            java.lang.String r4 = "us"
            goto L2a
        L72:
            java.lang.String r5 = "only_consentbox_skipable"
            goto L13
        L75:
            java.lang.String r5 = "agegate_consentbox_skipable"
            goto L13
        L78:
            java.lang.String r5 = "skipable_login"
            goto L13
        L7b:
            java.lang.String r5 = "forced_login"
            goto L13
        L7e:
            if (r7 == 0) goto L96
            com.ss.android.ugc.aweme.plugin.IPluginService$PluginDataWrapper r0 = r7.configData
            if (r0 == 0) goto L96
            com.ss.android.ugc.aweme.plugin.personalizednuj.PersonalizedNUJV2Data r0 = r0.personalizedNUJV2Data
            if (r0 == 0) goto L96
            java.lang.Boolean r1 = r0.shouldTryAgeGate
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L96
        L92:
            java.lang.String r5 = "agegate_consentbox"
            goto L13
        L96:
            java.lang.String r5 = "only_consentbox"
            goto L13
        L9a:
            r0 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.MandatoryLoginService.logSmartLoginResultExpo(com.ss.android.ugc.aweme.plugin.IPluginService$PluginData):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0280  */
    @Override // com.ss.android.ugc.aweme.IMandatoryLoginService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean enableForcedLogin(boolean r26) {
        /*
            Method dump skipped, instruction units count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.MandatoryLoginService.enableForcedLogin(boolean):boolean");
    }

    @Override // com.ss.android.ugc.aweme.IMandatoryLoginService
    public boolean reorderToFront(Activity activity) {
        for (AbstractC1387200mCc abstractC1387200mCc : C1906580ziK.LJII()) {
            if (abstractC1387200mCc.LIZIZ() instanceof SignUpOrLoginActivity) {
                Intent intent = new Intent(activity, (Class<?>) SignUpOrLoginActivity.class);
                intent.setFlags(131072);
                INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_MandatoryLoginService_com_bytedance_router_monitor_page_PageLancet_startActivity(activity, intent);
                C786410Ut5.ae(0, activity, 0);
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.IMandatoryLoginService
    public void setHasRequestComplianceApi(boolean z) {
        this.hasRequestComplianceApi = z;
    }

    @Override // com.ss.android.ugc.aweme.IMandatoryLoginService
    public boolean shouldShowForcedLogin(boolean z) {
        IAccountService iAccountService;
        AccountUserService accountUserServiceLJIIJ;
        if (disableForTest() || (iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null)) == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null || accountUserServiceLJIIJ.isLogin() || !enableForcedLogin(z)) {
            return false;
        }
        return true;
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_MandatoryLoginService_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(Activity activity, Intent intent) {
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtcYnH3zdD6Au1O4/mSOxdPO6QaG2syHAuq8jUjQ==", null));
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_MandatoryLoginService_com_bytedance_router_monitor_page_PageLancet_startActivity(Activity activity, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_MandatoryLoginService_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(activity, intent);
    }

    private final boolean checkForceLoginForBR(String str, long j) {
        if (Intrinsics.LJFF(str, "BR") && j >= 370900) {
            return true;
        }
        return false;
    }

    private final boolean checkDynamicMandatoryLoginRegionSettings(String str, String str2, long j) {
        DynamicMandatoryLoginRegionConfig dynamicMandatoryLoginRegionConfig;
        Integer num;
        int iIntValue;
        if (!Intrinsics.LJFF(str, str2) || (dynamicMandatoryLoginRegionConfig = (DynamicMandatoryLoginRegionConfig) SettingsManager.LIZLLL().LJIIIIZZ("dynamic_mandatory_login_region", DynamicMandatoryLoginRegionConfig.class, C10SN.LIZ)) == null || !Intrinsics.LJFF(dynamicMandatoryLoginRegionConfig.isForceLogin, Boolean.TRUE) || (num = dynamicMandatoryLoginRegionConfig.forceLoginInstallBeforeVersion) == null || (iIntValue = num.intValue()) < 0 || j >= iIntValue) {
            return false;
        }
        return true;
    }

    private final void logNujMandatoryLoginDecision(boolean z, String str, String str2, String str3) {
        if (this.loggedInitialNujMandatoryLoginDecision) {
            return;
        }
        this.loggedInitialNujMandatoryLoginDecision = true;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("priority_region", str2);
        c2344009Gk.LJIIIIZZ("store_region", str3);
        c2344009Gk.LIZJ(z ? 1 : 0, "is_forced_login");
        c2344009Gk.LJIIIIZZ("decision_step", str);
        C10SV.LIZ(c2344009Gk);
        C20684815ws.LJIILLIIL("nuj_mandatory_login_decision", c2344009Gk.LIZ);
    }

    public final C0XQT getLoginPageParams(Activity activity, boolean z, String str, String str2, Bundle bundle, C0XTR c0xtr) {
        Bundle loginActivityBundle = getLoginActivityBundle();
        if (bundle != null) {
            C786410Ut5.LJJIIJZLJL(loginActivityBundle, bundle);
        }
        loginActivityBundle.putBoolean("is_disable_animation", z);
        loginActivityBundle.putBoolean("is_from_login_and_consent", true);
        C0XQS c0xqs = new C0XQS();
        c0xqs.LIZ = activity;
        c0xqs.LIZIZ = str;
        c0xqs.LIZJ = str2;
        c0xqs.LJ = c0xtr;
        c0xqs.LIZLLL = loginActivityBundle;
        return c0xqs.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.IMandatoryLoginService
    public void tryShowMandatoryLoginPage(Activity activity, final boolean z, final String str, final String str2, final Bundle bundle, final C0XTR c0xtr) {
        T tLIZ;
        Activity activityLIZIZ;
        AccountUserService accountUserServiceLJIIJ;
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null && (accountUserServiceLJIIJ = iAccountService.LJIIJ()) != null && accountUserServiceLJIIJ.isLogin()) {
            return;
        }
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = activity;
        if (activity == 0) {
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
                tLIZ = C06MM.LIZ(activityLIZIZ);
            } else {
                tLIZ = 0;
            }
            c259800zU.element = tLIZ;
        }
        T t = c259800zU.element;
        if (t == 0) {
            return;
        }
        ((Activity) t).runOnUiThread(new Runnable() { // from class: com.ss.android.ugc.aweme.services.MandatoryLoginService.tryShowMandatoryLoginPage.1
            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("MandatoryLoginService@b107.tryShowMandatoryLoginPage$1");
                com_ss_android_ugc_aweme_services_MandatoryLoginService$tryShowMandatoryLoginPage$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("MandatoryLoginService@b107.tryShowMandatoryLoginPage$1");
            }

            public final void com_ss_android_ugc_aweme_services_MandatoryLoginService$tryShowMandatoryLoginPage$1__run$___twin___() {
                ILoginService iLoginServiceLIZJ;
                IAccountService iAccountService2 = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
                if (iAccountService2 == null || (iLoginServiceLIZJ = iAccountService2.LIZJ()) == null) {
                    return;
                }
                iLoginServiceLIZJ.showLoginAndRegisterView(MandatoryLoginService.this.getLoginPageParams(c259800zU.element, z, str, str2, bundle, c0xtr));
            }

            public static void com_ss_android_ugc_aweme_services_MandatoryLoginService$tryShowMandatoryLoginPage$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                try {
                    anonymousClass1.com_ss_android_ugc_aweme_services_MandatoryLoginService$tryShowMandatoryLoginPage$1__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
    }

    private final void logMandatoryLoginDecision(boolean z, String str, String str2, String str3, String str4, String str5, boolean z2) {
        if (this.loggedInitialMandatoryLoginDecision) {
            return;
        }
        this.loggedInitialMandatoryLoginDecision = true;
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("first_ever_priority_region", str2);
        c0xgr.LIZLLL("priority_region", str3);
        c0xgr.LIZLLL("first_ever_store_region", str4);
        c0xgr.LIZLLL("store_region", str5);
        c0xgr.LIZ(C1514430pVp.LIZLLL().booleanValue() ? 1 : 0, "is_first_launch");
        c0xgr.LIZ(z2 ? 1 : 0, "is_second_launch");
        c0xgr.LIZ(z ? 1 : 0, "is_forced_login");
        c0xgr.LIZLLL("decision_step", str);
        C20684815ws.LJIILLIIL("mandatory_login_decision", c0xgr.LIZ);
        C10SP runtimeLogHelper = getRuntimeLogHelper();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mandatory_login_decision,    first_ever_priority_region:");
        sbLIZ.append(str2);
        sbLIZ.append("   priority_region:");
        sbLIZ.append(str3);
        sbLIZ.append("   first_ever_store_region:");
        sbLIZ.append(str4);
        sbLIZ.append("   store_region:");
        sbLIZ.append(str5);
        sbLIZ.append("   is_first_launch:");
        sbLIZ.append(C1514430pVp.LIZLLL());
        runtimeLogHelper.LJI("force_login_reason", C2188811AlT.LIZIZ(sbLIZ));
    }

    private final void mandatoryLoginEts(boolean z, String str, String str2, String str3, String str4, String str5, boolean z2, boolean z3) {
        AccountUserService accountUserServiceLJIIJ;
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null && (accountUserServiceLJIIJ = iAccountService.LJIIJ()) != null && !accountUserServiceLJIIJ.isLogin()) {
            logMandatoryLoginDecision(z, str, str2, str3, str4, str5, z2);
        }
        INewUserJourneyService iNewUserJourneyService = (INewUserJourneyService) PluggableExtentionKt.pluggableSpi$default(INewUserJourneyService.class, false, false, false, 14, null);
        if (iNewUserJourneyService != null && iNewUserJourneyService.LJJIJIIJI() == 2 && z3) {
            logNujMandatoryLoginDecision(z, str, str3, str5);
        }
    }
}
