package com.ss.android.ugc.aweme.dsp.plugin;

import X.AnonymousClass1403;
import X.AnonymousClass1405;
import X.C0CCZ;
import X.C0VZ0;
import X.C10UI;
import X.C13UT;
import X.C199578136y;
import X.C202068144s;
import X.C844020X9c;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.FutureC199576136w;
import X.InterfaceC842850X4p;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class MusicDspDownloadTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "MusicDspDownloadTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (!C10UI.LIZ()) {
            C13UT c13ut = C13UT.LIZ;
            c13ut.getClass();
            if (((IPluginService) ServiceManager.get().getService(IPluginService.class)).checkPluginInstalled("com.ss.android.ugc.df.dsp")) {
                C13UT.LIZIZ.LLILLJJLI.set(4);
                return;
            }
            synchronized (c13ut) {
                try {
                    FutureC199576136w futureC199576136w = C13UT.LIZIZ;
                    if (futureC199576136w.LLILLJJLI.get() != 4 && futureC199576136w.LLILLJJLI.get() != 2) {
                        futureC199576136w.LL.acquire();
                        futureC199576136w.LLILLJJLI.set(2);
                        C13UT.LIZLLL.getClass();
                        C199578136y.LIZJ = SystemClock.elapsedRealtime();
                        IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
                        C844020X9c c844020X9c = new C844020X9c();
                        c844020X9c.LIZ = "com.ss.android.ugc.df.dsp";
                        c844020X9c.LIZIZ = true;
                        AnonymousClass1403 anonymousClass1403 = new AnonymousClass1403();
                        anonymousClass1403.LIZ = false;
                        anonymousClass1403.LIZIZ();
                        anonymousClass1403.LIZJ = false;
                        anonymousClass1403.LIZLLL = false;
                        anonymousClass1403.LJFF = false;
                        c844020X9c.LJ = new AnonymousClass1405(anonymousClass1403);
                        c844020X9c.LIZLLL = new InterfaceC842850X4p() { // from class: X.13UU
                            @Override // X.InterfaceC842850X4p
                            public final void LIZJ(String str, boolean z) {
                                C13UT.LIZ.getClass();
                                C13UT.LIZ(0);
                            }

                            @Override // X.InterfaceC842850X4p
                            public final void LIZ(int i, String str, boolean z) {
                                C13UT.LIZ.getClass();
                                C13UT.LIZ(i);
                            }
                        };
                        iPluginService.LJJI(new C202068144s(c844020X9c));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
