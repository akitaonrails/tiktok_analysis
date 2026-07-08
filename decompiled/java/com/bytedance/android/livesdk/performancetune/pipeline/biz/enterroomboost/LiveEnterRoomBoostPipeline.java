package com.bytedance.android.livesdk.performancetune.pipeline.biz.enterroomboost;

import X.C09CT;
import X.EnumC480200IsM;
import X.InterfaceC519030KXd;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveEnterRoomBoostPipeline implements InterfaceC519030KXd {
    public static final /* synthetic */ int LIZ = 0;

    @Override // X.InterfaceC519030KXd
    public final void S5(EnumC480200IsM enumC480200IsM) {
    }

    @Override // X.InterfaceC519030KXd
    public final boolean enable() {
        return true;
    }

    public static final class BoostDecision {

        @C09CT("value")
        public final long boostDelayTimeMs;

        public BoostDecision(long j) {
            this.boostDelayTimeMs = j;
        }
    }
}
