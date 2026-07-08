package com.ss.android.ugc.gamora.editor.sticker.donation.api;

import X.AbstractC19484711Kz;
import X.C0CHQ;
import X.C2188811AlT;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.gamora.editor.sticker.donation.model.OrganizationSearchResultResponse;

/* JADX INFO: loaded from: classes30.dex */
public final class OrganizationSearchApi {
    public static final Api LIZ;

    public interface Api {
        @InterfaceC1501160pAQ("/tiktok/v1/donation/ngo/search/")
        AbstractC19484711Kz<OrganizationSearchResultResponse> getOrganizationList(@InterfaceC1501070pAH("cursor") int i, @InterfaceC1501070pAH("count") int i2, @InterfaceC1501070pAH("keyword") String str, @InterfaceC1501070pAH("organization_type") String str2);
    }

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append("api-va.tiktokv.com");
        LIZ = (Api) C0CHQ.LIZ().getNetworkService().createRetrofit(C2188811AlT.LIZIZ(sbLIZ), true, Api.class);
    }
}
