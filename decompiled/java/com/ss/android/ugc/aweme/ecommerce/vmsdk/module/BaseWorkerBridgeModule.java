package com.ss.android.ugc.aweme.ecommerce.vmsdk.module;

import X.C1531580pxU;
import X.C1AF0;
import X.C2188811AlT;
import android.content.Context;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vmsdk.jsbridge.JSModule;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyArray;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyMap;
import com.bytedance.vmsdk.jsbridge.utils.WritableArray;
import com.bytedance.vmsdk.jsbridge.utils.WritableMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class BaseWorkerBridgeModule extends JSModule {
    public static final C1531580pxU Companion = new Object() { // from class: X.0pxU
    };

    public BaseWorkerBridgeModule(Context context) {
        super(context);
    }

    public final WritableArray toWritableArray(List<? extends Object> list) {
        if (list == null) {
            return new JavaOnlyArray();
        }
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = ListProtector.get(list, i);
            if (obj instanceof List) {
                try {
                    javaOnlyArray.pushArray(toWritableArray((List) obj));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else if (obj instanceof Boolean) {
                javaOnlyArray.pushBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                javaOnlyArray.pushInt(((Number) obj).intValue());
            } else if (obj instanceof Long) {
                javaOnlyArray.pushDouble(((Number) obj).longValue());
            } else if (obj instanceof Float) {
                javaOnlyArray.pushDouble(((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                javaOnlyArray.pushDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                javaOnlyArray.pushString((String) obj);
            } else {
                javaOnlyArray.pushString(obj.toString());
            }
        }
        return javaOnlyArray;
    }

    public final WritableMap toWritableMap(JSONObject jSONObject) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                Object objOpt = jSONObject.opt(next);
                if (!(objOpt instanceof Float) && !(objOpt instanceof Double)) {
                    if (objOpt instanceof Long) {
                        long j = JSONObjectProtectorUtils.getLong(jSONObject, next);
                        if (j <= 2147483647L && j >= -2147483648L) {
                            javaOnlyMap.putInt(next, (int) j);
                        } else {
                            javaOnlyMap.putString(next, String.valueOf(j));
                        }
                    } else if (objOpt instanceof Number) {
                        javaOnlyMap.putInt(next, JSONObjectProtectorUtils.getInt(jSONObject, next));
                    } else if (objOpt instanceof String) {
                        javaOnlyMap.putString(next, JSONObjectProtectorUtils.getString(jSONObject, next));
                    } else if (objOpt instanceof Boolean) {
                        javaOnlyMap.putBoolean(next, JSONObjectProtectorUtils.getBoolean(jSONObject, next));
                    } else if (Intrinsics.LJFF(objOpt, JSONObject.NULL)) {
                        javaOnlyMap.putNull(next);
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Failed to convert value ");
                        sbLIZ.append(objOpt);
                        sbLIZ.append(" of type ");
                        sbLIZ.append(objOpt.getClass());
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        strLIZIZ.toString();
                        throw new IllegalStateException(strLIZIZ);
                    }
                } else {
                    javaOnlyMap.putDouble(next, JSONObjectProtectorUtils.getDouble(jSONObject, next));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
            return javaOnlyMap;
        }
        return javaOnlyMap;
    }
}
