package com.bytedance.monitor.collector;

import X.C0V3X;
import android.util.Pair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class IOMonitor extends c {
    public static final List<C0V3X> LJ = new ArrayList(100);
    public static final Object LJFF = new Object();
    public static volatile int LJI = 0;

    public IOMonitor() {
        throw null;
    }

    @Override // com.bytedance.monitor.collector.c
    public final void LJ(int i) {
    }

    @Override // com.bytedance.monitor.collector.c
    public final Pair<String, ?> LIZ() {
        try {
            return new Pair<>(this.LIZ, LJ.toString());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static String LJFF(long j, long j2) {
        C0V3X c0v3x;
        ArrayList arrayList = new ArrayList();
        synchronized (LJFF) {
            try {
                int i = 0;
                if (((ArrayList) LJ).size() < 100) {
                    while (true) {
                        List<C0V3X> list = LJ;
                        if (i >= ((ArrayList) list).size()) {
                            break;
                        }
                        arrayList.add(((ArrayList) list).get(i));
                        i++;
                    }
                } else {
                    while (i < 100) {
                        arrayList.add(((ArrayList) LJ).get(((LJI + i) + 1) % 100));
                        i++;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                break;
            }
            c0v3x = (C0V3X) ListProtector.get(arrayList, size);
            if (c0v3x.LIZ < j2 || c0v3x.LIZIZ > j) {
                arrayList2.add(c0v3x);
            }
        } while (c0v3x.LIZIZ >= j);
        return arrayList2.toString();
    }

    @Override // com.bytedance.monitor.collector.c
    public final Pair<String, ?> LIZIZ(long j, long j2) {
        try {
            return new Pair<>(this.LIZ, LJFF(j, j2));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static void saveIOInfo(long j, long j2, long j3, long j4, String str, String str2) {
        synchronized (LJFF) {
            try {
                if (LJI >= 100) {
                    LJI -= 100;
                }
                List<C0V3X> list = LJ;
                if (((ArrayList) list).size() >= 100) {
                    C0V3X c0v3x = (C0V3X) ((ArrayList) list).get(LJI);
                    c0v3x.LIZ = j;
                    c0v3x.LIZIZ = j2;
                    c0v3x.LIZJ = j4;
                    c0v3x.LIZLLL = str;
                    c0v3x.LJ = str2;
                } else {
                    C0V3X c0v3x2 = new C0V3X();
                    c0v3x2.LIZ = j;
                    c0v3x2.LIZIZ = j2;
                    c0v3x2.LIZJ = j4;
                    c0v3x2.LIZLLL = str;
                    c0v3x2.LJ = str2;
                    ((ArrayList) list).add(c0v3x2);
                }
                LJI++;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
