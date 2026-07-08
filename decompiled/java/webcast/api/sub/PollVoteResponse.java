package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SpacePoll;

/* JADX INFO: loaded from: classes8.dex */
public final class PollVoteResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("poll")
        public SpacePoll poll;
    }
}
