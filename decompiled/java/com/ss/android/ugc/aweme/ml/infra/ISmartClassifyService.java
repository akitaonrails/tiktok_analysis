package com.ss.android.ugc.aweme.ml.infra;

import X.C0N33;
import X.InterfaceC1510960pQE;
import X.InterfaceC1511280pQk;

/* JADX INFO: loaded from: classes24.dex */
public interface ISmartClassifyService {
    void classify(String str, C0N33 c0n33, InterfaceC1510960pQE interfaceC1510960pQE, InterfaceC1511280pQk interfaceC1511280pQk);

    void configSceneModel(String str, SmartClassifySceneConfig smartClassifySceneConfig);

    boolean enable(String str);

    void ensureEnvAvailable(String str);

    boolean isEnvReady(String str);
}
