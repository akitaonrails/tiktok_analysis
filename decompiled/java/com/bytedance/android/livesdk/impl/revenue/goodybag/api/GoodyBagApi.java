package com.bytedance.android.livesdk.impl.revenue.goodybag.api;

import X.AbstractC19484711Kz;
import X.C470590Icr;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import webcast.api.goody_bag.GetGoodyBagLotteryResponse;
import webcast.api.goody_bag.GetGoodyBagWinnerListResponse;
import webcast.api.goody_bag.GetRoomGoodyBagResponse;

/* JADX INFO: loaded from: classes13.dex */
public interface GoodyBagApi {
    @InterfaceC1501160pAQ("/webcast/goody_bag/room/")
    AbstractC19484711Kz<C470590Icr<GetRoomGoodyBagResponse.ResponseData>> getGoodyBag(@InterfaceC1501070pAH("room_id") String str);

    @InterfaceC1501170pAR("/webcast/goody_bag/lottery/")
    AbstractC19484711Kz<C470590Icr<GetGoodyBagLotteryResponse.ResponseData>> getUserIfWinner(@InterfaceC1501070pAH("goody_bag_id") String str);

    @InterfaceC1501170pAR("webcast/goody_bag/winner_list/")
    AbstractC19484711Kz<C470590Icr<GetGoodyBagWinnerListResponse.ResponseData>> getWinnerList(@InterfaceC1501070pAH("goody_bag_id") String str, @InterfaceC1501070pAH("offset") long j, @InterfaceC1501070pAH("limit") long j2);
}
