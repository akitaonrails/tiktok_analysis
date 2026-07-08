package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.libra;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class EcSeaPdpShortVideoWindowOptExperiment {
    public static final EcSeaPdpShortVideoWindowOptModel LIZ = new EcSeaPdpShortVideoWindowOptModel(false, false);
    public static final C01GW LIZIZ;
    public static final boolean LIZJ;
    public static final boolean LIZLLL;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(68));
        LIZIZ = c01gwLIZIZ;
        LIZJ = ((EcSeaPdpShortVideoWindowOptModel) c01gwLIZIZ.getValue()).enableResumeFeedVideoV2;
        LIZLLL = ((EcSeaPdpShortVideoWindowOptModel) c01gwLIZIZ.getValue()).enableResumePlayWithFeedAbility;
    }

    public static final class EcSeaPdpShortVideoWindowOptModel {

        @C09CT("enable_resume_feed_video_v2")
        public final boolean enableResumeFeedVideoV2;

        @C09CT("enable_resume_play_with_feed_ability")
        public final boolean enableResumePlayWithFeedAbility;

        public EcSeaPdpShortVideoWindowOptModel() {
            this(false, false);
        }

        public EcSeaPdpShortVideoWindowOptModel(boolean z, boolean z2) {
            this.enableResumeFeedVideoV2 = z;
            this.enableResumePlayWithFeedAbility = z2;
        }
    }
}
