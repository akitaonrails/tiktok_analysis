package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.handler;

import X.AbstractC1622390sJx;
import X.C01TT;
import X.C0HZQ;
import X.C0LAB;
import X.C1449600npG;
import X.C1623370sLX;
import X.C1627370sRz;
import X.C522900Kf2;
import X.C579040MnO;
import X.C786410Ut5;
import X.EnumC1155090gAF;
import X.InterfaceC1159800gHq;
import X.InterfaceC1635880sfi;
import Y.ACListenerS166S0100000_32;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class GreenScreenReuseHandler extends AbstractC1622390sJx implements InterfaceC1159800gHq, InterfaceC1635880sfi, GenericLifecycleObserver {
    public Effect LLILLJJLI;
    public C0HZQ LLILLL;
    public View LLILZ;

    @Override // X.InterfaceC1635880sfi
    public final void LIZ(C579040MnO c579040MnO) {
    }

    @Override // X.InterfaceC1635880sfi
    public final void LIZIZ(C579040MnO c579040MnO) {
    }

    @Override // X.InterfaceC1635880sfi
    public final void LJFF() {
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJI() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            setCheckBoxState();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private final void setCheckBoxState() {
        C01TT.LIZLLL(new AwS576S0100000_32(this, 355));
    }

    @Override // X.InterfaceC1635880sfi
    public final void LJIIJ() {
        View view;
        Effect effect = this.LLILLJJLI;
        if (effect == null || !C1449600npG.LIZJ(effect) || (view = this.LLILZ) == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(0, view);
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIFFI() {
        View view = this.LLILZ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        this.LLILLJJLI = null;
    }

    @Override // X.InterfaceC1635880sfi
    public final boolean LJJII() {
        Effect effect = this.LLILLJJLI;
        boolean z = false;
        if (effect != null && C1449600npG.LIZJ(effect)) {
            C522900Kf2.LIZ.getBoolean("is_check_box_checked", false);
            new C0LAB();
            throw null;
        }
        View view = this.LLILZ;
        if (view != null && view.getVisibility() == 8) {
            z = true;
        }
        return !z;
    }

    @Override // X.InterfaceC1159800gHq
    public final void LIZLLL(EnumC1155090gAF enumC1155090gAF) {
        Effect effect = this.LLILLJJLI;
        if (effect != null && C1449600npG.LIZJ(effect)) {
            throw null;
        }
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJIIIZ(View view) {
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(view.getContext());
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.w4r);
        View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.ccw, viewGroup, false);
        this.LLILZ = viewTd;
        if (viewTd != null && viewGroup != null) {
            viewGroup.addView(viewTd, 0);
        }
        this.LLILLL = (C0HZQ) view.findViewById(R.id.j8t);
        view.findViewById(R.id.j8u);
        View view2 = this.LLILZ;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS166S0100000_32(this, 41), view2);
        }
        View view3 = this.LLILZ;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(8, view3);
        }
    }

    @Override // X.InterfaceC1159800gHq
    public final void LJIIZILJ(EnumC1155090gAF enumC1155090gAF) {
        View view;
        Effect effect = this.LLILLJJLI;
        if ((effect == null || !C1449600npG.LIZJ(effect)) && (view = this.LLILZ) != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    @Override // X.AbstractC1622390sJx
    public final boolean LJJI(C1627370sRz c1627370sRz) {
        boolean zLIZJ = C1449600npG.LIZJ(c1627370sRz.LIZ);
        if (!zLIZJ) {
            return zLIZJ;
        }
        this.LLILLJJLI = c1627370sRz.LIZ;
        throw null;
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIII(C1623370sLX c1623370sLX, C1627370sRz c1627370sRz) {
        if (C1449600npG.LIZJ(c1627370sRz.LIZ)) {
            C01TT.LIZLLL(new AwS576S0100000_32(this, 356));
        }
    }
}
