package ms.bd.o;

import X.C0WZX;
import X.C2204961BRm;
import X.C786410Ut5;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.util.List;
import ms.bd.o.b;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class j1 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        Context context = a.LIZIZ.LIZ;
        JSONArray jSONArray = new JSONArray();
        Object objH2 = C786410Ut5.H2(context, (String) k.a(16777217, 0, 0L, "f21b72", new byte[]{118, 51, 65, 19, 27, 54, 108, 17, 105, 62, 126, 36, 91}));
        if (objH2 != null) {
            List<AccessibilityServiceInfo> list = null;
            try {
                Method declaredMethod = objH2.getClass().getDeclaredMethod((String) k.a(16777217, 0, 0L, "3a2919", new byte[]{37, 102, 85, 100, 0, 61, 36, 65, 111, 101, 39, 103, 96, 78, 13, 43, 35, 83, 106, 107, 43, 111, 72, 89, 23, 29, 53, 82, 117, 96, 33, 102, 109, 68, 29, 58}), new Class[0]);
                if (declaredMethod != null) {
                    list = (List) C2204961BRm.a0(declaredMethod, objH2, new Object[0], new C0WZX("eSwwXgZ0UITWBA==", null));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (list != null && list.size() != 0) {
                for (AccessibilityServiceInfo accessibilityServiceInfo : list) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put((String) k.a(16777217, 0, 0L, "b4dfe5", new byte[]{118, 32}), accessibilityServiceInfo.eventTypes);
                        jSONObject.put((String) k.a(16777217, 0, 0L, "f195b2", new byte[]{126, 55}), accessibilityServiceInfo.getId());
                        jSONArray.put(jSONObject);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                }
            } else {
                return jSONArray.toString();
            }
        }
        return jSONArray.toString();
    }
}
