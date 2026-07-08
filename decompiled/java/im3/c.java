package im3;

import X.C2188811AlT;
import X.C801800Vco;
import X.RunnableC801900Vcy;
import android.text.TextUtils;
import com.bytedance.crash.monitor.k;
import jl3.g;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class c {
    public static void LIZ(C801800Vco c801800Vco) {
        JSONObject jSONObject = c801800Vco.LIZ;
        String strOptString = jSONObject.optString("log_type");
        if (TextUtils.isEmpty(strOptString)) {
            strOptString = null;
        }
        String strOptString2 = jSONObject.optString("stack");
        String strOptString3 = jSONObject.optString("event_type");
        String strOptString4 = jSONObject.optString("java_data");
        String strOptString5 = jSONObject.optString("stack");
        String str = "core_exception_monitor";
        if (strOptString3.equals("exception")) {
            RunnableC801900Vcy runnableC801900VcyLIZJ = k.LIZJ();
            runnableC801900VcyLIZJ.getClass();
            String strOptString6 = jSONObject.optString("message");
            if (!TextUtils.isEmpty(strOptString)) {
                str = strOptString;
            }
            if (runnableC801900VcyLIZJ.LIZLLL(str, strOptString6)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("reportJavaEnsure：isDrop:");
                sbLIZ.append(str);
                sbLIZ.append(" ");
                sbLIZ.append(strOptString6);
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
            runnableC801900VcyLIZJ.LJIIIZ(new g(str, jSONObject, strOptString2, null, "exception"));
            return;
        }
        if (!strOptString3.equals("native_exception")) {
            return;
        }
        RunnableC801900Vcy runnableC801900VcyLIZJ2 = k.LIZJ();
        runnableC801900VcyLIZJ2.getClass();
        if (!TextUtils.isEmpty(strOptString)) {
            str = strOptString;
        }
        String strOptString7 = jSONObject.optString("message");
        if (runnableC801900VcyLIZJ2.LIZLLL(str, strOptString7)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("reportNativeEnsure：isDrop:");
            sbLIZ2.append(str);
            sbLIZ2.append(" ");
            sbLIZ2.append(strOptString7);
            C2188811AlT.LIZIZ(sbLIZ2);
            return;
        }
        runnableC801900VcyLIZJ2.LJIIIZ(new g(str, jSONObject, strOptString4, strOptString5, "native_exception"));
    }
}
