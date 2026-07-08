package com.ss.android.legoimpl;

import X.C08Q0;
import X.C0CCZ;
import X.C0VZ0;
import X.C0X35;
import X.C823050WQl;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import Y.ARunnableS84S0000000_4;
import android.content.Context;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC20234614Fk
public class PreloadIOTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PreloadIOTask";
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
        return 16777215;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }

    public static void LIZ(Context context) {
        C0X35.LIZ("application_initbefore_part2_preload", false);
        boolean zLJ = C08Q0.LJ(context, "optimize_asyncpreload", false);
        ExecutorService executorServiceLIZIZ = C823050WQl.LIZIZ();
        ARunnableS84S0000000_4 aRunnableS84S0000000_4 = new ARunnableS84S0000000_4(4);
        if (zLJ) {
            executorServiceLIZIZ.execute(aRunnableS84S0000000_4);
        } else {
            aRunnableS84S0000000_4.run();
        }
        C0X35.LJIIJJI("application_initbefore_part2_preload", false);
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        LIZ(context);
    }
}
