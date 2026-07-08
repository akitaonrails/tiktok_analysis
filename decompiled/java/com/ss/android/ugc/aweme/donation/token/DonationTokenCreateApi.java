package com.ss.android.ugc.aweme.donation.token;

import X.C0TPK;
import X.C11NZ;
import X.InterfaceC1485405rg;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;

/* JADX INFO: loaded from: classes13.dex */
public interface DonationTokenCreateApi {
    public static final C0TPK LIZ = C0TPK.LIZ;

    @InterfaceC1501170pAR("/tiktok/v1/donation/session/create")
    C11NZ<DonationSessionResponse> createSession(@InterfaceC1485405rg SessionCreationReq sessionCreationReq);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("webcast/room/token_create/")
    C11NZ<DonationTokenResponse> tokenCreate(@InterfaceC1501050pAF("item_type") int i, @InterfaceC1501050pAF("item_id") Long l, @InterfaceC1501050pAF("sec_uid") String str, @InterfaceC1501050pAF("extra") String str2);
}
