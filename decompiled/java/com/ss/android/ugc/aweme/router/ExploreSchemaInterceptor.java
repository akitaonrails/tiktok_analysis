package com.ss.android.ugc.aweme.router;

import X.AbstractC1387200mCc;
import X.C085T;
import X.C0AB8;
import X.C15WT;
import X.C1906580ziK;
import X.C1906780zie;
import X.C1976907ol;
import X.C19EG;
import X.C20525215Te;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1711206n0;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.hox.Hox;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.explore.ExploreLynxParams;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes29.dex */
public final class ExploreSchemaInterceptor implements IInterceptor {
    public static final C1906780zie LL = new C1906780zie();

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        Uri uri;
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            host = uri.getHost();
        } else {
            host = null;
        }
        return Intrinsics.LJFF("explore", host);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Uri uri;
        boolean z;
        Activity activityLIZIZ;
        Activity activityLIZ;
        C19EG c19eg;
        String url;
        Activity activityLIZ2;
        Uri uri2;
        Object obj;
        String simpleName;
        Object obj2;
        C19EG c19eg2;
        Activity activityLIZIZ2;
        Long lLJIILIIL;
        C1906780zie c1906780zie = LL;
        Uri uri3 = null;
        String simpleName2 = null;
        if (routeIntent != null) {
            uri = routeIntent.getUri();
        } else {
            uri = null;
        }
        c1906780zie.getClass();
        if (uri != null) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "interest_id");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                lLJIILIIL = C2095008Iq.LJIILIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            } else {
                lLJIILIIL = null;
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "interest_name");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null || !(!a0.LJJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2))) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = null;
            }
            String str = (String) C1906780zie.LJ(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "extra_info")).get("enter_method");
            if (lLJIILIIL != null || ((strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null && !a0.LJJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) || (str != null && !a0.LJJJIL(str)))) {
                C15WT.LIZIZ.LJ(lLJIILIIL, str, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
            }
        }
        if (((Boolean) C0AB8.LIZ.getValue()).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (routeIntent == null || (url = routeIntent.getUrl()) == null) {
                url = "";
            }
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            if (abstractC1387200mCcLJ != null && (activityLIZIZ2 = abstractC1387200mCcLJ.LIZIZ()) != null) {
                activityLIZ2 = C085T.LIZ(activityLIZIZ2);
            } else {
                activityLIZ2 = null;
            }
            if (routeIntent != null) {
                uri2 = routeIntent.getUri();
            } else {
                uri2 = null;
            }
            ExploreLynxParams exploreLynxParamsLIZLLL = C1906780zie.LIZLLL(uri2);
            if (abstractC1387200mCcLJ != null) {
                obj = abstractC1387200mCcLJ.LIZ;
            } else {
                obj = null;
            }
            if ((obj instanceof InterfaceC1711206n0) && activityLIZ2 != null) {
                try {
                    if (!(activityLIZ2 instanceof C19EG) || (c19eg2 = (C19EG) activityLIZ2) == null) {
                        return false;
                    }
                    if (exploreLynxParamsLIZLLL != null) {
                        c19eg2.getIntent().putExtra("explore_lynx_params", exploreLynxParamsLIZLLL);
                        if (exploreLynxParamsLIZLLL.showBackButton) {
                            C20525215Te.LIZIZ(c19eg2, exploreLynxParamsLIZLLL.backUrl, exploreLynxParamsLIZLLL.needBackFyp);
                        }
                    }
                    C15WT.LIZIZ.LIZLLL(exploreLynxParamsLIZLLL);
                    C1906780zie.LIZ();
                    Hox hoxLIZ = Hox.LLJILJIL.LIZ(c19eg2);
                    Bundle bundle = new Bundle();
                    C786410Ut5.LJJJI("fromStart", "MainFragment", bundle);
                    C786410Ut5.LJJJI("toPage", "homepage_explore", bundle);
                    hoxLIZ.TQ2(bundle, "homepage_explore", false);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1906780zie c1906780zie2 = LL;
                    if (context == null) {
                        context = activityLIZ2;
                    }
                    c1906780zie2.getClass();
                    C1906780zie.LIZIZ(context, exploreLynxParamsLIZLLL, url);
                }
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fallback to router(//main), topPage=");
                if (abstractC1387200mCcLJ != null && (obj2 = abstractC1387200mCcLJ.LIZ) != null) {
                    simpleName = obj2.getClass().getSimpleName();
                } else {
                    simpleName = null;
                }
                sbLIZ.append(simpleName);
                sbLIZ.append(", activity=");
                if (activityLIZ2 != null) {
                    simpleName2 = activityLIZ2.getClass().getSimpleName();
                }
                sbLIZ.append(simpleName2);
                sbLIZ.append(", schema=");
                sbLIZ.append(url);
                C2188811AlT.LIZIZ(sbLIZ);
                C15WT.LIZIZ.LIZLLL(exploreLynxParamsLIZLLL);
                if (context == null) {
                    context = activityLIZ2;
                }
                C1906780zie.LIZIZ(context, exploreLynxParamsLIZLLL, url);
            }
        } else {
            if (routeIntent != null) {
                routeIntent.getUrl();
            }
            AbstractC1387200mCc abstractC1387200mCcLJ2 = C1906580ziK.LJ();
            if (abstractC1387200mCcLJ2 != null && (activityLIZIZ = abstractC1387200mCcLJ2.LIZIZ()) != null && (activityLIZ = C085T.LIZ(activityLIZIZ)) != null && Intrinsics.LJFF(activityLIZ.getClass().getName(), "com.ss.android.ugc.aweme.main.MainActivity")) {
                try {
                    if (!(activityLIZ instanceof C19EG) || (c19eg = (C19EG) activityLIZ) == null) {
                        return false;
                    }
                    if (routeIntent != null) {
                        uri3 = routeIntent.getUri();
                    }
                    ExploreLynxParams exploreLynxParamsLIZLLL2 = C1906780zie.LIZLLL(uri3);
                    if (exploreLynxParamsLIZLLL2 != null) {
                        c19eg.getIntent().putExtra("explore_lynx_params", exploreLynxParamsLIZLLL2);
                    }
                    C15WT.LIZIZ.LIZLLL(exploreLynxParamsLIZLLL2);
                    Hox hoxLIZ2 = Hox.LLJILJIL.LIZ(c19eg);
                    Bundle bundle2 = new Bundle();
                    C786410Ut5.LJJJI("fromStart", "MainFragment", bundle2);
                    C786410Ut5.LJJJI("toPage", "homepage_explore", bundle2);
                    hoxLIZ2.TQ2(bundle2, "homepage_explore", false);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    return false;
                }
            }
        }
        return true;
    }
}
