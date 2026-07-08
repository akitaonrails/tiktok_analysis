package com.ss.android.ugc.aweme.im.chatroom.input.components.misc;

import X.C01GW;
import X.C23250099c;
import X.C342900DcO;
import X.C342910DcP;
import X.C342920DcQ;
import X.C342950DcT;
import X.C343000DcY;
import X.C418440Gaw;
import X.C452501pT;
import X.C459000HzG;
import X.C786410Ut5;
import X.C814420VxA;
import X.ViewOnLongClickListenerC346350Dhx;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.im.marshal.UiStateViewAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS548S0100000_4;
import wh6.AbS687S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class LoadingAssem extends UiStateViewAssem<C342950DcT, C343000DcY, FrameLayout> {
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS548S0100000_4(this, 144));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS548S0100000_4(this, 140));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 143));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 141));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS548S0100000_4(this, 145));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 142));

    @Override // com.ss.android.ugc.aweme.im.common.assem.IMUISlotViewAssem
    public final View LLLILZJ() {
        Context context = getContext();
        if (context == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        FrameLayout frameLayout = new FrameLayout(context);
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36))));
        ip().addView((View) this.LLJJIII.getValue(), new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 17));
        ip().addView((View) this.LLJJIJI.getValue(), new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 17));
        ip().addView((View) this.LLJJIJIIJIL.getValue(), new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 17));
        FrameLayout frameLayoutIp = ip();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 8388661);
        layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        frameLayout.addView(frameLayoutIp, layoutParams);
        Function1<View, Boolean> function1 = ((C343000DcY) C459000HzG.LIZ(this)).LIZIZ;
        if (function1 != null) {
            frameLayout.setOnLongClickListener(new ViewOnLongClickListenerC346350Dhx(function1, 0));
        }
        Function1<View, Unit> function12 = ((C343000DcY) C459000HzG.LIZ(this)).LIZ;
        if (function12 == null) {
            C786410Ut5.O7(frameLayout, null);
            return frameLayout;
        }
        C786410Ut5.I7(new AbS687S0100000_4(function12, 6), frameLayout);
        return frameLayout;
    }

    public final FrameLayout ip() {
        return (FrameLayout) this.LLJJIJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.marshal.UiStateViewAssem
    public final void hp(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        Function2 function2LIZJ = C459000HzG.LIZJ(this);
        if (function2LIZJ != null) {
            function2LIZJ.invoke(this, frameLayout);
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C23250099c.LIZLLL(lifecycleScope, null, null, new C342920DcQ(this, frameLayout, null), 3);
        C23250099c.LIZLLL(lifecycleScope, null, null, new C342900DcO(this, null), 3);
        C23250099c.LIZLLL(lifecycleScope, null, null, new C342910DcP(this, null), 3);
    }
}
