package com.ss.android.ugc.aweme.ecommerce.core.module;

import X.C098200Yq;
import X.C1741890vQh;
import X.C1758250vr5;
import X.C189200o6;
import X.C2187701Ajg;
import X.C786410Ut5;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.core.module.ModuleManager;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes36.dex */
public final class ModuleManager {
    public static long LJJJIL;
    public static long LJJJJ;
    public static long LJJJJI;
    public static long LJJJJIZL;
    public static long LJJJJJ;
    public static long LJJJJJL;
    public static long LJJJJL;
    public static long LJJJJLI;
    public static long LJJJJLL;
    public static long LJJJJZ;
    public static long LJJJJZI;
    public static long LJJJLIIL;
    public static final /* synthetic */ int LJJJLL = 0;
    public final Map<String, Long> LIZ;
    public final Map<String, Long> LIZIZ;
    public final Map<String, Long> LIZJ;
    public final Map<String, Long> LIZLLL;
    public final Map<String, Long> LJ;
    public final Map<String, Long> LJFF;
    public final Map<String, Long> LJI;
    public int LJII;
    public final Map<String, Integer> LJIIIIZZ;
    public final Map<String, Integer> LJIIIZ;
    public final Map<String, Integer> LJIIJ;
    public final Map<String, Long> LJIIJJI;
    public final Map<String, Long> LJIIL;
    public final Map<String, Long> LJIILIIL;
    public final Map<String, String> LJIILJJIL;
    public final Map<String, String> LJIILL;
    public int LJIILLIIL;
    public LifecycleOwner LJIIZILJ;
    public long LJIJ;
    public long LJIJI;
    public boolean LJIJJ;
    public long LJIJJLI;
    public long LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public boolean LJJIFFI;
    public int LJJII;
    public final int LJJIII;
    public String LJJIIJ;
    public String LJJIIJZLJL;
    public String LJJIIZ;
    public String LJJIIZI;
    public String LJJIJ;
    public String LJJIJIIJI;
    public HashMap<String, Object> LJJIJIIJIL;
    public int LJJIJIL;
    public String LJJIJL;
    public String LJJIJLIJ;
    public long LJJIL;
    public long LJJIZ;
    public HashMap<String, Object> LJJJ;
    public final ModuleManager$daObserver$1 LJJJI;

    public final boolean LIZIZ() {
        return this.LIZIZ.containsKey("address_module_time") || this.LIZIZ.containsKey("order_module_time") || this.LIZIZ.containsKey("payment_module_time");
    }

    public final boolean LIZLLL() {
        return this.LIZ.containsKey("api_done_normal") || this.LIZ.containsKey("api_chunk_first");
    }

    public ModuleManager() {
        new LinkedHashMap();
        this.LIZ = new LinkedHashMap();
        this.LIZIZ = new LinkedHashMap();
        this.LIZJ = new LinkedHashMap();
        this.LIZLLL = new LinkedHashMap();
        this.LJ = new LinkedHashMap();
        this.LJFF = new LinkedHashMap();
        this.LJI = new LinkedHashMap();
        this.LJIIIIZZ = new LinkedHashMap();
        this.LJIIIZ = new LinkedHashMap();
        this.LJIIJ = new LinkedHashMap();
        this.LJIIJJI = new LinkedHashMap();
        this.LJIIL = new LinkedHashMap();
        this.LJIILIIL = new LinkedHashMap();
        this.LJIILJJIL = new LinkedHashMap();
        this.LJIILL = new LinkedHashMap();
        this.LJJIII = 3;
        this.LJJIIJ = "";
        this.LJJIIJZLJL = "";
        this.LJJIIZ = "";
        this.LJJIJIIJI = "normal_checkout";
        this.LJJJI = new ModuleManager$daObserver$1(this);
    }

    public final void LIZJ(final View view) {
        final int i = 0;
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener(this, view, i) { // from class: X.1G0n
            public final int $t;
            public Object l0;
            public Object l1;

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                switch (this.$t) {
                    case 0:
                        return onPreDraw$0(this);
                    case 1:
                        return onPreDraw$1(this);
                    default:
                        return false;
                }
            }

            public static final boolean onPreDraw$0(ViewTreeObserverOnPreDrawListenerC2325351G0n viewTreeObserverOnPreDrawListenerC2325351G0n) {
                ModuleManager moduleManager = (ModuleManager) viewTreeObserverOnPreDrawListenerC2325351G0n.l0;
                if (moduleManager.LJJ && moduleManager.LJIJJLI == 0) {
                    moduleManager.LJIJJLI = System.currentTimeMillis();
                    C786410Ut5.D3(((View) viewTreeObserverOnPreDrawListenerC2325351G0n.l1).getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC2325351G0n);
                    return true;
                }
                return true;
            }

            public static final boolean onPreDraw$1(ViewTreeObserverOnPreDrawListenerC2325351G0n viewTreeObserverOnPreDrawListenerC2325351G0n) {
                if (((ModuleManager) viewTreeObserverOnPreDrawListenerC2325351G0n.l0).LIZLLL()) {
                    ModuleManager moduleManager = (ModuleManager) viewTreeObserverOnPreDrawListenerC2325351G0n.l0;
                    if (moduleManager.LJIL == 0) {
                        moduleManager.LJIL = System.currentTimeMillis();
                        C786410Ut5.D3(((View) viewTreeObserverOnPreDrawListenerC2325351G0n.l1).getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC2325351G0n);
                        return true;
                    }
                    return true;
                }
                return true;
            }

            {
                this.$t = i;
                this.l0 = this;
                this.l1 = view;
            }
        };
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.1DhP
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ModuleManager moduleManager = this.LL;
                if (moduleManager.LJJ && moduleManager.LJIJJLI == 0) {
                    moduleManager.LJIJJLI = System.currentTimeMillis();
                    C786410Ut5.C3(view.getViewTreeObserver(), this);
                }
            }
        };
        if (C1758250vr5.LIZ().drawListener) {
            C786410Ut5.y3(view.getViewTreeObserver(), onPreDrawListener);
        } else {
            C786410Ut5.x3(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
        final int i2 = 1;
        C786410Ut5.y3(view.getViewTreeObserver(), new ViewTreeObserver.OnPreDrawListener(this, view, i2) { // from class: X.1G0n
            public final int $t;
            public Object l0;
            public Object l1;

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                switch (this.$t) {
                    case 0:
                        return onPreDraw$0(this);
                    case 1:
                        return onPreDraw$1(this);
                    default:
                        return false;
                }
            }

            public static final boolean onPreDraw$0(ViewTreeObserverOnPreDrawListenerC2325351G0n viewTreeObserverOnPreDrawListenerC2325351G0n) {
                ModuleManager moduleManager = (ModuleManager) viewTreeObserverOnPreDrawListenerC2325351G0n.l0;
                if (moduleManager.LJJ && moduleManager.LJIJJLI == 0) {
                    moduleManager.LJIJJLI = System.currentTimeMillis();
                    C786410Ut5.D3(((View) viewTreeObserverOnPreDrawListenerC2325351G0n.l1).getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC2325351G0n);
                    return true;
                }
                return true;
            }

            public static final boolean onPreDraw$1(ViewTreeObserverOnPreDrawListenerC2325351G0n viewTreeObserverOnPreDrawListenerC2325351G0n) {
                if (((ModuleManager) viewTreeObserverOnPreDrawListenerC2325351G0n.l0).LIZLLL()) {
                    ModuleManager moduleManager = (ModuleManager) viewTreeObserverOnPreDrawListenerC2325351G0n.l0;
                    if (moduleManager.LJIL == 0) {
                        moduleManager.LJIL = System.currentTimeMillis();
                        C786410Ut5.D3(((View) viewTreeObserverOnPreDrawListenerC2325351G0n.l1).getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC2325351G0n);
                        return true;
                    }
                    return true;
                }
                return true;
            }

            {
                this.$t = i2;
                this.l0 = this;
                this.l1 = view;
            }
        });
    }

    public final void LJ(boolean z) {
        LJIIL("finish_screen_ui_done", z);
        LJI(this, "t_render_end", null, z, 2);
        C786410Ut5.v2().postFrameCallback(new Choreographer.FrameCallback() { // from class: X.1DUL
            public int LL;
            public final /* synthetic */ boolean LLILLL = true;

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                int i = this.LL + 1;
                this.LL = i;
                ModuleManager moduleManager = this.LLILLJJLI;
                if (i >= moduleManager.LJJIII) {
                    this.LL = 0;
                    ModuleManager.LJI(moduleManager, "t_interactive", null, this.LLILLL, 2);
                } else {
                    C786410Ut5.v2().postFrameCallback(this);
                }
            }
        });
    }

    public final void LJIIIIZZ(Map<String, ? extends Object> map) {
        String str;
        String str2;
        String str3;
        String str4;
        Object obj = map.get("btm");
        if (!(obj instanceof String) || (str = (String) obj) == null) {
            str = "a2270.b2768";
        }
        this.LJJIIJZLJL = str;
        Object obj2 = map.get("btm_pre");
        if (obj2 instanceof String) {
            str2 = (String) obj2;
        } else {
            str2 = null;
        }
        String str5 = "";
        if (str2 == null) {
            str2 = "";
        }
        this.LJJIIZ = str2;
        Object obj3 = map.get("btm_show_id");
        if (!(obj3 instanceof String) || (str3 = (String) obj3) == null) {
            str3 = "";
        }
        this.LJJIIZI = str3;
        Object obj4 = map.get("btm_pre_show_id");
        if ((obj4 instanceof String) && (str4 = (String) obj4) != null) {
            str5 = str4;
        }
        this.LJJIJ = str5;
    }

    public final void LJIIIZ(LifecycleOwner lifecycleOwner) {
        Lifecycle lifecycle;
        Lifecycle lifecycle2;
        LifecycleOwner lifecycleOwner2 = this.LJIIZILJ;
        if (lifecycleOwner2 != null && (lifecycle2 = lifecycleOwner2.getLifecycle()) != null) {
            lifecycle2.removeObserver(this.LJJJI);
        }
        this.LJIIZILJ = lifecycleOwner;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this.LJJJI);
        }
    }

    public final void LIZ(final String str, final View view) {
        if (!this.LJJIFFI && !this.LJIILJJIL.containsKey(str)) {
            this.LJIILJJIL.put(str, str);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null) {
                ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: X.1AkE
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public final boolean onPreDraw() {
                        Map<String, String> map = this.LL.LJIILL;
                        String str2 = str;
                        map.put(str2, str2);
                        ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
                        if (viewTreeObserver2 != null) {
                            viewTreeObserver2.removeOnPreDrawListener(this);
                            C2187701Ajg.LIZIZ(viewTreeObserver2, this, ViewTreeObserver.OnPreDrawListener.class);
                        }
                        ModuleManager moduleManager = this.LL;
                        if (!moduleManager.LJJIFFI && !moduleManager.LJJI && moduleManager.LJIILL.size() < moduleManager.LJIILJJIL.size()) {
                            this.LL.LJ(true);
                        }
                        return true;
                    }
                };
                viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
                C2187701Ajg.LIZ(viewTreeObserver, onPreDrawListener, ViewTreeObserver.OnPreDrawListener.class);
            }
        }
    }

    public final void LJFF(long j, String str) {
        Map<String, Long> map;
        Map<String, Integer> map2;
        int iIntValue;
        long jLongValue = 0;
        if (j <= 0) {
            return;
        }
        int i = this.LJII;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                map = this.LJIILIIL;
                map2 = this.LJIIJ;
            } else {
                map = this.LJIIL;
                map2 = this.LJIIIZ;
            }
        } else {
            map = this.LJIIJJI;
            map2 = this.LJIIIIZZ;
        }
        if (map.containsKey(str)) {
            Long l = map.get(str);
            if (l != null) {
                jLongValue = l.longValue();
            }
            map.put(str, Long.valueOf(jLongValue + j));
            Integer num = map2.get(str);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            map2.put(str, Integer.valueOf(iIntValue + 1));
            return;
        }
        map.put(str, Long.valueOf(j));
        map2.put(str, 1);
    }

    public final void LJIIJ(long j, String str) {
        Map<String, Long> map;
        long jLongValue;
        if (!this.LJJIFFI && !this.LJJI) {
            try {
                if (!Intrinsics.LJFF("bottom_module", str)) {
                    LJFF(j, str);
                }
                if (LIZLLL()) {
                    map = this.LJFF;
                } else {
                    map = this.LJ;
                }
                if (map.containsKey(str)) {
                    Long l = map.get(str);
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    map.put(str, Long.valueOf(j + jLongValue));
                } else {
                    map.put(str, Long.valueOf(j));
                }
                if (LIZLLL()) {
                    LJI(this, "t_cell_bind_finish", null, true, 2);
                } else {
                    LJI(this, "t_cell_preload_bind_finish", null, true, 2);
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public final void LJIIJJI(long j, String str) {
        Map<String, Long> map;
        if (!this.LJJIFFI && !this.LJJI) {
            try {
                if (LIZLLL()) {
                    map = this.LIZLLL;
                } else {
                    map = this.LIZJ;
                }
                long jLongValue = 0;
                if (j > 0) {
                    if (map.containsKey(str)) {
                        Long l = map.get(str);
                        if (l != null) {
                            jLongValue = l.longValue();
                        }
                        map.put(str, Long.valueOf(j + jLongValue));
                    } else {
                        map.put(str, Long.valueOf(j));
                    }
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public final void LJIIL(String str, boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z) {
            this.LIZ.put(str, Long.valueOf(jCurrentTimeMillis));
        } else {
            if (this.LIZ.containsKey(str)) {
                return;
            }
            this.LIZ.put(str, Long.valueOf(jCurrentTimeMillis));
        }
    }

    public final void LJII(boolean z, BillInfoData billInfoData, boolean z2) {
        HashMap<String, Object> mapLJIIJ;
        this.LJJIFFI = !z;
        if (!z) {
            if (LJJJJZI == 0) {
                LJJJJZI = LJJJJZ;
                return;
            }
            return;
        }
        if (!z) {
            return;
        }
        String str = billInfoData.costDaInfo;
        if (str != null) {
            mapLJIIJ = C1741890vQh.LJIIJ(str);
        } else {
            mapLJIIJ = null;
        }
        this.LJJIJIIJIL = mapLJIIJ;
        Boolean bool = billInfoData.LIZ;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2)) {
            this.LJIJJ = true;
            if (Intrinsics.LJFF(billInfoData.beginRenderChunk, bool2)) {
                LJIIL("api_chunk_first", false);
                LJI(this, "t_module_data_end", null, false, 6);
                LJI(this, "t_main_fetch_end", null, false, 6);
                LJI(this, "t_render_start", null, false, 6);
            }
            if (!Intrinsics.LJFF(billInfoData.lastChunk, bool2)) {
                return;
            }
            LJIIL("api_chunk_last", false);
            LJIIL("render_start_chunk", false);
            LJI(this, "t_last_chunk_module_data_end", null, false, 6);
            LJI(this, "t_last_chunk_render_start", null, false, 6);
            return;
        }
        this.LJIJJ = false;
        LJIIL("api_done_normal", true);
        LJIIL("render_start_normal", true);
        if (z2) {
            LJI(this, "t_full_preload_module_data_end", null, true, 2);
        } else {
            LJI(this, "t_module_data_end", null, true, 2);
        }
        LJI(this, "t_main_fetch_end", null, true, 2);
        LJI(this, "t_render_start", null, true, 2);
    }

    public static void LJI(ModuleManager moduleManager, String str, Long l, boolean z, int i) {
        long jCurrentTimeMillis;
        if ((i & 2) != 0) {
            l = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        moduleManager.getClass();
        if (l != null) {
            jCurrentTimeMillis = l.longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        if (z) {
            moduleManager.LJI.put(str, Long.valueOf(jCurrentTimeMillis));
            if ("t_interactive".equals(str)) {
                moduleManager.LJII = 0;
                return;
            }
            return;
        }
        if (moduleManager.LJI.containsKey(str)) {
            return;
        }
        moduleManager.LJI.put(str, Long.valueOf(jCurrentTimeMillis));
        if (!"t_interactive".equals(str)) {
            return;
        }
        moduleManager.LJII = 0;
    }
}
