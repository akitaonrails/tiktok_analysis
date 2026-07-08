package com.ss.android.ugc.aweme.utils;

import X.C0QLU;
import X.C1505630pHd;
import X.C2187801Ajq;
import android.os.Process;
import com.bytedance.common.jato.JatoXL;
import com.ss.android.ugc.aweme.app.api.INetworkChunk;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchNetworkService implements INetworkChunk {
    @Override // com.ss.android.ugc.aweme.app.api.INetworkChunk
    public final void LIZ() {
        if (C0QLU.LIZJ.compareAndSet(true, false)) {
            JatoXL.resetPriority(Process.myTid());
        }
    }

    @Override // com.ss.android.ugc.aweme.app.api.INetworkChunk
    public final void LIZIZ() {
        if (C0QLU.LIZIZ.get() && C0QLU.LIZJ.compareAndSet(false, true)) {
            Map<String, C1505630pHd> map = C2187801Ajq.LIZ;
            C2187801Ajq.LIZ(Process.myTid(), 10);
        }
    }
}
