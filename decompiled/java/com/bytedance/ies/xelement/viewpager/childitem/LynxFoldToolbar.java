package com.bytedance.ies.xelement.viewpager.childitem;

import X.C1319230kQz;
import X.InterfaceC1313090kH5;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.xelement.viewpager.foldview.BaseLynxFoldView;
import com.bytedance.ies.xelement.viewpager.foldview.LynxFoldViewNG;
import com.lynx.tasm.behavior.ui.UIGroup;
import j27.s;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxFoldToolbar extends UIGroup<C1319230kQz> {
    public boolean LL;

    public LynxFoldToolbar(s sVar) {
        super(sVar, null);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        return new C1319230kQz(context);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setNativeInteractionEnabled(boolean z) {
        super.setNativeInteractionEnabled(z);
        ((C1319230kQz) this.mView).setHandleGesture(z);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setOverflow(Integer num) {
        super.setOverflow(num);
        Object obj = num;
        if (num == null) {
            obj = Boolean.FALSE;
        }
        boolean z = !Intrinsics.LJFF(obj, 1);
        this.LL = z;
        boolean z2 = !z;
        ((ViewGroup) this.mView).setClipChildren(z2);
        InterfaceC1313090kH5 interfaceC1313090kH5 = this.mParent;
        if (interfaceC1313090kH5 instanceof LynxFoldViewNG) {
            if (interfaceC1313090kH5 != null) {
                ((BaseLynxFoldView) interfaceC1313090kH5).LJJIJIIJIL().LLJLL.setClipChildren(z2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bytedance.ies.xelement.viewpager.foldview.LynxFoldViewNG");
        }
    }

    public LynxFoldToolbar(s sVar, Object obj) {
        super(sVar, obj);
    }
}
