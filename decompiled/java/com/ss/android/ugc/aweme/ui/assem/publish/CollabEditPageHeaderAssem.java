package com.ss.android.ugc.aweme.ui.assem.publish;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0OM1;
import X.C1220000hqw;
import X.C1250250idj;
import X.C1251150ifB;
import X.C13LE;
import X.C1620820sHQ;
import X.C1749260vca;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736950SvV;
import X.EnumC1726100v1E;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.vm.publish.CollabEditPageContainerViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class CollabEditPageHeaderAssem extends UIContentAssem {
    public final C736950SvV LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;

    public CollabEditPageHeaderAssem() {
        AFwS213S0000000_24 aFwS213S0000000_24 = AFwS213S0000000_24.get$arr$(377);
        this.LLIZLLLIL = new C736950SvV(C13LE.LIZ(CollabEditPageContainerViewModel.class), aFwS213S0000000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(490), new AwS568S0100000_24((AbstractC738140SxQ) this, 1413), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1410));
        this.LLJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1412));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        TuxNavBar tuxNavBar = (TuxNavBar) this.LLJ.getValue();
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = LJJIJL().getContext().getString(2131828917);
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark;
        c1251150ifB.LIZJ(new AwS568S0100000_24(this, 1411));
        c0om1.LJ(c1251150ifB);
        c0om1.LIZLLL = false;
        tuxNavBar.setNavActions(c0om1);
        C1749260vca c1749260vca = (C1749260vca) this.LLJI.getValue();
        c1749260vca.setSearchBarHeight(EnumC1726100v1E.HIGH);
        c1749260vca.getEditTextView().setHint(LJJIJL().getContext().getString(2131828916));
        c1749260vca.getEditTextView().addTextChangedListener(new C1620820sHQ(this, 0));
    }
}
