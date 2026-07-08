package com.ss.android.ugc.aweme.friendstab.text.assem;

import X.C019F;
import X.C06MR;
import X.C09R3;
import X.C0RJN;
import X.C0W17;
import X.C1389300mG0;
import X.C13LE;
import X.C1558520qew;
import X.C1578630rBN;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2217381BqS;
import X.C724240Sb0;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.friendstab.text.viewmodel.FriendsV3TextFeedListViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3FeedListAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.IFriendsV3RefreshAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class FriendsV3TextFeedListAssem extends FriendsV3FeedListAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public final AssemVMLazy LLJLILLLLZIIL;
    public final AssemVMLazy LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsV3TextFeedListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/friendstab/text/viewmodel/FriendsV3TextFeedListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(FriendsV3TextFeedListAssem.class, "feedViewModel", "getFeedViewModel()Lcom/ss/android/ugc/aweme/friendstab/text/viewmodel/FriendsV3TextFeedListViewModel;", 0);
        c09r3.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public FriendsV3TextFeedListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FriendsV3TextFeedListViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJLILLLLZIIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ, 206), AFwS229S0000000_2.get$arr$(186), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FriendsV3TextFeedListViewModel.class);
        this.LLJLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ2, 207), AFwS229S0000000_2.get$arr$(187), null, true);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3FeedListAssem
    public final void Lo() {
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3FeedListAssem, com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility
    public final void NO0() {
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3FeedListAssem
    public final void No() {
        IFriendsV3RefreshAbility iFriendsV3RefreshAbility = (IFriendsV3RefreshAbility) C1558520qew.LIZ(this, IFriendsV3RefreshAbility.class, null);
        if (iFriendsV3RefreshAbility != null) {
            iFriendsV3RefreshAbility.lv1(1, false, null, null, 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3FeedListAssem
    public final void Zo(int i) {
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3FeedListAssem
    public final void ap(RecyclerView recyclerView, int i, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3FeedListAssem
    public final void bp() {
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3FeedListAssem
    public final FriendsV3FeedListViewModel Oo() {
        AssemVMLazy assemVMLazy = this.LLJLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLIL;
        return (FriendsV3FeedListViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3FeedListAssem
    /* JADX INFO: renamed from: ep, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final FriendsV3TextFeedListViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJLILLLLZIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLIL;
        return (FriendsV3TextFeedListViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3FeedListAssem, com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jnHo = super.Ho();
        c20603715jnHo.LJIIJ = C1389300mG0.LJIJI(C724240Sb0.LJI(this));
        if (C1389300mG0.LJIJI(C724240Sb0.LJI(this))) {
            c20603715jnHo.LIZ = C06MR.LIZ().loadMorePrefetchOffset;
            return c20603715jnHo;
        }
        c20603715jnHo.LIZLLL = null;
        return c20603715jnHo;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3FeedListAssem, X.AbstractC738140SxQ
    public final void onParentSet() {
        C0RJN c0rjnLIZIZ;
        super.onParentSet();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (c0rjnLIZIZ = C1578630rBN.LIZIZ(fragmentLJI)) == null) {
            return;
        }
        if (C1389300mG0.LJIJI(C724240Sb0.LJI(this))) {
            ip().LLJJ = true;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isHistoryScene=");
            sbLIZ.append(true);
            C0W17.LIZJ("textFeedListVM", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        FriendsV3TextFeedListViewModel friendsV3TextFeedListViewModelIp = ip();
        C2189821An6 c2189821An6 = c0rjnLIZIZ.LIZJ;
        String aid = c2189821An6 != null ? c2189821An6.getAid() : null;
        friendsV3TextFeedListViewModelIp.LLJILLL = aid;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("detailAid=");
        sbLIZ2.append(aid);
        C0W17.LIZJ("textFeedListVM", C2188811AlT.LIZIZ(sbLIZ2));
    }
}
