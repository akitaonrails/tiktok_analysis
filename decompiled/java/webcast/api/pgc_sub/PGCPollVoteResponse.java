package webcast.api.pgc_sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SpacePoll;
import com.bytedance.android.pgcsdk.subscribe.model.PGCSubsTransitionPeriodInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class PGCPollVoteResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("poll")
        public SpacePoll poll;

        @C09CT("transition_period_info")
        public PGCSubsTransitionPeriodInfo transitionPeriodInfo;
    }
}
