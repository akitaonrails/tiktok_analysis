package com.ss.android.ugc.aweme.ab;

import X.C01GW;
import X.C09CT;
import X.C1602600ro2;
import X.C452501pT;

/* JADX INFO: loaded from: classes25.dex */
public final class LiveRegisterWhenFeedResumedConfig {
    public static final ResumedConfig LIZ = new ResumedConfig(true, 60, 60, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1602600ro2());

    public static final class ResumedConfig {

        @C09CT("backstage")
        public long backstage;

        @C09CT("frontier_hot_update")
        public boolean frontierHotUpdate;

        @C09CT("resumed_check")
        public boolean resumedCheck;

        @C09CT("switch_tab")
        public long switchTab;

        public ResumedConfig() {
            this(true, 60L, 60L, false);
        }

        public ResumedConfig(boolean z, long j, long j2, boolean z2) {
            this.resumedCheck = z;
            this.switchTab = j;
            this.backstage = j2;
            this.frontierHotUpdate = z2;
        }
    }
}
