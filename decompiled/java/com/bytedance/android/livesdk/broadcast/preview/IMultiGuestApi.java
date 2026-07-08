package com.bytedance.android.livesdk.broadcast.preview;

import X.C09SO;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.bytedance.android.live.liveinteract.multilive.social.model.SuggestGuestsReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.SuggestGuestsResp;

/* JADX INFO: loaded from: classes.dex */
public interface IMultiGuestApi {
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_social/suggest_guests/")
    Object getSuggestGuests(@InterfaceC1485405rg SuggestGuestsReq suggestGuestsReq, InterfaceC1364105Vn<? super C470590Icr<SuggestGuestsResp.ResponseData>> interfaceC1364105Vn);
}
