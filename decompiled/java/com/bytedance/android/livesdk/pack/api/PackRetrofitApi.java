package com.bytedance.android.livesdk.pack.api;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.pack.model.SendItemErrorExtra;
import com.bytedance.scene.Scene;
import webcast.api.bag.BagItemConsumeResponse;
import webcast.api.bag.BagItemListResponse;

/* JADX INFO: loaded from: classes.dex */
public interface PackRetrofitApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/bag/v1/item/consume/")
    C11NZ<BaseResponse<BagItemConsumeResponse.Data, SendItemErrorExtra>> sendItem(@InterfaceC1501050pAF("user_id") long j, @InterfaceC1501050pAF("item_type") int i, @InterfaceC1501050pAF("item_id") long j2, @InterfaceC1501050pAF("count") long j3, @InterfaceC1501050pAF("min_expire_at") long j4, @InterfaceC1501050pAF("room_id") long j5, @InterfaceC1501050pAF("anchor_id") long j6, @InterfaceC1501050pAF("to_user_ids") String str);

    @InterfaceC1501160pAQ("/webcast/bag/v1/item/list/")
    C11NZ<C470590Icr<BagItemListResponse.Data>> syncItemList(@InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("user_id") long j2, @InterfaceC1501070pAH("anchor_id") long j3, @InterfaceC1501070pAH("to_user_ids") String str);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/battle/trigger_guide")
    C11NZ<BaseResponse<BagItemConsumeResponse.Data, SendItemErrorExtra>> triggerGuideRequest(@InterfaceC1501050pAF("channel_id") long j, @InterfaceC1501050pAF("battle_id") long j2, @InterfaceC1501050pAF("anchor_id") long j3, @InterfaceC1501050pAF(Scene.SCENE_SERVICE) int i);
}
