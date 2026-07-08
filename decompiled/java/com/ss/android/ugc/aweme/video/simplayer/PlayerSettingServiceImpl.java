package com.ss.android.ugc.aweme.video.simplayer;

import X.C1488850oqZ;
import X.C302870Bu1;
import X.C307500C3o;
import X.C7740030o;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.mt.protector.impl.string2number.CastShortProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.ss.android.ugc.playerkit.exp.PlayerSettingService;
import java.lang.reflect.Type;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes24.dex */
public class PlayerSettingServiceImpl extends PlayerSettingService {
    @Override // com.ss.android.ugc.playerkit.exp.PlayerSettingService
    public Object get(String str, Type type, Object obj, boolean z, boolean z2) {
        Object obj2;
        Object obj3;
        Object objValueOf = null;
        if (z && (obj3 = C1488850oqZ.LIZ.get(str)) != null) {
            if (obj3 == C1488850oqZ.LIZIZ) {
                return null;
            }
            return obj3;
        }
        if (z2 && C302870Bu1.LIZ()) {
            return obj;
        }
        try {
            Class cls = Boolean.TYPE;
            if (type != cls && type != Short.TYPE && type != Integer.TYPE && type != Long.TYPE && type != Float.TYPE && type != Double.TYPE && type != Boolean.class && type != Short.class && type != Integer.class && type != Long.class && type != Float.class && type != Double.class && type != String.class) {
                C307500C3o.LIZ.getClass();
                Object objLIZLLL = C307500C3o.LIZLLL(str, false);
                if (objLIZLLL != null) {
                    objValueOf = objLIZLLL instanceof k ? C7740030o.LIZ().getGson().LIZLLL((k) objLIZLLL, type) : C7740030o.LIZ().getGson().LJIIIIZZ(objLIZLLL.toString(), type);
                }
            } else {
                C307500C3o.LIZ.getClass();
                Object objLIZLLL2 = C307500C3o.LIZLLL(str, true);
                if (objLIZLLL2 != null) {
                    objValueOf = (type == cls || type == Boolean.class) ? Boolean.valueOf(Boolean.parseBoolean(objLIZLLL2.toString())) : (type == Short.TYPE || type == Short.class) ? Short.valueOf(CastShortProtector.parseShort(objLIZLLL2.toString())) : (type == Integer.TYPE || type == Integer.class) ? Integer.valueOf(CastIntegerProtector.parseInt(objLIZLLL2.toString())) : (type == Long.TYPE || type == Long.class) ? Long.valueOf(CastLongProtector.parseLong(objLIZLLL2.toString())) : (type == Float.TYPE || type == Float.class) ? Float.valueOf(CastFloatProtector.parseFloat(objLIZLLL2.toString())) : (type == Double.TYPE || type == Double.class) ? Double.valueOf(CastDoubleProtector.parseDouble(objLIZLLL2.toString())) : objLIZLLL2.toString();
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (objValueOf != null) {
            obj = objValueOf;
        }
        if (z) {
            ConcurrentHashMap<String, Object> concurrentHashMap = C1488850oqZ.LIZ;
            if (obj == null) {
                obj2 = C1488850oqZ.LIZIZ;
            } else {
                obj2 = obj;
            }
            concurrentHashMap.put(str, obj2);
            return obj;
        }
        return obj;
    }
}
