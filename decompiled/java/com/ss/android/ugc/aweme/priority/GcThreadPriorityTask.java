package com.ss.android.ugc.aweme.priority;

import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class GcThreadPriorityTask implements C0CCZ, InterfaceC799590VYf {
    public final EnumC799870VZh LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "GcThreadPriorityTask";
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
    public final int priority() {
        return 2;
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
        return this.LL;
    }

    public GcThreadPriorityTask(EnumC799870VZh enumC799870VZh) {
        this.LL = enumC799870VZh;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5 A[Catch: all -> 0x01c0, TryCatch #0 {all -> 0x01c0, blocks: (B:20:0x008c, B:22:0x0092, B:27:0x00af, B:29:0x00b5, B:33:0x00be, B:36:0x00c8, B:40:0x00e0, B:44:0x00f1, B:48:0x0103, B:50:0x0120, B:64:0x0149, B:66:0x014d, B:68:0x0153, B:70:0x015b, B:86:0x01a4, B:92:0x01b1, B:74:0x016e, B:76:0x0176, B:80:0x0189, B:82:0x0191, B:89:0x01ac, B:53:0x0127, B:54:0x012c, B:56:0x0132, B:58:0x013e, B:60:0x0142, B:61:0x0145, B:24:0x0098, B:26:0x00a2), top: B:98:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b5 -> B:30:0x00b9). Please report as a decompilation issue!!! */
    @Override // X.InterfaceC308150C6b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run(android.content.Context r15) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.priority.GcThreadPriorityTask.run(android.content.Context):void");
    }
}
