package com.ss.android.ugc.aweme.tako.botpage.bottombox.panel;

import X.C0DSB;
import X.C0H23;
import X.C1388190mED;
import X.C1862740yZc;
import X.C19EG;
import X.C1FZ5;
import X.C786410Ut5;
import X.InterfaceC1352000lHq;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.view.UIContentAssem;

/* JADX INFO: loaded from: classes28.dex */
public class TakoDummyPanelAssem extends UIContentAssem implements InterfaceC1352000lHq {
    public C1FZ5 LLIZLLLIL;

    @Override // X.InterfaceC1352000lHq
    public final void j(int i) {
    }

    public void Go() {
        C19EG c19egLIZIZ;
        Context context = getContext();
        if (context == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null) {
            return;
        }
        C1862740yZc c1862740yZc = new C1862740yZc(c19egLIZIZ);
        this.LLIZLLLIL = c1862740yZc;
        c1862740yZc.LIZJ = new C0H23() { // from class: X.0yZn
            @Override // X.C0H23
            public final void LIZIZ() {
            }

            @Override // X.C0H23
            public final void LIZ() {
                this.LIZ.LLILII();
            }

            @Override // X.C0H23
            public final void LJJIIJ(int i) {
                this.LIZ.LLLLZI(i);
            }
        };
        View view = c1862740yZc.LIZ;
        if (view == null || c1862740yZc.LJ == null) {
            return;
        }
        C786410Ut5.x3(view.getViewTreeObserver(), c1862740yZc.LJ);
    }

    @Override // X.InterfaceC1352000lHq
    public final void LLILII() {
        C0DSB.LIZIZ(LJJIJL());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        LLILII();
        C1FZ5 c1fz5 = this.LLIZLLLIL;
        if (c1fz5 != null) {
            c1fz5.releaseListener();
        }
    }

    @Override // X.InterfaceC1352000lHq
    public final void LLLLZI(int i) {
        C0DSB.LIZJ(LJJIJL());
        View viewLJJIJL = LJJIJL();
        ViewGroup.LayoutParams layoutParams = viewLJJIJL.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i;
            C786410Ut5.W5(viewLJJIJL, layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Go();
    }
}
