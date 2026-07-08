package com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.sparklite;

import X.AbstractC1773210wFD;
import X.AbstractC1773460wFc;
import X.C01GW;
import X.C1772800wEY;
import X.C1772820wEa;
import X.C1773330wFP;
import X.C1773610wFr;
import X.C1773790wG9;
import X.C1773800wGA;
import X.C2188811AlT;
import X.C356901a3;
import X.C452501pT;
import X.C599820Nfo;
import X.C786410Ut5;
import X.C948503nH;
import X.InterfaceC1772610wEF;
import X.InterfaceC1773310wFN;
import X.InterfaceC1773570wFn;
import Y.ARunnableS95S0200000_26;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.jvm.internal.AwS427S0200000_26;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class ECLynxCardViewOptHolder extends AbstractC1773460wFc<C1773330wFP> implements InterfaceC1772610wEF {
    public final LifecycleOwner LLJJIJI;
    public final C1773610wFr<C1773330wFP> LLJJIJIIJIL;
    public final C1773800wGA LLJJIJIL;
    public InterfaceC1773570wFn LLJJJ;
    public boolean LLJJJIL;
    public String LLJJJJ;
    public String LLJJJJJIL;
    public final C01GW LLJJJJLIIL;

    @Override // X.AbstractC1773460wFc
    public final int S5() {
        return 5;
    }

    @Override // X.AbstractC1773460wFc
    public final void L5() {
        C1772800wEY c1772800wEYLIZIZ;
        C1772820wEa c1772820wEa;
        InterfaceC1773570wFn interfaceC1773570wFn = this.LLJJJ;
        if (interfaceC1773570wFn == null || (c1772800wEYLIZIZ = interfaceC1773570wFn.LIZIZ()) == null || (c1772820wEa = c1772800wEYLIZIZ.LJIIJJI) == null) {
            return;
        }
        c1772820wEa.LJIJ = System.currentTimeMillis();
    }

    @Override // X.AbstractC1773460wFc
    public final void N5() {
        C1772800wEY c1772800wEYLIZIZ;
        C1772820wEa c1772820wEa;
        InterfaceC1773570wFn interfaceC1773570wFn = this.LLJJJ;
        if (interfaceC1773570wFn == null || (c1772800wEYLIZIZ = interfaceC1773570wFn.LIZIZ()) == null || (c1772820wEa = c1772800wEYLIZIZ.LJIIJJI) == null) {
            return;
        }
        c1772820wEa.LJIIZILJ = System.currentTimeMillis();
    }

    @Override // X.AbstractC1773460wFc
    public final boolean W5() {
        View view = this.itemView;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        return viewGroup != null && viewGroup.getChildCount() == 0;
    }

    @Override // X.AbstractC1773460wFc
    public final void a6() {
        InterfaceC1773570wFn interfaceC1773570wFn = this.LLJJJ;
        if (interfaceC1773570wFn == null) {
            return;
        }
        this.LLJJJ = null;
        C786410Ut5.LJJLIIIJL(this.LLJJIJIIJIL, interfaceC1773570wFn.getView());
        Integer itemType = interfaceC1773570wFn.getItemType();
        if (itemType != null) {
            int iIntValue = itemType.intValue();
            D d = this.LLILLL;
            if (d == 0 || d.LIZLLL != 1) {
                C1773800wGA c1773800wGA = this.LLJJIJIL;
                if (c1773800wGA == null || !interfaceC1773570wFn.LJ()) {
                    return;
                }
                Queue<InterfaceC1773570wFn> linkedList = c1773800wGA.LIZ.get(iIntValue);
                if (linkedList == null) {
                    linkedList = new LinkedList<>();
                    c1773800wGA.LIZ.put(iIntValue, linkedList);
                }
                linkedList.offer(interfaceC1773570wFn);
                return;
            }
            C1773790wG9 c1773790wG9LJIIL = this.LL.LJIIL();
            c1773790wG9LJIIL.getClass();
            if (interfaceC1773570wFn.LJ()) {
                Queue<InterfaceC1773570wFn> linkedList2 = c1773790wG9LJIIL.LIZ.get(iIntValue);
                if (linkedList2 == null) {
                    linkedList2 = new LinkedList<>();
                    c1773790wG9LJIIL.LIZ.put(iIntValue, linkedList2);
                }
                linkedList2.offer(interfaceC1773570wFn);
            }
        }
    }

    @Override // X.AbstractC1773460wFc
    public final boolean V5() {
        return this.LLJJJIL;
    }

    @Override // X.AbstractC1773460wFc
    public final void h6() {
        r6();
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.sparklite.ECLynxCardViewOptHolder$1, reason: invalid class name */
    public final class AnonymousClass1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
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

        public AnonymousClass1() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZIZ(this, lifecycleOwner);
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("item_id=");
            sbLIZ.append(ECLynxCardViewOptHolder.this.LLJJJJ);
            sbLIZ.append(", onDestroy");
            C2188811AlT.LIZIZ(sbLIZ);
            c599820Nfo.getClass();
            C599820Nfo.LIZLLL();
            InterfaceC1773570wFn interfaceC1773570wFn = ECLynxCardViewOptHolder.this.LLJJJ;
            if (interfaceC1773570wFn != null) {
                interfaceC1773570wFn.release();
            }
        }
    }

    @Override // X.AbstractC1773460wFc
    public final void P5(AbstractC1773210wFD abstractC1773210wFD) {
        this.LL.LJIIJ().LIZIZ(new ARunnableS95S0200000_26(this, (C1773330wFP) abstractC1773210wFD, 0), "feed_card");
    }

    @Override // X.AbstractC1773460wFc
    public final void onVisibilityChanged(boolean z) throws JSONException {
        super.onVisibilityChanged(z);
        InterfaceC1773570wFn interfaceC1773570wFn = this.LLJJJ;
        if (interfaceC1773570wFn != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("visible", z ? 1 : 0);
            String str = this.LLJJJJ;
            if (str == null) {
                str = "";
            }
            jSONObject.put("item_id", str);
            interfaceC1773570wFn.LJFF(jSONObject);
        }
    }

    @Override // X.InterfaceC1772610wEF
    public final View u5(String str) {
        InterfaceC1773570wFn interfaceC1773570wFn = this.LLJJJ;
        if (interfaceC1773570wFn != null) {
            return interfaceC1773570wFn.LIZ(str);
        }
        return null;
    }

    public final void u6(C1772820wEa c1772820wEa) {
        D d = this.LLILLL;
        if (d != 0) {
            super.i6(d, c1772820wEa);
        }
    }

    @Override // X.AbstractC1773460wFc
    public final void i6(AbstractC1773210wFD abstractC1773210wFD, C1772820wEa c1772820wEa) {
        C1772800wEY c1772800wEYLIZIZ;
        InterfaceC1773570wFn interfaceC1773570wFn;
        InterfaceC1773570wFn interfaceC1773570wFn2 = this.LLJJJ;
        if (interfaceC1773570wFn2 != null && (c1772800wEYLIZIZ = interfaceC1773570wFn2.LIZIZ()) != null && this.LLJJJIL && (interfaceC1773570wFn = this.LLJJJ) != null) {
            interfaceC1773570wFn.LIZLLL(c1772800wEYLIZIZ);
        }
    }

    public ECLynxCardViewOptHolder(LifecycleOwner lifecycleOwner, C1773610wFr<C1773330wFP> c1773610wFr, InterfaceC1773310wFN interfaceC1773310wFN, C1773800wGA c1773800wGA) {
        Lifecycle lifecycle;
        super(c1773610wFr, interfaceC1773310wFN);
        this.LLJJIJI = lifecycleOwner;
        this.LLJJIJIIJIL = c1773610wFr;
        this.LLJJIJIL = c1773800wGA;
        if ((lifecycleOwner != null || (lifecycleOwner = C948503nH.LIZ(c1773610wFr)) != null) && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(new AnonymousClass1());
        }
        c1773610wFr.setMinimumHeight(5);
        this.LLJJIJIIJIL.setVHRef(this);
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS427S0200000_26(this, interfaceC1773310wFN, 37));
    }
}
