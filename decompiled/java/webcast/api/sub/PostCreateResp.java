package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;

/* JADX INFO: loaded from: classes8.dex */
public final class PostCreateResp {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("post")
        public SpacePost post;
    }
}
