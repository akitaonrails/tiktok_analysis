package com.ss.android.ugc.aweme.compliance.business.fundraiser.network;

import X.C0X9S;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.compliance.api.model.DonationSessionRequest;
import com.ss.android.ugc.aweme.compliance.api.model.DonationSessionResponse;

/* JADX INFO: loaded from: classes17.dex */
public interface DonationSessionApi {
    @InterfaceC1501170pAR("/tiktok/v1/donation/session/create/")
    C0X9S<DonationSessionResponse> createDonationSession(@InterfaceC1485405rg DonationSessionRequest donationSessionRequest);
}
