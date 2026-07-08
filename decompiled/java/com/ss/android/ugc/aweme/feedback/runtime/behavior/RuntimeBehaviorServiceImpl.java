package com.ss.android.ugc.aweme.feedback.runtime.behavior;

import X.C0W5E;
import X.C19EG;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class RuntimeBehaviorServiceImpl implements IRuntimeBehaviorService {
    public final C0W5E LIZ = C0W5E.LIZ;

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService
    public final Map<String, String> LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService
    public final boolean LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService
    public final void LIZ(String str) {
        this.LIZ.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService
    public final void LIZJ(C19EG c19eg) {
        boolean zLJI = MethodIDManager.LJI(199048);
        this.LIZ.LIZJ(c19eg);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService
    public final void event(String str, String str2) {
        this.LIZ.event(str, str2);
    }
}
