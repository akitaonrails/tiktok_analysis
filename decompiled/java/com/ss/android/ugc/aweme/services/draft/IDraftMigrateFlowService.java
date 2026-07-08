package com.ss.android.ugc.aweme.services.draft;

import X.C05YD;
import X.InterfaceC332260D0u;
import com.ss.android.ugc.aweme.services.draft.model.MigrateTaskStatus;

/* JADX INFO: loaded from: classes3.dex */
public interface IDraftMigrateFlowService {
    InterfaceC332260D0u<MigrateTaskStatus> getTaskMutableStatus();

    C05YD<MigrateTaskStatus> getTaskStatus();
}
