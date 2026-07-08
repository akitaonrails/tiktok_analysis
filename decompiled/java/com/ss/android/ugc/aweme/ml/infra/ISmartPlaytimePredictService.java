package com.ss.android.ugc.aweme.ml.infra;

import X.C0N33;
import X.InterfaceC1510960pQE;
import X.InterfaceC1511190pQb;
import com.ss.android.ugc.aweme.ml.ab.OnePlaytimePredictConfig;

/* JADX INFO: loaded from: classes24.dex */
public interface ISmartPlaytimePredictService {
    void checkAndInit();

    void configOneNewService(OnePlaytimePredictConfig onePlaytimePredictConfig);

    boolean enable(String str);

    void ensureEnvAvailable(String str);

    void predict(String str, C0N33 c0n33, InterfaceC1510960pQE interfaceC1510960pQE, InterfaceC1511190pQb interfaceC1511190pQb);
}
