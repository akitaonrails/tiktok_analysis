package com.ss.android.ugc.feed.platform.tablet;

import X.C01GW;
import X.C1558520qew;
import X.C1563530qn1;
import X.C452501pT;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class TabletExternalDeviceFeedScrollRecordComponent extends BasePanelComponent implements ITabletExternalDeviceFeedScrollRecordAbility, InterfaceC1554640qYg {
    public final C01GW LL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(422));

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -832216322) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.tablet.ITabletExternalDeviceFeedScrollRecordAbility
    public final void Iu1() {
        C1563530qn1 c1563530qn1 = (C1563530qn1) this.LL.getValue();
        c1563530qn1.LL = false;
        c1563530qn1.LLILLJJLI = true;
    }

    @Override // com.ss.android.ugc.feed.platform.tablet.ITabletExternalDeviceFeedScrollRecordAbility
    public final void PD2() {
        C1563530qn1 c1563530qn1 = (C1563530qn1) this.LL.getValue();
        c1563530qn1.LL = true;
        c1563530qn1.LLILLJJLI = false;
    }

    @Override // com.ss.android.ugc.feed.platform.tablet.ITabletExternalDeviceFeedScrollRecordAbility
    public final void pj2() {
        C1563530qn1 c1563530qn1 = (C1563530qn1) this.LL.getValue();
        c1563530qn1.LL = false;
        c1563530qn1.LLILLJJLI = false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IViewPagerComponentAbility.class, null);
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0((C1563530qn1) this.LL.getValue());
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IViewPagerComponentAbility.class, null);
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Xl0((C1563530qn1) this.LL.getValue());
        }
    }
}
