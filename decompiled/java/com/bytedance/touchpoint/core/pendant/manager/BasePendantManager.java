package com.bytedance.touchpoint.core.pendant.manager;

import X.AbstractC1895130zPr;
import X.AbstractC1896090zRP;
import X.C01GW;
import X.C0J3E;
import X.C1220000hqw;
import X.C13LE;
import X.C1619720sFe;
import X.C1894320zOY;
import X.C1894690zP9;
import X.C1896930zSl;
import X.C1896940zSm;
import X.C1896950zSn;
import X.C1899570zX1;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736950SvV;
import X.InterfaceC1896860zSe;
import X.InterfaceC1896920zSk;
import X.InterfaceC1899740zXI;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.touchpoint.api.viewmodel.BaseTouchPointDataVM;
import com.bytedance.touchpoint.data.parser.notify.PendantViewModel;
import com.bytedance.touchpoint.ui.pendant.SpecActWidget;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public abstract class BasePendantManager extends AbstractC1895130zPr implements InterfaceC1899740zXI, GenericLifecycleObserver {
    public C1894690zP9 LL;
    public final Set<String> LLILLJJLI = new LinkedHashSet();
    public final Map<String, Integer> LLILLL = new LinkedHashMap();
    public final Map<String, Integer> LLILZ = new LinkedHashMap();
    public ViewGroup LLILZIL;
    public LifecycleOwner LLILZLL;
    public final C736950SvV LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public String LLJI;

    public abstract void LJIIZILJ();

    public abstract void LJIJ();

    public abstract SpecActWidget LJIJI();

    public abstract C1899570zX1 LJIJJ();

    public boolean LJIL() {
        return false;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestory();
        }
    }

    public static String LJIILLIIL() {
        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
        if (abstractC1896090zRP != null) {
            return abstractC1896090zRP.LJIJI();
        }
        return null;
    }

    @Override // X.InterfaceC1899740zXI
    public final void LIZJ() {
        C1894320zOY c1894320zOY = C1894320zOY.LIZ;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("block_reason", "resource_load_fail"));
        c1894320zOY.getClass();
        C1894320zOY.LJIILIIL(1, mapLJIIJ);
    }

    @Override // X.AbstractC1895130zPr
    public final BaseTouchPointDataVM LJIIIZ() {
        return (BaseTouchPointDataVM) this.LLIZ.getValue();
    }

    public final InterfaceC1896860zSe LJIIJJI() {
        return (InterfaceC1896860zSe) this.LLIZLLLIL.getValue();
    }

    public final Context LJIIL() {
        Object obj = this.LLILZLL;
        if (obj instanceof Activity) {
            return (Context) obj;
        }
        if (obj instanceof Fragment) {
            return ((Fragment) obj).getContext();
        }
        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
        if (abstractC1896090zRP != null) {
            return abstractC1896090zRP.LJIIJJI();
        }
        return null;
    }

    public final boolean LJIJJLI() {
        C1894690zP9 c1894690zP9 = this.LL;
        return (c1894690zP9 == null || c1894690zP9.LIZ == null) ? false : true;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestory() {
        Lifecycle lifecycle;
        LifecycleOwner lifecycleOwner = this.LLILZLL;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        this.LLILZLL = null;
        LJJI();
        this.LLILZIL = null;
        this.LL = null;
    }

    public BasePendantManager() {
        LifecycleOwner lifecycleOwner = C0J3E.LL;
        this.LLIZ = new C736950SvV(C13LE.LIZ(PendantViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), new C1896950zSn(), null, null, null);
        this.LLIZLLLIL = C452501pT.LIZIZ(new C1896930zSl(this));
        this.LLJ = C452501pT.LIZIZ(new C1896940zSm(this));
        this.LLJI = "For You";
    }

    @Override // X.InterfaceC1899740zXI
    public final void LJFF() {
        if (LJIIJJI().isBound()) {
            return;
        }
        LJJ();
    }

    public final int LJIILIIL() {
        Integer num;
        String strLJIILLIIL = LJIILLIIL();
        if (strLJIILLIIL == null || (num = (Integer) ((LinkedHashMap) this.LLILLL).get(strLJIILLIIL)) == null) {
            return 0;
        }
        return num.intValue();
    }

    public final int LJIILJJIL() {
        Integer num;
        String strLJIILLIIL = LJIILLIIL();
        if (strLJIILLIIL == null || (num = (Integer) ((LinkedHashMap) this.LLILZ).get(strLJIILLIIL)) == null) {
            return 0;
        }
        return num.intValue();
    }

    public final boolean LJIILL() {
        String strLJIILLIIL = LJIILLIIL();
        if (strLJIILLIIL == null) {
            return true;
        }
        boolean zContains = this.LLILLJJLI.contains(strLJIILLIIL);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getTabIsFirstInvoke, tab: ");
        sbLIZ.append(strLJIILLIIL);
        sbLIZ.append(", isFirstInvoke: ");
        sbLIZ.append(!zContains);
        C2188811AlT.LIZIZ(sbLIZ);
        return !zContains;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        if (r1.LIZ(r0) == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJ() {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.touchpoint.core.pendant.manager.BasePendantManager.LJJ():void");
    }

    public final void LJJI() {
        if (LJIIJJI().isBound()) {
            String strLJIILLIIL = LJIILLIIL();
            if (strLJIILLIIL != null) {
                this.LLILZ.remove(strLJIILLIIL);
            }
            String strLJIILLIIL2 = LJIILLIIL();
            if (strLJIILLIIL2 != null) {
                this.LLILLL.remove(strLJIILLIIL2);
            }
            LJIIJJI().clear();
            ((InterfaceC1896920zSk) this.LLJ.getValue()).LIZJ();
        }
    }

    public final void LJIIJ(ViewGroup viewGroup, LifecycleOwner lifecycleOwner) {
        Lifecycle lifecycle;
        Lifecycle lifecycle2;
        LifecycleOwner lifecycleOwner2 = this.LLILZLL;
        if (lifecycleOwner2 != null && this.LLILZIL != null) {
            if (Intrinsics.LJFF(lifecycleOwner2, lifecycleOwner)) {
                return;
            }
            LifecycleOwner lifecycleOwner3 = this.LLILZLL;
            if (lifecycleOwner3 != null && (lifecycle2 = lifecycleOwner3.getLifecycle()) != null) {
                lifecycle2.removeObserver(this);
            }
            this.LLILZLL = null;
            LJJI();
            this.LLILZIL = null;
        }
        this.LLILZLL = lifecycleOwner;
        this.LLILZIL = viewGroup;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
        LJJ();
    }
}
