package com.ss.android.ugc.aweme.music.highlight;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C1220000hqw;
import X.C127G;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import Y.ACListenerS144S0100000_9;
import Y.AObjectS62S0000000_9;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class HighlightSelectBtnAssem extends UIContentAssem implements HighlightSubmitBtnShowAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public C197039127h LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final C736950SvV LLJI;
    public C127G LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(HighlightSelectBtnAssem.class, "highlightSelectViewModel", "getHighlightSelectViewModel()Lcom/ss/android/ugc/aweme/music/highlight/HighlightSelectListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1056908010) {
            return null;
        }
        return this;
    }

    public HighlightSelectBtnAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(HighlightSelectListViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1166), AFwS240S0000000_9.get$arr$(489), null, true);
        AFwS195S0000000_9 aFwS195S0000000_9 = AFwS195S0000000_9.get$arr$(245);
        this.LLJI = new C736950SvV(C13LE.LIZ(HighlightSharedViewModel.class), aFwS195S0000000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(490), new AwS553S0100000_9((AbstractC738140SxQ) this, 1167), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJIJIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJIJIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{HighlightSelectListViewModel.class, new AObjectS62S0000000_9(this, 9)}, defaultViewModelProviderFactory);
                    this.LLJIJIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.music.highlight.HighlightSubmitBtnShowAbility
    public final void G11(boolean z) {
        int i;
        C197039127h c197039127h = this.LLIZLLLIL;
        if (c197039127h != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLLLLLJ(c197039127h, i);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.yzu);
        this.LLIZLLLIL = c197039127h;
        if (c197039127h != null) {
            c197039127h.setEnabled(false);
        }
        C197039127h c197039127h2 = this.LLIZLLLIL;
        if (c197039127h2 != null) {
            C786410Ut5.U8(c197039127h2, new ACListenerS144S0100000_9(this, 73));
        }
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0OqI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C631750OqD) obj).LL;
            }
        }, null, new AwS623S0100000_9(this, 108), 6);
        C736680Sv4.LJIIIIZZ(this, this.LLJ.getValue(), new C2217381BqS() { // from class: X.0OqH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C631750OqD) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS623S0100000_9(this, 109), 4);
    }
}
