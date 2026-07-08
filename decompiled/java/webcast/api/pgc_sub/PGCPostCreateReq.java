package webcast.api.pgc_sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class PGCPostCreateReq {

    @C09CT("content_type")
    public int contentType;

    @C09CT("poll_info")
    public PGCSpacePollReqInfo pollInfo;

    @C09CT("text")
    public String text = "";

    @C09CT("topic_info")
    public SpaceTopicInfo topicInfo;
}
