package tikcast.api.wallet;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class GetInstallmentInfoResp {

    @C09CT("error_code")
    public int errorCode;

    @C09CT("recommend_tenure")
    public long recommendTenure;

    @C09CT("result_code")
    public int resultCode;

    @C09CT("error_message")
    public String errorMessage = "";

    @C09CT("request_id")
    public String requestId = "";
}
