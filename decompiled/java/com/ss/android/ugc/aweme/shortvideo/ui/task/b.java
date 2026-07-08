package com.ss.android.ugc.aweme.shortvideo.ui.task;

import X.AbstractRunnableC21377818lM;
import X.C0CHQ;
import X.C1C7U;
import X.EnumC194317110p;
import X.InterfaceC1408530ml1;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: loaded from: classes23.dex */
public final class b extends AbstractRunnableC21377818lM implements InterfaceC1408530ml1 {
    public final ShortVideoContext LLILZLL;

    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZIZ() {
        return false;
    }

    @Override // X.AbstractRunnableC21377818lM, java.lang.Runnable, X.InterfaceC1408530ml1
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("CreationAppExitBizMetricTask@13a8.run");
        try {
            C0CHQ.LIZ().getPublishService().LJIIL().LJJ(new AwS566S0100000_22(this, 351));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CreationAppExitBizMetricTask@13a8.run");
    }

    @Override // X.InterfaceC1408530ml1
    public final EnumC194317110p LIZJ() {
        return EnumC194317110p.P2;
    }

    public b(ShortVideoContext shortVideoContext) {
        this.LLILZLL = shortVideoContext;
        LJ(AFwS261S0000000_22.get$arr$(133));
    }
}
