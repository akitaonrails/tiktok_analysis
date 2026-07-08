package com.ss.android.ugc.aweme.ml.infra;

import X.AbstractC1511520pR8;
import X.C0N33;
import X.C1511340pQq;
import X.InterfaceC1510960pQE;
import X.InterfaceC1511190pQb;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public final class SmartMLSceneServiceDefault extends SmartMLSceneService {
    @Override // com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService, com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public final void configSceneModel(String str, SmartSceneConfig smartSceneConfig) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService, com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public final boolean enable(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService, com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public final void ensureEnvAvailable(String str) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService
    public final AbstractC1511520pR8 getSmartRunner(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService, com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public final boolean isEnvReady(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService, com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public final int lastRunErrorCode(String str) {
        return -999;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService, com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public final C1511340pQq lastSuccessRunResult(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService, com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public final void run(String str, C0N33 c0n33, InterfaceC1510960pQE interfaceC1510960pQE, InterfaceC1511190pQb interfaceC1511190pQb) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService, com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public final void runDelay(String str, long j, C0N33 c0n33, InterfaceC1510960pQE interfaceC1510960pQE, InterfaceC1511190pQb interfaceC1511190pQb) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService
    public final Map<String, Object> runSync(String str, C0N33 c0n33, InterfaceC1510960pQE interfaceC1510960pQE) {
        return null;
    }
}
