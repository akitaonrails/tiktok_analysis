package com.bytedance.android.livesdk.viewer_picks.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class HistoryResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("history")
        public List<ViewerPicksHistory> history = new ArrayList();
    }

    public static final class ViewerPicksHistory {

        @C09CT("info")
        public ViewerPicksInfo info;

        @C09CT("total_score")
        public long totalScore;
    }
}
