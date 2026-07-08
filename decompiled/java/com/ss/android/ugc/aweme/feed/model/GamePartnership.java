package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class GamePartnership implements Serializable {

    @C09CT("game_attr_info")
    public GameAttrInfo gameAttrInfo;

    @C09CT("game_id")
    public long gameId;

    @C09CT("game_tag_id")
    public long gameTagId;

    @C09CT("post_from")
    public int postFrom;

    @C09CT("publisher_task_id")
    public long publisherTaskId;

    public GamePartnership() {
        this(0L, 0L, 0, 0L, null);
    }

    public GamePartnership(long j, long j2, int i, long j3, GameAttrInfo gameAttrInfo) {
        this.gameId = j;
        this.gameTagId = j2;
        this.postFrom = i;
        this.publisherTaskId = j3;
        this.gameAttrInfo = gameAttrInfo;
    }
}
