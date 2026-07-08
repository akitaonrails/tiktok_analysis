package tikcast.api.wallet.tiktok;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class UnlockVoucherResult {

    @C09CT("resp")
    public Response resp;

    public static final class Response {

        @C09CT("err_msg")
        public String errMsg = "";

        @C09CT("result_code")
        public int resultCode;
    }
}
