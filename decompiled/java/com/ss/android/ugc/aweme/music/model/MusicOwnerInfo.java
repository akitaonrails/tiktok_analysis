package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public class MusicOwnerInfo implements Serializable {

    @C09CT("avatar")
    public UrlModel avatar;

    @C09CT("enter_type")
    public int enterType;

    @C09CT("follow_status")
    public Integer followStatus;

    @C09CT("follower_status")
    public Integer followerStatus;

    @C09CT("handle")
    public String handle;

    @C09CT("is_block")
    public boolean isBlock;

    @C09CT("is_blocked")
    public boolean isBlocked;

    @C09CT("is_private_account")
    public boolean isPrivateAccount;

    @C09CT("nick_name")
    public String nickName;

    @C09CT("sec_uid")
    public String secUid;

    @C09CT("is_visible")
    public boolean showArtistProfileBtn;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public Integer status;

    @C09CT("uid")
    public String uid;

    @C09CT("is_verified")
    public boolean verified;

    public interface ArtistType {
        public static final Companion Companion = Companion.$$INSTANCE;

        public static final class Companion {
            public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        }
    }

    public final UrlModel getAvatar() {
        return this.avatar;
    }

    public final int getEnterType() {
        return this.enterType;
    }

    public final Integer getFollowStatus() {
        return this.followStatus;
    }

    public final Integer getFollowerStatus() {
        return this.followerStatus;
    }

    public final String getHandle() {
        return this.handle;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final boolean getShowArtistProfileBtn() {
        return this.showArtistProfileBtn;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final String getUid() {
        return this.uid;
    }

    public final boolean getVerified() {
        return this.verified;
    }

    public final boolean isBlock() {
        return this.isBlock;
    }

    public final boolean isBlocked() {
        return this.isBlocked;
    }

    public final boolean isPrivateAccount() {
        return this.isPrivateAccount;
    }

    public final void setAvatar(UrlModel urlModel) {
        this.avatar = urlModel;
    }

    public final void setBlock(boolean z) {
        this.isBlock = z;
    }

    public final void setBlocked(boolean z) {
        this.isBlocked = z;
    }

    public final void setEnterType(int i) {
        this.enterType = i;
    }

    public final void setFollowStatus(Integer num) {
        this.followStatus = num;
    }

    public final void setFollowerStatus(Integer num) {
        this.followerStatus = num;
    }

    public final void setHandle(String str) {
        this.handle = str;
    }

    public final void setNickName(String str) {
        this.nickName = str;
    }

    public final void setPrivateAccount(boolean z) {
        this.isPrivateAccount = z;
    }

    public final void setSecUid(String str) {
        this.secUid = str;
    }

    public final void setShowArtistProfileBtn(boolean z) {
        this.showArtistProfileBtn = z;
    }

    public final void setStatus(Integer num) {
        this.status = num;
    }

    public final void setUid(String str) {
        this.uid = str;
    }

    public final void setVerified(boolean z) {
        this.verified = z;
    }
}
