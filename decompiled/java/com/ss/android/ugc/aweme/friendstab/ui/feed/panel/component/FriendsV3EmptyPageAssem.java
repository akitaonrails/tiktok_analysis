package com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component;

import X.C019F;
import X.C01GW;
import X.C0N06;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC2217461Bqa;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsV3EmptyPageAssem extends UIContentAssem implements FriendsV3EmptyPageAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final AssemVMLazy LLIZLLLIL;
    public final C630740Ooa LLJ;
    public final C01GW LLJI;
    public View LLJIJIL;
    public final C01GW LLJILJIL;
    public final C630740Ooa LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public final C630740Ooa LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsV3EmptyPageAssem.class, "feedViewModel", "getFeedViewModel()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3FeedListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FriendsV3EmptyPageAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FriendsV3FeedListViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 511), AFwS264S0000000_24.get$arr$(152), null, true);
        this.LLJ = C628500Oky.LIZ(new AwS568S0100000_24(this, 508));
        this.LLJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 507));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 509));
        this.LLJILJILJ = C628500Oky.LIZ(new AwS568S0100000_24(this, 510));
        this.LLJJI = C628500Oky.LIZ(new AwS568S0100000_24(this, 506));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C0N06 c0n06;
        super.onDestroy();
        KeyEvent.Callback callback = this.LLJIJIL;
        if ((callback instanceof C0N06) && (c0n06 = (C0N06) callback) != null) {
            c0n06.LIZLLL();
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), FriendsV3EmptyPageAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3EmptyPageAbility
    public final boolean cR1() {
        return this.LLJJ;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, FriendsV3EmptyPageAbility.class, null, null);
        }
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0qsR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1223430hwT) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 33), 4);
    }
}
