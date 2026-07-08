package com.ss.android.ugc.aweme.speedpredictor.cloudimpl;

import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator;
import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig;
import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedPredictorService;
import com.ss.ttvideoengine.TTVideoEngine;

/* JADX INFO: loaded from: classes24.dex */
public class CloudSpeedPredictorServiceImpl implements ISpeedPredictorService {
    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedPredictorService
    public ISpeedCalculator build() {
        return new ISpeedCalculator() { // from class: X.0oaM
            @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
            public final double LIZ() {
                return 0.0d;
            }

            @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
            public final void LIZIZ() {
            }

            @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
            public final C1478710oaD[] LJFF() {
                return new C1478710oaD[0];
            }

            @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
            public final int LJIIIZ() {
                return 0;
            }

            @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
            public final void LJIIJ(C1478710oaD c1478710oaD) {
            }

            @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
            public final void LJIIJJI(C1478750oaH c1478750oaH) {
            }

            @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
            public final int LJII() {
                double dLJJLIIIIJ = TTVideoEngine.LJJLIIIIJ();
                if (dLJJLIIIIJ == -1.0d) {
                    return -1;
                }
                return (int) ((dLJJLIIIIJ / 8.0d) / 1000.0d);
            }

            @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
            public final double LJIIIIZZ() {
                return TTVideoEngine.LJJLIIIIJ();
            }

            @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
            public final void LIZJ(int i) {
                TTVideoEngine.LLFII(676, i);
            }

            @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
            public final void LIZLLL(double d) {
                TTVideoEngine.LLF(739, (float) d);
            }

            @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
            public final void LJI(ISpeedCalculatorConfig iSpeedCalculatorConfig) {
                if (iSpeedCalculatorConfig.getSpeedAlgorithmType() == EnumC1478870oaT.INTELLIGENT) {
                    iSpeedCalculatorConfig.getIntelligentAlgoConfig();
                }
            }
        };
    }
}
