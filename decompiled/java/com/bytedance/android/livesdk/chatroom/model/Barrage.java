package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;

/* JADX INFO: loaded from: classes18.dex */
public class Barrage {

    @C09CT("content")
    public String content;

    @C09CT("left_diamond")
    public int leftDiamond;

    @C09CT("msg_id")
    public long msgId;

    @C09CT("order_id")
    public String orderId;

    @C09CT("msg")
    public String screenChatMsg;

    public String getContent() {
        return this.content;
    }

    public int getLeftDiamond() {
        return this.leftDiamond;
    }

    public long getMsgId() {
        return this.msgId;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getScreenChatMsg() {
        return this.screenChatMsg;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setLeftDiamond(int i) {
        this.leftDiamond = i;
    }

    public void setMsgId(long j) {
        this.msgId = j;
    }

    public void setOrderId(String str) {
        this.orderId = str;
    }

    public void setScreenChatMsg(String str) {
        this.screenChatMsg = str;
    }
}
