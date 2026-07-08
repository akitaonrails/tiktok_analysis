package com.ss.android.ugc.aweme.friends.model;

import X.C09CT;
import X.C13BV;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class UserWithAweme implements Serializable, Cloneable {

    @C09CT("aweme")
    public final Aweme aweme;

    @C09CT("aweme_list")
    public final List<Aweme> awemeList;

    @C09CT("user")
    public final User user;

    public final String getUid() {
        String uid = this.user.getUid();
        return uid == null ? "" : uid;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public UserWithAweme m206clone() {
        try {
            return (UserWithAweme) super.clone();
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            return new UserWithAweme(new User(), new Aweme(), C13BV.INSTANCE);
        }
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public final User getUser() {
        return this.user;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserWithAweme(User user, Aweme aweme, List<? extends Aweme> list) {
        this.user = user;
        this.aweme = aweme;
        this.awemeList = list;
    }
}
