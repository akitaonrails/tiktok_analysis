package com.bytedance.ies.xelement.viewpager.childitem;

import X.C1319620kRc;
import X.C19U0;
import X.C19U1;
import X.InterfaceC1311800kF0;
import X.InterfaceC1312540kGC;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import j27.s;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxTabbarItem extends UIGroup<AndroidView> implements InterfaceC1311800kF0 {
    public Integer LL;
    public C19U0 LLILLJJLI;
    public C1319620kRc LLILLL;
    public boolean LLILZ;
    public C19U1 LLILZIL;
    public boolean LLILZLL;

    @Override // X.InterfaceC1311800kF0
    public final void onPatchFinish() {
        C19U1 c19u1;
        Integer num;
        C19U0 tabAt;
        if (this.LLILZLL) {
            this.LLILZLL = false;
            if (!this.LLILZ || (c19u1 = this.LLILZIL) == null || (num = this.LL) == null || (tabAt = c19u1.getTabAt(num.intValue())) == null) {
                return;
            }
            tabAt.LIZIZ();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        C1319620kRc c1319620kRc;
        super.onPropsUpdated();
        ViewParent parent = this.mView.getParent();
        if (!(parent instanceof C1319620kRc) || (c1319620kRc = (C1319620kRc) parent) == null) {
            return;
        }
        c1319620kRc.setOverflow(getOverflow());
    }

    public LynxTabbarItem(s sVar) {
        super(sVar, null);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        return new AndroidView(context);
    }

    @InterfaceC1312540kGC(name = "select")
    public final void setSelect(boolean z) {
        C19U1 c19u1;
        Integer num;
        C19U0 tabAt;
        if (this.LLILZ == z) {
            return;
        }
        this.LLILZLL = true;
        this.LLILZ = z;
        if (z && (c19u1 = this.LLILZIL) != null && (num = this.LL) != null && (tabAt = c19u1.getTabAt(num.intValue())) != null) {
            tabAt.LIZIZ();
        }
    }

    public LynxTabbarItem(s sVar, Object obj) {
        super(sVar, obj);
    }
}
