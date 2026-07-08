package com.ss.android.ugc.aweme.ml.infra;

import X.C0N33;
import X.C1511150pQX;
import X.C1511210pQd;
import X.InterfaceC1510960pQE;
import X.InterfaceC1511190pQb;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.ab.OnePlaytimePredictConfig;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public abstract class SmartPlaytimePredictService implements ISmartPlaytimePredictService {
    public static final C1511210pQd Companion = new Object() { // from class: X.0pQd
    };
    public static final boolean debug = false;

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService
    public abstract /* synthetic */ void checkAndInit();

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService
    public abstract /* synthetic */ void configOneNewService(OnePlaytimePredictConfig onePlaytimePredictConfig);

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService
    public abstract /* synthetic */ boolean enable(String str);

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService
    public abstract /* synthetic */ void ensureEnvAvailable(String str);

    public abstract /* synthetic */ boolean isEnvReady(String str);

    public abstract /* synthetic */ float lastPredictFloatResult(String str, float f);

    public abstract /* synthetic */ String lastPredictResultLabel(String str, String str2);

    public abstract /* synthetic */ Map<String, Float> lastPredictResultScoreMap(String str);

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService
    public abstract /* synthetic */ void predict(String str, C0N33 c0n33, InterfaceC1510960pQE interfaceC1510960pQE, InterfaceC1511190pQb interfaceC1511190pQb);

    public abstract /* synthetic */ void predictWithAweme(String str, Aweme aweme, InterfaceC1510960pQE interfaceC1510960pQE, InterfaceC1511190pQb interfaceC1511190pQb);

    public abstract /* synthetic */ void predictWithAweme(String str, Aweme aweme, InterfaceC1511190pQb interfaceC1511190pQb);

    public static final boolean getDebug() {
        Companion.getClass();
        return debug;
    }

    public static final ISmartPlaytimePredictService instance() {
        Companion.getClass();
        return C1511150pQX.LIZ;
    }
}
