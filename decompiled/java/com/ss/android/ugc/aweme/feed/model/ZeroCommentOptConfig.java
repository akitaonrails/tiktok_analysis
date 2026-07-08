package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class ZeroCommentOptConfig implements Serializable {

    @C09CT("expire_time")
    public Long expireTimeInSecond;

    public ZeroCommentOptConfig() {
        this(-1L);
    }

    public ZeroCommentOptConfig(Long l) {
        this.expireTimeInSecond = l;
    }
}
