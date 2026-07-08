package com.ss.android.ugc.nearby.roaming;

import X.C019F;
import X.C01GW;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class RegionSearchListAssem extends UIListContentAssem<RegionSearchViewModel> implements IRegionSearchListAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2367));
    public final AssemVMLazy LLJ;
    public C1749280vcc LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RegionSearchListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/nearby/roaming/RegionSearchViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public RegionSearchListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RegionSearchViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 2369), AFwS256S0000000_18.get$arr$(806), null, true);
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1695440686) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLIZLLLIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZ = 5;
        c20603715jn.LIZJ = false;
        c20603715jn.LIZLLL = LoadingFooterCell.class;
        return c20603715jn;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: No, reason: merged with bridge method [inline-methods] */
    public final RegionSearchViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (RegionSearchViewModel) assemVMLazy.getValue();
    }

    public final void Lo() {
        if (((ViewGroup) LJJIJL()).indexOfChild(Go()) != -1) {
            C786410Ut5.LJJJZ(Go(), (FrameLayout) LJJIJL());
        }
    }

    @Override // com.ss.android.ugc.nearby.roaming.IRegionSearchListAbility
    public final void hide() {
        Go().getState().LJFF(null);
        Lo();
        C1749280vcc c1749280vcc = this.LLJI;
        C786410Ut5.LLLZLZ(c1749280vcc != null ? c1749280vcc : null, 8);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.nearby.roaming.IRegionSearchListAbility
    public final void show() {
        Lo();
        C1749280vcc c1749280vcc = this.LLJI;
        if (c1749280vcc == null) {
            c1749280vcc = null;
        }
        C786410Ut5.LLLZLZ(c1749280vcc, 0);
        C1749280vcc c1749280vcc2 = this.LLJI;
        (c1749280vcc2 != null ? c1749280vcc2 : null).LJ();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Go().LJIILJJIL(NearbyRegionCell.class);
        C1749280vcc c1749280vcc = (C1749280vcc) ((View) view.getParent()).findViewById(R.id.ueo);
        this.LLJI = c1749280vcc;
        C1749280vcc c1749280vcc2 = null;
        if (c1749280vcc == null) {
            c1749280vcc = null;
        }
        c1749280vcc.setTopMargin(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(73)));
        C1749280vcc c1749280vcc3 = this.LLJI;
        if (c1749280vcc3 != null) {
            c1749280vcc2 = c1749280vcc3;
        }
        c1749280vcc2.setButtonTopMargin(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(205)));
        AssemViewModel.asyncSubscribe$default(Jo(), new C2217381BqS() { // from class: X.0hLh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1201730hNT c1201730hNT = (C1201730hNT) obj;
                c1201730hNT.getClass();
                return C627260Oiy.LIZLLL(c1201730hNT);
            }
        }, null, new AwS597S0100000_18(this, 608), new AwS562S0100000_18(this, 2368), new AwS597S0100000_18(this, 609), 2, null);
    }
}
