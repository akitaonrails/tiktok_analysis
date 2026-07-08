package com.bytedance.ies.xelement.viewpager.childitem;

import X.AbstractC1336950ktZ;
import X.C1336710ktB;
import android.content.Context;
import android.view.View;
import com.bytedance.ies.xelement.viewpager.LynxTabBarView;
import com.bytedance.ies.xelement.viewpager.viewpager.LynxViewPagerNG;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import j27.s;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxFoldSlot extends UIGroup<AndroidView> {
    public LynxTabBarView LL;
    public LynxFoldSlotDrag LLILLJJLI;

    public LynxFoldSlot(s sVar) {
        super(sVar, null);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        return new AndroidView(context);
    }

    public LynxFoldSlot(s sVar, Object obj) {
        super(sVar, obj);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void insertChild(LynxBaseUI lynxBaseUI, int i) {
        super.insertChild(lynxBaseUI, i);
        if (lynxBaseUI instanceof LynxUI) {
            lynxBaseUI.setParent(this);
            if (lynxBaseUI instanceof LynxViewPagerNG) {
                T t = ((LynxUI) lynxBaseUI).mView;
                if (t != 0 && (t instanceof C1336710ktB)) {
                    LynxFoldSlotDrag lynxFoldSlotDrag = this.LLILLJJLI;
                    if (lynxFoldSlotDrag != null) {
                        this.LL = lynxFoldSlotDrag.LL;
                        lynxFoldSlotDrag.LLILLJJLI = new WeakReference<>(t);
                    }
                    LynxTabBarView lynxTabBarView = this.LL;
                    if (lynxTabBarView != null) {
                        AbstractC1336950ktZ abstractC1336950ktZ = (AbstractC1336950ktZ) t;
                        abstractC1336950ktZ.setTabLayout(lynxTabBarView);
                        abstractC1336950ktZ.setTabBarElementAdded(false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (lynxBaseUI instanceof LynxTabBarView) {
                this.LL = (LynxTabBarView) lynxBaseUI;
            } else {
                if (!(lynxBaseUI instanceof LynxFoldSlotDrag)) {
                    return;
                }
                this.LLILLJJLI = (LynxFoldSlotDrag) lynxBaseUI;
            }
        }
    }
}
