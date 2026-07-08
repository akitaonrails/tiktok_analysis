package com.ss.android.ugc.feed.platform.panel;

import X.C01GW;
import X.C0PC4;
import X.C0RD6;
import X.C0RJN;
import X.C0SU9;
import X.C1566140qrE;
import X.C1566170qrH;
import X.C1566180qrI;
import X.C2254708sT;
import X.C452501pT;
import X.InterfaceC1565950qqv;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.feed.platform.monitor.ComponentTraceVM;
import com.ss.android.ugc.feed.platform.panel.base.EventCenter;

/* JADX INFO: loaded from: classes25.dex */
public abstract class BasePanelUIComponent extends UIContentAssem implements InterfaceC1565950qqv {
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C0SU9(this));
    public final C01GW<C2254708sT> LLJ = C452501pT.LIZIZ(new C1566170qrH(this));
    public final C01GW LLJI = C452501pT.LIZIZ(new C1566180qrI(this));

    public void eventInit(C0RD6 c0rd6) {
    }

    @Override // X.AbstractC738140SxQ
    public boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public void onPagePause(int i) {
    }

    public void onPageResume(int i) {
    }

    public void setUserVisibleHint(boolean z) {
    }

    @Override // X.InterfaceC1565950qqv
    public final C2254708sT getActionHandler() {
        return (C2254708sT) this.LLJI.getValue();
    }

    @Override // X.InterfaceC1565950qqv
    public final C0RJN getPanelContext() {
        return (C0RJN) this.LLIZLLLIL.getValue();
    }

    @Override // X.InterfaceC691700RBg
    public final EventCenter getEventCenter() {
        return getPanelContext().LIZIZ;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onCreate() {
        super.onCreate();
        ComponentTraceVM componentTraceVMLIZ = C0PC4.LIZ(getPanelContext().LJ);
        if (componentTraceVMLIZ == null) {
            return;
        }
        componentTraceVMLIZ.LL++;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        if (this.LLJ.isInitialized()) {
            this.LLJ.getValue().LIZ();
        }
    }

    @Override // X.AbstractC738140SxQ
    public void onParentSet() {
        super.onParentSet();
        C1566140qrE.LIZ(this);
    }
}
