package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicCategory;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicContent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class TopicByCategory {

    @C09CT("topic_category")
    public SpaceTopicCategory topicCategory;

    @C09CT("topic_content_list")
    public List<SpaceTopicContent> topicContentList = new ArrayList();
}
