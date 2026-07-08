package com.bytedance.im.core.model;

import X.C09CT;
import X.C0Y2F;
import com.bytedance.im.core.proto.DeleteConversationRequestBody;
import java.io.Serializable;

/* JADX INFO: loaded from: classes15.dex */
public class DeleteConversationRequest implements Serializable {

    @C09CT("badge")
    public int badgeCount;

    @C09CT("cid")
    public String conversationId;

    @C09CT("short_id")
    public long conversationShortId;

    @C09CT("c_type")
    public int conversationType;

    @C09CT("inbox")
    public int inboxType;

    @C09CT("index")
    public long lastMsgIndex;

    @C09CT("index_v2")
    public long lastMsgIndexV2;

    @C09CT("retry_times")
    public int retryTimes;

    @C09CT("del_time")
    public long userDelTime;

    public DeleteConversationRequestBody toReqBody() {
        C0Y2F c0y2f = new C0Y2F();
        c0y2f.LIZLLL = this.conversationId;
        c0y2f.LJ = Long.valueOf(this.conversationShortId);
        c0y2f.LJFF = Integer.valueOf(this.conversationType);
        c0y2f.LJI = Long.valueOf(this.lastMsgIndex);
        c0y2f.LJII = Long.valueOf(this.lastMsgIndexV2);
        c0y2f.LJIIIIZZ = Integer.valueOf(this.badgeCount);
        return c0y2f.build();
    }

    public static DeleteConversationRequest fromReqBody(int i, String str, DeleteConversationRequestBody deleteConversationRequestBody) {
        DeleteConversationRequest deleteConversationRequest = new DeleteConversationRequest();
        deleteConversationRequest.inboxType = i;
        deleteConversationRequest.conversationId = str;
        deleteConversationRequest.conversationShortId = deleteConversationRequestBody.conversation_short_id.longValue();
        deleteConversationRequest.conversationType = deleteConversationRequestBody.conversation_type.intValue();
        deleteConversationRequest.lastMsgIndex = deleteConversationRequestBody.last_message_index.longValue();
        deleteConversationRequest.lastMsgIndexV2 = deleteConversationRequestBody.last_message_index_v2.longValue();
        deleteConversationRequest.badgeCount = deleteConversationRequestBody.badge_count.intValue();
        deleteConversationRequest.userDelTime = System.currentTimeMillis();
        return deleteConversationRequest;
    }
}
