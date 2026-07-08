package com.ss.android.ugc.aweme.account.login.trustedfriends;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class RecoveryVerificationStatusResponse implements Serializable {
    public static final int $stable = 0;

    @C09CT("data")
    public final TrustedFriendAccountRecoveryStatus data;

    public RecoveryVerificationStatusResponse() {
        this(new TrustedFriendAccountRecoveryStatus(-1, CardStruct.IStatusCode.DEFAULT));
    }

    public RecoveryVerificationStatusResponse(TrustedFriendAccountRecoveryStatus trustedFriendAccountRecoveryStatus) {
        this.data = trustedFriendAccountRecoveryStatus;
    }

    public static final class TrustedFriendAccountRecoveryStatus implements Serializable {
        public static final int $stable = 0;

        @C09CT("error_code")
        public final String errorCode;

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public final int status;

        public TrustedFriendAccountRecoveryStatus() {
            this(-1, CardStruct.IStatusCode.DEFAULT);
        }

        public TrustedFriendAccountRecoveryStatus(int i, String str) {
            this.status = i;
            this.errorCode = str;
        }
    }
}
