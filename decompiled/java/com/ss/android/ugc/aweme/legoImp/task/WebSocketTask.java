package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C2203431BLp;
import X.C810710VrB;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class WebSocketTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "WebSocketTask";
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
        C2203431BLp c2203431BLp = C2203431BLp.LIZIZ;
        c2203431BLp.LJ("websocket_task");
        C810710VrB c810710VrB = C810710VrB.LL;
        if (!C810710VrB.LLILLJJLI) {
            c2203431BLp.LIZLLL(c810710VrB);
            c2203431BLp.LJI(50331699, 1, c810710VrB);
            c2203431BLp.LJI(16778063, 1, c810710VrB);
            C810710VrB.LLILLJJLI = true;
        }
    }
}
