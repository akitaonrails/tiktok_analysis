package com.ss.android.ugc.aweme.account.api;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class UserSettingsResponse implements Serializable {
    public static final int $stable = 0;

    @C09CT("data")
    public final UserSettingsData data;

    @C09CT("message")
    public final String message;

    public UserSettingsResponse(UserSettingsData userSettingsData, String str) {
        this.data = userSettingsData;
        this.message = str;
    }

    public static final class UserSettingsData implements Serializable {
        public static final int $stable = 0;

        @C09CT("business_account_2sv_upsell")
        public final Integer business_account_2sv_upsell;

        @C09CT("description")
        public final String description;

        @C09CT("error_code")
        public final Integer errorCode;

        @C09CT("follower_2sv_upsell")
        public final Integer follower_2sv_upsell;

        @C09CT("gen_pop_wallet_2sv_upsell")
        public final Integer gen_pop_wallet_2sv_upsell;

        @C09CT("managed_account_2sv_upsell")
        public final Integer managed_account_2sv_upsell;

        @C09CT("sync_nickname2username")
        public final String syncNickname2Username;

        @C09CT("sync_username2nickname")
        public final String syncUsername2Nickname;

        @C09CT("tt_live_2sv_upsell")
        public final Integer tt_live_2sv_upsell;

        @C09CT("tt_shop_2sv_upsell")
        public final Integer tt_shop_2sv_upsell;

        public UserSettingsData() {
            this(null, null, 0, null, null, 0, 0, 0, 0, 0);
        }

        public UserSettingsData(String str, Integer num, Integer num2, String str2, String str3, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
            this.description = str;
            this.errorCode = num;
            this.follower_2sv_upsell = num2;
            this.syncUsername2Nickname = str2;
            this.syncNickname2Username = str3;
            this.tt_live_2sv_upsell = num3;
            this.tt_shop_2sv_upsell = num4;
            this.business_account_2sv_upsell = num5;
            this.managed_account_2sv_upsell = num6;
            this.gen_pop_wallet_2sv_upsell = num7;
        }
    }
}
