package com.ss.android.ugc.aweme.ecommerce.search.feature;

import X.C098200Yq;
import X.C09CT;
import X.C0A6S;
import X.C0C64;
import X.C0CGU;
import X.C0QPT;
import X.C0QQZ;
import X.C0QXQ;
import X.C0QXR;
import X.C0QXS;
import X.C0QYK;
import X.C123100dR;
import X.C13LQ;
import X.C1507790pL7;
import X.C189200o6;
import X.C19719512Dh;
import X.C1AF0;
import X.C2188811AlT;
import X.C2190441Ao6;
import X.C259800zU;
import X.C416901jj;
import X.C672180QYe;
import X.C672520QZm;
import X.C7740030o;
import X.EnumC671220QUm;
import X.EnumC671580QVw;
import X.EnumC671590QVx;
import X.EnumC672280QYo;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchResultBgColor;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class ECSearchEntranceDataImpl extends ECSearchEntranceData {
    public static final int $stable = 8;

    @C09CT("params_map")
    public Map<String, Object> paramsMap;

    @C09CT("strategy_map")
    public Map<String, Object> strategyMap;

    @Override // com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData
    public EnumC671220QUm getDisableSugStrategy() {
        Object objLIZ = LIZ("disable_sug_strategy");
        if (objLIZ != null) {
            if (objLIZ instanceof EnumC671220QUm) {
                return (EnumC671220QUm) objLIZ;
            }
            LIZIZ(getRootEnterFromType(), "disable_sug_strategy");
        }
        return EnumC671220QUm.NO_DISABLE;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData
    public C0QPT getHistoryIsolateStrategy() {
        Object objLIZ = LIZ("history_isolate_strategy");
        if (objLIZ != null) {
            if (objLIZ instanceof C0QPT) {
                return (C0QPT) objLIZ;
            }
            LIZIZ(getRootEnterFromType(), "history_isolate_strategy");
        }
        return C0QPT.NO_ISOLATE;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData
    public EnumC672280QYo getMiddleGuessCacheStrategy() {
        if (getBooleanStrategy("disable_guess_strategy")) {
            return EnumC672280QYo.NO_CACHE;
        }
        Object objLIZ = LIZ("guess_cache_strategy");
        if (objLIZ != null) {
            if (objLIZ instanceof EnumC672280QYo) {
                return (EnumC672280QYo) objLIZ;
            }
            LIZIZ(getRootEnterFromType(), "guess_cache_strategy");
        }
        return EnumC672280QYo.USE_COMMON_CACHE;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData
    public ECSearchResultBgColor getResultBgColor() {
        Object objLIZ = LIZ("result_bg_color");
        if (objLIZ == null) {
            return null;
        }
        if (objLIZ instanceof ECSearchResultBgColor) {
            return (ECSearchResultBgColor) objLIZ;
        }
        LIZIZ(getRootEnterFromType(), "result_bg_color");
        return null;
    }

    public final Object LIZ(String str) {
        String string;
        String string2;
        Map<String, Object> map;
        Object obj;
        Object obj2;
        Object obj3;
        Map<String, Object> map2 = this.strategyMap;
        if (map2 != null && (obj3 = map2.get(str)) != null) {
            return obj3;
        }
        Map<String, Object> map3 = this.paramsMap;
        if (map3 != null && (obj2 = map3.get(str)) != null) {
            string = obj2.toString();
        } else {
            string = null;
        }
        Map<String, C0QYK<? extends Serializable>> map4 = C672180QYe.LIZ;
        C0QYK c0qyk = (C0QYK) ((LinkedHashMap) C672180QYe.LIZ).get(str);
        if (c0qyk != null) {
            String strLJ = c0qyk.LJ();
            if (strLJ != null && (map = this.paramsMap) != null && (obj = map.get(strLJ)) != null) {
                string2 = obj.toString();
            } else {
                string2 = null;
            }
            Object objLIZJ = c0qyk.LIZJ(string, string2);
            if (objLIZJ == null) {
                return null;
            }
            Map<String, Object> map5 = this.strategyMap;
            if (map5 != null) {
                map5.put(str, objLIZJ);
            }
            return objLIZJ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(", ");
        sbLIZ.append(getRootEnterFromType());
        C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData
    public Boolean getBooleanOrNullStrategy(String str) {
        Object objLIZ = LIZ(str);
        if (objLIZ != null) {
            if (objLIZ instanceof Boolean) {
                return (Boolean) objLIZ;
            }
            LIZIZ(getRootEnterFromType(), str);
            return null;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData
    public boolean getBooleanStrategy(String str) {
        Object objLIZ = LIZ(str);
        if (objLIZ != null) {
            if (objLIZ instanceof Boolean) {
                return ((Boolean) objLIZ).booleanValue();
            }
            LIZIZ(getRootEnterFromType(), str);
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData
    public Float getFloatOrNullStrategy(String str) {
        Object objLIZ = LIZ(str);
        if (objLIZ != null) {
            if (objLIZ instanceof Float) {
                return (Float) objLIZ;
            }
            LIZIZ(getRootEnterFromType(), str);
            return null;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData
    public float getFloatStrategy(String str) {
        Object objLIZ = LIZ(str);
        if (objLIZ != null) {
            if (objLIZ instanceof Float) {
                return ((Number) objLIZ).floatValue();
            }
            LIZIZ(getRootEnterFromType(), str);
            return 0.0f;
        }
        return 0.0f;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData
    public Integer getIntOrNullStrategy(String str) {
        Object objLIZ = LIZ(str);
        if (objLIZ != null) {
            if (objLIZ instanceof Integer) {
                return (Integer) objLIZ;
            }
            LIZIZ(getRootEnterFromType(), str);
            return null;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData
    public int getIntStrategy(String str) {
        Object objLIZ = LIZ(str);
        if (objLIZ != null) {
            if (objLIZ instanceof Integer) {
                return ((Number) objLIZ).intValue();
            }
            LIZIZ(getRootEnterFromType(), str);
            return 0;
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData
    public String[] getStringArrayOrNullStrategy(String str) {
        Object objLIZ = LIZ(str);
        if (objLIZ != null) {
            if ((objLIZ instanceof Object[]) && (objLIZ instanceof String[])) {
                if (!(objLIZ instanceof String[])) {
                    return null;
                }
                return (String[]) objLIZ;
            }
            LIZIZ(getRootEnterFromType(), str);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData
    public String getStringOrNullStrategy(String str) {
        Object objLIZ = LIZ(str);
        if (objLIZ != null) {
            if (objLIZ instanceof String) {
                return (String) objLIZ;
            }
            LIZIZ(getRootEnterFromType(), str);
            return null;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData
    public String getStringStrategy(String str) {
        Object objLIZ = LIZ(str);
        if (objLIZ != null) {
            if (objLIZ instanceof String) {
                return (String) objLIZ;
            }
            LIZIZ(getRootEnterFromType(), str);
            return "";
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.LinkedHashMap] */
    public ECSearchEntranceDataImpl(int i, String str) {
        Uri uri;
        Object c098200Yq;
        boolean z;
        super(i, str);
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = new LinkedHashMap();
        Uri uri2 = null;
        if (str != null) {
            try {
                uri = UriProtector.parse(str);
            } catch (Throwable th) {
                th = th;
                uri = null;
            }
            if (uri != null) {
                try {
                    if (C0CGU.LIZ(i)) {
                        C0QXS c0qxs = C0QXS.LIZ;
                        Map map = (Map) c259800zU.element;
                        c0qxs.getClass();
                        C0QXS.LIZ(i, map, uri);
                    }
                    try {
                        C0QXS.LIZ.getClass();
                        String strLIZ = C416901jj.LIZ(uri, "ec_entrance_data");
                        c098200Yq = (strLIZ == null || (c098200Yq = C19719512Dh.LIZJ((Map) C7740030o.LIZ().getGson().LJIIIIZZ(strLIZ, new TypeToken<Map<String, ? extends String>>() { // from class: X.0QYN
                        }.getType()))) == null) ? new LinkedHashMap() : c098200Yq;
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        c098200Yq = new C098200Yq(th2);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    Map map2 = (Map) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
                    c259800zU.element = map2 == null ? new LinkedHashMap() : map2;
                    C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
                    int[] iArr = C672520QZm.LIZ;
                    int[] iArr2 = (int[]) c0c64LJIILLIIL.LJJII(int[].class, iArr, "ec_search_entrance_block_first_level_params", true);
                    if (C13LQ.LJJIJ(i, iArr2 != null ? iArr2 : iArr) < 0) {
                        for (String str2 : C672180QYe.LIZIZ) {
                            String strLIZ2 = C416901jj.LIZ(uri, str2);
                            if (strLIZ2 != null && C123100dR.LIZ(strLIZ2)) {
                                ((Map) c259800zU.element).put(str2, strLIZ2);
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    TryCatchGuardChecker.doCheck(th);
                    LIZIZ(i, "ECSearchEntrance Schema Json Convert Fail");
                    C1AF0.LJ(th);
                    C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put(Scene.SCENE_SERVICE, "ec_search_entrance_json_parse");
                    linkedHashMap.put("message", String.valueOf(th.getMessage()));
                    c1507790pL7.getClass();
                    C1507790pL7.LIZJ("ec_search_error_metrics", linkedHashMap);
                }
                uri2 = uri;
            }
        }
        if (!C0CGU.LIZ(i)) {
            C0QXS c0qxs2 = C0QXS.LIZ;
            Map map3 = (Map) c259800zU.element;
            c0qxs2.getClass();
            C0QXS.LIZ(i, map3, uri2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : ((Map) c259800zU.element).entrySet()) {
            linkedHashMap2.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry2 : C0QXQ.LIZ(i).entrySet()) {
            linkedHashMap2.put(entry2.getKey(), entry2.getValue());
        }
        C0QXS.LIZ.getClass();
        Object obj = linkedHashMap2.get("container_type");
        String string = (obj == null || (string = obj.toString()) == null) ? "" : string;
        boolean zLIZ = C2190441Ao6.LIZ(i);
        if (Intrinsics.LJFF(string, String.valueOf(C0QQZ.HALF_OLD.getValue())) && zLIZ) {
            z = true;
        } else {
            z = false;
        }
        if ((string.length() == 0 && i == C0QXR.HALF_SHOP.getValue() && zLIZ) || z) {
            linkedHashMap2.put("single_tab_type", "shop");
            linkedHashMap2.put("back_button_style", Integer.valueOf(EnumC671590QVx.X_CLOSE.getValue()));
            linkedHashMap2.put("result_disable_bg", Boolean.TRUE);
            linkedHashMap2.put("skeleton_type", Integer.valueOf(EnumC671580QVw.ONLY_RESULT.getType()));
            linkedHashMap2.put("container_type", Integer.valueOf(C0QQZ.HALF_NEW.getValue()));
        }
        this.paramsMap = linkedHashMap2;
        if (((Boolean) C0A6S.LIZ.getValue()).booleanValue()) {
            this.strategyMap = new LinkedHashMap();
        }
    }

    public static void LIZIZ(int i, String str) {
        C1AF0.LIZJ(str + ", " + i);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData
    public void updateFeatureStrategy(String str, Object obj) {
        Map<String, Object> map;
        if (Intrinsics.LJFF(str, "single_tab_type") && (map = this.strategyMap) != null) {
            map.put(str, obj);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData
    public void updateFeatureStrategyOnce(String str, String str2) {
        Map<String, Object> map;
        if (Intrinsics.LJFF(str, "enable_new_user_module") && (map = this.paramsMap) != null) {
            map.put(str, str2);
        }
    }
}
