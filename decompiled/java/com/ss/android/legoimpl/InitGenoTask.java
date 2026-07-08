package com.ss.android.legoimpl;

import X.C08O2;
import X.C0CCZ;
import X.C0VZ0;
import X.C146H;
import X.C1940607iu;
import X.C1BWL;
import X.C1BYB;
import X.C1BYC;
import X.C1BYE;
import X.C1BYH;
import X.C1BYI;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.experiment.ColdBootTasksDegradeExperiment;
import com.ss.android.ugc.bytex.pthread.base.IRunnableMonitor;
import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import com.ss.android.ugc.bytex.pthread.base.PThreadPoolExecutorInject;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
@InterfaceC20234614Fk
public class InitGenoTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitGenoTask";
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

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return !ColdBootTasksDegradeExperiment.LIZ().initGenoTask && Build.VERSION.SDK_INT <= 36;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C146H.LIZJ = true;
        HashSet<String> hashSetLIZ = C1940607iu.LIZ();
        if (hashSetLIZ != null) {
            C1BYH c1byh = C1BYH.SCHEDULE_MODE;
            Application applicationLIZ = C1BWL.LIZ();
            C08O2.LIZIZ().getAbsolutePath();
            C1BYE.LJIIIIZZ = new C1BYB(c1byh, applicationLIZ);
            PThreadExecutorsUtils.pThreadPoolExecutorInject = new PThreadPoolExecutorInject() { // from class: X.1BYD
                /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
                @Override // com.ss.android.ugc.bytex.pthread.base.PThreadPoolExecutorInject
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void beforeExecute(java.lang.Runnable r17) {
                    /*
                        Method dump skipped, instruction units count: 336
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1BYD.beforeExecute(java.lang.Runnable):void");
                }
            };
            PThreadExecutorsUtils.runnableMonitor = new IRunnableMonitor() { // from class: X.1BYF
                @Override // com.ss.android.ugc.bytex.pthread.base.IRunnableMonitor
                public final void afterExecuteRunnable(Runnable runnable) {
                    C1BYJ c1byj;
                    C1BYC c1byc;
                    if (runnable != null) {
                        C1BYE.LJIIJJI.getClass();
                        ConcurrentHashMap<Integer, C1BYJ> concurrentHashMap = C1BYE.LJFF;
                        if (concurrentHashMap.containsKey(Integer.valueOf(runnable.hashCode())) && (c1byj = concurrentHashMap.get(Integer.valueOf(runnable.hashCode()))) != null) {
                            C1BYB c1byb = C1BYE.LJIIIIZZ;
                            if (c1byb == null) {
                                c1byb = null;
                            }
                            int i = C1BYG.LIZ[c1byb.LIZ.ordinal()];
                            if (i != 1 && i != 2) {
                                if (i == 3 && (c1byc = C1BYE.LIZJ.get(c1byj.LIZ)) != null) {
                                    int i2 = C1BYG.LIZIZ[c1byc.LIZIZ.ordinal()];
                                    if (i2 != 1) {
                                        if (i2 == 2) {
                                            C08MK.LIZ(Process.myTid());
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("reset Thread:");
                                            sbLIZ.append(C786410Ut5.u3().getName());
                                            sbLIZ.append(", priority:");
                                            sbLIZ.append(Process.getThreadPriority(Process.myTid()));
                                            C2188811AlT.LIZIZ(sbLIZ);
                                        } else {
                                            throw new C1954807lC();
                                        }
                                    } else {
                                        String str = C1BYE.LIZIZ.get(c1byj.LIZ);
                                        if (str != null && Intrinsics.LJFF(str, c1byj.LIZJ)) {
                                            C08MK.LIZ(Process.myTid());
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append("reset Thread:");
                                            sbLIZ2.append(C786410Ut5.u3().getName());
                                            sbLIZ2.append(", priority:");
                                            sbLIZ2.append(Process.getThreadPriority(Process.myTid()));
                                            C2188811AlT.LIZIZ(sbLIZ2);
                                        }
                                    }
                                }
                            } else {
                                System.currentTimeMillis();
                                SystemClock.currentThreadTimeMillis();
                                C786410Ut5.u3().getName();
                                C1BYE.LJI.remove(C786410Ut5.u3().getName());
                            }
                            C1BYE.LIZ(c1byj.LIZ);
                        }
                    }
                }

                @Override // com.ss.android.ugc.bytex.pthread.base.IRunnableMonitor
                public final void beforeExecuteRunnable(Runnable runnable) {
                    C1BYJ c1byj;
                    if (runnable != null) {
                        C1BYE.LJIIJJI.getClass();
                        ConcurrentHashMap<Integer, C1BYJ> concurrentHashMap = C1BYE.LJFF;
                        if (concurrentHashMap.containsKey(Integer.valueOf(runnable.hashCode())) && (c1byj = concurrentHashMap.get(Integer.valueOf(runnable.hashCode()))) != null) {
                            C1BYB c1byb = C1BYE.LJIIIIZZ;
                            if (c1byb == null) {
                                c1byb = null;
                            }
                            int i = C1BYG.LIZ[c1byb.LIZ.ordinal()];
                            if (i != 1 && i != 2) {
                                if (i == 3) {
                                    C1BYC c1byc = C1BYE.LIZJ.get(c1byj.LIZ);
                                    if (c1byc != null) {
                                        int i2 = C1BYG.LIZIZ[c1byc.LIZIZ.ordinal()];
                                        if (i2 != 1) {
                                            if (i2 == 2) {
                                                C08MK.LIZIZ(Process.myTid(), c1byc.LIZ);
                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                sbLIZ.append("change Thread:");
                                                sbLIZ.append(C786410Ut5.u3().getName());
                                                sbLIZ.append(", priority:");
                                                sbLIZ.append(Process.getThreadPriority(Process.myTid()));
                                                C2188811AlT.LIZIZ(sbLIZ);
                                            } else {
                                                throw new C1954807lC();
                                            }
                                        } else {
                                            String str = C1BYE.LIZIZ.get(c1byj.LIZ);
                                            if (str != null && Intrinsics.LJFF(str, c1byj.LIZJ)) {
                                                C08MK.LIZIZ(Process.myTid(), c1byc.LIZ);
                                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                sbLIZ2.append("change Thread:");
                                                sbLIZ2.append(C786410Ut5.u3().getName());
                                                sbLIZ2.append(", priority:");
                                                sbLIZ2.append(Process.getThreadPriority(Process.myTid()));
                                                C2188811AlT.LIZIZ(sbLIZ2);
                                            }
                                        }
                                    }
                                    if (C1BYE.LIZLLL.get(c1byj.LIZ) != null) {
                                        throw null;
                                    }
                                }
                            } else {
                                C786410Ut5.u3().getName();
                                System.currentTimeMillis();
                                SystemClock.currentThreadTimeMillis();
                                C1BYE.LJI.put(C786410Ut5.u3().getName(), c1byj);
                            }
                            C1BYE.LIZIZ(c1byj.LIZ);
                        }
                    }
                }
            };
            C1BYE.LJIIIZ.set(true);
            Iterator<String> it2 = hashSetLIZ.iterator();
            while (it2.hasNext()) {
                C1BYE.LIZJ.put(it2.next(), new C1BYC(C1BYI.LEVEL_ALL));
            }
        }
    }
}
