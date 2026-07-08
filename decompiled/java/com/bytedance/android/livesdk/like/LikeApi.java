package com.bytedance.android.livesdk.like;

import X.C09CT;
import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.model.LikeResponse;
import com.bytedance.android.livesdk.model.Extra;

/* JADX INFO: loaded from: classes8.dex */
public interface LikeApi {

    public static class LikeExtra extends Extra {

        @C09CT("like_blocked_until_ms")
        public long likeBlockedUntilMs;
    }

    @InterfaceC1501160pAQ("/webcast/room/like/icon/")
    C11NZ<C470590Icr<LikeIconResult>> getIcons(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("anchor_id") long j2, @InterfaceC1501070pAH("omit_default_icon") long j3);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/like/")
    C11NZ<C470590Icr<Void>> like(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("count") long j2, @InterfaceC1501070pAH("enter_from") String str);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/like/")
    C11NZ<C470590Icr<Void>> like(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("count") long j2, @InterfaceC1501070pAH("enter_from") String str, @InterfaceC1501070pAH("to_uid") Long l, @InterfaceC1501050pAF("like_scene") int i);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/like/")
    C11NZ<BaseResponse<LikeResponse.Data, LikeExtra>> like(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("count") long j2, @InterfaceC1501070pAH("enter_from") String str, @InterfaceC1501070pAH("to_uid") Long l, @InterfaceC1501050pAF("adv_id") String str2, @InterfaceC1501050pAF("enter_from_merge") String str3, @InterfaceC1501050pAF("enter_method") String str4, @InterfaceC1501050pAF("feed_id") String str5, @InterfaceC1501050pAF("is_ad") int i, @InterfaceC1501050pAF("ad_id") String str6, @InterfaceC1501050pAF("label") String str7, @InterfaceC1501050pAF("log_extra") String str8, @InterfaceC1501050pAF("tag") String str9, @InterfaceC1501050pAF("creative_id") String str10, @InterfaceC1501050pAF("like_end_status") int i2);
}
