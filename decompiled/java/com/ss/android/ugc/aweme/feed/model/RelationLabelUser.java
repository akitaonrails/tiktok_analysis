package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class RelationLabelUser implements Serializable {

    @C09CT("avatar")
    public UrlModel avatarLarger;

    @C09CT("avatar_thumb")
    public UrlModel avatarThumb;

    @C09CT("follow_status")
    public int followStatus;

    @C09CT("uid")
    public long uid;

    @C09CT("sec_uid")
    public String secUid = "";

    @C09CT("nickname")
    public String nickName = "";

    @C09CT("remark_name")
    public String remarkName = "";

    public final UrlModel getAvatarLarger() {
        return this.avatarLarger;
    }

    public final UrlModel getAvatarThumb() {
        return this.avatarThumb;
    }

    public final int getFollowStatus() {
        return this.followStatus;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final String getRemarkName() {
        return this.remarkName;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final long getUid() {
        return this.uid;
    }

    public final void setAvatarLarger(UrlModel urlModel) {
        this.avatarLarger = urlModel;
    }

    public final void setAvatarThumb(UrlModel urlModel) {
        this.avatarThumb = urlModel;
    }

    public final void setFollowStatus(int i) {
        this.followStatus = i;
    }

    public final void setNickName(String str) {
        this.nickName = str;
    }

    public final void setRemarkName(String str) {
        this.remarkName = str;
    }

    public final void setSecUid(String str) {
        this.secUid = str;
    }

    public final void setUid(long j) {
        this.uid = j;
    }
}
