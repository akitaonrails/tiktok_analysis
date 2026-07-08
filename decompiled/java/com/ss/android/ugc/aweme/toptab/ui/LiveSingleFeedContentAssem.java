package com.ss.android.ugc.aweme.toptab.ui;

import X.C019F;
import X.C0J5P;
import X.C1155280gAY;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1568690qvL;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C723590SZx;
import X.C724750Sbp;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC486070J4j;
import X.InterfaceC494301wD;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.toptab.panel.LiveSingleFeedFragmentPanel;
import com.ss.android.ugc.aweme.toptab.ui.LiveSingleFeedContentAssem;
import com.ss.android.ugc.aweme.toptab.vm.LiveSingleFeedListViewModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class LiveSingleFeedContentAssem extends UIContentAssem implements ILiveSingleFeedContentAssemAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public LiveSingleFeedFragmentPanel LLJI;
    public boolean LLJIJIL;
    public C0J5P LLJILJIL;
    public int LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LiveSingleFeedContentAssem.class, "contentVM", "getContentVM()Lcom/ss/android/ugc/aweme/toptab/vm/LiveSingleFeedListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public LiveSingleFeedContentAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LiveSingleFeedListViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 2332), AFwS264S0000000_24.get$arr$(487), null, true);
        this.LLJ = new C1559260qg8(new C723590SZx(this, C1155280gAY.class, null), checkSupervisorPrepared());
    }

    @Override // com.ss.android.ugc.aweme.toptab.ui.ILiveSingleFeedContentAssemAbility
    public final boolean LLLLL() {
        this.LLJIJIL = true;
        K0();
        return true;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -882608657) {
            return null;
        }
        return this;
    }

    public final LiveSingleFeedListViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (LiveSingleFeedListViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.toptab.ui.ILiveSingleFeedContentAssemAbility
    public final void K0() {
        LiveSingleFeedFragmentPanel liveSingleFeedFragmentPanel = this.LLJI;
        if (liveSingleFeedFragmentPanel != null) {
            liveSingleFeedFragmentPanel.l = this.LLJIJIL;
        }
        Go().manualListLoadMore(0L);
    }

    @Override // com.ss.android.ugc.aweme.toptab.ui.ILiveSingleFeedContentAssemAbility
    public final boolean LJJJJI() {
        return ((Boolean) withState(Go(), AFwS264S0000000_24.get$arr$(486))).booleanValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    public final void Ho(String str) {
        if (str != null && str.length() != 0) {
            int effectiveConnectionType = ((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).getEffectiveConnectionType();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "homepage_live");
            c2344009Gk.LJIIIIZZ("enter_method", "live_cell");
            c2344009Gk.LJIIIIZZ("refresh_method", str);
            c2344009Gk.LIZJ(effectiveConnectionType, "network_status");
            C20684815ws.LJIILLIIL("refresh_homepage_live", c2344009Gk.LIZ);
            LiveSingleFeedFragmentPanel liveSingleFeedFragmentPanel = this.LLJI;
            if (liveSingleFeedFragmentPanel != null) {
                liveSingleFeedFragmentPanel.onFeedRefreshEvent(null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.toptab.ui.ILiveSingleFeedContentAssemAbility
    public final boolean LLZLLIL(Aweme aweme) {
        return ((Boolean) withState(Go(), new AwS390S0200000_24(aweme, this, 51))).booleanValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        this.LLJI = ((C1155280gAY) this.LLJ.getValue()).LL;
        AssemViewModel.asyncSubscribe$default(Go(), new C2217381BqS() { // from class: X.0qvH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1567620qtc) obj).getRefreshState();
            }
        }, null, new AwS603S0100000_24(this, 356), new AwS568S0100000_24(this, 1406), new AwS603S0100000_24(this, 357), 2, null);
        AssemViewModel.asyncSubscribe$default(Go(), new C2217381BqS() { // from class: X.0qvI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1567620qtc) obj).getLoadMoreState();
            }
        }, null, new AwS603S0100000_24(this, 358), new AwS568S0100000_24(this, 1407), new AwS603S0100000_24(this, 359), 2, null);
        qN1(new C1568690qvL());
    }

    @Override // com.ss.android.ugc.aweme.toptab.ui.ILiveSingleFeedContentAssemAbility
    public final void qN1(C1568690qvL c1568690qvL) {
        LiveSingleFeedFragmentPanel liveSingleFeedFragmentPanel = this.LLJI;
        if (liveSingleFeedFragmentPanel != null) {
            liveSingleFeedFragmentPanel.l = this.LLJIJIL;
        }
        if (c1568690qvL != null) {
            Go();
        }
        Go().manualListRefresh();
    }

    @Override // com.ss.android.ugc.aweme.toptab.ui.ILiveSingleFeedContentAssemAbility
    public final void n22(Context context, Aweme aweme, EnterRoomConfig enterRoomConfig) {
        LiveRoomStruct newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme);
        if (newLiveRoomDataExt != null) {
            newLiveRoomDataExt.isWatched = true;
        }
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).z5().LJIIJ(context, enterRoomConfig, aweme, Go().LLILLL, new InterfaceC486070J4j() { // from class: X.0qvJ
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC486070J4j
            public final boolean LJIIJJI() {
                return ((C1567620qtc) this.LIZ.Go().getState()).LLILLJJLI;
            }

            @Override // X.InterfaceC486070J4j
            public final void LIZ(Map<String, String> map) {
                LiveSingleFeedFragmentPanel liveSingleFeedFragmentPanel;
                String str = (String) ((HashMap) map).get("roomId");
                List<Aweme> list = this.LIZ.Go().LLILLL;
                LiveSingleFeedContentAssem liveSingleFeedContentAssem = this.LIZ;
                int i = 0;
                for (Object obj : (CopyOnWriteArrayList) list) {
                    int i2 = i + 1;
                    String string = null;
                    if (i >= 0) {
                        LiveRoomStruct newLiveRoomDataExt2 = AwemeExtKt.getNewLiveRoomDataExt((Aweme) obj);
                        if (newLiveRoomDataExt2 != null) {
                            string = Long.valueOf(newLiveRoomDataExt2.id).toString();
                        }
                        if (TextUtils.equals(string, str) && (liveSingleFeedFragmentPanel = liveSingleFeedContentAssem.LLJI) != null) {
                            liveSingleFeedFragmentPanel.LLFFF(i, false);
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                LiveSingleFeedFragmentPanel liveSingleFeedFragmentPanel2 = this.LIZ.LLJI;
                if (liveSingleFeedFragmentPanel2 != null) {
                    liveSingleFeedFragmentPanel2.c0 = 0L;
                }
            }

            @Override // X.InterfaceC486070J4j
            public final void LIZIZ(C486040J4g c486040J4g) {
                LiveSingleFeedContentAssem liveSingleFeedContentAssem = this.LIZ;
                liveSingleFeedContentAssem.LLJILJIL = c486040J4g;
                liveSingleFeedContentAssem.LLLLL();
            }

            @Override // X.InterfaceC486070J4j
            public final void LJIIL(long j) {
                for (int size = ((CopyOnWriteArrayList) this.LIZ.Go().LLILLL).size() - 1; -1 < size; size--) {
                    Aweme aweme2 = (Aweme) ListProtector.get(this.LIZ.Go().LLILLL, size);
                    LiveRoomStruct newLiveRoomDataExt2 = AwemeExtKt.getNewLiveRoomDataExt(aweme2);
                    if (newLiveRoomDataExt2 != null && newLiveRoomDataExt2.id == j) {
                        this.LIZ.LLZLLIL(aweme2);
                    }
                }
            }

            @Override // X.InterfaceC486070J4j
            public final void LJIILIIL(long j) {
                LiveRoomStruct newLiveRoomDataExt2;
                int i = 0;
                for (Aweme aweme2 : this.LIZ.Go().LLILLL) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        Aweme aweme3 = aweme2;
                        LiveRoomStruct newLiveRoomDataExt3 = AwemeExtKt.getNewLiveRoomDataExt(aweme3);
                        if (newLiveRoomDataExt3 != null && newLiveRoomDataExt3.id == j && (newLiveRoomDataExt2 = AwemeExtKt.getNewLiveRoomDataExt(aweme3)) != null) {
                            newLiveRoomDataExt2.isWatched = true;
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        }, null);
    }
}
