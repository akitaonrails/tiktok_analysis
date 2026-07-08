package com.ss.android.ugc.aweme.account.task;

import X.AbstractC848400XPy;
import X.C0CCZ;
import X.C0VZ0;
import X.C0X2P;
import X.C0XQ7;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class CookieMonitorTask implements C0CCZ {
    public static boolean LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "CookieMonitorTask";
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
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.IDLE;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (LL) {
            return;
        }
        LL = true;
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            C0X2P.LIZ.getClass();
            C0X2P.LIZ(1);
        }
    }
}
