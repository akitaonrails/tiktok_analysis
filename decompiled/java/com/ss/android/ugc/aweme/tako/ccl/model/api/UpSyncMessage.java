package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C2188811AlT;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public final class UpSyncMessage {
    public final transient Message LIZ;

    @C09CT("chat_msg_key")
    public final String chatMsgKey;

    @C09CT("msg_content")
    public String msgContent;

    @C09CT("msg_ext")
    public Map<String, String> msgExt;

    @C09CT("msg_type")
    public final Integer msgType;

    @C09CT("query")
    public final String query;

    @C09CT("sender")
    public MessageSender sender;

    @C09CT("uuid")
    public String uuid = "";

    public final int hashCode() {
        int iHashCode = ((this.query.hashCode() * 31) + this.chatMsgKey.hashCode()) * 31;
        Message message = this.LIZ;
        int iHashCode2 = (iHashCode + (message == null ? 0 : message.hashCode())) * 31;
        Integer num = this.msgType;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.msgContent;
        int iHashCode4 = (((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.sender.hashCode()) * 31;
        Map<String, String> map = this.msgExt;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpSyncMessage(query=");
        sbLIZ.append(this.query);
        sbLIZ.append(", chatMsgKey=");
        sbLIZ.append(this.chatMsgKey);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", msgType=");
        sbLIZ.append(this.msgType);
        sbLIZ.append(", msgContent=");
        sbLIZ.append(this.msgContent);
        sbLIZ.append(", sender=");
        sbLIZ.append(this.sender);
        sbLIZ.append(", msgExt=");
        sbLIZ.append(this.msgExt);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UpSyncMessage(String str, String str2, Message message, Integer num, String str3, MessageSender messageSender, Map<String, String> map) {
        this.query = str;
        this.chatMsgKey = str2;
        this.LIZ = message;
        this.msgType = num;
        this.msgContent = str3;
        this.sender = messageSender;
        this.msgExt = map;
    }
}
