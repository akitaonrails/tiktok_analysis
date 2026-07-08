package com.ss.android.ugc.aweme.im.sdk.performance;

import X.C0WY6;
import com.bytedance.im.core.message.core.metrics.ability.ReceiveMsgPerfTracker;

/* JADX INFO: loaded from: classes14.dex */
public final class Service implements ReceiveMsgPerfTracker {
    public final /* synthetic */ C0WY6 LIZ = new C0WY6(0);

    @Override // com.bytedance.im.core.message.core.metrics.ability.ReceiveMsgPerfTracker
    public final void LIZ(int i, int i2, String str) {
        this.LIZ.LIZ(i, i2, "pull");
    }

    @Override // com.bytedance.im.core.message.core.metrics.ability.ReceiveMsgPerfTracker
    public final void LIZIZ() {
        this.LIZ.LIZIZ();
    }

    @Override // com.bytedance.im.core.message.core.metrics.ability.ReceiveMsgPerfTracker
    public final void LIZJ(int i, String str) {
        this.LIZ.LIZJ(i, str);
    }
}
