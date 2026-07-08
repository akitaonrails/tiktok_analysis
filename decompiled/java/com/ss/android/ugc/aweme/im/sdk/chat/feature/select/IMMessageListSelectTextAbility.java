package com.ss.android.ugc.aweme.im.sdk.chat.feature.select;

import X.AbstractC738140SxQ;
import X.C09IR;
import X.C0ZL6;
import X.C0ZLR;
import X.C0ZLS;
import X.C1868730yjH;
import X.C19389010tM;
import X.C19389110tN;
import X.C2188811AlT;
import X.C2247861CyW;
import X.C2252331DDr;
import X.C869590Y9l;
import X.C898030ZKv;
import X.InterfaceC1859950yV7;
import X.InterfaceC1860040yVG;
import X.ViewOnAttachStateChangeListenerC2247901Cya;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.im.messagelist.api.select.IMSelectTextAbility;
import java.lang.ref.WeakReference;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS435S0200000_34;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.AwS613S0100000_34;
import kotlin.jvm.internal.AwS66S0500000_2;

/* JADX INFO: loaded from: classes35.dex */
public final class IMMessageListSelectTextAbility extends AbstractC738140SxQ implements IMSelectTextAbility {
    public WeakReference<C2247861CyW> LL;
    public String LLILLJJLI;
    public final C2252331DDr LLILLL;
    public final C2252331DDr LLILZ;

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.select.IMSelectTextAbility
    public final boolean VU() {
        if (this.LLILLJJLI == null) {
            return false;
        }
        C2247861CyW c2247861CyWM235do = m235do();
        if (c2247861CyWM235do == null) {
            this.LLILLJJLI = null;
            return false;
        }
        InterfaceC1859950yV7 textSelector = c2247861CyWM235do.LIZ.getTextSelector();
        if (textSelector != null && textSelector.LJII() != textSelector.LJIIIZ()) {
            return true;
        }
        bo();
        return false;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final C2247861CyW m235do() {
        WeakReference<C2247861CyW> weakReference = this.LL;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.select.IMSelectTextAbility
    public final String gM0() {
        String str = this.LLILLJJLI;
        if (str != null) {
            C2247861CyW c2247861CyWM235do = m235do();
            if (c2247861CyWM235do != null) {
                InterfaceC1859950yV7 textSelector = c2247861CyWM235do.LIZ.getTextSelector();
                if (textSelector != null && textSelector.LJII() != textSelector.LJIIIZ()) {
                    return str;
                }
                bo();
                return null;
            }
            this.LLILLJJLI = null;
        }
        return null;
    }

    public IMMessageListSelectTextAbility() {
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 1, null, 5);
        this.LLILLL = c2252331DDrLIZIZ;
        this.LLILZ = c2252331DDrLIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.select.IMSelectTextAbility
    public final void Gb0() {
        C2247861CyW c2247861CyWM235do;
        InterfaceC1859950yV7 textSelector;
        if (!C898030ZKv.LIZ() || (c2247861CyWM235do = m235do()) == null || (textSelector = c2247861CyWM235do.LIZ.getTextSelector()) == null) {
            return;
        }
        textSelector.LJIIJ();
        c2247861CyWM235do.LJ();
    }

    public final void bo() {
        C2247861CyW c2247861CyWM235do = m235do();
        if (c2247861CyWM235do != null) {
            c2247861CyWM235do.LJIIJ.dismiss();
            C19389110tN c19389110tN = c2247861CyWM235do.LJIIIIZZ;
            c19389110tN.getClass();
            C19389110tN.LIZ(new C19389010tM(c19389110tN));
        }
        this.LL = null;
        this.LLILLJJLI = null;
        if (c2247861CyWM235do == null || c2247861CyWM235do.LJIILIIL) {
            return;
        }
        c2247861CyWM235do.LJIILIIL = true;
        c2247861CyWM235do.LJ.getLifecycle().removeObserver(c2247861CyWM235do.LJIIL);
        ViewOnAttachStateChangeListenerC2247901Cya viewOnAttachStateChangeListenerC2247901Cya = c2247861CyWM235do.LJIIJJI;
        if (viewOnAttachStateChangeListenerC2247901Cya != null) {
            c2247861CyWM235do.LIZ.LJJZZI().removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC2247901Cya);
        }
        c2247861CyWM235do.LJIIJJI = null;
        c2247861CyWM235do.LIZ.LJIILLIIL();
        InterfaceC1859950yV7 textSelector = c2247861CyWM235do.LIZ.getTextSelector();
        if (textSelector != null) {
            textSelector.LJ(null);
        }
        c2247861CyWM235do.LJIIJ.dismiss();
        C19389110tN c19389110tN2 = c2247861CyWM235do.LJIIIIZZ;
        c19389110tN2.LIZLLL = true;
        C19389110tN.LIZ(new C19389010tM(c19389110tN2));
        InterfaceC1859950yV7 textSelector2 = c2247861CyWM235do.LIZ.getTextSelector();
        if (textSelector2 != null) {
            textSelector2.LIZJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.select.IMSelectTextAbility
    public final void gv1() {
        if (C898030ZKv.LIZ()) {
            bo();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.select.IMSelectTextAbility
    public final C2252331DDr he2() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.select.IMSelectTextAbility
    public final void dl0(C0ZLS c0zls) {
        if (!C898030ZKv.LIZ() || !VU()) {
            return;
        }
        bo();
        this.LLILLL.LIZJ(new C0ZL6(c0zls));
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.select.IMSelectTextAbility
    public final void pB2(String str) {
        if (!C898030ZKv.LIZ()) {
            return;
        }
        this.LLILLL.LIZJ(new C0ZLR(str));
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.select.IMSelectTextAbility
    public final void xr0(int i) {
        C2247861CyW c2247861CyWM235do;
        InterfaceC1859950yV7 textSelector;
        boolean z;
        if (C898030ZKv.LIZ() && (c2247861CyWM235do = m235do()) != null && (textSelector = c2247861CyWM235do.LIZ.getTextSelector()) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("scroll stateChanged: newState=");
            sbLIZ.append(i);
            sbLIZ.append(" idle=");
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ.append(z);
            sbLIZ.append(" menuShowing=");
            sbLIZ.append(c2247861CyWM235do.LJIIJ.LLIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            textSelector.LIZLLL(i);
            if (i == 0) {
                textSelector.LJIIJ();
                c2247861CyWM235do.LJ();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.select.IMSelectTextAbility
    public final void bT1(C869590Y9l c869590Y9l, InterfaceC1860040yVG interfaceC1860040yVG, String str, Function0 function0, ReusedUISlotAssem reusedUISlotAssem, Integer num, Function0 function02, boolean z, boolean z2, Function1 function1, Function0 function03) {
        if (!C898030ZKv.LIZ()) {
            return;
        }
        bo();
        C2247861CyW c2247861CyW = new C2247861CyW(interfaceC1860040yVG, Collections.singletonList(new C1868730yjH(str, num, new AwS66S0500000_2(c869590Y9l, (C869590Y9l) interfaceC1860040yVG, (InterfaceC1860040yVG) function0, (Function0<? extends CharSequence>) function1, (Function1<? super String, Unit>) function03, (Function0<Unit>) 1))), new AwS435S0200000_34(interfaceC1860040yVG, (InterfaceC1860040yVG) function02, (Function0<? extends View>) 18), z, z2, reusedUISlotAssem, new AwS613S0100000_34(this, 130), new AwS578S0100000_34(this, 168));
        this.LL = new WeakReference<>(c2247861CyW);
        this.LLILLJJLI = c869590Y9l.getUuid();
        c2247861CyW.LJ();
    }
}
