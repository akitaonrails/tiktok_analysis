package com.bytedance.android.livesdk.rank.impl.boostcard;

import X.C09SO;
import X.C11NZ;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.android.livesdk.boostcard.LiveGiftBoostCardAckResponse;
import com.bytedance.android.livesdk.boostcard.LiveGiftBoostCardUserStatusResponse;

/* JADX INFO: loaded from: classes.dex */
public interface LiveBoostCardApi {
    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.GIFT)
    @InterfaceC1501170pAR("/webcast/boost/card/ack/")
    C11NZ<C470590Icr<LiveGiftBoostCardAckResponse>> boostCardAck(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("ack_type") int i);

    @InterfaceC1501160pAQ("/webcast/boost/card/boosted_users/")
    @C09SO(EnumC1846380y9E.GIFT)
    C11NZ<C470590Icr<LiveGiftBoostCardUserStatusResponse>> queryUserStatus(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("need_points") boolean z);
}
