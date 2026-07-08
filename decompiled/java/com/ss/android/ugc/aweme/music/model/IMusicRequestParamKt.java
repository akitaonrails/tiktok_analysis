package com.ss.android.ugc.aweme.music.model;

import X.C098200Yq;
import X.C1227904rF;
import X.C189200o6;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class IMusicRequestParamKt {
    public static final <K, V> JSONObject toJSONObject(Map<K, ? extends V> map, String str) {
        boolean z;
        try {
            C1227904rF.LIZ.getClass();
            String strLJI = C1227904rF.LJI(map);
            if (strLJI == null || strLJI.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(strLJI);
            if (str != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(str, jSONObject);
                return jSONObject2;
            }
            return jSONObject;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }

    public static final <K, V> void safePutIfAbsent(Map<K, V> map, K k, V v) {
        try {
            if (map.get(k) == null) {
                map.put(k, v);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
