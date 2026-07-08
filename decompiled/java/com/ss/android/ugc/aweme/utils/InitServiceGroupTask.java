package com.ss.android.ugc.aweme.utils;

import X.C0CCZ;
import X.C0VZ0;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class InitServiceGroupTask implements C0CCZ {
    public final ArrayList<Runnable> LL;
    public final int LLILLJJLI;
    public final EnumC799870VZh LLILLL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitServiceGroupTask";
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

    public InitServiceGroupTask(Runnable[] runnableArr) {
        EnumC799870VZh enumC799870VZh = EnumC799870VZh.MAIN;
        this.LL = new ArrayList<>();
        this.LLILLJJLI = 1;
        this.LLILLL = enumC799870VZh;
        for (Runnable runnable : runnableArr) {
            this.LL.add(runnable);
        }
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        for (Runnable runnable : this.LL) {
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
