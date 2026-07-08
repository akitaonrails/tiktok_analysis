package com.ss.android.ugc.aweme.vibefeed.feed.topbar.assem;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0P4Y;
import X.C1220000hqw;
import X.C13LE;
import X.C1559260qg8;
import X.C1566140qrE;
import X.C299750Boz;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C636770OyJ;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.EnumC452301pR;
import X.InterfaceC1565950qqv;
import Y.ARunnableS14S1100000_9;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedDiggDetailListVM;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS127S0110000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class VibeFeedDateInfoAssem extends BasePanelUIComponent {
    public final C01GW LLJIJIL;
    public final C630740Ooa LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C736950SvV LLJJ;
    public final C1559260qg8 LLJJI;

    public final TuxTextView Go() {
        return (TuxTextView) this.LLJILJILJ.getValue();
    }

    public VibeFeedDateInfoAssem() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS553S0100000_9((InterfaceC1565950qqv) this, 1596), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS127S0110000_9(false, (InterfaceC1565950qqv) this, 12));
        }
        this.LLJIJIL = c01gwLIZIZ;
        this.LLJILJIL = C628500Oky.LIZ(new AwS553S0100000_9(this, 1598));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1594));
        this.LLJILLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1595));
        AFwS195S0000000_9 aFwS195S0000000_9 = AFwS195S0000000_9.get$arr$(350);
        this.LLJJ = new C736950SvV(C13LE.LIZ(VibeFeedDiggDetailListVM.class), aFwS195S0000000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(672), new AwS553S0100000_9((AbstractC738140SxQ) this, 1597), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJJI = new C1559260qg8(new C723580SZw(this, C636770OyJ.class, null), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        super.onViewCreated(view);
        TuxTextView tuxTextViewGo = Go();
        if (tuxTextViewGo != null) {
            C786410Ut5.LLLLZLL(tuxTextViewGo, 0);
        }
        LinearLayout linearLayout = (LinearLayout) this.LLJILLL.getValue();
        if (linearLayout != null) {
            C786410Ut5.LJZL(8, linearLayout);
        }
        C636770OyJ c636770OyJ = (C636770OyJ) this.LLJJI.getValue();
        String str2 = null;
        if (c636770OyJ != null) {
            str = c636770OyJ.LLIZLLLIL;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "click_chat_message")) {
            C636770OyJ c636770OyJ2 = (C636770OyJ) this.LLJJI.getValue();
            if (c636770OyJ2 != null) {
                str2 = c636770OyJ2.LLILZLL;
            }
            TuxTextView tuxTextViewGo2 = Go();
            if (tuxTextViewGo2 != null) {
                HandlerHook.viewPost(tuxTextViewGo2, new ARunnableS14S1100000_9(this, str2, 8));
                return;
            }
            return;
        }
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLJILJIL.getValue();
        if (iViewPagerComponentAbility == null) {
            return;
        }
        iViewPagerComponentAbility.Bv0(new C0P4Y(this, 5));
    }
}
