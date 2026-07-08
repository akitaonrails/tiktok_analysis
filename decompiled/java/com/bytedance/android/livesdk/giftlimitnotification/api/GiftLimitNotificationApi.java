package com.bytedance.android.livesdk.giftlimitnotification.api;

import X.C09SO;
import X.C11NZ;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.android.livesdk.gift.model.GiftLimitGetResponse;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public interface GiftLimitNotificationApi {
    @C09SO(EnumC1846380y9E.GIFT)
    @InterfaceC1501170pAR("/webcast/gift/prompt/get_limit")
    C11NZ<C470590Icr<GiftLimitGetResponse.Data>> giftLimitNotificationInitial(@InterfaceC1501070pAH("room_id") long j);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/gift/prompt/set_limit")
    C11NZ<C470590Icr<Unit>> giftLimitNotificationSetLimit(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501050pAF("notification_status") int i, @InterfaceC1501050pAF("amount_stall") int i2, @InterfaceC1501050pAF("region") String str);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/gift/prompt/set_freq_ctrl")
    C11NZ<C470590Icr<Unit>> giftLimitNotificationSetNotificationFrequency(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501050pAF("block_num_days") int i);
}
