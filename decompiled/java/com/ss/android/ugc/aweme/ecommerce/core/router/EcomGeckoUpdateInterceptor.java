package com.ss.android.ugc.aweme.ecommerce.core.router;

import X.AbstractC1547260qMm;
import X.AbstractC1552040qUU;
import X.C01GW;
import X.C03W6;
import X.C098200Yq;
import X.C0PEM;
import X.C1507890pLH;
import X.C1507990pLR;
import X.C1537280q6g;
import X.C1537300q6i;
import X.C1537330q6l;
import X.C1537370q6p;
import X.C1548910qPR;
import X.C1550610qSB;
import X.C1551330qTL;
import X.C189200o6;
import X.C1946007jm;
import X.C1976907ol;
import X.C1AF0;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C23250099c;
import X.C452501pT;
import X.C817503Hh;
import X.InterfaceC1508110pLd;
import X.InterfaceC20236714Gf;
import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.LocalPackageModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.core.router.EcomGeckoUpdateInterceptor;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes24.dex */
public final class EcomGeckoUpdateInterceptor extends AbstractC1547260qMm implements IInterceptor {
    public static final EcomGeckoUpdateInterceptor LL = new EcomGeckoUpdateInterceptor();
    public static final C01GW LLILLJJLI = C452501pT.LIZIZ(new C1537370q6p());
    public static final Set<String> LLILLL = new LinkedHashSet();
    public static final Set<String> LLILZ = new LinkedHashSet();
    public static final Map<String, String> LLILZIL = new LinkedHashMap();

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    public static void LIZLLL(String str) {
        Object c098200Yq;
        Set<String> set = LLILLL;
        if (set.contains(str)) {
            return;
        }
        set.add(str);
        try {
            c098200Yq = C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1537300q6i(str, null), 2);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1AF0.LJ(thM5exceptionOrNullimpl);
        }
    }

    public final String LIZJ(String str) {
        Uri uriLJ = C1946007jm.LJ(str);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLJ, "channel");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLJ, "url");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLJ, "surl");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(uriLJ.getAuthority());
                    sbLIZ.append(uriLJ.getPath());
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
                return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
            }
            return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
        }
        return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
    }

    @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final boolean matchInterceptRules(String str) {
        boolean zLJ;
        if (str == null) {
            return false;
        }
        C01GW c01gw = LLILLJJLI;
        if (((Map) c01gw.getValue()).isEmpty()) {
            return false;
        }
        if (((Map) c01gw.getValue()).get("*") != null && !LLILLL.contains("*")) {
            LIZLLL("*");
        }
        String strLIZJ = LIZJ(str);
        try {
            C1548910qPR.LIZ.getClass();
            zLJ = C1548910qPR.LJ(strLIZJ);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            zLJ = false;
            TryCatchGuardChecker.doCheck(th);
        }
        if (LLILZIL.containsKey(strLIZJ)) {
            return true;
        }
        for (String str2 : ((Map) LLILLJJLI.getValue()).keySet()) {
            if (str2.length() > 0 && a0.LJJIIZI(strLIZJ, str2, false)) {
                LLILZIL.put(strLIZJ, str2);
                return true;
            }
        }
        return zLJ;
    }

    @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String url;
        if (routeIntent != null) {
            url = routeIntent.getUrl();
        } else {
            url = null;
        }
        return matchInterceptRules(url);
    }

    @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final void handleSparkContext(SparkContext sparkContext, String str) {
        super.handleSparkContext(sparkContext, str);
        String strLIZJ = LIZJ(str);
        Map<String, String> map = LLILZIL;
        String str2 = (String) ((LinkedHashMap) map).get(strLIZJ);
        if (str2 != null && map.containsKey(strLIZJ)) {
            LL.getClass();
            LIZLLL(str2);
        }
        try {
            C1548910qPR.LIZ.getClass();
            C1548910qPR.LIZJ(strLIZJ);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        if (routeIntent == null) {
            return false;
        }
        String strLIZJ = LIZJ(routeIntent.getUrl());
        Map<String, String> map = LLILZIL;
        String str = (String) ((LinkedHashMap) map).get(strLIZJ);
        if (str != null && map.containsKey(strLIZJ)) {
            LL.getClass();
            LIZLLL(str);
        }
        try {
            C1548910qPR.LIZ.getClass();
            C1548910qPR.LIZJ(strLIZJ);
            return false;
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static void LIZIZ(String str, String str2, InterfaceC1508110pLd interfaceC1508110pLd) {
        C1507990pLR c1507990pLR = new C1507990pLR(str2, str, "gecko", 3, 1, interfaceC1508110pLd, null, 2, null, null, null, null, null, 7168);
        C1507890pLH c1507890pLHLIZ = C1507890pLH.LIZJ.LIZ();
        if (c1507890pLHLIZ != null) {
            c1507890pLHLIZ.LIZIZ(c1507990pLR);
        }
    }

    public static void LIZ(String str, final C1537330q6l c1537330q6l, final InterfaceC20236714Gf interfaceC20236714Gf, final String str2, final C03W6 c03w6, boolean z) {
        final C1537280q6g c1537280q6g = new C1537280q6g(str, c1537330q6l);
        OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
        optionCheckUpdateParams.setEnableDownloadAutoRetry(true);
        optionCheckUpdateParams.setChannelUpdatePriority(3);
        optionCheckUpdateParams.setFrom("ecom_preload");
        optionCheckUpdateParams.setListener(new AbstractC1552040qUU() { // from class: X.0q6f
            @Override // X.AbstractC1552040qUU
            public final void LJIILLIIL(LocalPackageModel localPackageModel) {
                InterfaceC1631630sYr<String, String, Boolean, String, Unit> interfaceC1631630sYr = c1537280q6g;
                String channel = localPackageModel.getChannel();
                Boolean bool = Boolean.TRUE;
                interfaceC1631630sYr.invoke(channel, "LocalNewestVersion", bool, null);
                String channel2 = localPackageModel.getChannel();
                if (channel2 != null) {
                    EcomGeckoUpdateInterceptor.LLILZ.add(channel2);
                }
                C03W6 c03w62 = c03w6;
                if (c03w62 != null) {
                    c03w62.onSuccess();
                }
                InterfaceC20236714Gf<Boolean> interfaceC20236714Gf2 = interfaceC20236714Gf;
                if (interfaceC20236714Gf2 != null) {
                    C189200o6.m2constructorimpl(bool);
                    interfaceC20236714Gf2.resumeWith(bool);
                }
            }

            @Override // X.AbstractC1552040qUU
            public final void LJ(UpdatePackage updatePackage, Throwable th) {
                String channel;
                InterfaceC1631630sYr<String, String, Boolean, String, Unit> interfaceC1631630sYr = c1537280q6g;
                String message = null;
                if (updatePackage != null) {
                    channel = updatePackage.getChannel();
                } else {
                    channel = null;
                }
                Boolean bool = Boolean.FALSE;
                if (th != null) {
                    message = th.getMessage();
                }
                interfaceC1631630sYr.invoke(channel, "ActivateFail", bool, message);
                InterfaceC20236714Gf<Boolean> interfaceC20236714Gf2 = interfaceC20236714Gf;
                if (interfaceC20236714Gf2 != null) {
                    C189200o6.m2constructorimpl(bool);
                    interfaceC20236714Gf2.resumeWith(bool);
                }
            }

            @Override // X.AbstractC1552040qUU
            public final void LJII(Throwable th, Map map) {
                String message;
                String message2;
                InterfaceC1631630sYr<String, String, Boolean, String, Unit> interfaceC1631630sYr = c1537280q6g;
                Boolean bool = Boolean.FALSE;
                if (th != null) {
                    message = th.getMessage();
                } else {
                    message = null;
                }
                interfaceC1631630sYr.invoke(null, "CheckServerVersionFail", bool, message);
                C03W6 c03w62 = c03w6;
                if (c03w62 != null) {
                    if (th == null || (message2 = th.getMessage()) == null) {
                        message2 = "fail";
                    }
                    c03w62.LIZ(message2);
                }
                InterfaceC20236714Gf<Boolean> interfaceC20236714Gf2 = interfaceC20236714Gf;
                if (interfaceC20236714Gf2 != null) {
                    C189200o6.m2constructorimpl(bool);
                    interfaceC20236714Gf2.resumeWith(bool);
                }
            }

            @Override // X.AbstractC1552040qUU
            public final void LJIIIIZZ(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2) {
                List<UpdatePackage> list;
                List<Pair<String, Long>> list2;
                if (map != null && (list2 = map.get(c1537330q6l.LIZ)) != null) {
                    String str3 = str2;
                    Iterator<Pair<String, Long>> it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Pair<String, Long> next = it2.next();
                        if (Intrinsics.LJFF(next.first, str3)) {
                            if (next != null) {
                                return;
                            }
                        }
                    }
                }
                if (map2 != null && (list = map2.get(c1537330q6l.LIZ)) != null) {
                    String str4 = str2;
                    Iterator<UpdatePackage> it3 = list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        UpdatePackage next2 = it3.next();
                        if (Intrinsics.LJFF(next2.getChannel(), str4)) {
                            if (next2 != null) {
                                return;
                            }
                        }
                    }
                }
                C03W6 c03w62 = c03w6;
                if (c03w62 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("fail,invalid channel ");
                    sbLIZ.append(str2);
                    c03w62.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                }
            }

            @Override // X.AbstractC1552040qUU
            public final void LJIIJJI(UpdatePackage updatePackage, Throwable th) {
                String channel;
                InterfaceC1631630sYr<String, String, Boolean, String, Unit> interfaceC1631630sYr = c1537280q6g;
                String message = null;
                if (updatePackage != null) {
                    channel = updatePackage.getChannel();
                } else {
                    channel = null;
                }
                Boolean bool = Boolean.FALSE;
                if (th != null) {
                    message = th.getMessage();
                }
                interfaceC1631630sYr.invoke(channel, "DownloadFail", bool, message);
                InterfaceC20236714Gf<Boolean> interfaceC20236714Gf2 = interfaceC20236714Gf;
                if (interfaceC20236714Gf2 != null) {
                    C189200o6.m2constructorimpl(bool);
                    interfaceC20236714Gf2.resumeWith(bool);
                }
            }

            @Override // X.AbstractC1552040qUU
            public final void LJIJ(UpdatePackage updatePackage, Throwable th) {
                String channel;
                String message;
                InterfaceC1631630sYr<String, String, Boolean, String, Unit> interfaceC1631630sYr = c1537280q6g;
                String message2 = null;
                if (updatePackage != null) {
                    channel = updatePackage.getChannel();
                } else {
                    channel = null;
                }
                Boolean bool = Boolean.FALSE;
                if (th != null) {
                    message2 = th.getMessage();
                }
                interfaceC1631630sYr.invoke(channel, "UpdateFailed", bool, message2);
                C03W6 c03w62 = c03w6;
                if (c03w62 != null) {
                    if (th == null || (message = th.getMessage()) == null) {
                        message = "fail";
                    }
                    c03w62.LIZ(message);
                }
                InterfaceC20236714Gf<Boolean> interfaceC20236714Gf2 = interfaceC20236714Gf;
                if (interfaceC20236714Gf2 != null) {
                    C189200o6.m2constructorimpl(bool);
                    interfaceC20236714Gf2.resumeWith(bool);
                }
            }

            @Override // X.AbstractC1552040qUU
            public final void LJIL(long j, UpdatePackage updatePackage) {
                String channel;
                String channel2;
                InterfaceC1631630sYr<String, String, Boolean, String, Unit> interfaceC1631630sYr = c1537280q6g;
                if (updatePackage != null) {
                    channel = updatePackage.getChannel();
                } else {
                    channel = null;
                }
                Boolean bool = Boolean.TRUE;
                interfaceC1631630sYr.invoke(channel, "UpdateSuccess", bool, null);
                if (updatePackage != null && (channel2 = updatePackage.getChannel()) != null) {
                    EcomGeckoUpdateInterceptor.LLILZ.add(channel2);
                }
                C03W6 c03w62 = c03w6;
                if (c03w62 != null) {
                    c03w62.onSuccess();
                }
                InterfaceC20236714Gf<Boolean> interfaceC20236714Gf2 = interfaceC20236714Gf;
                if (interfaceC20236714Gf2 != null) {
                    C189200o6.m2constructorimpl(bool);
                    interfaceC20236714Gf2.resumeWith(bool);
                }
            }

            @Override // X.AbstractC1552040qUU
            public final void LJJ(long j, String str3) {
                if (str3 != null) {
                    EcomGeckoUpdateInterceptor.LLILZ.add(str3);
                }
                InterfaceC20236714Gf<Boolean> interfaceC20236714Gf2 = interfaceC20236714Gf;
                if (interfaceC20236714Gf2 != null) {
                    Boolean bool = Boolean.TRUE;
                    C189200o6.m2constructorimpl(bool);
                    interfaceC20236714Gf2.resumeWith(bool);
                }
            }

            @Override // X.AbstractC1552040qUU
            public final void LJI(int i, Throwable th, Map map) {
                InterfaceC1631630sYr<String, String, Boolean, String, Unit> interfaceC1631630sYr = c1537280q6g;
                Boolean bool = Boolean.FALSE;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("code_");
                sbLIZ.append(i);
                sbLIZ.append('_');
                sbLIZ.append(th.getMessage());
                interfaceC1631630sYr.invoke(null, "CheckRequestIntercept", bool, C2188811AlT.LIZIZ(sbLIZ));
                C03W6 c03w62 = c03w6;
                if (c03w62 != null) {
                    String message = th.getMessage();
                    if (message == null) {
                        message = "fail";
                    }
                    c03w62.LIZ(message);
                }
                InterfaceC20236714Gf<Boolean> interfaceC20236714Gf2 = interfaceC20236714Gf;
                if (interfaceC20236714Gf2 != null) {
                    C189200o6.m2constructorimpl(bool);
                    interfaceC20236714Gf2.resumeWith(bool);
                }
            }

            @Override // X.AbstractC1552040qUU
            public final void LJIIIZ(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2, C1551680qTu c1551680qTu) {
                List<Pair<String, Long>> list;
                if (map != null && (list = map.get(c1537330q6l.LIZ)) != null) {
                    String str3 = str2;
                    Iterator<Pair<String, Long>> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Pair<String, Long> next = it2.next();
                        if (Intrinsics.LJFF(next.first, str3)) {
                            if (next != null) {
                                return;
                            }
                        }
                    }
                }
                List list2 = (List) ((HashMap) map2).get(c1537330q6l.LIZ);
                if (list2 != null) {
                    String str4 = str2;
                    Iterator it3 = list2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next2 = it3.next();
                        if (Intrinsics.LJFF(((UpdatePackage) next2).getChannel(), str4)) {
                            if (next2 != null) {
                                return;
                            }
                        }
                    }
                }
                C03W6 c03w62 = c03w6;
                if (c03w62 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("fail,invalid channel ");
                    sbLIZ.append(str2);
                    c03w62.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        });
        C1551330qTL c1551330qTL = C1551330qTL.LIZ;
        String str3 = c1537330q6l.LIZ;
        c1551330qTL.getClass();
        if (C1551330qTL.LJIIIIZZ(str3, str2) && z) {
            C1550610qSB.LIZIZ(c1537330q6l.LIZ, str2);
            if (c03w6 != null) {
                c03w6.LIZ("block_list");
            }
            if (interfaceC20236714Gf != null) {
                Boolean bool = Boolean.TRUE;
                C189200o6.m2constructorimpl(bool);
                interfaceC20236714Gf.resumeWith(bool);
                return;
            }
            return;
        }
        c1537330q6l.LIZJ.LIZ(null, C2097908Jt.LIZJ(new kotlin.Pair(c1537330q6l.LIZ, Collections.singletonList(new CheckRequestBodyModel.TargetChannel(str2)))), optionCheckUpdateParams);
    }
}
