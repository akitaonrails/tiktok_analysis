package com.ss.android.ugc.aweme.compliance.business.fundraiser.network;

import X.C0X9S;
import X.InterfaceC1485505rh;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;

/* JADX INFO: loaded from: classes29.dex */
public interface UpdateProfileFundraiserApi {
    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/tiktok/v1/donation/fundraiser/set/profile")
    C0X9S<UpdateProfileFundraiserResponse> updateProfileFundraiser(@InterfaceC1501050pAF("fundraiser_id") String str, @InterfaceC1501050pAF("user_sec_uid") String str2, @InterfaceC1501050pAF("organization_id") String str3);
}
