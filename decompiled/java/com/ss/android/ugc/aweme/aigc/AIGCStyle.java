package com.ss.android.ugc.aweme.aigc;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class AIGCStyle implements Serializable {

    @C09CT("display_name")
    public final String displayName;

    @C09CT("name")
    public final String name;

    @C09CT("style_image")
    public final String styleImage;

    public AIGCStyle(String str, String str2, String str3) {
        this.name = str;
        this.styleImage = str2;
        this.displayName = str3;
    }
}
