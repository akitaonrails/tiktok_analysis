package com.ss.android.ugc.tiktok.im.contact.selector.impl.vm;

import X.C01GW;
import X.C1223620hwm;
import X.C1224060hxU;
import X.C1224590hyL;
import X.C2188811AlT;
import X.C291001Au;
import X.EnumC1224720hyY;
import X.EnumC1227730i3P;
import X.InterfaceC0148002o;
import X.InterfaceC1224360hxy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.Unit;
import kotlin.jvm.internal.AwS33S0010000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class SelectorConfirmWidgetVM extends AssemViewModel<C1224060hxU> implements InterfaceC1224360hxy {
    public final C01GW LL = C1223620hwm.LJ(this);

    public static C1224060hxU vQ2() {
        return new C1224060hxU(new C291001Au(Unit.LIZ), new C1224590hyL(EnumC1227730i3P.MAIN, true, "", true, false), new C1224590hyL(EnumC1227730i3P.SECONDARY, false, "", false, false), new C291001Au(Boolean.FALSE));
    }

    @Override // X.InterfaceC1224360hxy
    public final void ld0() {
        setStateImmediate(new AwS598S0100000_19(this, 505));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* bridge */ /* synthetic */ InterfaceC0148002o defaultState() {
        return vQ2();
    }

    public static void wQ2(EnumC1224720hyY enumC1224720hyY) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("the confirm widget variant is ");
        sbLIZ.append(enumC1224720hyY);
        sbLIZ.append(", this variant don't show hint on the widget, check your defaultButtonHint");
        RuntimeException runtimeException = new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        if (!C1223620hwm.LJFF()) {
        } else {
            throw runtimeException;
        }
    }

    public static void xQ2(EnumC1224720hyY enumC1224720hyY) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("the confirm widget variant is ");
        sbLIZ.append(enumC1224720hyY);
        sbLIZ.append(", this variant only support show one main button, but you set the secondary button visible, check your defaultSecondButtonState");
        RuntimeException runtimeException = new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        if (!C1223620hwm.LJFF()) {
        } else {
            throw runtimeException;
        }
    }

    @Override // X.InterfaceC1224360hxy
    public final void yg0(boolean z, boolean z2) {
        AwS33S0010000_19 awS33S0010000_19 = new AwS33S0010000_19(z, 9);
        if (z2) {
            setStateImmediate(awS33S0010000_19);
        } else {
            setState(awS33S0010000_19);
        }
    }
}
