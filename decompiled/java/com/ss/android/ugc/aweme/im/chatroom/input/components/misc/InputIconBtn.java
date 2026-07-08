package com.ss.android.ugc.aweme.im.chatroom.input.components.misc;

import X.C0IDT;
import X.C1BNE;
import X.C2252321DDq;
import X.C23250099c;
import X.C343000DcY;
import X.C418440Gaw;
import X.C426750GoL;
import X.C432300GxI;
import X.C432310GxJ;
import X.C432380GxQ;
import X.C432560Gxi;
import X.C432580Gxk;
import X.C432600Gxm;
import X.C432620Gxo;
import X.C433880Gzq;
import X.C459000HzG;
import X.C786410Ut5;
import X.C814420VxA;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.marshal.UiStateViewAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import wh6.AbS688S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class InputIconBtn extends UiStateViewAssem<C433880Gzq, C343000DcY, TuxIconView> {
    public final C2252321DDq LLJJIII;
    public ValueAnimator LLJJIJI;
    public final C2252321DDq LLJJIJIIJIL;

    @Override // com.ss.android.ugc.aweme.im.common.assem.IMUISlotViewAssem
    public final View LLLILZJ() {
        Context context = getContext();
        if (context == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setTuxIcon(((C433880Gzq) C459000HzG.LIZIZ(this).getValue()).LIZ);
        C786410Ut5.M6(tuxIconView, new ViewGroup.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36))));
        C426750GoL.LJIIL(tuxIconView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), 16);
        Function1<View, Boolean> function1 = ((C343000DcY) C459000HzG.LIZ(this)).LIZIZ;
        if (function1 != null) {
            tuxIconView.setOnLongClickListener(new C0IDT(function1, 1));
        }
        Function1<View, Unit> function12 = ((C343000DcY) C459000HzG.LIZ(this)).LIZ;
        if (function12 == null) {
            C786410Ut5.a9(tuxIconView, null);
            return tuxIconView;
        }
        C786410Ut5.I7(new AbS688S0100000_6(function12, 10), tuxIconView);
        return tuxIconView;
    }

    public InputIconBtn() {
        Float fValueOf = Float.valueOf(1.0f);
        this.LLJJIII = C1BNE.LIZ(fValueOf);
        this.LLJJIJIIJIL = C1BNE.LIZ(fValueOf);
    }

    @Override // com.ss.android.ugc.aweme.im.marshal.UiStateViewAssem
    public final void hp(View view) {
        TuxIconView tuxIconView = (TuxIconView) view;
        Function2 function2LIZJ = C459000HzG.LIZJ(this);
        if (function2LIZJ != null) {
            function2LIZJ.invoke(this, tuxIconView);
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C23250099c.LIZLLL(lifecycleScope, null, null, new C432560Gxi(this, tuxIconView, null), 3);
        C23250099c.LIZLLL(lifecycleScope, null, null, new C432620Gxo(this, null), 3);
        C23250099c.LIZLLL(lifecycleScope, null, null, new C432380GxQ(this, tuxIconView, null), 3);
        C23250099c.LIZLLL(lifecycleScope, null, null, new C432580Gxk(this, tuxIconView, null), 3);
        C23250099c.LIZLLL(lifecycleScope, null, null, new C432300GxI(this, tuxIconView, null), 3);
        C23250099c.LIZLLL(lifecycleScope, null, null, new C432600Gxm(this, tuxIconView, null), 3);
        C23250099c.LIZLLL(lifecycleScope, null, null, new C432310GxJ(this, tuxIconView, null), 3);
    }
}
