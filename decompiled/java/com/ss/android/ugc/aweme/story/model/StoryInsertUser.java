package com.ss.android.ugc.aweme.story.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class StoryInsertUser implements Serializable {

    @C09CT("type")
    public final int type;

    @C09CT("user_id")
    public final long uid;

    public StoryInsertUser(long j, int i) {
        this.uid = j;
        this.type = i;
    }
}
