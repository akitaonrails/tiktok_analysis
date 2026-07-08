package com.ss.android.ugc.aweme.debug;

import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.debug.perf.IDoolittleService;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC20234614Fk
public class DebugDoolittleWSTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "DebugDoolittleWSTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return false;
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
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.FIRST_WINDOW_FOCUS;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        ((IDoolittleService) PluggableExtentionKt.pluggableSpi(IDoolittleService.class, false, false)).connect();
    }
}
