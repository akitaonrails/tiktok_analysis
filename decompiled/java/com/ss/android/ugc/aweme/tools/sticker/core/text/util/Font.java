package com.ss.android.ugc.aweme.tools.sticker.core.text.util;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes6.dex */
public final class Font {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("path")
    public String path;

    public Font() {
        this(null, null);
    }

    public Font(String str, String str2) {
        this.id = str;
        this.path = str2;
    }
}
