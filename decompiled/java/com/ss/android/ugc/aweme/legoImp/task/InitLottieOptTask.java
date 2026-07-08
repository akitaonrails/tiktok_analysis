package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C1291390ji5;
import X.C1291690jiZ;
import X.C1291700jia;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1291400ji6;
import X.InterfaceC1291720jic;
import android.content.Context;
import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class InitLottieOptTask implements C0CCZ {
    public static final C1291690jiZ LL = C1291690jiZ.LIZ;
    public static final C1291700jia LLILLJJLI = new InterfaceC1291720jic() { // from class: X.0jia
        @Override // X.InterfaceC1291720jic
        public final void LIZ(String str, Exception exc) {
            C805380Via.LIZJ(exc, "Lottie error: " + str);
        }
    };

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitLottieOptTask";
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
        SystemClock.uptimeMillis();
        C1291390ji5.LIZ = LL;
        if (C1291390ji5.LIZIZ) {
            synchronized (C1291390ji5.class) {
                InterfaceC1291400ji6 interfaceC1291400ji6 = C1291390ji5.LIZ;
                if (interfaceC1291400ji6 != null) {
                    interfaceC1291400ji6.LIZ();
                    C1291390ji5.LIZ = null;
                } else {
                    C1291390ji5.LIZIZ = true;
                }
            }
            C1291390ji5.LIZIZ = false;
        }
    }
}
