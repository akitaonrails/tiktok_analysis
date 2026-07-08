package com.bytedance.android.livesdk.chatroom.api;

import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: loaded from: classes8.dex */
public interface EndPageRecommendRetrofitApi {
    @InterfaceC1501160pAQ("/webcast/room/recommend_live/")
    C11NZ<BaseListResponse<Room, FeedExtra>> getRecommendV1(@InterfaceC1501070pAH("room_id") long j);

    @InterfaceC1501160pAQ("/webcast/feed/")
    C11NZ<BaseListResponse<FeedItem, FeedExtra>> getRecommendV2(@InterfaceC1501070pAH("req_from") String str, @InterfaceC1501070pAH("channel_id") String str2, @InterfaceC1501070pAH("count") long j, @InterfaceC1501070pAH("is_draw") long j2, @InterfaceC1501070pAH("draw_room_id") long j3, @InterfaceC1501070pAH("draw_room_owner_id") long j4);
}
