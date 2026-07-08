package com.bytedance.im.core.common.statusmsg;

import X.C09CT;
import X.C0Y7K;
import com.bytedance.im.core.proto.status_message.StatusMessage;
import com.bytedance.scene.Scene;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS229S0000000_2;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class BusinessCommandMessage {

    @C09CT("content")
    public String content;

    @C09CT("contentPb")
    public final ByteString contentPb;

    @C09CT("conversationId")
    public final String conversationId;

    @C09CT("conversationType")
    public final int conversationType;

    @C09CT("createTime")
    public final long createTime;

    @C09CT("ext")
    public final Map<String, String> ext;

    @C09CT("logId")
    public final String logId;

    @C09CT("messageSource")
    public final int messageSource;

    @C09CT("messageType")
    public final int messageType;

    @C09CT("onResult")
    public final Function1<C0Y7K, Unit> onResult;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("statusMessage")
    public final StatusMessage statusMessage;

    @C09CT("uniqueId")
    public final String uniqueId;

    public BusinessCommandMessage() {
        this(0, null, 0, 0, null, null, null, 0L, null, null, null, null, AFwS229S0000000_2.get$arr$(63));
    }

    public final String getContent() {
        return this.content;
    }

    public final ByteString getContentPb() {
        return this.contentPb;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final int getConversationType() {
        return this.conversationType;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final Map<String, String> getExt() {
        return this.ext;
    }

    public final String getLogId() {
        return this.logId;
    }

    public final int getMessageSource() {
        return this.messageSource;
    }

    public final int getMessageType() {
        return this.messageType;
    }

    public final Function1<C0Y7K, Unit> getOnResult() {
        return this.onResult;
    }

    public final String getScene() {
        return this.scene;
    }

    public final StatusMessage getStatusMessage() {
        return this.statusMessage;
    }

    public final String getUniqueId() {
        return this.uniqueId;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BusinessCommandMessage(int i, String str, int i2, int i3, String str2, ByteString byteString, String str3, long j, Map<String, String> map, String str4, StatusMessage statusMessage, String str5, Function1<? super C0Y7K, Unit> function1) {
        this.conversationType = i;
        this.conversationId = str;
        this.messageSource = i2;
        this.messageType = i3;
        this.uniqueId = str2;
        this.contentPb = byteString;
        this.scene = str3;
        this.createTime = j;
        this.ext = map;
        this.logId = str4;
        this.statusMessage = statusMessage;
        this.content = str5;
        this.onResult = function1;
    }
}
