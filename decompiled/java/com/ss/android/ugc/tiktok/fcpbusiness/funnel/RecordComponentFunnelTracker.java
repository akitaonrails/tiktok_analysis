package com.ss.android.ugc.tiktok.fcpbusiness.funnel;

import X.C20684815ws;
import X.C2344009Gk;
import X.C707600RpG;
import X.C707620RpI;
import X.C707840Rpe;
import X.C707890Rpj;
import X.C707900Rpk;
import X.C795490VIl;
import com.ss.android.ugc.ab.FcpComponentEventConfig;
import com.ss.android.ugc.feed.funnel.api.FunnelContext;
import com.ss.android.ugc.feed.funnel.api.IFcpFunnelAbility;
import com.ss.android.ugc.tiktok.fcpbusiness.funnel.trace.FcpTraceDiskCacheItem;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class RecordComponentFunnelTracker implements IFcpFunnelAbility {
    @Override // com.ss.android.ugc.feed.funnel.api.IFcpFunnelAbility
    public final void LIZ(FunnelContext funnelContext, Map<C707900Rpk, ? extends List<C707890Rpj>> map) {
        Map mapLIZ = C707840Rpe.LIZ(funnelContext, map);
        C795490VIl c795490VIl = C795490VIl.LIZ;
        String strGenKey = funnelContext.info.genKey();
        FcpTraceDiskCacheItem fcpTraceDiskCacheItem = new FcpTraceDiskCacheItem(funnelContext.info, mapLIZ);
        synchronized (c795490VIl) {
            FunnelContext.Info info = fcpTraceDiskCacheItem.context;
            if (info != null) {
                info.setTimeTips(C795490VIl.LIZIZ);
            }
            Set setLJ = C795490VIl.LJ();
            setLJ.add(strGenKey);
            C795490VIl.LIZJ().storeBytes("fcp_trace_disk_cache_item_keys", C795490VIl.LJI(setLJ));
            C795490VIl.LIZJ().storeBytes(C795490VIl.LIZLLL(strGenKey), C795490VIl.LJI(fcpTraceDiskCacheItem));
        }
    }

    @Override // com.ss.android.ugc.feed.funnel.api.IFcpFunnelAbility
    public final void LIZIZ(FunnelContext funnelContext, Map<C707900Rpk, ? extends List<C707890Rpj>> map) {
        String str;
        C2344009Gk c2344009GkLIZ = C707600RpG.LIZ(funnelContext.info, C707840Rpe.LIZ(funnelContext, map));
        c2344009GkLIZ.LJFF("group_id", funnelContext.info.awemeId);
        c2344009GkLIZ.LJ(funnelContext.info.awemeType, "aweme_type");
        c2344009GkLIZ.LJFF("aweme_genres", funnelContext.info.awemeGenres);
        c2344009GkLIZ.LJFF("request_id", funnelContext.info.requestId);
        c2344009GkLIZ.LJFF("author_id", funnelContext.info.authorId);
        c2344009GkLIZ.LJFF("music_id", funnelContext.info.musicId);
        c2344009GkLIZ.LJFF("enter_from", funnelContext.info.enterFrom);
        c2344009GkLIZ.LJFF("config_type", funnelContext.info.configType);
        Map<String, String> map2 = c2344009GkLIZ.LIZ;
        FcpComponentEventConfig fcpComponentEventConfig = (FcpComponentEventConfig) C707620RpI.LIZIZ.getValue();
        if (fcpComponentEventConfig == null || (str = fcpComponentEventConfig.eventName) == null) {
            str = "record_component_funnel_v2";
        }
        C20684815ws.LJIILLIIL(str, map2);
        C795490VIl.LIZ.LJFF(funnelContext.info.genKey());
    }
}
