package com.ss.android.ugc.aweme.search.thirdpartylandingpage.core.viewmodel;

import X.AbstractC1067810dtT;
import X.C0P9W;
import X.C0PEM;
import X.C0PIV;
import X.C123100dR;
import X.C12O0;
import X.C1388190mED;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1397620mTQ;
import X.C1397660mTU;
import X.C1497050p3n;
import X.C1499930p8R;
import X.C1499960p8U;
import X.C1554300qY8;
import X.C1976907ol;
import X.C19EG;
import X.C1BH1;
import X.C1BH2;
import X.C1BH3;
import X.C1BH4;
import X.C1BH9;
import X.C1BHA;
import X.C1BHB;
import X.C1BHE;
import X.C1BHP;
import X.C20684815ws;
import X.C2175251ABf;
import X.C2175261ABg;
import X.C2188811AlT;
import X.C2202231BGz;
import X.C2202271BHd;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C2435109gT;
import X.C2435209gU;
import X.C679340Qkm;
import X.InterfaceC1196790hFV;
import X.InterfaceC2173531A4p;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.search.thirdpartylandingpage.core.model.SearchLandingPageExtraData;
import com.ss.android.ugc.aweme.search.thirdpartylandingpage.core.viewmodel.SearchLandingPageViewModel;
import com.ss.android.ugc.aweme.search.thirdpartylandingpage.core.viewmodel.SearchThirdPartyInterceptor;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import com.zhiliaoapp.musically.R;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS281S0000000_34;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.AwS613S0100000_34;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class SearchThirdPartyInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        String path;
        String host2;
        Uri uri;
        Uri uri2;
        Uri uri3;
        Uri uri4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String path2 = null;
        if (routeIntent != null && (uri4 = routeIntent.getUri()) != null) {
            host = uri4.getHost();
        } else {
            host = null;
        }
        sbLIZ.append(host);
        if (routeIntent != null && (uri3 = routeIntent.getUri()) != null) {
            path = uri3.getPath();
        } else {
            path = null;
        }
        sbLIZ.append(path);
        if (!TextUtils.equals(C2188811AlT.LIZIZ(sbLIZ), "search_third_party")) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            if (routeIntent != null && (uri2 = routeIntent.getUri()) != null) {
                host2 = uri2.getHost();
            } else {
                host2 = null;
            }
            sbLIZ2.append(host2);
            if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
                path2 = uri.getPath();
            }
            sbLIZ2.append(path2);
            if (!TextUtils.equals(C2188811AlT.LIZIZ(sbLIZ2), "search_third_party/")) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static String LIZ(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.1BHE] */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.09gT] */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.09gU] */
    /* JADX WARN: Type inference failed for: r6v3, types: [X.1ABf] */
    public static void LIZIZ(final Context context, String str) {
        if (!C1BH1.LIZ) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C1499930p8R(null), 3);
            C1BH1.LIZ = true;
        }
        final C1497050p3n c1497050p3n = new C1497050p3n();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C1499960p8U(c1497050p3n, null), 3);
        final SparkThirdContext sparkThirdContext = new SparkThirdContext();
        final C1BHB c1bhb = new C1BHB(str, C1BH1.LIZ, c1497050p3n);
        sparkThirdContext.url = str;
        sparkThirdContext.callback = c1bhb;
        sparkThirdContext.bizCert = new ThirdPartyBizCert(402685960);
        ArrayList arrayList = new ArrayList();
        if (!C1BH2.LIZ) {
            arrayList.add(new C12O0(context.getString(2131847173), R.raw.icon_flag, new AwS577S0100000_33((C2175251ABf) new InterfaceC2173531A4p() { // from class: X.1ABf
                @Override // X.InterfaceC2173531A4p
                public final void LIZ() {
                    IReportService iReportServiceLJJ = ComplianceServiceProvider.LJJ();
                    Activity activityLIZ = C1388190mED.LIZ(context);
                    Uri.Builder builder = C2175261ABg.LIZ;
                    iReportServiceLJJ.LIZIZ(activityLIZ, C2175261ABg.LIZ);
                }
            }, 3859)));
        }
        arrayList.add(new C12O0(context.getString(2131847172), R.raw.icon_arrow_clockwise, new AwS578S0100000_34((C1BHE) new InterfaceC2173531A4p() { // from class: X.1BHE
            @Override // X.InterfaceC2173531A4p
            public final void LIZ() {
                InterfaceC1059280dfi interfaceC1059280dfi;
                String str2 = C1BHA.LLILZ;
                if (Intrinsics.LJFF(str2, "not_secure") || Intrinsics.LJFF(str2, "protection") || (interfaceC1059280dfi = sparkThirdContext.container) == null) {
                    return;
                }
                interfaceC1059280dfi.refresh();
            }
        }, 111)));
        arrayList.add(new C12O0(context.getString(2131847169), R.raw.icon_compass, new AwS578S0100000_34((C2435109gT) new InterfaceC2173531A4p() { // from class: X.09gT
            @Override // X.InterfaceC2173531A4p
            public final void LIZ() {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                String strLJ = c1bhb.LJ();
                if (strLJ.length() != 0) {
                    try {
                        intent.setData(UriProtector.parse(strLJ));
                        Intent intent2 = new Intent("android.intent.action.VIEW", UriProtector.parse(strLJ));
                        C2429209fW.LIZ().appendDataFlowId(intent2, 1207967489);
                        Activity activityLIZ = C1388190mED.LIZ(context);
                        if (activityLIZ != null) {
                            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activityLIZ, intent2, "Context_startActivity_1");
                            C1701330uNH.LIZ(intent2, activityLIZ);
                            C2204961BRm.LJIILLIIL(activityLIZ, intent2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtYo3N1HzlBTpcs9DldXFAf/+OSb4Cs8L4MRMdCrDtUd9DazYTNy4i34IciEcqI/SZFV58V9jqIMesYiuhrTIlhX+8BfOpIv6iW/KeMiEQKipjoPce", null));
                        }
                    } catch (ActivityNotFoundException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        }, 110)));
        arrayList.add(new C12O0(context.getString(2131847164), R.raw.icon_link, new AwS578S0100000_34((C2435209gU) new InterfaceC2173531A4p() { // from class: X.09gU
            @Override // X.InterfaceC2173531A4p
            public final void LIZ() {
                String strLJ = c1bhb.LJ();
                Object objH2 = C786410Ut5.H2(context, "clipboard");
                ClipboardManager clipboardManager = objH2 instanceof ClipboardManager ? (ClipboardManager) objH2 : null;
                ClipData clipDataNewPlainText = ClipData.newPlainText(strLJ, strLJ);
                if (clipboardManager != null) {
                    try {
                        C20145713s7.LIZJ(clipboardManager, clipDataNewPlainText, CertProviderManagerKt.findCert("bpea-search_3d_party_page", 1476399124));
                    } catch (C838130WuJ e) {
                        TryCatchGuardChecker.doCheck(e);
                        return;
                    }
                }
                Activity activityLIZ = C1388190mED.LIZ(context);
                if (activityLIZ != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                    c1389890mGx.LJFF(R.raw.icon_tick_fill_small);
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a0i, activityLIZ);
                    c1389890mGx.LJI(numLIZJ != null ? numLIZJ.intValue() : 0);
                    c1389890mGx.LJIIIZ(2131847163);
                    c1389890mGx.LJIIJJI();
                }
            }
        }, 109)));
        sparkThirdContext.actions = arrayList;
        sparkThirdContext.disableOpenInSystem = true;
        sparkThirdContext.titleBar = new C1BHA();
        sparkThirdContext.statusView = new C1BH9(sparkThirdContext);
        sparkThirdContext.progressBar = new AbstractC1067810dtT() { // from class: X.0dFU
            public View LIZ;
            public C427480GpW LIZIZ;

            @Override // X.InterfaceC1542250qEh
            public final void LIZ(boolean z) {
                int i;
                View view = this.LIZ;
                if (view == null) {
                    return;
                }
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                C786410Ut5.LJLLLLLL(i, view);
            }

            @Override // X.InterfaceC1542250qEh
            public final View LIZIZ(Context context2) {
                View viewTd = C786410Ut5.Td(C786410Ut5.ne(context2), R.layout.f0u, null, false);
                this.LIZ = viewTd;
                if (viewTd == null) {
                    viewTd = null;
                }
                this.LIZIZ = (C427480GpW) viewTd.findViewById(R.id.m58);
                View view = this.LIZ;
                if (view == null) {
                    return null;
                }
                return view;
            }

            @Override // X.InterfaceC1542250qEh
            public final void setProgress(int i) {
                C427480GpW c427480GpW = this.LIZIZ;
                if (c427480GpW == null) {
                    return;
                }
                c427480GpW.setProgress(i);
            }
        };
        sparkThirdContext.activityCallback = new C1BHP(sparkThirdContext) { // from class: X.1BH5
            public final SparkThirdContext LIZ;
            public long LIZIZ = -1;
            public boolean LIZJ;

            @Override // X.C1BHP
            public final void LIZLLL() {
            }

            @Override // X.C1BHP
            public final void LJ() {
            }

            @Override // X.C1BHP
            public final void LJI() {
            }

            @Override // X.C1BHP
            public final void LJII() {
            }

            @Override // X.C1BHP
            public final void LJIIIIZZ() {
            }

            @Override // X.C1BHP
            public final void LJIIIZ() {
            }

            @Override // X.C1BHP
            public final void LJIILIIL() {
            }

            @Override // X.C1BHP
            public final void LJIIZILJ() {
            }

            @Override // X.C1BHP
            public final boolean onBackPressed() {
                return false;
            }

            @Override // X.C1BHP
            public final void LJFF() {
                if (this.LIZJ) {
                    C1BH3 c1bh3 = C1BH3.LIZ;
                    long j = this.LIZIZ;
                    c1bh3.getClass();
                    C1BH3.LIZLLL(j);
                }
                C1BH3.LIZ.getClass();
                C2344009Gk c2344009Gk = new C2344009Gk();
                C2344009Gk c2344009Gk2 = C1BH3.LIZIZ;
                c2344009Gk.LJII(c2344009Gk2.LIZ);
                C1BH6.LIZ.getClass();
                String str2 = C1BH6.LIZIZ;
                c2344009Gk.LJFF("is_edge_case", (Intrinsics.LJFF(str2, "safe") || Intrinsics.LJFF(str2, "loading")) ? CardStruct.IStatusCode.DEFAULT : "1");
                LinkedHashMap linkedHashMap = (LinkedHashMap) C1BH3.LIZJ;
                String str3 = (String) linkedHashMap.get("business_event_keys_close");
                if (C123100dR.LIZ(str3)) {
                    C20684815ws.LJIILLIIL(str3, c2344009Gk.LIZ);
                } else {
                    C20684815ws.LJIILLIIL("search_webpage_close", c2344009Gk.LIZ);
                }
                C1BH6.LIZIZ = "safe";
                C1BH6.LIZLLL = null;
                C2175261ABg.LIZ.clearQuery();
                ((HashMap) c2344009Gk2.LIZ).clear();
                linkedHashMap.clear();
            }

            @Override // X.C1BHP
            public final void LJIJJLI() {
                this.LIZIZ = System.currentTimeMillis();
                this.LIZJ = true;
            }

            {
                this.LIZ = sparkThirdContext;
            }

            @Override // X.C1BHP
            public final void LIZ(C19EG c19eg) {
                C2173521A4o c2173521A4o;
                this.LIZIZ = System.currentTimeMillis();
                C1BH6 c1bh6 = C1BH6.LIZ;
                SparkThirdContext sparkThirdContext2 = this.LIZ;
                c1bh6.getClass();
                C1BH6.LIZLLL = sparkThirdContext2;
                C1BH6.LJI = c19eg;
                if (c19eg instanceof SparkActivity) {
                    C1BH6.LIZJ = ((SparkActivity) c19eg).LL;
                }
                C1BH6.LJIIIIZZ = (SearchLandingPageViewModel) ViewModelProviders.of(c19eg).get(SearchLandingPageViewModel.class);
                C19EG c19eg2 = C1BH6.LJI;
                SearchLandingPageViewModel searchLandingPageViewModel = null;
                if (c19eg2 != null) {
                    c2173521A4o = new C2173521A4o(c19eg2);
                } else {
                    c2173521A4o = null;
                }
                C1BH6.LJII = c2173521A4o;
                if (Intrinsics.LJFF(C1BH6.LIZIZ, "no_internet") || Intrinsics.LJFF(C1BH6.LIZIZ, "broken")) {
                    C1BH6.LIZIZ = "safe";
                    SearchLandingPageViewModel searchLandingPageViewModel2 = C1BH6.LJIIIIZZ;
                    if (searchLandingPageViewModel2 != null) {
                        searchLandingPageViewModel = searchLandingPageViewModel2;
                    }
                    searchLandingPageViewModel.vQ2("safe");
                    C1BH6.LJFF = true;
                }
            }

            @Override // X.C1BHP
            public final void LIZIZ(C19EG c19eg) {
                if (!c19eg.isFinishing()) {
                    this.LIZJ = false;
                    C1BH3 c1bh3 = C1BH3.LIZ;
                    long j = this.LIZIZ;
                    c1bh3.getClass();
                    C1BH3.LIZLLL(j);
                }
            }
        };
        final boolean z = C1BH1.LIZ;
        sparkThirdContext.webViewClient = new C2202271BHd(z, c1497050p3n) { // from class: X.1BH7
            public final boolean LIZ;
            public final C1497050p3n LIZIZ;
            public int LIZLLL;
            public final List<String> LIZJ = new ArrayList();
            public final C1BHG LJ = new C1BHG();

            @Override // X.C2202271BHd
            public final WebResourceResponse LIZJ(String str2) {
                boolean zLIZIZ;
                C1497050p3n c1497050p3n2;
                JSONObject jSONObjectLIZIZ;
                String strOptString;
                if (this.LIZ && !C13LP.LJJJJ(str2, this.LIZJ)) {
                    C1BH6.LIZ.getClass();
                    try {
                        zLIZIZ = C036E.LIZ.LIZIZ();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        zLIZIZ = false;
                    }
                    if (zLIZIZ && (c1497050p3n2 = this.LIZIZ) != null && (jSONObjectLIZIZ = c1497050p3n2.LIZIZ(str2)) != null) {
                        try {
                            JSONObject jSONObject = JSONObjectProtectorUtils.getJSONObject(jSONObjectLIZIZ, "data");
                            C1BH4 c1bh4 = C1BH4.LIZ;
                            String string = JSONObjectProtectorUtils.getString(jSONObjectLIZIZ, "scc_logid");
                            c1bh4.getClass();
                            C1BH4.LIZJ = string;
                            C1BH4.LIZIZ = JSONObjectProtectorUtils.getString(jSONObjectLIZIZ, "scc_reason");
                            strOptString = jSONObject.optString("label");
                        } catch (JSONException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            strOptString = null;
                        }
                        if (strOptString == null) {
                            return null;
                        }
                        if (Intrinsics.LJFF(strOptString, "deny")) {
                            C1BH6 c1bh6 = C1BH6.LIZ;
                            if (str2 == null) {
                                str2 = "";
                            }
                            c1bh6.getClass();
                            C1BH6.LJ = str2;
                            C1BH6.LIZIZ = "not_secure";
                            return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
                        }
                        if (Intrinsics.LJFF(strOptString, "notice")) {
                            C1BH6 c1bh62 = C1BH6.LIZ;
                            if (str2 == null) {
                                str2 = "";
                            }
                            c1bh62.getClass();
                            C1BH6.LJ = str2;
                            C1BH6.LIZIZ = "protection";
                            return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
                        }
                        C1BH4.LIZ.getClass();
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJFF("scc_logid", C1BH4.LIZJ);
                        c2344009Gk.LJFF("scc_reason", C1BH4.LIZIZ);
                        C20684815ws.LJIILLIIL("edge_case_no_show", c2344009Gk.LIZ);
                        return this.LIZIZ.LJFF(str2);
                    }
                }
                return null;
            }

            {
                this.LIZ = z;
                this.LIZIZ = c1497050p3n;
            }

            @Override // X.C2202271BHd
            public final void LIZ(WebView webView, String str2) {
                C1540240qBS.LIZ.getClass();
                int iLIZIZ = C1540240qBS.LIZIZ(webView);
                if (C13LP.LJJJJ(str2, this.LIZJ) && iLIZIZ < this.LIZLLL) {
                    C1BH6.LIZ.getClass();
                    C1BH6.LIZIZ = "safe";
                    SearchLandingPageViewModel searchLandingPageViewModel = C1BH6.LJIIIIZZ;
                    if (searchLandingPageViewModel == null) {
                        searchLandingPageViewModel = null;
                    }
                    searchLandingPageViewModel.vQ2("safe");
                }
                if (!C13LP.LJJJJ(str2, this.LIZJ)) {
                    C1BH6.LIZ.getClass();
                    if (!C1BH6.LIZIZ()) {
                        if (str2 != null) {
                            ((ArrayList) this.LIZJ).add(str2);
                        }
                        this.LIZLLL = iLIZIZ;
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:51:0x00b9  */
            @Override // X.C2202271BHd
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ(final android.webkit.WebView r5, java.lang.String r6) {
                /*
                    r4 = this;
                    java.util.List<java.lang.String> r0 = r4.LIZJ
                    boolean r0 = X.C13LP.LJJJJ(r6, r0)
                    r2 = 0
                    if (r0 == 0) goto L3e
                    X.1BH6 r0 = X.C1BH6.LIZ
                    r0.getClass()
                    boolean r0 = X.C1BH6.LIZIZ()
                    if (r0 == 0) goto L3d
                    java.lang.String r0 = "safe"
                    X.C1BH6.LIZIZ = r0
                    com.ss.android.ugc.aweme.search.thirdpartylandingpage.core.viewmodel.SearchLandingPageViewModel r1 = X.C1BH6.LJIIIIZZ
                    if (r1 != 0) goto L1d
                    r1 = r2
                L1d:
                    java.lang.String r0 = "loading"
                    r1.vQ2(r0)
                    X.1A4o r1 = X.C1BH6.LJII
                    if (r1 == 0) goto L3d
                    android.view.ViewParent r0 = r1.getParent()
                    if (r0 == 0) goto L3d
                    android.view.ViewParent r0 = r1.getParent()
                    boolean r0 = r0 instanceof android.view.ViewGroup
                    if (r0 == 0) goto L3d
                    android.view.ViewParent r0 = r1.getParent()
                    android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                    X.C786410Ut5.LJJJLZIJ(r1, r0)
                L3d:
                    return
                L3e:
                    X.1BH6 r0 = X.C1BH6.LIZ
                    r0.getClass()
                    boolean r0 = X.C1BH6.LIZIZ()
                    if (r0 == 0) goto L3d
                    X.0p3n r3 = r4.LIZIZ
                    if (r3 == 0) goto L3d
                    X.1A4o r1 = X.C1BH6.LJII
                    if (r1 == 0) goto L5e
                    java.lang.String r0 = X.C1BH6.LIZIZ
                    r1.setCurrentStatus$search_release(r0)
                    X.1BH8 r0 = new X.1BH8
                    r0.<init>()
                    r1.setCurrentStatusView$search_release(r0)
                L5e:
                    com.bytedance.hybrid.spark.third.router.SparkThirdContext r0 = X.C1BH6.LIZLLL
                    if (r0 == 0) goto L90
                    X.1BHH r1 = r0.webView
                    boolean r0 = r1 instanceof android.view.ViewGroup
                    if (r0 == 0) goto L8e
                    android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                L6a:
                    X.1A4o r0 = X.C1BH6.LJII
                    X.C1BH6.LIZ(r0, r1)
                L6f:
                    X.1BH3 r0 = X.C1BH3.LIZ
                    r0.getClass()
                    X.C1BH3.LIZIZ()
                    com.ss.android.ugc.aweme.search.thirdpartylandingpage.core.viewmodel.SearchLandingPageViewModel r1 = X.C1BH6.LJIIIIZZ
                    if (r1 != 0) goto L7c
                    r1 = r2
                L7c:
                    java.lang.String r0 = X.C1BH6.LIZIZ
                    r1.vQ2(r0)
                    com.ss.android.ugc.aweme.search.thirdpartylandingpage.core.viewmodel.SearchLandingPageViewModel r0 = X.C1BH6.LJIIIIZZ
                    if (r0 == 0) goto L86
                    r2 = r0
                L86:
                    java.lang.String r1 = X.C1BH6.LJ
                    androidx.lifecycle.MutableLiveData<java.lang.String> r0 = r2.LLILLL
                    r0.setValue(r1)
                    return
                L8e:
                    r1 = r2
                    goto L6a
                L90:
                    com.bytedance.hybrid.spark.SparkContext r0 = X.C1BH6.LIZJ
                    if (r0 == 0) goto Lb9
                    X.0puj r1 = X.C1529870puj.LIZ
                    java.lang.String r0 = r0.containerId
                    r1.getClass()
                    X.0qEH r1 = X.C1529870puj.LJFF(r0)
                    if (r1 == 0) goto Lb9
                    boolean r0 = r1 instanceof android.view.View
                    if (r0 == 0) goto Lb9
                    android.view.View r1 = (android.view.View) r1
                    android.view.ViewParent r1 = r1.getParent()
                    if (r1 == 0) goto Lb9
                    boolean r0 = r1 instanceof X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB
                    if (r0 == 0) goto Lb9
                    android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                Lb3:
                    X.1A4o r0 = X.C1BH6.LJII
                    X.C1BH6.LIZ(r0, r1)
                    goto L6f
                Lb9:
                    r1 = r2
                    goto Lb3
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1BH7.LIZIZ(android.webkit.WebView, java.lang.String):void");
            }

            @Override // X.C2202271BHd
            public final void LIZLLL(WebView webView, WebResourceRequest webResourceRequest) {
                Uri url;
                if (!this.LIZ) {
                    return;
                }
                if (webResourceRequest != null) {
                    url = webResourceRequest.getUrl();
                } else {
                    url = null;
                }
                LIZJ(String.valueOf(url));
            }

            @Override // X.C2202271BHd
            public final boolean LJ(final WebView webView, WebResourceRequest webResourceRequest) throws Throwable {
                String host;
                String scheme;
                Uri url;
                C1497050p3n c1497050p3n2;
                Uri url2;
                Uri url3;
                Uri url4;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("host ");
                Uri url5 = null;
                if (webResourceRequest != null && (url4 = webResourceRequest.getUrl()) != null) {
                    host = url4.getHost();
                } else {
                    host = null;
                }
                sbLIZ.append(host);
                sbLIZ.append(' ');
                if (webResourceRequest != null && (url3 = webResourceRequest.getUrl()) != null) {
                    scheme = url3.getScheme();
                } else {
                    scheme = null;
                }
                sbLIZ.append(scheme);
                sbLIZ.append(' ');
                if (webResourceRequest != null) {
                    url = webResourceRequest.getUrl();
                } else {
                    url = null;
                }
                sbLIZ.append(url);
                C2188811AlT.LIZIZ(sbLIZ);
                C1BHG c1bhg = this.LJ;
                c1bhg.getClass();
                if (webView != null && webResourceRequest != null && (url2 = webResourceRequest.getUrl()) != null) {
                    int iIntValue = ((Number) C079A.LIZ.getValue()).intValue();
                    if (iIntValue != 1) {
                        if (iIntValue != 6 && Intrinsics.LJFF(url2.getHost(), "lemon8.onelink.me") && webView.getContext() != null) {
                            new C828330WeV(new ThirdPartyBizCert(402685960)).LIZIZ(webView.getContext(), url2.toString(), new InterfaceC828360WeY() { // from class: X.0vlB
                                @Override // X.InterfaceC828360WeY
                                public final void LIZ(Context context2, String str2) throws Throwable {
                                    Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(str2));
                                    try {
                                        C19EG c19egLIZ = C657990PrR.LIZ(webView);
                                        if (c19egLIZ != null) {
                                            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19egLIZ, intent, "Context_startActivity_1");
                                            C1701330uNH.LIZ(intent, c19egLIZ);
                                            C2204961BRm.LLJJJJ(c19egLIZ, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtYo3N1HzhDDRLpI72YnZMf+rOTrgB6IgwXZfTPhC+9mPRZSaqRRWNG+mQew7Qad0IytI38xS8LaSMDD2XwPdtZK2l+UcLLgA=", null));
                                        }
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        C1AF0.LJFF(e, "search_no_browser");
                                    }
                                }
                            }, null);
                            return true;
                        }
                    } else {
                        String scheme2 = url2.getScheme();
                        if (C13LP.LJJJJ(scheme2, C1697810uHb.LJIIJJI("snssdk2657", "market"))) {
                            if (Intrinsics.LJFF(scheme2, "snssdk2657")) {
                                Intent intent = new Intent("android.intent.action.VIEW", url2);
                                try {
                                    C19EG c19egLIZ = C657990PrR.LIZ(webView);
                                    if (c19egLIZ != null) {
                                        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19egLIZ, intent, "Context_startActivity_1");
                                        C1701330uNH.LIZ(intent, c19egLIZ);
                                        C2204961BRm.LLJJJJ(c19egLIZ, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtYo3N1HzhDDRLpI72YnZMf+rOTrgB6IgwXZfTPhC+9mPRZSaqRRWNG+mQew7Qad0IytI38xS8LaSMDD2XwPdtZK2l+UcLLgA=", null));
                                    }
                                    c1bhg.LIZ = true;
                                    return true;
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    c1bhg.LIZ = false;
                                    return true;
                                }
                            }
                            if (Intrinsics.LJFF(scheme2, "market") && Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(url2, FollowStatusChangeMethod.PARAM_UID), "com.bd.nproject")) {
                                if (c1bhg.LIZ) {
                                    c1bhg.LIZ = false;
                                    return true;
                                }
                                Intent intent2 = new Intent("android.intent.action.VIEW", url2);
                                try {
                                    C19EG c19egLIZ2 = C657990PrR.LIZ(webView);
                                    if (c19egLIZ2 != null) {
                                        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19egLIZ2, intent2, "Context_startActivity_1");
                                        C1701330uNH.LIZ(intent2, c19egLIZ2);
                                        C2204961BRm.LLJJJJ(c19egLIZ2, intent2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtYo3N1HzhDDRLpI72YnZMf+rOTrgB6IgwXZfTPhC+9mPRZSaqRRWNG+mQew7Qad0IytI38xS8LaSMDD2XwPdtZK2l+UcLLgA=", null));
                                        return true;
                                    }
                                    return true;
                                } catch (Exception e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                    C1AF0.LJFF(e2, "search_no_store");
                                    return true;
                                }
                            }
                        }
                    }
                }
                if (this.LIZ && (c1497050p3n2 = this.LIZIZ) != null) {
                    if (webResourceRequest != null) {
                        url5 = webResourceRequest.getUrl();
                    }
                    c1497050p3n2.LIZ(String.valueOf(url5));
                }
                return false;
            }
        };
        C1554300qY8.LIZIZ(context, sparkThirdContext);
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [X.1BGz] */
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Uri uri;
        Intent extra;
        String strLIZ;
        SearchLandingPageExtraData searchLandingPageExtraData;
        boolean z;
        SearchThirdPartyDisclaimerVM searchThirdPartyDisclaimerVM;
        if (routeIntent != null) {
            uri = routeIntent.getUri();
        } else {
            uri = null;
        }
        if (uri == null || context == null || (extra = routeIntent.getExtra()) == null || (strLIZ = LIZ(extra, "url")) == null) {
            return false;
        }
        String strDecode = Uri.decode(strLIZ);
        String strLIZ2 = LIZ(extra, "click_time");
        C1BH4.LIZ.getClass();
        if (strLIZ2 != null) {
            CastLongProtector.parseLong(strLIZ2);
        }
        String strLIZ3 = LIZ(extra, "business_event_keys");
        if (C123100dR.LIZ(strLIZ3)) {
            try {
                JSONObject jSONObjectLIZIZ = C0PIV.LIZIZ(strLIZ3);
                if (jSONObjectLIZIZ != null) {
                    C1BH3.LIZ.getClass();
                    C1BH3.LIZJ(jSONObjectLIZIZ);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1BH3.LIZ.getClass();
                C1BH3.LIZJ(null);
            }
        } else {
            C1BH3.LIZ.getClass();
            C1BH3.LIZJ(null);
        }
        String strLIZ4 = LIZ(extra, "mob_extra");
        try {
            searchLandingPageExtraData = (SearchLandingPageExtraData) GsonProtectorUtils.fromJson(((GsonProvider) ServiceManager.get().getService(GsonProvider.class)).getGson(), strLIZ4, SearchLandingPageExtraData.class);
        } catch (s e2) {
            TryCatchGuardChecker.doCheck(e2);
            searchLandingPageExtraData = null;
        }
        String strLIZ5 = LIZ(extra, "business_event_tracking");
        String strLIZ6 = LIZ(extra, "report_event_tracking");
        if (strLIZ5 != null && strLIZ5.length() != 0) {
            JSONObject jSONObjectLIZIZ2 = C0PIV.LIZIZ(strLIZ5);
            if (jSONObjectLIZIZ2 != null) {
                C1BH3.LIZ.getClass();
                for (Map.Entry<String, Object> entry : JsonExtKt.toMap(jSONObjectLIZIZ2).entrySet()) {
                    C1BH3.LIZIZ.LJFF(entry.getKey(), entry.getValue().toString());
                }
            }
        } else if (searchLandingPageExtraData != null) {
            LIZJ(strLIZ4, searchLandingPageExtraData, false, strDecode);
        }
        if (strLIZ6 != null && strLIZ6.length() != 0) {
            JSONObject jSONObjectLIZIZ3 = C0PIV.LIZIZ(strLIZ6);
            if (jSONObjectLIZIZ3 != null) {
                Uri.Builder builder = C2175261ABg.LIZ;
                builder.appendQueryParameter("report_url", strDecode);
                builder.appendQueryParameter("report_type", "outstation_res");
                for (Map.Entry<String, Object> entry2 : JsonExtKt.toMap(jSONObjectLIZIZ3).entrySet()) {
                    C2175261ABg.LIZ.appendQueryParameter(entry2.getKey(), entry2.getValue().toString());
                }
            }
        } else if (searchLandingPageExtraData != null) {
            LIZJ(strLIZ4, searchLandingPageExtraData, true, strDecode);
        }
        String strLIZ7 = LIZ(extra, "should_hide_report_function");
        if (strLIZ7 != null) {
            z = Boolean.parseBoolean(strLIZ7);
        } else {
            z = false;
        }
        C1BH2.LIZ = z;
        if (Boolean.parseBoolean(LIZ(extra, "need_disclaimer"))) {
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ != null && (searchThirdPartyDisclaimerVM = (SearchThirdPartyDisclaimerVM) C679340Qkm.LIZIZ(null, c19egLIZIZ).get(SearchThirdPartyDisclaimerVM.class)) != null) {
                AFwS281S0000000_34 aFwS281S0000000_34 = AFwS281S0000000_34.get$arr$(44);
                ?? r9 = new Function1<C1397660mTU, Unit>(context, extra, strLIZ) { // from class: X.1BGz
                    public final /* synthetic */ Context LLILLJJLI;
                    public final /* synthetic */ String LLILLL;

                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(C1397660mTU c1397660mTU) {
                        SearchThirdPartyInterceptor searchThirdPartyInterceptor = this.LL;
                        Context context2 = this.LLILLJJLI;
                        String str = this.LLILLL;
                        searchThirdPartyInterceptor.getClass();
                        SearchThirdPartyInterceptor.LIZIZ(context2, str);
                        C1BH3.LIZ.getClass();
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJII(C1BH3.LIZIZ.LIZ);
                        c2344009Gk.LJIIIIZZ("click_type", "click_continue");
                        C20684815ws.LJIILLIIL("search_card_click", c2344009Gk.LIZ);
                        return Unit.LIZ;
                    }

                    {
                        this.LLILLL = strLIZ;
                    }
                };
                C0P9W c0p9w = (C0P9W) searchThirdPartyDisclaimerVM.LL.getValue();
                if (true != c0p9w.LLILLJJLI) {
                    c0p9w.LLILLJJLI = true;
                    ((LiveData) c0p9w.LLILLL.getValue()).setValue(0);
                }
                C1397580mTM c1397580mTM = new C1397580mTM(context);
                c1397580mTM.LJFF(2131836750);
                c1397580mTM.LIZ(2131836747);
                C1397620mTQ c1397620mTQ = new C1397620mTQ(context);
                c1397620mTQ.LJFF(2131836749, new AwS613S0100000_34((C2202231BGz) r9, 90));
                c1397620mTQ.LJII(2131836748, new AwS613S0100000_34(91));
                c1397580mTM.LJIIL = c1397620mTQ;
                c1397580mTM.LIZLLL(new AwS376S0200000_10(aFwS281S0000000_34, searchThirdPartyDisclaimerVM, 93));
                c1397580mTM.LJI = new InterfaceC1196790hFV() { // from class: X.1BH0
                    @Override // X.InterfaceC1196790hFV
                    public final void onWindowFocusChanged(boolean z2) {
                        C2211751BhN.LJ(C2211751BhN.LJIIIZ(), false);
                    }
                };
                new C1397510mTF(c1397580mTM).LIZLLL();
            }
            C1BH3.LIZ.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJII(C1BH3.LIZIZ.LIZ);
            c2344009Gk.LJIIIIZZ("show_type", "disclaimer");
            C20684815ws.LJIILLIIL("search_card_show", c2344009Gk.LIZ);
            return true;
        }
        LIZIZ(context, strLIZ);
        return true;
    }

    public static void LIZJ(String str, SearchLandingPageExtraData searchLandingPageExtraData, boolean z, String str2) {
        if (str != null && str.length() != 0) {
            if (z) {
                Uri.Builder builder = C2175261ABg.LIZ;
                builder.appendQueryParameter("object_id", searchLandingPageExtraData.searchResultId);
                builder.appendQueryParameter("report_url", str2);
                builder.appendQueryParameter("img_url", searchLandingPageExtraData.cardImageUrl);
                builder.appendQueryParameter("title", searchLandingPageExtraData.cardTitle);
                builder.appendQueryParameter("page_type", searchLandingPageExtraData.pageType);
                builder.appendQueryParameter("report_type", "outstation_res");
                return;
            }
            C1BH3.LIZ.getClass();
            C2344009Gk c2344009Gk = C1BH3.LIZIZ;
            c2344009Gk.LJFF("enter_from", searchLandingPageExtraData.enterFrom);
            c2344009Gk.LJFF("page_type", searchLandingPageExtraData.pageType);
            c2344009Gk.LJFF("search_keyword", searchLandingPageExtraData.searchKeyWord);
            c2344009Gk.LJFF("token_type", searchLandingPageExtraData.tokenType);
            c2344009Gk.LJFF("search_id", searchLandingPageExtraData.searchId);
            c2344009Gk.LJFF("search_result_id", searchLandingPageExtraData.searchResultId);
            if (Intrinsics.LJFF(searchLandingPageExtraData.listItemId, "")) {
                return;
            }
            c2344009Gk.LJFF("list_item_id", searchLandingPageExtraData.listItemId);
            c2344009Gk.LJFF("list_result_type", searchLandingPageExtraData.listItemType);
        }
    }
}
