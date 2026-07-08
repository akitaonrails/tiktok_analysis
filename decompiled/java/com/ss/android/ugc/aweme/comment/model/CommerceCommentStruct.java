package com.ss.android.ugc.aweme.comment.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class CommerceCommentStruct implements Serializable {

    @C09CT("ad_avatar_url")
    public String avartalUrl;

    @C09CT("ad_nickname")
    public String nickName;

    public CommerceCommentStruct() {
        this(null, null);
    }

    public final void setAvartalUrl(String str) {
        this.avartalUrl = str;
    }

    public final void setNickName(String str) {
        this.nickName = str;
    }

    public CommerceCommentStruct(String str, String str2) {
        this.nickName = str;
        this.avartalUrl = str2;
    }
}
