package com.ss.android.ugc.aweme.tab.metrics;

import X.AbstractC1593300rZ2;
import X.C1584320rKY;
import X.C1593220rYu;
import X.C1593240rYw;
import X.C1593250rYx;
import X.C1593260rYy;
import X.C1593270rYz;
import X.C1593280rZ0;
import X.C1593330rZ5;
import X.C1697810uHb;
import X.C1954807lC;
import X.C19EG;
import X.C2097608Jq;
import X.C2421209eE;
import X.C786410Ut5;
import X.C799570VYd;
import X.EnumC1083510eIn;
import X.EnumC1589910rTZ;
import X.EnumC1593230rYv;
import X.EnumC1593290rZ1;
import X.ViewTreeObserverOnPreDrawListenerC337150DJp;
import Y.ARunnableS124S0100000_24;
import Y.ARunnableS13S0310000_24;
import Y.ARunnableS93S0200000_24;
import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.TabSwitchMetricConfig;
import com.ss.android.ugc.aweme.spi.TabSwitchMetricService;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class TabSwitchMetricServiceImpl implements TabSwitchMetricService {
    public volatile C1593260rYy LIZIZ;
    public ARunnableS124S0100000_24 LIZJ;
    public final List<String> LIZLLL = C1697810uHb.LJIIJJI("scene_tab_top_fragment_page_selected", "scene_tab_fragment_on_create", "scene_tab_fragment_on_view_created", "scene_tab_top_fragment_page_scroll_state_0");

    public final void LJIIJJI() {
        ARunnableS124S0100000_24 aRunnableS124S0100000_24 = this.LIZJ;
        if (aRunnableS124S0100000_24 != null) {
            C799570VYd.LIZIZ().removeCallbacks(aRunnableS124S0100000_24);
        }
        this.LIZJ = null;
    }

    @Override // com.ss.android.ugc.aweme.spi.TabSwitchMetricService
    public final void LJI() {
        C1593220rYu c1593220rYu = C1593220rYu.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.spi.TabSwitchMetricService
    public final void LJII() {
    }

    @Override // com.ss.android.ugc.aweme.spi.TabSwitchMetricService
    public final void LIZJ(AbstractC1593300rZ2 abstractC1593300rZ2) {
        String str = abstractC1593300rZ2.LIZ;
        if (str == null) {
            return;
        }
        LJIIJJI();
        C1593260rYy c1593260rYy = new C1593260rYy(UUID.randomUUID().toString(), abstractC1593300rZ2, str);
        C1593240rYw c1593240rYw = abstractC1593300rZ2.LIZIZ;
        c1593260rYy.LIZLLL.put(c1593240rYw.LIZ, c1593240rYw);
        this.LIZIZ = c1593260rYy;
        LJIIJJI();
        long j = ((TabSwitchMetricConfig.Config) TabSwitchMetricConfig.LIZIZ.getValue()).sessionFlushTimeoutMs;
        if (j > 0) {
            ARunnableS124S0100000_24 aRunnableS124S0100000_24 = new ARunnableS124S0100000_24(this, 111);
            this.LIZJ = aRunnableS124S0100000_24;
            C786410Ut5.LJLIIL(j, C799570VYd.LIZIZ(), aRunnableS124S0100000_24);
        }
    }

    @Override // com.ss.android.ugc.aweme.spi.TabSwitchMetricService
    public final void LJ(C1593330rZ5 c1593330rZ5) {
        C1593260rYy c1593260rYy = this.LIZIZ;
        if (c1593260rYy == null || c1593260rYy.LJIIIZ) {
            return;
        }
        C1593240rYw c1593240rYw = c1593330rZ5.LIZJ;
        c1593260rYy.LIZLLL.put(c1593240rYw.LIZ, c1593240rYw);
        c1593260rYy.LIZJ = c1593330rZ5.LIZ;
        c1593260rYy.LJI = c1593330rZ5.LIZIZ;
        if (c1593330rZ5.LIZLLL != null) {
            c1593260rYy.LJII = new WeakReference<>(c1593330rZ5.LIZLLL);
        }
    }

    public final void LJIIL(String str) {
        synchronized (this) {
            try {
                C1593260rYy c1593260rYy = this.LIZIZ;
                if (c1593260rYy == null) {
                    return;
                }
                String strLIZ = c1593260rYy.LIZ();
                if (strLIZ == null) {
                    return;
                }
                if (str != null && !Intrinsics.LJFF(strLIZ, str)) {
                    return;
                }
                if (c1593260rYy.LJIIIZ) {
                    return;
                }
                c1593260rYy.LJIIIZ = true;
                this.LIZIZ = null;
                LJIIJJI();
                C1593270rYz c1593270rYzLJIILL = LJIILL(c1593260rYy, strLIZ);
                if (!c1593270rYzLJIILL.LJI) {
                    return;
                }
                C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new ARunnableS93S0200000_24(this, c1593270rYzLJIILL, 31));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.spi.TabSwitchMetricService
    public final void LJJIJIIJI(String str) {
        C1593260rYy c1593260rYy = this.LIZIZ;
        if (c1593260rYy == null || !LJIILIIL(c1593260rYy, str, null)) {
            return;
        }
        LJIILJJIL(c1593260rYy, !c1593260rYy.LJIIIIZZ);
    }

    public static C1593270rYz LJIILL(C1593260rYy c1593260rYy, String str) {
        String strLJI;
        String str2;
        String value;
        Map mapLJIIZILJ = C2097608Jq.LJIIZILJ(c1593260rYy.LIZLLL);
        C1584320rKY c1584320rKY = C1584320rKY.LIZ;
        c1584320rKY.getClass();
        String strLJI2 = C1584320rKY.LJI(str);
        String str3 = c1593260rYy.LIZJ;
        String str4 = "be_null";
        if ((str3 == null || (strLJI = C1584320rKY.LJI(str3)) == null) && (strLJI = C1584320rKY.LJIIIIZZ) == null) {
            strLJI = "be_null";
        }
        EnumC1589910rTZ enumC1589910rTZ = c1593260rYy.LIZIZ.LIZLLL;
        if (enumC1589910rTZ != null && (value = enumC1589910rTZ.getValue()) != null) {
            str4 = value;
        }
        EnumC1083510eIn enumC1083510eIn = c1593260rYy.LIZIZ.LIZJ;
        Activity activityLIZ = C2421209eE.LIZ();
        if (activityLIZ != null && (activityLIZ instanceof C19EG)) {
            c1584320rKY.getClass();
            str2 = (String) C1584320rKY.LIZIZ((C19EG) activityLIZ, str).getFirst();
        } else {
            str2 = null;
        }
        return new C1593270rYz(strLJI2, strLJI, str4, enumC1083510eIn, str2, c1593260rYy.LIZIZ instanceof C1593250rYx, mapLJIIZILJ.containsKey(EnumC1593230rYv.ON_VIEW_CREATED), mapLJIIZILJ, C2097608Jq.LJIIZILJ(c1593260rYy.LJFF));
    }

    @Override // com.ss.android.ugc.aweme.spi.TabSwitchMetricService
    public final void LIZ(long j, String str) {
        C1593260rYy c1593260rYy = this.LIZIZ;
        if (c1593260rYy == null || c1593260rYy.LJIIIZ) {
            return;
        }
        c1593260rYy.LJ.put(str, Long.valueOf(j));
    }

    @Override // com.ss.android.ugc.aweme.spi.TabSwitchMetricService
    public final void LIZLLL(String str, EnumC1593230rYv enumC1593230rYv) {
        C1593260rYy c1593260rYy = this.LIZIZ;
        if (c1593260rYy == null || !LJIILIIL(c1593260rYy, str, null)) {
            return;
        }
        c1593260rYy.LIZLLL.put(enumC1593230rYv, new C1593240rYw(enumC1593230rYv));
    }

    @Override // com.ss.android.ugc.aweme.spi.TabSwitchMetricService
    public final void LJFF(long j, String str) {
        Long l;
        C1593260rYy c1593260rYy = this.LIZIZ;
        if (c1593260rYy != null && !c1593260rYy.LJIIIZ && (l = c1593260rYy.LJ.get(str)) != null) {
            c1593260rYy.LJFF.put(str, Long.valueOf(j - l.longValue()));
        }
    }

    @Override // com.ss.android.ugc.aweme.spi.TabSwitchMetricService
    public final void LJIIIIZZ(String str, EnumC1593230rYv enumC1593230rYv) {
        C1593260rYy c1593260rYy = this.LIZIZ;
        if (c1593260rYy == null || !LJIILIIL(c1593260rYy, str, null)) {
            return;
        }
        c1593260rYy.LIZLLL.put(enumC1593230rYv, new C1593240rYw(enumC1593230rYv));
        if (c1593260rYy.LIZLLL.containsKey(EnumC1593230rYv.CACHE_DATA)) {
            LJIILJJIL(c1593260rYy, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.spi.TabSwitchMetricService
    public final void LJIIJ(String str, EnumC1593290rZ1 enumC1593290rZ1) {
        C1593260rYy c1593260rYy = this.LIZIZ;
        if (c1593260rYy == null || !LJIILIIL(c1593260rYy, str, null)) {
            return;
        }
        c1593260rYy.LJIIIIZZ = false;
        EnumC1593230rYv enumC1593230rYv = EnumC1593230rYv.FULL_DATA;
        c1593260rYy.LIZLLL.put(enumC1593230rYv, new C1593240rYw(enumC1593230rYv));
        LJIILLIIL(c1593260rYy, enumC1593290rZ1, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(X.C1593260rYy r7, boolean r8) {
        /*
            r6 = this;
            boolean r0 = r7.LJIIIZ
            if (r0 == 0) goto L5
            return
        L5:
            java.util.Map<X.0rYv, X.0rYw> r1 = r7.LIZLLL
            X.0rYv r0 = X.EnumC1593230rYv.CACHE_DATA
            java.lang.Object r5 = r1.get(r0)
            java.util.Map<X.0rYv, X.0rYw> r0 = r7.LIZLLL
            X.0rYv r4 = X.EnumC1593230rYv.CACHE_DATA_NEXT_FRAME
            java.lang.Object r3 = r0.get(r4)
            java.util.Map<X.0rYv, X.0rYw> r1 = r7.LIZLLL
            X.0rYv r0 = X.EnumC1593230rYv.FULL_DATA
            java.lang.Object r1 = r1.get(r0)
            java.util.Map<X.0rYv, X.0rYw> r0 = r7.LIZLLL
            X.0rYv r2 = X.EnumC1593230rYv.FULL_DATA_NEXT_FRAME
            java.lang.Object r0 = r0.get(r2)
            if (r5 == 0) goto L3f
            if (r1 != 0) goto L41
            if (r3 != 0) goto L35
            X.0rYw r1 = new X.0rYw
            r1.<init>(r4)
            java.util.Map<X.0rYv, X.0rYw> r0 = r7.LIZLLL
            r0.put(r4, r1)
        L35:
            if (r8 == 0) goto L3e
            java.lang.String r0 = r7.LIZ()
            r6.LJIIL(r0)
        L3e:
            return
        L3f:
            if (r1 == 0) goto L35
        L41:
            if (r0 != 0) goto L35
            X.0rYw r1 = new X.0rYw
            r1.<init>(r2)
            java.util.Map<X.0rYv, X.0rYw> r0 = r7.LIZLLL
            r0.put(r2, r1)
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tab.metrics.TabSwitchMetricServiceImpl.LJIILJJIL(X.0rYy, boolean):void");
    }

    public static boolean LJIILIIL(C1593260rYy c1593260rYy, String str, Fragment fragment) {
        String strLIZ = c1593260rYy.LIZ();
        Fragment fragment2 = null;
        if (strLIZ == null) {
            WeakReference<Fragment> weakReference = c1593260rYy.LJII;
            if (weakReference != null) {
                fragment2 = weakReference.get();
            }
            if (fragment == null || fragment2 == null || fragment2 == fragment) {
                return true;
            }
            return false;
        }
        if (!Intrinsics.LJFF(str, strLIZ)) {
            return false;
        }
        WeakReference<Fragment> weakReference2 = c1593260rYy.LJII;
        if (weakReference2 != null) {
            fragment2 = weakReference2.get();
        }
        if (fragment == null || fragment2 == null || fragment2 == fragment) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.spi.TabSwitchMetricService
    public final void LIZIZ(String str, EnumC1593290rZ1 enumC1593290rZ1, boolean z) {
        C1593260rYy c1593260rYy = this.LIZIZ;
        if (c1593260rYy == null || !LJIILIIL(c1593260rYy, str, null)) {
            return;
        }
        c1593260rYy.LJIIIIZZ = z;
        EnumC1593230rYv enumC1593230rYv = EnumC1593230rYv.CACHE_DATA;
        c1593260rYy.LIZLLL.put(enumC1593230rYv, new C1593240rYw(enumC1593230rYv));
        LJIILLIIL(c1593260rYy, enumC1593290rZ1, false);
    }

    @Override // com.ss.android.ugc.aweme.spi.TabSwitchMetricService
    public final void LJIIIZ(Fragment fragment, String str, EnumC1593230rYv enumC1593230rYv) {
        C1593260rYy c1593260rYy = this.LIZIZ;
        if (c1593260rYy == null || !LJIILIIL(c1593260rYy, str, fragment)) {
            return;
        }
        c1593260rYy.LIZLLL.put(enumC1593230rYv, new C1593240rYw(enumC1593230rYv, System.currentTimeMillis()));
        WeakReference<Fragment> weakReference = c1593260rYy.LJII;
        if (weakReference == null || weakReference.get() == null) {
            c1593260rYy.LJII = new WeakReference<>(fragment);
        }
    }

    public final void LJIILLIIL(C1593260rYy c1593260rYy, EnumC1593290rZ1 enumC1593290rZ1, boolean z) {
        Fragment fragment;
        View view;
        int i = C1593280rZ0.LIZ[enumC1593290rZ1.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                throw new C1954807lC();
            }
            return;
        }
        WeakReference<Fragment> weakReference = c1593260rYy.LJII;
        if (weakReference != null && (fragment = weakReference.get()) != null && (view = fragment.getView()) != null) {
            ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(view, new ARunnableS13S0310000_24(view, this, c1593260rYy, z, 1));
        }
    }
}
