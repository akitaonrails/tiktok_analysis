package com.bytedance.android.livesdk.game.gamelist;

import X.C019F;
import X.C01GW;
import X.C13LE;
import X.C1637806bA;
import X.C1864790ycv;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.ViewOnFocusChangeListenerC1864710ycn;
import Y.ACListenerS161S0100000_27;
import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class GameTopicSearchAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GameTopicSearchAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/game/gamelist/GameTopicSearchViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public GameTopicSearchAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GameTopicSearchViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 46), AFwS269S0000000_27.get$arr$(31), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 198));
        this.LLJI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 197));
    }

    public final LiveEditText Go() {
        return (LiveEditText) this.LLJ.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C786410Ut5.I7(new ACListenerS161S0100000_27(this, 30), view);
        Go().setOnFocusChangeListener(new ViewOnFocusChangeListenerC1864710ycn(this, 2));
        Go().addTextChangedListener(new C1864790ycv(this, 8));
        C786410Ut5.g8((LiveIconView) this.LLJI.getValue(), new ACListenerS161S0100000_27(this, 180));
    }
}
