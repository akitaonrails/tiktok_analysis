package com.bytedance.android.sdk.ticketguard;

import X.C08RA;
import X.C0XNB;
import X.C0XNC;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes14.dex */
public final class TicketGuardFramework {
    public static final TicketGuardFramework INSTANCE = new TicketGuardFramework();
    public static C08RA LIZ;

    public final TicketGuardService getService() {
        return LIZ;
    }

    public static final void tryInit(TicketGuardInitParam ticketGuardInitParam) {
        tryInit(ticketGuardInitParam, null, false);
    }

    public static final void tryInit(TicketGuardInitParam ticketGuardInitParam, Function1<? super Boolean, Unit> function1) {
        tryInit(ticketGuardInitParam, function1, false);
    }

    public final void LIZ(TicketGuardInitParam ticketGuardInitParam, Function1<? super Boolean, Unit> function1) {
        synchronized (this) {
            try {
                C08RA c08ra = LIZ;
                if (c08ra != null) {
                    c08ra.tryInit(ticketGuardInitParam, function1);
                    return;
                }
                C08RA c08ra2 = new C08RA();
                c08ra2.tryInit(ticketGuardInitParam, function1);
                LIZ = c08ra2;
                C0XNB.LIZ = c08ra2;
                C0XNC.LIZ = c08ra2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static final void tryInit(TicketGuardInitParam ticketGuardInitParam, Function1<? super Boolean, Unit> function1, boolean z) {
        if (z) {
            INSTANCE.LIZ(ticketGuardInitParam, function1);
            return;
        }
        synchronized (INSTANCE) {
            try {
                if (LIZ == null) {
                    C08RA c08ra = new C08RA();
                    LIZ = c08ra;
                    C0XNB.LIZ = c08ra;
                    C0XNC.LIZ = c08ra;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C08RA c08ra2 = LIZ;
        if (c08ra2 != null) {
            c08ra2.tryInit(ticketGuardInitParam, function1);
        }
    }
}
