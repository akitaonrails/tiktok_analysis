package com.ss.android.ugc.aweme.im.message.content;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;

/* JADX INFO: loaded from: classes15.dex */
public final class Title {

    @C09CT("color_type")
    public final int colorType;

    @C09CT("icon")
    public final UrlModel icon;

    @C09CT("title")
    public final String title;

    public Title() {
        this(null, null, 0);
    }

    public Title(UrlModel urlModel, String str, int i) {
        this.icon = urlModel;
        this.title = str;
        this.colorType = i;
    }
}
