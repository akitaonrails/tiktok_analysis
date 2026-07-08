package com.ss.android.ugc.aweme.xplatform.serviceimpl;

import X.C0XI4;
import X.C1097680efe;
import X.C13BV;
import X.C1529590puH;
import X.C1529880puk;
import X.C1533020pzo;
import X.C1533710q0v;
import X.C1537060q6K;
import X.C1537480q70;
import X.C1541950qED;
import X.C1543000qFu;
import X.C1546500qLY;
import X.C1546510qLZ;
import X.C1546560qLe;
import X.C1548430qOf;
import X.C1548440qOg;
import X.C1548450qOh;
import X.C1554520qYU;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C7740030o;
import X.C786410Ut5;
import X.EnumC1533980q1M;
import X.EnumC1548460qOi;
import X.InterfaceC1105930esx;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.content.Context;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.TemplateBundle;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.xplatform.service.IMiniDramaLynxViewCenterService;
import com.tiktok.forestx.RequestParamsX;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS326S0000000_1;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class MiniDramaLynxViewCenterImpl implements IMiniDramaLynxViewCenterService {
    public final ConcurrentHashMap<String, String> LIZ = new ConcurrentHashMap<>();
    public final Object LIZIZ = new Object();

    @Override // com.ss.android.ugc.aweme.xplatform.service.IMiniDramaLynxViewCenterService
    public final void N5(String str) {
        String str2 = this.LIZ.get(str);
        if (str2 != null) {
            C1537060q6K c1537060q6K = C1529590puH.LIZ;
            C1537060q6K.LIZIZ(str, str2, null);
            C1537060q6K.LJIILL(str);
        }
        synchronized (this.LIZIZ) {
            try {
                this.LIZ.remove(str);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unregister - remove schema map for ");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.xplatform.service.IMiniDramaLynxViewCenterService
    public final SparkContext LJ(String str, final C1548440qOg c1548440qOg) {
        boolean z;
        String strJ3;
        SparkContext sparkContext = new SparkContext();
        sparkContext.useReuse = c1548440qOg.LJ;
        if (c1548440qOg.LJFF != EnumC1548460qOi.DEFAULT_DISABLE) {
            z = true;
        } else {
            z = false;
        }
        sparkContext.usePreload = z;
        sparkContext.LJJJJZI(new C1554520qYU(c1548440qOg, 6));
        sparkContext.LJJ(C1543000qFu.class, new C1543000qFu() { // from class: X.0qOk
            @Override // X.C1543000qFu
            public final List<Class<? extends InterfaceC1063710dmr>> LJI() {
                return c1548440qOg.LIZLLL;
            }
        });
        JSONObject jSONObject = c1548440qOg.LIZIZ;
        if (jSONObject != null) {
            strJ3 = C786410Ut5.J3(jSONObject);
            if (strJ3 != null && strJ3.length() <= 0) {
                strJ3 = GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), c1548440qOg.LIZ);
            }
        } else {
            strJ3 = null;
        }
        sparkContext.LJJLIIJ(str);
        if (strJ3 == null) {
            strJ3 = "";
        }
        sparkContext.initData = strJ3;
        for (Map.Entry<String, Object> entry : c1548440qOg.LIZJ.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof String) {
                sparkContext.LJJJZ(entry.getKey(), (String) entry.getValue());
            } else if (value instanceof Integer) {
                sparkContext.LJJJLZIJ(((Integer) entry.getValue()).intValue(), entry.getKey());
            } else if (value instanceof Double) {
                sparkContext.LJJJLL(((Double) entry.getValue()).doubleValue(), entry.getKey());
            } else if (value instanceof Boolean) {
                sparkContext.LJJL(entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
            }
        }
        return sparkContext;
    }

    @Override // com.ss.android.ugc.aweme.xplatform.service.IMiniDramaLynxViewCenterService
    public final void LIZIZ(String str, String str2, C1548440qOg c1548440qOg) {
        String str3;
        synchronized (this.LIZIZ) {
            try {
                ConcurrentHashMap<String, String> concurrentHashMap = this.LIZ;
                C0XI4 c0xi4 = new C0XI4(str2);
                String str4 = "1";
                if (c1548440qOg.LJFF == EnumC1548460qOi.FOREST_RESOURCE_PRELOAD) {
                    str3 = "1";
                } else {
                    str3 = CardStruct.IStatusCode.DEFAULT;
                }
                c0xi4.LJ("use_forest", str3);
                if (c1548440qOg.LJFF != EnumC1548460qOi.SPARK_PRELOAD_PENDING_RUNTIME) {
                    str4 = CardStruct.IStatusCode.DEFAULT;
                }
                c0xi4.LJ("enable_pending_js_task", str4);
                concurrentHashMap.put(str, c0xi4.LJFF());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.xplatform.service.IMiniDramaLynxViewCenterService
    public final void LIZLLL(SparkContext sparkContext, String str, C1548440qOg c1548440qOg) {
        String str2;
        String str3;
        int i = C1548450qOh.LIZ[c1548440qOg.LJFF.ordinal()];
        boolean z = false;
        if (i != 1) {
            if ((i != 2 && i != 3 && i != 4) || (str3 = this.LIZ.get(str)) == null) {
                return;
            }
            C1537060q6K c1537060q6K = C1529590puH.LIZ;
            C1097680efe c1097680efe = new C1097680efe();
            c1097680efe.LIZ = str;
            if (c1548440qOg.LJFF == EnumC1548460qOi.SPARK_PRELOAD_PENDING_LOAD) {
                z = true;
            }
            c1097680efe.LJ = z;
            c1097680efe.LIZLLL = c1548440qOg.LJ;
            c1097680efe.LJIJJ = AFwS326S0000000_1.get$arr$(20);
            Boolean bool = Boolean.FALSE;
            C1537060q6K.LJIIL(c1097680efe, bool);
            C1537060q6K.LJIIJJI(c1537060q6K, str3, str, sparkContext, null, false, null, 48);
            if (!c1548440qOg.LJ) {
                return;
            }
            C1546500qLY c1546500qLY = C1546560qLe.LIZ;
            C1546510qLZ c1546510qLZ = new C1546510qLZ();
            c1546510qLZ.LIZ = true;
            c1546510qLZ.LJFF = str;
            c1546500qLY.getClass();
            C1546500qLY.LJI(c1546510qLZ, bool);
            return;
        }
        synchronized (this.LIZIZ) {
            try {
                str2 = this.LIZ.get(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (str2 == null || a0.LJJJIL(str2)) {
            return;
        }
        sparkContext.LJJLIIJ(str2);
        sparkContext.usePreload = true;
        C1533020pzo c1533020pzoLJIILJJIL = C1537480q70.LJIILJJIL(sparkContext, true, null, 2);
        if (c1533020pzoLJIILJJIL == null) {
            return;
        }
        RequestParamsX requestParamsX = new RequestParamsX(EnumC1533980q1M.LYNX_TEMPLATE, TemplateBundle.class);
        requestParamsX.enableMemoryCache = true;
        String str4 = sparkContext.containerId;
        requestParamsX.groupId = str4;
        requestParamsX.customParams = C2097608Jq.LJIIJ(new Pair("rl_container_uuid", str4));
        requestParamsX.source = "MiniDramaLynxViewCenterImpl";
        JSONArray jSONArray = C1533710q0v.LIZ;
        c1533020pzoLJIILJJIL.LIZJ(C1533710q0v.LIZLLL(null, requestParamsX, sparkContext.LJIJI()), requestParamsX, null);
    }

    @Override // com.ss.android.ugc.aweme.xplatform.service.IMiniDramaLynxViewCenterService
    public final View LIZ(Context context, SparkContext sparkContext, String str, C1548440qOg c1548440qOg) {
        View viewLIZ;
        if (c1548440qOg != null) {
            int i = C1548450qOh.LIZ[c1548440qOg.LJFF.ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3 && i != 4) {
                    C1541950qED.LIZJ.getClass();
                    viewLIZ = new C1541950qED(context, sparkContext).LIZ(false);
                } else {
                    String str2 = this.LIZ.get(str);
                    if (str2 != null) {
                        C1537060q6K c1537060q6K = C1529590puH.LIZ;
                        Object objLIZ = (InterfaceC1105930esx) C1537060q6K.LJ(context, str2, str, sparkContext, 8);
                        if (!(objLIZ instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) && c1548440qOg.LJ) {
                            objLIZ = C1546560qLe.LIZ.LIZJ(context, str2, str);
                        }
                        if (!(objLIZ instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB)) {
                            C1541950qED.LIZJ.getClass();
                            objLIZ = new C1541950qED(context, sparkContext).LIZ(false);
                        }
                        C1529880puk c1529880puk = SparkContext.Companion;
                        ((SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) objLIZ).LJJIJIIJIL(sparkContext, sparkContext.LJJJI(-1));
                        viewLIZ = (View) objLIZ;
                    }
                }
            } else {
                C1541950qED.LIZJ.getClass();
                viewLIZ = new C1541950qED(context, sparkContext).LIZ(false);
            }
            if (viewLIZ != null) {
                return viewLIZ;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.xplatform.service.IMiniDramaLynxViewCenterService
    public final C1548440qOg LIZJ(Map map, C13BV c13bv, boolean z, EnumC1548460qOi enumC1548460qOi) {
        C1548430qOf c1548430qOf = new C1548430qOf(null);
        if (!c13bv.isEmpty()) {
            c1548430qOf.LIZLLL = c13bv;
        }
        if (z) {
            c1548430qOf.LJ = true;
        }
        if (!map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                c1548430qOf.LIZJ.put((String) entry.getKey(), entry.getValue());
            }
        }
        return new C1548440qOg(c1548430qOf.LIZ, c1548430qOf.LIZIZ, c1548430qOf.LIZJ, c1548430qOf.LIZLLL, c1548430qOf.LJ, enumC1548460qOi);
    }
}
