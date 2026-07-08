package ud7;

import X.C786410Ut5;
import com.ss.android.ttve.monitor.ApplogUtilsInvoker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class b {
    public static void LIZ(String str, String str2, JSONObject jSONObject) {
        LIZIZ(str, str2, jSONObject, true);
    }

    public static void LIZIZ(String str, String str2, JSONObject jSONObject, boolean z) {
        String strJ3;
        if (jSONObject != null) {
            strJ3 = C786410Ut5.J3(jSONObject);
        } else {
            strJ3 = "";
        }
        ApplogUtilsInvoker.nativeOnEvent(str, strJ3, str2, z);
    }
}
