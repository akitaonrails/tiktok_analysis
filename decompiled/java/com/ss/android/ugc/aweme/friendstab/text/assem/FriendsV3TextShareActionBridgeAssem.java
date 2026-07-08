package com.ss.android.ugc.aweme.friendstab.text.assem;

import X.AbstractC1387200mCc;
import X.AbstractC1393330mMV;
import X.C019F;
import X.C0SDD;
import X.C0T4Q;
import X.C0T4R;
import X.C0T4S;
import X.C0T96;
import X.C0W17;
import X.C1393300mMS;
import X.C1393310mMT;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C520040KaQ;
import X.C724240Sb0;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.friendstab.text.viewmodel.FriendsV3TextFeedListViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3ShareActionBridgeAssem;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS36S2100000_9;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class FriendsV3TextShareActionBridgeAssem extends FriendsV3ShareActionBridgeAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsV3TextShareActionBridgeAssem.class, "feedViewModel", "getFeedViewModel()Lcom/ss/android/ugc/aweme/friendstab/text/viewmodel/FriendsV3TextFeedListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FriendsV3TextShareActionBridgeAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FriendsV3TextFeedListViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 210), AFwS229S0000000_2.get$arr$(189), null, true);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3ShareActionBridgeAssem
    /* JADX INFO: renamed from: ko, reason: merged with bridge method [inline-methods] */
    public final FriendsV3TextFeedListViewModel mo219do() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (FriendsV3TextFeedListViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3ShareActionBridgeAssem
    public final void ho(AbstractC1393330mMV abstractC1393330mMV) {
        Fragment fragmentLJI;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        Aweme aweme;
        Fragment fragmentLJI2;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ2;
        Aweme aweme2;
        String strLIZIZ;
        if (mo219do().LLJJ) {
            super.ho(abstractC1393330mMV);
            if (!(abstractC1393330mMV instanceof C0T4Q) && !(abstractC1393330mMV instanceof C0T4R) && !(abstractC1393330mMV instanceof C0T96)) {
                if (((abstractC1393330mMV instanceof C1393310mMT) || (abstractC1393330mMV instanceof C1393300mMS) || (abstractC1393330mMV instanceof C0T4S)) && (strLIZIZ = abstractC1393330mMV.LIZIZ()) != null) {
                    FriendsV3TextFeedListViewModel friendsV3TextFeedListViewModelMo219do = mo219do();
                    C0W17.LIZJ("listVM", "removeItemsByUid");
                    friendsV3TextFeedListViewModelMo219do.withState(new AwS36S2100000_9("removeItemsByUid", friendsV3TextFeedListViewModelMo219do, strLIZIZ, 5));
                    return;
                }
                return;
            }
            mo219do().Py0(abstractC1393330mMV.LIZ());
            return;
        }
        String aid = null;
        if (!(abstractC1393330mMV instanceof C0T4Q) && !(abstractC1393330mMV instanceof C0T4R) && !(abstractC1393330mMV instanceof C0T96)) {
            if ((abstractC1393330mMV instanceof C1393310mMT) || (abstractC1393330mMV instanceof C1393300mMS) || (abstractC1393330mMV instanceof C0T4S)) {
                String strLIZIZ2 = abstractC1393330mMV.LIZIZ();
                C0SDD c0sddOQ2 = mo219do().OQ2();
                if (c0sddOQ2 != null && (aweme2 = c0sddOQ2.getAweme()) != null) {
                    aid = AwemeExtKt.getAuthorUid(aweme2);
                }
                if (Intrinsics.LJFF(strLIZIZ2, aid) && (fragmentLJI2 = C724240Sb0.LJI(this)) != null && (abstractC1387200mCcLIZIZ2 = C520040KaQ.LIZIZ(fragmentLJI2)) != null) {
                    abstractC1387200mCcLIZIZ2.LIZ();
                    return;
                }
                return;
            }
            return;
        }
        String strLIZ = abstractC1393330mMV.LIZ();
        C0SDD c0sddOQ22 = mo219do().OQ2();
        if (c0sddOQ22 != null && (aweme = c0sddOQ22.getAweme()) != null) {
            aid = aweme.getAid();
        }
        if (!Intrinsics.LJFF(strLIZ, aid) || (fragmentLJI = C724240Sb0.LJI(this)) == null || (abstractC1387200mCcLIZIZ = C520040KaQ.LIZIZ(fragmentLJI)) == null) {
            return;
        }
        abstractC1387200mCcLIZIZ.LIZ();
    }
}
