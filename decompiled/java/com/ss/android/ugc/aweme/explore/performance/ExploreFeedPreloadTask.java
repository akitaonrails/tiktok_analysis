package com.ss.android.ugc.aweme.explore.performance;

import X.C0B1Z;
import X.C0BK3;
import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C1306930k79;
import X.C1583440rJ8;
import X.C15TX;
import X.C15UN;
import X.C2153908cD;
import X.C276650Asp;
import X.EnumC1568370qup;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.ss.android.ugc.aweme.explore.monitor.ff.Explore0VVTrackerMonitor;
import java.util.List;
import kotlin.jvm.internal.AFwS276S0000000_31;

/* JADX INFO: loaded from: classes32.dex */
@InterfaceC20234614Fk
public final class ExploreFeedPreloadTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ExploreFeedPreloadTask";
    }

    @Override // X.InterfaceC799590VYf
    public final int level() {
        return 0;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public final int priority() {
        return 2;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.IO;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C2153908cD c2153908cD = C2153908cD.LIZ;
        Explore0VVTrackerMonitor.INSTANCE.networkStatus(C15UN.TRIGGER_TASK);
        if (C1583440rJ8.LIZ == 0 || ((Boolean) C276650Asp.LIZ.getValue()).booleanValue()) {
            return;
        }
        if (C0B1Z.LIZ()) {
            C1306930k79.LIZ.LIZ(AFwS276S0000000_31.get$arr$(100));
        } else {
            if (!C0BK3.LIZ()) {
                return;
            }
            C15TX.LLILZLL.LIZIZ(EnumC1568370qup.SERVER_PREFETCH.getValue());
        }
    }
}
