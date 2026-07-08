package com.ss.android.ugc.aweme.speedpredictor.impl;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator;
import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig;
import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedPredictorService;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: loaded from: classes24.dex */
public class DTSpeedPredictorServiceImpl implements ISpeedPredictorService {
    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedPredictorService
    public final ISpeedCalculator build() {
        return new ISpeedCalculator() { // from class: X.0oaN
            public C1478830oaP LIZ;
            public final Map<InterfaceC1478790oaL, InterfaceC1478780oaK> LIZIZ = new HashMap();
            public final C1478820oaO LIZJ = C1479130oat.LJIIIIZZ().LIZ;

            @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
            public final double LIZ() {
                return this.LIZJ.LIZ();
            }

            @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
            public final void LIZIZ() {
                this.LIZJ.LIZIZ();
            }

            @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
            public final C1478710oaD[] LJFF() {
                C1478710oaD c1478710oaD;
                C1478850oaR[] c1478850oaRArrLJFF = this.LIZJ.LJFF();
                if (c1478850oaRArrLJFF == null) {
                    return null;
                }
                C1478710oaD[] c1478710oaDArr = new C1478710oaD[c1478850oaRArrLJFF.length];
                for (int i = 0; i < c1478850oaRArrLJFF.length; i++) {
                    C1478850oaR c1478850oaR = c1478850oaRArrLJFF[i];
                    if (c1478850oaR == null) {
                        c1478710oaD = null;
                    } else {
                        c1478710oaD = new C1478710oaD(c1478850oaR.LLILLJJLI * 8.0d, c1478850oaR.LLILLL);
                        c1478710oaD.LLILZ = c1478850oaR.LLILZ;
                    }
                    c1478710oaDArr[i] = c1478710oaD;
                }
                return c1478710oaDArr;
            }

            @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
            public final int LJII() {
                double speed = this.LIZJ.getSpeed();
                if (speed == -1.0d) {
                    return -1;
                }
                return (int) ((speed / 8.0d) / 1000.0d);
            }

            @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
            public final double LJIIIIZZ() {
                return this.LIZJ.getSpeed();
            }

            @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
            public final int LJIIIZ() {
                return C1479130oat.LIZJ;
            }

            @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
            public final void LIZJ(int i) {
                this.LIZJ.LIZJ(i);
            }

            @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
            public final void LIZLLL(double d) {
                this.LIZJ.LIZIZ = d;
            }

            @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
            public final void LJI(ISpeedCalculatorConfig iSpeedCalculatorConfig) {
                if (!TextUtils.isEmpty(iSpeedCalculatorConfig.getSpeedCalculateConfig())) {
                    this.LIZ = new C1478830oaP(iSpeedCalculatorConfig.getSpeedCalculateConfig());
                }
                this.LIZJ.LIZJ(iSpeedCalculatorConfig.getSpeedQueueSize());
                this.LIZJ.LIZIZ = iSpeedCalculatorConfig.getDefaultSpeedInBPS();
                if (iSpeedCalculatorConfig.getSpeedAlgorithmType() == EnumC1478870oaT.AVERAGE) {
                    this.LIZJ.LJI = new InterfaceC1478880oaU() { // from class: X.0oaS
                        @Override // X.InterfaceC1478880oaU
                        public final double LIZ(Queue<C1478850oaR> queue, C1478850oaR[] c1478850oaRArr) {
                            return LIZIZ(queue, c1478850oaRArr);
                        }

                        @Override // X.InterfaceC1478880oaU
                        public final double LIZIZ(Queue<C1478850oaR> queue, C1478850oaR[] c1478850oaRArr) {
                            if (queue.size() < 1) {
                                return -1.0d;
                            }
                            queue.toArray(c1478850oaRArr);
                            long j = 0;
                            int i = 0;
                            for (int i2 = 0; i2 < queue.size(); i2++) {
                                C1478850oaR c1478850oaR = c1478850oaRArr[i2];
                                i = (int) (((double) i) + c1478850oaR.LLILLJJLI);
                                j += c1478850oaR.LLILLL;
                            }
                            double d = (((double) i) * 8.0d) / (j / 1000.0d);
                            if (d >= 0.0d) {
                                return d;
                            }
                            throw new IllegalArgumentException();
                        }
                    };
                    return;
                }
                C1478840oaQ c1478840oaQ = new C1478840oaQ();
                C1478830oaP c1478830oaP = this.LIZ;
                if (c1478830oaP != null) {
                    c1478840oaQ.LIZ = c1478830oaP;
                }
                this.LIZJ.LJI = c1478840oaQ;
            }

            @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
            public final void LJIIJ(C1478710oaD c1478710oaD) {
                C1478830oaP c1478830oaP = this.LIZ;
                if (c1478830oaP != null) {
                    double d = c1478710oaD.LL;
                    if (d <= c1478830oaP.LJI * 8 && d >= c1478830oaP.LJFF * 8) {
                        double d2 = c1478710oaD.LLILLJJLI;
                        if (d2 > c1478830oaP.LJIIIIZZ || d2 < c1478830oaP.LJII) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.LIZJ.LJ(c1478710oaD.LLILLL, c1478710oaD.LL / 8.0d, (long) c1478710oaD.LLILLJJLI);
            }

            @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
            public final void LJIIJJI(final C1478750oaH c1478750oaH) {
                InterfaceC1478780oaK interfaceC1478780oaK = new InterfaceC1478780oaK() { // from class: X.0oaJ
                    @Override // X.InterfaceC1478780oaK
                    public final void LIZIZ() {
                        InterfaceC1478780oaK interfaceC1478780oaK2;
                        InterfaceC1478790oaL interfaceC1478790oaL = c1478750oaH;
                        if (interfaceC1478790oaL == null || (interfaceC1478780oaK2 = ((C1478750oaH) interfaceC1478790oaL).LIZ) == null) {
                            return;
                        }
                        interfaceC1478780oaK2.LIZIZ();
                    }
                };
                this.LIZJ.LJI(interfaceC1478780oaK);
                ((HashMap) this.LIZIZ).put(c1478750oaH, interfaceC1478780oaK);
            }
        };
    }
}
