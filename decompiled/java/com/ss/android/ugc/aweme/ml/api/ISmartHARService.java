package com.ss.android.ugc.aweme.ml.api;

import X.InterfaceC1510430pPN;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public interface ISmartHARService {
    void addPredictListener(InterfaceC1510430pPN interfaceC1510430pPN);

    void checkAndInit();

    boolean enable();

    int getLastRangeMostStatus(int i, boolean z);

    List<Integer> getLastRangeStatus(int i, boolean z);

    Map<String, Float> getLastResult();

    int getLastStatus();

    void removePredictListener(InterfaceC1510430pPN interfaceC1510430pPN);

    boolean triggerSmartHarPredict(String str, boolean z);
}
