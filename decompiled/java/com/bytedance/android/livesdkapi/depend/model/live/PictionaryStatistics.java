package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes.dex */
public final class PictionaryStatistics {

    @C09CT("first_user")
    public User firstUser;

    @C09CT("guess_correct_uv")
    public long guessCorrectUv;

    @C09CT("guess_total_pv")
    public long guessTotalPv;

    public PictionaryStatistics() {
        this(0L, 0L, null);
    }

    public PictionaryStatistics(long j, long j2, User user) {
        this.guessCorrectUv = j;
        this.guessTotalPv = j2;
        this.firstUser = user;
    }
}
