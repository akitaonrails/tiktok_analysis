package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import com.bytedance.android.livesdk.chatroom.model.interact.TopicSessionStatus;

/* JADX INFO: loaded from: classes.dex */
public final class CohostTopicMessage extends AbstractC1136060ffY {

    @C09CT("action")
    public int action;

    @C09CT("heat_update_content")
    public HeatUpdateContent heatUpdateContent;

    @C09CT("session_status")
    public TopicSessionStatus sessionStatus;

    @C09CT("topic")
    public CohostTopic topic;

    @C09CT("topic_set_content")
    public TopicSetContent topicSetContent;

    public CohostTopicMessage() {
        this.type = C001A.COHOST_TOPIC_MESSAGE;
    }
}
