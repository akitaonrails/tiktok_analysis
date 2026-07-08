package com.ss.android.ugc.aweme.repostfeed.feed;

import X.C019F;
import X.C01GW;
import X.C0NAL;
import X.C1255920ims;
import X.C1389300mG0;
import X.C13LE;
import X.C1567630qtd;
import X.C1623706Xj;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.ml.api.MLCommonService;
import com.ss.android.ugc.aweme.repostfeed.viewmodel.RepostFeedViewModel;
import com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class RepostFeedComponent extends HomeFeedComponent {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS568S0100000_24(this, 882));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 881));
    public final AssemVMLazy LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RepostFeedComponent.class, "feedVM", "getFeedVM()Lcom/ss/android/ugc/aweme/repostfeed/viewmodel/RepostFeedViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public RepostFeedComponent() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RepostFeedViewModel.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 883), AFwS264S0000000_24.get$arr$(263), null, true);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility
    public final C1255920ims<?> KB1() {
        return null;
    }

    public final RepostFeedViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (RepostFeedViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC1603280rp8
    public final void LJJIIJ() {
        Ho().xQ2();
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent, com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility
    public final boolean LJJJJI() {
        RepostFeedViewModel repostFeedViewModelHo = Ho();
        return repostFeedViewModelHo.LLILZIL && !(((C1567630qtd) repostFeedViewModelHo.vmDispatcher.getState()).getLoadMoreState() instanceof C1623706Xj);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility
    public final boolean LLLLL() {
        RepostFeedViewModel repostFeedViewModelHo = Ho();
        repostFeedViewModelHo.LL = true;
        repostFeedViewModelHo.xQ2();
        return true;
    }

    @Override // X.InterfaceC740200T1u
    public final boolean q9() {
        if (!LJJJJI()) {
            return false;
        }
        MLCommonService.Companion.getClass();
        C0NAL.LIZ.onBeforeLoadMore(C1389300mG0.LIZ(getPanelContext()));
        LLLLL();
        return true;
    }

    @Override // X.InterfaceC606880NrC
    public final boolean LLZLLIL(Aweme aweme) {
        return Ho().LLZLLIL(aweme);
    }

    @Override // X.InterfaceC606880NrC
    public final boolean deleteItem(String str) {
        Aweme awemeLLILZ;
        if (str == null || (awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(str)) == null || !LLZLLIL(awemeLLILZ)) {
            return false;
        }
        return true;
    }
}
