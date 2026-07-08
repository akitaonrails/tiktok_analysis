package com.ss.android.ugc.aweme.series.feed.tab.v2;

import X.C019F;
import X.C0NAL;
import X.C0SZ8;
import X.C1255920ims;
import X.C1389300mG0;
import X.C13LE;
import X.C1492500owS;
import X.C1492520owU;
import X.C1567810qtv;
import X.C1623706Xj;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.ml.api.MLCommonService;
import com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes25.dex */
public final class DramaPicksDataLoader extends HomeFeedComponent {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final AssemVMLazy LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DramaPicksDataLoader.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/series/feed/tab/v2/DramaPicksVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public DramaPicksDataLoader() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DramaPicksVM.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 1810), AFwS264S0000000_24.get$arr$(314), null, true);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility
    public final C1255920ims<?> KB1() {
        return null;
    }

    @Override // X.InterfaceC1603280rp8
    public final void LJJIIJ() {
    }

    public final DramaPicksVM Ho() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (DramaPicksVM) assemVMLazy.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.feed.platform.fragment.HomeFeedComponent, com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility
    public final boolean LJJJJI() {
        return (!((C1567810qtv) Ho().getState()).LLILLJJLI || (((C1567810qtv) Ho().getState()).getRefreshState() instanceof C1623706Xj) || (((C1567810qtv) Ho().getState()).getLoadMoreState() instanceof C1623706Xj)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility
    public final boolean LLLLL() {
        DramaPicksVM dramaPicksVMHo = Ho();
        String strLIZ = C1389300mG0.LIZ(getPanelContext());
        if (((C1567810qtv) dramaPicksVMHo.getState()).LLILLJJLI) {
            MLCommonService.Companion.getClass();
            C0NAL.LIZ.onBeforeLoadMore(strLIZ);
            dramaPicksVMHo.manualListLoadMore(0L);
        } else {
            dramaPicksVMHo.setState(AFwS264S0000000_24.get$arr$(571));
        }
        if (!C1492500owS.LIZ()) {
            return true;
        }
        C1492520owU.LIZ();
        return true;
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
        if (!LJJJJI()) {
            return false;
        }
        LLLLL();
        return true;
    }

    @Override // X.InterfaceC606880NrC
    public final boolean LLZLLIL(Aweme aweme) {
        return Ho().wQ2(aweme);
    }

    @Override // X.InterfaceC606880NrC
    public final boolean deleteItem(String str) {
        IAwemeService iAwemeService;
        Aweme awemeLLILZ;
        if (str == null || (iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null)) == null || (awemeLLILZ = iAwemeService.LLILZ(str)) == null || !LLZLLIL(awemeLLILZ)) {
            return false;
        }
        return true;
    }
}
