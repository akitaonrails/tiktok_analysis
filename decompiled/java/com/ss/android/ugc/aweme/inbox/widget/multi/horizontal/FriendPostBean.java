package com.ss.android.ugc.aweme.inbox.widget.multi.horizontal;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FriendPostBean implements Serializable {
    public boolean allRead;

    @C09CT("aweme_list")
    public final List<Aweme> aweme;
    public int priority;

    @C09CT("user_id")
    public final Long uid;

    public final void setAllRead(boolean z) {
        this.allRead = z;
    }

    public final void setPriority(int i) {
        this.priority = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FriendPostBean(Long l, List<? extends Aweme> list, boolean z, int i) {
        this.uid = l;
        this.aweme = list;
        this.allRead = z;
        this.priority = i;
    }
}
