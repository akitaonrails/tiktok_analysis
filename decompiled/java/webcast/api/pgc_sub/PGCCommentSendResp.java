package webcast.api.pgc_sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem;
import com.bytedance.android.pgcsdk.subscribe.model.PGCSubsTransitionPeriodInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class PGCCommentSendResp {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("comment")
        public SpaceCommentItem comment;

        @C09CT("transition_period_info")
        public PGCSubsTransitionPeriodInfo transitionPeriodInfo;
    }
}
