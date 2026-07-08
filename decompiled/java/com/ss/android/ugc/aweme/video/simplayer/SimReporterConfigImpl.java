package com.ss.android.ugc.aweme.video.simplayer;

import X.EnumC1481830ofF;
import X.EnumC1481890ofL;
import com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig;

/* JADX INFO: loaded from: classes24.dex */
public class SimReporterConfigImpl implements ISimReporterConfig {
    @Override // com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig
    public /* bridge */ /* synthetic */ int getCodecBufferingThreshold() {
        return 200;
    }

    @Override // com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig
    public int getNetBufferingThreshold() {
        return 80;
    }

    @Override // com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig
    public /* bridge */ /* synthetic */ int getReportVideoResponseCount() {
        return 10;
    }

    @Override // com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig
    public EnumC1481890ofL getBlockReportStrategy() {
        return EnumC1481890ofL.STRATEGY_1;
    }

    @Override // com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig
    public EnumC1481830ofF getReporterType() {
        return EnumC1481830ofF.DT;
    }

    @Override // com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig
    public Boolean isReportBlockV2() {
        return Boolean.TRUE;
    }

    @Override // com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig
    public Boolean isReportBlockV2OnLeave() {
        return Boolean.TRUE;
    }

    @Override // com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig
    public Boolean isReportTotalBlock() {
        return Boolean.FALSE;
    }
}
