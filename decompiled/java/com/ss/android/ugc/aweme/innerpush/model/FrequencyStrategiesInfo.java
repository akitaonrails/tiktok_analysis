package com.ss.android.ugc.aweme.innerpush.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class FrequencyStrategiesInfo {

    @C09CT("ban")
    public final List<FrequencyStrategyPassInfo> banInfo;

    @C09CT("popup")
    public final List<FrequencyStrategyPassInfo> popupInfo;

    public FrequencyStrategiesInfo(List<FrequencyStrategyPassInfo> list, List<FrequencyStrategyPassInfo> list2) {
        this.popupInfo = list;
        this.banInfo = list2;
    }
}
