package com.ss.android.ugc.aweme.simreporter.api;

import X.EnumC1481830ofF;
import X.EnumC1481890ofL;

/* JADX INFO: loaded from: classes24.dex */
public interface ISimReporterConfig {
    EnumC1481890ofL getBlockReportStrategy();

    int getCodecBufferingThreshold();

    int getNetBufferingThreshold();

    int getReportVideoResponseCount();

    EnumC1481830ofF getReporterType();

    Boolean isReportBlockV2();

    Boolean isReportBlockV2OnLeave();

    Boolean isReportTotalBlock();
}
