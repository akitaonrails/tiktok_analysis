package com.ss.android.ugc.aweme.search.pages.choosemusic.core.ui.assem;

import X.C019F;
import X.C06T3;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
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
public final class ChooseSearchMusicEditTextAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public TuxIconView LLJI;
    public TuxIconView LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ChooseSearchMusicEditTextAssem.class, "searchMusicVM", "getSearchMusicVM()Lcom/ss/android/ugc/aweme/search/pages/choosemusic/sug/core/viewmodel/ChooseSearchMusicViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ChooseSearchMusicEditTextAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ChooseSearchMusicViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 778), AFwS229S0000000_2.get$arr$(480), null, true);
        this.LLJ = new C1559260qg8(new C723590SZx(this, C06T3.class, null), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJI = (TuxIconView) view.findViewById(R.id.lbw);
        this.LLJIJIL = (TuxIconView) view.findViewById(R.id.voice_search_button_edit);
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0Qo2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C681100Qnc) obj).LL);
            }
        }, null, new AwS616S0100000_2(this, 137), 6);
    }
}
