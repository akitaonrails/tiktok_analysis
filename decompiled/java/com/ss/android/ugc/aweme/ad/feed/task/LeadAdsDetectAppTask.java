package com.ss.android.ugc.aweme.ad.feed.task;

import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C823050WQl;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import X.RunnableC1019580cdg;
import android.content.Context;
import android.os.Looper;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class LeadAdsDetectAppTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "LeadAdsDetectAppTask";
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
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        RunnableC1019580cdg runnableC1019580cdg = RunnableC1019580cdg.LL;
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C823050WQl.LIZJ().execute(runnableC1019580cdg);
        } else {
            runnableC1019580cdg.run();
        }
    }
}
