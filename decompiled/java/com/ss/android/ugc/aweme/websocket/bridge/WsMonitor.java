package com.ss.android.ugc.aweme.websocket.bridge;

import X.C2188811AlT;
import X.C2261941Dg8;
import X.C2261971DgB;
import X.C5183020f;
import X.C845400XEk;
import X.EnumC1781820wT6;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.websocket.api.service.IWsMonitorService;
import java.util.HashMap;
import org.json.JSONException;

/* JADX INFO: loaded from: classes36.dex */
public final class WsMonitor implements IWsMonitorService {
    @Override // com.ss.android.ugc.aweme.websocket.api.service.IWsMonitorService
    public final void LIZ(EnumC1781820wT6 enumC1781820wT6) throws JSONException {
        long j;
        C2261941Dg8.LIZ.getClass();
        HashMap map = (HashMap) C2261941Dg8.LIZJ().get(enumC1781820wT6);
        if (map != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[stopTracking], scene = ");
            sbLIZ.append(enumC1781820wT6);
            C845400XEk.LIZIZ("WsOnlineRateMonitor", C2188811AlT.LIZIZ(sbLIZ));
            long jUptimeMillis = SystemClock.uptimeMillis();
            long jLongValue = 0;
            if (map.containsKey("scene_start_event")) {
                C2261941Dg8.LJIIJ(enumC1781820wT6, jUptimeMillis);
            } else {
                switch (C2261971DgB.LIZ[C2261941Dg8.LJIIIIZZ.ordinal()]) {
                    case 1:
                        j = C2261941Dg8.LIZJ;
                        break;
                    case 2:
                        j = C2261941Dg8.LJ;
                        break;
                    case 3:
                        j = C2261941Dg8.LIZLLL;
                        break;
                    case 4:
                        j = C2261941Dg8.LJFF;
                        break;
                    case 5:
                        j = C2261941Dg8.LJIIL;
                        break;
                    case 6:
                        j = C2261941Dg8.LJIILIIL;
                        break;
                }
                if (j != 0) {
                    C2261941Dg8.LJIIIZ(enumC1781820wT6, C2261941Dg8.LJIIIIZZ.field(), jUptimeMillis, j);
                }
            }
            Long l = (Long) map.get("scene_start_time");
            if (l != null) {
                jLongValue = l.longValue();
            }
            map.put("scene_total_time", Long.valueOf(jUptimeMillis - jLongValue));
            C2261941Dg8.LJI(enumC1781820wT6, new C5183020f(map, (HashMap<String, Long>) 157));
            C2261941Dg8.LIZJ().remove(enumC1781820wT6);
        }
    }

    @Override // com.ss.android.ugc.aweme.websocket.api.service.IWsMonitorService
    public final void LIZIZ(EnumC1781820wT6 enumC1781820wT6) {
        C2261941Dg8 c2261941Dg8 = C2261941Dg8.LIZ;
        if (!C2261941Dg8.LJIIJ) {
            c2261941Dg8.LIZLLL();
        }
        c2261941Dg8.getClass();
        if (!C2261941Dg8.LIZJ().containsKey(enumC1781820wT6)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[startTracking], scene = ");
            sbLIZ.append(enumC1781820wT6);
            C845400XEk.LIZIZ("WsOnlineRateMonitor", C2188811AlT.LIZIZ(sbLIZ));
            C2261941Dg8.LIZJ().put(enumC1781820wT6, new HashMap());
            HashMap map = (HashMap) C2261941Dg8.LIZJ().get(enumC1781820wT6);
            if (map != null) {
                map.put("scene_start_time", Long.valueOf(SystemClock.uptimeMillis()));
            }
            HashMap map2 = (HashMap) C2261941Dg8.LIZJ().get(enumC1781820wT6);
            if (map2 != null) {
                map2.put("scene_start_event", Long.valueOf(C2261941Dg8.LJIIIIZZ.getValue()));
            }
        }
    }
}
