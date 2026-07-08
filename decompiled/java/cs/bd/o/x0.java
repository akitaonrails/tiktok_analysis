package cs.bd.o;

import X.C08P2;
import X.C08PQ;
import X.C0WZX;
import X.C2110608Oq;
import X.C2204961BRm;
import X.C786410Ut5;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.lang.reflect.Method;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class x0 extends C08PQ {
    @Override // X.C08PQ
    public final Object LIZ(long j, String str, Object obj) {
        byte b;
        try {
            if (C08P2.LIZ() == null) {
                b = 0;
            } else {
                b = 1;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            b = -1;
        }
        if (b != 1) {
            return "";
        }
        Context context = C2110608Oq.LIZIZ.LIZ;
        JSONArray jSONArray = new JSONArray();
        Object objH2 = C786410Ut5.H2(context, "accessibility");
        if (objH2 != null) {
            List<AccessibilityServiceInfo> list = null;
            try {
                Method declaredMethod = objH2.getClass().getDeclaredMethod("getInstalledAccessibilityServiceList", new Class[0]);
                if (declaredMethod != null) {
                    list = (List) C2204961BRm.a0(declaredMethod, objH2, new Object[0], new C0WZX("dywwXgZ0UITEBQ==", null));
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
            if (list != null && list.size() != 0) {
                for (AccessibilityServiceInfo accessibilityServiceInfo : list) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("ev", accessibilityServiceInfo.eventTypes);
                        jSONObject.put(FollowStatusChangeMethod.PARAM_UID, accessibilityServiceInfo.getId());
                        jSONArray.put(jSONObject);
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                    }
                }
            } else {
                return jSONArray.toString();
            }
        }
        return jSONArray.toString();
    }
}
