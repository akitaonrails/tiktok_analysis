package com.ss.android.ugc.aweme.now;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class NowButtonInfo implements Serializable {

    @C09CT("button_label")
    public String buttonLabel;

    @C09CT("redirect_uri")
    public String redirectUri;

    public NowButtonInfo() {
        this(null, null);
    }

    public NowButtonInfo(String str, String str2) {
        this.buttonLabel = str;
        this.redirectUri = str2;
    }
}
