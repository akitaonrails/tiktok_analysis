package com.ss.android.ugc.aweme.story.model;

import X.C09CT;
import X.C2188811AlT;
import X.C730160SkY;
import X.C869590Y9l;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryInteraction implements Serializable {

    @C09CT("conversation_id")
    public final String conversationId;

    @C09CT("emoji_content")
    public final String emojiContent;

    @C09CT("flip_count")
    public final long flipCount;

    @C09CT("is_unlocked_reveal")
    public final boolean isUnlockedReveal;
    public String messageContent;

    @C09CT("message_id")
    public final long messageId;
    public C869590Y9l msg;

    @C09CT("type")
    public final int type;
    public static final C730160SkY Companion = new Object() { // from class: X.0SkY
    };
    public static final int $stable = 8;

    public final StoryInteraction copy(int i, String str, String str2, long j, long j2, boolean z, String str3, C869590Y9l c869590Y9l) {
        return new StoryInteraction(i, str, str2, j, j2, z, str3, c869590Y9l);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryInteraction(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", emojiContent=");
        sbLIZ.append(this.emojiContent);
        sbLIZ.append(", conversationId=");
        sbLIZ.append(this.conversationId);
        sbLIZ.append(", messageId=");
        sbLIZ.append(this.messageId);
        sbLIZ.append(", flipCount=");
        sbLIZ.append(this.flipCount);
        sbLIZ.append(", isUnlockedReveal=");
        sbLIZ.append(this.isUnlockedReveal);
        sbLIZ.append(", messageContent=");
        sbLIZ.append(this.messageContent);
        sbLIZ.append(", msg=");
        sbLIZ.append(this.msg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isUnlockedReveal() {
        return this.isUnlockedReveal;
    }

    public boolean equals(Object obj) {
        StoryInteraction storyInteraction;
        if (obj instanceof StoryInteraction) {
            storyInteraction = (StoryInteraction) obj;
        } else {
            storyInteraction = null;
        }
        if (storyInteraction == null || this.type != storyInteraction.type || !Intrinsics.LJFF(this.emojiContent, storyInteraction.emojiContent) || !Intrinsics.LJFF(this.conversationId, storyInteraction.conversationId) || this.messageId != storyInteraction.messageId || this.flipCount != storyInteraction.flipCount || this.isUnlockedReveal != storyInteraction.isUnlockedReveal) {
            return false;
        }
        return true;
    }

    public final void setMessageContent(String str) {
        this.messageContent = str;
    }

    public final void setMsg(C869590Y9l c869590Y9l) {
        this.msg = c869590Y9l;
    }

    public StoryInteraction(int i, String str, String str2, long j, long j2, boolean z, String str3, C869590Y9l c869590Y9l) {
        this.type = i;
        this.emojiContent = str;
        this.conversationId = str2;
        this.messageId = j;
        this.flipCount = j2;
        this.isUnlockedReveal = z;
        this.messageContent = str3;
        this.msg = c869590Y9l;
    }
}
