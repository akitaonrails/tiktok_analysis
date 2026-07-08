package com.ss.android.ugc.gamora.editorpro.aiediting.magic.logic;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class EffectToClientMessage {
    public static final int $stable = 8;

    @C09CT("error_code")
    public int errorCode;
    public String log;

    @C09CT("message_id")
    public int messageId;

    @C09CT("message_total")
    public int messageTotal;
    public List<SpeedSegment> segments;
    public String interfaceType = "";
    public String status = "";

    @C09CT("error_message")
    public String errorMsg = "";

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final String getInterfaceType() {
        return this.interfaceType;
    }

    public final String getLog() {
        return this.log;
    }

    public final int getMessageId() {
        return this.messageId;
    }

    public final int getMessageTotal() {
        return this.messageTotal;
    }

    public final List<SpeedSegment> getSegments() {
        return this.segments;
    }

    public final String getStatus() {
        return this.status;
    }

    public final void setErrorCode(int i) {
        this.errorCode = i;
    }

    public final void setErrorMsg(String str) {
        this.errorMsg = str;
    }

    public final void setInterfaceType(String str) {
        this.interfaceType = str;
    }

    public final void setLog(String str) {
        this.log = str;
    }

    public final void setMessageId(int i) {
        this.messageId = i;
    }

    public final void setMessageTotal(int i) {
        this.messageTotal = i;
    }

    public final void setSegments(List<SpeedSegment> list) {
        this.segments = list;
    }

    public final void setStatus(String str) {
        this.status = str;
    }
}
