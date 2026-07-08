package com.ss.android.ugc.aweme.poi.mapmode.assem;

import X.C019F;
import X.C01D1;
import X.C09R3;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.poi.PoiBaseFragment;
import com.ss.android.ugc.aweme.poi.mapmode.cell.PoiMapModeNavTabCategoryCell;
import com.ss.android.ugc.aweme.poi.mapmode.cell.PoiMapModeNavTabSelectCell;
import com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModeNavTabVM;
import com.ss.android.ugc.aweme.poi.mapmode.viewmodel.PoiMapModePageVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapModeNavTabAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public ViewOnAttachStateChangeListenerC20604515jv LLJI;
    public boolean LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiMapModeNavTabAssem.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/mapmode/viewmodel/PoiMapModePageVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PoiMapModeNavTabAssem.class, "navBarVM", "getNavBarVM()Lcom/ss/android/ugc/aweme/poi/mapmode/viewmodel/PoiMapModeNavTabVM;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public PoiMapModeNavTabAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiMapModePageVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ, 1462), AFwS256S0000000_18.get$arr$(508), null, true);
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PoiMapModeNavTabVM.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ2, 1463), AFwS256S0000000_18.get$arr$(509), null, true);
        this.LLJIJIL = true;
    }

    public final PoiMapModeNavTabVM Go() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (PoiMapModeNavTabVM) assemVMLazy.getValue();
    }

    public final PoiMapModePageVM Ho() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (PoiMapModePageVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        PoiBaseFragment poiBaseFragment;
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.p2a);
        this.LLJI = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.bringToFront();
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJI;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            viewOnAttachStateChangeListenerC20604515jv2.setLifecycleOwner(this);
            viewOnAttachStateChangeListenerC20604515jv2.LJIILJJIL(PoiMapModeNavTabSelectCell.class);
            viewOnAttachStateChangeListenerC20604515jv2.LJIILJJIL(PoiMapModeNavTabCategoryCell.class);
            viewOnAttachStateChangeListenerC20604515jv2.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv2.getContext(), 0, false));
        }
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0gYX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1174440gfS) obj).LLILLJJLI;
            }
        }, null, new AwS632S0100000_18(this, 276), 6);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0gPK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1174440gfS) obj).LLILLL;
            }
        }, null, new AwS632S0100000_18(this, 277), 6);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0c17
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C995660c16) obj).LL;
            }
        }, null, new AwS632S0100000_18(this, 278), 6);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(this, 1461);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if ((fragmentLJI instanceof PoiBaseFragment) && (poiBaseFragment = (PoiBaseFragment) fragmentLJI) != null) {
            poiBaseFragment.LLIZLLLIL = awS562S0100000_18;
        }
    }
}
