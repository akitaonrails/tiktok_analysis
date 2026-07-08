package com.ss.android.ugc.aweme.comment.model;

import X.C09CT;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class BaseCommentPublishRequestModel implements Serializable {

    @C09CT("action_type")
    public int actionType;

    @C09CT("ad_info")
    public String adInfo;

    @C09CT("aweme_id")
    public String aid;

    @C09CT("channel_id")
    public int channelId;

    @C09CT("current_shown_count")
    public String currentShownCount;

    @C09CT("is_self_see")
    public int isSelfSee;

    @C09CT("reply_id")
    public String replyId;

    @C09CT("reply_to_reply_id")
    public String replyToReplyId;

    @C09CT("send_comment_type")
    public int sendCommentType;

    @C09CT("text")
    public String text;

    @C09CT("text_extra")
    public List<TextExtraStruct> textExtraList;

    @C09CT("user_vote_info")
    public UserVoteInfo userVoteInfo;

    public int getActionType() {
        return this.actionType;
    }

    public String getAdInfo() {
        return this.adInfo;
    }

    public String getAid() {
        return this.aid;
    }

    public int getChannelId() {
        return this.channelId;
    }

    public String getCurrentShownCount() {
        return this.currentShownCount;
    }

    public int getIsSelfSee() {
        return this.isSelfSee;
    }

    public String getReplyId() {
        return this.replyId;
    }

    public String getReplyToReplyId() {
        return this.replyToReplyId;
    }

    public int getSendCommentType() {
        return this.sendCommentType;
    }

    public String getText() {
        return this.text;
    }

    public List<TextExtraStruct> getTextExtraList() {
        return this.textExtraList;
    }

    public UserVoteInfo getUserVoteInfo() {
        return this.userVoteInfo;
    }

    public void setActionType(int i) {
        this.actionType = i;
    }

    public void setAdInfo(String str) {
        this.adInfo = str;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setChannelId(int i) {
        this.channelId = i;
    }

    public void setCurrentShownCount(String str) {
        this.currentShownCount = str;
    }

    public void setIsSelfSee(int i) {
        this.isSelfSee = i;
    }

    public void setReplyId(String str) {
        this.replyId = str;
    }

    public void setReplyToReplyId(String str) {
        this.replyToReplyId = str;
    }

    public void setSendCommentType(int i) {
        this.sendCommentType = i;
    }

    public void setStructList(List<TextExtraStruct> list) {
        this.textExtraList = list;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setUserVoteInfo(UserVoteInfo userVoteInfo) {
        this.userVoteInfo = userVoteInfo;
    }
}
