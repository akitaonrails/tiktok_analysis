package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class FeedFavoriteGuideButtonParams {
    public static final Params LIZ = new Params(3, 1);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(86));

    public static final class Params {

        @C09CT("max_show_count")
        public final int maxShowCount;

        @C09CT("max_show_count_per_week")
        public final int maxShowCountPerWeek;

        public Params(int i, int i2) {
            this.maxShowCount = i;
            this.maxShowCountPerWeek = i2;
        }
    }
}
