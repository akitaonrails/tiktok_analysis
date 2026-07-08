package com.ss.android.ugc.aweme.affinity.task;

import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C1BCF;
import X.C2204508kN;
import X.C2204808kQ;
import X.C2205508kX;
import X.C2205708kZ;
import X.C2205908kb;
import X.C23250099c;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC497601wk;
import X.InterfaceC799590VYf;
import android.content.Context;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
@C1BCF(distinctId = 108, taskType = "preload")
public final class SocialAffinityTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "SocialAffinityTask";
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
        return C0VU1.IO;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        ConcurrentHashMap<String, C2204508kN> concurrentHashMap = C2204508kN.LJFF;
        C2204808kQ.LIZ().LIZIZ();
        if (C2205708kZ.LIZ()) {
            C2205908kb.LIZ.getClass();
            C23250099c.LIZLLL((InterfaceC497601wk) C2205908kb.LIZIZ.getValue(), null, null, new C2205508kX(null), 3);
        }
    }
}
