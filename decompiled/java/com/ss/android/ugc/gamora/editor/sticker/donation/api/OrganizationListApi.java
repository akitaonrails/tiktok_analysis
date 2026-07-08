package com.ss.android.ugc.gamora.editor.sticker.donation.api;

import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.gamora.editor.sticker.donation.model.OrganizationResponse;

/* JADX INFO: loaded from: classes.dex */
public interface OrganizationListApi {
    @InterfaceC1501160pAQ("/aweme/v1/donation/orgs/")
    C11NZ<OrganizationResponse> getOrganizationList(@InterfaceC1501070pAH("cursor") int i, @InterfaceC1501070pAH("count") int i2);
}
