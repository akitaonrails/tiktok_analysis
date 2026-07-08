package com.bytedance.pipo.ttpay.recharge.network;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class ConsultResponse implements Serializable {

    @C09CT("account_info")
    public final AccountInfo accountInfo;

    @C09CT("consult_result")
    public final String consultResult;

    @C09CT("result_code")
    public final String resultCode;

    @C09CT("result_message")
    public final String resultMessage;

    @C09CT("user_info")
    public final UserInfo userInfo;

    public ConsultResponse() {
        this(null, null, null, null, null);
    }

    public ConsultResponse(String str, UserInfo userInfo, AccountInfo accountInfo, String str2, String str3) {
        this.consultResult = str;
        this.userInfo = userInfo;
        this.accountInfo = accountInfo;
        this.resultCode = str2;
        this.resultMessage = str3;
    }
}
