package com.ss.android.ugc.aweme.offlinepush.worker;

import X.C020L;
import X.C098200Yq;
import X.C0XF1;
import X.C0XF5;
import X.C10ID;
import X.C10IG;
import X.C1126904ax;
import X.C13LP;
import X.C1575100r5g;
import X.C1575430r6D;
import X.C185700nX;
import X.C189200o6;
import X.C19319410i8;
import X.C816100Vzs;
import X.C844470XAv;
import X.EnumC325100Com;
import android.content.Context;
import androidx.work.WorkerParameters;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import java.util.Calendar;
import java.util.Set;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS47S0001000_2;

/* JADX INFO: loaded from: classes29.dex */
public final class Strategy3PeriodicWork extends BaseOfflinePushWork {
    public final C19319410i8 LLJI;
    public final int LLJIJIL;

    @Override // com.ss.android.ugc.aweme.offlinepush.worker.BaseOfflinePushWork
    public final void LJIIJJI() {
        C10IG.LIZ.getClass();
        C10IG.LIZ("worker_finally");
    }

    @Override // com.ss.android.ugc.aweme.offlinepush.worker.BaseOfflinePushWork
    public final int LJIIJ() {
        return this.LLJIJIL;
    }

    public Strategy3PeriodicWork(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.LLJI = new C19319410i8("push_S3Work");
        this.LLJIJIL = 3;
    }

    @Override // com.ss.android.ugc.aweme.offlinepush.worker.BaseOfflinePushWork
    public final C816100Vzs LJIIIIZZ(Context context, int i) {
        boolean z;
        Object c098200Yq;
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        C10IG.LIZ.getClass();
        C1575100r5g c1575100r5g = C1575100r5g.LIZ;
        C1575430r6D.LIZ.getClass();
        int i4 = C1575430r6D.LIZ().strategy3InactiveMinutes;
        if (i4 < 0) {
            i4 = 0;
        }
        c1575100r5g.getClass();
        if (i4 > 0) {
            long j = C10ID.LIZJ().getLong("last_foreground_ts", 0L);
            if (j <= 0) {
                C1575100r5g.LIZIZ.LIZIZ(new AwS47S0001000_2(i4, 4));
                z = false;
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis() - j;
                long j2 = ((long) i4) * 60000;
                if (jCurrentTimeMillis >= j2) {
                    z = true;
                } else {
                    z = false;
                }
                C1575100r5g.LIZIZ.LIZIZ(new C1126904ax(i4, jCurrentTimeMillis, j2, z));
            }
        } else {
            z = false;
        }
        if (!z) {
            C10IG.LIZIZ.LJIIJJI(AFwS217S0000000_28.get$arr$(474));
        } else {
            Set setLIZ = C1575100r5g.LIZ();
            int i5 = Calendar.getInstance().get(11);
            if (!setLIZ.contains(Integer.valueOf(i5))) {
                C10IG.LIZIZ.LJIIJJI(new C020L(setLIZ, i5, 3));
            } else {
                boolean zLIZJ = C1575100r5g.LIZJ();
                boolean zLIZIZ = C1575100r5g.LIZIZ();
                if (!zLIZJ && !zLIZIZ) {
                    C10IG.LIZIZ.LJIIJJI(AFwS217S0000000_28.get$arr$(475));
                } else {
                    C844470XAv.LIZ.getClass();
                    Context contextLIZ = C844470XAv.LIZ();
                    C0XF5.LIZJ.LIZIZ.getClass();
                    boolean zLIZJ2 = C0XF1.LIZJ(contextLIZ);
                    try {
                        INetworkStateService iNetworkStateService = (INetworkStateService) PluggableExtentionKt.pluggableSpi$default(INetworkStateService.class, false, false, false, 14, null);
                        if (iNetworkStateService != null) {
                            c098200Yq = iNetworkStateService.getNetworkStatus();
                        } else {
                            c098200Yq = null;
                        }
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = null;
                    }
                    EnumC325100Com enumC325100Com = (EnumC325100Com) c098200Yq;
                    if (zLIZJ && C13LP.LJJJJ(enumC325100Com, C10IG.LIZJ)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (zLIZIZ && (zLIZJ2 || enumC325100Com == EnumC325100Com.NOT_AVAILABLE)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z2 && !z3) {
                        C10IG.LIZIZ.LJIIJJI(new C185700nX(zLIZJ, zLIZIZ, zLIZJ2, enumC325100Com));
                    } else {
                        C1575100r5g.LIZ.getClass();
                        boolean zLIZJ3 = C1575100r5g.LIZJ();
                        if (zLIZJ3) {
                            i2 = 2131755439;
                        } else {
                            i2 = 2131755440;
                        }
                        String strLJIIL = BaseOfflinePushWork.LJIIL(i2, i, context);
                        if (zLIZJ3) {
                            i3 = 2131838514;
                        } else {
                            i3 = 2131838515;
                        }
                        return new C816100Vzs(this.LLJIJIL, strLJIIL, context.getString(i3));
                    }
                }
            }
        }
        this.LLJI.LJIIJJI(AFwS217S0000000_28.get$arr$(489));
        return null;
    }
}
