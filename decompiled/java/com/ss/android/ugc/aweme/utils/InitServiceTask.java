package com.ss.android.ugc.aweme.utils;

import X.C0CCZ;
import X.C0VZ0;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class InitServiceTask implements C0CCZ {
    public final Runnable LL;
    public final int LLILLJJLI;
    public final EnumC799870VZh LLILLL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitServiceTask";
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
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return this.LLILLJJLI;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return this.LLILLL;
    }

    public InitServiceTask(Runnable runnable) {
        EnumC799870VZh enumC799870VZh = EnumC799870VZh.MAIN;
        this.LL = runnable;
        this.LLILLJJLI = 16777215;
        this.LLILLL = enumC799870VZh;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        Runnable runnable = this.LL;
        if (runnable != null) {
            runnable.run();
        }
    }
}
