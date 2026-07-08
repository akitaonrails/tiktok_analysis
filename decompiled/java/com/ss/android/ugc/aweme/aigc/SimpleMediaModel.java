package com.ss.android.ugc.aweme.aigc;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes31.dex */
public final class SimpleMediaModel {

    @C09CT("file_local_uri_path")
    public final String fileLocalUriPath;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("origin_local_uri_path")
    public final String originLocalUriPath;

    @C09CT("relative_path")
    public final String relativePath;

    @C09CT("type")
    public final int type;

    public SimpleMediaModel() {
        this("", -1, null, null, null);
    }

    public SimpleMediaModel(String str, int i, String str2, String str3, String str4) {
        this.id = str;
        this.type = i;
        this.originLocalUriPath = str2;
        this.fileLocalUriPath = str3;
        this.relativePath = str4;
    }
}
