package com.lynx.xelement.scroll.coordinator.childitem;

import X.C1319340kRA;
import X.InterfaceC1313090kH5;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.xelement.scroll.coordinator.BaseScrollCoordinator;
import com.lynx.xelement.scroll.coordinator.LynxUIScrollCoordinator;
import j27.s;

/* JADX INFO: loaded from: classes21.dex */
public class LynxUIScrollCoordinatorToolbar extends UIGroup<C1319340kRA> {
    public boolean LL;

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        return new C1319340kRA(context);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setNativeInteractionEnabled(boolean z) {
        super.setNativeInteractionEnabled(z);
        ((C1319340kRA) this.mView).setHandleGesture(z);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setOverflow(Integer num) {
        boolean z;
        super.setOverflow(num);
        if (num != null && num.intValue() == 1) {
            z = false;
        } else {
            z = true;
        }
        this.LL = z;
        boolean z2 = !z;
        ((ViewGroup) this.mView).setClipChildren(z2);
        InterfaceC1313090kH5 interfaceC1313090kH5 = this.mParent;
        if (interfaceC1313090kH5 instanceof LynxUIScrollCoordinator) {
            if (interfaceC1313090kH5 != null) {
                ((BaseScrollCoordinator) interfaceC1313090kH5).LJJIIZI().LLJLL.setClipChildren(z2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.lynx.xelement.scroll.coordinator.LynxUIScrollCoordinator");
        }
    }

    public LynxUIScrollCoordinatorToolbar(s sVar, Object obj) {
        super(sVar, obj);
    }
}
