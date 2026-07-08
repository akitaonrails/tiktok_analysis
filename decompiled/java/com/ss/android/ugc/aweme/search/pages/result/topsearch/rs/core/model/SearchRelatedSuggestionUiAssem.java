package com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model;

import X.C01D1;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C2263001Dhq;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.AFwS325S0000000_35;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS649S0100000_35;

/* JADX INFO: loaded from: classes36.dex */
public class SearchRelatedSuggestionUiAssem extends UIContentAssem {
    public static final C2263001Dhq LLJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public static WeakReference<View> LLJIJIL;
    public final AssemVMLazy LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchRelatedSuggestionUiAssem.class, "vmAssem", "getVmAssem()Lcom/ss/android/ugc/aweme/search/pages/result/topsearch/rs/core/model/SearchRelatedSuggestionVM;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJ = new C2263001Dhq();
        LLJIJIL = new WeakReference<>(null);
    }

    public SearchRelatedSuggestionUiAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchRelatedSuggestionVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 893), AFwS283S0000000_35.get$arr$(81), null, true);
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.assem.arch.view.UIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        super.xo();
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.1Dhs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0QQO) obj).LL);
            }
        }, null, new AwS649S0100000_35(this, 17), 6);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.1Dhu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0QQO) obj).LLILLJJLI);
            }
        }, null, AFwS293S0000000_10.get$arr$(30), 6);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.1Dhw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0QQO) obj).LLILLL);
            }
        }, null, AFwS325S0000000_35.get$arr$(1), 6);
    }

    public final SearchRelatedSuggestionVM Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (SearchRelatedSuggestionVM) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        C2263001Dhq c2263001Dhq = LLJ;
        boolean z = Go().getState().LL;
        SearchRelatedSuggestionVM searchRelatedSuggestionVMGo = Go();
        c2263001Dhq.getClass();
        C2263001Dhq.LIZLLL(z, searchRelatedSuggestionVMGo);
        C2263001Dhq.LIZJ(Go().getState().LLILLJJLI);
    }
}
