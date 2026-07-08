package com.bytedance.android.livesdk.impl.revenue.guardian.api;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import tikcast.api.persona.EditGuardianAutographRequest;
import tikcast.api.persona.EditGuardianAutographResponse;
import tikcast.api.persona.QueryGuardianAutographResponse;

/* JADX INFO: loaded from: classes18.dex */
public interface GuardianApi {
    @InterfaceC1501170pAR("/webcast/persona/guardian/autograph/edit/")
    C11NZ<C470590Icr<EditGuardianAutographResponse.ResponseData>> editGuardianAutograph(@InterfaceC1485405rg EditGuardianAutographRequest editGuardianAutographRequest);

    @InterfaceC1501160pAQ("/webcast/persona/guardian/autograph/")
    C11NZ<C470590Icr<QueryGuardianAutographResponse.ResponseData>> queryGuardianAutograph(@InterfaceC1501070pAH("user_id") String str, @InterfaceC1501070pAH("anchor_id") String str2);
}
