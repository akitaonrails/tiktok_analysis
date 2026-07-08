package com.ss.android.ugc.aweme.friendstab.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsRedDotUser {

    @C09CT("affinity_rank")
    public int affinityRank;

    @C09CT("affinity_score")
    public float affinityScore;

    @C09CT("avatar_thumb")
    public UrlModel avatarThumb;

    @C09CT("nickname")
    public String nickname;

    @C09CT("uid")
    public String uid;

    @C09CT("unique_id")
    public String uniqueId;

    public FriendsRedDotUser() {
        this("", "", "", null, 0.0f, 0);
    }

    public final void setAffinityRank(int i) {
        this.affinityRank = i;
    }

    public final void setAffinityScore(float f) {
        this.affinityScore = f;
    }

    public final void setAvatarThumb(UrlModel urlModel) {
        this.avatarThumb = urlModel;
    }

    public final void setNickname(String str) {
        this.nickname = str;
    }

    public final void setUid(String str) {
        this.uid = str;
    }

    public final void setUniqueId(String str) {
        this.uniqueId = str;
    }

    public FriendsRedDotUser(String str, String str2, String str3, UrlModel urlModel, float f, int i) {
        this.uid = str;
        this.uniqueId = str2;
        this.nickname = str3;
        this.avatarThumb = urlModel;
        this.affinityScore = f;
        this.affinityRank = i;
    }
}
