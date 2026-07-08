package com.ss.android.ugc.aweme.websocket.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class DebugDowngradeWsConfig {
    public static final DebugDowngradeWsConfigData LIZ = new DebugDowngradeWsConfigData(false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(299));

    public static final class DebugDowngradeWsConfigData {

        @C09CT("skip_all_ws_connect")
        public final boolean skipAllWsConnect;

        public DebugDowngradeWsConfigData() {
            this(false);
        }

        public DebugDowngradeWsConfigData(boolean z) {
            this.skipAllWsConnect = z;
        }
    }
}
