package webcast.api.pgc_sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.pgcsdk.subscribe.model.PGCSubsTransitionPeriodInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class PGCPostCreateResp {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("post")
        public SpacePost post;

        @C09CT("transition_period_info")
        public PGCSubsTransitionPeriodInfo transitionPeriodInfo;
    }
}
