package com.ss.android.ugc.tiktok.addyours.service;

import X.C01GW;
import X.C054G;
import X.C098200Yq;
import X.C0PEM;
import X.C1720106oR;
import X.C189200o6;
import X.C1935107i1;
import X.C20680715wD;
import X.C20680915wF;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2129408Vw;
import X.C2187451AjH;
import X.C2296808zG;
import X.C23250099c;
import android.util.SparseArray;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.performanceopt.api.PerfMonitorService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS221S0000000_31;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class PerformanceServiceImpl implements IFIPerformanceService {
    public final SparseArray<SparseArray<C20680915wF>> LIZ = new SparseArray<>();
    public final SparseArray<Map<String, Object>> LIZIZ = new SparseArray<>();
    public final C054G LIZJ = C2296808zG.LIZ(C0PEM.LIZ);
    public final C01GW LIZLLL = C1935107i1.LIZ(AFwS221S0000000_31.get$arr$(320));

    @Override // com.ss.android.ugc.tiktok.addyours.service.IFIPerformanceService
    public final void LIZIZ(int i) {
        SparseArray<SparseArray<C20680915wF>> sparseArray = this.LIZ;
        SparseArray<C20680915wF> sparseArray2 = new SparseArray<>();
        sparseArray2.put(1, new C20680915wF());
        sparseArray.put(i, sparseArray2);
        this.LIZIZ.put(i, new LinkedHashMap());
        String str = C20680715wD.LIZLLL.get(Integer.valueOf(i));
        if (str != null) {
            ((PerfMonitorService) this.LIZLLL.getValue()).LJFF(str);
        }
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IFIPerformanceService
    public final void LIZJ(int i, int i2) {
        SparseArray<C20680915wF> sparseArray = this.LIZ.get(i);
        if (sparseArray != null) {
            sparseArray.put(i2, new C20680915wF());
        }
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IFIPerformanceService
    public final void LIZLLL(int i, boolean z) {
        SparseArray<C20680915wF> sparseArray = this.LIZ.get(i);
        if (sparseArray != null) {
            sparseArray.put(6, new C20680915wF());
            String str = C20680715wD.LIZLLL.get(Integer.valueOf(i));
            SparseArray<C20680915wF> sparseArray2 = this.LIZ.get(i);
            Map<String, Object> map = this.LIZIZ.get(i);
            this.LIZ.remove(i);
            this.LIZIZ.remove(i);
            C23250099c.LIZLLL(this.LIZJ, null, null, new C2129408Vw(this, i, sparseArray2, map, z, null), 3);
            if (str != null) {
                ((PerfMonitorService) this.LIZLLL.getValue()).LIZLLL(str);
            }
        }
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IFIPerformanceService
    public final void LIZ(int i, Object obj, String str) {
        Map<String, Object> map = this.LIZIZ.get(i);
        if (map != null) {
            map.put(str, obj);
        }
    }

    public static void LJ(int i, SparseArray sparseArray, Map map, boolean z) throws JSONException {
        Object c098200Yq;
        int i2;
        if (sparseArray == null) {
            return;
        }
        if (map == null) {
            map = new LinkedHashMap();
        }
        try {
            Function2 function2 = C20680715wD.LJI.get(Integer.valueOf(i));
            if (function2 != null) {
                function2.invoke(sparseArray, map);
                c098200Yq = Unit.LIZ;
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            int i3 = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("PrfImpl", "run processor failed", thM5exceptionOrNullimpl);
        }
        JSONObject jSONObject = new JSONObject(C2097608Jq.LJIIZILJ(map));
        if (z) {
            i2 = 0;
        } else {
            i2 = -1;
        }
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, i2);
        Function0<C20680715wD[]> function0 = C20680715wD.LJFF.get(Integer.valueOf(i));
        if (function0 == null) {
            function0 = C20680715wD.LJ;
        }
        for (C20680715wD c20680715wD : function0.invoke()) {
            C20680915wF c20680915wF = (C20680915wF) sparseArray.get(c20680715wD.LIZIZ);
            if (c20680915wF != null) {
                long j = c20680915wF.LIZ;
                C20680915wF c20680915wF2 = (C20680915wF) sparseArray.get(c20680715wD.LIZJ);
                if (c20680915wF2 != null) {
                    jSONObject.put(c20680715wD.LIZ, c20680915wF2.LIZ - j);
                }
            }
        }
        jSONObject.put(Scene.SCENE_SERVICE, C20680715wD.LIZLLL.get(Integer.valueOf(i)));
        String str = C20680715wD.LJII.get(Integer.valueOf(i));
        if (str == null) {
            str = "social_page_perf_phased";
        }
        C20684815ws.LJIJ(str, jSONObject);
    }
}
