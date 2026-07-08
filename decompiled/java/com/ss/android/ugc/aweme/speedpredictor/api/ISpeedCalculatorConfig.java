package com.ss.android.ugc.aweme.speedpredictor.api;

import X.EnumC1478870oaT;
import X.InterfaceC1479030oaj;

/* JADX INFO: loaded from: classes24.dex */
public interface ISpeedCalculatorConfig {
    int getCalculatorType();

    double getDefaultSpeedInBPS();

    InterfaceC1479030oaj getIntelligentAlgoConfig();

    EnumC1478870oaT getSpeedAlgorithmType();

    String getSpeedCalculateConfig();

    int getSpeedQueueSize();
}
