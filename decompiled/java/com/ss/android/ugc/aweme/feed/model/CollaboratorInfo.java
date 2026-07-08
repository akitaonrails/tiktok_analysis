package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class CollaboratorInfo implements Serializable {

    @C09CT("collab_status")
    public int collabStatus;

    @C09CT("user_info")
    public User user;

    public CollaboratorInfo() {
        this(new User(), -1);
    }

    public CollaboratorInfo(User user, int i) {
        this.user = user;
        this.collabStatus = i;
    }
}
