package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SubQueue;

/* JADX INFO: loaded from: classes29.dex */
public final class SubQueueCreateResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("queue")
        public SubQueue queue;
    }
}
