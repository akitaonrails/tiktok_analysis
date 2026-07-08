package com.ss.android.ugc.aweme.psp;

import X.C01GW;
import X.C09CT;
import X.C2190391Ao1;
import X.C452501pT;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes35.dex */
public final class PSPSettings {
    public static final TTMCenterConfig LIZ = new TTMCenterConfig(false, true, true, 604800, LSPassThroughRecordSizeConfig.DEFAULT, LSPassThroughRecordSizeConfig.DEFAULT);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C2190391Ao1());

    public static final class TTMCenterConfig {

        @C09CT("center_info_sample_rate")
        public final int centerInfoSampleRate;

        @C09CT("db_file_expiration_time")
        public final int dbFileExpirationTime;

        @C09CT("emit_applog_event")
        public final boolean emitApplogEvent;

        @C09CT("enable_strategy_center")
        public final boolean enableStrategyCenter;

        @C09CT("release_memory")
        public final boolean releaseMemory;

        @C09CT("strategy_info_sample_rate")
        public final int strategyInfoSampleRate;

        public TTMCenterConfig() {
            this(false, false, false, 604800, LSPassThroughRecordSizeConfig.DEFAULT, LSPassThroughRecordSizeConfig.DEFAULT);
        }

        public TTMCenterConfig(boolean z, boolean z2, boolean z3, int i, int i2, int i3) {
            this.releaseMemory = z;
            this.emitApplogEvent = z2;
            this.enableStrategyCenter = z3;
            this.dbFileExpirationTime = i;
            this.centerInfoSampleRate = i2;
            this.strategyInfoSampleRate = i3;
        }
    }

    public static TTMCenterConfig LIZ() {
        return (TTMCenterConfig) LIZIZ.getValue();
    }
}
