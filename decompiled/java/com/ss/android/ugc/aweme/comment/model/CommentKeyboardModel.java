package com.ss.android.ugc.aweme.comment.model;

import X.EnumC1346360l8k;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentKeyboardModel implements Serializable {
    public String clickFrom;
    public boolean commentPostChecked;
    public boolean forceDisableCommentAudio;
    public boolean forceDisableCommentPhoto;
    public boolean forceDisableExposedEmoji;
    public boolean forceDisableMention;
    public boolean forceDisableReplyWithVideo;
    public boolean forceEnableReplyWithVideo;
    public boolean forceHideInnerGiftPanel;
    public boolean hideExposedEmojiInNonePanel;
    public boolean hideGiftSelectInNonePanel;
    public boolean hideIconGroupOnAgentOpenComment;
    public CharSequence initEditTextContent;
    public EnumC1346360l8k inputServiceType;
    public boolean isFromGuideReplyUser;
    public boolean isLandscapeMode;
    public long keyBoardShowTime;
    public UserVoteInfo pollBadgeUserVoteInfo;
    public String postMethod;
    public String quickCommentActionType;
    public List<String> quickCommentEmojiString;
    public String quickCommentShowType;
    public boolean shieldKeyboardOpen;
    public int isFromFakeEditText = -1;
    public String fromLocation = "";
    public boolean enableGiftScene = true;
    public String giftSendEnterMethod = "";
    public boolean pollVoteBadgeChecked = true;
    public String initKeyboardTypeName = "TEXT";

    public final String getFromLocation() {
        int i = this.isFromFakeEditText;
        return i != 0 ? i != 1 ? "" : "input_box" : "comment_button";
    }

    public final String getClickFrom() {
        return this.clickFrom;
    }

    public final boolean getCommentPostChecked() {
        return this.commentPostChecked;
    }

    public final boolean getEnableGiftScene() {
        return this.enableGiftScene;
    }

    public final boolean getForceDisableCommentAudio() {
        return this.forceDisableCommentAudio;
    }

    public final boolean getForceDisableCommentPhoto() {
        return this.forceDisableCommentPhoto;
    }

    public final boolean getForceDisableExposedEmoji() {
        return this.forceDisableExposedEmoji;
    }

    public final boolean getForceDisableMention() {
        return this.forceDisableMention;
    }

    public final boolean getForceDisableReplyWithVideo() {
        return this.forceDisableReplyWithVideo;
    }

    public final boolean getForceEnableReplyWithVideo() {
        return this.forceEnableReplyWithVideo;
    }

    public final boolean getForceHideInnerGiftPanel() {
        return this.forceHideInnerGiftPanel;
    }

    public final String getGiftSendEnterMethod() {
        return this.giftSendEnterMethod;
    }

    public final boolean getHideExposedEmojiInNonePanel() {
        return this.hideExposedEmojiInNonePanel;
    }

    public final boolean getHideGiftSelectInNonePanel() {
        return this.hideGiftSelectInNonePanel;
    }

    public final boolean getHideIconGroupOnAgentOpenComment() {
        return this.hideIconGroupOnAgentOpenComment;
    }

    public final CharSequence getInitEditTextContent() {
        return this.initEditTextContent;
    }

    public final String getInitKeyboardTypeName() {
        return this.initKeyboardTypeName;
    }

    public final EnumC1346360l8k getInputServiceType() {
        return this.inputServiceType;
    }

    public final long getKeyBoardShowTime() {
        return this.keyBoardShowTime;
    }

    public final UserVoteInfo getPollBadgeUserVoteInfo() {
        return this.pollBadgeUserVoteInfo;
    }

    public final boolean getPollVoteBadgeChecked() {
        return this.pollVoteBadgeChecked;
    }

    public final String getPostMethod() {
        return this.postMethod;
    }

    public final String getQuickCommentActionType() {
        return this.quickCommentActionType;
    }

    public final List<String> getQuickCommentEmojiString() {
        return this.quickCommentEmojiString;
    }

    public final String getQuickCommentShowType() {
        return this.quickCommentShowType;
    }

    public final boolean getShieldKeyboardOpen() {
        return this.shieldKeyboardOpen;
    }

    public final int isFromFakeEditText() {
        return this.isFromFakeEditText;
    }

    public final boolean isFromGuideReplyUser() {
        return this.isFromGuideReplyUser;
    }

    public final boolean isLandscapeMode() {
        return this.isLandscapeMode;
    }

    public final void setClickFrom(String str) {
        this.clickFrom = str;
    }

    public final void setCommentPostChecked(boolean z) {
        this.commentPostChecked = z;
    }

    public final void setEnableGiftScene(boolean z) {
        this.enableGiftScene = z;
    }

    public final void setForceDisableCommentAudio(boolean z) {
        this.forceDisableCommentAudio = z;
    }

    public final void setForceDisableCommentPhoto(boolean z) {
        this.forceDisableCommentPhoto = z;
    }

    public final void setForceDisableExposedEmoji(boolean z) {
        this.forceDisableExposedEmoji = z;
    }

    public final void setForceDisableMention(boolean z) {
        this.forceDisableMention = z;
    }

    public final void setForceDisableReplyWithVideo(boolean z) {
        this.forceDisableReplyWithVideo = z;
    }

    public final void setForceEnableReplyWithVideo(boolean z) {
        this.forceEnableReplyWithVideo = z;
    }

    public final void setForceHideInnerGiftPanel(boolean z) {
        this.forceHideInnerGiftPanel = z;
    }

    public final void setFromFakeEditText(int i) {
        this.isFromFakeEditText = i;
    }

    public final void setFromGuideReplyUser(boolean z) {
        this.isFromGuideReplyUser = z;
    }

    public final void setGiftSendEnterMethod(String str) {
        this.giftSendEnterMethod = str;
    }

    public final void setHideExposedEmojiInNonePanel(boolean z) {
        this.hideExposedEmojiInNonePanel = z;
    }

    public final void setHideGiftSelectInNonePanel(boolean z) {
        this.hideGiftSelectInNonePanel = z;
    }

    public final void setHideIconGroupOnAgentOpenComment(boolean z) {
        this.hideIconGroupOnAgentOpenComment = z;
    }

    public final void setInitEditTextContent(CharSequence charSequence) {
        this.initEditTextContent = charSequence;
    }

    public final void setInitKeyboardTypeName(String str) {
        this.initKeyboardTypeName = str;
    }

    public final void setInputServiceType(EnumC1346360l8k enumC1346360l8k) {
        this.inputServiceType = enumC1346360l8k;
    }

    public final void setKeyBoardShowTime(long j) {
        this.keyBoardShowTime = j;
    }

    public final void setLandscapeMode(boolean z) {
        this.isLandscapeMode = z;
    }

    public final void setPollBadgeUserVoteInfo(UserVoteInfo userVoteInfo) {
        this.pollBadgeUserVoteInfo = userVoteInfo;
    }

    public final void setPollVoteBadgeChecked(boolean z) {
        this.pollVoteBadgeChecked = z;
    }

    public final void setPostMethod(String str) {
        this.postMethod = str;
    }

    public final void setQuickCommentActionType(String str) {
        this.quickCommentActionType = str;
    }

    public final void setQuickCommentEmojiString(List<String> list) {
        this.quickCommentEmojiString = list;
    }

    public final void setQuickCommentShowType(String str) {
        this.quickCommentShowType = str;
    }

    public final void setShieldKeyboardOpen(boolean z) {
        this.shieldKeyboardOpen = z;
    }
}
