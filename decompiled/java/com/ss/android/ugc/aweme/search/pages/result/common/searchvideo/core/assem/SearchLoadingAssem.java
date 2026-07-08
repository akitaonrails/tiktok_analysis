package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem;

import X.C01GW;
import X.C0HHT;
import X.C0P92;
import X.C0PCU;
import X.C0R4E;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C659520Ptu;
import X.C661470Px3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC661400Pww;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.ISearchVideoHolderAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchLoadingVM;
import java.util.List;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchLoadingAssem extends ReusedUIContentAssem<SearchLoadingAssem> implements InterfaceC712990Rxx<C659520Ptu> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchLoadingAssem.class, "searchLoadingVM", "getSearchLoadingVM()Lcom/ss/android/ugc/aweme/search/pages/result/common/searchvideo/core/videwmodel/SearchLoadingVM;", 0);
        C13LE.LIZ.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SearchLoadingAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchLoadingVM.class);
        this.LLJJJJ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 528), null, AFwS241S0000000_10.get$arr$(244));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 526));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 527));
        this.LLJJL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 525));
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        InterfaceC1731706qJ interfaceC1731706qJ = this.LLJJJJ;
        InterfaceC2217461Bqa<?>[] interfaceC2217461BqaArr = LLJJLIIIJLLLLLLLZ;
        final SearchLoadingVM searchLoadingVM = (SearchLoadingVM) interfaceC1731706qJ.getValue(this, interfaceC2217461BqaArr[0]);
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        searchLoadingVM.getClass();
        ISearchVideoHolderAbility iSearchVideoHolderAbility = (ISearchVideoHolderAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, ISearchVideoHolderAbility.class, null);
        if (iSearchVideoHolderAbility != null) {
            InterfaceC661400Pww interfaceC661400Pww = new InterfaceC661400Pww() { // from class: X.0Pwv
                @Override // X.InterfaceC661400Pww
                public final void LIZIZ(EnumC661340Pwq enumC661340Pwq) {
                    int i = C660960PwE.LIZ[enumC661340Pwq.ordinal()];
                    if (i != 1 && i != 2) {
                        if (i != 3 && i != 4) {
                            return;
                        }
                        searchLoadingVM.setStateImmediate(AFwS241S0000000_10.get$arr$(559));
                        return;
                    }
                    searchLoadingVM.setStateImmediate(AFwS241S0000000_10.get$arr$(564));
                }
            };
            C661470Px3 c661470Px3X4 = iSearchVideoHolderAbility.X4();
            if (c661470Px3X4 != null) {
                c661470Px3X4.LIZLLL(interfaceC661400Pww);
            }
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJ.getValue(this, interfaceC2217461BqaArr[0]), new C2217381BqS() { // from class: X.0Pwx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C2003807t6) obj).LL);
            }
        }, null, AFwS293S0000000_10.get$arr$(22), 6);
        C0P92.LIZ((View) this.LLJJL.getValue(), new C0R4E(this, 4));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C659520Ptu c659520Ptu) {
        this.LLJJJJ.getValue(this, LLJJLIIIJLLLLLLLZ[0]).getClass();
    }

    @Override // X.InterfaceC712990Rxx
    public final boolean ur(C659520Ptu c659520Ptu) {
        return C0PCU.LIZJ();
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C659520Ptu c659520Ptu) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
