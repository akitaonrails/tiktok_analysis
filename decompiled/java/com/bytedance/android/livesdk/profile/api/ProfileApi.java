package com.bytedance.android.livesdk.profile.api;

import X.C11NZ;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.model.Extra;
import webcast.api.room.GetRoomProfileCardRequest;
import webcast.api.room.GetRoomProfileCardResponse;

/* JADX INFO: loaded from: classes8.dex */
public interface ProfileApi {
    @InterfaceC1501160pAQ("/webcast/room/profile_card/")
    C11NZ<GetRoomProfileCardResponse> getProfileResponse(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("anchor_id") long j2, @InterfaceC1501070pAH("target_user_id") long j3, @InterfaceC1501070pAH("user_role") String str, @InterfaceC1501070pAH("filter_bio_translate") boolean z, @InterfaceC1501070pAH("can_recognize_enigma_role") boolean z2);

    @InterfaceC1501170pAR("/webcast/room/profile_card/")
    C11NZ<BaseResponse<GetRoomProfileCardResponse.ResponseData, Extra>> queryProfileCardResponse(@InterfaceC1485405rg GetRoomProfileCardRequest getRoomProfileCardRequest);
}
