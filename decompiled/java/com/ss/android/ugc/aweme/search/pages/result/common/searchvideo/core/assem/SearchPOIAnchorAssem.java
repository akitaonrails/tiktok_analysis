package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem;

import X.C01GW;
import X.C07BW;
import X.C0HHT;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C435810H7b;
import X.C436000H7u;
import X.C452501pT;
import X.C659520Ptu;
import X.C660690Pvn;
import X.C660810Pvz;
import X.C660840Pw2;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC712990Rxx;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.ISearchVideoHolderAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchPOIAnchorViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchVideoHolderVM;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchPOIAnchorAssem extends ReusedUIContentAssem<SearchPOIAnchorAssem> implements InterfaceC712990Rxx<C659520Ptu>, ISearchVideoBottomAnchorAbility, InterfaceC1554640qYg {
    public static final C660690Pvn LLJLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public static final int LLJLLL;
    public C660840Pw2 LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public int LLJJJJLIIL = 1;
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 529));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 530));
    public final InterfaceC1731706qJ LLJL;
    public final C01GW LLJLIL;
    public final C436000H7u LLJLILLLLZIIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Pvn] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchPOIAnchorAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/search/pages/result/common/searchvideo/core/videwmodel/SearchPOIAnchorViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJLL = new Object() { // from class: X.0Pvn
        };
        LLJLLL = R.id.u6w;
    }

    public SearchPOIAnchorAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchPOIAnchorViewModel.class);
        this.LLJL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 531), null, AFwS241S0000000_10.get$arr$(245));
        this.LLJLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(SearchVideoHolderVM.class), AFwS241S0000000_10.get$arr$(246));
        this.LLJLILLLLZIIL = new C436000H7u(45, 0.3f);
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 329572773) {
            return null;
        }
        return this;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final C660810Pvz cp() {
        return (C660810Pvz) this.LLJJL.getValue();
    }

    public final SearchPOIAnchorViewModel dp() {
        return (SearchPOIAnchorViewModel) this.LLJL.getValue(this, LLJLLIL[0]);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ISearchVideoHolderAbility iSearchVideoHolderAbility;
        dp().LL = ((SearchVideoHolderVM) this.LLJLIL.getValue()).LLILLL;
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.udn);
        if (viewStub != null) {
            C786410Ut5.LJLLLL(viewStub);
        }
        cp().LIZIZ(LLJLLL, view);
        this.LLJJJJ = cp().LIZLLL;
        this.LLJJJJJIL = cp().LJ;
        C660840Pw2 c660840Pw2 = this.LLJJJJ;
        if (c660840Pw2 == null) {
            return;
        }
        C435810H7b c435810H7b = new C435810H7b(1, new AwS589S0100000_10(this, 220), null);
        ISearchVideoHolderAbility iSearchVideoHolderAbility2 = (ISearchVideoHolderAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (iSearchVideoHolderAbility2 != null) {
            iSearchVideoHolderAbility2.Bd2(c660840Pw2, c435810H7b);
        }
        TuxTextView tuxTextView = this.LLJJJJJIL;
        if (tuxTextView != null && (iSearchVideoHolderAbility = (ISearchVideoHolderAbility) this.LLJJLIIIJLLLLLLLZ.getValue()) != null) {
            iSearchVideoHolderAbility.Bd2(tuxTextView, c435810H7b);
        }
        C736680Sv4.LJIIIIZZ(this, dp(), new C2217381BqS() { // from class: X.0Pvr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C660720Pvq) obj).LL;
            }
        }, C736820SvI.LJ(), new AwS624S0100000_10(c660840Pw2, 56), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLIL.getValue(), new C2217381BqS() { // from class: X.0Pvp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0H89) obj).LLILLJJLI;
            }
        }, null, AFwS293S0000000_10.get$arr$(23), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C659520Ptu c659520Ptu) {
        C659520Ptu c659520Ptu2 = c659520Ptu;
        SearchPOIAnchorViewModel searchPOIAnchorViewModelDp = dp();
        searchPOIAnchorViewModelDp.getClass();
        if (((Number) C07BW.LIZ.getValue()).intValue() == 0) {
            searchPOIAnchorViewModelDp.setStateImmediate(new AwS589S0100000_10(c659520Ptu2, 613));
        } else {
            searchPOIAnchorViewModelDp.setState(new AwS589S0100000_10(c659520Ptu2, 614));
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C659520Ptu c659520Ptu) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C659520Ptu c659520Ptu) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
