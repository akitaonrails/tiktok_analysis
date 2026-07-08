package com.ss.android.ugc.aweme.ml.infra;

import X.C0N33;
import X.C1511300pQm;
import X.C1511340pQq;
import X.InterfaceC1510960pQE;
import X.InterfaceC1511190pQb;
import X.InterfaceC1511280pQk;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public final class SmartClassifyServiceImpl extends SmartClassifyService {
    public static final /* synthetic */ int LIZ = 0;

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartClassifyService, com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService
    public final boolean enable(String str) {
        SmartMLSceneService.Companion.getClass();
        return C1511300pQm.LIZ.enable(str);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartClassifyService, com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService
    public final void ensureEnvAvailable(String str) {
        SmartMLSceneService.Companion.getClass();
        C1511300pQm.LIZ.ensureEnvAvailable(str);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartClassifyService, com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService
    public final boolean isEnvReady(String str) {
        SmartMLSceneService.Companion.getClass();
        return C1511300pQm.LIZ.isEnvReady(str);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartClassifyService
    public final Map<String, Float> lastPredictResultScoreMap(String str) {
        SmartMLSceneService.Companion.getClass();
        C1511340pQq c1511340pQqLastSuccessRunResult = C1511300pQm.LIZ.lastSuccessRunResult(str);
        if (c1511340pQqLastSuccessRunResult != null) {
            return c1511340pQqLastSuccessRunResult.LIZJ;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartClassifyService, com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService
    public final void configSceneModel(String str, SmartClassifySceneConfig smartClassifySceneConfig) {
        if (str != null && str.length() != 0 && smartClassifySceneConfig != null && TextUtils.equals(smartClassifySceneConfig.outType, "classify") && TextUtils.equals(str, smartClassifySceneConfig.getScene())) {
            SmartMLSceneService.Companion.getClass();
            C1511300pQm.LIZ.configSceneModel(str, smartClassifySceneConfig);
        } else {
            SmartClassifyService.Companion.getClass();
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartClassifyService
    public final String lastPredictResultLabel(String str, String str2) {
        String str3;
        SmartMLSceneService.Companion.getClass();
        C1511340pQq c1511340pQqLastSuccessRunResult = C1511300pQm.LIZ.lastSuccessRunResult(str);
        if (c1511340pQqLastSuccessRunResult != null && (str3 = c1511340pQqLastSuccessRunResult.LIZIZ) != null) {
            return str3;
        }
        return str2;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartClassifyService
    public final void classifyWithAweme(String str, Aweme aweme, InterfaceC1511280pQk interfaceC1511280pQk) {
        classifyWithAweme(str, aweme, null, interfaceC1511280pQk);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartClassifyService, com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService
    public final void classify(String str, C0N33 c0n33, InterfaceC1510960pQE interfaceC1510960pQE, final InterfaceC1511280pQk interfaceC1511280pQk) {
        SmartMLSceneService.Companion.getClass();
        C1511300pQm.LIZ.run(str, c0n33, null, new InterfaceC1511190pQb() { // from class: X.0pQh
            @Override // X.InterfaceC1511190pQb
            public final void LIZ(boolean z, int i, C1511340pQq c1511340pQq, C0N33 c0n332) {
                String str2;
                InterfaceC1511280pQk interfaceC1511280pQk2 = interfaceC1511280pQk;
                if (interfaceC1511280pQk2 != null) {
                    Map<String, Float> map = null;
                    if (c1511340pQq != null) {
                        str2 = c1511340pQq.LIZIZ;
                        map = c1511340pQq.LIZJ;
                    } else {
                        str2 = null;
                    }
                    interfaceC1511280pQk2.LIZ(z, i, str2, map);
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartClassifyService
    public final void classifyWithAweme(String str, Aweme aweme, InterfaceC1510960pQE interfaceC1510960pQE, InterfaceC1511280pQk interfaceC1511280pQk) {
        C0N33 c0n33 = new C0N33();
        c0n33.LJIIJ = aweme;
        classify(str, c0n33, null, interfaceC1511280pQk);
    }
}
