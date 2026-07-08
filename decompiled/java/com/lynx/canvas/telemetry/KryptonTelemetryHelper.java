package com.lynx.canvas.telemetry;

import X.AbstractC1286160jZe;
import X.C1288370jdD;
import com.lynx.canvas.KryptonApp;
import java.util.HashMap;

/* JADX INFO: loaded from: classes21.dex */
public class KryptonTelemetryHelper {
    public static void reportEvent(KryptonApp kryptonApp, String str, String str2) {
        AbstractC1286160jZe abstractC1286160jZe = (AbstractC1286160jZe) kryptonApp.LJ(AbstractC1286160jZe.class);
        if (abstractC1286160jZe == null) {
            C1288370jdD.LIZIZ("KryptonTelemetryHelper", "no service found");
            return;
        }
        HashMap map = new HashMap();
        if (str2 != null && !str2.isEmpty()) {
            String[] strArrSplit = str2.split(",");
            if (strArrSplit.length % 2 == 0) {
                for (int i = 0; i < strArrSplit.length; i += 2) {
                    map.put(strArrSplit[i], strArrSplit[i + 1]);
                }
            } else {
                C1288370jdD.LIZIZ("KryptonTelemetryHelper", "params format error, length should be even");
                return;
            }
        }
        abstractC1286160jZe.reportEvent(str, map);
    }
}
