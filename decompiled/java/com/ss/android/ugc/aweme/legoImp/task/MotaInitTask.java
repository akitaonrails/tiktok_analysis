package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0O6T;
import X.C0S78;
import X.C0VZ0;
import X.C282560B5q;
import X.C613950O6f;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import Y.ARunnableS109S0100000_9;
import android.content.Context;
import com.ss.android.agilelogger.ALog;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class MotaInitTask implements C0CCZ {
    public static final MotaInitTask LL = new MotaInitTask();

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "MotaInitTask";
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
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("Mota", "MotaInitTask run");
        if (((Boolean) C282560B5q.LIZ.getValue()).booleanValue()) {
            C613950O6f.LJFF = new ARunnableS109S0100000_9(context, 94);
            C0S78.LIZJ(AFwS195S0000000_9.get$arr$(211), true);
        } else {
            new C0O6T().LIZIZ(context);
        }
    }
}
