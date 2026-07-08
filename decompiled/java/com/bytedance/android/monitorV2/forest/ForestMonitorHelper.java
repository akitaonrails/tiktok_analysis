package com.bytedance.android.monitorV2.forest;

import X.AbstractC1520540pfg;
import X.C1533480q0Y;
import X.C1535250q3P;
import android.view.View;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS263S0000000_23;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class ForestMonitorHelper {
    public static final ForestMonitorHelper INSTANCE = new ForestMonitorHelper();

    public final void startMonitor() {
        Function2<? super String, ? super C1535250q3P, Unit> function2 = C1533480q0Y.LIZ;
        ((ArrayList) C1533480q0Y.LIZJ).add(new AbstractC1520540pfg() { // from class: X.0pff
            @Override // X.AbstractC1520540pfg
            public final void LIZIZ(String str, Map map, Map map2) {
                Object obj = map2.get("rl_container_uuid");
                if (obj == null || !(obj instanceof String) || !(!a0.LJJJIL((CharSequence) obj))) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 == null) {
                    int i = C2187451AjH.LIZ;
                    C1521730phb.LIZIZ("ForestMonitorHelper", "container id is null, skip");
                    C1521030pgT.LIZ.LIZ(new C1521040pgU(C1520510pfd.LIZ(str, new C1520160pf4(str, new JSONObject(map))).LJII()));
                    return;
                }
                C1520200pf8 c1520200pf8 = C1520200pf8.LIZ;
                JSONObject jSONObject = new JSONObject(map);
                c1520200pf8.getClass();
                View viewLIZ = C1514790pWP.LIZ(str2);
                if (viewLIZ == null) {
                    C1520730pfz.LIZJ(C1520510pfd.LIZ(str, new C1520160pf4(str, jSONObject)), null);
                    return;
                }
                InterfaceC1520090pex interfaceC1520090pexLIZIZ = C1514790pWP.LIZIZ(str2);
                if (interfaceC1520090pexLIZIZ == null) {
                    return;
                }
                interfaceC1520090pexLIZIZ.onReceivedHybridEvent(viewLIZ, str, jSONObject);
            }

            @Override // X.AbstractC1520540pfg
            @InterfaceC1294060jmO
            public final void LIZ(String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, int i) {
                C1520360pfO c1520360pfO = new C1520360pfO(str);
                c1520360pfO.LIZIZ = str3;
                c1520360pfO.LIZ = str2;
                c1520360pfO.LJIIIIZZ = str4;
                c1520360pfO.LIZLLL = jSONObject;
                c1520360pfO.LJ = jSONObject2;
                c1520360pfO.LJFF = jSONObject3;
                c1520360pfO.LIZIZ(i);
                C1520350pfN c1520350pfNLIZ = c1520360pfO.LIZ();
                C1520200pf8.LIZ.getClass();
                C1520200pf8.LIZ(c1520350pfNLIZ);
            }
        });
        C1533480q0Y.LIZLLL = AFwS263S0000000_23.get$arr$(19);
    }
}
