package com.bytedance.router.monitor.page;

import X.C2340609Fc;
import X.C2340809Fe;
import X.C786410Ut5;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class PageParamUtils {
    public static final PageParamUtils INSTANCE = new PageParamUtils();

    private final String transformValueType(Object obj) {
        if (obj instanceof Double) {
            return "double";
        }
        if (obj instanceof Float) {
            return "float";
        }
        if (!(obj instanceof Byte) && !Intrinsics.LJFF(obj, new Object() { // from class: X.09Fd
        }) && !Intrinsics.LJFF(obj, C2340609Fc.LIZ) && !Intrinsics.LJFF(obj, C2340809Fe.LIZ)) {
            if (obj instanceof Boolean) {
                return "bool";
            }
            if (obj instanceof String) {
                return "string";
            }
            return "unknown";
        }
        return "int";
    }

    public final Pair<Integer, Integer> getScreenSize(Context context) {
        DisplayMetrics displayMetrics;
        int i;
        int i2 = 0;
        if (context == null) {
            return new Pair<>(0, 0);
        }
        Resources resources = context.getResources();
        if (resources != null) {
            displayMetrics = resources.getDisplayMetrics();
        } else {
            displayMetrics = null;
        }
        if (displayMetrics != null) {
            i = displayMetrics.widthPixels;
        } else {
            i = 0;
        }
        Integer numValueOf = Integer.valueOf(i);
        if (displayMetrics != null) {
            i2 = displayMetrics.heightPixels;
        }
        return new Pair<>(numValueOf, Integer.valueOf(i2));
    }

    public final String toParams(Bundle bundle) throws JSONException {
        Set<String> setKeySet;
        JSONObject jSONObject = new JSONObject();
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            for (String str : setKeySet) {
                if (str != null) {
                    jSONObject.put(str, INSTANCE.transformValueType(INVOKEVIRTUAL_com_bytedance_router_monitor_page_PageParamUtils_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, str)));
                }
            }
        }
        return C786410Ut5.J3(jSONObject);
    }

    public final String toParams(Map<String, ? extends Object> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), INSTANCE.transformValueType(entry.getValue()));
        }
        return C786410Ut5.J3(jSONObject);
    }

    public static Object INVOKEVIRTUAL_com_bytedance_router_monitor_page_PageParamUtils_com_ss_android_ugc_aweme_lancet_IntentLancet_get(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }
}
