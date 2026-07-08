package com.ss.android.ugc.aweme.im.quickchat.ui.assem;

import X.C01GW;
import X.C05YD;
import X.C09IR;
import X.C0HV6;
import X.C0IBF;
import X.C0PEM;
import X.C1626606Ym;
import X.C1640006bW;
import X.C1BNE;
import X.C2252321DDq;
import X.C2252331DDr;
import X.C23250099c;
import X.C452480Hok;
import X.C452501pT;
import X.C456280Hus;
import X.C456370Hv1;
import X.C456470HvB;
import X.C456630HvR;
import X.C456970Hvz;
import X.C458120Hxq;
import X.C463090IDz;
import X.InterfaceC0148002o;
import X.InterfaceC441960HUs;
import X.InterfaceC456680HvW;
import X.InterfaceC456690HvX;
import X.InterfaceC458260Hy4;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IInputFieldAbility;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.InputFieldVM;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes7.dex */
public final class IMQuickMessageInputVM extends AssemViewModel<InterfaceC0148002o> implements InterfaceC456680HvW, InterfaceC456690HvX {
    public final IInputFieldAbility LL;
    public final InterfaceC441960HUs LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C2252321DDq LLILZIL;
    public final C2252321DDq LLILZLL;
    public final C2252331DDr LLIZ;
    public final C2252331DDr LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C456470HvB LLJILJILJ;
    public final C2252321DDq LLJILLL;

    @Override // X.InterfaceC456680HvW
    public final boolean El2() {
        return false;
    }

    @Override // X.InterfaceC456680HvW
    public final C05YD<C0IBF> Jw2() {
        return (C05YD) this.LLJILJIL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C463090IDz(6);
    }

    public final C0HV6 vQ2() {
        return (C0HV6) this.LLJ.getValue();
    }

    @Override // X.InterfaceC456680HvW
    public final boolean aW() {
        return C458120Hxq.LIZIZ();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C456630HvR(this, null), 2);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C456370Hv1(this, null), 3);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C456280Hus(this, null), 3);
    }

    @Override // X.InterfaceC456690HvX
    public final C2252321DDq mk0() {
        return this.LLJILLL;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.0HvB] */
    public IMQuickMessageInputVM(C01GW c01gw, InputFieldVM inputFieldVM, PanelStateViewModel panelStateViewModel, C01GW c01gw2) {
        boolean z;
        this.LL = inputFieldVM;
        this.LLILLJJLI = panelStateViewModel;
        this.LLILLL = c01gw;
        this.LLILZ = c01gw2;
        if (((C1640006bW) inputFieldVM.LLILLJJLI.getValue()).LIZIZ != null && (!a0.LJJJIL(r0))) {
            z = true;
        } else {
            z = false;
        }
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C1626606Ym(z, false));
        this.LLILZIL = c2252321DDqLIZ;
        this.LLILZLL = c2252321DDqLIZ;
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 1, null, 5);
        this.LLIZ = c2252331DDrLIZIZ;
        this.LLIZLLLIL = c2252331DDrLIZIZ;
        this.LLJ = C452501pT.LIZIZ(new AwS407S0200000_6(this, (IMQuickMessageInputVM) c01gw2, (C01GW<C456970Hvz>) 20));
        this.LLJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 182));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 184));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS550S0100000_6(c01gw2, (C01GW<C456970Hvz>) 183));
        this.LLJILJILJ = new InterfaceC458260Hy4() { // from class: X.0HvB
            @Override // X.InterfaceC458260Hy4
            public final void LIZ() {
                this.LIZ.LL.setVisibility(false);
            }

            @Override // X.InterfaceC458260Hy4
            public final void LIZJ() {
                this.LIZ.LL.setVisibility(false);
            }

            @Override // X.InterfaceC458260Hy4
            public final void LIZLLL() {
                this.LIZ.LL.setVisibility(true);
            }

            @Override // X.InterfaceC458260Hy4
            public final void LIZIZ(Context context, C458370HyF c458370HyF, C0HVB c0hvb) {
                Activity activityLIZ;
                Window window;
                View decorView;
                InterfaceC457250HwR interfaceC457250HwR = (InterfaceC457250HwR) this.LIZ.LLILLL.getValue();
                if (interfaceC457250HwR != null) {
                    interfaceC457250HwR.LIZIZ(c458370HyF, c0hvb);
                }
                this.LIZ.LLIZ.LIZJ(C0I0E.ACTION_SEND_VOICE_MESSAGE);
                if (C298300Bme.LIZ() && (activityLIZ = C1388190mED.LIZ(context)) != null && (window = activityLIZ.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                    decorView.performHapticFeedback(3);
                }
            }
        };
        this.LLJILLL = C1BNE.LIZ(new C452480Hok(System.currentTimeMillis()));
    }
}
