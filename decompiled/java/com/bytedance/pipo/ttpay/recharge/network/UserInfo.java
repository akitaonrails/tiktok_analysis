package com.bytedance.pipo.ttpay.recharge.network;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class UserInfo implements Serializable {

    @C09CT("kyc_case_state")
    public final String kycCaseState;

    @C09CT("kyc_verify_schema_info")
    public final KYCVerifySchemaInfo kycVerifySchemaInfo;

    @C09CT("user_level_state")
    public final String userLevelState;

    @C09CT("wallet_user_id")
    public final Long walletUserId;

    public UserInfo() {
        this(null, null, null, null);
    }

    public UserInfo(Long l, String str, String str2, KYCVerifySchemaInfo kYCVerifySchemaInfo) {
        this.walletUserId = l;
        this.kycCaseState = str;
        this.userLevelState = str2;
        this.kycVerifySchemaInfo = kYCVerifySchemaInfo;
    }
}
