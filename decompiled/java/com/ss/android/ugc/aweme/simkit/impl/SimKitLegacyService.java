package com.ss.android.ugc.aweme.simkit.impl;

import X.C1474810oTv;
import X.C1478180oZM;
import X.C1478230oZR;
import X.C790230UzF;
import X.InterfaceC1478170oZL;
import com.ss.android.ugc.aweme.simkit.ISimKitConfig;
import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator;
import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig;
import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedPredictorService;
import com.ss.android.ugc.aweme.video.simkit.SimKitConfigImpl;
import com.ss.android.ugc.playerkit.injector.InjectedConfigManager;

/* JADX INFO: loaded from: classes24.dex */
public class SimKitLegacyService implements InterfaceC1478170oZL {
    public ISimKitConfig LIZ;
    public ISpeedCalculator LIZIZ;
    public int LIZJ;

    @Override // X.InterfaceC1478170oZL
    public final synchronized ISpeedCalculator LIZ() {
        int iLIZJ;
        ISpeedPredictorService iSpeedPredictorServiceLIZ;
        if (this.LIZ == null) {
            this.LIZ = (ISimKitConfig) InjectedConfigManager.getConfig(ISimKitConfig.class);
        }
        ISpeedCalculatorConfig speedCalculatorConfig = this.LIZ.getSpeedCalculatorConfig();
        if (speedCalculatorConfig != null && speedCalculatorConfig.getCalculatorType() != 1 && ((Boolean) C1474810oTv.LJJIZ.getValue()).booleanValue() && LIZJ(this.LIZ) != this.LIZJ) {
            this.LIZIZ = null;
        }
        if (this.LIZIZ == null) {
            ISimKitConfig iSimKitConfig = this.LIZ;
            ISpeedCalculatorConfig speedCalculatorConfig2 = iSimKitConfig.getSpeedCalculatorConfig();
            if (speedCalculatorConfig2 != null && (iSpeedPredictorServiceLIZ = C1478180oZM.LIZ((iLIZJ = LIZJ(iSimKitConfig)))) != null) {
                ISpeedCalculator iSpeedCalculatorBuild = iSpeedPredictorServiceLIZ.build();
                this.LIZIZ = iSpeedCalculatorBuild;
                if (iSpeedCalculatorBuild != null) {
                    iSpeedCalculatorBuild.LJI(speedCalculatorConfig2);
                    this.LIZJ = iLIZJ;
                }
            }
            C1478230oZR.LIZ = this.LIZIZ;
        }
        return this.LIZIZ;
    }

    public static int LIZJ(ISimKitConfig iSimKitConfig) {
        int calculatorType;
        ISpeedCalculatorConfig speedCalculatorConfig = iSimKitConfig.getSpeedCalculatorConfig();
        if (speedCalculatorConfig == null || ((calculatorType = speedCalculatorConfig.getCalculatorType()) != 1 && ((Boolean) C1474810oTv.LJJIZ.getValue()).booleanValue() && !C790230UzF.LIZ.LJI())) {
            return 1;
        }
        return calculatorType;
    }

    @Override // X.InterfaceC1478170oZL
    public final void LIZIZ(SimKitConfigImpl simKitConfigImpl) {
        this.LIZ = simKitConfigImpl;
    }
}
