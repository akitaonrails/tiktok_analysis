package com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class SellerMessage {

    @C09CT("content")
    public final String content;

    @C09CT("conversationId")
    public final String conversationId;

    @C09CT("conversationShortId")
    public final String conversationShortId;

    @C09CT("conversationType")
    public final Long conversationType;

    @C09CT("createTime")
    public final Long createTime;

    @C09CT("ext")
    public final Map<String, String> ext;

    @C09CT("inbox")
    public final String inbox;

    @C09CT("indexInConversation")
    public final Long indexInConversation;

    @C09CT("messageId")
    public final String messageId;

    @C09CT("msgType")
    public final Integer msgType;

    @C09CT("orderInConversation")
    public final String orderInConversation;

    @C09CT("sender")
    public final String sender;

    @C09CT("senderId")
    public final String senderId;

    @C09CT("serverMessageId")
    public final String serverMessageId;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    @C09CT("version")
    public final Integer version;

    public SellerMessage() {
        this(0L, null, null, null, 0, null, 0, 0, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SellerMessage)) {
            return false;
        }
        SellerMessage sellerMessage = (SellerMessage) obj;
        return Intrinsics.LJFF(this.conversationType, sellerMessage.conversationType) && Intrinsics.LJFF(this.conversationId, sellerMessage.conversationId) && Intrinsics.LJFF(this.conversationShortId, sellerMessage.conversationShortId) && Intrinsics.LJFF(this.serverMessageId, sellerMessage.serverMessageId) && Intrinsics.LJFF(this.msgType, sellerMessage.msgType) && Intrinsics.LJFF(this.content, sellerMessage.content) && Intrinsics.LJFF(this.version, sellerMessage.version) && Intrinsics.LJFF(this.status, sellerMessage.status) && Intrinsics.LJFF(this.createTime, sellerMessage.createTime) && Intrinsics.LJFF(this.sender, sellerMessage.sender) && Intrinsics.LJFF(this.indexInConversation, sellerMessage.indexInConversation) && Intrinsics.LJFF(this.orderInConversation, sellerMessage.orderInConversation) && Intrinsics.LJFF(this.messageId, sellerMessage.messageId) && Intrinsics.LJFF(this.senderId, sellerMessage.senderId) && Intrinsics.LJFF(this.inbox, sellerMessage.inbox) && Intrinsics.LJFF(this.ext, sellerMessage.ext);
    }

    public final int hashCode() {
        Long l = this.conversationType;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.conversationId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.conversationShortId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.serverMessageId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.msgType;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.content;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.version;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.status;
        int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l2 = this.createTime;
        int iHashCode9 = (iHashCode8 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str5 = this.sender;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l3 = this.indexInConversation;
        int iHashCode11 = (iHashCode10 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str6 = this.orderInConversation;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.messageId;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.senderId;
        int iHashCode14 = (iHashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.inbox;
        int iHashCode15 = (iHashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Map<String, String> map = this.ext;
        return iHashCode15 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "SellerMessage(conversationType=" + this.conversationType + ", conversationId=" + this.conversationId + ", conversationShortId=" + this.conversationShortId + ", serverMessageId=" + this.serverMessageId + ", msgType=" + this.msgType + ", content=" + this.content + ", version=" + this.version + ", status=" + this.status + ", createTime=" + this.createTime + ", sender=" + this.sender + ", indexInConversation=" + this.indexInConversation + ", orderInConversation=" + this.orderInConversation + ", messageId=" + this.messageId + ", senderId=" + this.senderId + ", inbox=" + this.inbox + ", ext=" + this.ext + ')';
    }

    public SellerMessage(Long l, String str, String str2, String str3, Integer num, String str4, Integer num2, Integer num3, Long l2, String str5, Long l3, String str6, String str7, String str8, String str9, Map<String, String> map) {
        this.conversationType = l;
        this.conversationId = str;
        this.conversationShortId = str2;
        this.serverMessageId = str3;
        this.msgType = num;
        this.content = str4;
        this.version = num2;
        this.status = num3;
        this.createTime = l2;
        this.sender = str5;
        this.indexInConversation = l3;
        this.orderInConversation = str6;
        this.messageId = str7;
        this.senderId = str8;
        this.inbox = str9;
        this.ext = map;
    }
}
