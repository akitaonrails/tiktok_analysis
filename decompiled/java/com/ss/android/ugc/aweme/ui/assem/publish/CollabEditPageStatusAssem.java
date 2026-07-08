package com.ss.android.ugc.aweme.ui.assem.publish;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C1220000hqw;
import X.C13LE;
import X.C1749280vcc;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.vm.publish.CollabEditPageContainerViewModel;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class CollabEditPageStatusAssem extends UIContentAssem {
    public final C736950SvV LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;

    public final C1749280vcc Go() {
        return (C1749280vcc) this.LLJ.getValue();
    }

    public CollabEditPageStatusAssem() {
        AFwS213S0000000_24 aFwS213S0000000_24 = AFwS213S0000000_24.get$arr$(381);
        this.LLIZLLLIL = new C736950SvV(C13LE.LIZ(CollabEditPageContainerViewModel.class), aFwS213S0000000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(494), new AwS568S0100000_24((AbstractC738140SxQ) this, 1423), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1424));
        this.LLJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1422));
        this.LLJIJIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(380));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C786410Ut5.LLLZLZ(Go(), 8);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLIZLLLIL.getValue(), new C2217381BqS() { // from class: X.0r0q
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1572540r1Y) obj).LLILLJJLI;
            }
        }, null, new AwS638S0100000_24(this, 117), 6);
    }
}
