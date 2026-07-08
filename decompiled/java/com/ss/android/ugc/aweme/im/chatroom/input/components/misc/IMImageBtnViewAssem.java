package com.ss.android.ugc.aweme.im.chatroom.input.components.misc;

import X.C0IDT;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C23250099c;
import X.C343000DcY;
import X.C418440Gaw;
import X.C426750GoL;
import X.C434080H0k;
import X.C434100H0m;
import X.C459000HzG;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.im.chatroom.input.components.api.InputViewColorChangeProtocol;
import com.ss.android.ugc.aweme.im.marshal.UiStateViewAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import wh6.AbS688S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class IMImageBtnViewAssem extends UiStateViewAssem<C434100H0m, C343000DcY, SmartImageView> implements InputViewColorChangeProtocol {
    public int LLJJIII;

    @Override // com.ss.android.ugc.aweme.im.common.assem.IMUISlotViewAssem
    public final View LLLILZJ() {
        Context context = getContext();
        if (context == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        SmartImageView smartImageView = new SmartImageView(context);
        C786410Ut5.G6(smartImageView, new ViewGroup.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36))));
        C426750GoL.LJIIL(smartImageView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), 16);
        Function1<View, Boolean> function1 = ((C343000DcY) C459000HzG.LIZ(this)).LIZIZ;
        if (function1 != null) {
            smartImageView.setOnLongClickListener(new C0IDT(function1, 0));
        }
        Function1<View, Unit> function12 = ((C343000DcY) C459000HzG.LIZ(this)).LIZ;
        if (function12 == null) {
            C786410Ut5.Q8(smartImageView, null);
            return smartImageView;
        }
        C786410Ut5.I7(new AbS688S0100000_6(function12, 9), smartImageView);
        return smartImageView;
    }

    @Override // com.ss.android.ugc.aweme.im.marshal.UiStateViewAssem
    public final void hp(View view) {
        SmartImageView smartImageView = (SmartImageView) view;
        Function2 function2LIZJ = C459000HzG.LIZJ(this);
        if (function2LIZJ != null) {
            function2LIZJ.invoke(this, smartImageView);
        }
        final InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, InputViewColorChangeProtocol.class, C1697810uHb.LJIILJJIL(this));
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.chatroom.input.components.misc.IMImageBtnViewAssem$onActualViewCreated$$inlined$registerProtocol$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(interfaceC665370Q7zLJIIL, InputViewColorChangeProtocol.class, this);
                    }
                }
            });
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C434080H0k(this, smartImageView, null), 3);
    }
}
