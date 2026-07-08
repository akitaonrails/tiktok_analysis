package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem;

import X.C01GW;
import X.C09R3;
import X.C0HHT;
import X.C0Q5W;
import X.C0Q6F;
import X.C0Q6K;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C659520Ptu;
import X.C661490Px5;
import X.C664720Q5m;
import X.C664730Q5n;
import X.C664780Q5s;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.EnumC664680Q5i;
import X.InterfaceC1554640qYg;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC712990Rxx;
import X.InterfaceC724760Sbq;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.pages.result.common.ellipsis.core.viewmodel.SearchEllipsisVM;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.ISearchVideoHolderAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchCLASubtitleVM;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchVideoHolderVM;
import java.util.List;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchCLASubtitleAssem extends ReusedUIContentAssem<SearchCLASubtitleAssem> implements ISearchCLASubtitleAbility, InterfaceC712990Rxx<C659520Ptu>, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public C664720Q5m LLJJL;
    public Aweme LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchCLASubtitleAssem.class, "subtitleVM", "getSubtitleVM()Lcom/ss/android/ugc/aweme/search/pages/result/common/searchvideo/core/videwmodel/SearchCLASubtitleVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SearchCLASubtitleAssem.class, "searchEllipsisVM", "getSearchEllipsisVM()Lcom/ss/android/ugc/aweme/search/pages/result/common/ellipsis/core/viewmodel/SearchEllipsisVM;", 0);
        c09r3.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public SearchCLASubtitleAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchCLASubtitleVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJJJ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, c1637906bB, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 518), null, AFwS241S0000000_10.get$arr$(236));
        this.LLJJJJJIL = C737910Sx3.LIZJ(this, C13LE.LIZ(SearchVideoHolderVM.class), AFwS241S0000000_10.get$arr$(238));
        SAFHelper.LIZ.getClass();
        InterfaceC724760Sbq interfaceC724760SbqLJJJIL = SAFHelper.LJJJIL();
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SearchEllipsisVM.class);
        this.LLJJJJLIIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), interfaceC724760SbqLJJJIL, c1637906bB, new AwS554S0100000_10((C13IQ) c19719912DlLIZ2, 519), null, AFwS241S0000000_10.get$arr$(237));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new C664780Q5s(this, null));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1141746704) {
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

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.ISearchCLASubtitleAbility
    public final void xH0() {
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.ISearchCLASubtitleAbility
    public final boolean Fp1() {
        Aweme aweme = this.LLJJLIIIJLLLLLLLZ;
        if (aweme == null) {
            return false;
        }
        C664730Q5n.LIZ.getClass();
        return C664730Q5n.LJFF(aweme);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.ISearchCLASubtitleAbility
    public final void TN2() {
        C664720Q5m c664720Q5m = this.LLJJL;
        if (c664720Q5m == null) {
            c664720Q5m = null;
        }
        c664720Q5m.setSubtitleVisible(false);
    }

    public final SearchCLASubtitleVM cp() {
        return (SearchCLASubtitleVM) this.LLJJJJ.getValue(this, LLJL[0]);
    }

    public final SearchVideoHolderVM dp() {
        return (SearchVideoHolderVM) this.LLJJJJJIL.getValue();
    }

    public final void hp() {
        if (dp().LL) {
            return;
        }
        SearchCLASubtitleVM searchCLASubtitleVMCp = cp();
        C0Q5W.LIZ.getClass();
        searchCLASubtitleVMCp.yQ2(C0Q5W.LIZ() ? EnumC664680Q5i.SHOW : EnumC664680Q5i.CLOSED);
        C664720Q5m c664720Q5m = this.LLJJL;
        if (c664720Q5m == null) {
            c664720Q5m = null;
        }
        c664720Q5m.setSubtitleVisible(true);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    public final void ep(Aweme aweme) {
        C661490Px5 c661490Px5QV = null;
        ISearchVideoHolderAbility iSearchVideoHolderAbility = (ISearchVideoHolderAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISearchVideoHolderAbility.class, null);
        if (iSearchVideoHolderAbility != null) {
            c661490Px5QV = iSearchVideoHolderAbility.qV();
        }
        C664730Q5n.LIZ.getClass();
        boolean zLJFF = C664730Q5n.LJFF(aweme);
        if (c661490Px5QV != null) {
            c661490Px5QV.LJJIIJ = true;
            c661490Px5QV.LJJIII = zLJFF;
            c661490Px5QV.LJJIIZ = zLJFF;
            dp();
            c661490Px5QV.LJJIIJZLJL = C0Q6K.LIZ(aweme);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        if (!(view instanceof C664720Q5m)) {
            return;
        }
        final C664720Q5m c664720Q5m = (C664720Q5m) view;
        this.LLJJL = c664720Q5m;
        if (c664720Q5m == null) {
            c664720Q5m = null;
        }
        c664720Q5m.setDelegate(new C0Q6F() { // from class: X.0Q5l
            @Override // X.C0Q6F
            public final void LIZ() {
                int i = C664700Q5k.LIZ[c664720Q5m.getState().ordinal()];
                if (i == 1) {
                    C0Q5W.LIZ.getClass();
                    C0Q5W.LIZLLL(false);
                    this.cp().yQ2(EnumC664680Q5i.CLOSED);
                    SearchCLASubtitleVM searchCLASubtitleVMCp = this.cp();
                    C653660PkS c653660PkS = this.dp().LLILLJJLI;
                    Aweme aweme = this.LLJJLIIIJLLLLLLLZ;
                    searchCLASubtitleVMCp.getClass();
                    SearchCLASubtitleVM.wQ2(aweme, c653660PkS, "off", null);
                    return;
                }
                if (i != 2) {
                    throw new C1954807lC();
                }
                C0Q5W.LIZ.getClass();
                C0Q5W.LIZLLL(true);
                this.cp().yQ2(EnumC664680Q5i.SHOW);
                SearchCLASubtitleVM searchCLASubtitleVMCp2 = this.cp();
                C653660PkS c653660PkS2 = this.dp().LLILLJJLI;
                Aweme aweme2 = this.LLJJLIIIJLLLLLLLZ;
                searchCLASubtitleVMCp2.getClass();
                SearchCLASubtitleVM.wQ2(aweme2, c653660PkS2, "on", null);
            }
        });
        C736680Sv4.LJIIIIZZ(this, cp(), new C2217381BqS() { // from class: X.0PwR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C664740Q5o) obj).LL;
            }
        }, null, AFwS293S0000000_10.get$arr$(10), 6);
        C736680Sv4.LJIIIIZZ(this, cp(), new C2217381BqS() { // from class: X.0Q5w
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C664740Q5o) obj).LLILLJJLI;
            }
        }, null, AFwS293S0000000_10.get$arr$(11), 6);
        C736680Sv4.LJIIIIZZ(this, cp(), new C2217381BqS() { // from class: X.0Q5y
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C664740Q5o) obj).LLILLL;
            }
        }, null, AFwS293S0000000_10.get$arr$(12), 6);
        C736680Sv4.LJIIIIZZ(this, cp(), new C2217381BqS() { // from class: X.0Q60
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C664740Q5o) obj).LLILZ;
            }
        }, null, AFwS293S0000000_10.get$arr$(13), 6);
        AssemViewModel.asyncSubscribe$default(cp(), new C2217381BqS() { // from class: X.0Q5u
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C664740Q5o) obj).LLILZIL;
            }
        }, null, AFwS241S0000000_10.get$arr$(235), null, new AwS589S0100000_10(this, 217), 10, null);
        C736680Sv4.LJIIIIZZ(this, dp(), new C2217381BqS() { // from class: X.0Q63
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0H89) obj).LL;
            }
        }, null, AFwS293S0000000_10.get$arr$(7), 6);
        C736680Sv4.LJIIIIZZ(this, dp(), new C2217381BqS() { // from class: X.0Pvs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0H89) obj).LLILLJJLI;
            }
        }, null, AFwS293S0000000_10.get$arr$(8), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJLIIL.getValue(this, LLJL[1]), new C2217381BqS() { // from class: X.0Q64
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HXC) obj).LL;
            }
        }, null, AFwS293S0000000_10.get$arr$(9), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C659520Ptu c659520Ptu) {
        C659520Ptu c659520Ptu2 = c659520Ptu;
        this.LLJJLIIIJLLLLLLLZ = c659520Ptu2.LL;
        C664720Q5m c664720Q5m = this.LLJJL;
        C664720Q5m c664720Q5m2 = null;
        if (c664720Q5m == null) {
            c664720Q5m = null;
        }
        c664720Q5m.setVideoPlaying(false);
        C664720Q5m c664720Q5m3 = this.LLJJL;
        if (c664720Q5m3 == null) {
            c664720Q5m3 = null;
        }
        c664720Q5m3.setText("");
        C664720Q5m c664720Q5m4 = this.LLJJL;
        if (c664720Q5m4 != null) {
            c664720Q5m2 = c664720Q5m4;
        }
        c664720Q5m2.setSubtitleVisible(false);
        ep(c659520Ptu2.LL);
    }

    @Override // X.InterfaceC712990Rxx
    public final boolean ur(C659520Ptu c659520Ptu) {
        Aweme aweme = c659520Ptu.LL;
        dp();
        return C0Q6K.LIZ(aweme);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C659520Ptu c659520Ptu) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
