package com.ss.android.ugc.aweme.commercialize.feed.candidate;

import X.C1053230dVx;
import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.ad.feed.candidate.CandidateResponse;

/* JADX INFO: loaded from: classes17.dex */
public interface CandidateAdRequestApi {
    public static final C1053230dVx LIZ = C1053230dVx.LIZ;

    @InterfaceC1501160pAQ("/tiktok/v1/ad/candidate/")
    C11NZ<CandidateResponse> request(@InterfaceC1501070pAH("pull_type") int i, @InterfaceC1501070pAH("cmpl_enc") String str, @InterfaceC1501070pAH("ad_user_agent") String str2, @InterfaceC1501070pAH("recent_items_from_client") String str3, @InterfaceC1501070pAH("request_candidate_ads_item_id") String str4);
}
