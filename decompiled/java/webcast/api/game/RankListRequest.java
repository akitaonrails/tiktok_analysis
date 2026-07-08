package webcast.api.game;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class RankListRequest {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("interval_gap")
    public long intervalGap;

    @C09CT("rank_size")
    public int rankSize;

    @C09CT("rank_type")
    public List<Integer> rankType = new ArrayList();

    @C09CT("room_id")
    public long roomId;
}
