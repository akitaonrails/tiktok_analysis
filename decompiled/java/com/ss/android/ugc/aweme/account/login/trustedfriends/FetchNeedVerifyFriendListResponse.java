package com.ss.android.ugc.aweme.account.login.trustedfriends;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class FetchNeedVerifyFriendListResponse implements Serializable {
    public static final int $stable = 0;

    @C09CT("data")
    public final NeedToVerifyFriendStatus data;

    public FetchNeedVerifyFriendListResponse() {
        this(new NeedToVerifyFriendStatus(false, CardStruct.IStatusCode.DEFAULT));
    }

    public FetchNeedVerifyFriendListResponse(NeedToVerifyFriendStatus needToVerifyFriendStatus) {
        this.data = needToVerifyFriendStatus;
    }

    public static final class NeedToVerifyFriendStatus implements Serializable {
        public static final int $stable = 0;

        @C09CT("error_code")
        public final String errorCode;

        @C09CT("show_red_dot")
        public final boolean showRedDot;

        public NeedToVerifyFriendStatus() {
            this(false, CardStruct.IStatusCode.DEFAULT);
        }

        public NeedToVerifyFriendStatus(boolean z, String str) {
            this.showRedDot = z;
            this.errorCode = str;
        }
    }
}
