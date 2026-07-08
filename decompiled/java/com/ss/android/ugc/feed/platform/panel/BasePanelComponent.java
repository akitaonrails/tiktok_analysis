package com.ss.android.ugc.feed.platform.panel;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0PC4;
import X.C0RD6;
import X.C0RJN;
import X.C0SU8;
import X.C1566140qrE;
import X.C1566150qrF;
import X.C1566160qrG;
import X.C2254708sT;
import X.C452501pT;
import X.InterfaceC1565950qqv;
import com.ss.android.ugc.feed.platform.monitor.ComponentTraceVM;
import com.ss.android.ugc.feed.platform.panel.base.EventCenter;

/* JADX INFO: loaded from: classes25.dex */
public class BasePanelComponent extends AbstractC738140SxQ implements InterfaceC1565950qqv {
    public static final int $stable = 8;
    public final C01GW _panelContext$delegate = C452501pT.LIZIZ(new C0SU8(this));
    public final C01GW<C2254708sT> _actionHandler = C452501pT.LIZIZ(new C1566160qrG(this));
    public final C01GW actionHandler$delegate = C452501pT.LIZIZ(new C1566150qrF(this));

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

    private final C0RJN get_panelContext() {
        return (C0RJN) this._panelContext$delegate.getValue();
    }

    @Override // X.InterfaceC1565950qqv
    public C2254708sT getActionHandler() {
        return (C2254708sT) this.actionHandler$delegate.getValue();
    }

    @Override // X.InterfaceC691700RBg
    public EventCenter getEventCenter() {
        return getPanelContext().LIZIZ;
    }

    @Override // X.InterfaceC1565950qqv
    public C0RJN getPanelContext() {
        return get_panelContext();
    }

    @Override // X.AbstractC738140SxQ
    public void onCreate() {
        super.onCreate();
        ComponentTraceVM componentTraceVMLIZ = C0PC4.LIZ(getPanelContext().LJ);
        if (componentTraceVMLIZ == null) {
            return;
        }
        componentTraceVMLIZ.LL++;
    }

    @Override // X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        if (this._actionHandler.isInitialized()) {
            this._actionHandler.getValue().LIZ();
        }
    }

    @Override // X.AbstractC738140SxQ
    public void onParentSet() {
        super.onParentSet();
        C1566140qrE.LIZ(this);
    }
}
