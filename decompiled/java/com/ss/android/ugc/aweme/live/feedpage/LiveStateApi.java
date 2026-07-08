package com.ss.android.ugc.aweme.live.feedpage;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1485405rg;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC1501320pAg;
import X.InterfaceC519150KXp;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.LiveAwemeData;
import java.util.Map;
import webcast.api.audience.WebcastIMRegistryReqParams;
import webcast.api.audience.WebcastIMRegistryResponse;

/* JADX INFO: loaded from: classes8.dex */
public interface LiveStateApi {
    @InterfaceC1501160pAQ("/webcast/room/collect_unread/")
    C11NZ<C470590Icr<Object>> collectUnreadRequest(@InterfaceC1501070pAH("unread_extra") String str, @InterfaceC1501070pAH("room_ids") String str2);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/event_collect/")
    C11NZ<C470590Icr<Object>> eventCollect(@InterfaceC1501050pAF("event_type") int i, @InterfaceC1501050pAF("rooms_ids") String str, @InterfaceC1501050pAF("anchor_ids") String str2);

    @InterfaceC519150KXp(enableTag = "feed_hot_update")
    @InterfaceC1501160pAQ("/webcast/feed/v2/")
    @InterfaceC1501320pAg(2)
    C11NZ<LiveAwemeData> getLiveCardList(@InterfaceC1501070pAH("hot_reload_phase") String str, @InterfaceC1501070pAH("req_from") String str2, @InterfaceC1501070pAH("hot_reload_lives") String str3, @InterfaceC1501070pAH("need_room_count") int i, @InterfaceC1501130pAN Map<String, String> map);

    @InterfaceC519150KXp(enableTag = "feed_hot_update")
    @InterfaceC1501160pAQ("/webcast/feed/v2/")
    @InterfaceC1501320pAg(2)
    C11NZ<LiveAwemeData> getLiveCardListWithColdStart(@InterfaceC1501070pAH("req_from") String str, @InterfaceC1501130pAN Map<String, String> map);

    @InterfaceC1501170pAR("/webcast/room/im_registry/")
    C11NZ<WebcastIMRegistryResponse> imRegistry(@InterfaceC1485405rg WebcastIMRegistryReqParams webcastIMRegistryReqParams);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/live_room_id/")
    C11NZ<LiveStateResponse> liveStates(@InterfaceC1501050pAF("user_id") String str, @InterfaceC1501050pAF(Scene.SCENE_SERVICE) String str2);
}
