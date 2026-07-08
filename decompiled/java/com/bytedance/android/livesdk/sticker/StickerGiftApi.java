package com.bytedance.android.livesdk.sticker;

import X.C09SO;
import X.C11NZ;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1485405rg;
import X.InterfaceC1501060pAG;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import com.bytedance.android.livesdk.gift.model.GiftEffectAckParams;
import com.bytedance.android.livesdk.gift.model.GiftEffectAckResponse;

/* JADX INFO: loaded from: classes.dex */
public interface StickerGiftApi {
    @InterfaceC1501160pAQ("/webcast/gift/user_name/check/")
    C11NZ<C470590Icr<Object>> checkUserNameLegality(@InterfaceC1501070pAH("name") String str);

    @C09SO(EnumC1846380y9E.GIFT)
    @InterfaceC1501170pAR("/webcast{path}")
    @InterfaceC1501310pAf({"content-type: application/json"})
    C11NZ<C470590Icr<GiftEffectAckResponse.Data>> sendGiftEffectAck(@InterfaceC1501060pAG("path") String str, @InterfaceC1485405rg GiftEffectAckParams giftEffectAckParams);
}
