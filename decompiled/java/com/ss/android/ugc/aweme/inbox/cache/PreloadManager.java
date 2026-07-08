package com.ss.android.ugc.aweme.inbox.cache;

import X.C050Y;
import X.C098200Yq;
import X.C0C39;
import X.C0CCZ;
import X.C0CP9;
import X.C0S78;
import X.C0VZ0;
import X.C11NJ;
import X.C1618440sDa;
import X.C1699850uKt;
import X.C1720106oR;
import X.C189200o6;
import X.C1903410zdD;
import X.C1BWL;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2252408s6;
import X.C2367709Pn;
import X.C279890Ay3;
import X.C279990AyD;
import X.C799890VZj;
import X.C799900VZk;
import X.EnumC1904390zen;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class PreloadManager {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final AtomicReference<NoticeList> LIZJ = new AtomicReference<>(null);
    public static final C11NJ LIZLLL = new C11NJ();
    public static final BPEAHandler LJ = new BPEAHandler(Looper.getMainLooper());
    public static final AtomicBoolean LJFF = new AtomicBoolean(false);
    public static final long LJI = ((Configuration) C1903410zdD.LIZIZ.getValue()).bootFinishDelayTime;

    public static boolean LIZ() {
        boolean z = LIZIZ.get();
        if (z) {
            try {
                LIZLLL.LJ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return z;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return z;
    }

    public static void LIZIZ() {
        EnumC1904390zen.LAUNCH_TIMESTAMP.trackTime();
        C1618440sDa.LIZIZ.LJJIIZI().markColdStart();
        C050Y.LIZ = System.currentTimeMillis();
        if (C0C39.LIZ()) {
            C0S78.LIZJ(new C1699850uKt(), true);
        } else {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("PreloadManager", "onApplicationCreate - PreloadExperiment no hit, return");
        }
    }

    public static final class CachePreloadTask implements C0CCZ {
        public final NoticeList LL;

        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ List finalizedBy() {
            return null;
        }

        @Override // X.InterfaceC800080Va2
        public final String key() {
            return "PreloadManager$CachePreloadTask";
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
        public final /* synthetic */ int targetProcess() {
            return C0VZ0.LIZ();
        }

        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ EnumC799980VZs triggerType() {
            return C0VZ0.LIZIZ(this);
        }

        @Override // X.C0CCZ
        public final EnumC799870VZh type() {
            return EnumC799870VZh.BOOT_FINISH;
        }

        public CachePreloadTask(NoticeList noticeList) {
            this.LL = noticeList;
        }

        @Override // X.InterfaceC308150C6b
        public final void run(Context context) {
            AtomicBoolean atomicBoolean = PreloadManager.LIZ;
            PreloadManager.LIZJ(this.LL);
        }
    }

    public static void LIZJ(NoticeList noticeList) {
        boolean z;
        if (((Number) C279890Ay3.LIZ.getValue()).intValue() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("PreloadManager", "preloadOnBootFinish() is low device, don't preload");
            return;
        }
        if (C279990AyD.LIZ() && C2367709Pn.LJIIIIZZ(C1BWL.LIZ())) {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LJI("PreloadManager", "PreloadManager is low device for cache, don't preload");
        } else {
            if (!LJFF.get()) {
                int i3 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("boot finish has not exceeded ");
                sbLIZ.append(LJI);
                sbLIZ.append(" ms");
                C1720106oR.LJI("PreloadManager", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            C2252408s6.LIZ(new AwS572S0100000_28(noticeList, 233));
        }
    }

    public static final synchronized void LIZLLL(NoticeList noticeList, int i) {
        boolean zLJI = MethodIDManager.LJI(137978);
        if (i == 1) {
            EnumC1904390zen.NOTICE_COUNT_TIMESTAMP.trackTime();
        }
        if (!C0C39.LIZ()) {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LJI("PreloadManager", "PreloadExperiment no hit, return");
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return;
        }
        if (i != 1) {
            if (i == 2) {
                int i3 = C2187451AjH.LIZ;
                C1720106oR.LJI("PreloadManager", "PreloadManager#receive keep-alive");
                if (!LIZ.get()) {
                    C1720106oR.LJI("PreloadManager", "not click inbox tab, receive notice count from keep-alive");
                    LIZJ.set(noticeList);
                }
            }
        } else {
            int i4 = C2187451AjH.LIZ;
            C1720106oR.LJI("PreloadManager", "requestCacheIfNeed Start_UP");
            C799900VZk.LIZ.getClass();
            if (C0CP9.LIZ() && LJFF.get()) {
                C1720106oR.LJI("PreloadManager", "boot finish , request right now");
                LIZJ(noticeList);
            } else {
                C1720106oR.LJI("PreloadManager", "boot finish not finished , request in future");
                C799890VZj c799890VZj = new C799890VZj();
                c799890VZj.LIZ(new CachePreloadTask(noticeList));
                c799890VZj.LIZIZ();
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
