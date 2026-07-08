package com.ss.android.ugc.aweme.friendstab.repo;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class FriendsV3FeedDBEntity {
    public final String LIZ;
    public final List<FriendsV3FeedModel> LIZIZ;
    public final boolean LIZJ;
    public final long LIZLLL;

    @C09CT("log_pb")
    public LogPbBean logPb;

    public FriendsV3FeedDBEntity(String str, List<FriendsV3FeedModel> list, boolean z, LogPbBean logPbBean, long j) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = z;
        this.logPb = logPbBean;
        this.LIZLLL = j;
    }
}
