package com.ss.android.ugc.aweme.feed.infra.viewtree;

import X.C01GW;
import X.C08CX;
import X.C09CT;
import X.C1697810uHb;
import X.C452501pT;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedViewTreeConfig {
    public static final FeedViewTreeConfig LIZ = new FeedViewTreeConfig();
    public static final FeedViewTreeBean LIZIZ = new FeedViewTreeBean(false, 0, false, false, null, null, 63, null);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(108));
    public static final boolean LIZLLL = LIZ().enableAllDetect;
    public static final int LJ = LIZ().maxSegmentLength;
    public static final boolean LJFF = LIZ().enableOptTypeMapLength;
    public static final Set<Integer> LJI = LIZ().enableCheckerType;
    public static final Set<String> LJII = LIZ().enableCheckPageType;
    public static final boolean LJIIIIZZ = LIZ().disableResId;

    @C09CT("entry_limit")
    public static final List<Long> entryLimit = C1697810uHb.LJIILJJIL(-1L, 3600L, 3600L, 3600L, 60L, 60L, 3600L, 60L);

    public static final FeedViewTreeBean LIZ() {
        return (FeedViewTreeBean) LIZJ.getValue();
    }

    public static List LIZIZ() {
        return entryLimit;
    }

    public static final class FeedViewTreeBean {

        @C09CT("disable_res_id")
        public final boolean disableResId;

        @C09CT("enable_all")
        public final boolean enableAllDetect;

        @C09CT("enable_check_page_set")
        public final Set<String> enableCheckPageType;

        @C09CT("enable_check_type_set")
        public final Set<Integer> enableCheckerType;

        @C09CT("enable_opt_type_map_length")
        public final boolean enableOptTypeMapLength;

        @C09CT("max_segment_length")
        public final int maxSegmentLength;

        public FeedViewTreeBean() {
            this(false, 0, false, false, null, null, 63, null);
        }

        public FeedViewTreeBean(boolean z, int i, boolean z2, boolean z3, Set<Integer> set, Set<String> set2) {
            this.enableAllDetect = z;
            this.maxSegmentLength = i;
            this.disableResId = z2;
            this.enableOptTypeMapLength = z3;
            this.enableCheckerType = set;
            this.enableCheckPageType = set2;
        }

        public FeedViewTreeBean(boolean z, int i, boolean z2, boolean z3, Set set, Set set2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? SpeechEngineDefines.TTS_WORK_MODE_BOTH : i, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? true : z3, (i2 & 16) != 0 ? Collections.singleton(1) : set, (i2 & 32) != 0 ? C08CX.INSTANCE : set2);
        }
    }
}
