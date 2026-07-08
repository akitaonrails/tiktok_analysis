package com.bytedance.android.livesdk.chatroom.api;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1485405rg;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC2174708fZ;
import com.bytedance.android.livesdkapi.depend.model.live.DonationTokenModel;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public interface DonationStickerApi {
    @InterfaceC1501170pAR
    C11NZ<DonationTokenModel> createDonateSession(@InterfaceC2174708fZ String str, @InterfaceC1485405rg SessionCreationReq sessionCreationReq);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/decoration/set/")
    C11NZ<C470590Icr<Object>> setDecoration(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("type") int i, @InterfaceC1501150pAP Map<String, String> map);
}
