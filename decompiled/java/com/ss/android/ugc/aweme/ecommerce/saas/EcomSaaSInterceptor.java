package com.ss.android.ugc.aweme.ecommerce.saas;

import X.AbstractC1076640e7i;
import X.AbstractC1539010q9T;
import X.AbstractC1547260qMm;
import X.AnonymousClass0317;
import X.C034S;
import X.C1120604Zw;
import X.C1121904a9;
import X.C1697810uHb;
import X.C1946007jm;
import X.C1947207jy;
import X.C1AQS;
import X.C679280Qkg;
import X.C958103op;
import android.net.Uri;
import android.os.SystemClock;
import android.webkit.WebSettings;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.aweme.ecommerce.dependency.HybridDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.EcomSaaSInterceptor;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes24.dex */
public final class EcomSaaSInterceptor extends AbstractC1547260qMm {
    private final Map<String, Object> provideGlobalProps() {
        return C1AQS.LIZIZ();
    }

    private final boolean isLocalTest(String str) {
        String host = C1946007jm.LJ(simpleGetUrl(str)).getHost();
        if (host == null) {
            return false;
        }
        return Pattern.matches("^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$", host);
    }

    private final String simpleGetUrl(String str) {
        Uri uriLJ = C1946007jm.LJ(str);
        String strLIZ = C1947207jy.LIZ(uriLJ, "url");
        if (strLIZ == null && (strLIZ = C1947207jy.LIZ(uriLJ, "surl")) == null) {
            return str;
        }
        return strLIZ;
    }

    public final String appendQueryParams(String str) {
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin;
        boolean z;
        boolean z2;
        String name;
        if (str == null) {
            return "";
        }
        Uri uriLJ = C1946007jm.LJ(str);
        Uri.Builder builderBuildUpon = uriLJ.buildUpon();
        Iterator it2 = ((LinkedHashMap) C1AQS.LIZIZ()).keySet().iterator();
        int i = 0;
        while (true) {
            String name2 = null;
            if (it2.hasNext()) {
                Object next = it2.next();
                int i2 = i + 1;
                if (i >= 0) {
                    String str2 = (String) next;
                    builderBuildUpon.appendQueryParameter(str2, String.valueOf(((LinkedHashMap) C1AQS.LIZIZ()).get(str2)));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            } else {
                C1120604Zw c1120604Zw = C1120604Zw.LIZ;
                c1120604Zw.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJIIJ && Intrinsics.LJFF(C1947207jy.LIZ(uriLJ, "append_common_params"), "1")) {
                    if (C034S.LIZ()) {
                        c1120604Zw.LIZ();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
                        if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        String name3 = IAccountDependencyService.class.getName();
                        if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                            name = anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
                        } else {
                            name = null;
                        }
                        C1AQS.LIZJ(jElapsedRealtime, 1, name3, name, z2);
                    } else {
                        c1120604Zw.LIZ();
                        anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
                    }
                    IAccountDependencyService iAccountDependencyService = (IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
                    if (C034S.LIZ()) {
                        c1120604Zw.LIZ();
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin = HybridDependencyService.createIHybridDependencyServicebyMonsterPlugin(false);
                        if (anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String name4 = IHybridDependencyService.class.getName();
                        if (anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin != null) {
                            name2 = anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin.getClass().getName();
                        }
                        C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name2, z);
                    } else {
                        c1120604Zw.LIZ();
                        anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IHybridDependencyService.class);
                    }
                    builderBuildUpon.appendQueryParameter("user_id", iAccountDependencyService.getUserId());
                    builderBuildUpon.appendQueryParameter("screen_width_dp", String.valueOf(C679280Qkg.LIZIZ(Integer.valueOf(C958103op.LIZLLL()))));
                    builderBuildUpon.appendQueryParameter("screen_height_dp", String.valueOf(C679280Qkg.LIZIZ(Integer.valueOf(C958103op.LIZJ()))));
                    Map<String, String> networkCommonParams = ((IHybridDependencyService) anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin).getNetworkCommonParams();
                    for (String str3 : networkCommonParams.keySet()) {
                        builderBuildUpon.appendQueryParameter(str3, String.valueOf(networkCommonParams.get(str3)));
                    }
                }
                return builderBuildUpon.toString();
            }
        }
    }

    @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public boolean matchInterceptRules(String str) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        if (str == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(C1946007jm.LJ(str), "target_handler")) == null || !a0.LJJIIZI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "ecom", false)) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public boolean matchInterceptRules(RouteIntent routeIntent) {
        String originUrl;
        if (routeIntent != null) {
            originUrl = routeIntent.getOriginUrl();
        } else {
            originUrl = null;
        }
        return matchInterceptRules(originUrl);
    }

    @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public void handleSparkContext(SparkContext sparkContext, String str) {
        AnonymousClass0317 anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin;
        boolean z;
        super.handleSparkContext(sparkContext, str);
        String name = null;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin = HybridDependencyService.createIHybridDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IHybridDependencyService.class.getName();
            if (anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IHybridDependencyService.class);
        }
        final IHybridDependencyService iHybridDependencyService = (IHybridDependencyService) anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin;
        C1120604Zw.LIZ.getClass();
        C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
        if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJI && !isLocalTest(str)) {
            sparkContext.LJJJZ("access_key", iHybridDependencyService.getAccessKey());
            sparkContext.LJJ(AbstractC1076640e7i.class, new AbstractC1076640e7i() { // from class: X.0qK8
                @Override // X.AbstractC1076640e7i
                public final C1533560q0g LIZ(C1533560q0g c1533560q0g) {
                    IHybridDependencyService iHybridDependencyService2 = iHybridDependencyService;
                    C1533570q0h c1533570q0h = c1533560q0g.LIZIZ;
                    if (c1533570q0h != null) {
                        c1533570q0h.LIZ = iHybridDependencyService2.getAccessKey();
                    }
                    C1533570q0h c1533570q0h2 = c1533560q0g.LIZIZ;
                    if (c1533570q0h2 != null) {
                        c1533570q0h2.LJI = false;
                    }
                    return c1533560q0g;
                }
            });
        }
        sparkContext.LJJLIIIJILLIZJL(provideGlobalProps());
        Map<String, Object> mapProvideCustomGlobalProps = iHybridDependencyService.provideCustomGlobalProps();
        if (true ^ mapProvideCustomGlobalProps.isEmpty()) {
            sparkContext.LJJLIIIJILLIZJL(mapProvideCustomGlobalProps);
        }
        sparkContext.LJJJJZ(new AbstractC1539010q9T() { // from class: X.0qKP
            @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
            public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                if (interfaceC1531560pxS instanceof C1541480qDS) {
                    C1541480qDS c1541480qDS = (C1541480qDS) interfaceC1531560pxS;
                    c1541480qDS.LJ = new InterfaceC1541760qDu() { // from class: X.0qKQ
                        @Override // X.InterfaceC1541760qDu
                        public final void LIZ(WebSettings webSettings, WebKitView webKitView) {
                            String userAgentString = webKitView.getSettings().getUserAgentString();
                            if (userAgentString == null) {
                                userAgentString = "";
                            }
                            WebSettings settings = webKitView.getSettings();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(userAgentString);
                            sbLIZ.append(' ');
                            sbLIZ.append(C188200nw.LIZ());
                            C786410Ut5.se(settings, C2188811AlT.LIZIZ(sbLIZ));
                        }
                    };
                    final InterfaceC1047700dN2 interfaceC1047700dN2 = c1541480qDS.LJIIJJI;
                    final EcomSaaSInterceptor ecomSaaSInterceptor = this.LLILLJJLI;
                    c1541480qDS.LJIIJJI = new InterfaceC1047700dN2() { // from class: X.0qKO
                        @Override // X.InterfaceC1047700dN2
                        public final C1040730dBn LIZ(C1040730dBn c1040730dBn) {
                            C1040730dBn c1040730dBnLIZ;
                            InterfaceC1047700dN2 interfaceC1047700dN22 = interfaceC1047700dN2;
                            if (interfaceC1047700dN22 != null && (c1040730dBnLIZ = interfaceC1047700dN22.LIZ(c1040730dBn)) != null) {
                                c1040730dBn = c1040730dBnLIZ;
                            }
                            c1040730dBn.LIZ = ecomSaaSInterceptor.appendQueryParams(c1040730dBn.LIZ);
                            return c1040730dBn;
                        }
                    };
                }
            }
        });
        iHybridDependencyService.handleSaaSSparkContext(sparkContext, str);
    }
}
