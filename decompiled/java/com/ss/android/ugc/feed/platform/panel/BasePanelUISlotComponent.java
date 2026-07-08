package com.ss.android.ugc.feed.platform.panel;

import X.C01GW;
import X.C0PC4;
import X.C0RD6;
import X.C0RJN;
import X.C1566140qrE;
import X.C2254708sT;
import X.C452501pT;
import X.InterfaceC1565950qqv;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.feed.platform.monitor.ComponentTraceVM;
import com.ss.android.ugc.feed.platform.panel.base.EventCenter;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public abstract class BasePanelUISlotComponent extends UISlotAssem implements InterfaceC1565950qqv {
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1511));
    public final C01GW<C2254708sT> LLJJIII = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1510));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1512));

    public void eventInit(C0RD6 c0rd6) {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public void onPagePause(int i) {
    }

    public void onPageResume(int i) {
    }

    @Override // X.InterfaceC1565950qqv
    public final void setUserVisibleHint(boolean z) {
    }

    @Override // X.InterfaceC1565950qqv
    public final C2254708sT getActionHandler() {
        return (C2254708sT) this.LLJJIJI.getValue();
    }

    @Override // X.InterfaceC1565950qqv
    public final C0RJN getPanelContext() {
        return (C0RJN) this.LLJJI.getValue();
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
        if (this.LLJJIII.isInitialized()) {
            this.LLJJIII.getValue().LIZ();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        C1566140qrE.LIZ(this);
    }
}
