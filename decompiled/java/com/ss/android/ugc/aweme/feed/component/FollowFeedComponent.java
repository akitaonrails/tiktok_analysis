package com.ss.android.ugc.aweme.feed.component;

import X.AbstractC1588450rRD;
import X.C01GW;
import X.C0SZ8;
import X.C1255920ims;
import X.C1389300mG0;
import X.C1492500owS;
import X.C1492520owU;
import X.C1582010rGp;
import X.C452501pT;
import X.C614770O9j;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent;
import com.ss.android.ugc.feed.platform.fragment.IFollowFeedFragmentAbility;
import java.util.List;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FollowFeedComponent extends HomeFeedComponent implements IFollowFeedFragmentAbility {
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS568S0100000_24(this, 396));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 395));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 397));

    @Override // com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility
    public final C1255920ims<?> KB1() {
        return ((AbstractC1588450rRD) this.LLJJIJIIJIL.getValue()).LIZ;
    }

    @Override // X.InterfaceC1603280rp8
    public final void LJJIIJ() {
        ((AbstractC1588450rRD) this.LLJJIJIIJIL.getValue()).LJI();
        if (C1492500owS.LIZ()) {
            C1492520owU.LIZ();
        }
        ((FeedFollowFragment) this.LLJJIII.getValue()).iS("slide_up");
    }

    @Override // com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility
    public final boolean LLLLL() {
        if (this.LLJJIJIIJIL.getValue() != null) {
            ((AbstractC1588450rRD) this.LLJJIJIIJIL.getValue()).LJIIIIZZ();
            ((FeedFollowFragment) this.LLJJIII.getValue()).iS("prefetch");
        }
        return ((AbstractC1588450rRD) this.LLJJIJIIJIL.getValue()).LJI();
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent, com.ss.android.ugc.feed.platform.fragment.IHomeFeedFragmentAbility
    public final C0SZ8 k4() {
        return ((BaseListFragmentPanel) this.LLJJIJI.getValue()).LJLIL();
    }

    @Override // X.InterfaceC740200T1u
    public final boolean q9() {
        C1582010rGp c1582010rGp = C1582010rGp.LIZ;
        String strLIZ = C1389300mG0.LIZ(getPanelContext());
        c1582010rGp.getClass();
        return C1582010rGp.LIZ(this, strLIZ, null);
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.IFollowFeedFragmentAbility
    public final boolean w11() {
        Fragment fragment = (Fragment) this.LLJJIII.getValue();
        fragment.getClass();
        return C614770O9j.LIZIZ.LJ().LJJIL(2, fragment);
    }

    @Override // X.InterfaceC606880NrC
    public final boolean LLZLLIL(Aweme aweme) {
        C1582010rGp.LIZ.getClass();
        C1255920ims<?> c1255920imsKB1 = KB1();
        if (c1255920imsKB1 != null) {
            return c1255920imsKB1.LJIILLIIL(aweme);
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent, X.InterfaceC606880NrC
    public final int Um(List<Aweme> list) {
        C1582010rGp.LIZ.getClass();
        C1255920ims<?> c1255920imsKB1 = KB1();
        if (c1255920imsKB1 != null) {
            return c1255920imsKB1.LJIIZILJ(list);
        }
        return 0;
    }

    @Override // X.InterfaceC606880NrC
    public final boolean deleteItem(String str) {
        return C1582010rGp.LIZIZ(C1582010rGp.LIZ, this, str);
    }
}
