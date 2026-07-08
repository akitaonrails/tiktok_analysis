package com.ss.android.ugc.aweme.legoImp.task.pumbaa;

import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import X.InterfaceC799590VYf;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
@InterfaceC20234614Fk
public final class OnlinePumbaaTask implements C0CCZ, InterfaceC799590VYf {
    public final /* synthetic */ PumbaaTask LL = new PumbaaTask();

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "OnlinePumbaaTask";
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

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        this.LL.run(context);
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

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        this.LL.getClass();
        return EnumC799870VZh.BACKGROUND;
    }

    public OnlinePumbaaTask() {
        new PumbaaTask();
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }
}
