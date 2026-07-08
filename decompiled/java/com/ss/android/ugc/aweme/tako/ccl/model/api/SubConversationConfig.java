package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class SubConversationConfig {
    public final boolean LIZ;

    @C09CT("bot_id")
    public long botId;

    @C09CT("bot_source")
    public int botSource;

    @C09CT("conversation_id")
    public final String conversationId;

    @C09CT("title")
    public final String conversationTitle;

    @C09CT("history_cursor")
    public long historyCursor;

    @C09CT("latest_message_time")
    public long latestMessageTime;

    @C09CT("read_cursor")
    public long readCursor;

    @C09CT("related_video")
    public final BaseVideo relatedVideo;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("sub_conv_id")
    public String subConversationId;

    @C09CT("unread_count")
    public final long unreadCount;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubConversationConfig)) {
            return false;
        }
        SubConversationConfig subConversationConfig = (SubConversationConfig) obj;
        return this.LIZ == subConversationConfig.LIZ && Intrinsics.LJFF(this.conversationId, subConversationConfig.conversationId) && Intrinsics.LJFF(this.subConversationId, subConversationConfig.subConversationId) && Intrinsics.LJFF(this.conversationTitle, subConversationConfig.conversationTitle) && this.botSource == subConversationConfig.botSource && this.botId == subConversationConfig.botId && this.readCursor == subConversationConfig.readCursor && this.historyCursor == subConversationConfig.historyCursor && this.unreadCount == subConversationConfig.unreadCount && this.latestMessageTime == subConversationConfig.latestMessageTime && Intrinsics.LJFF(this.relatedVideo, subConversationConfig.relatedVideo) && this.status == subConversationConfig.status;
    }

    public final String toString() {
        return "SubConversationConfig(initialized=" + this.LIZ + ", conversationId=" + this.conversationId + ", subConversationId=" + this.subConversationId + ", conversationTitle=" + this.conversationTitle + ", botSource=" + this.botSource + ", botId=" + this.botId + ", readCursor=" + this.readCursor + ", historyCursor=" + this.historyCursor + ", unreadCount=" + this.unreadCount + ", latestMessageTime=" + this.latestMessageTime + ", relatedVideo=" + this.relatedVideo + ", status=" + this.status + ')';
    }

    public SubConversationConfig() {
        this(false, "", "", "", 0, 0L, 0L, 0L, 0L, 0L, null, 0);
    }

    public SubConversationConfig(boolean z, String str, String str2, String str3, int i, long j, long j2, long j3, long j4, long j5, BaseVideo baseVideo, int i2) {
        this.LIZ = z;
        this.conversationId = str;
        this.subConversationId = str2;
        this.conversationTitle = str3;
        this.botSource = i;
        this.botId = j;
        this.readCursor = j2;
        this.historyCursor = j3;
        this.unreadCount = j4;
        this.latestMessageTime = j5;
        this.relatedVideo = baseVideo;
        this.status = i2;
    }
}
