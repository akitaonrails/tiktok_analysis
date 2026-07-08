package com.ss.android.ugc.aweme.feed.module;

import X.C09CT;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class SkylightFollowingUserResponse implements Serializable {

    @C09CT("entries")
    public final List<SkylightFollowingUserEntry> list;

    public SkylightFollowingUserResponse() {
        this(new ArrayList());
    }

    public final List<SkylightFollowingUserEntry> getList() {
        return this.list;
    }

    public SkylightFollowingUserResponse(List<SkylightFollowingUserEntry> list) {
        this.list = list;
    }
}
