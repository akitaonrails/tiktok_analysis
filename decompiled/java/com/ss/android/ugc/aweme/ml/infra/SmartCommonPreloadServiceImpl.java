package com.ss.android.ugc.aweme.ml.infra;

import X.C0N33;
import X.C1511300pQm;
import X.C1511340pQq;
import X.InterfaceC1510960pQE;
import X.InterfaceC1510970pQF;
import X.InterfaceC1511190pQb;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class SmartCommonPreloadServiceImpl extends SmartCommonPreloadService {
    public static final /* synthetic */ int LIZIZ = 0;
    public boolean LIZ;

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService, com.ss.android.ugc.aweme.ml.infra.ISmartCommonPreloadService
    public final void checkAndInit() {
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService
    public final void configOneNewService(SmartClassifySceneConfig smartClassifySceneConfig) {
        SmartCommonPreloadService.Companion.getClass();
        if (smartClassifySceneConfig != null) {
            SmartMLSceneService.Companion.getClass();
            C1511300pQm.LIZ.configSceneModel(smartClassifySceneConfig.getScene(), smartClassifySceneConfig);
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService
    public final boolean enable(String str) {
        SmartMLSceneService.Companion.getClass();
        return C1511300pQm.LIZ.enable(str);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService
    public final void ensureEnvAvailable(String str) {
        SmartMLSceneService.Companion.getClass();
        C1511300pQm.LIZ.ensureEnvAvailable(str);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService
    public final boolean isEnvReady(String str) {
        SmartMLSceneService.Companion.getClass();
        return C1511300pQm.LIZ.isEnvReady(str);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService
    public final boolean lastResult(String str, boolean z) {
        String str2;
        SmartMLSceneService.Companion.getClass();
        C1511340pQq c1511340pQqLastSuccessRunResult = C1511300pQm.LIZ.lastSuccessRunResult(str);
        if (c1511340pQqLastSuccessRunResult != null && (str2 = c1511340pQqLastSuccessRunResult.LIZIZ) != null) {
            return Intrinsics.LJFF(str2.toLowerCase(Locale.ROOT), "true");
        }
        return z;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService
    public final float lastResultScore(String str, float f) {
        Float fLIZJ;
        SmartMLSceneService.Companion.getClass();
        C1511340pQq c1511340pQqLastSuccessRunResult = C1511300pQm.LIZ.lastSuccessRunResult(str);
        if (c1511340pQqLastSuccessRunResult != null && (fLIZJ = c1511340pQqLastSuccessRunResult.LIZJ()) != null) {
            return fLIZJ.floatValue();
        }
        return f;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService
    public final void smartJudgeWithAweme(String str, Aweme aweme, InterfaceC1510970pQF interfaceC1510970pQF) {
        smartJudgeWithAweme(str, aweme, null, null);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService
    public final void smartJudge(String str, C0N33 c0n33, InterfaceC1510960pQE interfaceC1510960pQE, InterfaceC1510970pQF interfaceC1510970pQF) {
        SmartMLSceneService.Companion.getClass();
        C1511300pQm.LIZ.run(str, c0n33, null, new InterfaceC1511190pQb() { // from class: X.0pQM
            @Override // X.InterfaceC1511190pQb
            public final void LIZ(boolean z, int i, C1511340pQq c1511340pQq, C0N33 c0n332) {
                String lowerCase;
                SmartCommonPreloadService.Companion.getClass();
                if (z && c1511340pQq != null) {
                    String str2 = c1511340pQq.LIZIZ;
                    if (str2 != null) {
                        lowerCase = str2.toLowerCase(Locale.ROOT);
                    } else {
                        lowerCase = null;
                    }
                    Intrinsics.LJFF(lowerCase, "true");
                    Float fLIZJ = c1511340pQq.LIZJ();
                    if (fLIZJ != null) {
                        fLIZJ.floatValue();
                    }
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadService
    public final void smartJudgeWithAweme(String str, Aweme aweme, InterfaceC1510960pQE interfaceC1510960pQE, InterfaceC1510970pQF interfaceC1510970pQF) {
        C0N33 c0n33 = new C0N33();
        c0n33.LJIIJ = aweme;
        smartJudge(str, c0n33, null, null);
    }
}
