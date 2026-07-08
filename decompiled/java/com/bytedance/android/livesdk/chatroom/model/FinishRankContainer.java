package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FinishRankContainer {

    @C09CT("finish_rank_type")
    public int finishRankType;

    @C09CT("rank")
    public List<FinishRank> rank = new ArrayList();

    @C09CT("total_num")
    public long totalNum;
}
