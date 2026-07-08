package com.ss.android.ugc.aweme.im.contacts.api.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class IMUserBizInfo implements Serializable {

    @C09CT("activity_status_setting")
    public Integer activityStatusSetting;

    @C09CT("allow_single_chat_screenshot")
    public Boolean allowSingleChatScreenshot;

    @C09CT("camera_info")
    public IMUserCameraInfo cameraInfo;

    @C09CT("chat_bot_info")
    public IMUserChatBotInfo chatBotInfo;

    @C09CT("chat_bubble_id")
    public Long chatBubbleId;

    @C09CT("group_chat_permission_info")
    public IMGroupChatPermissionInfo groupChatPermissionInfo;

    @C09CT("unlocked_bubble_ids")
    public List<String> unlockedBubbleIds;

    @C09CT("user_b2c_account_info")
    public IMUserB2CAccountInfo userB2CAccountInfo;

    @C09CT("user_id")
    public long userId;

    @C09CT("voice_call_info")
    public IMUserVoiceCallInfo voiceCallInfo;

    @C09CT("share_filter_type")
    public Integer shareFilterType = 0;

    @C09CT("update_time")
    public Long updateTime = 0L;

    @C09CT("affinity_score")
    public Double affinityScore = Double.valueOf(0.0d);

    public static /* synthetic */ void getShareFilterType$annotations() {
    }

    public final Integer getActivityStatusSetting() {
        return this.activityStatusSetting;
    }

    public final Double getAffinityScore() {
        return this.affinityScore;
    }

    public final Boolean getAllowSingleChatScreenshot() {
        return this.allowSingleChatScreenshot;
    }

    public final IMUserCameraInfo getCameraInfo() {
        return this.cameraInfo;
    }

    public final IMUserChatBotInfo getChatBotInfo() {
        return this.chatBotInfo;
    }

    public final Long getChatBubbleId() {
        return this.chatBubbleId;
    }

    public final IMGroupChatPermissionInfo getGroupChatPermissionInfo() {
        return this.groupChatPermissionInfo;
    }

    public final Integer getShareFilterType() {
        return this.shareFilterType;
    }

    public final List<String> getUnlockedBubbleIds() {
        return this.unlockedBubbleIds;
    }

    public final Long getUpdateTime() {
        return this.updateTime;
    }

    public final IMUserB2CAccountInfo getUserB2CAccountInfo() {
        return this.userB2CAccountInfo;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final IMUserVoiceCallInfo getVoiceCallInfo() {
        return this.voiceCallInfo;
    }

    public final void setActivityStatusSetting(Integer num) {
        this.activityStatusSetting = num;
    }

    public final void setAffinityScore(Double d) {
        this.affinityScore = d;
    }

    public final void setAllowSingleChatScreenshot(Boolean bool) {
        this.allowSingleChatScreenshot = bool;
    }

    public final void setCameraInfo(IMUserCameraInfo iMUserCameraInfo) {
        this.cameraInfo = iMUserCameraInfo;
    }

    public final void setChatBotInfo(IMUserChatBotInfo iMUserChatBotInfo) {
        this.chatBotInfo = iMUserChatBotInfo;
    }

    public final void setChatBubbleId(Long l) {
        this.chatBubbleId = l;
    }

    public final void setGroupChatPermissionInfo(IMGroupChatPermissionInfo iMGroupChatPermissionInfo) {
        this.groupChatPermissionInfo = iMGroupChatPermissionInfo;
    }

    public final void setShareFilterType(Integer num) {
        this.shareFilterType = num;
    }

    public final void setUnlockedBubbleIds(List<String> list) {
        this.unlockedBubbleIds = list;
    }

    public final void setUpdateTime(Long l) {
        this.updateTime = l;
    }

    public final void setUserB2CAccountInfo(IMUserB2CAccountInfo iMUserB2CAccountInfo) {
        this.userB2CAccountInfo = iMUserB2CAccountInfo;
    }

    public final void setUserId(long j) {
        this.userId = j;
    }

    public final void setVoiceCallInfo(IMUserVoiceCallInfo iMUserVoiceCallInfo) {
        this.voiceCallInfo = iMUserVoiceCallInfo;
    }
}
