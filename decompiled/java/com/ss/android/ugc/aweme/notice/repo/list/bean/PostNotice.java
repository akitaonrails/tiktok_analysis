package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes4.dex */
public final class PostNotice {

    @C09CT("aweme")
    public final Aweme aweme;

    public PostNotice() {
        this(null);
    }

    public PostNotice(Aweme aweme) {
        this.aweme = aweme;
    }
}
