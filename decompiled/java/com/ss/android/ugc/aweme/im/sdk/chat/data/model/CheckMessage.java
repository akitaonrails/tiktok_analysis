package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C09CT;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;

/* JADX INFO: loaded from: classes3.dex */
public final class CheckMessage {
    public static final Companion Companion = new Companion();

    @C09CT("decision_detail")
    public String decisionDetail;

    @C09CT("decision_rule_id")
    public String decisionRuleId;

    @C09CT("event_tracking")
    public EventTrackingData eventTrackingStruct;

    @C09CT("media_mask")
    public Boolean mediaMask;

    @C09CT("raw_check_code")
    public int rawCheckCode;

    @C09CT("status_code")
    public int statusCode;

    @C09CT("status_msg")
    public StatusMsg statusMsg;

    public static final class EventTrackingData {

        @C09CT(Scene.SCENE_SERVICE)
        public String scene;

        public final String getScene() {
            return this.scene;
        }

        public final void setScene(String str) {
            this.scene = str;
        }
    }

    public static final class StatusMsg {

        @C09CT("msg_content")
        public SystemContent msgContent;

        @C09CT("msg_type")
        public int msgType;

        @C09CT("notice_code")
        public String noticeCode;

        public final SystemContent getMsgContent() {
            return this.msgContent;
        }

        public final int getMsgType() {
            return this.msgType;
        }

        public final String getNoticeCode() {
            return this.noticeCode;
        }

        public final void setMsgContent(SystemContent systemContent) {
            this.msgContent = systemContent;
        }

        public final void setMsgType(int i) {
            this.msgType = i;
        }

        public final void setNoticeCode(String str) {
            this.noticeCode = str;
        }
    }

    public final String getDecisionDetail() {
        return this.decisionDetail;
    }

    public final String getDecisionRuleId() {
        return this.decisionRuleId;
    }

    public final EventTrackingData getEventTrackingStruct() {
        return this.eventTrackingStruct;
    }

    public final Boolean getMediaMask() {
        return this.mediaMask;
    }

    public final int getRawCheckCode() {
        return this.rawCheckCode;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final StatusMsg getStatusMsg() {
        return this.statusMsg;
    }

    public static final class Companion {
        public final SystemContent getContent(CheckMessage checkMessage) {
            StatusMsg statusMsg;
            if (checkMessage != null && (statusMsg = checkMessage.getStatusMsg()) != null) {
                return statusMsg.getMsgContent();
            }
            return null;
        }
    }

    public final void setDecisionDetail(String str) {
        this.decisionDetail = str;
    }

    public final void setDecisionRuleId(String str) {
        this.decisionRuleId = str;
    }

    public final void setEventTrackingStruct(EventTrackingData eventTrackingData) {
        this.eventTrackingStruct = eventTrackingData;
    }

    public final void setMediaMask(Boolean bool) {
        this.mediaMask = bool;
    }

    public final void setRawCheckCode(int i) {
        this.rawCheckCode = i;
    }

    public final void setStatusCode(int i) {
        this.statusCode = i;
    }

    public final void setStatusMsg(StatusMsg statusMsg) {
        this.statusMsg = statusMsg;
    }
}
