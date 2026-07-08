package com.ss.android.ugc.aweme.explore.monitor.cache;

import X.C15UR;
import X.C1848630yCr;
import X.C2188811AlT;
import X.EnumC993440bxW;
import X.InterfaceC1848620yCq;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreCacheMonitor implements InterfaceC1848620yCq {
    public static C15UR data;
    public static final ExploreCacheMonitor INSTANCE = new ExploreCacheMonitor();
    public static final String eventName = "perf_explore_cache_monitor_event";

    private final void clear() {
        data = null;
    }

    public final void end() throws JSONException {
        C15UR c15ur = data;
        if (c15ur != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - c15ur.LIZIZ;
            long j2 = jCurrentTimeMillis - c15ur.LIZ;
            String value = c15ur.LIZLLL.getValue();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("load_disk_cache_success", c15ur.LIZJ);
            jSONObject.put("cache_read_cost_time", j);
            if (c15ur.LIZ != 0) {
                jSONObject.putOpt("cache_complete_time", Long.valueOf(j2));
            }
            jSONObject.put("cache_read_enter_from", value);
            ExploreCacheMonitor exploreCacheMonitor = INSTANCE;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(exploreCacheMonitor.getEventName());
            sbLIZ.append(' ');
            sbLIZ.append(jSONObject);
            exploreCacheMonitor.recordLog(C2188811AlT.LIZIZ(sbLIZ));
            exploreCacheMonitor.monitorEvent(jSONObject);
            exploreCacheMonitor.clear();
        }
    }

    public final ExploreCacheMonitor start() {
        if (data == null) {
            data = new C15UR();
        }
        C15UR c15ur = data;
        if (c15ur != null) {
            c15ur.LIZ = System.currentTimeMillis();
        }
        return this;
    }

    @Override // X.InterfaceC1848620yCq
    public String getEventName() {
        return eventName;
    }

    public void monitorEvent(JSONObject jSONObject) {
        C1848630yCr.LIZ(this, jSONObject);
    }

    public final ExploreCacheMonitor recordLoadDiskCacheStatus(boolean z) {
        C15UR c15ur = data;
        if (c15ur != null) {
            c15ur.LIZJ = z ? 1 : 0;
        }
        return this;
    }

    public void recordLog(String str) {
        C1848630yCr.LIZIZ(this, str);
    }

    public final ExploreCacheMonitor startReadCache(EnumC993440bxW enumC993440bxW) {
        if (data == null) {
            data = new C15UR();
        }
        C15UR c15ur = data;
        if (c15ur != null) {
            c15ur.LIZIZ = System.currentTimeMillis();
        }
        C15UR c15ur2 = data;
        if (c15ur2 != null) {
            c15ur2.LIZLLL = enumC993440bxW;
        }
        return this;
    }
}
