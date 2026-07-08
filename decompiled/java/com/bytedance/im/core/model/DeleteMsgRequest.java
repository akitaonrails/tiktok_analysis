package com.bytedance.im.core.model;

import X.C09CT;
import X.C0Y14;
import X.C0Y15;
import com.bytedance.im.core.proto.DeleteMessageRequestBody;
import com.bytedance.im.core.proto.DeleteStrangerMessageRequestBody;
import java.io.Serializable;

/* JADX INFO: loaded from: classes15.dex */
public class DeleteMsgRequest implements Serializable {

    @C09CT("cid")
    public String conversationId;

    @C09CT("short_id")
    public Long conversationShortId;

    @C09CT("c_type")
    public Integer conversationType;

    @C09CT("inbox")
    public Integer inboxType;

    @C09CT("server_message_id")
    public Long server_message_id;

    @C09CT("del_time")
    public Long userDelTime;

    @C09CT("retry_times")
    public Integer retryTimes = 0;

    @C09CT("is_stranger")
    public boolean isStranger = false;

    public DeleteMessageRequestBody toMsgReqBody() {
        C0Y14 c0y14 = new C0Y14();
        c0y14.LIZLLL = this.conversationId;
        c0y14.LJ = this.conversationShortId;
        c0y14.LJFF = this.conversationType;
        c0y14.LJI = this.server_message_id;
        return c0y14.build();
    }

    public DeleteStrangerMessageRequestBody toStrangeMsgReqBody() {
        C0Y15 c0y15 = new C0Y15();
        c0y15.LJ = this.conversationShortId;
        c0y15.LIZLLL = this.server_message_id;
        return c0y15.build();
    }

    public static DeleteMsgRequest fromReqBody(int i, DeleteMessageRequestBody deleteMessageRequestBody) {
        DeleteMsgRequest deleteMsgRequest = new DeleteMsgRequest();
        deleteMsgRequest.inboxType = Integer.valueOf(i);
        deleteMsgRequest.conversationId = deleteMessageRequestBody.conversation_id;
        deleteMsgRequest.conversationShortId = deleteMessageRequestBody.conversation_short_id;
        deleteMsgRequest.conversationType = deleteMessageRequestBody.conversation_type;
        deleteMsgRequest.server_message_id = deleteMessageRequestBody.message_id;
        deleteMsgRequest.isStranger = false;
        deleteMsgRequest.userDelTime = Long.valueOf(System.currentTimeMillis());
        return deleteMsgRequest;
    }

    public static DeleteMsgRequest fromReqBody(int i, DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody) {
        DeleteMsgRequest deleteMsgRequest = new DeleteMsgRequest();
        deleteMsgRequest.inboxType = Integer.valueOf(i);
        deleteMsgRequest.conversationShortId = deleteStrangerMessageRequestBody.conversation_short_id;
        deleteMsgRequest.isStranger = true;
        deleteMsgRequest.userDelTime = Long.valueOf(System.currentTimeMillis());
        return deleteMsgRequest;
    }
}
