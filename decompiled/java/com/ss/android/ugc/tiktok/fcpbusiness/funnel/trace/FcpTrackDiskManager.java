package com.ss.android.ugc.tiktok.fcpbusiness.funnel.trace;

import X.C20684815ws;
import com.ss.android.ugc.ab.FcpComponentEventConfig;
import com.ss.android.ugc.feed.funnel.api.FunnelContext;
import com.ss.android.ugc.feed.funnel.api.IFcpFunnelCacheFlushAbility;
import com.ss.android.ugc.tiktok.fcpbusiness.funnel.FunnelNode;
import com.ss.android.ugc.tiktok.fcpbusiness.funnel.trace.FcpTraceDiskCacheItem;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: loaded from: classes12.dex */
public final class FcpTrackDiskManager implements IFcpFunnelCacheFlushAbility {
    @Override // com.ss.android.ugc.feed.funnel.api.IFcpFunnelCacheFlushAbility
    public final void LIZ() {
        C20684815ws.LJFF().submit(new Runnable() { // from class: X.0RpH
            public static void LIZ() {
                Map mapLJIILLIIL;
                String str;
                synchronized (C795490VIl.LIZ) {
                    Set<String> setLJ = C795490VIl.LJ();
                    if (setLJ.isEmpty()) {
                        mapLJIILLIIL = C2097608Jq.LJ();
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (String str2 : setLJ) {
                            FcpTraceDiskCacheItem fcpTraceDiskCacheItemLIZIZ = C795490VIl.LIZ.LIZIZ(str2);
                            if (fcpTraceDiskCacheItemLIZIZ != null) {
                                arrayList.add(new Pair(str2, fcpTraceDiskCacheItemLIZIZ));
                            }
                        }
                        mapLJIILLIIL = C2097608Jq.LJIILLIIL(arrayList);
                    }
                }
                for (Map.Entry entry : mapLJIILLIIL.entrySet()) {
                    Map<String, FunnelNode> map = ((FcpTraceDiskCacheItem) entry.getValue()).traceMap;
                    if (map == null || map.isEmpty()) {
                        C795490VIl.LIZ.LJFF((String) entry.getKey());
                    } else {
                        FunnelContext.Info info = ((FcpTraceDiskCacheItem) entry.getValue()).context;
                        if (info != null) {
                            C795490VIl c795490VIl = C795490VIl.LIZ;
                            long j = info.timeTips;
                            c795490VIl.getClass();
                            if (C795490VIl.LIZIZ != j) {
                                C2344009Gk c2344009GkLIZ = C707600RpG.LIZ(info, map);
                                c2344009GkLIZ.LJFF("group_id", info.awemeId);
                                c2344009GkLIZ.LJ(info.awemeType, "aweme_type");
                                c2344009GkLIZ.LJFF("aweme_genres", info.awemeGenres);
                                c2344009GkLIZ.LJFF("request_id", info.requestId);
                                c2344009GkLIZ.LJFF("author_id", info.authorId);
                                c2344009GkLIZ.LJFF("music_id", info.musicId);
                                c2344009GkLIZ.LJFF("enter_from", info.enterFrom);
                                c2344009GkLIZ.LJFF("config_type", info.configType);
                                Map<String, String> map2 = c2344009GkLIZ.LIZ;
                                FcpComponentEventConfig fcpComponentEventConfig = (FcpComponentEventConfig) C707620RpI.LIZIZ.getValue();
                                if (fcpComponentEventConfig == null || (str = fcpComponentEventConfig.eventName) == null) {
                                    str = "record_component_funnel_v2";
                                }
                                C20684815ws.LJIILLIIL(str, map2);
                                c795490VIl.LJFF((String) entry.getKey());
                            }
                        }
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FcpTrackDiskManager@8394.flushCache$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FcpTrackDiskManager@8394.flushCache$1");
            }
        });
    }
}
