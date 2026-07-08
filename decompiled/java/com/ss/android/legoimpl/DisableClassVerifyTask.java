package com.ss.android.legoimpl;

import X.C0CCZ;
import X.C0VZ0;
import X.C0X35;
import X.C557050Lt1;
import X.C823050WQl;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import Y.ARunnableS104S0100000_4;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC20234614Fk
public class DisableClassVerifyTask implements C0CCZ {
    public static final C557050Lt1 LL = new C557050Lt1(false);

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "DisableClassVerifyTask";
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
        synchronized (DisableClassVerifyTask.class) {
            try {
                if (LL.LIZ(false, true)) {
                    C0X35.LIZ("application_init_jatoverify", false);
                    C823050WQl.LIZLLL().execute(new ARunnableS104S0100000_4(context, 157));
                    C0X35.LJIIJJI("application_init_jatoverify", false);
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
