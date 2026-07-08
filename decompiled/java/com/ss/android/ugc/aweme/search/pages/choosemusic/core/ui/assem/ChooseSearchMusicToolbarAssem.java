package com.ss.android.ugc.aweme.search.pages.choosemusic.core.ui.assem;

import X.AnonymousClass0207;
import X.C019F;
import X.C06T3;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C426750GoL;
import X.C657990PrR;
import X.C661350Pwr;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.search.pages.choosemusic.sug.core.viewmodel.ChooseSearchMusicViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS616S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class ChooseSearchMusicToolbarAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public TuxIconView LLIZLLLIL;
    public TuxIconView LLJ;
    public final AssemVMLazy LLJI;
    public final C1559260qg8 LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ChooseSearchMusicToolbarAssem.class, "searchMusicVM", "getSearchMusicVM()Lcom/ss/android/ugc/aweme/search/pages/choosemusic/sug/core/viewmodel/ChooseSearchMusicViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ChooseSearchMusicToolbarAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ChooseSearchMusicViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 779), AFwS229S0000000_2.get$arr$(481), null, true);
        this.LLJIJIL = new C1559260qg8(new C723590SZx(this, C06T3.class, null), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLIZLLLIL = (TuxIconView) view.findViewById(R.id.voice_search_button_toolbar);
        this.LLJ = (TuxIconView) view.findViewById(R.id.ua3);
        boolean z = ((C06T3) this.LLJIJIL.getValue()).LLILLL;
        boolean z2 = ((C06T3) this.LLJIJIL.getValue()).LLILZ;
        if (!z) {
            if (z2) {
                C661350Pwr.LJIIL(this.LLIZLLLIL);
                TuxIconView tuxIconView = this.LLIZLLLIL;
                if (tuxIconView != null) {
                    C426750GoL.LJIIIZ(tuxIconView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, false, 26);
                }
                C661350Pwr.LIZJ(this.LLJ);
            }
        } else if (z2) {
            C661350Pwr.LJIIL(this.LLIZLLLIL);
            C661350Pwr.LJIIL(this.LLJ);
            TuxIconView tuxIconView2 = this.LLIZLLLIL;
            if (tuxIconView2 != null) {
                C426750GoL.LJIIIZ(tuxIconView2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), null, null, null, false, 30);
            }
            TuxIconView tuxIconView3 = this.LLJ;
            if (tuxIconView3 != null) {
                C426750GoL.LJIIIZ(tuxIconView3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), null, false, 26);
            }
        } else {
            C661350Pwr.LJIIL(this.LLJ);
            C661350Pwr.LIZJ(this.LLIZLLLIL);
            C657990PrR.LIZJ(this.LLJ, AnonymousClass0207.get$arr$(128));
        }
        if (((C06T3) this.LLJIJIL.getValue()).LLILZ) {
            AssemVMLazy assemVMLazy = this.LLJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
            C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0Qo3
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((C681100Qnc) obj).LL);
                }
            }, null, new AwS616S0100000_2(this, 138), 6);
        }
    }
}
