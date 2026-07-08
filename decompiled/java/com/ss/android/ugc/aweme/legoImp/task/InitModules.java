package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C0XQ7;
import X.C302530BtT;
import X.C823050WQl;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import Y.ARunnableS98S0000000_23;
import android.content.Context;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.common.applog.AppLog;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes24.dex */
public class InitModules implements C0CCZ, InterfaceC799590VYf {
    public static InitModules LL;
    public static final AtomicBoolean LLILLJJLI = new AtomicBoolean(false);

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitModules";
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
    public final /* synthetic */ int priority() {
        return 1;
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

    public static void LIZ() {
        if (LLILLJJLI.compareAndSet(false, true) && C0XQ7.LJFF().isLogin()) {
            AppLog.setUserId(CastLongProtector.parseLong(C0XQ7.LJFF().getCurUserId()));
            AppLog.setSessionKey(C0XQ7.LJFF().LJIIZILJ());
        }
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        int i = C302530BtT.LIZ;
        if (i != 2 && i != 100) {
            LIZ();
        } else {
            C823050WQl.LIZLLL().execute(new ARunnableS98S0000000_23(8));
        }
    }
}
