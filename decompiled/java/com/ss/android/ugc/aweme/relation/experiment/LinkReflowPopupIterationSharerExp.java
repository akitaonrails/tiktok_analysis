package com.ss.android.ugc.aweme.relation.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class LinkReflowPopupIterationSharerExp {
    public static final LinkReflowParams LIZ = new LinkReflowParams(Float.valueOf(-1.0f), 1, 1, 1);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(295));

    public static final class LinkReflowParams {

        @C09CT("click_empty_to_play")
        public final Integer clickEmptyToPlay;

        @C09CT("dynamic_cover")
        public final Integer dynamicCover;

        @C09CT("follow_to_play_duration")
        public final Float followToPlayDuration;

        @C09CT("profile_clickable")
        public final Integer profileClickable;

        public LinkReflowParams(Float f, Integer num, Integer num2, Integer num3) {
            this.followToPlayDuration = f;
            this.clickEmptyToPlay = num;
            this.profileClickable = num2;
            this.dynamicCover = num3;
        }
    }
}
