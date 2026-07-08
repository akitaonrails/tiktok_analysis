package com.ss.android.ugc.aweme.ml.infra;

import X.C0N33;
import X.InterfaceC1510960pQE;
import X.InterfaceC1511280pQk;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public final class SmartClassifyServiceDefault extends SmartClassifyService {
    @Override // com.ss.android.ugc.aweme.ml.infra.SmartClassifyService, com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService
    public final void classify(String str, C0N33 c0n33, InterfaceC1510960pQE interfaceC1510960pQE, InterfaceC1511280pQk interfaceC1511280pQk) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartClassifyService
    public final void classifyWithAweme(String str, Aweme aweme, InterfaceC1510960pQE interfaceC1510960pQE, InterfaceC1511280pQk interfaceC1511280pQk) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartClassifyService
    public final void classifyWithAweme(String str, Aweme aweme, InterfaceC1511280pQk interfaceC1511280pQk) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartClassifyService, com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService
    public final void configSceneModel(String str, SmartClassifySceneConfig smartClassifySceneConfig) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartClassifyService, com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService
    public final boolean enable(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartClassifyService, com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService
    public final void ensureEnvAvailable(String str) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartClassifyService, com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService
    public final boolean isEnvReady(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartClassifyService
    public final String lastPredictResultLabel(String str, String str2) {
        return str2;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartClassifyService
    public final Map<String, Float> lastPredictResultScoreMap(String str) {
        return null;
    }
}
