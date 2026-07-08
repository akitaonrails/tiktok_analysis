package tikcast.api.fans;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FansRank {

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("next_offset")
    public long nextOffset;

    @C09CT("rank_type")
    public int rankType;

    @C09CT("rank_users")
    public List<FansRankUser> rankUsers = new ArrayList();

    @C09CT("total")
    public long total;
}
