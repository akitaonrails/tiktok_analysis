package com.ss.android.ugc.aweme.music;

import X.AbstractC1539010q9T;
import X.AbstractC1542200qEc;
import X.C1537900q7g;
import X.C1541950qED;
import X.C19324810j0;
import X.C19325110j3;
import X.C19325910jB;
import X.C19326010jC;
import X.C1976907ol;
import X.C2429209fW;
import X.InterfaceC2217701Bqy;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.internal.r;
import com.google.gson.n;
import com.ss.android.ugc.aweme.experiment.MusicThirdPartyPerformanceConfigModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.ui.MusicLandingPageViewModel;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import java.util.Map;
import kotlin.jvm.internal.AFwS263S0000000_23;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class MusicThirdPartyInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        String host2 = null;
        if (routeIntent != null) {
            host = routeIntent.getHost();
        } else {
            host = null;
        }
        if (!TextUtils.equals(host, "music_third_party_webview")) {
            if (routeIntent != null) {
                host2 = routeIntent.getHost();
            }
            if (!TextUtils.equals(host2, "third_party_common_webview")) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Intent extra;
        final String stringExtra;
        String stringExtra2;
        String stringExtra3;
        String stringExtra4;
        if (context == null || routeIntent == null || (extra = routeIntent.getExtra()) == null) {
            return false;
        }
        long longExtra = extra.getLongExtra("anchor_click_time", -1L);
        C19324810j0.LIZ.getClass();
        C19324810j0.LIZIZ = longExtra;
        String stringExtra5 = null;
        try {
            stringExtra = extra.getStringExtra("anchor_subtype");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (!TextUtils.equals(routeIntent.getHost(), "music_third_party_webview")) {
            return false;
        }
        try {
            String stringExtra6 = extra.getStringExtra("url");
            if (stringExtra6 != null) {
                String strDecode = Uri.decode(stringExtra6);
                Uri.Builder builder = C19325110j3.LIZ;
                try {
                    stringExtra2 = extra.getStringExtra("anchor_id");
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    stringExtra2 = null;
                }
                C19325110j3.LIZIZ = stringExtra2;
                Uri.Builder builderAppendQueryParameter = C19325110j3.LIZ.appendQueryParameter("report_type", "third_party_anchor");
                try {
                    stringExtra3 = extra.getStringExtra("group_id");
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    stringExtra3 = null;
                }
                Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("object_id", stringExtra3);
                try {
                    stringExtra4 = extra.getStringExtra("author_id");
                } catch (Exception e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    stringExtra4 = null;
                }
                Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("owner_id", stringExtra4).appendQueryParameter("anchor_id", C19325110j3.LIZIZ);
                try {
                    stringExtra5 = extra.getStringExtra("url");
                } catch (Exception e5) {
                    TryCatchGuardChecker.doCheck(e5);
                }
                builderAppendQueryParameter3.appendQueryParameter("report_url", stringExtra5);
                new Object() { // from class: X.10j1
                }.getClass();
                String string = UriProtector.parse("aweme://webview").buildUpon().appendQueryParameter("url", strDecode).appendQueryParameter("use_spark", "1").appendQueryParameter("enable_scc", "1").toString();
                C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                SparkContext sparkContext = new SparkContext();
                sparkContext.bid = "music_third_party";
                sparkContext.LJJLIIJ(string);
                sparkContext.LJJJJL(C2429209fW.LIZ().appendDataFlowId(sparkContext.bundle, "402685956"));
                sparkContext.bizCert = new ThirdPartyBizCert(402685956);
                sparkContext.LJJJZ("nav_btn_type", "more");
                sparkContext.LJJJLZIJ(1, "show_web_url");
                sparkContext.LJJLIIIJLLLLLLLZ(new C19326010jC());
                sparkContext.LJJLIIIJLJLI(new C19325910jB());
                sparkContext.LJJLIIIJJI(new InterfaceC2217701Bqy() { // from class: X.10j6
                    public long LL;
                    public boolean LLILLJJLI;
                    public long LLILLL;

                    @Override // X.InterfaceC2217701Bqy
                    public final Context LIZJ(Context context2) {
                        return context2;
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJIILLIIL(boolean z) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJIL(Activity activity, Context context2) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJI(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJIII(SparkActivity sparkActivity, boolean z) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJIIJZLJL(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJIJIIJI(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJIL(SparkActivity sparkActivity, Bundle bundle) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJIZ(SparkActivity sparkActivity, int i, String[] strArr, int[] iArr) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJJ(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJJJJL(SparkActivity sparkActivity, Configuration configuration) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJJJZI(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJLIIIJJI(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJLIIIJL(SparkActivity sparkActivity, Bundle bundle) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final boolean LJJLIIIJLLLLLLLZ(SparkActivity sparkActivity) {
                        return false;
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJLIIJ(SparkActivity sparkActivity, Bundle bundle) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJLJLI(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJLL(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void finish() {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void onActivityResult(int i, int i2, Intent intent) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void onRestoreInstanceState(Bundle bundle) {
                    }

                    @Override // X.InterfaceC1163130gND
                    public final void release() {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJJJJ(SparkActivity sparkActivity) {
                        if (!this.LLILLJJLI) {
                            this.LLILLJJLI = true;
                            this.LLILLL = SystemClock.elapsedRealtime();
                        }
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJJJLL(SparkActivity sparkActivity) {
                        C1440005kM.LIZ(new C585740MyC(SystemClock.elapsedRealtime() - this.LL));
                        C19325710j9.LIZ.getClass();
                        C19325710j9.LIZIZ = "safe";
                        C19325110j3.LIZIZ = "";
                        C19325110j3.LIZ.clearQuery();
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJLIIIJJIZ(SparkActivity sparkActivity) {
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("anchor_id", C19325110j3.LIZIZ);
                        C20684815ws.LJIILLIIL("tns_tiktok_3Panchor_webview_page_show", c2344009Gk.LIZ);
                        if (this.LLILLJJLI) {
                            this.LLILLJJLI = false;
                            this.LL += SystemClock.elapsedRealtime() - this.LLILLL;
                        }
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJIIZI(SparkActivity sparkActivity, Bundle bundle) {
                        C19327010jM c19327010jM;
                        this.LL = SystemClock.elapsedRealtime();
                        sparkActivity.getClass();
                        C19325710j9.LIZ.getClass();
                        C19325710j9.LJFF = sparkActivity;
                        C19325710j9.LIZJ = sparkActivity.LL;
                        C19325710j9.LJII = (MusicLandingPageViewModel) ViewModelProviders.of(sparkActivity).get(MusicLandingPageViewModel.class);
                        SparkActivity sparkActivity2 = C19325710j9.LJFF;
                        MusicLandingPageViewModel musicLandingPageViewModel = null;
                        if (sparkActivity2 != null) {
                            c19327010jM = new C19327010jM(sparkActivity2);
                        } else {
                            c19327010jM = null;
                        }
                        C19325710j9.LJI = c19327010jM;
                        if (Intrinsics.LJFF(C19325710j9.LIZIZ, "no_internet")) {
                            C19325710j9.LIZIZ = "safe";
                            MusicLandingPageViewModel musicLandingPageViewModel2 = C19325710j9.LJII;
                            if (musicLandingPageViewModel2 != null) {
                                musicLandingPageViewModel = musicLandingPageViewModel2;
                            }
                            musicLandingPageViewModel.vQ2("safe");
                            C19325710j9.LJ = true;
                        }
                    }
                });
                sparkContext.LJJJJZI(new AbstractC1542200qEc(stringExtra) { // from class: X.10j5
                    public final String LLILLJJLI;
                    public boolean LLILLL;

                    {
                        this.LLILLJJLI = stringExtra;
                    }

                    @Override // X.AbstractC1537870q7d
                    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                        final WebKitView webKitView;
                        C19325710j9.LIZ.getClass();
                        if (!Intrinsics.LJFF(C19325710j9.LIZIZ, "safe") && !Intrinsics.LJFF(C19325710j9.LIZIZ, "loading")) {
                            return;
                        }
                        C19324810j0 c19324810j0 = C19324810j0.LIZ;
                        String str = this.LLILLJJLI;
                        c19324810j0.getClass();
                        MusicThirdPartyPerformanceConfigModel musicThirdPartyPerformanceConfigModel = (MusicThirdPartyPerformanceConfigModel) SettingsManager.LIZLLL().LJIIIIZZ("music_third_party_performance_config", MusicThirdPartyPerformanceConfigModel.class, C19326710jJ.LIZ);
                        if (musicThirdPartyPerformanceConfigModel == null) {
                            musicThirdPartyPerformanceConfigModel = new MusicThirdPartyPerformanceConfigModel();
                        }
                        if (musicThirdPartyPerformanceConfigModel.enable && musicThirdPartyPerformanceConfigModel.subType.contains(str) && (interfaceC1541990qEH instanceof WebKitView) && interfaceC1541990qEH != null && (webKitView = (WebKitView) interfaceC1541990qEH) != null) {
                            String url = webKitView.getUrl();
                            if (TextUtils.isEmpty(url)) {
                                return;
                            }
                            final Uri uri = UriProtector.parse(url);
                            C1544770qIl.LIZ(webKitView, new C0X8I() { // from class: X.10j4
                                @Override // X.AbstractC1544900qIy
                                public final void LJIIJJI(Object obj) {
                                    C19324810j0 c19324810j02 = C19324810j0.LIZ;
                                    if (!(obj instanceof JSONObject)) {
                                        obj = null;
                                    }
                                    String strValueOf = String.valueOf(obj);
                                    Uri uri2 = uri;
                                    WebBackForwardList webBackForwardListCopyBackForwardList = webKitView.copyBackForwardList();
                                    c19324810j02.getClass();
                                    if (strValueOf.length() != 0) {
                                        C2344009Gk c2344009Gk = new C2344009Gk();
                                        if (C19324810j0.LIZIZ > 0) {
                                            MusicThirdPartyPerformanceConfigModel musicThirdPartyPerformanceConfigModel2 = (MusicThirdPartyPerformanceConfigModel) SettingsManager.LIZLLL().LJIIIIZZ("music_third_party_performance_config", MusicThirdPartyPerformanceConfigModel.class, C19326710jJ.LIZ);
                                            if (musicThirdPartyPerformanceConfigModel2 == null) {
                                                musicThirdPartyPerformanceConfigModel2 = new MusicThirdPartyPerformanceConfigModel();
                                            }
                                            boolean z = false;
                                            for (String str2 : musicThirdPartyPerformanceConfigModel2.host) {
                                                String host = uri2.getHost();
                                                if (host != null && a0.LJJIIZI(host, str2, false)) {
                                                    z = true;
                                                }
                                            }
                                            if (z) {
                                                long jElapsedRealtime = SystemClock.elapsedRealtime() - C19324810j0.LIZIZ;
                                                if (jElapsedRealtime > 0) {
                                                    c2344009Gk.LIZLLL(jElapsedRealtime, "click_to_page_show");
                                                }
                                                C19324810j0.LIZIZ = 0L;
                                            }
                                        }
                                        for (Map.Entry<String, Object> entry : new C1920707fh((n) GsonProtectorUtils.fromJson(((GsonProvider) ServiceManager.get().getService(GsonProvider.class)).getGson(), strValueOf, n.class)).entrySet()) {
                                            if (!Intrinsics.LJFF(entry.getKey(), "url") && !Intrinsics.LJFF(entry.getKey(), "eventName")) {
                                                c2344009Gk.LIZLLL(((r) entry.getValue()).longValue(), entry.getKey());
                                            } else {
                                                c2344009Gk.LJFF(entry.getKey(), String.valueOf(entry.getValue()));
                                            }
                                        }
                                        c2344009Gk.LIZJ(webBackForwardListCopyBackForwardList.getCurrentIndex() + 1, "pageDepth");
                                        C20684815ws.LJIILLIIL("music_third_party_performance", c2344009Gk.LIZ);
                                    }
                                }
                            });
                        }
                    }

                    @Override // X.AbstractC1537870q7d
                    public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
                        if (this.LLILLL) {
                            C19325710j9.LIZ.getClass();
                            if (Intrinsics.LJFF(C19325710j9.LIZIZ, "no_internet")) {
                                C19325710j9.LIZIZ = "safe";
                                MusicLandingPageViewModel musicLandingPageViewModel = C19325710j9.LJII;
                                if (musicLandingPageViewModel == null) {
                                    musicLandingPageViewModel = null;
                                }
                                musicLandingPageViewModel.vQ2("safe");
                                C19325710j9.LJ = true;
                            }
                            this.LLILLL = false;
                            C19325710j9.LJ = false;
                        }
                    }

                    @Override // X.AbstractC1537870q7d
                    public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2) {
                        if (!this.LLILLL) {
                            this.LLILLL = true;
                            C19325710j9.LIZ.getClass();
                            C19325710j9.LJ = true;
                        }
                    }
                });
                sparkContext.LJJJJZ(new AbstractC1539010q9T() { // from class: X.10iy
                    @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
                    public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                        if (C1324960kaE.LIZ[interfaceC1531560pxS.getType().ordinal()] == 1) {
                            ((C1541480qDS) interfaceC1531560pxS).LIZJ = new C844210X9v() { // from class: X.10iz
                                @Override // X.AbstractC2205961BVi
                                public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
                                    C1537480q70 hybridContext;
                                    InterfaceC1892990zMP interfaceC1892990zMP;
                                    C1537480q70 hybridContext2;
                                    InterfaceC1892990zMP interfaceC1892990zMP2;
                                    C1540240qBS.LIZ.getClass();
                                    if (C1540240qBS.LIZIZ(webView) > 1) {
                                        if ((webView instanceof WebKitView) && webView != null && (hybridContext2 = ((WebKitView) webView).getHybridContext()) != null && (interfaceC1892990zMP2 = (InterfaceC1892990zMP) hybridContext2.LJFF(InterfaceC1892990zMP.class)) != null) {
                                            interfaceC1892990zMP2.LJJJJ(true);
                                            return;
                                        }
                                        return;
                                    }
                                    if (!(webView instanceof WebKitView) || webView == null || (hybridContext = ((WebKitView) webView).getHybridContext()) == null || (interfaceC1892990zMP = (InterfaceC1892990zMP) hybridContext.LJFF(InterfaceC1892990zMP.class)) == null) {
                                        return;
                                    }
                                    interfaceC1892990zMP.LJJJJ(false);
                                }
                            };
                        }
                    }
                });
                sparkContext.LJJJJZ(new AbstractC1539010q9T() { // from class: X.0plD
                    @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
                    public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                        if (C1523670pkj.LIZ[interfaceC1531560pxS.getType().ordinal()] == 1) {
                            ((C1541480qDS) interfaceC1531560pxS).LJII(C1523990plF.class, AFwS263S0000000_23.get$arr$(48));
                        }
                    }
                });
                sparkContext.LJJJJZ(new AbstractC1539010q9T() { // from class: X.0v0J
                    @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
                    public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                        C1541480qDS c1541480qDS;
                        if ((interfaceC1531560pxS instanceof C1541480qDS) && (c1541480qDS = (C1541480qDS) interfaceC1531560pxS) != null) {
                            c1541480qDS.LJIILLIIL = true;
                        }
                    }
                });
                c1537900q7g.getClass();
                new C1541950qED(context, sparkContext).LIZIZ();
                return true;
            }
        } catch (Exception e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        return false;
    }
}
