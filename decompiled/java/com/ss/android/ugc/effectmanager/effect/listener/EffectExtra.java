package com.ss.android.ugc.effectmanager.effect.listener;

import X.C13NZ;

/* JADX INFO: loaded from: classes31.dex */
public final class EffectExtra {
    public static final Companion Companion = new Companion();
    public int dependentModelCount;
    public int downloadModelCount;
    public int parallelDefaultCount;
    public int parallelTotalCount;

    public final int getDependentModelCount() {
        return this.dependentModelCount;
    }

    public final int getDownloadModelCount() {
        return this.downloadModelCount;
    }

    public final int getParallelDefaultCount() {
        return this.parallelDefaultCount;
    }

    public final int getParallelTotalCount() {
        return this.parallelTotalCount;
    }

    public static final class Companion {
        public final EffectExtra create(C13NZ c13nz) {
            EffectExtra effectExtra = new EffectExtra();
            effectExtra.dependentModelCount = c13nz.LIZIZ;
            effectExtra.downloadModelCount = c13nz.LIZ;
            effectExtra.parallelTotalCount = c13nz.LIZJ;
            effectExtra.parallelDefaultCount = c13nz.LIZLLL;
            return effectExtra;
        }
    }
}
