package com.ss.android.ugc.profile.business.ug;

import X.C09CT;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class NavBarMoreData extends BizBaseData {
    public static final int $stable = 8;

    @C09CT("alias_permission_type")
    public Integer aliasPermission;

    @C09CT("blocking_by_type")
    public Integer blockingByType;

    @C09CT("can_message_follow_status_list")
    public List<Integer> canMessageFollowStatusList;

    @C09CT("cert_info")
    public CertInfo certInfo;

    @C09CT("follower_count")
    public Integer followerCount;

    @C09CT("following_count")
    public Integer followingCount;

    @C09CT("is_mute")
    public Boolean isMute;

    @C09CT("share_info")
    public ShareInfo shareInfo;

    @C09CT("share_profile_toast")
    public String shareProfileToast;

    @C09CT("signature")
    public String signature;

    public final Integer getAliasPermission() {
        return this.aliasPermission;
    }

    public final Integer getBlockingByType() {
        return this.blockingByType;
    }

    public final List<Integer> getCanMessageFollowStatusList() {
        return this.canMessageFollowStatusList;
    }

    public final CertInfo getCertInfo() {
        return this.certInfo;
    }

    public final Integer getFollowerCount() {
        return this.followerCount;
    }

    public final Integer getFollowingCount() {
        return this.followingCount;
    }

    public final ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public final String getShareProfileToast() {
        return this.shareProfileToast;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final Boolean isMute() {
        return this.isMute;
    }

    public final void setAliasPermission(Integer num) {
        this.aliasPermission = num;
    }

    public final void setBlockingByType(Integer num) {
        this.blockingByType = num;
    }

    public final void setCanMessageFollowStatusList(List<Integer> list) {
        this.canMessageFollowStatusList = list;
    }

    public final void setCertInfo(CertInfo certInfo) {
        this.certInfo = certInfo;
    }

    public final void setFollowerCount(Integer num) {
        this.followerCount = num;
    }

    public final void setFollowingCount(Integer num) {
        this.followingCount = num;
    }

    public final void setMute(Boolean bool) {
        this.isMute = bool;
    }

    public final void setShareInfo(ShareInfo shareInfo) {
        this.shareInfo = shareInfo;
    }

    public final void setShareProfileToast(String str) {
        this.shareProfileToast = str;
    }

    public final void setSignature(String str) {
        this.signature = str;
    }
}
