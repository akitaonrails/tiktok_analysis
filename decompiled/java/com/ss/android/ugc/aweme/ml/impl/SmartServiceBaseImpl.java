package com.ss.android.ugc.aweme.ml.impl;

import X.AbstractC1511510pR7;
import X.C1509310pNZ;
import X.C1510230pP3;
import X.C1511470pR3;
import X.C1512100pS4;
import X.InterfaceC1511740pRU;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;

/* JADX INFO: loaded from: classes24.dex */
public class SmartServiceBaseImpl extends AbstractC1511510pR7 {
    public long lastExecutionTimeStamp;
    public int skippedTimesSinceAppStartUp;
    public int skippedTimesSinceLastExecution;
    public C1511470pR3 smartCommonService;
    public SmartSceneConfig smartSceneConfig;

    private final boolean shouldSkip() {
        SmartSceneConfig smartSceneConfig = this.smartSceneConfig;
        if (smartSceneConfig == null) {
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.skippedTimesSinceAppStartUp < smartSceneConfig.getSkipCount() || jCurrentTimeMillis - this.lastExecutionTimeStamp < smartSceneConfig.getTimeGapLimit() || this.skippedTimesSinceLastExecution < smartSceneConfig.getExecutionGap()) {
            this.skippedTimesSinceAppStartUp++;
            this.skippedTimesSinceLastExecution++;
            return true;
        }
        this.lastExecutionTimeStamp = jCurrentTimeMillis;
        this.skippedTimesSinceAppStartUp = 0;
        this.skippedTimesSinceLastExecution = 0;
        return false;
    }

    @Override // X.AbstractC1511510pR7
    public boolean checkIfOffload() {
        C1511470pR3 c1511470pR3 = this.smartCommonService;
        if (c1511470pR3 != null) {
            return c1511470pR3.checkIfOffload();
        }
        return false;
    }

    @Override // X.AbstractC1511510pR7
    public boolean enable() {
        return (this.smartSceneConfig == null || this.smartCommonService == null) ? false : true;
    }

    @Override // X.AbstractC1511510pR7
    public boolean isEnvReady() {
        C1511470pR3 c1511470pR3 = this.smartCommonService;
        if (c1511470pR3 != null) {
            return c1511470pR3.isEnvReady();
        }
        return false;
    }

    @Override // X.AbstractC1511510pR7
    public C1512100pS4 lastResult() {
        C1511470pR3 c1511470pR3 = this.smartCommonService;
        if (c1511470pR3 != null) {
            return c1511470pR3.LJFF;
        }
        return null;
    }

    @Override // X.AbstractC1511510pR7
    public void preloadEnv() {
        C1511470pR3 c1511470pR3 = this.smartCommonService;
        if (c1511470pR3 != null) {
            c1511470pR3.preloadEnv();
        }
    }

    @Override // X.AbstractC1511510pR7
    public void releaseModel() {
        C1511470pR3 c1511470pR3 = this.smartCommonService;
        if (c1511470pR3 != null) {
            c1511470pR3.releaseModel();
        }
    }

    public SmartServiceBaseImpl(C1510230pP3 c1510230pP3) {
        super(c1510230pP3.LIZ);
        SmartSceneConfig smartSceneConfig = c1510230pP3.LIZIZ;
        SmartSceneConfig smartSceneConfig2 = null;
        if ((smartSceneConfig instanceof SmartSceneConfig) && smartSceneConfig != null) {
            C1511470pR3 c1511470pR3 = new C1511470pR3(this.name);
            c1511470pR3.configService(c1510230pP3);
            this.smartCommonService = c1511470pR3;
            smartSceneConfig2 = smartSceneConfig;
        }
        this.smartSceneConfig = smartSceneConfig2;
    }

    @Override // X.AbstractC1511510pR7
    public void downloadModel(InterfaceC1511740pRU interfaceC1511740pRU) {
        C1511470pR3 c1511470pR3 = this.smartCommonService;
        if (c1511470pR3 != null) {
            c1511470pR3.downloadModel(interfaceC1511740pRU);
        }
    }

    @Override // X.AbstractC1511510pR7
    public C1512100pS4 runSync(C1509310pNZ c1509310pNZ) {
        C1511470pR3 c1511470pR3;
        if (shouldSkip() || (c1511470pR3 = this.smartCommonService) == null) {
            return null;
        }
        return c1511470pR3.runSync(c1509310pNZ);
    }

    @Override // X.AbstractC1511510pR7
    public void runAsyncDelay(long j, C1509310pNZ c1509310pNZ, InterfaceC1511740pRU interfaceC1511740pRU) {
        C1511470pR3 c1511470pR3;
        if (!shouldSkip() && (c1511470pR3 = this.smartCommonService) != null) {
            c1511470pR3.runAsyncDelay(j, c1509310pNZ, interfaceC1511740pRU);
        }
    }
}
