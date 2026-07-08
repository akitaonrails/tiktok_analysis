package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public class GeneralPermission implements Serializable {

    @C09CT("following_follower_list_toast")
    public int followingFollowerListToast;

    @C09CT("follow_toast")
    public int mFollowToast;

    @C09CT("follow_toast_type")
    public int mFollowToastType;

    @C09CT("original_list")
    public int mOriginalList;

    @C09CT("profile_toast")
    public String mProfileToast;

    @C09CT("share_profile_toast")
    public String mShareProfileToast;

    @C09CT("share_toast")
    public int mShareToast;

    @C09CT("shop_toast")
    public int mShopToast;

    public int getFollowToast() {
        return this.mFollowToast;
    }

    public int getFollowToastType() {
        return this.mFollowToastType;
    }

    public int getFollowingFollowerListToast() {
        return this.followingFollowerListToast;
    }

    public int getOriginalList() {
        return this.mOriginalList;
    }

    public String getProfileToast() {
        return this.mProfileToast;
    }

    public String getShareProfileToast() {
        return this.mShareProfileToast;
    }

    public int getShareToast() {
        return this.mShareToast;
    }

    public int getShopToast() {
        return this.mShopToast;
    }

    public void setFollowToastType(int i) {
        this.mFollowToastType = i;
    }

    public void setOriginalList(int i) {
        this.mOriginalList = i;
    }

    public void setProfileToast(String str) {
        this.mProfileToast = str;
    }

    public void setShareProfileToast(String str) {
        this.mShareProfileToast = str;
    }
}
