package com.lynx.tasm.behavior.ui.view;

import X.InterfaceC1312540kGC;
import X.InterfaceC1317460kO8;
import android.content.Context;
import com.lynx.tasm.behavior.ui.list.container.UIListContainer;
import j27.s;

/* JADX INFO: loaded from: classes21.dex */
public class UIComponent extends UIView {
    public InterfaceC1317460kO8 LL;
    public String LLILLJJLI;
    public int LLILLL;
    public UIListContainer LLILZ;

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isAccessibilityHostUI() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.view.UIView, com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        super.destroy();
        this.LL = null;
        this.LLILZ = null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
        InterfaceC1317460kO8 interfaceC1317460kO8 = this.LL;
        if (interfaceC1317460kO8 != null) {
            interfaceC1317460kO8.LIZ(this);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onNodeReady() {
        String str;
        super.onNodeReady();
        UIListContainer uIListContainer = this.LLILZ;
        if (uIListContainer == null || !uIListContainer.LLILZIL || !uIListContainer.LLJJJIL || (str = this.LLILLJJLI) == null) {
            return;
        }
        if (uIListContainer.LLJJJJ.contains(str)) {
            uIListContainer.LJJJJJL(this, uIListContainer.LLJJJJLIIL, true);
        } else if (uIListContainer.LLJJJJJIL.contains(str)) {
            uIListContainer.LJJJJJL(this, uIListContainer.LLJJL, true);
        } else {
            uIListContainer.LJJJJJL(this, uIListContainer.LLJJJJLIIL, false);
            uIListContainer.LJJJJJL(this, uIListContainer.LLJJL, false);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.view.UIView
    public final AndroidView LJJIIZI(final Context context) {
        return new AndroidView(context) { // from class: X.0kFo
            public int LL;

            public int getPosition() {
                return this.LL;
            }

            public void setPosition(int i) {
                this.LL = i;
            }
        };
    }

    @InterfaceC1312540kGC(name = "item-key")
    public void setItemKey(String str) {
        this.LLILLJJLI = str;
    }

    @InterfaceC1312540kGC(defaultInt = 0, name = "z-index")
    public void setZIndex(int i) {
        this.LLILLL = i;
    }

    public UIComponent(s sVar, Object obj) {
        super(sVar, obj);
        if (sVar.LJI()) {
            this.mOverflow = 3;
        }
    }
}
