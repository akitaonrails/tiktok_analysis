package com.lynx.tasm.behavior.ui.scroll;

import X.C1297690jsF;
import X.InterfaceC1298070jsr;
import X.InterfaceC1312540kGC;
import android.view.ViewGroup;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import j27.s;

/* JADX INFO: loaded from: classes21.dex */
public abstract class AbsLynxUIScroll<T extends ViewGroup> extends UISimpleView<T> {
    public void LJJIIZI(LynxBaseUI lynxBaseUI, boolean z, String str, String str2) {
    }

    public abstract void LJJIJ(boolean z);

    public abstract void LJJIJIIJI(boolean z);

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isScrollable() {
        return true;
    }

    @InterfaceC1312540kGC(defaultInt = 0, name = "scroll-to-index")
    public abstract void scrollToIndex(int i);

    @InterfaceC1312540kGC(defaultBoolean = false, name = "block-descendant-focusability")
    public void setBlockDescendantFocusability(boolean z) {
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "enable-new-nested")
    public void setEnableNewNested(boolean z) {
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "enable-scroll")
    public void setEnableScroll(boolean z) {
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "forbid-fling-focus-change")
    public void setForbidFlingFocusChange(boolean z) {
    }

    @InterfaceC1312540kGC(defaultInt = 0, name = "lower-threshold")
    public abstract void setLowerThreshole(int i);

    @InterfaceC1312540kGC(defaultBoolean = false, name = "scroll-bar-enable")
    public abstract void setScrollBarEnable(boolean z);

    @InterfaceC1312540kGC(defaultInt = 0, name = "scroll-left")
    public abstract void setScrollLeft(int i);

    @InterfaceC1312540kGC(defaultBoolean = false, name = "scroll-tap")
    public abstract void setScrollTap(boolean z);

    @InterfaceC1312540kGC(defaultInt = 0, name = "scroll-top")
    public abstract void setScrollTop(int i);

    @InterfaceC1312540kGC(defaultInt = 0, name = "upper-threshold")
    public abstract void setUpperThreshole(int i);

    @InterfaceC1312540kGC(name = "scroll-x")
    public void setScrollX(InterfaceC1298070jsr interfaceC1298070jsr) {
        if (interfaceC1298070jsr == null) {
            LJJIJ(false);
            return;
        }
        int i = C1297690jsF.LIZ[interfaceC1298070jsr.getType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            LJJIJ("true".equals(interfaceC1298070jsr.asString()));
            return;
        }
        LJJIJ(interfaceC1298070jsr.asBoolean());
    }

    @InterfaceC1312540kGC(name = "scroll-y")
    public void setScrollY(InterfaceC1298070jsr interfaceC1298070jsr) {
        if (interfaceC1298070jsr == null) {
            LJJIJIIJI(true);
            return;
        }
        int i = C1297690jsF.LIZ[interfaceC1298070jsr.getType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            LJJIJIIJI("true".equals(interfaceC1298070jsr.asString()));
            return;
        }
        LJJIJIIJI(interfaceC1298070jsr.asBoolean());
    }

    public AbsLynxUIScroll(s sVar, Object obj) {
        super(sVar, obj);
    }
}
