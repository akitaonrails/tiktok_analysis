package com.ss.android.ugc.aweme;

import X.C1209690haJ;
import X.C1234180iDo;
import X.C1529590puH;
import X.C1529880puk;
import X.C1537060q6K;
import X.C1541950qED;
import X.C1543000qFu;
import X.C1546560qLe;
import X.C1548670qP3;
import X.C621610OZr;
import X.C7740030o;
import X.C786410Ut5;
import X.InterfaceC1105930esx;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.LynxViewClient;
import com.ss.android.ugc.aweme.IEcosystemService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class EcosystemServiceImpl implements IEcosystemService {
    @Override // com.ss.android.ugc.aweme.IEcosystemService
    public final EcosystemTask LIZIZ() {
        return new EcosystemTask();
    }

    @Override // com.ss.android.ugc.aweme.IEcosystemService
    public final Map<String, Boolean> LIZJ() {
        return C1548670qP3.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.IEcosystemService
    public final Map<String, Boolean> LIZLLL() {
        return C1548670qP3.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.IEcosystemService
    public final Aweme LJ(String str) {
        C621610OZr.LIZ.getClass();
        return C621610OZr.LIZIZ.get(str);
    }

    @Override // com.ss.android.ugc.aweme.IEcosystemService
    public final void LJI(Aweme aweme) {
        C621610OZr.LIZ.getClass();
        if (aweme != null && aweme.getAid() != null) {
            C621610OZr.LIZIZ.put(aweme.getAid(), aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.IEcosystemService
    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LJFF(Context context, final String str, final String str2, final C1209690haJ c1209690haJ, Map map) {
        LynxView lynxView;
        String strJ3;
        C1234180iDo.LIZ.getClass();
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        SparkSchemaParam sparkSchemaParamLJJJI = null;
        InterfaceC1105930esx interfaceC1105930esxLIZ = (InterfaceC1105930esx) C1537060q6K.LJ(context, str, str2, null, 24);
        if (!(interfaceC1105930esxLIZ instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) && c1209690haJ.LJ) {
            interfaceC1105930esxLIZ = C1546560qLe.LIZ.LIZJ(context, str, str2);
        }
        C1209690haJ c1209690haJ2 = C1234180iDo.LIZIZ.get(str2);
        if (c1209690haJ2 != null) {
            c1209690haJ = c1209690haJ2;
        }
        if (!(interfaceC1105930esxLIZ instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB)) {
            SparkContext sparkContext = new SparkContext();
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    sparkContext.LJJLIIIJ(entry.getValue(), (String) entry.getKey());
                }
            }
            sparkContext.LJJ(C1543000qFu.class, new C1543000qFu() { // from class: X.0hcR
                @Override // X.C1543000qFu
                public final List<Class<? extends InterfaceC1063710dmr>> LJI() {
                    C1234180iDo.LIZ.getClass();
                    List<Class<? extends InterfaceC1063710dmr>> listLJIILJJIL = C1697810uHb.LJIILJJIL(C601200Ni2.class, C621590OZp.class, C1618060sCy.class);
                    Iterator<Class<? extends InterfaceC1063710dmr>> it2 = c1209690haJ.LIZLLL.iterator();
                    while (it2.hasNext()) {
                        listLJIILJJIL.add(it2.next());
                    }
                    return listLJIILJJIL;
                }
            });
            JSONObject jSONObject = c1209690haJ.LIZIZ;
            if (jSONObject != null) {
                strJ3 = C786410Ut5.J3(jSONObject);
                if (strJ3 != null && strJ3.length() <= 0) {
                    strJ3 = GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), c1209690haJ.LIZ);
                }
            } else {
                strJ3 = null;
            }
            sparkContext.LJJLIIJ(str);
            if (strJ3 == null) {
                strJ3 = "";
            }
            sparkContext.initData = strJ3;
            for (Map.Entry<String, Object> entry2 : c1209690haJ.LIZJ.entrySet()) {
                Object value = entry2.getValue();
                if (value instanceof String) {
                    sparkContext.LJJJZ(entry2.getKey(), (String) entry2.getValue());
                } else if (value instanceof Integer) {
                    sparkContext.LJJJLZIJ(((Integer) entry2.getValue()).intValue(), entry2.getKey());
                } else if (value instanceof Double) {
                    sparkContext.LJJJLL(((Double) entry2.getValue()).doubleValue(), entry2.getKey());
                } else if (value instanceof Boolean) {
                    sparkContext.LJJL(entry2.getKey(), ((Boolean) entry2.getValue()).booleanValue());
                }
            }
            C1541950qED.LIZJ.getClass();
            interfaceC1105930esxLIZ = new C1541950qED(context, sparkContext).LIZ(false);
            interfaceC1105930esxLIZ.LJIIIIZZ();
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) interfaceC1105930esxLIZ;
        SparkContext sparkContext2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext();
        if (sparkContext2 != null) {
            C1529880puk c1529880puk = SparkContext.Companion;
            sparkSchemaParamLJJJI = sparkContext2.LJJJI(-1);
        }
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIJIIJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext(), sparkSchemaParamLJJJI);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        Object kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView();
        if ((kitView instanceof LynxView) && (lynxView = (LynxView) kitView) != null) {
            lynxView.addLynxViewClient(new LynxViewClient() { // from class: X.0qP1
                @Override // com.lynx.tasm.LynxViewClient
                public final void onTimingSetup(Map<String, ? extends Object> map2) {
                    Object obj;
                    boolean z;
                    C1234180iDo c1234180iDo = C1234180iDo.LIZ;
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    String str3 = str;
                    String str4 = str2;
                    Map map3 = null;
                    if (map2 != null) {
                        obj = map2.get("metrics");
                    } else {
                        obj = null;
                    }
                    if (obj instanceof Map) {
                        map3 = (Map) obj;
                    }
                    c1234180iDo.getClass();
                    if (str3 != null) {
                        IEcosystemService iEcosystemService = (IEcosystemService) ServiceManager.get().getService(IEcosystemService.class);
                        Map<String, Boolean> mapLIZLLL = iEcosystemService.LIZLLL();
                        Map<String, Boolean> mapLIZJ = iEcosystemService.LIZJ();
                        int i = 0;
                        if (C1536910q65.LIZ(str3) != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        boolean zContainsKey = mapLIZJ.containsKey(str3);
                        if (z) {
                            i = 1;
                        } else if (zContainsKey) {
                            i = 2;
                        }
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("schema", str3);
                        c2344009Gk.LJIIIIZZ("biz_tag", str4);
                        c2344009Gk.LIZLLL(jCurrentTimeMillis2, "duration");
                        c2344009Gk.LIZJ(1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                        c2344009Gk.LIZJ(i, "cache_hit");
                        c2344009Gk.LIZJ(mapLIZLLL.containsKey(str3) ? 1 : 0, "is_predecode");
                        c2344009Gk.LIZJ(mapLIZJ.containsKey(str3) ? 1 : 0, "is_precodecache");
                        c2344009Gk.LIZJ(1, "is_precreatevm");
                        c2344009Gk.LIZJ(1, "is_prelayout");
                        c2344009Gk.LIZJ(1, "is_process_render");
                        c2344009Gk.LJII(map3);
                        C20684815ws.LJIILLIIL("ecosystem_lynx_template_bundle", c2344009Gk.LIZ);
                    }
                }
            });
        }
        return sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
    }
}
