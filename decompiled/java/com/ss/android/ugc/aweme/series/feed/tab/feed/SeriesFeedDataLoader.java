package com.ss.android.ugc.aweme.series.feed.tab.feed;

import X.C019F;
import X.C0OCC;
import X.C0SZ8;
import X.C1255920ims;
import X.C1389300mG0;
import X.C13LE;
import X.C1567900qu4;
import X.C1568030quH;
import X.C1568040quI;
import X.C1623706Xj;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePanelComponentTempHelper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesFeedDataLoader extends HomeFeedComponent {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final AssemVMLazy LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SeriesFeedDataLoader.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/series/feed/tab/feed/SeriesFeedVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SeriesFeedDataLoader() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeriesFeedVM.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 1809), AFwS264S0000000_24.get$arr$(309), null, true);
        LoadMorePanelComponentTempHelper loadMorePanelComponentTempHelper = this.LLJJ;
        if (loadMorePanelComponentTempHelper != null) {
            loadMorePanelComponentTempHelper.p41(new C0OCC() { // from class: X.0quG
                @Override // X.C0OCC, X.InterfaceC1603270rp7
                public final void onHide() {
                }
            });
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility
    public final /* bridge */ /* synthetic */ C1255920ims KB1() {
        return null;
    }

    public final SeriesFeedVM Ho() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (SeriesFeedVM) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC1603280rp8
    public final void LJJIIJ() {
        if (LJJJJI()) {
            LLLLL();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent, com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility
    public final boolean LJJJJI() {
        return (!((C1567900qu4) Ho().getState()).LLILLJJLI || (((C1567900qu4) Ho().getState()).getRefreshState() instanceof C1623706Xj) || (((C1567900qu4) Ho().getState()).getLoadMoreState() instanceof C1623706Xj)) ? false : true;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility
    public final boolean LLLLL() {
        Boolean bool;
        Object objAQ2 = Ho().AQ2(new C1568040quI(C1389300mG0.LIZ(getPanelContext())));
        if (!(objAQ2 instanceof Boolean) || (bool = (Boolean) objAQ2) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent, com.ss.android.ugc.feed.platform.fragment.IHomeFeedFragmentAbility
    public final C0SZ8 k4() {
        Function0<? extends C0SZ8> function0 = Ho().LLJ;
        if (function0 != null) {
            return function0.invoke();
        }
        return null;
    }

    @Override // X.InterfaceC740200T1u
    public final boolean q9() {
        if (LJJJJI()) {
            return LLLLL();
        }
        return false;
    }

    @Override // X.InterfaceC606880NrC
    public final boolean LLZLLIL(Aweme aweme) {
        Boolean bool;
        Object objAQ2 = Ho().AQ2(new C1568030quH(aweme));
        if ((objAQ2 instanceof Boolean) && (bool = (Boolean) objAQ2) != null) {
            return bool.booleanValue();
        }
        return false;
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
