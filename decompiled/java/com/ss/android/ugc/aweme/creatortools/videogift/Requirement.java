package com.ss.android.ugc.aweme.creatortools.videogift;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes17.dex */
public final class Requirement {

    @C09CT("description")
    public final String description;

    @C09CT("key")
    public final String key;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    public Requirement(String str, String str2, Integer num) {
        this.description = str;
        this.key = str2;
        this.status = num;
    }
}
