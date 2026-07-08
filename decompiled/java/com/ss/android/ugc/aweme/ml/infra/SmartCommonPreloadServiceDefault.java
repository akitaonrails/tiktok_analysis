package com.ss.android.ugc.aweme.ml.infra;

import X.C0N33;
import X.InterfaceC1510960pQE;
import X.InterfaceC1510970pQF;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes24.dex */
public final class SmartCommonPreloadServiceDefault extends SmartCommonPreloadService {
    @Override // com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService, com.ss.android.ugc.aweme.ml.infra.ISmartCommonPreloadService
    public final void checkAndInit() {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService
    public final void configOneNewService(SmartClassifySceneConfig smartClassifySceneConfig) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService
    public final boolean enable(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService
    public final void ensureEnvAvailable(String str) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService
    public final boolean isEnvReady(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService
    public final boolean lastResult(String str, boolean z) {
        return z;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService
    public final float lastResultScore(String str, float f) {
        return f;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService
    public final void smartJudge(String str, C0N33 c0n33, InterfaceC1510960pQE interfaceC1510960pQE, InterfaceC1510970pQF interfaceC1510970pQF) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService
    public final void smartJudgeWithAweme(String str, Aweme aweme, InterfaceC1510960pQE interfaceC1510960pQE, InterfaceC1510970pQF interfaceC1510970pQF) {
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService
    public final void smartJudgeWithAweme(String str, Aweme aweme, InterfaceC1510970pQF interfaceC1510970pQF) {
    }
}
