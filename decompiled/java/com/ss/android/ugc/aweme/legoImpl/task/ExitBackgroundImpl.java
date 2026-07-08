package com.ss.android.ugc.aweme.legoImpl.task;

import com.ss.android.ugc.aweme.launcher.service.launcher.ExitBackgroundSpi;

/* JADX INFO: loaded from: classes3.dex */
public final class ExitBackgroundImpl implements ExitBackgroundSpi {
    @Override // com.ss.android.ugc.aweme.launcher.service.launcher.ExitBackgroundSpi
    public final void LIZ() {
        ExitBackgroundManager.Companion.getClass();
        ExitBackgroundManager.isActivityFinished = true;
    }
}
