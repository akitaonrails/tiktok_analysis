package com.ss.android.legoimpl;

import X.C07OX;
import X.C0BEC;
import X.C0CCZ;
import X.C0VZ0;
import X.C1BWL;
import X.C2162308dZ;
import X.C823050WQl;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import Y.ARunnableS84S0000000_4;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class FixInflateCrashTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "FixInflateCrashTask";
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 16777215;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    public static void LIZ() {
        if (C2162308dZ.LJI(C1BWL.LIZ()) && C07OX.LIZIZ()) {
            C823050WQl.LIZJ().execute(new ARunnableS84S0000000_4(1));
        }
    }

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return C0BEC.LJFF(C1BWL.LIZ());
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        LIZ();
    }
}
