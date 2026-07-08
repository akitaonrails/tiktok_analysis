package com.ss.android.ugc.aweme.vibefeed.feed.topbar.assem;

import X.C019F;
import X.C09R3;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C636770OyJ;
import X.C723580SZw;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C844470XAv;
import X.DialogC1389620mGW;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedConsumeViewModel;
import com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedInteractViewModel;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import wh6.AbS703S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class VibeFeedMenuAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C636770OyJ.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJ;
    public final AssemVMLazy LLJI;
    public DialogC1389620mGW LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VibeFeedMenuAssem.class, "interactVM", "getInteractVM()Lcom/ss/android/ugc/aweme/vibefeed/feed/viewmodel/VibeFeedInteractViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(VibeFeedMenuAssem.class, "consumeVM", "getConsumeVM()Lcom/ss/android/ugc/aweme/vibefeed/feed/viewmodel/VibeFeedConsumeViewModel;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public VibeFeedMenuAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VibeFeedInteractViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ, 1506), AFwS264S0000000_24.get$arr$(532), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(VibeFeedConsumeViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ2, 1507), AFwS264S0000000_24.get$arr$(533), null, true);
    }

    public final C636770OyJ Go() {
        return (C636770OyJ) this.LLIZLLLIL.getValue();
    }

    public final String Ho(int i) {
        Context context = getContext();
        if (context == null) {
            C844470XAv.LIZ.getClass();
            context = C844470XAv.LIZ();
        }
        return context.getString(i);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C786410Ut5.LJLLLLLL(0, view);
        C786410Ut5.I7(new AbS703S0100000_24(this, 10), view);
    }
}
