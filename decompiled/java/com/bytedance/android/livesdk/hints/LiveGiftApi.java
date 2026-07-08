package com.bytedance.android.livesdk.hints;

import X.C09SO;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.android.livesdk.gift.model.GiftHintResponse;
import com.bytedance.android.livesdk.goal.model.OwnerSettingResponse;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface LiveGiftApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/goal/owner/setting/")
    Object enableLiveGoalCapsule(@InterfaceC1501050pAF("capsule_guide") boolean z, InterfaceC1364105Vn<? super C470590Icr<OwnerSettingResponse.Data>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/gift/hints/")
    @C09SO(EnumC1846380y9E.GIFT)
    Object fetchGiftHints(@InterfaceC1501070pAH("hint_ids") List<Integer> list, InterfaceC1364105Vn<? super C470590Icr<GiftHintResponse.Data>> interfaceC1364105Vn);
}
