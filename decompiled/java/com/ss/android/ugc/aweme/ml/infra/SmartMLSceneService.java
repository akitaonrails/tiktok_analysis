package com.ss.android.ugc.aweme.ml.infra;

import X.AbstractC1511520pR8;
import X.C0N33;
import X.C1511290pQl;
import X.C1511300pQm;
import X.C1511340pQq;
import X.InterfaceC1510960pQE;
import X.InterfaceC1511190pQb;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public abstract class SmartMLSceneService implements ISmartMLSceneService {
    public static final C1511290pQl Companion = new Object() { // from class: X.0pQl
    };

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public abstract /* synthetic */ void configSceneModel(String str, SmartSceneConfig smartSceneConfig);

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public abstract /* synthetic */ boolean enable(String str);

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public abstract /* synthetic */ void ensureEnvAvailable(String str);

    public abstract /* synthetic */ AbstractC1511520pR8 getSmartRunner(String str);

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public abstract /* synthetic */ boolean isEnvReady(String str);

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public abstract /* synthetic */ int lastRunErrorCode(String str);

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public abstract /* synthetic */ C1511340pQq lastSuccessRunResult(String str);

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public abstract /* synthetic */ void run(String str, C0N33 c0n33, InterfaceC1510960pQE interfaceC1510960pQE, InterfaceC1511190pQb interfaceC1511190pQb);

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public abstract /* synthetic */ void runDelay(String str, long j, C0N33 c0n33, InterfaceC1510960pQE interfaceC1510960pQE, InterfaceC1511190pQb interfaceC1511190pQb);

    public abstract /* synthetic */ Map<String, Object> runSync(String str, C0N33 c0n33, InterfaceC1510960pQE interfaceC1510960pQE);

    public static final ISmartMLSceneService instance() {
        Companion.getClass();
        return C1511300pQm.LIZ;
    }
}
