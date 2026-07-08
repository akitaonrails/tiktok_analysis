package com.ss.android.ugc.aweme.ml.infra;

import X.C0N33;
import X.InterfaceC1510960pQE;
import X.InterfaceC1511190pQb;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.ab.OnePlaytimePredictConfig;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public final class SmartPlaytimePredictServiceDefault extends SmartPlaytimePredictService {
    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService, com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService
    public final void checkAndInit() {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService, com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService
    public final void configOneNewService(OnePlaytimePredictConfig onePlaytimePredictConfig) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService, com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService
    public final boolean enable(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService, com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService
    public final void ensureEnvAvailable(String str) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService
    public final boolean isEnvReady(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService
    public final float lastPredictFloatResult(String str, float f) {
        return f;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService
    public final String lastPredictResultLabel(String str, String str2) {
        return str2;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService
    public final Map<String, Float> lastPredictResultScoreMap(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService, com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService
    public final void predict(String str, C0N33 c0n33, InterfaceC1510960pQE interfaceC1510960pQE, InterfaceC1511190pQb interfaceC1511190pQb) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService
    public final void predictWithAweme(String str, Aweme aweme, InterfaceC1510960pQE interfaceC1510960pQE, InterfaceC1511190pQb interfaceC1511190pQb) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService
    public final void predictWithAweme(String str, Aweme aweme, InterfaceC1511190pQb interfaceC1511190pQb) {
    }
}
