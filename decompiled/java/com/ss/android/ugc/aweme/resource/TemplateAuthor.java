package com.ss.android.ugc.aweme.resource;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;

/* JADX INFO: loaded from: classes31.dex */
public final class TemplateAuthor {

    @C09CT("avatar_thumb")
    public final UrlModel avatarThumb;

    @C09CT("d_name")
    public final String dName;

    @C09CT("d_uid")
    public final long dUid;

    @C09CT("nick_name")
    public final String nickName;

    public TemplateAuthor() {
        this(0L, null, null, null);
    }

    public TemplateAuthor(long j, String str, String str2, UrlModel urlModel) {
        this.dUid = j;
        this.dName = str;
        this.nickName = str2;
        this.avatarThumb = urlModel;
    }
}
