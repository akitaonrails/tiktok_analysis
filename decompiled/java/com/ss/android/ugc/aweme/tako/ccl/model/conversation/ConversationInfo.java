package com.ss.android.ugc.aweme.tako.ccl.model.conversation;

import X.C09CT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseVideo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.UpdateUserSettings;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class ConversationInfo {

    @C09CT("bot_id")
    public long botId;

    @C09CT("bot_source")
    public int botSource;

    @C09CT("conversation_id")
    public final String conversationId;

    @C09CT("title")
    public final String conversationTitle;

    @C09CT("tako_conv_settings")
    public final UpdateUserSettings conversationUserSettings;

    @C09CT("latest_message")
    public final Message lastMessage;

    @C09CT("latest_message_id")
    public final long latestMessageId;

    @C09CT("latest_message_time")
    public final long latestMessageTime;

    @C09CT("other_info")
    public final ConversationOtherInfo otherInfo;

    @C09CT("latest_ack_msg_seq_id")
    public final long readCursor;

    @C09CT("related_video")
    public final BaseVideo relatedVideo;

    @C09CT("sub_conv_id")
    public final String subConversationId;

    @C09CT("unread_count")
    public long unreadCount;

    public ConversationInfo() {
        this("mockConversation", 0L, null, 0L, new ConversationOtherInfo(0, 0L, false), new UpdateUserSettings(false, false, 0, false, false, false, "", Boolean.FALSE), 0, 0L, "", "", 0L, 0L, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationInfo)) {
            return false;
        }
        ConversationInfo conversationInfo = (ConversationInfo) obj;
        return Intrinsics.LJFF(this.conversationId, conversationInfo.conversationId) && this.latestMessageId == conversationInfo.latestMessageId && Intrinsics.LJFF(this.lastMessage, conversationInfo.lastMessage) && this.readCursor == conversationInfo.readCursor && Intrinsics.LJFF(this.otherInfo, conversationInfo.otherInfo) && Intrinsics.LJFF(this.conversationUserSettings, conversationInfo.conversationUserSettings) && this.botSource == conversationInfo.botSource && this.botId == conversationInfo.botId && Intrinsics.LJFF(this.subConversationId, conversationInfo.subConversationId) && Intrinsics.LJFF(this.conversationTitle, conversationInfo.conversationTitle) && this.unreadCount == conversationInfo.unreadCount && this.latestMessageTime == conversationInfo.latestMessageTime && Intrinsics.LJFF(this.relatedVideo, conversationInfo.relatedVideo);
    }

    public final int hashCode() {
        int iHashCode = ((this.conversationId.hashCode() * 31) + C786410Ut5.Y2(this.latestMessageId)) * 31;
        Message message = this.lastMessage;
        int iHashCode2 = (((((((((((iHashCode + (message == null ? 0 : message.hashCode())) * 31) + C786410Ut5.Y2(this.readCursor)) * 31) + this.otherInfo.hashCode()) * 31) + this.conversationUserSettings.hashCode()) * 31) + this.botSource) * 31) + C786410Ut5.Y2(this.botId)) * 31;
        String str = this.subConversationId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.conversationTitle;
        int iHashCode4 = (((((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Y2(this.unreadCount)) * 31) + C786410Ut5.Y2(this.latestMessageTime)) * 31;
        BaseVideo baseVideo = this.relatedVideo;
        return iHashCode4 + (baseVideo != null ? baseVideo.hashCode() : 0);
    }

    public ConversationInfo(String str, long j, Message message, long j2, ConversationOtherInfo conversationOtherInfo, UpdateUserSettings updateUserSettings, int i, long j3, String str2, String str3, long j4, long j5, BaseVideo baseVideo) {
        this.conversationId = str;
        this.latestMessageId = j;
        this.lastMessage = message;
        this.readCursor = j2;
        this.otherInfo = conversationOtherInfo;
        this.conversationUserSettings = updateUserSettings;
        this.botSource = i;
        this.botId = j3;
        this.subConversationId = str2;
        this.conversationTitle = str3;
        this.unreadCount = j4;
        this.latestMessageTime = j5;
        this.relatedVideo = baseVideo;
    }
}
