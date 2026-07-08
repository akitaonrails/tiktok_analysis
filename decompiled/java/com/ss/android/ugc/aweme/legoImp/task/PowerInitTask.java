package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C1564070qnt;
import X.C20605015k0;
import X.C20606115kB;
import X.C20606215kC;
import X.C20606315kD;
import X.C2213981Bky;
import X.C308940C9c;
import X.C786410Ut5;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1563050qmF;
import android.app.Application;
import android.content.Context;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes32.dex */
public final class PowerInitTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PowerInitTask";
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
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C20606215kC c20606215kC = new C20606215kC();
        C20605015k0.LIZIZ = (Application) C786410Ut5.N3(context);
        C20605015k0.LIZLLL = true;
        C308940C9c c308940C9cLIZJ = c20606215kC.LIZIZ().LIZJ();
        if (c308940C9cLIZJ != null) {
            C1564070qnt.LIZ = c308940C9cLIZJ;
        }
        Function2<String, Boolean, InterfaceC1563050qmF> function2LJ = c20606215kC.LIZIZ().LJ();
        if (function2LJ != null) {
            C20605015k0.LJI = function2LJ;
        }
        C20605015k0.LJFF = c20606215kC.LIZIZ().LIZLLL();
        C2213981Bky c2213981Bky = c20606215kC.LIZIZ;
        if (c2213981Bky == null) {
            synchronized (c20606215kC) {
                c2213981Bky = c20606215kC.LIZIZ;
                if (c2213981Bky == null) {
                    c2213981Bky = C20606315kD.LIZ;
                    c20606215kC.LIZIZ = c2213981Bky;
                }
            }
        }
        c2213981Bky.isDebug();
        C20606115kB.LIZ = c20606215kC.LIZIZ().LIZIZ();
        C20606115kB.LIZIZ = ((C2213981Bky) c20606215kC.LIZ()).isDebug();
        C20606115kB.LIZJ = c20606215kC.LIZIZ().LIZ();
        c20606215kC.LIZIZ().LJFF();
    }
}
