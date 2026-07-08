package com.ss.android.ugc.aweme.friends.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes20.dex */
public final class MutualUser implements Serializable {

    @C09CT("avatar_medium")
    public UrlModel avatarMedium;

    @C09CT("avatar_thumb")
    public UrlModel avatarThumb;

    @C09CT("nickname")
    public String nickname;

    @C09CT("sec_uid")
    public String secUid;

    @C09CT("user_id")
    public String uid;

    @C09CT("unique_id")
    public String username;

    public MutualUser() {
    }

    public int hashCode() {
        return Objects.hash(this.secUid, this.nickname);
    }

    public final UrlModel getAvatarMedium() {
        return this.avatarMedium;
    }

    public final UrlModel getAvatarThumb() {
        return this.avatarThumb;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getUid() {
        return this.uid;
    }

    public final String getUsername() {
        return this.username;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MutualUser)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        MutualUser mutualUser = (MutualUser) obj;
        if (!Objects.equals(this.secUid, mutualUser.secUid) || !Objects.equals(this.nickname, mutualUser.nickname)) {
            return false;
        }
        return true;
    }

    public MutualUser(String str, String str2, UrlModel urlModel, UrlModel urlModel2, String str3, String str4) {
        this.secUid = str;
        this.nickname = str2;
        this.avatarMedium = urlModel;
        this.avatarThumb = urlModel2;
        this.uid = str3;
        this.username = str4;
    }
}
