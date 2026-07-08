package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.WelcomeMessage;

/* JADX INFO: loaded from: classes29.dex */
public final class UpdateWelcomeMessageResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("message")
        public WelcomeMessage message;
    }
}
