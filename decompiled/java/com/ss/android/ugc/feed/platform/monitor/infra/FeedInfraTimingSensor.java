package com.ss.android.ugc.feed.platform.monitor.infra;

import X.AbstractC2361009My;
import X.C01GW;
import X.C0CM3;
import X.C0CMJ;
import X.C0S43;
import X.C0S48;
import X.C0S4O;
import X.C0SZ8;
import X.C19719612Di;
import X.C1C7U;
import X.C312240CLu;
import X.C452501pT;
import X.C715250S3v;
import X.InterfaceC1603190roz;
import X.InterfaceC715180S3o;
import android.hardware.display.DisplayManager;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedInfraTimingSensor extends AbstractC2361009My implements DisplayManager.DisplayListener {
    public static WeakReference<InterfaceC1603190roz> LLILLJJLI;
    public static WeakReference<C0SZ8> LLILLL;
    public static WeakReference<IViewPagerComponentAbility> LLILZ;
    public static boolean LLILZIL;
    public static boolean LLILZLL;
    public static C715250S3v LLJI;
    public static final FeedInfraTimingSensor$timingHandler$1 LLJIJIL;
    public static final C01GW LLJILJIL;
    public static final FeedInfraTimingSensor LL = new FeedInfraTimingSensor();
    public static long LLIZ = -1;
    public static int LLIZLLLIL = -1;
    public static final List<WeakReference<InterfaceC715180S3o>> LLJ = new ArrayList();

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.ss.android.ugc.feed.platform.monitor.infra.FeedInfraTimingSensor$timingHandler$1] */
    static {
        final Looper mainLooper = Looper.getMainLooper();
        LLJIJIL = new BPEAHandler(mainLooper) { // from class: com.ss.android.ugc.feed.platform.monitor.infra.FeedInfraTimingSensor$timingHandler$1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C1C7U.LIZ("FeedInfraTimingSensor@a0a1.timingHandler$1");
                super.handleMessage(message);
                C1C7U.LIZIZ("FeedInfraTimingSensor@a0a1.timingHandler$1");
            }
        };
        LLJILJIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(270));
        C0CM3 c0cm3 = new C0CM3();
        c0cm3.LIZIZ = true;
        c0cm3.LIZJ = C0CMJ.NORMAL_PRIORITY.getType();
        c0cm3.LJFF = "FeedInfra_1";
        c0cm3.LJI = AFwS198S0000000_11.get$arr$(269);
        C312240CLu.LIZ(c0cm3);
    }

    public static void LIZ() {
        C19719612Di.LJJIIJ(LLJ, AFwS243S0000000_11.get$arr$(583), true);
    }

    public static C0SZ8 LIZIZ() {
        WeakReference<C0SZ8> weakReference = LLILLL;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static C0SZ8 LIZJ(IViewPagerComponentAbility iViewPagerComponentAbility) {
        C0SZ8 c0sz8;
        C0SZ8 c0sz8Pn2 = iViewPagerComponentAbility.Pn2();
        if (c0sz8Pn2 != null) {
            WeakReference<C0SZ8> weakReference = LLILLL;
            if (weakReference != null) {
                c0sz8 = weakReference.get();
            } else {
                c0sz8 = null;
            }
            if (Intrinsics.LJFF(c0sz8Pn2, c0sz8)) {
                return c0sz8Pn2;
            }
        }
        return iViewPagerComponentAbility.LJLIL();
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        C0S4O.LIZIZ(C0S4O.LIZ, C0S48.ENTRY_RECORD, 6);
        LIZ();
        Iterator it2 = ((ArrayList) LLJ).iterator();
        while (it2.hasNext()) {
            InterfaceC715180S3o interfaceC715180S3o = (InterfaceC715180S3o) ((Reference) it2.next()).get();
            if (interfaceC715180S3o != null) {
                interfaceC715180S3o.LJIIJJI(C0S48.ENTRY_RECORD);
            }
        }
    }

    @Override // X.AbstractC2361009My
    public final boolean onShot(String str) {
        C0S4O.LIZIZ(C0S4O.LIZ, C0S48.ENTRY_SHOT, 6);
        LIZ();
        Iterator it2 = ((ArrayList) LLJ).iterator();
        while (it2.hasNext()) {
            InterfaceC715180S3o interfaceC715180S3o = (InterfaceC715180S3o) ((Reference) it2.next()).get();
            if (interfaceC715180S3o != null) {
                interfaceC715180S3o.LJ(C0S48.ENTRY_SHOT);
            }
        }
        return super.onShot(str);
    }

    public static void LIZLLL(C0S43 c0s43, String str) {
        LLJI = new C715250S3v(c0s43, System.currentTimeMillis(), str);
    }
}
