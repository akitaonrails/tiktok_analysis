package com.bytedance.geckox.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes24.dex */
public class Response<T> {

    @C09CT("data")
    public T data;

    @C09CT("message")
    public String msg;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;
}
