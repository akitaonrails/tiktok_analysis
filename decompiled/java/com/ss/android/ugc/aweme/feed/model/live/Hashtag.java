package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class Hashtag implements Serializable {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public Long id = 0L;

    @C09CT("title")
    public String title = "";

    public final Long getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setId(Long l) {
        this.id = l;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
