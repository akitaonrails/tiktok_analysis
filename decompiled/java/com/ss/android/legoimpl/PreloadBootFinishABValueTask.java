package com.ss.android.legoimpl;

import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C292340Bd2;
import X.C557050Lt1;
import X.C823050WQl;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import X.InterfaceC799590VYf;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC20234614Fk
public class PreloadBootFinishABValueTask implements C0CCZ, InterfaceC799590VYf {
    public static final C557050Lt1 LL = new C557050Lt1(false);

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PreloadBootFinishABValueTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
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

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return !(C292340Bd2.LIZ == 0);
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
        if (LL.LIZ(false, true)) {
            C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0CBJ
                /* JADX WARN: Finally extract failed */
                /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:44:0x009e  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public static void LIZ() {
                    /*
                        Method dump skipped, instruction units count: 359
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0CBJ.LIZ():void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PreloadBootFinishABValueTask@ccc.run$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PreloadBootFinishABValueTask@ccc.run$1");
                }
            });
        }
    }
}
