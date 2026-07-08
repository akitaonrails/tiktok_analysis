package com.ss.android.ugc.aweme.friendstab.component;

import X.C01GW;
import X.C09JN;
import X.C0SZ8;
import X.C1255920ims;
import X.C1492500owS;
import X.C1492520owU;
import X.C1582010rGp;
import X.C1587320rPO;
import X.C1593830rZt;
import X.C1701940uOG;
import X.C452501pT;
import Y.AfS193S0100000_24;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent;
import com.ss.android.ugc.feed.platform.fragment.IFriendsFeedFragmentAbility;
import java.util.List;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsFeedComponent extends HomeFeedComponent implements IFriendsFeedFragmentAbility {
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS568S0100000_24(this, 426));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 427));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 428));

    public final C1587320rPO Ho() {
        return (C1587320rPO) this.LLJJIJIIJIL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.IFriendsFeedFragmentAbility
    public final void Kb() {
        C1593830rZt.LIZIZ.LIZLLL(31).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS193S0100000_24(this, 36), new C09JN() { // from class: X.06ci
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("FriendsFeedComponent@e3d9.filterAlreadyReadFeedData$2");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("filterAlreadyReadFeedData error and ");
                sbLIZ.append(((Throwable) obj).getStackTrace());
                C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
                C1C7U.LIZIZ("FriendsFeedComponent@e3d9.filterAlreadyReadFeedData$2");
            }
        });
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent, com.ss.android.ugc.feed.platform.fragment.IHomeFeedFragmentAbility
    public final C0SZ8 k4() {
        return ((BaseListFragmentPanel) this.LLJJIJI.getValue()).LJLIL();
    }

    @Override // X.InterfaceC740200T1u
    public final boolean q9() {
        C1582010rGp c1582010rGp = C1582010rGp.LIZ;
        String str = ((FeedFragment) this.LLJJIII.getValue()).LLILLJJLI;
        c1582010rGp.getClass();
        return C1582010rGp.LIZ(this, str, null);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility
    public final C1255920ims KB1() {
        return Ho().LIZLLL;
    }

    @Override // X.InterfaceC1603280rp8
    public final void LJJIIJ() {
        Ho().LIZIZ();
        if (C1492500owS.LIZ()) {
            C1492520owU.LIZ();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility
    public final boolean LLLLL() {
        boolean zLJI = MethodIDManager.LJI(137755);
        Ho().LIZLLL.LLIZLLLIL = true;
        boolean zLIZIZ = Ho().LIZIZ();
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return zLIZIZ;
    }

    @Override // X.InterfaceC606880NrC
    public final boolean LLZLLIL(Aweme aweme) {
        C1582010rGp.LIZ.getClass();
        C1255920ims c1255920imsKB1 = KB1();
        if (c1255920imsKB1 != null) {
            return c1255920imsKB1.LJIILLIIL(aweme);
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent, X.InterfaceC606880NrC
    public final int Um(List<Aweme> list) {
        C1582010rGp.LIZ.getClass();
        C1255920ims c1255920imsKB1 = KB1();
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
