package com.ss.android.ugc.aweme.explore.monitor.net;

import X.AbstractC1585770rMt;
import X.C15UY;
import X.C1848630yCr;
import X.C2188811AlT;
import X.InterfaceC1848620yCq;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.explore.service.IExploreFeedService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreCustomApiMonitor implements InterfaceC1848620yCq {
    public C15UY data;
    public final String eventName = "perf_homepage_explore_custom_feed_api";
    public final AtomicBoolean isFirstFeedValue = new AtomicBoolean(false);

    private final void clear() {
        this.data = null;
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

    public final ExploreCustomApiMonitor colorBallStart() {
        C15UY c15uy = this.data;
        if (c15uy != null) {
            c15uy.LJIIJ = System.currentTimeMillis();
        }
        return this;
    }

    public final void end() throws JSONException {
        C15UY c15uy = this.data;
        if (c15uy != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - c15uy.LIZ;
            long j2 = jCurrentTimeMillis - c15uy.LJIIJ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("api_item_count", c15uy.LJIIIZ);
            jSONObject.putOpt("pull_type", Integer.valueOf(c15uy.LJII));
            jSONObject.putOpt("enter_from", c15uy.LJI);
            jSONObject.putOpt("is_success", Integer.valueOf(c15uy.LJIIIIZZ));
            jSONObject.putOpt("err_code", c15uy.LJ);
            jSONObject.putOpt("err_msg", c15uy.LIZLLL);
            jSONObject.putOpt("err_extra", c15uy.LJFF);
            jSONObject.putOpt("duration", Long.valueOf(j));
            jSONObject.putOpt("request_id", c15uy.LIZJ);
            jSONObject.putOpt("recommend_duration", Long.valueOf(c15uy.LIZIZ));
            jSONObject.putOpt("is_first_feed", Integer.valueOf(this.isFirstFeedValue.get() ? 1 : 0));
            jSONObject.putOpt("topic_id", c15uy.LJIILL);
            if (j2 > 0) {
                jSONObject.putOpt("2colorball_show_time", Long.valueOf(j2));
            }
            monitorEvent(jSONObject);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(getEventName());
            sbLIZ.append(' ');
            sbLIZ.append(jSONObject);
            recordLog(C2188811AlT.LIZIZ(sbLIZ));
            clear();
        }
    }

    public final ExploreCustomApiMonitor isFirstFeed() {
        if (!this.isFirstFeedValue.get()) {
            this.isFirstFeedValue.set(true);
        }
        return this;
    }

    @Override // X.InterfaceC1848620yCq
    public String getEventName() {
        return this.eventName;
    }

    public final ExploreCustomApiMonitor errorMsg(Map<String, String> map) {
        C15UY c15uy = this.data;
        if (c15uy != null) {
            c15uy.LJFF = map.toString();
        }
        C15UY c15uy2 = this.data;
        if (c15uy2 != null) {
            c15uy2.LJ = map.get("status_code");
        }
        C15UY c15uy3 = this.data;
        if (c15uy3 != null) {
            c15uy3.LIZLLL = map.get("status_msg");
        }
        return this;
    }

    public final ExploreCustomApiMonitor isSuccess(boolean z) {
        C15UY c15uy = this.data;
        if (c15uy != null) {
            c15uy.LJIIIIZZ = z ? 1 : 0;
        }
        return this;
    }

    public final ExploreCustomApiMonitor itemCount(int i) {
        C15UY c15uy = this.data;
        if (c15uy != null) {
            c15uy.LJIIIZ = i;
        }
        return this;
    }

    public void monitorEvent(JSONObject jSONObject) {
        C1848630yCr.LIZ(this, jSONObject);
    }

    public final ExploreCustomApiMonitor pullType(int i) {
        C15UY c15uy = this.data;
        if (c15uy != null) {
            c15uy.LJII = i;
        }
        return this;
    }

    public final ExploreCustomApiMonitor recommendDuration(long j) {
        C15UY c15uy = this.data;
        if (c15uy != null) {
            c15uy.LIZIZ = j;
        }
        return this;
    }

    public void recordLog(String str) {
        C1848630yCr.LIZIZ(this, str);
    }

    public final ExploreCustomApiMonitor requestId(String str) {
        C15UY c15uy = this.data;
        if (c15uy != null) {
            c15uy.LIZJ = str;
        }
        return this;
    }

    public final ExploreCustomApiMonitor start(Long l) {
        C15UY c15uy = new C15UY();
        this.data = c15uy;
        c15uy.LIZ = System.currentTimeMillis();
        C15UY c15uy2 = this.data;
        if (c15uy2 != null) {
            c15uy2.LJI = getTabEnableValue();
        }
        C15UY c15uy3 = this.data;
        if (c15uy3 != null) {
            c15uy3.LJIILL = l;
        }
        return this;
    }
}
