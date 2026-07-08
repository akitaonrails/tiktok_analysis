package com.ss.android.ugc.tiktok.commercialize.dispatcher.impl;

import X.C0NCU;
import X.C1056820dbk;
import X.C1056850dbn;
import X.C1056880dbq;
import X.C1057040dc6;
import X.C13LP;
import X.C800940VbQ;
import X.EnumC588020N4m;
import X.InterfaceC1017050cZb;
import X.InterfaceC1057000dc2;
import X.InterfaceC1057010dc3;
import X.RunnableC1056830dbl;
import android.os.Handler;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.tiktok.commercialize.dispatcher.api.ICommerceTaskSchedulerService;
import com.ss.android.ugc.tiktok.commercialize.dispatcher.api.settings.TaskConfigModel;
import com.ss.android.ugc.tiktok.commercialize.dispatcher.impl.settings.CommonDispatchConfigModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.PriorityQueue;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceTaskScheduler implements ICommerceTaskSchedulerService, InterfaceC1057010dc3 {
    public final C800940VbQ LIZ = new C800940VbQ();
    public final C1056820dbk LIZIZ = new C1056820dbk(this);
    public long LIZJ;

    @Override // com.ss.android.ugc.tiktok.commercialize.dispatcher.api.ICommerceTaskSchedulerService
    public final void LIZ() {
        InterfaceC1057000dc2 interfaceC1057000dc2;
        for (Object obj : (List) this.LIZIZ.LJI.getValue()) {
            if ((obj instanceof InterfaceC1057000dc2) && (interfaceC1057000dc2 = (InterfaceC1057000dc2) obj) != null) {
                interfaceC1057000dc2.LIZ();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.0dbl] */
    public final void LJ() {
        if (this.LIZ.LIZ() <= 0) {
            C1056820dbk c1056820dbk = this.LIZIZ;
            if (c1056820dbk.LJII.get()) {
                return;
            }
            RunnableC1056830dbl runnableC1056830dbl = c1056820dbk.LJFF;
            if (runnableC1056830dbl != null) {
                ((Handler) c1056820dbk.LJ.getValue()).removeCallbacks(runnableC1056830dbl);
                c1056820dbk.LJFF = null;
            }
            c1056820dbk.LJII.set(true);
            return;
        }
        final C1056820dbk c1056820dbk2 = this.LIZIZ;
        if (!c1056820dbk2.LJII.get() || c1056820dbk2.LIZIZ == EnumC588020N4m.BUSY.ordinal()) {
            return;
        }
        RunnableC1056830dbl runnableC1056830dbl2 = c1056820dbk2.LJFF;
        if (runnableC1056830dbl2 != null) {
            ((Handler) c1056820dbk2.LJ.getValue()).removeCallbacks(runnableC1056830dbl2);
            c1056820dbk2.LJFF = null;
        }
        c1056820dbk2.LJFF = new Runnable() { // from class: X.0dbl
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("CommerceTaskTrigger@448e.loop$1");
                try {
                    C1056820dbk c1056820dbk3 = c1056820dbk2;
                    int i = c1056820dbk3.LIZIZ;
                    c1056820dbk3.LIZ.onStateChange(i);
                    c1056820dbk3.LIZIZ = i;
                    c1056820dbk2.LIZIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("CommerceTaskTrigger@448e.loop$1");
            }
        };
        c1056820dbk2.LIZIZ();
        c1056820dbk2.LJII.set(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d6, code lost:
    
        if (r1.contains(java.lang.String.valueOf(r4)) == false) goto L20;
     */
    @Override // com.ss.android.ugc.tiktok.commercialize.dispatcher.api.ICommerceTaskSchedulerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.InterfaceC1017050cZb r13) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.commercialize.dispatcher.impl.CommerceTaskScheduler.LIZJ(X.0cZb):void");
    }

    @Override // com.ss.android.ugc.tiktok.commercialize.dispatcher.api.ICommerceTaskSchedulerService
    public final boolean LIZLLL(String str) {
        Object next;
        C800940VbQ c800940VbQ = this.LIZ;
        c800940VbQ.LIZJ.lock();
        try {
            PriorityQueue priorityQueue = (PriorityQueue) ((LinkedHashMap) c800940VbQ.LIZIZ).get(str);
            if (priorityQueue != null) {
                Iterator it2 = priorityQueue.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(((InterfaceC1017050cZb) next).LJJJLIIL(), "loading_format")) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                final InterfaceC1017050cZb interfaceC1017050cZb = (InterfaceC1017050cZb) next;
                if (interfaceC1017050cZb != null) {
                    priorityQueue.remove(interfaceC1017050cZb);
                    c800940VbQ.LIZJ.unlock();
                    LIZJ(new InterfaceC1017050cZb() { // from class: X.0cZa
                        @Override // X.InterfaceC1017050cZb
                        public final void LJJJJI(long j) {
                        }

                        @Override // X.InterfaceC1017050cZb
                        public final void LJJLIIIJJI(long j) {
                        }

                        @Override // X.InterfaceC1017050cZb
                        public final String C2() {
                            return interfaceC1017050cZb.C2();
                        }

                        @Override // X.InterfaceC1017050cZb
                        public final TaskConfigModel LJIIIIZZ() {
                            return interfaceC1017050cZb.LJIIIIZZ();
                        }

                        @Override // X.InterfaceC1017050cZb
                        public final int LJIL() {
                            return EnumC1017030cZZ.DIRECT.getValue();
                        }

                        @Override // X.InterfaceC1017050cZb
                        public final long LJJIJLIJ() {
                            return interfaceC1017050cZb.LJJIJLIJ();
                        }

                        @Override // X.InterfaceC1017050cZb
                        public final String LJJJLIIL() {
                            return interfaceC1017050cZb.LJJJLIIL();
                        }

                        @Override // X.InterfaceC1017050cZb
                        public final long LJJLIIIIJ() {
                            return interfaceC1017050cZb.LJJIJLIJ();
                        }

                        @Override // X.InterfaceC1017050cZb
                        public final CommonAdData getRawAd() {
                            return interfaceC1017050cZb.getRawAd();
                        }

                        @Override // X.InterfaceC1017050cZb
                        public final void run() {
                            interfaceC1017050cZb.run();
                        }

                        @Override // X.InterfaceC1017050cZb
                        public final double getPriority() {
                            return C337030DJd.LIZIZ(LJJJLIIL());
                        }

                        @Override // java.lang.Comparable
                        public final int compareTo(InterfaceC1017050cZb interfaceC1017050cZb2) {
                            return C337030DJd.LIZ(this, interfaceC1017050cZb2);
                        }
                    });
                    return true;
                }
            }
            c800940VbQ.LIZJ.unlock();
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c800940VbQ.LIZJ.unlock();
            throw th;
        }
    }

    @Override // X.InterfaceC1057010dc3
    public final void onStateChange(int i) {
        long jLongValue;
        Object next;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZJ;
        Long l = ((CommonDispatchConfigModel) C1057040dc6.LIZIZ.getValue()).taskDispatchInterval;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 3000;
        }
        if (jCurrentTimeMillis >= jLongValue) {
            C800940VbQ c800940VbQ = this.LIZ;
            c800940VbQ.LIZJ.lock();
            try {
                if (c800940VbQ.LIZ() != 0) {
                    Iterator<String> it2 = c800940VbQ.LIZ.iterator();
                    while (it2.hasNext()) {
                        PriorityQueue priorityQueue = (PriorityQueue) ((LinkedHashMap) c800940VbQ.LIZIZ).get(it2.next());
                        if (priorityQueue != null) {
                            Iterator it3 = priorityQueue.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    next = it3.next();
                                    InterfaceC1017050cZb interfaceC1017050cZb = (InterfaceC1017050cZb) next;
                                    if ((interfaceC1017050cZb.LJIL() & i) == interfaceC1017050cZb.LJIL()) {
                                        break;
                                    }
                                } else {
                                    next = null;
                                    break;
                                }
                            }
                            InterfaceC1017050cZb interfaceC1017050cZb2 = (InterfaceC1017050cZb) next;
                            if (interfaceC1017050cZb2 != null) {
                                priorityQueue.remove(interfaceC1017050cZb2);
                                c800940VbQ.LIZJ.unlock();
                                interfaceC1017050cZb2.run();
                                interfaceC1017050cZb2.LJJLIIIJJI(System.currentTimeMillis());
                                new C1056880dbq(interfaceC1017050cZb2).logAd(C1056850dbn.LIZ, interfaceC1017050cZb2.getRawAd(), new AwS382S0200000_16(interfaceC1017050cZb2, C0NCU.NORMAL_DISPATCH, 111));
                                this.LIZJ = System.currentTimeMillis();
                                break;
                            }
                        }
                    }
                    c800940VbQ.LIZJ.unlock();
                } else {
                    c800940VbQ.LIZJ.unlock();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c800940VbQ.LIZJ.unlock();
                throw th;
            }
        }
        LJ();
    }

    @Override // com.ss.android.ugc.tiktok.commercialize.dispatcher.api.ICommerceTaskSchedulerService
    public final void LIZIZ(String str, List<? extends Aweme> list) {
        AwemeRawAd awemeRawAd;
        Long creativeId;
        List<InterfaceC1017050cZb> listLLIIII = null;
        if (list != null) {
            Iterator<? extends Aweme> it2 = list.iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next().getAid(), str)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            Integer numValueOf = Integer.valueOf(i);
            if (numValueOf != null && numValueOf.intValue() >= 2 && (awemeRawAd = ((Aweme) ListProtector.get(list, numValueOf.intValue() - 2)).getAwemeRawAd()) != null && (creativeId = awemeRawAd.getCreativeId()) != null) {
                long jLongValue = creativeId.longValue();
                C800940VbQ c800940VbQ = this.LIZ;
                String strValueOf = String.valueOf(jLongValue);
                c800940VbQ.getClass();
                if (strValueOf.length() != 0) {
                    c800940VbQ.LIZJ.lock();
                    try {
                        c800940VbQ.LIZ.remove(strValueOf);
                        PriorityQueue<InterfaceC1017050cZb> priorityQueueRemove = c800940VbQ.LIZIZ.remove(strValueOf);
                        if (priorityQueueRemove != null) {
                            listLLIIII = C13LP.LLIIII(priorityQueueRemove);
                        }
                        c800940VbQ.LIZJ.unlock();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c800940VbQ.LIZJ.unlock();
                        throw th;
                    }
                }
                LJ();
                if (listLLIIII != null && !listLLIIII.isEmpty()) {
                    for (InterfaceC1017050cZb interfaceC1017050cZb : listLLIIII) {
                        new C1056880dbq(interfaceC1017050cZb).logAd(C1056850dbn.LIZ, interfaceC1017050cZb.getRawAd(), new AwS382S0200000_16(interfaceC1017050cZb, C0NCU.CANCELED, 111));
                    }
                }
            }
        }
    }
}
