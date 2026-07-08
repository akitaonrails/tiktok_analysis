package com.ss.android.ugc.aweme.utils;

import X.C01GW;
import X.C452501pT;
import X.EnumC860460XpE;
import androidx.lifecycle.Lifecycle;
import ayh.i5;
import com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService;
import com.ss.android.ugc.aweme.services.performance.LagDataCallback;
import dtj.u7;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AwS99S1000000_14;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public final class oh {
    public static final oh LIZ = new oh();
    public static int LIZIZ = -1;
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2124));
    public static final Set<String> LIZLLL = new LinkedHashSet();

    public static final ICreativePerformanceMonitorService LIZ() {
        return (ICreativePerformanceMonitorService) LIZJ.getValue();
    }

    public static final void LJ(String str) {
        if (!((Boolean) i5.LIZ.getValue()).booleanValue()) {
            return;
        }
        LIZ().stopBlockMonitor(str);
        LIZ().stopFpsMonitor(str);
    }

    public static final void LIZIZ(String str, int i, long j, PerformanceMonitorCallbacks performanceMonitorCallbacks) {
        LIZJ(str, i, j, performanceMonitorCallbacks, null);
    }

    public static final void LIZJ(final String str, int i, long j, final PerformanceMonitorCallbacks performanceMonitorCallbacks, final EnumC860460XpE enumC860460XpE) {
        Function0<HashMap<String, String>> function0;
        if (((Boolean) i5.LIZ.getValue()).booleanValue()) {
            if (u7.LIZ() && !u7.LIZLLL()) {
                return;
            }
            LIZ().startBlockMonitor(str, i, j, new LagDataCallback() { // from class: X.0XpL
                @Override // com.ss.android.ugc.aweme.services.performance.LagDataCallback
                public final void onDataAvailable(JSONObject jSONObject) {
                    C20684815ws.LJIJ("tool_performance_block_info", jSONObject);
                }
            });
            ICreativePerformanceMonitorService iCreativePerformanceMonitorServiceLIZ = LIZ();
            LagDataCallback lagDataCallback = new LagDataCallback() { // from class: X.0XpK
                /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
                @Override // com.ss.android.ugc.aweme.services.performance.LagDataCallback
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onDataAvailable(org.json.JSONObject r4) throws org.json.JSONException {
                    /*
                        r3 = this;
                        java.lang.String r2 = r1
                        int r1 = r2.hashCode()
                        r0 = -1296320088(0xffffffffb2bbb9a8, float:-2.1854092E-8)
                        if (r1 == r0) goto L5b
                        r0 = 410592618(0x1879256a, float:3.2201385E-24)
                        if (r1 == r0) goto L2c
                        r0 = 529224001(0x1f8b5141, float:5.900321E-20)
                        if (r1 != r0) goto L1d
                        java.lang.String r0 = "tool_publish_enter"
                        boolean r0 = r2.equals(r0)
                        if (r0 != 0) goto L35
                    L1d:
                        X.0XpE r1 = r3
                        if (r1 == 0) goto L26
                        java.lang.String r0 = "action"
                        r4.put(r0, r1)
                    L26:
                        java.lang.String r0 = "tool_performance_fps_info"
                        X.C20684815ws.LJIJ(r0, r4)
                        return
                    L2c:
                        java.lang.String r0 = "tool_edit_enter"
                        boolean r0 = r2.equals(r0)
                        if (r0 != 0) goto L35
                        goto L1d
                    L35:
                        com.ss.android.ugc.aweme.utils.oh r0 = com.ss.android.ugc.aweme.utils.oh.LIZ
                        r0.getClass()
                        int r1 = com.ss.android.ugc.aweme.utils.oh.LIZIZ
                        java.lang.String r0 = "creation_duration"
                        r4.put(r0, r1)
                        com.ss.android.ugc.aweme.utils.PerformanceMonitorCallbacks r0 = r2
                        if (r0 == 0) goto L59
                        kotlin.jvm.functions.Function0<java.lang.Integer> r0 = r0.LLILLJJLI
                        if (r0 == 0) goto L59
                        java.lang.Object r0 = r0.invoke()
                        java.lang.Number r0 = (java.lang.Number) r0
                        int r1 = r0.intValue()
                    L53:
                        java.lang.String r0 = "source_is_hdr"
                        r4.put(r0, r1)
                        goto L1d
                    L59:
                        r1 = -1
                        goto L53
                    L5b:
                        java.lang.String r0 = "edit_mixed_asset_carousel"
                        boolean r0 = r2.equals(r0)
                        if (r0 == 0) goto L1d
                        com.ss.android.ugc.aweme.utils.PerformanceMonitorCallbacks r0 = r2
                        if (r0 == 0) goto L1d
                        kotlin.jvm.functions.Function0<com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel> r0 = r0.LLILLL
                        if (r0 == 0) goto L1d
                        java.lang.Object r2 = r0.invoke()
                        com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = (com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel) r2
                        if (r2 == 0) goto L1d
                        java.lang.String r1 = "content_type"
                        java.lang.String r0 = X.C1428470nHB.LJIILL(r2)
                        r4.put(r1, r0)
                        java.lang.String r1 = X.C1428470nHB.LJIILIIL(r2)
                        java.lang.String r0 = "content_source"
                        r4.put(r0, r1)
                        kotlin.Pair r1 = X.C1416310mxZ.LJJIIZ(r2)
                        java.lang.Object r0 = r1.getFirst()
                        java.lang.Number r0 = (java.lang.Number) r0
                        int r2 = r0.intValue()
                        java.lang.Object r0 = r1.getSecond()
                        java.lang.Number r0 = (java.lang.Number) r0
                        int r1 = r0.intValue()
                        java.lang.String r0 = "video_cnt"
                        r4.put(r0, r2)
                        java.lang.String r0 = "pic_cnt"
                        r4.put(r0, r1)
                        goto L1d
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C860520XpK.onDataAvailable(org.json.JSONObject):void");
                }
            };
            if (performanceMonitorCallbacks != null) {
                function0 = performanceMonitorCallbacks.LLILZ;
            } else {
                function0 = null;
            }
            iCreativePerformanceMonitorServiceLIZ.startFpsMonitor(str, j, lagDataCallback, function0);
            if (performanceMonitorCallbacks == null || !LIZLLL.add(str)) {
                return;
            }
            AwS99S1000000_14 awS99S1000000_14 = new AwS99S1000000_14(str, 0);
            if (performanceMonitorCallbacks.LL.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                awS99S1000000_14.invoke();
            } else {
                performanceMonitorCallbacks.LL.getLifecycle().addObserver(performanceMonitorCallbacks);
                performanceMonitorCallbacks.LLILZIL = awS99S1000000_14;
            }
        }
    }
}
