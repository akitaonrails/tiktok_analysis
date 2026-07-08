package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SpotlightInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class SpotlightResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("spotlight_info")
        public SpotlightInfo spotlightInfo;
    }
}
