package com.ss.android.ugc.aweme.explore.monitor.net;

import X.AbstractC1585770rMt;
import X.C15UY;
import X.C1848630yCr;
import X.C2188811AlT;
import X.InterfaceC1848620yCq;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.explore.data.ExploreStage;
import com.ss.android.ugc.aweme.explore.service.IExploreFeedService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreApiMonitor implements InterfaceC1848620yCq {
    public static C15UY data;
    public static final ExploreApiMonitor INSTANCE = new ExploreApiMonitor();
    public static final String eventName = "perf_homepage_explore_feed_api";
    public static final AtomicBoolean isFirstFeedValue = new AtomicBoolean(false);

    private final void clear() {
        data = null;
    }

    private final String getTabEnableValue() {
        AbstractC1585770rMt abstractC1585770rMtLJJI;
        IExploreFeedService iExploreFeedService = (IExploreFeedService) PluggableExtentionKt.pluggableSpi$default(IExploreFeedService.class, false, false, false, 14, null);
        if (iExploreFeedService == null || (abstractC1585770rMtLJJI = iExploreFeedService.LJJI()) == null) {
            return null;
        }
        TopTabProtocol topTabProtocolLIZLLL = abstractC1585770rMtLJJI.LIZLLL();
        if (topTabProtocolLIZLLL != null && topTabProtocolLIZLLL.enable()) {
            return "explore_top_tab";
        }
        BottomTabProtocol bottomTabProtocolLIZ = abstractC1585770rMtLJJI.LIZ();
        if (bottomTabProtocolLIZ == null || !bottomTabProtocolLIZ.enable()) {
            return null;
        }
        return "explore_bottom_tab";
    }

    public final ExploreApiMonitor colorBallStart() {
        C15UY c15uy = data;
        if (c15uy != null) {
            c15uy.LJIIJ = System.currentTimeMillis();
        }
        return this;
    }

    public final void end() throws JSONException {
        C15UY c15uy = data;
        if (c15uy != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - c15uy.LIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("api_item_count", c15uy.LJIIIZ);
            jSONObject.putOpt("pull_type", Integer.valueOf(c15uy.LJII));
            jSONObject.putOpt("enter_from", c15uy.LJI);
            jSONObject.putOpt("is_success", Integer.valueOf(c15uy.LJIIIIZZ));
            jSONObject.putOpt("err_code", c15uy.LJ);
            jSONObject.putOpt("err_msg", c15uy.LIZLLL);
            jSONObject.putOpt("err_extra", c15uy.LJFF);
            jSONObject.putOpt("duration", Long.valueOf(jCurrentTimeMillis));
            jSONObject.putOpt("request_id", c15uy.LIZJ);
            jSONObject.putOpt("recommend_duration", Long.valueOf(c15uy.LIZIZ));
            jSONObject.putOpt("is_first_feed", Integer.valueOf(isFirstFeedValue.get() ? 1 : 0));
            jSONObject.putOpt("first_chunk_duration", Long.valueOf(c15uy.LJIIL));
            jSONObject.putOpt("from_explore_page", "main_page");
            jSONObject.putOpt("topic_id", c15uy.LJIILL);
            if (c15uy.LJII == 17) {
                jSONObject.putOpt("server_preload_status", c15uy.LJIILJJIL);
                jSONObject.putOpt("server_preload_ttl", c15uy.LJIILIIL);
            }
            long j = c15uy.LJIIJJI;
            if (j > 0) {
                jSONObject.putOpt("2colorball_show_time", Long.valueOf(j));
            }
            for (Map.Entry entry : ((LinkedHashMap) c15uy.LJIILLIIL).entrySet()) {
                jSONObject.putOpt((String) entry.getKey(), entry.getValue());
            }
            ExploreApiMonitor exploreApiMonitor = INSTANCE;
            exploreApiMonitor.monitorEvent(jSONObject);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(exploreApiMonitor.getEventName());
            sbLIZ.append(' ');
            sbLIZ.append(jSONObject);
            exploreApiMonitor.recordLog(C2188811AlT.LIZIZ(sbLIZ));
            exploreApiMonitor.clear();
        }
    }

    public final ExploreApiMonitor firstChunkResponse() {
        C15UY c15uy = data;
        if (c15uy != null) {
            if (c15uy.LJIIL != 0) {
                return INSTANCE;
            }
            c15uy.LJIIL = System.currentTimeMillis() - c15uy.LIZ;
            c15uy.LJIIJJI = System.currentTimeMillis() - c15uy.LJIIJ;
        }
        return this;
    }

    public final ExploreApiMonitor start() {
        C15UY c15uy = new C15UY();
        data = c15uy;
        c15uy.LIZ = System.currentTimeMillis();
        C15UY c15uy2 = data;
        if (c15uy2 != null) {
            c15uy2.LJI = getTabEnableValue();
        }
        return this;
    }

    @Override // X.InterfaceC1848620yCq
    public String getEventName() {
        return eventName;
    }

    public final ExploreApiMonitor errorMsg(Map<String, String> map) {
        C15UY c15uy = data;
        if (c15uy != null) {
            c15uy.LJFF = map.toString();
        }
        C15UY c15uy2 = data;
        if (c15uy2 != null) {
            c15uy2.LJ = map.get("status_code");
        }
        C15UY c15uy3 = data;
        if (c15uy3 != null) {
            c15uy3.LIZLLL = map.get("status_msg");
        }
        return this;
    }

    public final ExploreApiMonitor isFirstFeed(boolean z) {
        AtomicBoolean atomicBoolean = isFirstFeedValue;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(z);
        }
        return this;
    }

    public final ExploreApiMonitor isSuccess(boolean z) {
        C15UY c15uy = data;
        if (c15uy != null) {
            c15uy.LJIIIIZZ = z ? 1 : 0;
        }
        return this;
    }

    public final ExploreApiMonitor itemCount(int i) {
        C15UY c15uy = data;
        if (c15uy != null) {
            c15uy.LJIIIZ += i;
        }
        return this;
    }

    public void monitorEvent(JSONObject jSONObject) {
        C1848630yCr.LIZ(this, jSONObject);
    }

    public final ExploreApiMonitor preloadStatus(Boolean bool) {
        int i;
        C15UY c15uy = data;
        if (c15uy != null) {
            if (bool != null) {
                bool.booleanValue();
                if (bool.booleanValue()) {
                    i = 1;
                } else {
                    i = 0;
                }
                c15uy.LJIILJJIL = Integer.valueOf(i);
            } else {
                return INSTANCE;
            }
        }
        return this;
    }

    public final ExploreApiMonitor preloadTTL(Long l) {
        C15UY c15uy = data;
        if (c15uy != null) {
            c15uy.LJIILIIL = l;
        }
        return this;
    }

    public final ExploreApiMonitor pullType(int i) {
        C15UY c15uy = data;
        if (c15uy != null) {
            c15uy.LJII = i;
        }
        return this;
    }

    public void recordLog(String str) {
        C1848630yCr.LIZIZ(this, str);
    }

    public final ExploreApiMonitor requestId(String str) {
        C15UY c15uy = data;
        if (c15uy != null) {
            c15uy.LIZJ = str;
        }
        return this;
    }

    public final ExploreApiMonitor stage(List<ExploreStage> list) {
        Map<String, String> map;
        if (list == null) {
            return this;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ExploreStage exploreStage : list) {
            linkedHashMap.put(exploreStage.type, exploreStage.duration);
        }
        C15UY c15uy = data;
        if (c15uy != null && (map = c15uy.LJIILLIIL) != null) {
            map.putAll(linkedHashMap);
        }
        return this;
    }
}
