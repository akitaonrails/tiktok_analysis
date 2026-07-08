package webcast.api.partnership;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.UserInfo;

/* JADX INFO: loaded from: classes.dex */
public final class UserInfoResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("info")
        public UserInfo info;
    }
}
