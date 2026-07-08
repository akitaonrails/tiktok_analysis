package com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.ams;

import X.C01GW;
import X.C0N21;
import X.C0N8C;
import X.C0N8E;
import X.C0N8R;
import X.C0N8S;
import X.C0NJC;
import X.C1010080cOM;
import X.C13DA;
import X.C13LP;
import X.C2023807wK;
import X.C2097608Jq;
import X.C452501pT;
import X.C584230Mvl;
import X.C588970N8d;
import X.C588980N8e;
import X.C589080N8o;
import X.C622550ObN;
import X.C622570ObP;
import X.InterfaceC2217461Bqa;
import X.InterfaceC2258651Dap;
import X.InterfaceC2258681Das;
import X.InterfaceC589010N8h;
import X.InterfaceC659840PuQ;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.commercialize.ams.context.MeasurementContext;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class SearchAppMeasurementModule implements InterfaceC659840PuQ, LifecycleEventObserver {
    public static final C0N21 LLIZ = new C0N21();
    public final InterfaceC589010N8h LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 47));
    public final C588980N8e LLILLL = new C588980N8e(this);
    public final C588970N8d LLILZ = new C588970N8d(this);
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 43));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 46));

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
    }

    @Override // X.InterfaceC659840PuQ
    public final void yB() {
    }

    public final Fragment LIZ() {
        return (Fragment) this.LLILLJJLI.getValue();
    }

    @Override // X.InterfaceC659840PuQ
    public final void onViewDetachedFromWindow() {
        C0NJC c0njc = this.LLILLL.LIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C0N8R.LIZIZ;
        ((C0N8S) c0njc.LLILLJJLI).LJIILIIL(this.LL.LJIILIIL(), C2097608Jq.LJ());
    }

    @Override // X.InterfaceC659840PuQ
    public final void onViewAttachedToWindow() {
        Map mapBuild;
        Map mapLJ = C2097608Jq.LJ();
        C622570ObP c622570ObPLJIILJJIL = this.LL.LJIILJJIL();
        if (c622570ObPLJIILJJIL == null) {
            mapBuild = C2097608Jq.LJ();
        } else {
            String strLIZ = c622570ObPLJIILJJIL.LIZ();
            String strLJJLIIIJ = C13LP.LJJLIIIJ(c622570ObPLJIILJJIL.LJIIIIZZ, ",", null, null, 0, null, null, 62);
            String strLJJLIIIJ2 = c622570ObPLJIILJJIL.LJIILIIL ? C13LP.LJJLIIIJ(c622570ObPLJIILJJIL.LJIIJJI, ",", null, null, 0, null, null, 62) : C13LP.LJJLIIIJ(c622570ObPLJIILJJIL.LJIIIZ, ",", null, null, 0, null, null, 62);
            String strLJJLIIIJ3 = c622570ObPLJIILJJIL.LJIILIIL ? C13LP.LJJLIIIJ(c622570ObPLJIILJJIL.LJIIL, ",", null, null, 0, null, null, 62) : C13LP.LJJLIIIJ(c622570ObPLJIILJJIL.LJIIJ, ",", null, null, 0, null, null, 62);
            boolean z = !c622570ObPLJIILJJIL.LJIILIIL;
            C622550ObN.LIZ(c622570ObPLJIILJJIL, new Pair(strLIZ, strLJJLIIIJ2));
            C13DA c13da = new C13DA();
            C1010080cOM.LIZ.getClass();
            c13da.put(C1010080cOM.LIZIZ.LIZ, strLIZ);
            c13da.put(C1010080cOM.LIZJ.LIZ, strLJJLIIIJ);
            c13da.put(C1010080cOM.LIZLLL.LIZ, strLJJLIIIJ2);
            c13da.put(C1010080cOM.LJ.LIZ, strLJJLIIIJ3);
            c13da.put(C1010080cOM.LJII.LIZ, z ? "1" : CardStruct.IStatusCode.DEFAULT);
            Pair pairLIZIZ = C622550ObN.LIZIZ(c622570ObPLJIILJJIL);
            if (pairLIZIZ != null) {
                Object first = pairLIZIZ.getFirst();
                Object second = pairLIZIZ.getSecond();
                c13da.put(C1010080cOM.LJFF.LIZ, first);
                c13da.put(C1010080cOM.LJI.LIZ, second);
            }
            mapBuild = c13da.build();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapLJ);
        if (mapBuild != null && (!mapBuild.isEmpty())) {
            for (Map.Entry entry : mapBuild.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        C0NJC c0njc = this.LLILLL.LIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C0N8R.LIZIZ;
        ((C0N8S) c0njc.LLILLJJLI).LIZLLL(this.LL.LJIILIIL(), linkedHashMap);
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ InterfaceC589010N8h Mh() {
        return this.LL;
    }

    public SearchAppMeasurementModule(InterfaceC589010N8h interfaceC589010N8h) {
        Lifecycle lifecycle;
        this.LL = interfaceC589010N8h;
        Fragment fragmentLIZ = LIZ();
        if (fragmentLIZ != null && (lifecycle = fragmentLIZ.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
    }

    @Override // X.InterfaceC659840PuQ
    public final void F4(String str) {
        String aid;
        Aweme awemeLJIILIIL = this.LL.LJIILIIL();
        if (awemeLJIILIIL != null) {
            aid = awemeLJIILIIL.getAid();
        } else {
            aid = null;
        }
        if (!Intrinsics.LJFF(aid, str)) {
            return;
        }
        C0NJC c0njc = this.LLILZ.LIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C0N8C.LIZIZ;
        ((C0N8E) c0njc.LLILLJJLI).F4(str);
    }

    @Override // X.InterfaceC659840PuQ
    public final void LJJIJIIJI(String str) {
        String aid;
        Aweme awemeLJIILIIL = this.LL.LJIILIIL();
        if (awemeLJIILIIL != null) {
            aid = awemeLJIILIIL.getAid();
        } else {
            aid = null;
        }
        if (!Intrinsics.LJFF(aid, str)) {
            return;
        }
        C0NJC c0njc = this.LLILZ.LIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C0N8C.LIZIZ;
        ((C0N8E) c0njc.LLILLJJLI).LIZIZ(awemeLJIILIIL, C2097608Jq.LJ());
    }

    @Override // X.InterfaceC659840PuQ
    public final void aw(String str) {
        String aid;
        Aweme awemeLJIILIIL = this.LL.LJIILIIL();
        if (awemeLJIILIIL != null) {
            aid = awemeLJIILIIL.getAid();
        } else {
            aid = null;
        }
        if (!Intrinsics.LJFF(aid, str)) {
            return;
        }
        C0NJC c0njc = this.LLILZ.LIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C0N8C.LIZIZ;
        ((C0N8E) c0njc.LLILLJJLI).LIZ(awemeLJIILIIL, C2097608Jq.LJ());
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Lifecycle lifecycle;
        int i = C2023807wK.LIZ[event.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C589080N8o.LJ(this, "", new AwS553S0100000_9(this, 45));
                MeasurementContext.LIZ.getClass();
                C584230Mvl.LIZ().LJIIIIZZ(((InterfaceC2258651Dap) this.LLILZIL.getValue()).LIZJ());
                C584230Mvl.LIZ().LJI(((InterfaceC2258681Das) this.LLILZLL.getValue()).LIZJ());
                Fragment fragmentLIZ = LIZ();
                if (fragmentLIZ != null && (lifecycle = fragmentLIZ.getLifecycle()) != null) {
                    lifecycle.removeObserver(this);
                    return;
                }
                return;
            }
            return;
        }
        C589080N8o.LJ(this, "", new AwS553S0100000_9(this, 44));
        MeasurementContext.LIZ.getClass();
        C584230Mvl.LIZ().LIZLLL((InterfaceC2258651Dap) this.LLILZIL.getValue());
        C584230Mvl.LIZ().LJIIJJI((InterfaceC2258681Das) this.LLILZLL.getValue());
    }
}
