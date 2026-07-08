package com.ss.android.ugc.aweme.tools.draft.migratedraft.launch;

import X.C0CCZ;
import X.C291120Bb4;
import com.ss.android.ugc.aweme.services.draft.IMigrateDraftLaunchService;

/* JADX INFO: loaded from: classes5.dex */
public final class MigrateDraftLaunchService implements IMigrateDraftLaunchService {
    @Override // com.ss.android.ugc.aweme.services.draft.IMigrateDraftLaunchService
    public final C0CCZ getMigrateDraftTask() {
        if (C291120Bb4.LIZ()) {
            return new MigrateDraftLegoTask();
        }
        return null;
    }
}
