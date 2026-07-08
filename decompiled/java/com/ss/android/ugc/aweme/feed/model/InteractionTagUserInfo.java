package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes35.dex */
public final class InteractionTagUserInfo implements Serializable {

    @C09CT("avatar_thumb")
    public UrlModel avatarThumb;

    @C09CT("custom_verify")
    public String customVerify;

    @C09CT("enterprise_verify_reason")
    public String enterpriseVerifyReason;

    @C09CT("follow_status")
    public int followStatus;

    @C09CT("follower_status")
    public int followerStatus;

    @C09CT("interest_level")
    public int interestLevel;

    @C09CT("invitation_status")
    public int invitationStatus;

    @C09CT("is_business_account")
    public boolean isBusinessAccount;

    @C09CT("is_private_account")
    public int isPrivateAccount;

    @C09CT("nickname")
    public String nickname;

    @C09CT("uid")
    public String uid;

    @C09CT("unique_id")
    public String uniqueId;

    public InteractionTagUserInfo() {
        this("", "", "", null, 0, 0, 0, "", "", 0, false, 0);
    }

    public final boolean isBusinessAccount() {
        return this.isBusinessAccount;
    }

    public final int isPrivateAccount() {
        return this.isPrivateAccount;
    }

    public final void setAvatarThumb(UrlModel urlModel) {
        this.avatarThumb = urlModel;
    }

    public final void setBusinessAccount(boolean z) {
        this.isBusinessAccount = z;
    }

    public final void setCustomVerify(String str) {
        this.customVerify = str;
    }

    public final void setEnterpriseVerifyReason(String str) {
        this.enterpriseVerifyReason = str;
    }

    public final void setFollowStatus(int i) {
        this.followStatus = i;
    }

    public final void setFollowerStatus(int i) {
        this.followerStatus = i;
    }

    public final void setInterestLevel(int i) {
        this.interestLevel = i;
    }

    public final void setInvitationStatus(int i) {
        this.invitationStatus = i;
    }

    public final void setNickname(String str) {
        this.nickname = str;
    }

    public final void setPrivateAccount(int i) {
        this.isPrivateAccount = i;
    }

    public final void setUid(String str) {
        this.uid = str;
    }

    public final void setUniqueId(String str) {
        this.uniqueId = str;
    }

    public InteractionTagUserInfo(String str, String str2, String str3, UrlModel urlModel, int i, int i2, int i3, String str4, String str5, int i4, boolean z, int i5) {
        this.uid = str;
        this.uniqueId = str2;
        this.nickname = str3;
        this.avatarThumb = urlModel;
        this.followStatus = i;
        this.followerStatus = i2;
        this.isPrivateAccount = i3;
        this.customVerify = str4;
        this.enterpriseVerifyReason = str5;
        this.interestLevel = i4;
        this.isBusinessAccount = z;
        this.invitationStatus = i5;
    }
}
