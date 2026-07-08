package com.ss.android.storage;

import X.C01GW;
import X.C07GX;
import X.C0C88;
import X.C0CCZ;
import X.C0VZ0;
import X.C1336210ksN;
import X.C2214201BlK;
import X.C2276581E8y;
import X.C2427009fA;
import X.C452501pT;
import X.C823050WQl;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC345370DgN;
import Y.ARunnableS103S0100000_3;
import Y.AfS172S0100000_3;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class StorageTask implements C0CCZ {
    public static final C01GW<StorageTask> LLILLJJLI = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(347));
    public final ArrayList<InterfaceC345370DgN> LL = new ArrayList<>();

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "StorageTask";
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
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        ConcurrentHashMap<String, Boolean> concurrentHashMap = C0C88.LIZIZ;
        Boolean bool = concurrentHashMap.get("StorageTask");
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2)) {
            return;
        }
        concurrentHashMap.put("StorageTask", bool2);
        ScheduledExecutorService scheduledExecutorServiceLJ = C823050WQl.LJ();
        ARunnableS103S0100000_3 aRunnableS103S0100000_3 = new ARunnableS103S0100000_3(context, 130);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        scheduledExecutorServiceLJ.schedule(aRunnableS103S0100000_3, 3L, timeUnit);
        C823050WQl.LJ().schedule(new ARunnableS103S0100000_3(context, 115), 3L, timeUnit);
        C2427009fA.LIZJ = new C2276581E8y(this);
        if (C1336210ksN.LIZ() || ((Boolean) C07GX.LIZJ.getValue()).booleanValue()) {
            C2214201BlK.LIZLLL().LJJLJLI(new AfS172S0100000_3(context, 7));
        }
    }
}
