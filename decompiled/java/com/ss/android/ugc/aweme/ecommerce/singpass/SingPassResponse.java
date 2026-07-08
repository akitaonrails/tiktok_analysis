package com.ss.android.ugc.aweme.ecommerce.singpass;

import X.C09CT;
import com.bytedance.pipo.kyc.singpass.network.model.PersonInfo;

/* JADX INFO: loaded from: classes27.dex */
public final class SingPassResponse {

    @C09CT("error_info")
    public final Error errorInfo;

    @C09CT("singpass_user_info")
    public final PersonInfo personInfo;

    public SingPassResponse(PersonInfo personInfo, Error error) {
        this.personInfo = personInfo;
        this.errorInfo = error;
    }
}
