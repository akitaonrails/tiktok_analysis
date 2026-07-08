package com.bytedance.im.core.internal.link.handler.statusupdater;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class CommandMessage {

    @C09CT("added_participant")
    public final List<Long> addedMembers;

    @C09CT("conversation_id")
    public final String conversationId;

    @C09CT("conversation_min_index")
    public final long conversationMinIndex;

    @C09CT("conversation_version")
    public final long conversationVersion;

    @C09CT("group_version")
    public final long groupVersion;

    @C09CT("inbox_type")
    public final int inboxType;

    @C09CT("message_id")
    public final long msgId;

    @C09CT("read_badge_count_v2")
    public final int readBadgeCountV2;

    @C09CT("read_index")
    public final long readIndex;

    @C09CT("removed_participant")
    public final List<Long> removedMembers;

    @C09CT("command_type")
    public final int type;

    @C09CT("unread_count")
    public final int unreadCount;

    public CommandMessage() {
        this(0, 0, "", 0L, 0L, 0, 0, 0L, 0L, null, null, 0L);
    }

    public CommandMessage(int i, int i2, String str, long j, long j2, int i3, int i4, long j3, long j4, List<Long> list, List<Long> list2, long j5) {
        this.type = i;
        this.inboxType = i2;
        this.conversationId = str;
        this.msgId = j;
        this.readIndex = j2;
        this.readBadgeCountV2 = i3;
        this.unreadCount = i4;
        this.conversationVersion = j3;
        this.groupVersion = j4;
        this.addedMembers = list;
        this.removedMembers = list2;
        this.conversationMinIndex = j5;
    }
}
