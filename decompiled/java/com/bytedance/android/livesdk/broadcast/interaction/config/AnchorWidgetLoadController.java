package com.bytedance.android.livesdk.broadcast.interaction.config;

import X.C13LN;
import X.C13LP;
import X.C1697810uHb;
import X.C1CC2;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2252181DDc;
import X.C2252191DDd;
import X.C356901a3;
import X.C780620Ujk;
import X.C780850Uk7;
import X.C786410Ut5;
import X.EnumC780830Uk5;
import Y.ARunnableS104S0200000_35;
import android.os.Looper;
import android.os.SystemClock;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.broadcast.interaction.config.AnchorWidgetLoadController;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorWidgetLoadExpConfig;
import com.bytedance.android.widget.Widget;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes36.dex */
public final class AnchorWidgetLoadController implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final C780620Ujk LL;
    public final RecyclableWidgetManager LLILLJJLI;
    public final AnchorWidgetLoadExpConfig LLILLL;
    public final BPEAHandler LLILZ = new BPEAHandler(Looper.getMainLooper());
    public final long LLILZIL = SystemClock.uptimeMillis();
    public final List<EnumC780830Uk5> LLILZLL;
    public final EnumMap<EnumC780830Uk5, C2252181DDc> LLIZ;
    public EnumC780830Uk5 LLIZLLLIL;
    public EnumC780830Uk5 LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public final C2252191DDd LLJILJIL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    public final void LIZ(C2252181DDc c2252181DDc) {
        if (!this.LLJIJIL && c2252181DDc.LIZIZ.isEmpty() && c2252181DDc.LIZJ.isEmpty()) {
            LIZIZ(c2252181DDc.LIZ, "all_loaded");
        }
    }

    public final long LIZJ(EnumC780830Uk5 enumC780830Uk5) {
        int i = C780850Uk7.LIZ[enumC780830Uk5.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return this.LLILLL.getInterPhaseGapMs();
            }
            return this.LLILLL.getStartupGuardMs();
        }
        return 0L;
    }

    public final void LIZLLL(EnumC780830Uk5 enumC780830Uk5) {
        EnumC780830Uk5 enumC780830Uk52;
        long jUptimeMillis;
        long interPhaseGapMs;
        int i;
        if (enumC780830Uk5 != null && C780850Uk7.LIZ[enumC780830Uk5.ordinal()] != -1) {
            int iIndexOf = this.LLILZLL.indexOf(enumC780830Uk5);
            if (iIndexOf >= 0 && (i = iIndexOf + 1) < this.LLILZLL.size()) {
                enumC780830Uk52 = (EnumC780830Uk5) ListProtector.get(this.LLILZLL, i);
            }
            if (enumC780830Uk5 == null && this.LLJI) {
                this.LLJI = false;
                try {
                    this.LLILLJJLI.removeRecyclableWidgetEventListener(this.LLJILJIL);
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return;
                }
            }
        }
        enumC780830Uk52 = (EnumC780830Uk5) C13LP.LJJJLL(this.LLILZLL);
        if (enumC780830Uk52 != null) {
            C2252181DDc c2252181DDc = this.LLIZ.get(enumC780830Uk52);
            if (c2252181DDc != null && !c2252181DDc.LJIIJ && !c2252181DDc.LJIIJJI) {
                if (enumC780830Uk5 == null) {
                    interPhaseGapMs = this.LLILZIL;
                } else {
                    C2252181DDc c2252181DDc2 = this.LLIZ.get(enumC780830Uk5);
                    if (c2252181DDc2 != null) {
                        jUptimeMillis = c2252181DDc2.LJIILIIL;
                    } else {
                        jUptimeMillis = SystemClock.uptimeMillis();
                    }
                    if (enumC780830Uk52 == EnumC780830Uk5.P1) {
                        interPhaseGapMs = Math.max(jUptimeMillis, this.LLILZIL + this.LLILLL.getStartupGuardMs());
                    } else {
                        interPhaseGapMs = jUptimeMillis + this.LLILLL.getInterPhaseGapMs();
                    }
                }
                long jUptimeMillis2 = interPhaseGapMs - SystemClock.uptimeMillis();
                if (jUptimeMillis2 < 0) {
                    jUptimeMillis2 = 0;
                }
                ARunnableS104S0200000_35 aRunnableS104S0200000_35 = new ARunnableS104S0200000_35(this, enumC780830Uk52, 0);
                c2252181DDc.LJIILJJIL = aRunnableS104S0200000_35;
                C786410Ut5.LJLIIL(jUptimeMillis2, this.LLILZ, aRunnableS104S0200000_35);
                return;
            }
            return;
        }
        if (enumC780830Uk5 == null) {
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
        if (this.LLJI) {
            this.LLJI = false;
            try {
                this.LLILLJJLI.removeRecyclableWidgetEventListener(this.LLJILJIL);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        for (C2252181DDc c2252181DDc : this.LLIZ.values()) {
            Runnable runnable = c2252181DDc.LJIILJJIL;
            if (runnable != null) {
                this.LLILZ.removeCallbacks(runnable);
            }
            Runnable runnable2 = c2252181DDc.LJIILL;
            if (runnable2 != null) {
                this.LLILZ.removeCallbacks(runnable2);
            }
            Runnable runnable3 = c2252181DDc.LJIILLIIL;
            if (runnable3 != null) {
                this.LLILZ.removeCallbacks(runnable3);
            }
            c2252181DDc.LJIILJJIL = null;
            c2252181DDc.LJIILL = null;
            c2252181DDc.LJIILLIIL = null;
        }
        this.LLIZLLLIL = null;
        this.LLJ = null;
    }

    public final void LIZIZ(EnumC780830Uk5 enumC780830Uk5, String str) {
        int i;
        C2252181DDc c2252181DDc = this.LLIZ.get(enumC780830Uk5);
        if (c2252181DDc == null || c2252181DDc.LJIIJJI) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        c2252181DDc.LJIIJJI = true;
        c2252181DDc.LJIILIIL = jUptimeMillis;
        if (this.LLJ == enumC780830Uk5) {
            this.LLJ = null;
        }
        Runnable runnable = c2252181DDc.LJIILL;
        if (runnable != null) {
            this.LLILZ.removeCallbacks(runnable);
        }
        Runnable runnable2 = c2252181DDc.LJIILLIIL;
        if (runnable2 != null) {
            this.LLILZ.removeCallbacks(runnable2);
        }
        c2252181DDc.LJIILL = null;
        c2252181DDc.LJIILLIIL = null;
        long j = jUptimeMillis - c2252181DDc.LJIIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("phase_end priority=");
        sbLIZ.append(enumC780830Uk5);
        sbLIZ.append(" reason=");
        sbLIZ.append(str);
        sbLIZ.append(" costMs=");
        sbLIZ.append(j);
        C20441214yg.LJIIIZ("AnchorWidgetLoad", C2188811AlT.LIZIZ(sbLIZ));
        try {
            int iLJZI = C13LP.LJZI(c2252181DDc.LIZIZ.values());
            int size = c2252181DDc.LIZIZ.size();
            String strLJZL = C13LN.LJZL(512, C13LP.LJJLIIIJ(c2252181DDc.LIZIZ.keySet(), ",", null, null, 0, null, null, 62));
            int iLJZI2 = C13LP.LJZI(c2252181DDc.LIZLLL.values());
            int size2 = c2252181DDc.LIZLLL.size();
            String strLJZL2 = C13LN.LJZL(512, C13LP.LJJLIIIJ(c2252181DDc.LIZLLL.keySet(), ",", null, null, 0, null, null, 62));
            String strLJZL3 = C13LN.LJZL(512, C13LP.LJJLIIIJ(c2252181DDc.LJ.keySet(), ",", null, null, 0, null, null, 62));
            if (Intrinsics.LJFF(str, "timeout")) {
                i = 1;
            } else {
                i = 0;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("phase_priority", c2252181DDc.LIZ.name());
            jSONObject.put("phase_reason", str);
            jSONObject.put("delay_ms", LIZJ(c2252181DDc.LIZ));
            jSONObject.put("planned_widget_count", c2252181DDc.LJII);
            jSONObject.put("planned_widget_type_count", c2252181DDc.LJI);
            jSONObject.put("requested_widget_count", c2252181DDc.LJIIIZ);
            jSONObject.put("requested_widget_type_count", c2252181DDc.LJIIIIZZ);
            if (strLJZL3.length() > 0) {
                jSONObject.put("requested_widgets", strLJZL3);
            }
            jSONObject.put("not_requested_widget_count", iLJZI2);
            jSONObject.put("not_requested_widget_type_count", size2);
            if (strLJZL2.length() > 0) {
                jSONObject.put("not_requested_widgets", strLJZL2);
            }
            jSONObject.put("missing_widget_count", iLJZI);
            jSONObject.put("missing_widget_type_count", size);
            if (strLJZL.length() > 0) {
                jSONObject.put("missing_widgets", strLJZL);
            }
            C1CC2.LJIIJ(i, j, "ttlive_anchor_widget_load_phase", jSONObject);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        this.LL.LIZJ(enumC780830Uk5);
        LIZLLL(enumC780830Uk5);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.1DDd] */
    public AnchorWidgetLoadController(C780620Ujk c780620Ujk, RecyclableWidgetManager recyclableWidgetManager, AnchorWidgetLoadExpConfig anchorWidgetLoadExpConfig) {
        this.LL = c780620Ujk;
        this.LLILLJJLI = recyclableWidgetManager;
        this.LLILLL = anchorWidgetLoadExpConfig;
        List<EnumC780830Uk5> listLJIIJJI = C1697810uHb.LJIIJJI(EnumC780830Uk5.P0, EnumC780830Uk5.P1, EnumC780830Uk5.P2, EnumC780830Uk5.LOCAL);
        this.LLILZLL = listLJIIJJI;
        EnumMap<EnumC780830Uk5, C2252181DDc> enumMap = new EnumMap<>(EnumC780830Uk5.class);
        for (EnumC780830Uk5 enumC780830Uk5 : listLJIIJJI) {
            enumMap.put(enumC780830Uk5, new C2252181DDc(enumC780830Uk5));
        }
        this.LLIZ = enumMap;
        this.LLJILJIL = new RecyclableWidgetEventListener() { // from class: X.1DDd
            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
            public final /* synthetic */ void onPostInit(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget) {
                C1078300eAO.LJ(this, c0ulm, liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
            public final /* synthetic */ void onPostUnload(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget) {
                C1078300eAO.LJI(this, c0ulm, liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
            public final /* synthetic */ void onPreInit(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget) {
                C1078300eAO.LJIIJ(this, c0ulm, liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
            public final /* synthetic */ void onPreLoad(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget) {
                C1078300eAO.LJIIJJI(this, c0ulm, liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
            public final /* synthetic */ void onPreUnload(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget) {
                C1078300eAO.LJIIL(this, c0ulm, liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
            public final void onPostCreate(C0ULM c0ulm, Widget widget) {
                AnchorWidgetLoadController anchorWidgetLoadController;
                EnumC780830Uk5 enumC780830Uk52;
                C2252181DDc c2252181DDc;
                String simpleName;
                Integer num;
                if (!(widget instanceof LiveRecyclableWidget) && (enumC780830Uk52 = (anchorWidgetLoadController = this.LIZ).LLJ) != null && (c2252181DDc = anchorWidgetLoadController.LLIZ.get(enumC780830Uk52)) != null && c2252181DDc.LJIIJ && !c2252181DDc.LJIIJJI && (num = c2252181DDc.LIZIZ.get((simpleName = widget.getClass().getSimpleName()))) != null) {
                    int iIntValue = num.intValue();
                    if (iIntValue <= 1) {
                        c2252181DDc.LIZIZ.remove(simpleName);
                    } else {
                        c2252181DDc.LIZIZ.put(simpleName, Integer.valueOf(iIntValue - 1));
                    }
                    this.LIZ.LIZ(c2252181DDc);
                }
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
            public final void onPostLoad(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget) {
                C2252181DDc c2252181DDc;
                String simpleName;
                Integer num;
                AnchorWidgetLoadController anchorWidgetLoadController = this.LIZ;
                EnumC780830Uk5 enumC780830Uk52 = anchorWidgetLoadController.LLJ;
                if (enumC780830Uk52 != null && (c2252181DDc = anchorWidgetLoadController.LLIZ.get(enumC780830Uk52)) != null && c2252181DDc.LJIIJ && !c2252181DDc.LJIIJJI && (num = c2252181DDc.LIZIZ.get((simpleName = liveRecyclableWidget.getClass().getSimpleName()))) != null) {
                    int iIntValue = num.intValue();
                    if (iIntValue <= 1) {
                        c2252181DDc.LIZIZ.remove(simpleName);
                    } else {
                        c2252181DDc.LIZIZ.put(simpleName, Integer.valueOf(iIntValue - 1));
                    }
                    this.LIZ.LIZ(c2252181DDc);
                }
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
            public final /* bridge */ /* synthetic */ void onHide(C0ULM c0ulm, Widget widget) {
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
            public final /* bridge */ /* synthetic */ void onPostCreateView(C0ULM c0ulm, Widget widget) {
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
            public final /* bridge */ /* synthetic */ void onPostDestroy(C0ULM c0ulm, Widget widget) {
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
            public final /* bridge */ /* synthetic */ void onPreCreate(C0ULM c0ulm, Widget widget) {
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
            public final /* bridge */ /* synthetic */ void onPreCreateView(C0ULM c0ulm, Widget widget) {
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
            public final /* bridge */ /* synthetic */ void onPreDestroy(C0ULM c0ulm, Widget widget) {
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
            public final /* bridge */ /* synthetic */ void onShow(C0ULM c0ulm, Widget widget) {
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
            public final void onWidgetPreRequestLoading(C0ULM c0ulm, Widget widget, boolean z) {
                C2252181DDc c2252181DDc;
                int iIntValue;
                AnchorWidgetLoadController anchorWidgetLoadController = this.LIZ;
                EnumC780830Uk5 enumC780830Uk52 = anchorWidgetLoadController.LLIZLLLIL;
                if (enumC780830Uk52 == null || (c2252181DDc = anchorWidgetLoadController.LLIZ.get(enumC780830Uk52)) == null || !c2252181DDc.LJIIJ || c2252181DDc.LJIIJJI || !widget.shouldAttach()) {
                    return;
                }
                String simpleName = widget.getClass().getSimpleName();
                Map<String, Integer> map = c2252181DDc.LIZJ;
                Integer num = map.get(simpleName);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                map.put(simpleName, Integer.valueOf(iIntValue + 1));
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
            public final void onWidgetRequestLoading(C0ULM c0ulm, Widget widget, boolean z) {
                C2252181DDc c2252181DDc;
                String simpleName;
                Integer num;
                int iIntValue;
                AnchorWidgetLoadController anchorWidgetLoadController = this.LIZ;
                EnumC780830Uk5 enumC780830Uk52 = anchorWidgetLoadController.LLJ;
                if (enumC780830Uk52 != null && (c2252181DDc = anchorWidgetLoadController.LLIZ.get(enumC780830Uk52)) != null && c2252181DDc.LJIIJ && !c2252181DDc.LJIIJJI && (num = c2252181DDc.LIZJ.get((simpleName = widget.getClass().getSimpleName()))) != null) {
                    int iIntValue2 = num.intValue();
                    if (iIntValue2 <= 1) {
                        c2252181DDc.LIZJ.remove(simpleName);
                    } else {
                        c2252181DDc.LIZJ.put(simpleName, Integer.valueOf(iIntValue2 - 1));
                    }
                    Map<String, Integer> map = c2252181DDc.LIZIZ;
                    Integer num2 = map.get(simpleName);
                    int iIntValue3 = 0;
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    map.put(simpleName, Integer.valueOf(iIntValue + 1));
                    Map<String, Integer> map2 = c2252181DDc.LJ;
                    Integer num3 = map2.get(simpleName);
                    if (num3 != null) {
                        iIntValue3 = num3.intValue();
                    }
                    map2.put(simpleName, Integer.valueOf(iIntValue3 + 1));
                    c2252181DDc.LJIIIIZZ = c2252181DDc.LJ.size();
                    c2252181DDc.LJIIIZ++;
                }
            }
        };
    }
}
