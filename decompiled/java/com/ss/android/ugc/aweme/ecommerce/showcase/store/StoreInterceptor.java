package com.ss.android.ugc.aweme.ecommerce.showcase.store;

import X.AbstractC1538740q92;
import X.AbstractC1539010q9T;
import X.AbstractC1542200qEc;
import X.AnonymousClass0317;
import X.C01GW;
import X.C034S;
import X.C054G;
import X.C099G;
import X.C099R;
import X.C0C64;
import X.C0PEM;
import X.C0POE;
import X.C0WWO;
import X.C1008603wy;
import X.C1019103yf;
import X.C1120604Zw;
import X.C1161790gL3;
import X.C1161850gL9;
import X.C1165500gR2;
import X.C1166240gSE;
import X.C1202220hOG;
import X.C1206000hUM;
import X.C1211320hcw;
import X.C1257480ipO;
import X.C1390920mIc;
import X.C13LQ;
import X.C1421105hJ;
import X.C1537900q7g;
import X.C1538590q8n;
import X.C1541950qED;
import X.C1546790qM1;
import X.C1547280qMo;
import X.C1733750vDZ;
import X.C1733760vDa;
import X.C1735000vFa;
import X.C1735450vGJ;
import X.C1735460vGK;
import X.C1738960vLy;
import X.C1738980vM0;
import X.C1738990vM1;
import X.C1739050vM7;
import X.C1739060vM8;
import X.C1739070vM9;
import X.C1739160vMI;
import X.C1741890vQh;
import X.C1742080vR0;
import X.C1743690vTb;
import X.C1766860w4y;
import X.C1776240wK6;
import X.C19719612Di;
import X.C1976807ok;
import X.C1976907ol;
import X.C19EG;
import X.C1AQS;
import X.C1DFB;
import X.C1DFH;
import X.C2010707uD;
import X.C2010907uF;
import X.C2095008Iq;
import X.C2107308Nj;
import X.C212391189t;
import X.C2188811AlT;
import X.C2286608xc;
import X.C2296808zG;
import X.C23250099c;
import X.C290570BaB;
import X.C291230BbF;
import X.C299110Bnx;
import X.C324120CnC;
import X.C452501pT;
import X.C538540LAe;
import X.C786410Ut5;
import X.C817503Hh;
import X.C883203ck;
import X.C948503nH;
import X.EnumC1014603xw;
import X.EnumC1161690gKt;
import X.EnumC1161720gKw;
import X.EnumC1739000vM2;
import X.EnumC1740810vOx;
import X.EnumC452301pR;
import X.InterfaceC1166330gSN;
import X.InterfaceC1364105Vn;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import com.lynx.tasm.LynxViewClient;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.apm.ApmDependencyService;
import com.ss.android.ugc.aweme.ecommerce.mix.ui.MixContainerBottomSheetBehavior;
import com.ss.android.ugc.aweme.ecommerce.mix.ui.TuxMixContainerSheetBehavior;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.apm.IApmDependencyService;
import com.ss.android.ugc.aweme.ecommerce.showcase.ab.StoreLivePlayAB;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.ShopChunkResponse;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.view.StoreMixFragment;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreTechLogService;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSource;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class StoreInterceptor implements IInterceptor {
    public static final StoreInterceptor LL = new StoreInterceptor();
    public static final C01GW LLILLJJLI;
    public static final C01GW LLILLL;
    public static final Set<String> LLILZ;
    public static final List<WeakReference<Context>> LLILZIL;

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    static {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        LLILLJJLI = C452501pT.LIZ(enumC452301pR, AFwS215S0000000_26.get$arr$(177));
        LLILLL = C452501pT.LIZ(enumC452301pR, AFwS215S0000000_26.get$arr$(176));
        LLILZ = C13LQ.LJLIIL(new String[]{"/store", "/showcase_popup", "/showcase", "/store_popup", "/store_subpage", "/store_subpage_popup"});
        LLILZIL = new ArrayList();
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String path;
        Uri uri;
        if (Intrinsics.LJFF(routeIntent.getHost(), "ec")) {
            return LLILZ.contains(routeIntent.getPath());
        }
        Object value = LLILLL.getValue();
        String strLIZLLL = C0WWO.LIZLLL(routeIntent, "url");
        if (strLIZLLL != null && (uri = UriProtector.parse(strLIZLLL)) != null) {
            path = uri.getPath();
        } else {
            path = null;
        }
        return Intrinsics.LJFF(value, path);
    }

    public static Uri LIZJ(Uri uri, Uri uri2) {
        Uri.Builder builderBuildUpon = uri2.buildUpon();
        for (String str : UriProtector.getQueryParameterNames(uri)) {
            C1976807ok.LJFF(builderBuildUpon, str, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str));
            if (Intrinsics.LJFF("sellerId", str)) {
                C1976807ok.LJFF(builderBuildUpon, "seller_id", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str));
            }
        }
        return builderBuildUpon.build();
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        List<WeakReference<Context>> list = LLILZIL;
        C19719612Di.LJJIIJ(list, AFwS268S0000000_26.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), true);
        if (!((ArrayList) list).isEmpty()) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                if (((Reference) it2.next()).get() == context) {
                    return true;
                }
            }
        }
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ.LLIILII(), null, new C1735450vGJ(context, routeIntent, null), 2);
        return true;
    }

    public static Unit LIZIZ(Application application, WeakReference weakReference, RouteIntent routeIntent, InterfaceC1364105Vn interfaceC1364105Vn) {
        Integer numLJIIJJI;
        int iIntValue;
        String strLIZLLL = C0WWO.LIZLLL(routeIntent, "store_page_version");
        if (strLIZLLL != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strLIZLLL)) != null && (iIntValue = numLJIIJJI.intValue()) != 1 && iIntValue != 3) {
            if (application != null) {
                Unit unitLIZLLL = LIZLLL(application, weakReference, routeIntent, (Uri) LLILLJJLI.getValue(), false, interfaceC1364105Vn);
                if (unitLIZLLL == C099R.LJFF()) {
                    return unitLIZLLL;
                }
                return Unit.LIZ;
            }
        } else if (application != null) {
            Unit unitLJ = LJ(application, weakReference, routeIntent, UriProtector.parse(C1735460vGK.LIZ().shopPageV3), false, interfaceC1364105Vn);
            if (unitLJ == C099R.LJFF()) {
                return unitLJ;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    public static void LJI(Application application, WeakReference weakReference, RouteIntent routeIntent, Uri uri) {
        Uri uri2 = routeIntent.getUri();
        if (uri2 == null) {
            uri2 = Uri.EMPTY;
        }
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(LIZJ(uri2, uri).toString());
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        Context context = (Context) weakReference.get();
        Context context2 = application;
        if (context != null) {
            context2 = context;
        }
        c1537900q7g.getClass();
        new C1541950qED(context2, sparkContext).LIZIZ();
    }

    public static Map LJIIIIZZ(RouteIntent routeIntent, String str, boolean z, String str2) {
        String str3;
        int iLJIIJJI;
        IECommerceHostService iECommerceHostService;
        boolean z2;
        IECommerceHostService iECommerceHostService2;
        boolean z3;
        String name;
        Map mapLIZIZ = C1741890vQh.LIZIZ(routeIntent.getExtra(), "trackParams");
        if (mapLIZIZ == null) {
            mapLIZIZ = new LinkedHashMap();
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(mapLIZIZ);
        concurrentHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        String strLIZLLL = C0WWO.LIZLLL(routeIntent, "shop_active_tab_type");
        String str4 = "";
        if (Intrinsics.LJFF(strLIZLLL, EnumC1739000vM2.HOME.getValue())) {
            str3 = "Home";
        } else if (Intrinsics.LJFF(strLIZLLL, EnumC1739000vM2.PRODUCT.getValue())) {
            str3 = "Product";
        } else if (Intrinsics.LJFF(strLIZLLL, EnumC1739000vM2.CATEGORY.getValue())) {
            str3 = "Category";
        } else if (!Intrinsics.LJFF(strLIZLLL, EnumC1739000vM2.CAMPAIGN.getValue())) {
            str3 = "";
        } else {
            str3 = "Promo";
        }
        C1008603wy.LIZIZ(concurrentHashMap, "default_list_name", str3);
        if (z) {
            Object obj = concurrentHashMap.get("enter_method");
            if (Intrinsics.LJFF(obj, "ka")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(obj);
                sbLIZ.append('_');
                String strLIZLLL2 = C0WWO.LIZLLL(routeIntent, "ka_identifier");
                String str5 = "unknown";
                if (strLIZLLL2 == null) {
                    strLIZLLL2 = "unknown";
                }
                sbLIZ.append(strLIZLLL2);
                sbLIZ.append('_');
                String strLIZLLL3 = C0WWO.LIZLLL(routeIntent, "ka_scene");
                if (strLIZLLL3 != null) {
                    str5 = strLIZLLL3;
                }
                sbLIZ.append(str5);
                concurrentHashMap.put("enter_method", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        Object obj2 = concurrentHashMap.get("author_id");
        String name2 = null;
        if (obj2 != null) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                IAccountDependencyService iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
                if (iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                String name3 = IAccountDependencyService.class.getName();
                if (iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin != null) {
                    name = iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name3, name, z3);
                iECommerceHostService2 = iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin;
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
            }
            iLJIIJJI = Integer.valueOf(Intrinsics.LJFF(((IAccountDependencyService) iECommerceHostService2).getUserId(), obj2) ? 1 : 0);
        } else {
            String strLIZLLL4 = C0WWO.LIZLLL(routeIntent, "is_self");
            if (strLIZLLL4 == null || (iLJIIJJI = C2095008Iq.LJIIJJI(strLIZLLL4)) == null) {
                iLJIIJJI = 0;
            }
        }
        C1008603wy.LIZIZ(concurrentHashMap, "is_self", iLJIIJJI);
        Object obj3 = concurrentHashMap.get("first_source_page");
        if (obj3 == null && (obj3 = concurrentHashMap.get("source_page_type")) == null) {
            obj3 = "";
        }
        C1008603wy.LIZIZ(concurrentHashMap, "origin_source_page", obj3);
        concurrentHashMap.put("page_name", "shop");
        String strLIZLLL5 = C0WWO.LIZLLL(routeIntent, "ka_top_product_id");
        if (strLIZLLL5 != null) {
            str4 = strLIZLLL5;
        }
        C1008603wy.LIZIZ(concurrentHashMap, "pri_product_id", str4);
        concurrentHashMap.put("shop_id", str);
        concurrentHashMap.remove("start_click_time");
        concurrentHashMap.put("subpage_name", str2);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            IApmDependencyService iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin = ApmDependencyService.createIApmDependencyServicebyMonsterPlugin(false);
            if (iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name4 = IApmDependencyService.class.getName();
            if (iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin != null) {
                name2 = iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name2, z2);
            iECommerceHostService = iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin;
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApmDependencyService.class);
        }
        concurrentHashMap.put("traceparent", ((IApmDependencyService) iECommerceHostService).newTrackingTraceparent());
        concurrentHashMap.put("traffic_source_list", C1742080vR0.LIZLLL(7, concurrentHashMap));
        return concurrentHashMap;
    }

    public static void LJFF(Application application, WeakReference weakReference, RouteIntent routeIntent, Uri uri, boolean z) {
        C2010907uF c2010907uF;
        boolean z2;
        SparkContext sparkContext;
        String string;
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        boolean z3;
        final String strLIZJ = C1743690vTb.LIZJ();
        Uri uri2 = routeIntent.getUri();
        if (uri2 == null) {
            uri2 = Uri.EMPTY;
        }
        if (z) {
            Uri uriLIZJ = LIZJ(uri2, uri);
            c2010907uF = new C2010907uF(uriLIZJ, uriLIZJ.toString());
        } else {
            c2010907uF = new C2010907uF(uri, uri.toString());
        }
        c2010907uF.LIZJ("enable_prefetch", "1");
        c2010907uF.LIZJ("original_schema", "aweme");
        c2010907uF.LIZIZ(Long.valueOf(System.currentTimeMillis()));
        c2010907uF.LIZJ("__live_platform__", "webcast");
        HashMap<String, Object> mapLIZJ = C1741890vQh.LIZJ(uri2, "trackParams");
        if (mapLIZJ == null) {
            mapLIZJ = new HashMap<>();
        }
        mapLIZJ.put("traffic_source_list", C1742080vR0.LIZLLL(3, mapLIZJ));
        c2010907uF.LIZJ("trackParams", C1741890vQh.LJIIIIZZ(mapLIZJ));
        String strLIZ = c2010907uF.LIZ("author_id");
        if (strLIZ == null) {
            strLIZ = "";
        }
        C1202220hOG c1202220hOG = C1202220hOG.LIZ;
        Object obj = mapLIZJ.get("list_source_content_id");
        c1202220hOG.getClass();
        n nVarLIZIZ = C1202220hOG.LIZIZ(obj, strLIZ);
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "showcase_native_prefetch", true) >= 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            c2010907uF.LIZJ("session_id", strLIZJ);
            c2010907uF.LIZJ("showcase_native_prefetch", Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "showcase_native_prefetch", true)));
            C1738980vM0.LIZ.getClass();
            C1738980vM0.LIZ(routeIntent, strLIZJ);
            sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(String.valueOf(c2010907uF));
            sparkContext.LJJJZ("sec_link_scene", "deeplink");
            EnumC1740810vOx enumC1740810vOx = EnumC1740810vOx.SHOWCASE_PAGE;
            sparkContext.LJJLIIIJJIZ(new C1733760vDa(enumC1740810vOx.getPageCode()));
            sparkContext.LJJLIIIJJI(new C1733750vDZ(enumC1740810vOx.getPageCode()));
            sparkContext.LJJJJZI(new AbstractC1542200qEc() { // from class: X.0vGN
                @Override // X.AbstractC1537870q7d
                public final void LJLJI(InterfaceC1541990qEH interfaceC1541990qEH) {
                    C1738980vM0 c1738980vM0 = C1738980vM0.LIZ;
                    String str = strLIZJ;
                    c1738980vM0.getClass();
                    C597870Ncf c597870Ncf = (C597870Ncf) ((LinkedHashMap) C1738980vM0.LIZIZ).get(str);
                    if (c597870Ncf != null) {
                        c597870Ncf.LIZJ = new WeakReference<>(interfaceC1541990qEH);
                    }
                }
            });
            sparkContext.LJJ(AbstractC1539010q9T.class, new AbstractC1539010q9T() { // from class: X.0vLx
                @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
                public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                    C1537910q7h c1537910q7h;
                    final String str = strLIZJ;
                    LynxViewClient lynxViewClient = new LynxViewClient() { // from class: X.0vLw
                        @Override // com.lynx.tasm.LynxViewClient
                        public final void LJIILJJIL() {
                            C1738980vM0 c1738980vM0 = C1738980vM0.LIZ;
                            String str2 = str;
                            c1738980vM0.getClass();
                            C597870Ncf c597870NcfRemove = C1738980vM0.LIZIZ.remove(str2);
                            if (c597870NcfRemove != null) {
                                c597870NcfRemove.LIZIZ();
                            }
                        }
                    };
                    if ((interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
                        c1537910q7h.LJIIIIZZ(lynxViewClient);
                    }
                }
            });
        } else {
            sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(String.valueOf(c2010907uF));
            sparkContext.LJJJZ("sec_link_scene", "deeplink");
        }
        Pair[] pairArr = new Pair[1];
        String name = null;
        if (nVarLIZIZ != null) {
            string = nVarLIZIZ.toString();
        } else {
            string = null;
        }
        pairArr[0] = new Pair("recommend_context", string);
        C1547280qMo.LJFF(sparkContext, pairArr);
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        Context context = (Context) weakReference.get();
        if (context == null) {
            context = application;
        }
        c1537900q7g.getClass();
        new C1541950qED(context, sparkContext).LIZIZ();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            String name2 = IAccountDependencyService.class.getName();
            if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z3);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
        }
        boolean zLJFF = Intrinsics.LJFF(((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).getUserId(), strLIZ);
        IEcommerceStoreTechLogService iEcommerceStoreTechLogService = (IEcommerceStoreTechLogService) PluggableExtentionKt.pluggableSpi$default(IEcommerceStoreTechLogService.class, false, false, false, 14, null);
        if (iEcommerceStoreTechLogService != null) {
            iEcommerceStoreTechLogService.LIZ(strLIZ, c2010907uF.LIZ("enter_from"), "showcase", mapLIZJ, zLJFF);
        }
    }

    public static boolean LJII(SparkActivity sparkActivity, StreamUrlStruct streamUrlStruct, Map map, String str, String str2) {
        String string;
        StoreLivePlayAB.StoreLivePlayConfig storeLivePlayConfig = (StoreLivePlayAB.StoreLivePlayConfig) C0C64.LJIILLIIL().LJJII(StoreLivePlayAB.StoreLivePlayConfig.class, null, "ec_store_live_play", true);
        if (storeLivePlayConfig == null) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shop_window_close_time_");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (System.currentTimeMillis() - C1257480ipO.LIZ.getLong(strLIZIZ, 0L) < storeLivePlayConfig.closeMinutes * C538540LAe.LLJJJIL) {
            return false;
        }
        Object obj = map.get("source_previous_page");
        if (obj != null && (string = obj.toString()) != null && !a0.LJJJIL(string) && C13LQ.LJIILLIIL(string, storeLivePlayConfig.blockSources)) {
            return false;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C948503nH.LJ(sparkActivity, C2107308Nj.LIZ, new C1735000vFa(str2, sparkActivity, streamUrlStruct, strLIZIZ, map, null));
        return true;
    }

    public static Unit LIZLLL(Application application, WeakReference weakReference, RouteIntent routeIntent, Uri uri, boolean z, InterfaceC1364105Vn interfaceC1364105Vn) {
        boolean z2;
        String str;
        String string;
        String strLJIIIIZZ;
        EnumC1161720gKw enumC1161720gKw;
        String strLIZ;
        k kVarLJJIIZ;
        int iLJIIJJI;
        TemplateData templateDataLJII;
        Integer numLJ;
        Integer numLJ2;
        Application application2 = application;
        if (uri != null) {
            z2 = true;
            str = "sellerId";
        } else {
            z2 = false;
            str = "seller_id";
        }
        String strLIZLLL = C0WWO.LIZLLL(routeIntent, str);
        if (strLIZLLL == null) {
            strLIZLLL = "";
        }
        Map<String, Object> mapLJIIIIZZ = LJIIIIZZ(routeIntent, strLIZLLL, z2, "store_v2");
        String strLIZJ = C1743690vTb.LIZJ();
        C1202220hOG c1202220hOG = C1202220hOG.LIZ;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) mapLJIIIIZZ;
        Object obj = concurrentHashMap.get("list_source_content_id");
        Object obj2 = concurrentHashMap.get("author_id");
        c1202220hOG.getClass();
        n nVarLIZIZ = C1202220hOG.LIZIZ(obj, obj2);
        if (nVarLIZIZ != null) {
            string = nVarLIZIZ.toString();
        } else {
            string = null;
        }
        C1766860w4y c1766860w4y = C1766860w4y.LIZ;
        EnumC1740810vOx enumC1740810vOx = EnumC1740810vOx.SHOP_PAGE_US;
        PageSourceInfo pageSourceInfoLJFF = C1766860w4y.LJFF(c1766860w4y, new PageSource(enumC1740810vOx.getPageCode(), null), null, null, 6);
        if (pageSourceInfoLJFF != null) {
            strLJIIIIZZ = C1741890vQh.LJIIIIZZ(pageSourceInfoLJFF);
        } else {
            strLJIIIIZZ = null;
        }
        enumC1740810vOx.getPageCode();
        final C1211320hcw c1211320hcw = new C1211320hcw(weakReference);
        if (!C290570BaB.LIZ()) {
            enumC1161720gKw = null;
        } else {
            try {
                C212391189t.LIZ.getClass();
                strLIZ = C212391189t.LIZ("shop_product_data_clip", "SHOP_STORE_PAGE_PRODUCT_LIST_LAYOUT_RECORD");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (strLIZ != null) {
                new p();
                n nVarLJJIJ = p.LIZJ(strLIZ).LJIILIIL().LJJIJ(strLIZLLL);
                if (nVarLJJIJ != null && (kVarLJJIIZ = nVarLJJIJ.LJJIIZ("time")) != null) {
                    if (System.currentTimeMillis() - kVarLJJIIZ.LJIIZILJ() < 86400000) {
                        k kVarLJJIIZ2 = nVarLJJIJ.LJJIIZ("layout");
                        if (kVarLJJIIZ2 != null) {
                            iLJIIJJI = kVarLJJIIZ2.LJIIJJI();
                        } else {
                            iLJIIJJI = 1;
                        }
                        EnumC1161720gKw[] enumC1161720gKwArrValues = EnumC1161720gKw.values();
                        if (iLJIIJJI >= 0 && iLJIIJJI < enumC1161720gKwArrValues.length) {
                            enumC1161720gKw = enumC1161720gKwArrValues[iLJIIJJI];
                        } else {
                            enumC1161720gKw = EnumC1161720gKw.SINGLE_COLUMN;
                        }
                    } else {
                        enumC1161720gKw = EnumC1161720gKw.SINGLE_COLUMN;
                    }
                } else {
                    enumC1161720gKw = EnumC1161720gKw.SINGLE_COLUMN;
                }
            } else {
                enumC1161720gKw = EnumC1161720gKw.SINGLE_COLUMN;
            }
        }
        if (C1165500gR2.LIZ.enable) {
            concurrentHashMap.put("rd_mix_page", C2286608xc.LJ(1));
            C1421105hJ.LIZJ("rd_tiktokec_enter_page", mapLJIIIIZZ);
            n nVarLIZ = LIZ(routeIntent, mapLJIIIIZZ, strLIZLLL, strLIZJ, string, strLJIIIIZZ, enumC1161720gKw, (Context) weakReference.get(), z);
            C1161850gL9.LIZJ("store_interceptor", null);
            C1166240gSE c1166240gSE = new C1166240gSE(strLIZLLL);
            c1166240gSE.LIZIZ = z;
            c1166240gSE.LIZJ = nVarLIZ;
            c1166240gSE.LJIIIZ = strLJIIIIZZ;
            c1166240gSE.LJIIIIZZ = string;
            c1166240gSE.LIZLLL = mapLJIIIIZZ;
            c1166240gSE.LJII = strLIZJ;
            c1166240gSE.LJI = routeIntent;
            if (enumC1161720gKw != null) {
                numLJ2 = C2286608xc.LJ(enumC1161720gKw.getValue());
            } else {
                numLJ2 = null;
            }
            c1166240gSE.LJIIJ = numLJ2;
            Bundle bundle = new Bundle();
            bundle.putLong("start_click_time", System.currentTimeMillis());
            c1166240gSE.LJ = bundle;
            c1166240gSE.LJIIJJI = new C1739160vMI(mapLJIIIIZZ);
            Context context = (Context) weakReference.get();
            C1161850gL9.LIZ(c1166240gSE.LIZ, EnumC1161690gKt.PAGE_CLICK_START, null, null);
            if (C1739050vM7.LIZ == 1) {
                C1739050vM7.LIZ();
            }
            InterfaceC1166330gSN<C0POE<ShopChunkResponse>> interfaceC1166330gSN = c1166240gSE.LJIIJJI;
            if (interfaceC1166330gSN != null) {
                n nVar = c1166240gSE.LIZJ;
                if (nVar == null) {
                    nVar = new n();
                }
                interfaceC1166330gSN.LIZIZ(nVar);
            }
            C1161790gL3.LIZ.put(c1166240gSE.LIZ, c1166240gSE);
            if (c1166240gSE.LIZIZ) {
                if (context instanceof C19EG) {
                    StoreMixFragment storeMixFragment = new StoreMixFragment();
                    Bundle bundle2 = new Bundle();
                    C786410Ut5.LJJJI("container_id", c1166240gSE.LIZ, bundle2);
                    C786410Ut5.LJJJI("shop_id", c1166240gSE.LJFF, bundle2);
                    storeMixFragment.setArguments(bundle2);
                    C19EG c19eg = (C19EG) context;
                    StoreMixFragment.LLJJJJJIL.getClass();
                    C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                    c1390920mIc.LJIIIIZZ(3);
                    TuxSheet tuxSheet = c1390920mIc.LIZ;
                    tuxSheet.LLJJIJI = storeMixFragment;
                    tuxSheet.LLILLJJLI = storeMixFragment;
                    tuxSheet.LLJLLL = true;
                    if (C299110Bnx.LIZ()) {
                        c1390920mIc.LIZ.LLLIIIIL = new TuxMixContainerSheetBehavior();
                    } else {
                        c1390920mIc.LIZ.LLLIIII = new MixContainerBottomSheetBehavior();
                    }
                    TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                    tuxSheet2.LLJLILLLLZIIL = false;
                    tuxSheet2.LLJLL = true;
                    tuxSheet2.LLJJIJIL = null;
                    tuxSheet2.LLJJJ = null;
                    tuxSheet2.show(c19eg.getSupportFragmentManager(), "StoreMixFragment");
                } else {
                    C1019103yf.LIZ(EnumC1014603xw.ERR_SHOP_50000, null, null);
                }
            } else {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://ec/store_mix");
                smartRouteBuildRoute.withParam("container_id", c1166240gSE.LIZ);
                smartRouteBuildRoute.withParam("shop_id", c1166240gSE.LJFF);
                smartRouteBuildRoute.open();
            }
            return Unit.LIZ;
        }
        C054G c054gLIZ = C2296808zG.LIZ(interfaceC1364105Vn.getContext());
        C1DFB c1dfb = C0PEM.LIZJ;
        String str2 = strLIZLLL;
        C099G c099gLIZIZ = C23250099c.LIZIZ(c054gLIZ, c1dfb, null, new C1739070vM9(uri, routeIntent, mapLJIIIIZZ, strLIZLLL, strLIZJ, string, strLJIIIIZZ, enumC1161720gKw, z, c1211320hcw, null), 2);
        if (string == null && strLJIIIIZZ == null) {
            templateDataLJII = null;
        } else {
            HashMap map = new HashMap();
            C1008603wy.LIZIZ(map, "recommend_context", string);
            C1008603wy.LIZIZ(map, "page_source_info", strLJIIIIZZ);
            templateDataLJII = TemplateData.LJII(map);
        }
        AbstractC1539010q9T abstractC1539010q9T = new AbstractC1539010q9T() { // from class: X.0vM5
            @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
            public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                C1537910q7h c1537910q7h;
                C1775710wJF c1775710wJF = new C1775710wJF(c1211320hcw, 0);
                if ((interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
                    c1537910q7h.LJIIIIZZ(c1775710wJF);
                }
            }
        };
        EnumC1740810vOx enumC1740810vOx2 = EnumC1740810vOx.SHOP_PAGE_US;
        String strLIZ2 = C1206000hUM.LIZ(routeIntent, mapLJIIIIZZ, strLIZJ, uri, enumC1740810vOx2);
        if (C290570BaB.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZ2);
            sbLIZ.append("&productListLayout=");
            if (enumC1161720gKw != null) {
                numLJ = C2286608xc.LJ(enumC1161720gKw.getValue());
            } else {
                numLJ = null;
            }
            sbLIZ.append(numLJ);
            strLIZ2 = C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZ2);
        sbLIZ2.append("&enable_half_live_preview=");
        sbLIZ2.append(C291230BbF.LIZ());
        String strLIZ3 = C2010707uD.LIZ(C2286608xc.LJFF(System.currentTimeMillis()), C2188811AlT.LIZIZ(sbLIZ2), "_ec_schema_interception_start_time");
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(strLIZ3);
        sparkContext.LJJ(AbstractC1539010q9T.class, new C1546790qM1(templateDataLJII, c099gLIZIZ));
        sparkContext.LJJ(AbstractC1539010q9T.class, new C1738960vLy(true));
        C1547280qMo.LIZLLL(sparkContext, "store_page_lynx_group_name");
        sparkContext.LJJJJZ(abstractC1539010q9T);
        sparkContext.LJJLIIIJJI(new C1733750vDZ(enumC1740810vOx2.getPageCode()));
        sparkContext.LJJLIIIJJIZ(new C1733760vDa(enumC1740810vOx2.getPageCode()));
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "ecom_shop_showcase_spark_lite", true) == 1) {
            sparkContext.LJJJZ("enable_lite_mode", "1");
            C1538590q8n c1538590q8n = new C1538590q8n();
            c1538590q8n.LIZLLL = false;
            c1538590q8n.LJ = false;
            c1538590q8n.LJFF = false;
            c1538590q8n.LJI = true;
            c1538590q8n.LJIIIZ = true;
            sparkContext.liteLynxConfig = c1538590q8n;
        }
        application2.registerActivityLifecycleCallbacks(c1211320hcw);
        C1161850gL9.LIZJ("store_interceptor", null);
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        Context context2 = (Context) weakReference.get();
        Context context3 = application2;
        if (context2 != null) {
            context3 = context2;
        }
        c1537900q7g.getClass();
        new C1541950qED(context3, sparkContext).LIZIZ();
        C1421105hJ.LIZJ("rd_tiktokec_enter_page", mapLJIIIIZZ);
        C23250099c.LIZIZ(C2296808zG.LIZ(interfaceC1364105Vn.getContext()), c1dfb, null, new C883203ck(str2, String.valueOf(concurrentHashMap.get("enter_from")), strLIZ3, null), 2);
        Unit unit = Unit.LIZ;
        C099R.LJFF();
        return unit;
    }

    public static Unit LJ(Application application, WeakReference weakReference, RouteIntent routeIntent, Uri uri, boolean z, InterfaceC1364105Vn interfaceC1364105Vn) {
        String string;
        String strLJIIIIZZ;
        EnumC1161720gKw enumC1161720gKw;
        ConcurrentHashMap<String, Object> concurrentHashMap;
        Set<String> queryParameterNames;
        Application application2 = application;
        String strLIZLLL = C0WWO.LIZLLL(routeIntent, "sellerId");
        if (strLIZLLL == null) {
            strLIZLLL = "";
        }
        Map mapLJIIIIZZ = LJIIIIZZ(routeIntent, strLIZLLL, true, "store_v3");
        String strLIZJ = C1743690vTb.LIZJ();
        C1202220hOG c1202220hOG = C1202220hOG.LIZ;
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) mapLJIIIIZZ;
        Object obj = concurrentHashMap2.get("list_source_content_id");
        Object obj2 = concurrentHashMap2.get("author_id");
        c1202220hOG.getClass();
        n nVarLIZIZ = C1202220hOG.LIZIZ(obj, obj2);
        if (nVarLIZIZ != null) {
            string = nVarLIZIZ.toString();
        } else {
            string = null;
        }
        C1766860w4y c1766860w4y = C1766860w4y.LIZ;
        EnumC1740810vOx enumC1740810vOx = EnumC1740810vOx.SHOP_PAGE;
        PageSourceInfo pageSourceInfoLJFF = C1766860w4y.LJFF(c1766860w4y, new PageSource(enumC1740810vOx.getPageCode(), null), null, null, 6);
        if (pageSourceInfoLJFF != null) {
            strLJIIIIZZ = C1741890vQh.LJIIIIZZ(pageSourceInfoLJFF);
        } else {
            strLJIIIIZZ = null;
        }
        enumC1740810vOx.getPageCode();
        final C1211320hcw c1211320hcw = new C1211320hcw(weakReference);
        Bundle bundle = new Bundle();
        Uri uri2 = routeIntent.getUri();
        if (uri2 != null && (queryParameterNames = UriProtector.getQueryParameterNames(uri2)) != null) {
            for (String str : queryParameterNames) {
                C786410Ut5.LJJJI(str, C0WWO.LIZLLL(routeIntent, str), bundle);
            }
        }
        C1738990vM1 c1738990vM1 = new C1738990vM1(bundle);
        if (C290570BaB.LIZ()) {
            if (Intrinsics.LJFF(concurrentHashMap2.get("enter_from"), "homepage_hot")) {
                enumC1161720gKw = EnumC1161720gKw.DOUBLE_COLUMN;
            } else {
                enumC1161720gKw = EnumC1161720gKw.SINGLE_COLUMN;
            }
        } else {
            enumC1161720gKw = null;
        }
        final C1739060vM8 c1739060vM8 = new C1739060vM8(enumC1161720gKw);
        C054G c054gLIZ = C2296808zG.LIZ(interfaceC1364105Vn.getContext());
        C1DFB c1dfb = C0PEM.LIZJ;
        String str2 = strLIZLLL;
        C23250099c.LIZLLL(c054gLIZ, c1dfb, null, new C324120CnC(c1738990vM1, uri, c1739060vM8, strLIZLLL, routeIntent, strLIZJ, string, mapLJIIIIZZ, c1211320hcw, z, null), 2);
        if (string == null && strLJIIIIZZ == null) {
            concurrentHashMap = null;
        } else {
            C1008603wy.LIZIZ(c1739060vM8.LIZIZ, "recommend_context", string);
            C1008603wy.LIZIZ(c1739060vM8.LIZIZ, "page_source_info", strLJIIIIZZ);
            concurrentHashMap = c1739060vM8.LIZIZ;
        }
        EnumC1740810vOx enumC1740810vOx2 = EnumC1740810vOx.SHOP_PAGE;
        String strLIZ = C1206000hUM.LIZ(routeIntent, mapLJIIIIZZ, strLIZJ, uri, enumC1740810vOx2);
        if (enumC1161720gKw != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZ);
            sbLIZ.append("&productListLayout=");
            sbLIZ.append(enumC1161720gKw.getValue());
            strLIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZ);
        sbLIZ2.append("&enable_half_live_preview=");
        sbLIZ2.append(C291230BbF.LIZ());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        AbstractC1539010q9T abstractC1539010q9T = new AbstractC1539010q9T() { // from class: X.0vM4
            @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
            public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                C1537910q7h c1537910q7h;
                C1775720wJG c1775720wJG = new C1775720wJG(c1211320hcw, c1739060vM8, 0);
                if ((interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
                    c1537910q7h.LJIIIIZZ(c1775720wJG);
                }
            }
        };
        String strLIZ2 = C2010707uD.LIZ(C2286608xc.LJFF(System.currentTimeMillis()), strLIZIZ, "_ec_schema_interception_start_time");
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(strLIZ2);
        C1547280qMo.LJ(sparkContext, TemplateData.LJII(concurrentHashMap));
        C1547280qMo.LIZLLL(sparkContext, "store_page_lynx_group_name");
        sparkContext.LJJJJZ(abstractC1539010q9T);
        sparkContext.LJJLIIIJJI(new C1733750vDZ(enumC1740810vOx2.getPageCode()));
        sparkContext.LJJLIIIJJIZ(new C1733760vDa(enumC1740810vOx2.getPageCode()));
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "ecom_shop_showcase_spark_lite", true) == 1) {
            sparkContext.LJJJZ("enable_lite_mode", "1");
            sparkContext.LJJIJIIJIL(new AbstractC1538740q92() { // from class: X.0vM6
                {
                    super(0);
                }

                @Override // X.AbstractC1537870q7d
                public final void LJLJI(InterfaceC1541990qEH interfaceC1541990qEH) {
                    C1739060vM8 c1739060vM82 = c1739060vM8;
                    c1739060vM82.getClass();
                    c1739060vM82.LIZJ = new WeakReference<>(interfaceC1541990qEH);
                }
            });
            C1538590q8n c1538590q8n = new C1538590q8n();
            c1538590q8n.LIZLLL = false;
            c1538590q8n.LJ = false;
            c1538590q8n.LJFF = false;
            c1538590q8n.LJI = true;
            c1538590q8n.LJIIIZ = true;
            sparkContext.liteLynxConfig = c1538590q8n;
        } else {
            sparkContext.LJJJJZI(new C1776240wK6(c1739060vM8, 2));
        }
        application2.registerActivityLifecycleCallbacks(c1211320hcw);
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        Context context = (Context) weakReference.get();
        Context context2 = application2;
        if (context != null) {
            context2 = context;
        }
        c1537900q7g.getClass();
        new C1541950qED(context2, sparkContext).LIZIZ();
        C1421105hJ.LIZJ("rd_tiktokec_enter_page", mapLJIIIIZZ);
        C23250099c.LIZIZ(C2296808zG.LIZ(interfaceC1364105Vn.getContext()), c1dfb, null, new C883203ck(str2, String.valueOf(concurrentHashMap2.get("enter_from")), strLIZ2, null), 2);
        Unit unit = Unit.LIZ;
        C099R.LJFF();
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.gson.n LIZ(com.bytedance.router.RouteIntent r11, java.util.Map r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, X.EnumC1161720gKw r17, android.content.Context r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreInterceptor.LIZ(com.bytedance.router.RouteIntent, java.util.Map, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.0gKw, android.content.Context, boolean):com.google.gson.n");
    }
}
