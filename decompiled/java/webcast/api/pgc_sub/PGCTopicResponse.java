package webcast.api.pgc_sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicInfo;
import com.bytedance.android.pgcsdk.subscribe.model.PGCSubsTransitionPeriodInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class PGCTopicResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("onboarding_guide_topic_list")
        public List<SpaceTopicInfo> onboardingGuideTopicList = new ArrayList();

        @C09CT("topic_by_category_list")
        public List<PGCTopicByCategory> topicByCategoryList = new ArrayList();

        @C09CT("transition_period_info")
        public PGCSubsTransitionPeriodInfo transitionPeriodInfo;
    }
}
