package com.ss.android.ugc.aweme.search.pages.choosemusic.core.ui.assem;

import X.C019F;
import X.C01GW;
import X.C06T3;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.pages.choosemusic.sug.core.viewmodel.ChooseSearchMusicViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS616S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class ChooseSearchMusicActionButtonAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public TuxTextView LLJILJILJ;
    public TuxTextView LLJILLL;
    public LinearLayout LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ChooseSearchMusicActionButtonAssem.class, "searchMusicVM", "getSearchMusicVM()Lcom/ss/android/ugc/aweme/search/pages/choosemusic/sug/core/viewmodel/ChooseSearchMusicViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ChooseSearchMusicActionButtonAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ChooseSearchMusicViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 777), AFwS229S0000000_2.get$arr$(479), null, true);
        this.LLJ = new C1559260qg8(new C723590SZx(this, C06T3.class, null), checkSupervisorPrepared());
        this.LLJI = C452501pT.LIZIZ(new AwS546S0100000_2(this, 775));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 776));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 774));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJILJILJ = (TuxTextView) view.findViewById(R.id.tv_search_cancel);
        this.LLJILLL = (TuxTextView) view.findViewById(R.id.tv_search_action);
        this.LLJJ = (LinearLayout) view.findViewById(R.id.owb);
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0Qo1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C681100Qnc) obj).LL);
            }
        }, null, new AwS616S0100000_2(this, 136), 6);
    }
}
