package com.ss.android.ugc.aweme.storage.ab;

import X.C0C64;
import X.C13VP;
import X.C20002113Nz;
import bsj.x0;
import com.ss.android.ugc.aweme.services.effect.IEffectDeletableCheckerService;

/* JADX INFO: loaded from: classes31.dex */
public final class EffectDeletableCheckerService implements IEffectDeletableCheckerService {
    @Override // com.ss.android.ugc.aweme.services.effect.IEffectDeletableCheckerService
    public final void needAbortCleanup() {
        C13VP.LIZ.getClass();
        C13VP.LIZIZ = true;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "ep_enable_lru_clean_trigger_time_opt", true, false)) {
            x0.LIZ.getClass();
            if (((Number) x0.LIZIZ.getValue()).intValue() != 1) {
                C20002113Nz.LIZ = true;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectDeletableCheckerService
    public final void resetCleanup() {
        C13VP.LIZ.getClass();
        C13VP.LIZIZ = false;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "ep_enable_lru_clean_trigger_time_opt", true, false)) {
            x0.LIZ.getClass();
            if (((Number) x0.LIZIZ.getValue()).intValue() != 1) {
                C20002113Nz.LIZ = false;
            }
        }
    }
}
