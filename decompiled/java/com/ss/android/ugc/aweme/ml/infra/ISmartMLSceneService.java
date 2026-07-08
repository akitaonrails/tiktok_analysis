package com.ss.android.ugc.aweme.ml.infra;

import X.C0N33;
import X.C1511340pQq;
import X.InterfaceC1510960pQE;
import X.InterfaceC1511190pQb;

/* JADX INFO: loaded from: classes24.dex */
public interface ISmartMLSceneService {
    void configSceneModel(String str, SmartSceneConfig smartSceneConfig);

    boolean enable(String str);

    void ensureEnvAvailable(String str);

    boolean isEnvReady(String str);

    int lastRunErrorCode(String str);

    C1511340pQq lastSuccessRunResult(String str);

    void run(String str, C0N33 c0n33, InterfaceC1510960pQE interfaceC1510960pQE, InterfaceC1511190pQb interfaceC1511190pQb);

    void runDelay(String str, long j, C0N33 c0n33, InterfaceC1510960pQE interfaceC1510960pQE, InterfaceC1511190pQb interfaceC1511190pQb);
}
