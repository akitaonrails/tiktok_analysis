package com.ss.android.ugc.gamora.editor.sticker.donation.api;

import X.AnonymousClass1114;
import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.gamora.editor.sticker.donation.model.OrganizationResponse;

/* JADX INFO: loaded from: classes30.dex */
public interface PercentOrganizationListApi {
    public static final AnonymousClass1114 LIZ = AnonymousClass1114.LIZ;

    @InterfaceC1501160pAQ("/tiktok/v1/donation/ngo/list/")
    C11NZ<OrganizationResponse> getOrganizationList(@InterfaceC1501070pAH("cursor") int i, @InterfaceC1501070pAH("count") int i2, @InterfaceC1501070pAH("organization_type") String str);
}
