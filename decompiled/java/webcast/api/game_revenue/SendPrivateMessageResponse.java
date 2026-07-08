package webcast.api.game_revenue;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes29.dex */
public final class SendPrivateMessageResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("status_code")
        public long statusCode;

        @C09CT("status_message")
        public Text statusMessage;
    }
}
