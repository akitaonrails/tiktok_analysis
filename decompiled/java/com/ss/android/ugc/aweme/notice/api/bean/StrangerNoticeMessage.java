package com.ss.android.ugc.aweme.notice.api.bean;

import X.C09CT;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.message.model.SimpleUser;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class StrangerNoticeMessage {

    @C09CT("client_msg_id")
    public long clientMsgId;

    @C09CT("content")
    public String content;

    @C09CT("create_time")
    public long createTime;

    @C09CT("device_id")
    public long deviceId;

    @C09CT("ext")
    public String ext;

    @C09CT("from_user")
    public SimpleUser fromUser;

    @C09CT("msg_type")
    public int msgType;

    @C09CT("to_user")
    public SimpleUser toUser;

    public boolean isRecalled() {
        if (TextUtils.isEmpty(this.ext)) {
            return false;
        }
        try {
            return TextUtils.equals("true", (CharSequence) ((HashMap) new Gson().LJII(this.ext, HashMap.class)).get("s:is_recalled"));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public long getClientMsgId() {
        return this.clientMsgId;
    }

    public String getContent() {
        return this.content;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public long getDeviceId() {
        return this.deviceId;
    }

    public String getExt() {
        return this.ext;
    }

    public SimpleUser getFromUser() {
        return this.fromUser;
    }

    public int getMsgType() {
        return this.msgType;
    }

    public SimpleUser getToUser() {
        return this.toUser;
    }

    public void setClientMsgId(long j) {
        this.clientMsgId = j;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setDeviceId(long j) {
        this.deviceId = j;
    }

    public void setExt(String str) {
        this.ext = str;
    }

    public void setFromUser(SimpleUser simpleUser) {
        this.fromUser = simpleUser;
    }

    public void setMsgType(int i) {
        this.msgType = i;
    }

    public void setToUser(SimpleUser simpleUser) {
        this.toUser = simpleUser;
    }
}
