package com.ss.android.ugc.aweme.explore.monitor.cache;

import X.C1841860y1w;
import X.C1848630yCr;
import X.C2188811AlT;
import X.InterfaceC1848620yCq;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public final class ExploreTopicTabMonitor implements InterfaceC1848620yCq {
    public static C1841860y1w data;
    public static final ExploreTopicTabMonitor INSTANCE = new ExploreTopicTabMonitor();
    public static final String eventName = "perf_explore_fetch_pin_topic_tab_monitor";

    public final void clear() {
        data = null;
    }

    public final void report() throws JSONException {
        C1841860y1w c1841860y1w = data;
        if (c1841860y1w != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("load_disk_cache_success", c1841860y1w.LIZLLL);
            jSONObject.putOpt("cache_read_cost_time", c1841860y1w.LIZIZ);
            jSONObject.putOpt("api_fetch_cost_time", c1841860y1w.LIZJ);
            jSONObject.putOpt("api_fetch_success", c1841860y1w.LJ);
            jSONObject.putOpt("sync_api_success", c1841860y1w.LJFF);
            jSONObject.putOpt("is_success", c1841860y1w.LJI);
            jSONObject.putOpt("tab_cache_err_msg", c1841860y1w.LJIIIIZZ);
            jSONObject.putOpt("tab_api_err_msg", c1841860y1w.LJIIIZ);
            ExploreTopicTabMonitor exploreTopicTabMonitor = INSTANCE;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(exploreTopicTabMonitor.getEventName());
            sbLIZ.append(' ');
            sbLIZ.append(jSONObject);
            exploreTopicTabMonitor.recordLog(C2188811AlT.LIZIZ(sbLIZ));
            exploreTopicTabMonitor.monitorEvent(jSONObject);
        }
    }

    public final void reportSuccess() throws JSONException {
        C1841860y1w c1841860y1w = data;
        if (c1841860y1w != null) {
            if (c1841860y1w.LJII) {
                return;
            }
            c1841860y1w.LJII = true;
            if (c1841860y1w.LJI == null && c1841860y1w != null) {
                c1841860y1w.LJI = Boolean.FALSE;
            }
        }
        report();
    }

    public final ExploreTopicTabMonitor start() {
        if (data == null) {
            data = new C1841860y1w();
        }
        C1841860y1w c1841860y1w = data;
        if (c1841860y1w != null) {
            c1841860y1w.LIZ = Long.valueOf(System.currentTimeMillis());
        }
        return this;
    }

    @Override // X.InterfaceC1848620yCq
    public String getEventName() {
        return eventName;
    }

    public final void isSuccess(boolean z) throws JSONException {
        C1841860y1w c1841860y1w = data;
        if (c1841860y1w != null) {
            c1841860y1w.LJI = Boolean.valueOf(z);
        }
        report();
    }

    public void monitorEvent(JSONObject jSONObject) {
        C1848630yCr.LIZ(this, jSONObject);
    }

    public void recordLog(String str) {
        C1848630yCr.LIZIZ(this, str);
    }

    public final void syncEnd(boolean z) throws JSONException {
        int i;
        C1841860y1w c1841860y1w = data;
        if (c1841860y1w != null) {
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            c1841860y1w.LJFF = Integer.valueOf(i);
        }
        report();
    }

    public final void fetchEnd(boolean z, Map<String, String> map) throws JSONException {
        long jLongValue;
        Long l;
        int i;
        C1841860y1w c1841860y1w = data;
        if (c1841860y1w != null) {
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            c1841860y1w.LJ = Integer.valueOf(i);
        }
        C1841860y1w c1841860y1w2 = data;
        if (c1841860y1w2 != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1841860y1w c1841860y1w3 = data;
            if (c1841860y1w3 != null && (l = c1841860y1w3.LIZ) != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            c1841860y1w2.LIZJ = Long.valueOf(jCurrentTimeMillis - jLongValue);
        }
        if (map != null) {
            StringBuffer stringBuffer = new StringBuffer();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(key);
                sbLIZ.append(", ");
                sbLIZ.append(value);
                stringBuffer.append(C2188811AlT.LIZIZ(sbLIZ));
            }
            C1841860y1w c1841860y1w4 = data;
            if (c1841860y1w4 != null) {
                c1841860y1w4.LJIIIZ = stringBuffer.toString();
            }
        }
        report();
    }

    public final void readCacheEnd(boolean z, Exception exc) throws JSONException {
        String message;
        long jLongValue;
        Long l;
        int i;
        C1841860y1w c1841860y1w = data;
        if (c1841860y1w != null) {
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            c1841860y1w.LIZLLL = Integer.valueOf(i);
        }
        C1841860y1w c1841860y1w2 = data;
        if (c1841860y1w2 != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1841860y1w c1841860y1w3 = data;
            if (c1841860y1w3 != null && (l = c1841860y1w3.LIZ) != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            c1841860y1w2.LIZIZ = Long.valueOf(jCurrentTimeMillis - jLongValue);
        }
        C1841860y1w c1841860y1w4 = data;
        if (c1841860y1w4 != null) {
            if (exc != null) {
                message = exc.getMessage();
            } else {
                message = null;
            }
            c1841860y1w4.LJIIIIZZ = message;
        }
        report();
    }
}
