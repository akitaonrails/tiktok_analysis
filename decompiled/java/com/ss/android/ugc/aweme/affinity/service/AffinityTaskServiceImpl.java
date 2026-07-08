package com.ss.android.ugc.aweme.affinity.service;

import X.C0CCZ;
import X.C2205708kZ;
import X.C2205808ka;
import X.C2205908kb;
import X.C23250099c;
import X.InterfaceC497601wk;
import com.ss.android.ugc.aweme.affinity.task.SocialAffinityTask;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class AffinityTaskServiceImpl implements IAffinityTaskService {
    @Override // com.ss.android.ugc.aweme.affinity.service.IAffinityTaskService
    public final C0CCZ LIZ() {
        return new SocialAffinityTask();
    }

    @Override // com.ss.android.ugc.aweme.affinity.service.IAffinityTaskService
    public final void LIZIZ(Map<?, ?> map) {
        C2205908kb.LIZ.getClass();
        if (C2205708kZ.LIZ() && C2205908kb.LJ != null) {
            C23250099c.LIZLLL((InterfaceC497601wk) C2205908kb.LIZIZ.getValue(), null, null, new C2205808ka(map, null), 3);
        }
    }
}
