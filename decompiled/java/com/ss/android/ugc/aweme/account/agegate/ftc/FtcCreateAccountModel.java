package com.ss.android.ugc.aweme.account.agegate.ftc;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class FtcCreateAccountModel {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(77));

    public static final class UpdateUserNameNetworkEntity {

        @C09CT("data")
        public final UserNameDataEntity data;

        @C09CT("message")
        public final String message;

        public UpdateUserNameNetworkEntity(String str, UserNameDataEntity userNameDataEntity) {
            this.message = str;
            this.data = userNameDataEntity;
        }
    }

    public static final class UserNameDataEntity {

        @C09CT("description")
        public final String description;

        @C09CT("error_code")
        public final int errorCode;

        @C09CT("login_name")
        public final String loginName;

        public UserNameDataEntity() {
            this(0, "", "");
        }

        public UserNameDataEntity(int i, String str, String str2) {
            this.errorCode = i;
            this.description = str;
            this.loginName = str2;
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class LoginNameCheckData {

        @C09CT("description")
        public final String description;

        @C09CT("error_code")
        public final String error_code;

        @C09CT("login_name")
        public final String loginName;

        @C09CT("recommend_usernames")
        public final List<String> suggestions;

        public LoginNameCheckData() {
            this(null, null, null, null);
        }

        public LoginNameCheckData(String str, String str2, String str3, List<String> list) {
            this.loginName = str;
            this.description = str2;
            this.error_code = str3;
            this.suggestions = list;
        }
    }
}
