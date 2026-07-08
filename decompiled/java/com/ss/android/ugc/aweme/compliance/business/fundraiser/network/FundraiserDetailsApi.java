package com.ss.android.ugc.aweme.compliance.business.fundraiser.network;

import X.C0X9S;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.compliance.api.model.FundraiserDetailsResponse;

/* JADX INFO: loaded from: classes29.dex */
public interface FundraiserDetailsApi {
    @InterfaceC1501160pAQ("/tiktok/v1/donation/panel/get")
    C0X9S<FundraiserDetailsResponse> getFundraiserDetails(@InterfaceC1501070pAH("organization_id") String str, @InterfaceC1501070pAH("fundraiser_id") String str2, @InterfaceC1501070pAH("item_type") int i, @InterfaceC1501070pAH("item_id_str") String str3, @InterfaceC1501070pAH("sec_uid") String str4, @InterfaceC1501070pAH("cursor") int i2, @InterfaceC1501070pAH("should_fetch_top_donor") boolean z);
}
