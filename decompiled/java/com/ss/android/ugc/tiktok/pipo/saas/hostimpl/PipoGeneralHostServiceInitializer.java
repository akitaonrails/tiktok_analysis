package com.ss.android.ugc.tiktok.pipo.saas.hostimpl;

import X.InterfaceC1547600qNK;
import X.InterfaceC1547640qNO;
import X.InterfaceC1713880uhW;
import X.InterfaceC1713900uhY;
import X.InterfaceC1714080uhq;
import X.InterfaceC1716910umP;
import X.InterfaceC1721020ut2;
import X.InterfaceC1722160uus;
import X.InterfaceC1722330uv9;
import X.InterfaceC1722400uvG;
import X.InterfaceC1723340uwm;
import X.InterfaceC1724730uz1;
import X.InterfaceC1954907lD;
import X.InterfaceC790140Uz6;
import Y.ACallableS8S2000000_3;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.webkit.WebView;
import com.bytedance.applog.AppLog;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.i18n.location.api.LocationData;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.TTRetrofit;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPIPOShareConsentService;
import com.ss.android.ugc.aweme.compliance.consent.serviceimpl.PIPOShareConsentServiceImp;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.gecko.GeckoXNetImpl;
import com.ss.android.ugc.aweme.hybridkit.IHybridKitService;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.IPipoOfflineService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS109S1200000_26;
import kotlin.jvm.internal.AwS461S0200000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoGeneralHostServiceInitializer implements InterfaceC1954907lD {
    @Override // X.InterfaceC1954907lD
    public <T> T createService(Class<T> cls) {
        if (Intrinsics.LJFF(cls, InterfaceC1722160uus.class)) {
            return (T) new InterfaceC1722160uus() { // from class: X.0uz8
                @Override // X.InterfaceC1722160uus
                public final void isLocalTest() {
                }

                @Override // X.InterfaceC1722160uus
                public final void isOffline() {
                }

                @Override // X.InterfaceC1722160uus
                public final String LJIIIIZZ() {
                    C844470XAv.LIZ.getClass();
                    return C844470XAv.LJIILJJIL;
                }

                @Override // X.InterfaceC1722160uus
                public final InterfaceC1722140uuq LJIIZILJ() {
                    return new InterfaceC1722140uuq() { // from class: X.0uz9
                        @Override // X.InterfaceC1722140uuq
                        public final int LIZ(Context context) {
                            return C14KQ.LJ(context);
                        }

                        @Override // X.InterfaceC1722140uuq
                        public final int LIZIZ(Context context) {
                            return C14KI.LIZ(context);
                        }
                    };
                }

                @Override // X.InterfaceC1722160uus
                public final int getAppId() {
                    C844470XAv.LIZ.getClass();
                    return C844470XAv.LJIIJ;
                }

                @Override // X.InterfaceC1722160uus
                public final String getAppName() {
                    C844470XAv.LIZ.getClass();
                    String str = C844470XAv.LJ;
                    if (str == null) {
                        return null;
                    }
                    return str;
                }

                @Override // X.InterfaceC1722160uus
                public final Context getApplicationContext() {
                    C844470XAv.LIZ.getClass();
                    return C844470XAv.LIZ();
                }

                @Override // X.InterfaceC1722160uus
                public final String getChannel() {
                    C844470XAv.LIZ.getClass();
                    return C844470XAv.LJIILL;
                }

                @Override // X.InterfaceC1722160uus
                public final C1723470uwz getVersionInfo() {
                    C844470XAv.LIZ.getClass();
                    return new C1723470uwz(C844470XAv.LJFF(), C844470XAv.LJ(), C844470XAv.LIZLLL(), C844470XAv.LIZJ());
                }

                @Override // X.InterfaceC1722160uus
                public final boolean LJIILLIIL() {
                    return C0WYJ.LJJ();
                }

                @Override // X.InterfaceC1722160uus
                public final Application getApplication() {
                    return C1BWL.LIZ();
                }

                @Override // X.InterfaceC1722160uus
                public final String getDeviceId() {
                    return DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
                }

                @Override // X.InterfaceC1722160uus
                public final String getStoreRegionUpperCase() {
                    return ((IAccountService) ServiceManager.get().getService(IAccountService.class)).getStoreRegionUpperCase();
                }

                @Override // X.InterfaceC1722160uus
                public final void isDebug() {
                }

                @Override // X.InterfaceC1722160uus
                public final InterfaceC1724930uzL LJIIIZ(final Context context) {
                    return new InterfaceC1724930uzL(context) { // from class: X.0uzA
                        public final C1233040iBy LIZ;

                        @Override // X.InterfaceC1724930uzL
                        public final void show() {
                            this.LIZ.LIZLLL();
                        }

                        {
                            this.LIZ = new C1233040iBy(context);
                        }

                        @Override // X.InterfaceC1724930uzL
                        public final InterfaceC1724930uzL LIZ(CharSequence charSequence) {
                            this.LIZ.LIZJ(charSequence);
                            return this;
                        }
                    };
                }
            };
        }
        if (Intrinsics.LJFF(cls, InterfaceC1713900uhY.class)) {
            return (T) new InterfaceC1713900uhY() { // from class: X.0vLb
                @Override // X.InterfaceC1713900uhY
                public final String getAppLanguage() {
                    I18nManagerServiceApi i18nManagerServiceApiLIZ;
                    I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
                    if (i18nServiceApi != null && (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) != null) {
                        C844470XAv.LIZ.getClass();
                        String strLJIJJ = i18nManagerServiceApiLIZ.LJIJJ(C844470XAv.LIZ());
                        if (strLJIJJ != null) {
                            return strLJIJJ;
                        }
                    }
                    return C786410Ut5.t2(Locale.getDefault());
                }

                @Override // X.InterfaceC1713900uhY
                public final Locale LJIIL(Context context) {
                    I18nManagerServiceApi i18nManagerServiceApiLIZ;
                    InterfaceC1910030znt interfaceC1910030zntLJIIL;
                    Locale locale;
                    I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
                    if (i18nServiceApi == null || (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) == null || (interfaceC1910030zntLJIIL = i18nManagerServiceApiLIZ.LJIIL(context)) == null || (locale = interfaceC1910030zntLJIIL.getLocale()) == null) {
                        return Locale.getDefault();
                    }
                    return locale;
                }

                @Override // X.InterfaceC1713900uhY
                public final String getCurrentLocaleStr(Context context) {
                    I18nManagerServiceApi i18nManagerServiceApiLIZ;
                    InterfaceC1910030znt interfaceC1910030zntLJIIL;
                    String strLIZ;
                    I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
                    if (i18nServiceApi == null || (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) == null || (interfaceC1910030zntLJIIL = i18nManagerServiceApiLIZ.LJIIL(context)) == null || (strLIZ = interfaceC1910030zntLJIIL.LIZ()) == null) {
                        return "";
                    }
                    return strLIZ;
                }
            };
        }
        if (Intrinsics.LJFF(cls, InterfaceC1721020ut2.class)) {
            return (T) new InterfaceC1721020ut2() { // from class: X.0zwd
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v0, types: [X.0zwe] */
                @Override // X.InterfaceC1721020ut2
                public final void LJIILIIL(final C1718380uom c1718380uom) {
                    IPIPOShareConsentService iPIPOShareConsentService;
                    ?? r2 = new InterfaceC1915880zxK() { // from class: X.0zwe
                        @Override // X.InterfaceC1915880zxK
                        public final void LIZ(int i, String str) {
                            InterfaceC1915470zwf interfaceC1915470zwf = c1718380uom;
                            if (interfaceC1915470zwf != null) {
                                interfaceC1915470zwf.onSuccess();
                            }
                        }

                        @Override // X.InterfaceC1915880zxK
                        public final void onFailure(int i, String str) {
                            InterfaceC1915470zwf interfaceC1915470zwf = c1718380uom;
                            if (interfaceC1915470zwf != null) {
                                interfaceC1915470zwf.onFailure(i, str);
                            }
                        }
                    };
                    Object objLIZ = C04TD.LIZ(IPIPOShareConsentService.class, false);
                    if (objLIZ != null) {
                        iPIPOShareConsentService = (IPIPOShareConsentService) objLIZ;
                    } else {
                        if (C04TD.LLLLLILLIL == null) {
                            synchronized (IPIPOShareConsentService.class) {
                                if (C04TD.LLLLLILLIL == null) {
                                    C04TD.LLLLLILLIL = new PIPOShareConsentServiceImp();
                                }
                            }
                        }
                        iPIPOShareConsentService = C04TD.LLLLLILLIL;
                    }
                    iPIPOShareConsentService.LIZ(r2);
                }

                @Override // X.InterfaceC1721020ut2
                public final void LJIJ(Intent intent) {
                    C2429209fW.LIZ().appendDataFlowId(intent, 1207969291);
                }

                @Override // X.InterfaceC1721020ut2
                public final void LJIJJ(WebView webView) {
                    C2429209fW.LIZ().appendDataFlowId(webView, "402681856");
                }

                @Override // X.InterfaceC1721020ut2
                public final void appendDataFlowId(Intent intent, String str) {
                    C2429209fW.LIZ().appendDataFlowId(intent, str);
                }
            };
        }
        if (Intrinsics.LJFF(cls, InterfaceC1547600qNK.class)) {
            return (T) new InterfaceC1547600qNK() { // from class: X.0qTK
                @Override // X.InterfaceC1547600qNK
                public final C0VSJ LJIL() {
                    C1553670qX7.LIZ.getClass();
                    return C1553670qX7.LIZLLL();
                }

                @Override // X.InterfaceC1547600qNK
                public final InterfaceC1504290pFT LJJ() {
                    C844470XAv.LIZ.getClass();
                    C844470XAv.LIZ();
                    return new GeckoXNetImpl();
                }

                @Override // X.InterfaceC1547600qNK
                public final String getGeckoHost() {
                    C1553670qX7.LIZ.getClass();
                    return C1553670qX7.LIZIZ();
                }

                @Override // X.InterfaceC1547600qNK
                public final GeckoGlobalConfig.ENVType getGeckoEnvironment() {
                    return C1552050qUV.LJII();
                }

                @Override // X.InterfaceC1547600qNK
                public final InterfaceC1538820q9A LJIJJLI(C1537480q70 c1537480q70) {
                    IHybridKitService iHybridKitService = (IHybridKitService) ServiceManager.get().getService(IHybridKitService.class);
                    if (iHybridKitService != null) {
                        return iHybridKitService.LJFF(c1537480q70);
                    }
                    return null;
                }

                @Override // X.InterfaceC1547600qNK
                public final void LJIJI(String str, String str2) {
                    Context context = C1552050qUV.LIZ;
                    C15O7.LIZJ(new ACallableS8S2000000_3(str, str2, 1));
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(str2);
                    C1550730qSN.LIZ.getClass();
                    C1550730qSN.LIZ(str, arrayList);
                }
            };
        }
        if (Intrinsics.LJFF(cls, InterfaceC1722330uv9.class)) {
            return (T) new InterfaceC1722330uv9() { // from class: X.0vLa
                @Override // X.InterfaceC1722330uv9
                public final String getCurrentRegionCode() {
                    return C2222691Bz1.LIZ();
                }

                @Override // X.InterfaceC1722330uv9
                public final String getPriorityRegion() {
                    return C2222691Bz1.LIZ();
                }

                @Override // X.InterfaceC1722330uv9
                public final String getRegion() {
                    return C2222691Bz1.LIZIZ();
                }

                @Override // X.InterfaceC1722330uv9
                public final String getSimCountry() {
                    return C2222691Bz1.LJ();
                }

                @Override // X.InterfaceC1722330uv9
                public final String getStoreRegionUpperCase() {
                    return ((IAccountService) ServiceManager.get().getService(IAccountService.class)).getStoreRegionUpperCase();
                }

                @Override // X.InterfaceC1722330uv9
                public final String getSysRegion() {
                    return C2222691Bz1.LJFF();
                }

                @Override // X.InterfaceC1722330uv9
                public final Locale LJFF(Context context) {
                    I18nManagerServiceApi i18nManagerServiceApiLIZ;
                    Locale localeLJIIZILJ;
                    I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
                    if (i18nServiceApi == null || (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) == null || (localeLJIIZILJ = i18nManagerServiceApiLIZ.LJIIZILJ(context)) == null) {
                        return context.getResources().getConfiguration().locale;
                    }
                    return localeLJIIZILJ;
                }

                @Override // X.InterfaceC1722330uv9
                public final void LJII(String str, String str2, String str3, String str4, String str5, final AwS109S1200000_26 awS109S1200000_26, final AwS461S0200000_26 awS461S0200000_26) {
                    TokenCert.Companion companion = TokenCert.Companion;
                    TokenCert tokenCertWith = companion.with(str2);
                    tokenCertWith.auth(str3);
                    TokenCert tokenCertWith2 = companion.with(str4);
                    tokenCertWith2.auth(str5);
                    try {
                        C1207450hWh.LIZ.LJIIL(str, "probe", tokenCertWith, tokenCertWith2, new InterfaceC687820QyS() { // from class: X.0vLZ
                            @Override // X.InterfaceC687820QyS
                            public final void LIZ(LocationData locationData) {
                                awS109S1200000_26.invoke(new C1738700vLY(Double.valueOf(locationData.longitude), Double.valueOf(locationData.latitude)));
                            }

                            @Override // X.InterfaceC687820QyS
                            public final void onError(int i, String str6) {
                                awS461S0200000_26.invoke(Integer.valueOf(i), str6);
                            }
                        }, -1L);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        awS461S0200000_26.invoke(-1, th.getMessage());
                    }
                }
            };
        }
        if (Intrinsics.LJFF(cls, InterfaceC1713880uhW.class)) {
            return (T) new InterfaceC1713880uhW() { // from class: X.0uz4
                @Override // X.InterfaceC1713880uhW
                public final String getIid() {
                    return AppLog.getIid();
                }

                @Override // X.InterfaceC1713880uhW
                public final void onEventV3(String str, Map<String, String> map) {
                    C20684815ws.LJIILLIIL(str, map);
                }

                @Override // X.InterfaceC1713880uhW
                public final void onEventV3(String str, JSONObject jSONObject) {
                    C20684815ws.LJIJ(str, jSONObject);
                }

                @Override // X.InterfaceC1713880uhW
                public final void LJIIJ(int i, String str, String str2) {
                    C2344809Gs.LIZLLL(i, str, str2);
                }
            };
        }
        if (Intrinsics.LJFF(cls, InterfaceC1547640qNO.class)) {
            return (T) new InterfaceC1547640qNO() { // from class: X.0pK5
                @Override // X.InterfaceC1547640qNO
                public final InterfaceC1717730unj createBuilder(String str) {
                    final C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(str);
                    return new InterfaceC1717730unj() { // from class: X.0pK4
                        @Override // X.InterfaceC1717730unj
                        public final InterfaceC836110Wr3 build() {
                            final TTRetrofit tTRetrofitBuild = c1499850p8JCreateBuilder.build();
                            return new InterfaceC836110Wr3() { // from class: X.0pK6
                                @Override // X.InterfaceC836110Wr3
                                public final <T> T create(Class<T> cls2) {
                                    return (T) tTRetrofitBuild.create(cls2);
                                }
                            };
                        }

                        @Override // X.InterfaceC1717730unj
                        public final InterfaceC1717730unj LIZ(InterfaceC1904907d9 interfaceC1904907d9) {
                            c1499850p8JCreateBuilder.LIZ(interfaceC1904907d9);
                            return this;
                        }

                        @Override // X.InterfaceC1717730unj
                        public final InterfaceC1717730unj LIZIZ(NetworkPartner networkPartner) {
                            c1499850p8JCreateBuilder.LIZIZ(networkPartner);
                            return this;
                        }
                    };
                }
            };
        }
        if (Intrinsics.LJFF(cls, InterfaceC1714080uhq.class)) {
            return (T) new InterfaceC1714080uhq() { // from class: X.0uz3
                @Override // X.InterfaceC1714080uhq
                public final InterfaceC1714090uhr LJIILJJIL() {
                    final IPipoOfflineService iPipoOfflineService = (IPipoOfflineService) PluggableExtentionKt.pluggableSpi$default(IPipoOfflineService.class, false, false, false, 14, null);
                    return new InterfaceC1714090uhr() { // from class: X.0uz2
                        @Override // X.InterfaceC1714090uhr
                        public final InterfaceC1904907d9 getNetworkInterceptor() {
                            IPipoOfflineService iPipoOfflineService2 = iPipoOfflineService;
                            if (iPipoOfflineService2 == null) {
                                return null;
                            }
                            iPipoOfflineService2.getNetworkInterceptor();
                            return null;
                        }
                    };
                }

                @Override // X.InterfaceC1714080uhq
                public final boolean enablePpe() {
                    LocalTestApi localTestApi = (LocalTestApi) PluggableExtentionKt.pluggableSpi$default(LocalTestApi.class, false, false, false, 14, null);
                    if (localTestApi != null) {
                        return localTestApi.enablePpe();
                    }
                    return false;
                }

                @Override // X.InterfaceC1714080uhq
                public final boolean enableBoe() {
                    return ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).enableBoe();
                }
            };
        }
        if (Intrinsics.LJFF(cls, InterfaceC1716910umP.class)) {
            return (T) new InterfaceC1716910umP() { // from class: X.0w6u
                @Override // X.InterfaceC1716910umP
                public final AbstractC1387200mCc LIZIZ() {
                    return C1906580ziK.LIZIZ();
                }

                @Override // X.InterfaceC1716910umP
                public final AbstractC1387200mCc LIZJ() {
                    return C1906580ziK.LJFF();
                }

                @Override // X.InterfaceC1716910umP
                public final AbstractC1387200mCc getTop() {
                    return C1906580ziK.LJ();
                }

                @Override // X.InterfaceC1716910umP
                public final Activity getTopActivity() {
                    return ActivityStack.getTopActivity();
                }

                @Override // X.InterfaceC1716910umP
                public final Activity getValidTopActivity() {
                    return ActivityStack.getValidTopActivity();
                }

                @Override // X.InterfaceC1716910umP
                public final boolean isAppBackGround() {
                    return ActivityStack.isAppBackGround();
                }
            };
        }
        if (Intrinsics.LJFF(cls, InterfaceC1722400uvG.class)) {
            return (T) new InterfaceC1722400uvG() { // from class: X.0vbQ
                @Override // X.InterfaceC1722400uvG
                public final String getUid() {
                    AccountUserService accountUserServiceLJIIJ;
                    User curUser;
                    IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
                    if (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null || (curUser = accountUserServiceLJIIJ.getCurUser()) == null) {
                        return null;
                    }
                    return curUser.getUid();
                }

                @Override // X.InterfaceC1722400uvG
                public final List<C1722410uvH> LJIIJJI(Context context) {
                    C2280601EOk c2280601EOk = C2280601EOk.LJFF;
                    C20469080d.LIZ();
                    ArrayList arrayList = new ArrayList();
                    for (C2280601EOk c2280601EOk2 : C2280601EOk.LJI) {
                        arrayList.add(new C1722410uvH(c2280601EOk2.LIZ, c2280601EOk2.LIZIZ, c2280601EOk2.LIZJ, c2280601EOk2.LIZLLL, c2280601EOk2.LJ));
                    }
                    return arrayList;
                }
            };
        }
        if (Intrinsics.LJFF(cls, InterfaceC1724730uz1.class)) {
            return (T) new InterfaceC1724730uz1() { // from class: X.0uz5
                @Override // X.InterfaceC1724730uz1
                public final void LIZ(String str, JSONObject jSONObject, JSONObject jSONObject2) {
                    C793770VBv.LJII(str, jSONObject, jSONObject2, null);
                }
            };
        }
        if (Intrinsics.LJFF(cls, InterfaceC790140Uz6.class)) {
            return (T) new InterfaceC790140Uz6() { // from class: X.0uzE
                @Override // X.InterfaceC790140Uz6
                public final boolean shouldShowMall2TabOrTopTab() {
                    return ((IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class)).shouldShowMall2TabOrTopTab();
                }

                @Override // X.InterfaceC790140Uz6
                public final void LIZ(Context context, String str, String str2, Function1<? super String, Unit> function1) {
                    C1724870uzF c1724870uzF = C1724870uzF.LIZ;
                    AwS605S0100000_26 awS605S0100000_26 = new AwS605S0100000_26(function1, (Function1<? super String, Unit>) 587);
                    c1724870uzF.getClass();
                    C1724870uzF.LIZIZ = awS605S0100000_26;
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://ec/transparent_singpass_handle");
                    smartRouteBuildRoute.withParam("request_id", str);
                    smartRouteBuildRoute.withParam("redirect_uri", str2);
                    smartRouteBuildRoute.open();
                }
            };
        }
        if (Intrinsics.LJFF(cls, InterfaceC1723340uwm.class)) {
            return (T) new InterfaceC1723340uwm() { // from class: X.0vOP
                @Override // X.InterfaceC1723340uwm
                public final void LJI(C19EG c19eg) {
                    C1766570w4V c1766570w4V = C1766570w4V.LIZ;
                    C1896207bk c1896207bk = new C1896207bk(c19eg);
                    c1766570w4V.getClass();
                    C1766570w4V.LIZ(c1896207bk);
                }
            };
        }
        return null;
    }
}
