package com.ss.android.ugc.aweme.setting.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class AuthAppInfoListResponse extends BaseResponse {

    @C09CT("list")
    public final List<AuthorizedStruct> authorizationList;

    @C09CT("parent_pairing_type")
    public final Integer familyPairingEnum;

    @C09CT("partner_auth")
    public final List<SecondPartyPartnerAuth> partnerAuth;
}
