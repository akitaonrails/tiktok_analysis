package com.ss.android.ugc.aweme.tools.draft.migratedraft.flow;

import X.AnonymousClass0951;
import X.C05YD;
import X.C09IC;
import X.C1BNE;
import X.C2252321DDq;
import X.InterfaceC332260D0u;
import com.ss.android.ugc.aweme.services.draft.IDraftMigrateFlowService;
import com.ss.android.ugc.aweme.services.draft.model.MigrateTaskStatus;

/* JADX INFO: loaded from: classes3.dex */
public final class DraftMigrateFlowService implements IDraftMigrateFlowService {
    public final C2252321DDq LIZ;
    public final AnonymousClass0951 LIZIZ;

    public DraftMigrateFlowService() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(MigrateTaskStatus.Idle.INSTANCE);
        this.LIZ = c2252321DDqLIZ;
        this.LIZIZ = C09IC.LIZIZ(c2252321DDqLIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftMigrateFlowService
    public final InterfaceC332260D0u<MigrateTaskStatus> getTaskMutableStatus() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.draft.IDraftMigrateFlowService
    public final C05YD<MigrateTaskStatus> getTaskStatus() {
        return this.LIZIZ;
    }
}
