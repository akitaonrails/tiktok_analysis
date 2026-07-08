package com.bytedance.android.livesdk.goal.model;

import X.C09CT;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoalContributor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GetSubGoalContributorsResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("contributors")
        public List<LiveStreamGoalContributor> contributors = new ArrayList();

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("next_offset")
        public long nextOffset;

        @C09CT("total")
        public long total;
    }
}
