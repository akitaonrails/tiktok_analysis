package com.ss.android.ugc.aweme.setting.performance;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class BottomPublishClickDebounceOpt {
    public static final BottomPublishClickDebounceOpt LIZ = new BottomPublishClickDebounceOpt();
    public static final ClickDebounceConfig LIZIZ = new ClickDebounceConfig(false, 300);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(256));

    public static final class ClickDebounceConfig {

        @C09CT("debounce_interval")
        public final long debounceInterval;

        @C09CT("is_open")
        public final boolean isOpen;

        public ClickDebounceConfig() {
            this(false, 300L);
        }

        public ClickDebounceConfig(boolean z, long j) {
            this.isOpen = z;
            this.debounceInterval = j;
        }
    }
}
