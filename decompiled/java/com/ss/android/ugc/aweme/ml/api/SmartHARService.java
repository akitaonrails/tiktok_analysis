package com.ss.android.ugc.aweme.ml.api;

import X.C1511980pRs;
import X.InterfaceC1510430pPN;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public abstract class SmartHARService implements ISmartHARService {
    public static final C1511980pRs Companion = new C1511980pRs();
    public static final boolean debug = false;

    public static final ISmartHARService instance() {
        Companion.getClass();
        return C1511980pRs.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartHARService
    public abstract /* synthetic */ void addPredictListener(InterfaceC1510430pPN interfaceC1510430pPN);

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartHARService
    public abstract /* synthetic */ void checkAndInit();

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartHARService
    public abstract /* synthetic */ boolean enable();

    public abstract /* synthetic */ Map<String, Float> getLastEnvResult();

    public abstract /* synthetic */ int getLastEnvStatus();

    public abstract /* synthetic */ Map<String, Float> getLastOrientationResult();

    public abstract /* synthetic */ int getLastOrientationStatus();

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartHARService
    public abstract /* synthetic */ int getLastRangeMostStatus(int i, boolean z);

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartHARService
    public abstract /* synthetic */ List<Integer> getLastRangeStatus(int i, boolean z);

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartHARService
    public abstract /* synthetic */ Map<String, Float> getLastResult();

    public abstract /* synthetic */ Map<String, Float> getLastResultForAllTasks();

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartHARService
    public abstract /* synthetic */ int getLastStatus();

    public abstract /* synthetic */ String intStatusToName(int i);

    public abstract /* synthetic */ String intStringStatusToName(String str);

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartHARService
    public abstract /* synthetic */ void removePredictListener(InterfaceC1510430pPN interfaceC1510430pPN);

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartHARService
    public abstract /* synthetic */ boolean triggerSmartHarPredict(String str, boolean z);

    public static final boolean getDebug() {
        Companion.getClass();
        return debug;
    }
}
