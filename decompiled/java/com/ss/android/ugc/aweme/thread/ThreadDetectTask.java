package com.ss.android.ugc.aweme.thread;

import X.C0A00;
import X.C0B4B;
import X.C0CCZ;
import X.C0VU1;
import X.C0VX0;
import X.C0VZ0;
import X.C0XA6;
import X.C12822050a;
import X.C2179008gG;
import X.C2407009bw;
import X.C264210AXb;
import X.C264220AXc;
import X.C264230AXd;
import X.C264240AXe;
import X.C264250AXf;
import X.C799170VWp;
import X.C799190VWr;
import X.C799270VWz;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.bytedance.common.jato.boost.sched.ProcTidFetcher;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class ThreadDetectTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ThreadDetectTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int priority() {
        return 1;
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

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C2407009bw.LIZ();
        if (C0XA6.LIZ.compareAndSet(false, true)) {
            C0VX0.LIZIZ = new C12822050a(context);
        }
        if (C0B4B.LIZ()) {
            int i = ProcTidFetcher.LIZIZ;
            if (i > 0) {
                C2179008gG.LIZ.getClass();
                C2179008gG.LIZIZ.add(Integer.valueOf(i));
            }
            C799270VWz c799270VWz = new C799270VWz(0);
            c799270VWz.LJFF = ((Number) C264210AXb.LIZ.getValue()).intValue();
            c799270VWz.LIZIZ = ((Number) C264250AXf.LIZ.getValue()).intValue();
            c799270VWz.LIZJ = ((Number) C0A00.LIZ.getValue()).floatValue();
            c799270VWz.LIZLLL = ((Number) C264240AXe.LIZ.getValue()).longValue();
            c799270VWz.LJI = ((Number) C264220AXc.LIZ.getValue()).longValue();
            c799270VWz.LJII = ((Number) C264230AXd.LIZ.getValue()).intValue();
            C799190VWr c799190VWrLIZ = c799270VWz.LIZ();
            C799170VWp.LIZ.getClass();
            C799170VWp.LIZIZ("global", c799190VWrLIZ);
        }
    }
}
