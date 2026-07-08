package jgp;

import X.AbstractRunnableC21377818lM;
import X.C545630Lab;
import X.C571280Mas;
import X.EnumC194317110p;
import X.InterfaceC1408530ml1;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.monitor.music.MusicMonitorTaskQueueService;
import kotlin.jvm.internal.AFwS239S0000000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends AbstractRunnableC21377818lM implements InterfaceC1408530ml1 {
    public final ShortVideoContext LLILZLL;
    public boolean LLIZ;

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
        try {
            if (this.LLIZ) {
                return;
            }
            if (C545630Lab.LIZ()) {
                ((MusicMonitorTaskQueueService) ServiceManager.get().getService(MusicMonitorTaskQueueService.class)).LIZJ(new C571280Mas(this.LLILZLL));
            }
            this.LLIZ = true;
        } finally {
            if (!zLIZ) {
            }
        }
    }

    @Override // X.InterfaceC1408530ml1
    public final EnumC194317110p LIZJ() {
        return EnumC194317110p.P2;
    }

    public j(ShortVideoContext shortVideoContext) {
        this.LLILZLL = shortVideoContext;
        LJ(AFwS239S0000000_8.get$arr$(277));
    }
}
