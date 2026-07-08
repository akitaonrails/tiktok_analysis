package com.ss.android.legoimpl;

import X.C0CCZ;
import X.C0VZ0;
import X.C0X35;
import X.C557050Lt1;
import X.C823050WQl;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import Y.ARunnableS22S0110000_3;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@InterfaceC20234614Fk
public class LessMadviseOptTask implements C0CCZ {
    public static final C557050Lt1 LL = new C557050Lt1(false);

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "LessMadviseOptTask";
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

    public static void LIZ(Context context) {
        synchronized (LessMadviseOptTask.class) {
            try {
                if (LL.LIZ(false, true)) {
                    C0X35.LIZ("application_init_jato_less_madvise", false);
                    C823050WQl.LIZLLL().execute(new ARunnableS22S0110000_3(context, 2));
                    C0X35.LJIIJJI("application_init_jato_less_madvise", false);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        LIZ(context);
    }
}
