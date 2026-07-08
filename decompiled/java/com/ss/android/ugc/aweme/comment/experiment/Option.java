package com.ss.android.ugc.aweme.comment.experiment;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class Option {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("name")
    public String name;

    public Option() {
        this("", "I Like it");
    }

    public Option(String str, String str2) {
        this.id = str;
        this.name = str2;
    }
}
