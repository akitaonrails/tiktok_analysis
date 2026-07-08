package com.bytedance.android.livesdk.feed.watchlater;

import X.C11NZ;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import webcast.api.audience.WatchLaterGetActivityTooltipResp;
import webcast.api.audience.WatchLaterHistoryResp;
import webcast.api.audience.WatchLaterListResp;
import webcast.api.audience.WatchLaterRemoveResp;
import webcast.api.audience.WatchLaterReportWatchedResp;
import webcast.api.audience.WatchLaterSaveResp;

/* JADX INFO: loaded from: classes8.dex */
public interface WatchLaterApi {
    @InterfaceC1501160pAQ("/webcast/room/watch_later/get_activity_tooltip/")
    C11NZ<WatchLaterGetActivityTooltipResp> getActivityTooltip();

    @InterfaceC1501160pAQ("/webcast/room/watch_later/history/")
    C11NZ<WatchLaterHistoryResp> getWatchLaterHistory();

    @InterfaceC1501160pAQ("/webcast/room/watch_later/list/")
    C11NZ<WatchLaterListResp> getWatchLaterList();

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/watch_later/remove/")
    C11NZ<WatchLaterRemoveResp> removeFromWatchLater(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("anchor_id") long j2);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/watch_later/report_watched/")
    C11NZ<WatchLaterReportWatchedResp> reportWatched(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("anchor_id") long j2);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/watch_later/save/")
    C11NZ<WatchLaterSaveResp> saveToWatchLater(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("anchor_id") long j2);
}
