package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class TopicResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("onboarding_guide_topic_list")
        public List<SpaceTopicInfo> onboardingGuideTopicList = new ArrayList();

        @C09CT("topic_by_category_list")
        public List<TopicByCategory> topicByCategoryList = new ArrayList();
    }
}
