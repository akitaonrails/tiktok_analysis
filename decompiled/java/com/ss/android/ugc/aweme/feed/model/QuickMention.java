package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class QuickMention implements Serializable {

    @C09CT("quick_mention_candidate")
    public User candidate;
    public long timestamp;

    public QuickMention() {
        this(null, System.currentTimeMillis());
    }

    public QuickMention(User user, long j) {
        this.candidate = user;
        this.timestamp = j;
    }
}
