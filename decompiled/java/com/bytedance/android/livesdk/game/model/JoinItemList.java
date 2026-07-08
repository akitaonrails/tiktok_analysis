package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class JoinItemList {

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("joined_live_rooms")
    public List<PropSalesJoinLiveRoom> joinedLiveRooms = new ArrayList();

    @C09CT("total")
    public int total;
}
