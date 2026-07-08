package com.ss.android.ugc.aweme.friendstab.text.assem;

import X.C019F;
import X.C098200Yq;
import X.C1389300mG0;
import X.C13LE;
import X.C1637806bA;
import X.C189200o6;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724240Sb0;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.friendstab.text.viewmodel.FriendsV3TextFeedListViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.player.FriendsV3PlayerManagerComponent;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class FriendsV3TextPlayerManagerAssem extends FriendsV3PlayerManagerComponent {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final AssemVMLazy LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsV3TextPlayerManagerAssem.class, "feedViewModel", "getFeedViewModel()Lcom/ss/android/ugc/aweme/friendstab/text/viewmodel/FriendsV3TextFeedListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FriendsV3TextPlayerManagerAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FriendsV3TextFeedListViewModel.class);
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 209), AFwS229S0000000_2.get$arr$(188), null, true);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.player.FriendsV3PlayerManagerComponent
    public final FriendsV3FeedListViewModel lo() {
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (FriendsV3FeedListViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.player.FriendsV3PlayerManagerComponent, com.ss.android.ugc.aweme.feed.controller.IFeedMobParamsProvider
    public final JSONObject RC2() throws JSONException {
        JSONObject jSONObjectRC2 = super.RC2();
        try {
            if (C1389300mG0.LJIJI(C724240Sb0.LJI(this))) {
                jSONObjectRC2.put("enter_position", "text_publish_history_panel");
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return jSONObjectRC2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return jSONObjectRC2;
        }
    }
}
