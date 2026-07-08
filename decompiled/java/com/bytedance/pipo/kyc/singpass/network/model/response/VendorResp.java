package com.bytedance.pipo.kyc.singpass.network.model.response;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes27.dex */
public final class VendorResp {

    @C09CT("BaseResp")
    public final BaseResp baseResp;

    @C09CT("caller_idempotent_id")
    public final String callerIdempotentId;

    @C09CT("error_code")
    public final int errorCode;

    @C09CT("error_message")
    public final String errorMessage;

    @C09CT("request_id")
    public final String requestId;

    @C09CT("response")
    public final String response;

    @C09CT("scenario")
    public final int scenario;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int status;

    @C09CT("vendor_id")
    public final String vendorId;

    public VendorResp(int i, String str, String str2, String str3, String str4, int i2, int i3, String str5, BaseResp baseResp) {
        this.errorCode = i;
        this.errorMessage = str;
        this.callerIdempotentId = str2;
        this.requestId = str3;
        this.response = str4;
        this.scenario = i2;
        this.status = i3;
        this.vendorId = str5;
        this.baseResp = baseResp;
    }
}
