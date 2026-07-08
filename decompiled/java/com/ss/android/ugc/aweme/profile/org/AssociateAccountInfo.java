package com.ss.android.ugc.aweme.profile.org;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class AssociateAccountInfo implements Serializable {

    @C09CT("avatar_thumb")
    public UrlModel avatarThumb;

    @C09CT("nickname")
    public final String nickname;

    @C09CT("sec_uid")
    public final String secUid;

    @C09CT("uid")
    public final String uid;

    @C09CT("unique_id")
    public final String username;

    public AssociateAccountInfo() {
        this(null, null, null, null, null);
    }

    public final void setAvatarThumb(UrlModel urlModel) {
        this.avatarThumb = urlModel;
    }

    public AssociateAccountInfo(String str, String str2, String str3, String str4, UrlModel urlModel) {
        this.uid = str;
        this.secUid = str2;
        this.username = str3;
        this.nickname = str4;
        this.avatarThumb = urlModel;
    }
}
