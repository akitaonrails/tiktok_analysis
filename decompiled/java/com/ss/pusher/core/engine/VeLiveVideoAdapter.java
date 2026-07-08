package com.ss.pusher.core.engine;

import X.C2188811AlT;
import com.ss.pusher.core.params.PushBase;
import com.ss.pusher.core.params.StrategyConfiguration;
import com.ss.pusher.core.utils.AVLog;

/* JADX INFO: loaded from: classes21.dex */
public final class VeLiveVideoAdapter {
    public final PushBase LIZ;
    public final StrategyConfiguration LIZIZ;
    public long LIZJ;

    private final native long createAdapter(int i);

    private final native boolean keepFrame(long j, long j2);

    private final native void release(long j);

    private final native void updateFps(long j, int i);

    public final void LIZIZ() {
        long j = this.LIZJ;
        if (j > 0) {
            release(j);
            this.LIZJ = 0L;
        }
    }

    public final boolean LIZ(long j) {
        if (this.LIZIZ.dropEncodeFps) {
            long j2 = this.LIZJ;
            if (j2 > 0) {
                return keepFrame(j2, j);
            }
            return true;
        }
        return true;
    }

    public final void LIZJ(int i) {
        long j = this.LIZJ;
        if (j > 0) {
            updateFps(j, i);
        }
    }

    public VeLiveVideoAdapter(PushBase pushBase, StrategyConfiguration strategyConfiguration) {
        this.LIZ = pushBase;
        this.LIZIZ = strategyConfiguration;
        this.LIZJ = -1L;
        this.LIZJ = createAdapter(pushBase.fps);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("create ");
        sbLIZ.append(this);
        sbLIZ.append(", native: ");
        sbLIZ.append(this.LIZJ);
        AVLog.iod("VeLiveVideoAdapter", C2188811AlT.LIZIZ(sbLIZ));
    }
}
