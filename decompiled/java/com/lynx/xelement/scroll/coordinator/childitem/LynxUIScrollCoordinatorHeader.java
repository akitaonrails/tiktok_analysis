package com.lynx.xelement.scroll.coordinator.childitem;

import X.C1319330kR9;
import X.InterfaceC1312540kGC;
import X.InterfaceC1313090kH5;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.xelement.scroll.coordinator.BaseScrollCoordinator;
import com.lynx.xelement.scroll.coordinator.LynxUIScrollCoordinator;
import j27.s;

/* JADX INFO: loaded from: classes21.dex */
public class LynxUIScrollCoordinatorHeader extends UIGroup<C1319330kR9> {
    public boolean LL;

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        return new C1319330kR9(context);
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "android-consume-gesture")
    public final void setHandleGesture(boolean z) {
        ((C1319330kR9) this.mView).setHandleGesture(z);
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
                ((BaseScrollCoordinator) interfaceC1313090kH5).LJJIIZI().LLJLILLLLZIIL.setClipChildren(z2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.lynx.xelement.scroll.coordinator.LynxUIScrollCoordinator");
        }
    }

    public LynxUIScrollCoordinatorHeader(s sVar, Object obj) {
        super(sVar, obj);
    }
}
