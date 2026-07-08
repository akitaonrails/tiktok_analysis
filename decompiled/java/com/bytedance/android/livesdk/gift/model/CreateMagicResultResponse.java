package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import tikcast.api.user_level.PayGradeInfo;
import webcast.data.RechargeCustomError;

/* JADX INFO: loaded from: classes.dex */
public final class CreateMagicResultResponse {

    @C09CT("data")
    public Data data;

    @C09CT("extra")
    public Extra extra;

    public static final class Data {

        @C09CT("expire_timestamp")
        public long expireTimestamp;

        @C09CT("left_coins")
        public long leftCoins;

        @C09CT("magic_result")
        public MagicResult magicResult;

        @C09CT("pay_grade_info")
        public PayGradeInfo payGradeInfo;
    }

    public static final class Extra extends com.bytedance.android.livesdk.model.Extra {

        @C09CT("custom_error")
        public RechargeCustomError customError;
    }
}
