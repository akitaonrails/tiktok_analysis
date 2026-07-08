package com.ss.android.ugc.aweme.diagnosis;

import X.AbstractC19994813Le;
import X.C01GW;
import X.C0C78;
import X.C0CCZ;
import X.C0VZ0;
import X.C19994913Lf;
import X.C2407009bw;
import X.C260070AHd;
import X.C823050WQl;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.bytedance.otis.resource.cpu.CpuNative;
import com.bytedance.otis.resource.cpu.OtisCPUTime;
import com.bytedance.otis.resource.thread.ThreadDetectNative;
import com.bytedance.otis.resource.thread.ThreadDumper;
import com.ss.android.ugc.aweme.diagnosis.DiagnosisRunnableMonitorTask;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class DiagnosisRunnableMonitorTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "DiagnosisRunnableMonitorTask";
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
        if (C0C78.LIZ()) {
            C2407009bw.LIZ();
            C19994913Lf c19994913Lf = AbstractC19994813Le.Default;
            C01GW c01gw = C260070AHd.LIZ;
            C823050WQl.LJ().scheduleWithFixedDelay(new Runnable() { // from class: X.1C7l
                public final void LIZ() {
                    final DiagnosisRunnableMonitorTask diagnosisRunnableMonitorTask = this.LL;
                    diagnosisRunnableMonitorTask.getClass();
                    if (AbstractC19994813Le.Default.nextFloat() < ((Number) C2554509zj.LIZ.getValue()).floatValue()) {
                        if (C0VX0.LIZ.compareAndSet(false, true)) {
                            C0VX0.LIZIZ.invoke();
                        }
                        if (((Boolean) C0C78.LIZJ.getValue()).booleanValue()) {
                            long jLongValue = ((Number) C260050AHb.LIZ.getValue()).longValue();
                            if (!C2225241C7m.LIZ) {
                                C2225241C7m.LIZ = true;
                                C2225241C7m.LIZIZ = jLongValue;
                                C2225241C7m.LIZJ = 0L;
                                CpuNative cpuNative = CpuNative.LIZ;
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                OtisCPUTime otisCPUTimeDumpOtisCpuTime = CpuNative.dumpOtisCpuTime(true, true, true, null, false, false);
                                otisCPUTimeDumpOtisCpuTime.setRefreshTime(jCurrentTimeMillis);
                                C2225241C7m.LIZLLL = otisCPUTimeDumpOtisCpuTime;
                                for (Map.Entry entry : ((HashMap) C08M6.LIZ(0L)).entrySet()) {
                                    ConcurrentHashMap<String, C2225251C7n> concurrentHashMap = C2225241C7m.LJI;
                                    Object key = entry.getKey();
                                    entry.getKey();
                                    concurrentHashMap.put((String) key, new C2225251C7n(((Number) entry.getValue()).longValue(), 0L, C07KH.LIZLLL.invoke(), null, C07KH.LJ.invoke(), null, 84));
                                }
                                C2225241C7m.LJFF = C2225241C7m.LJI.size();
                                ThreadDetectNative.config(false, false);
                                ThreadDumper threadDumper = ThreadDumper.LIZ;
                                C1C88 c1c88 = (C1C88) C2225241C7m.LJIIIIZZ.getValue();
                                threadDumper.getClass();
                                ThreadDumper.LIZIZ = c1c88;
                                ThreadDetectNative.open();
                                ((C1C7W) C2225241C7m.LJII.getValue()).LIZ(true);
                            }
                        } else {
                            ((C1C7W) C2225181C7g.LIZ.getValue()).LIZ(true);
                        }
                        C15O7.LJIIIIZZ(((Number) C260050AHb.LIZ.getValue()).longValue()).LIZLLL(new InterfaceC2385309Wh() { // from class: X.1C7i
                            @Override // X.InterfaceC2385309Wh
                            public final Object then(C15O7 c15o7) {
                                C1C7U.LIZ("DiagnosisRunnableMonitorTask@6cad.collect$1");
                                diagnosisRunnableMonitorTask.getClass();
                                if (((Boolean) C0C78.LIZJ.getValue()).booleanValue()) {
                                    ((C1C7W) C2225241C7m.LJII.getValue()).LIZIZ();
                                    ThreadDetectNative.close();
                                } else {
                                    ((C1C7W) C2225181C7g.LIZ.getValue()).LIZIZ();
                                }
                                Unit unit = Unit.LIZ;
                                C1C7U.LIZIZ("DiagnosisRunnableMonitorTask@6cad.collect$1");
                                return unit;
                            }
                        });
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("DiagnosisRunnableMonitorTask@6cad.start$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("DiagnosisRunnableMonitorTask@6cad.start$1");
                }
            }, c19994913Lf.nextLong(0L, ((Number) c01gw.getValue()).longValue()), ((Number) c01gw.getValue()).longValue(), TimeUnit.SECONDS);
        }
    }
}
