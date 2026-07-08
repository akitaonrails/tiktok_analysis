package com.ss.android.ugc.aweme.im.b2c.landing;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatIntro {

    @C09CT("content")
    public final String content;

    @C09CT("icon")
    public final UrlModel icon;

    public ChatIntro() {
        this(null, "");
    }

    public ChatIntro(UrlModel urlModel, String str) {
        this.icon = urlModel;
        this.content = str;
    }
}
