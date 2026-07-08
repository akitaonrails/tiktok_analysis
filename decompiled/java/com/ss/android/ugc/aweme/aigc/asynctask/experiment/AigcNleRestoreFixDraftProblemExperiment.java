package com.ss.android.ugc.aweme.aigc.asynctask.experiment;

import X.C0C64;

/* JADX INFO: loaded from: classes5.dex */
public final class AigcNleRestoreFixDraftProblemExperiment {
    public static final int DISABLED = 0;
    public static final int ENABLED = 1;
    public static final AigcNleRestoreFixDraftProblemExperiment INSTANCE = new AigcNleRestoreFixDraftProblemExperiment();

    public static final int getCase() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "aigc_nle_restore_fix_draft_problem", true);
    }

    public static final boolean isEnabled() {
        return getCase() == 1;
    }
}
