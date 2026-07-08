package com.bytedance.pipo.ttpay.recharge.network;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class UserDisplayInfo implements Serializable {

    @C09CT("balance_amount")
    public final Amount balanceAmount;

    @C09CT("consult_result")
    public final String consultResult;

    @C09CT("nick_name")
    public final String nickName;

    @C09CT("result_code")
    public final String resultCode;

    @C09CT("result_message")
    public final String resultMessage;

    @C09CT("user_image")
    public final String userImage;

    @C09CT("user_total_balance_amount")
    public final Amount userTotalBalanceAmount;

    @C09CT("wallet_limit_info")
    public final WalletLimitInfo walletLimitInfo;

    public UserDisplayInfo() {
        this(null, null, null, null, null, null, null, null);
    }

    public UserDisplayInfo(String str, String str2, String str3, String str4, Amount amount, WalletLimitInfo walletLimitInfo, String str5, Amount amount2) {
        this.userImage = str;
        this.nickName = str2;
        this.consultResult = str3;
        this.resultCode = str4;
        this.balanceAmount = amount;
        this.walletLimitInfo = walletLimitInfo;
        this.resultMessage = str5;
        this.userTotalBalanceAmount = amount2;
    }
}
