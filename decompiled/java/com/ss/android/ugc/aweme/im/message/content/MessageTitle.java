package com.ss.android.ugc.aweme.im.message.content;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageTitle {

    @C09CT("bold")
    public final Boolean bold;

    @C09CT("color_type")
    public final int colorType;

    @C09CT("title")
    public final String title;

    public MessageTitle() {
        this(null, null, 0);
    }

    public MessageTitle(Boolean bool, String str, int i) {
        this.bold = bool;
        this.title = str;
        this.colorType = i;
    }
}
