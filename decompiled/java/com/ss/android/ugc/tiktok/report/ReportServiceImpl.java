package com.ss.android.ugc.tiktok.report;

import X.C01GW;
import X.C07K3;
import X.C098200Yq;
import X.C0WZX;
import X.C100C;
import X.C1381180m2u;
import X.C1381270m33;
import X.C1387760mDW;
import X.C1387800mDa;
import X.C13LP;
import X.C1541950qED;
import X.C15438062q;
import X.C1701330uNH;
import X.C189200o6;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1141530foN;
import X.InterfaceC1381130m2p;
import X.InterfaceC1381260m32;
import X.InterfaceC1381350m3B;
import X.InterfaceC1387770mDX;
import X.InterfaceC1387810mDb;
import X.InterfaceC1519030pdF;
import X.InterfaceC1554220qY0;
import X.InterfaceC2217701Bqy;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import androidx.lifecycle.LifecycleObserver;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.pns.product.deps.IPNSProductAppDepService;
import com.ss.android.ugc.tiktok.report.interfaces.IReportInitService;
import com.ss.android.ugc.tiktok.report.interfaces.IReportService;
import com.ss.android.ugc.tiktok.report.utils.ReportConfigUtils;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.text.u;

/* JADX INFO: loaded from: classes22.dex */
public final class ReportServiceImpl implements IReportService {
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(420));

    @Override // com.ss.android.ugc.tiktok.report.interfaces.IReportService
    public final void LIZ(InterfaceC1381260m32 interfaceC1381260m32) {
        ((ArrayList) C1387800mDa.LIZIZ).add(interfaceC1381260m32);
    }

    @Override // com.ss.android.ugc.tiktok.report.interfaces.IReportService
    public final void LIZIZ(InterfaceC1381350m3B interfaceC1381350m3B) {
        ((ArrayList) C1387800mDa.LIZ).add(interfaceC1381350m3B);
    }

    @Override // com.ss.android.ugc.tiktok.report.interfaces.IReportService
    public final void LIZJ(C1381270m33 c1381270m33) {
        C1387800mDa.LIZJ = c1381270m33;
    }

    /* JADX WARN: Type inference failed for: r1v21, types: [X.0mDZ] */
    /* JADX WARN: Type inference failed for: r2v6, types: [X.0mDY] */
    @Override // com.ss.android.ugc.tiktok.report.interfaces.IReportService
    public final void report(Function1<? super InterfaceC1381130m2p, Unit> function1) {
        final Activity topActivity;
        Object c098200Yq;
        double dDoubleValue;
        Map mapLIZIZ;
        IReportInitService iReportInitService = (IReportInitService) PluggableExtentionKt.pluggableSpi$default(IReportInitService.class, false, false, false, 14, null);
        if (iReportInitService != null) {
            iReportInitService.LIZ();
        }
        final C1381180m2u c1381180m2u = new C1381180m2u();
        function1.invoke(c1381180m2u);
        IPNSProductAppDepService iPNSProductAppDepService = (IPNSProductAppDepService) PluggableExtentionKt.pluggableSpi$default(IPNSProductAppDepService.class, false, false, false, 14, null);
        if (iPNSProductAppDepService != null && (topActivity = iPNSProductAppDepService.getTopActivity()) != null) {
            this.LIZIZ.getValue().getClass();
            InterfaceC1519030pdF interfaceC1519030pdFLIZJ = C100C.LIZ.LIZJ();
            Pair[] pairArr = new Pair[4];
            pairArr[0] = new Pair("report_type", c1381180m2u.LIZ);
            String str = c1381180m2u.LIZIZ;
            Object obj = "";
            if (str == null) {
                str = "";
            }
            pairArr[1] = new Pair("object_id", str);
            String str2 = c1381180m2u.LIZJ;
            if (str2 == null) {
                str2 = "";
            }
            pairArr[2] = new Pair("owner_id", str2);
            String str3 = c1381180m2u.LIZLLL.get(Scene.SCENE_SERVICE);
            if (str3 == null) {
                str3 = "";
            }
            pairArr[3] = new Pair(Scene.SCENE_SERVICE, str3);
            interfaceC1519030pdFLIZJ.LIZ("tns_report_entrance_click", C2097608Jq.LJIIIIZZ(pairArr));
            Iterator it2 = ((ArrayList) C1387800mDa.LIZ).iterator();
            String strLIZ = "https://www.tiktok.com/falcon/communitysafety/page/reasons/index.html";
            while (it2.hasNext()) {
                strLIZ = ((InterfaceC1381350m3B) it2.next()).LIZ(c1381180m2u);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it3 = ((ArrayList) C1387800mDa.LIZIZ).iterator();
            while (it3.hasNext()) {
                linkedHashMap.putAll(((InterfaceC1381260m32) it3.next()).LIZ(c1381180m2u));
            }
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("report_type", c1381180m2u.LIZ), new Pair("object_id", c1381180m2u.LIZIZ), new Pair("owner_id", c1381180m2u.LIZJ));
            mapLJIIJ.putAll(c1381180m2u.LIZLLL);
            mapLJIIJ.putAll(c1381180m2u.LJ);
            Uri uri = UriProtector.parse(strLIZ);
            Uri.Builder builderBuildUpon = uri.buildUpon();
            Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(queryParameterNames, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iLIZIZ);
            for (Object obj2 : queryParameterNames) {
                Object objLJJJLL = C13LP.LJJJLL(UriProtector.getQueryParameters(uri, (String) obj2));
                if (objLJJJLL == null) {
                    objLJJJLL = "";
                }
                linkedHashMap2.put(obj2, objLJJJLL);
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.putAll(linkedHashMap);
            linkedHashMap3.putAll(mapLJIIJ);
            for (Map.Entry entry : linkedHashMap3.entrySet()) {
                String str4 = (String) entry.getKey();
                String str5 = (String) entry.getValue();
                if (str5 != null && !linkedHashMap2.containsKey(str4)) {
                    builderBuildUpon.appendQueryParameter(str4, str5);
                }
            }
            String string = builderBuildUpon.build().toString();
            if (u.LJJIIJZLJL(string, "http", false)) {
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("aweme://webview/?url=");
                    sbLIZ.append(URLEncoder.encode(string, "UTF-8"));
                    sbLIZ.append("&disable_hardware_accelerate=1");
                    c098200Yq = C2188811AlT.LIZIZ(sbLIZ);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                    obj = c098200Yq;
                }
                string = (String) obj;
            }
            if (ReportConfigUtils.INSTANCE.resolveNavType(c1381180m2u) == 0) {
                if (!c1381180m2u.LJIIIZ) {
                    Bundle bundle = new Bundle();
                    InterfaceC1387810mDb interfaceC1387810mDb = C1387800mDa.LIZJ;
                    if (interfaceC1387810mDb != null && (mapLIZIZ = interfaceC1387810mDb.LIZIZ(c1381180m2u)) != null) {
                        for (Map.Entry entry2 : mapLIZIZ.entrySet()) {
                            String str6 = (String) entry2.getKey();
                            Object value = entry2.getValue();
                            if (value instanceof String) {
                                C786410Ut5.LJJJI(str6, (String) value, bundle);
                            } else if (value instanceof Integer) {
                                bundle.putInt(str6, ((Number) value).intValue());
                            } else if (value instanceof Boolean) {
                                bundle.putBoolean(str6, ((Boolean) value).booleanValue());
                            } else if (value instanceof Float) {
                                bundle.putFloat(str6, ((Number) value).floatValue());
                            } else if (value instanceof Double) {
                                bundle.putDouble(str6, ((Number) value).doubleValue());
                            } else if (value instanceof Long) {
                                bundle.putLong(str6, ((Number) value).longValue());
                            } else if (value instanceof Parcelable) {
                                C786410Ut5.LJJIJL(bundle, str6, (Parcelable) value);
                            }
                        }
                    }
                    String string2 = UUID.randomUUID().toString();
                    C1387800mDa.LIZLLL.put(string2, c1381180m2u);
                    String str7 = ReportWebContainer._pnsPageId;
                    Intent intent = new Intent(topActivity, (Class<?>) ReportWebContainer.class);
                    intent.putExtra("url", string);
                    intent.putExtra("session_id", string2);
                    intent.putExtras(bundle);
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(topActivity, intent, "Context_startActivity_1");
                    C1701330uNH.LIZ(intent, topActivity);
                    C2204961BRm.LJJJJJL(topActivity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2wwd3M8baS6Zo/BzibWSIGbVZyYOebwOkKA+eo+jNjD", null));
                    return;
                }
                final InterfaceC1387770mDX interfaceC1387770mDXLIZIZ = C1387760mDW.LIZIZ(c1381180m2u);
                final ?? r1 = new InterfaceC1141530foN() { // from class: X.0mDZ
                    @Override // X.InterfaceC1141530foN
                    public final void mh2(C262100zr c262100zr) {
                        Map<String, Object> mapLIZ;
                        Map<String, Object> mapLIZ2;
                        InterfaceC1381790m3t interfaceC1381790m3t = c1381180m2u.LJI;
                        if (interfaceC1381790m3t != null) {
                            String str8 = c262100zr.LIZ;
                            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
                            if (interfaceC1107590evd != null) {
                                mapLIZ2 = interfaceC1107590evd.LIZ();
                            } else {
                                mapLIZ2 = null;
                            }
                            interfaceC1381790m3t.LIZ(str8, mapLIZ2);
                        }
                        InterfaceC1387770mDX interfaceC1387770mDX = interfaceC1387770mDXLIZIZ;
                        if (interfaceC1387770mDX != null) {
                            String str9 = c262100zr.LIZ;
                            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
                            if (interfaceC1107590evd2 != null) {
                                mapLIZ = interfaceC1107590evd2.LIZ();
                            } else {
                                mapLIZ = null;
                            }
                            interfaceC1387770mDX.LIZ(str9, mapLIZ, null, topActivity);
                        }
                    }
                };
                SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                Map<String, Double> map = C07K3.LIZ;
                Map<String, Double> map2 = (Map) settingsManagerLIZLLL.LJIIIIZZ("report_sdk_height_configuration", Map.class, map);
                if (map2 != null) {
                    map = map2;
                }
                Double d = map.get(c1381180m2u.LIZ);
                if (d == null && (d = map.get("server_default")) == null) {
                    dDoubleValue = 0.9d;
                } else {
                    dDoubleValue = d.doubleValue();
                }
                SparkContext sparkContextLIZ = C1387760mDW.LIZ(c1381180m2u, topActivity, string, interfaceC1387770mDXLIZIZ);
                sparkContextLIZ.LJJLIIIJJIZ(new InterfaceC1554220qY0() { // from class: X.0mDT
                    @Override // X.InterfaceC1554220qY0
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJII() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIIIIZZ() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIIIZ() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIIJ() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIIJJI(SparkPopup sparkPopup, LayoutInflater layoutInflater) {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIILIIL(SparkPopup sparkPopup, View view) {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIILJJIL(SparkPopup sparkPopup) {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIILL(SparkPopup sparkPopup, int i) {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIILLIIL() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIIZILJ(SparkPopup sparkPopup) {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIJ() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final boolean LJIJI(SparkPopup sparkPopup) {
                        return false;
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final boolean LJIJJ(SparkPopup sparkPopup) {
                        return false;
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIJJLI(SparkPopup sparkPopup, float f) {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIL(SparkPopup sparkPopup) {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJJ() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJJII() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final boolean LJJIII(SparkPopup sparkPopup, SparkContext sparkContext) {
                        return false;
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJJIIJ(SparkPopup sparkPopup) {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJJIIJZLJL(SparkPopup sparkPopup, boolean z) {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJJIIZ() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJJIIZI() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void onViewAttachedToWindow() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void onViewDetachedFromWindow() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJJI(SparkPopup sparkPopup) {
                        Set<String> set = c1381180m2u.LJII;
                        if (set != null) {
                            C1387790mDZ c1387790mDZ = r1;
                            Iterator<T> it4 = set.iterator();
                            while (it4.hasNext()) {
                                C1548820qPI.LJIIIIZZ((String) it4.next(), c1387790mDZ);
                            }
                        }
                        InterfaceC1387770mDX interfaceC1387770mDX = interfaceC1387770mDXLIZIZ;
                        if (interfaceC1387770mDX != null) {
                            interfaceC1387770mDX.LIZJ(topActivity);
                        }
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJJIFFI(SparkPopup sparkPopup) {
                        LifecycleObserver lifecycleObserver = c1381180m2u.LJFF;
                        if (lifecycleObserver != null) {
                            sparkPopup.getLifecycle().addObserver(lifecycleObserver);
                        }
                        InterfaceC1387770mDX interfaceC1387770mDX = interfaceC1387770mDXLIZIZ;
                        if (interfaceC1387770mDX != null) {
                            interfaceC1387770mDX.LIZIZ(sparkPopup.getLifecycle());
                        }
                        Set<String> set = c1381180m2u.LJII;
                        if (set != null) {
                            C1387790mDZ c1387790mDZ = r1;
                            Iterator<T> it4 = set.iterator();
                            while (it4.hasNext()) {
                                C1548820qPI.LIZLLL((String) it4.next(), c1387790mDZ);
                            }
                        }
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIIL(SparkPopup sparkPopup, Configuration configuration) {
                        InterfaceC1387770mDX interfaceC1387770mDX = interfaceC1387770mDXLIZIZ;
                        if (interfaceC1387770mDX != null) {
                            interfaceC1387770mDX.LIZLLL(sparkPopup.requireActivity());
                        }
                    }
                });
                sparkContextLIZ.LJJJZ("gravity", "bottom");
                sparkContextLIZ.LJJJZ("transition_animation", "bottom");
                sparkContextLIZ.LJJJLZIJ(14, "radius");
                sparkContextLIZ.LJJL("show_mask", true);
                sparkContextLIZ.LJJJZ("mask_bg_color", "00000080");
                sparkContextLIZ.LJJJZ("enable_relative_calculation", "1");
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append((int) (dDoubleValue * ((double) 100)));
                sbLIZ2.append('%');
                sparkContextLIZ.LJJJZ("height", C2188811AlT.LIZIZ(sbLIZ2));
                Function1<? super SparkContext, Unit> function12 = c1381180m2u.LJIIJ;
                if (function12 != null) {
                    function12.invoke(sparkContextLIZ);
                }
                C1541950qED.LIZJ.getClass();
                new C1541950qED(topActivity, sparkContextLIZ).LIZIZ();
                return;
            }
            final InterfaceC1387770mDX interfaceC1387770mDXLIZIZ2 = C1387760mDW.LIZIZ(c1381180m2u);
            final ?? r2 = new InterfaceC1141530foN() { // from class: X.0mDY
                @Override // X.InterfaceC1141530foN
                public final void mh2(C262100zr c262100zr) {
                    Map<String, Object> mapLIZ;
                    Map<String, Object> mapLIZ2;
                    InterfaceC1381790m3t interfaceC1381790m3t = c1381180m2u.LJI;
                    if (interfaceC1381790m3t != null) {
                        String str8 = c262100zr.LIZ;
                        InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
                        if (interfaceC1107590evd != null) {
                            mapLIZ2 = interfaceC1107590evd.LIZ();
                        } else {
                            mapLIZ2 = null;
                        }
                        interfaceC1381790m3t.LIZ(str8, mapLIZ2);
                    }
                    InterfaceC1387770mDX interfaceC1387770mDX = interfaceC1387770mDXLIZIZ2;
                    if (interfaceC1387770mDX != null) {
                        String str9 = c262100zr.LIZ;
                        InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
                        if (interfaceC1107590evd2 != null) {
                            mapLIZ = interfaceC1107590evd2.LIZ();
                        } else {
                            mapLIZ = null;
                        }
                        interfaceC1387770mDX.LIZ(str9, mapLIZ, null, topActivity);
                    }
                }
            };
            SparkContext sparkContextLIZ2 = C1387760mDW.LIZ(c1381180m2u, topActivity, string, interfaceC1387770mDXLIZIZ2);
            sparkContextLIZ2.LJJLIIIJJI(new InterfaceC2217701Bqy() { // from class: X.0mDU
                @Override // X.InterfaceC2217701Bqy
                public final Context LIZJ(Context context) {
                    return context;
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJIILLIIL(boolean z) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJIL(Activity activity, Context context) {
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
                public final void LJJIIZI(SparkActivity sparkActivity, Bundle bundle2) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJIJIIJI(SparkActivity sparkActivity) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJIL(SparkActivity sparkActivity, Bundle bundle2) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJIZ(SparkActivity sparkActivity, int i, String[] strArr, int[] iArr) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJJ(SparkActivity sparkActivity) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJJJJ(SparkActivity sparkActivity) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJJJZI(SparkActivity sparkActivity) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJLIIIJJI(SparkActivity sparkActivity) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJLIIIJJIZ(SparkActivity sparkActivity) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final boolean LJJLIIIJLLLLLLLZ(SparkActivity sparkActivity) {
                    return false;
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJLIIJ(SparkActivity sparkActivity, Bundle bundle2) {
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
                public final void onActivityResult(int i, int i2, Intent intent2) {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void onRestoreInstanceState(Bundle bundle2) {
                }

                @Override // X.InterfaceC1163130gND
                public final void release() {
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJJJLL(SparkActivity sparkActivity) {
                    Set<String> set = c1381180m2u.LJII;
                    if (set != null) {
                        C1387780mDY c1387780mDY = r2;
                        Iterator<T> it4 = set.iterator();
                        while (it4.hasNext()) {
                            C1548820qPI.LJIIIIZZ((String) it4.next(), c1387780mDY);
                        }
                    }
                    InterfaceC1387770mDX interfaceC1387770mDX = interfaceC1387770mDXLIZIZ2;
                    if (interfaceC1387770mDX != null) {
                        interfaceC1387770mDX.LIZJ(sparkActivity);
                    }
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJJJJL(SparkActivity sparkActivity, Configuration configuration) {
                    InterfaceC1387770mDX interfaceC1387770mDX = interfaceC1387770mDXLIZIZ2;
                    if (interfaceC1387770mDX != null) {
                        interfaceC1387770mDX.LIZLLL(sparkActivity);
                    }
                }

                @Override // X.InterfaceC2217701Bqy
                public final void LJJLIIIJL(SparkActivity sparkActivity, Bundle bundle2) {
                    LifecycleObserver lifecycleObserver = c1381180m2u.LJFF;
                    if (lifecycleObserver != null) {
                        sparkActivity.getLifecycle().addObserver(lifecycleObserver);
                    }
                    InterfaceC1387770mDX interfaceC1387770mDX = interfaceC1387770mDXLIZIZ2;
                    if (interfaceC1387770mDX != null) {
                        interfaceC1387770mDX.LIZIZ(sparkActivity.getLifecycle());
                    }
                    Set<String> set = c1381180m2u.LJII;
                    if (set != null) {
                        C1387780mDY c1387780mDY = r2;
                        Iterator<T> it4 = set.iterator();
                        while (it4.hasNext()) {
                            C1548820qPI.LIZLLL((String) it4.next(), c1387780mDY);
                        }
                    }
                }
            });
            Function1<? super SparkContext, Unit> function13 = c1381180m2u.LJIIJ;
            if (function13 != null) {
                function13.invoke(sparkContextLIZ2);
            }
            C1541950qED.LIZJ.getClass();
            new C1541950qED(topActivity, sparkContextLIZ2).LIZIZ();
        }
    }
}
