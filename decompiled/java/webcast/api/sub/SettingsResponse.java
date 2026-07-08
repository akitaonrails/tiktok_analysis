package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;

/* JADX INFO: loaded from: classes8.dex */
public final class SettingsResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("members_count")
        public long membersCount;

        @C09CT("preview_post")
        public SpacePost previewPost;
    }
}
