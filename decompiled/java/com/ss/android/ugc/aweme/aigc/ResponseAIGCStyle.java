package com.ss.android.ugc.aweme.aigc;

import X.C09CT;
import X.InterfaceC2126708Uv;

/* JADX INFO: loaded from: classes35.dex */
public final class ResponseAIGCStyle {

    @C09CT("display_name")
    public final String displayName;

    @C09CT("name")
    public final String name;

    @C09CT("status_code")
    @InterfaceC2126708Uv
    public final int status_code;

    @C09CT("status_msg")
    public final String status_msg;

    @C09CT("style_image")
    public final String styleImage;

    public ResponseAIGCStyle(int i, String str, String str2, String str3, String str4) {
        this.status_code = i;
        this.status_msg = str;
        this.name = str2;
        this.styleImage = str3;
        this.displayName = str4;
    }
}
