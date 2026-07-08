package com.ss.android.ugc.aweme.story.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryInteractionWrap implements Serializable {
    public static final int $stable = 0;

    @C09CT("conversation_id")
    public final String conversationId;

    @C09CT("emoji_content")
    public final String emojiContent;

    @C09CT("flip_count")
    public final Long flipCount;

    @C09CT("message_id")
    public final Long messageId;

    @C09CT("type")
    public final Integer type;

    @C09CT("user_id")
    public final String uid;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryInteractionWrap(uid=");
        sbLIZ.append(this.uid);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", emojiContent=");
        sbLIZ.append(this.emojiContent);
        sbLIZ.append(", conversationId=");
        sbLIZ.append(this.conversationId);
        sbLIZ.append(", messageId=");
        sbLIZ.append(this.messageId);
        sbLIZ.append(", flipCount=");
        sbLIZ.append(this.flipCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StoryInteractionWrap(String str, Integer num, String str2, String str3, Long l, Long l2) {
        this.uid = str;
        this.type = num;
        this.emojiContent = str2;
        this.conversationId = str3;
        this.messageId = l;
        this.flipCount = l2;
    }
}
