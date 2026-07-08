package com.ss.android.ugc.aweme.im.chatroom.input.components.sendbtn;

import X.C1176104it;
import X.C1626006Yg;
import X.C1626106Yh;
import X.C1626206Yi;
import X.C1626306Yj;
import X.C1626606Ym;
import X.C1BNE;
import X.C2252321DDq;
import X.C23250099c;
import X.C345880DhC;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C423770GjX;
import X.C426750GoL;
import X.C786410Ut5;
import X.C814420VxA;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.marshal.UiStateViewAssem;
import wh6.AbS686S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class SendButtonAssemV2 extends UiStateViewAssem<C1626606Ym, C1176104it, TuxIconView> {
    public ValueAnimator LLJJIII;
    public ValueAnimator LLJJIJI;
    public final C2252321DDq LLJJIJIIJIL = C1BNE.LIZ(Float.valueOf(0.8f));
    public final C2252321DDq LLJJIJIL = C1BNE.LIZ(Float.valueOf(0.0f));

    @Override // com.ss.android.ugc.aweme.im.common.assem.IMUISlotViewAssem
    public final View LLLILZJ() {
        Context context = getContext();
        if (context == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setTuxIcon((C419910GdJ) C345880DhC.LIZ.getValue());
        tuxIconView.setBackground(new C423770GjX());
        C426750GoL.LJIIL(tuxIconView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7))), 16);
        C786410Ut5.LJLLLLLL(8, tuxIconView);
        C786410Ut5.x5(tuxIconView, ((Number) this.LLJJIJIL.getValue()).floatValue());
        C786410Ut5.hc(tuxIconView, ((Number) this.LLJJIJIIJIL.getValue()).floatValue());
        C786410Ut5.Cc(tuxIconView, ((Number) this.LLJJIJIIJIL.getValue()).floatValue());
        C786410Ut5.M6(tuxIconView, new ViewGroup.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36))));
        return tuxIconView;
    }

    @Override // com.ss.android.ugc.aweme.im.marshal.UiStateViewAssem
    public final void hp(View view) {
        FrameLayout.LayoutParams layoutParams;
        TuxIconView tuxIconView = (TuxIconView) view;
        ViewGroup.LayoutParams layoutParams2 = tuxIconView.getLayoutParams();
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
            layoutParams.gravity = 17;
            tuxIconView.requestLayout();
        }
        C786410Ut5.I7(new AbS686S0100000_2(this, 23), tuxIconView);
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C23250099c.LIZLLL(lifecycleScope, null, null, new C1626306Yj(this, tuxIconView, null), 3);
        C23250099c.LIZLLL(lifecycleScope, null, null, new C1626106Yh(this, tuxIconView, null), 3);
        C23250099c.LIZLLL(lifecycleScope, null, null, new C1626006Yg(this, tuxIconView, null), 3);
        C23250099c.LIZLLL(lifecycleScope, null, null, new C1626206Yi(this, tuxIconView, null), 3);
    }
}
