package com.ss.android.ugc.aweme.hangout.component.livecard.view;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C09RD;
import X.C09RE;
import X.C0IM1;
import X.C0PEM;
import X.C12ES;
import X.C1390410mHn;
import X.C13LE;
import X.C1623606Xi;
import X.C1637806bA;
import X.C1637906bB;
import X.C16GX;
import X.C19719912Dl;
import X.C20441214yg;
import X.C20603715jn;
import X.C20731516An;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C439101nJ;
import X.C452501pT;
import X.C477860Ioa;
import X.C478090Iox;
import X.C478750Iq1;
import X.C478790Iq5;
import X.C478950IqL;
import X.C479150Iqf;
import X.C479170Iqh;
import X.C479320Iqw;
import X.C479440Ir8;
import X.C479450Ir9;
import X.C479490IrD;
import X.C479540IrI;
import X.C479550IrJ;
import X.C479580IrM;
import X.C481030Ith;
import X.C491101vh;
import X.C497740JfY;
import X.C500260Jjc;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC479370Ir1;
import X.InterfaceC1324370kZH;
import X.InterfaceC2217461Bqa;
import X.InterfaceC336510DHd;
import X.InterfaceC479000IqQ;
import X.InterfaceC479190Iqj;
import X.InterfaceC479210Iql;
import X.InterfaceC479240Iqo;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.room.GlobalLiveEndChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.DisablePreloadHangoutTabFeedDataSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestTopLivePreloadConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiHangoutLiveCardOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TiktokLiveHangoutPerformanceOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TiktokLiveTopLiveArchitectureOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TtliveHangoutEnableLiveCardAudioPlayerSetting;
import com.bytedance.android.livesdkapi.TopLiveRandomMatchFragmentDismissEvent;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.hangout.common.contract.LiveHangoutV2SelectableListContentAssem;
import com.ss.android.ugc.aweme.hangout.component.distribute.viewmodel.MultiTopLiveDistributeVM;
import com.ss.android.ugc.aweme.hangout.component.interact.viewmodel.MultiTopLiveInteractModuleVM;
import com.ss.android.ugc.aweme.hangout.component.livecard.viewmodel.MultiTopLivePlayFeedListViewModel;
import com.ss.android.ugc.aweme.hangout.component.tab.MultiTopLivePlayTabVM;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS621S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public class MultiTopLivePlayFeedAssemV2 extends LiveHangoutV2SelectableListContentAssem<MultiTopLivePlayFeedListViewModel> implements InterfaceC336510DHd, InterfaceC479190Iqj, InterfaceC479210Iql, InterfaceC479240Iqo {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIII;
    public final C479550IrJ LLJ = new C479550IrJ();
    public final C479580IrM LLJI = new C479580IrM();
    public final C479540IrI LLJIJIL = new C479540IrI();
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 218));
    public final AssemVMLazy LLJILJILJ;
    public final AssemVMLazy LLJILLL;
    public final AssemVMLazy LLJJ;
    public final AssemVMLazy LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public FrameLayout LLJJJJ;
    public View LLJJJJJIL;
    public C1390410mHn LLJJJJLIIL;
    public int LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public PlayCardFeedCellV2 LLJLL;
    public Long LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public final C01GW LLJZIJLIL;
    public boolean LLL;
    public int LLLF;
    public final C01GW LLLFF;
    public C20731516An LLLFFI;
    public int LLLFZ;
    public final DecelerateInterpolator LLLI;
    public boolean LLLII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MultiTopLivePlayFeedAssemV2.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/hangout/component/livecard/viewmodel/MultiTopLivePlayFeedListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MultiTopLivePlayFeedAssemV2.class, "interactModuleVM", "getInteractModuleVM()Lcom/ss/android/ugc/aweme/hangout/component/interact/viewmodel/MultiTopLiveInteractModuleVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(MultiTopLivePlayFeedAssemV2.class, "playTabVM", "getPlayTabVM()Lcom/ss/android/ugc/aweme/hangout/component/tab/MultiTopLivePlayTabVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(MultiTopLivePlayFeedAssemV2.class, "distributionModuleVM", "getDistributionModuleVM()Lcom/ss/android/ugc/aweme/hangout/component/distribute/viewmodel/MultiTopLiveDistributeVM;", 0);
        c09r3.getClass();
        LLLIIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    public MultiTopLivePlayFeedAssemV2() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MultiTopLivePlayFeedListViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS551S0100000_7(c19719912DlLIZ, 212), AFwS237S0000000_7.get$arr$(78), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MultiTopLiveInteractModuleVM.class);
        this.LLJILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS551S0100000_7(c19719912DlLIZ2, 214), AFwS237S0000000_7.get$arr$(79), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(MultiTopLivePlayTabVM.class);
        this.LLJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS551S0100000_7(c19719912DlLIZ3, 216), AFwS237S0000000_7.get$arr$(80), null, true);
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(MultiTopLiveDistributeVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, c1637906bB, new AwS551S0100000_7(c19719912DlLIZ4, 219), AFwS237S0000000_7.get$arr$(81), null, true);
        this.LLJJIII = C452501pT.LIZIZ(new AwS551S0100000_7(this, 213));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS551S0100000_7(this, 220));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(130));
        this.LLJL = true;
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 217));
        this.LLLFF = C452501pT.LIZIZ(new AwS551S0100000_7(this, 215));
        this.LLLFZ = -1;
        this.LLLI = new DecelerateInterpolator();
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJILJIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = false;
        c20603715jn.LIZ = 0;
        c20603715jn.LIZLLL = LoadingFooterCell.class;
        return c20603715jn;
    }

    @Override // X.InterfaceC479240Iqo
    public final void LJJLIIIIJ() {
        C20441214yg.LIZIZ("MultiTopLivePlayCardFeedAssemV2", "onConfigurationChanged: PowerList will auto-refresh");
    }

    @Override // X.InterfaceC479210Iql
    public final void LLLLIILL() {
        C20441214yg.LIZIZ("MultiTopLivePlayCardFeedAssemV2", "onUnSelected");
        this.LLJJLIIIJLLLLLLLZ = false;
        this.LLJLILLLLZIIL = false;
        this.LLJZ = false;
        C478090Iox c478090IoxVo = Vo();
        if (c478090IoxVo != null) {
            c478090IoxVo.LIZLLL();
        }
        this.LLL = false;
        C477860Ioa.LJIILJJIL("leave_hangout", "MultiTopLivePlayFeedAssemV2#onViewHidden");
    }

    public final void So() {
        if (this.LLJJJJJIL != null) {
            return;
        }
        FrameLayout frameLayout = this.LLJJJJ;
        if (frameLayout == null) {
            frameLayout = (FrameLayout) LJJIJL().findViewById(R.id.oab);
            this.LLJJJJ = frameLayout;
        }
        this.LLJJJJJIL = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.ddj, frameLayout, false);
    }

    public final C478090Iox Vo() {
        return (C478090Iox) this.LLJZIJLIL.getValue();
    }

    public final C481030Ith Zo() {
        return (C481030Ith) this.LLJJIJI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: bp, reason: merged with bridge method [inline-methods] */
    public final MultiTopLivePlayFeedListViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIII;
        return (MultiTopLivePlayFeedListViewModel) assemVMLazy.getValue();
    }

    public final void dp() {
        this.LLJ.LIZ(false);
        C479580IrM c479580IrM = this.LLJI;
        c479580IrM.LIZ = false;
        Function1<? super Boolean, Unit> function1 = c479580IrM.LIZIZ;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        this.LLJIJIL.LIZ(false);
        View view = this.LLJJJJJIL;
        if (view != null) {
            C439101nJ.LJI(view);
        }
        C1390410mHn c1390410mHn = this.LLJJJJLIIL;
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
        }
    }

    public final void ip() {
        if (this.LLL) {
            return;
        }
        if ((this.LLJLILLLLZIIL || this.LLJJLIIIJLLLLLLLZ) && Go().getState().LJIIIIZZ() != 0) {
            this.LLL = true;
            C478090Iox c478090IoxVo = Vo();
            if (c478090IoxVo != null) {
                c478090IoxVo.LJ(4000L);
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C20441214yg.LIZIZ("MultiTopLivePlayCardFeedAssemV2", "PlayCardFeedAssemV2 onDestroy");
        C478090Iox c478090IoxVo = Vo();
        if (c478090IoxVo != null) {
            c478090IoxVo.LIZLLL();
        }
        this.LLL = false;
        Go().clearOnScrollListeners();
        Go().setOnTouchListener(null);
        C16GX c16gx = (C16GX) this.LLJJIII.getValue();
        if (c16gx != null) {
            c16gx.LIZLLL((InterfaceC1324370kZH) this.LLLFF.getValue());
        }
        C1390410mHn c1390410mHn = this.LLJJJJLIIL;
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
        }
        this.LLJJJJLIIL = null;
        View view = this.LLJJJJJIL;
        if (view != null) {
            C500260Jjc.LJJJLL(view);
        }
        this.LLJJJJJIL = null;
        this.LLLFFI = null;
        DataChannelGlobal.LLILZ.zQ2(this);
        super.onDestroy();
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        C20441214yg.LIZIZ("MultiTopLivePlayCardFeedAssemV2", "PlayCardFeedAssemV2 onPause");
        super.onPause();
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        InterfaceC479000IqQ interfaceC479000IqQAp;
        PlayCardFeedCellV2 playCardFeedCellV2;
        C20441214yg.LIZIZ("MultiTopLivePlayCardFeedAssemV2", "PlayCardFeedAssemV2 onResume");
        super.onResume();
        if (TiktokLiveTopLiveArchitectureOptSetting.INSTANCE.isArchOpt()) {
            if (!this.LLJJLIIIJLLLLLLLZ) {
                return;
            }
        } else if (!this.LLJJLIIIJLLLLLLLZ) {
            if (!this.LLJL || (interfaceC479000IqQAp = ap()) == null) {
                return;
            }
            interfaceC479000IqQAp.Wh();
            return;
        }
        if (MultiHangoutLiveCardOptimizeSetting.INSTANCE.isEnable() && this.LLJLLL && (playCardFeedCellV2 = this.LLJLL) != null) {
            playCardFeedCellV2.N5();
        }
        this.LLJLLL = false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        InterfaceC479000IqQ interfaceC479000IqQAp;
        C20441214yg.LIZIZ("MultiTopLivePlayCardFeedAssemV2", "PlayCardFeedAssemV2 onStop");
        super.onStop();
        if (TiktokLiveTopLiveArchitectureOptSetting.INSTANCE.isArchOpt()) {
            if (!this.LLJJLIIIJLLLLLLLZ) {
                return;
            }
        } else if (!this.LLJJLIIIJLLLLLLLZ) {
            if (!this.LLJL || (interfaceC479000IqQAp = ap()) == null) {
                return;
            }
            interfaceC479000IqQAp.Wh();
            return;
        }
        this.LLJLLL = true;
        if (C477860Ioa.LJI) {
            C477860Ioa.LJIILJJIL("leave_hangout", "MultiTopLivePlayFeedAssemV2#onStop_close");
        } else {
            C477860Ioa.LJIILJJIL("leave_hangout", "MultiTopLivePlayFeedAssemV2#onStop_background");
        }
        if (TtliveHangoutEnableLiveCardAudioPlayerSetting.INSTANCE.isEnable()) {
            ip().CQ2();
        }
    }

    @Override // X.InterfaceC479190Iqj
    public final void rg() {
        C20441214yg.LIZIZ("MultiTopLivePlayCardFeedAssemV2", "PlayCardFeedAssemV2 onViewHidden");
        this.LLJJLIIIJLLLLLLLZ = false;
        this.LLJL = false;
        C478090Iox c478090IoxVo = Vo();
        if (c478090IoxVo != null) {
            c478090IoxVo.LIZLLL();
        }
        this.LLL = false;
        C477860Ioa.LJIILJJIL("leave_hangout", "MultiTopLivePlayFeedAssemV2#onViewHidden");
    }

    public final void No() {
        C479450Ir9 c479450Ir9;
        if (MultiGuestTopLivePreloadConfigSetting.getValue().feedDataTimeoutThreshold <= 0 || !C478950IqL.LIZ()) {
            return;
        }
        if (TiktokLiveTopLiveArchitectureOptSetting.INSTANCE.isArchOpt()) {
            C479440Ir8 c479440Ir8 = C478750Iq1.LIZ;
            if (c479440Ir8 != null && (c479450Ir9 = c479440Ir8.LIZIZ) != null) {
                c479450Ir9.LJII = "expired";
            }
        } else {
            InterfaceC479000IqQ interfaceC479000IqQAp = ap();
            if (interfaceC479000IqQAp != null) {
                interfaceC479000IqQAp.Jp();
            }
        }
        this.LLJJJ = true;
        ((C16GX) this.LLJJIII.getValue()).LJ(true, true, true);
        Go().scrollToPosition(0);
        Zo().LJ();
        if (MultiHangoutLiveCardOptimizeSetting.INSTANCE.isEnable()) {
            Oo(Go());
        }
    }

    public final InterfaceC479000IqQ ap() {
        Object obj = getConfig().LLILZ.get("top_live_link_trace_owner");
        if (obj instanceof InterfaceC479000IqQ) {
            return (InterfaceC479000IqQ) obj;
        }
        return null;
    }

    public static boolean ep(RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager;
        int iFindFirstVisibleItemPosition;
        View viewFindViewByPosition;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        } else {
            linearLayoutManager = null;
        }
        if (linearLayoutManager == null || (iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition()) != 0 || (viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition)) == null || recyclerView.canScrollVertically(-1) || viewFindViewByPosition.getTop() < 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Oo(RecyclerView recyclerView) {
        PlayCardFeedCellV2 playCardFeedCellV2;
        Long lValueOf;
        C479150Iqf c479150Iqf;
        C479170Iqh c479170Iqh;
        if (this.LLLFZ == -1) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && layoutManager != null) {
            View viewFindViewByPosition = layoutManager.findViewByPosition(this.LLLFZ);
            if (viewFindViewByPosition != null) {
                RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(viewFindViewByPosition);
                if ((childViewHolder instanceof PlayCardFeedCellV2) && (playCardFeedCellV2 = (PlayCardFeedCellV2) childViewHolder) != null) {
                    playCardFeedCellV2.LLJJIJI = false;
                    playCardFeedCellV2.u6(false, true);
                    C500260Jjc.LJLJLJ((View) playCardFeedCellV2.LLILZIL.getValue(), false);
                    playCardFeedCellV2.itemView.setBackgroundResource(R.drawable.ck0);
                    playCardFeedCellV2.r6(true);
                    C477860Ioa.LJIILJJIL("switch", "PlayCardFeedCellV2#clearStickyEffect");
                    PlayCardFeedCellV2 playCardFeedCellV22 = this.LLJLL;
                    if (playCardFeedCellV22 != null && (c479150Iqf = (C479150Iqf) playCardFeedCellV22.getItem()) != null && (c479170Iqh = c479150Iqf.LLILLL) != null) {
                        lValueOf = Long.valueOf(c479170Iqh.LIZ);
                    } else {
                        lValueOf = null;
                    }
                    this.LLJLLIL = lValueOf;
                    this.LLJLL = null;
                }
            }
            this.LLLFZ = -1;
            return;
        }
        this.LLLFZ = -1;
    }

    @Override // X.InterfaceC479190Iqj
    public final void b7(boolean z) {
        PlayCardFeedCell playCardFeedCell;
        C20441214yg.LIZIZ("MultiTopLivePlayCardFeedAssemV2", "PlayCardFeedAssemV2 onViewResumed");
        this.LLJJLIIIJLLLLLLLZ = true;
        this.LLJLIL = false;
        this.LLJL = false;
        if (z) {
            MultiTopLivePlayFeedListViewModel multiTopLivePlayFeedListViewModelIp = ip();
            C23250099c.LIZLLL(multiTopLivePlayFeedListViewModelIp.getAssemVMScope(), C0PEM.LIZJ, null, new C478790Iq5(multiTopLivePlayFeedListViewModelIp, null), 2);
        }
        No();
        hp("MultiTopLivePlayFeedAssemV2#onViewResumed");
        if (MultiHangoutLiveCardOptimizeSetting.INSTANCE.isEnable()) {
            if (this.LLJJJIL) {
                this.LLJJJIL = false;
                cp(Go());
            } else {
                PlayCardFeedCellV2 playCardFeedCellV2 = this.LLJLL;
                if (playCardFeedCellV2 != null) {
                    playCardFeedCellV2.N5();
                }
            }
        }
        Iterator<View> it2 = new C09RD(Go()).iterator();
        while (true) {
            C09RE c09re = (C09RE) it2;
            if (c09re.hasNext()) {
                View view = (View) c09re.next();
                if (MultiHangoutLiveCardOptimizeSetting.INSTANCE.isEnable()) {
                    RecyclerView.ViewHolder childViewHolder = Go().getChildViewHolder(view);
                    if (childViewHolder instanceof PlayCardFeedCell) {
                        ((PlayCardFeedCell) childViewHolder).LLIZLLLIL = this.LLJLIL;
                    } else if (childViewHolder instanceof PlayCardFeedCellV2) {
                        PlayCardFeedCellV2 playCardFeedCellV22 = (PlayCardFeedCellV2) childViewHolder;
                        playCardFeedCellV22.LLJJIII = this.LLJLIL;
                        playCardFeedCellV22.LLJJIJIIJIL = Vo();
                    }
                } else {
                    RecyclerView.ViewHolder childViewHolder2 = Go().getChildViewHolder(view);
                    if ((childViewHolder2 instanceof PlayCardFeedCell) && (playCardFeedCell = (PlayCardFeedCell) childViewHolder2) != null) {
                        playCardFeedCell.LLIZLLLIL = this.LLJLIL;
                    }
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void cp(androidx.recyclerview.widget.RecyclerView r7) {
        /*
            r6 = this;
            com.bytedance.android.livesdk.livesetting.linkmic.MultiHangoutLiveCardOptimizeSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.MultiHangoutLiveCardOptimizeSetting.INSTANCE
            boolean r0 = r0.isEnable()
            if (r0 != 0) goto L9
            return
        L9:
            android.widget.FrameLayout r0 = r6.LLJJJJ
            r3 = 0
            if (r0 == 0) goto L2c
            int r2 = r0.getTop()
        L12:
            android.widget.FrameLayout r0 = r6.LLJJJJ
            if (r0 == 0) goto L2a
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L2a
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto L2a
            int r0 = r1.topMargin
        L24:
            if (r2 <= r0) goto L2e
            r6.Oo(r7)
            return
        L2a:
            r0 = 0
            goto L24
        L2c:
            r2 = 0
            goto L12
        L2e:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r5 = r7.getLayoutManager()
            boolean r0 = r5 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto Lb0
            androidx.recyclerview.widget.LinearLayoutManager r5 = (androidx.recyclerview.widget.LinearLayoutManager) r5
            if (r5 == 0) goto Lb0
            int r4 = r5.findFirstVisibleItemPosition()
            r0 = -1
            if (r4 != r0) goto L42
            return
        L42:
            android.view.View r0 = r5.findViewByPosition(r4)
            if (r0 != 0) goto L49
            return
        L49:
            int r2 = r0.getHeight()
            if (r2 > 0) goto L50
            return
        L50:
            int r0 = r0.getTop()
            if (r0 != 0) goto L5a
            r6.op(r7, r4)
            return
        L5a:
            if (r0 >= 0) goto L9c
            int r0 = -r0
        L5d:
            float r1 = (float) r0
            float r0 = (float) r2
            float r1 = r1 / r0
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L6f
            int r1 = r4 + 1
            int r0 = r5.getItemCount()
            if (r1 >= r0) goto L6f
            r4 = r1
        L6f:
            android.view.View r0 = r5.findViewByPosition(r4)
            if (r0 == 0) goto Lac
            int r1 = r0.getTop()
            if (r1 == 0) goto La8
            r2 = 240(0xf0, float:3.36E-43)
            if (r1 <= 0) goto La2
            r0 = 1
            boolean r0 = r7.canScrollVertically(r0)
            if (r0 != 0) goto La2
            int r0 = r4 + (-1)
            if (r0 <= 0) goto L9b
            android.view.View r0 = r5.findViewByPosition(r0)
            if (r0 == 0) goto L9b
            int r1 = r0.getTop()
            if (r1 == 0) goto L9e
            android.view.animation.DecelerateInterpolator r0 = r6.LLLI
            r7.smoothScrollBy(r3, r1, r0, r2)
        L9b:
            return
        L9c:
            r0 = 0
            goto L5d
        L9e:
            r6.op(r7, r4)
            return
        La2:
            android.view.animation.DecelerateInterpolator r0 = r6.LLLI
            r7.smoothScrollBy(r3, r1, r0, r2)
            return
        La8:
            r6.op(r7, r4)
            return
        Lac:
            r7.smoothScrollToPosition(r4)
            return
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.hangout.component.livecard.view.MultiTopLivePlayFeedAssemV2.cp(androidx.recyclerview.widget.RecyclerView):void");
    }

    public final void hp(String str) {
        LinearLayoutManager linearLayoutManager;
        BaseMultiFeedPowerCell baseMultiFeedPowerCell;
        RecyclerView.LayoutManager layoutManager = Go().getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            if (iFindFirstVisibleItemPosition < 0 || iFindLastVisibleItemPosition < 0 || iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
                return;
            }
            while (true) {
                RecyclerView.ViewHolder viewHolderFindViewHolderForLayoutPosition = Go().findViewHolderForLayoutPosition(iFindFirstVisibleItemPosition);
                if ((viewHolderFindViewHolderForLayoutPosition instanceof BaseMultiFeedPowerCell) && (baseMultiFeedPowerCell = (BaseMultiFeedPowerCell) viewHolderFindViewHolderForLayoutPosition) != null) {
                    baseMultiFeedPowerCell.L5(str);
                }
                if (iFindFirstVisibleItemPosition != iFindLastVisibleItemPosition) {
                    iFindFirstVisibleItemPosition++;
                } else {
                    return;
                }
            }
        }
    }

    public final void kp(boolean z) {
        if (TiktokLiveHangoutPerformanceOptSetting.isPlayFeedScrollDedupOpt()) {
            if (Zo().isEnabled() != z) {
                Zo().setEnabled(z);
                return;
            }
            return;
        }
        Zo().setEnabled(z);
    }

    public final void lp(EnumC479370Ir1 enumC479370Ir1) {
        C1390410mHn c1390410mHn;
        ViewGroup.LayoutParams layoutParams;
        int top;
        if (enumC479370Ir1 != EnumC479370Ir1.INIT && enumC479370Ir1 != EnumC479370Ir1.PLAY_TAB_SELECTED) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PlayCardFeedAssemV2 do not show CenterLoading: requestScene->");
            sbLIZ.append(enumC479370Ir1);
            C20441214yg.LIZIZ("MultiTopLivePlayCardFeedAssemV2", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("PlayCardFeedAssemV2 showCenterLoading: ");
        sbLIZ2.append(enumC479370Ir1);
        C20441214yg.LIZIZ("MultiTopLivePlayCardFeedAssemV2", C2188811AlT.LIZIZ(sbLIZ2));
        C479580IrM c479580IrM = this.LLJI;
        c479580IrM.LIZ = true;
        Function1<? super Boolean, Unit> function1 = c479580IrM.LIZIZ;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        if (TiktokLiveHangoutPerformanceOptSetting.isPlayFeedLazyCenterLoadingOpt()) {
            So();
        }
        View view = this.LLJJJJJIL;
        if (view != null) {
            C500260Jjc.LJJJLL(view);
        }
        int height = LJJIJL().getHeight();
        ViewGroup viewGroup = (ViewGroup) LJJIJL().findViewById(R.id.oab);
        View view2 = this.LLJJJJJIL;
        FrameLayout.LayoutParams layoutParams2 = null;
        if (view2 != null) {
            c1390410mHn = (C1390410mHn) view2.findViewById(R.id.oam);
        } else {
            c1390410mHn = null;
        }
        this.LLJJJJLIIL = c1390410mHn;
        if (c1390410mHn != null) {
            layoutParams = c1390410mHn.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams) != null) {
            layoutParams2.gravity = 1;
        }
        C1390410mHn c1390410mHn2 = this.LLJJJJLIIL;
        if (c1390410mHn2 != null) {
            C786410Ut5.V6(c1390410mHn2, layoutParams2);
        }
        if (viewGroup != null && (top = viewGroup.getTop()) > 0) {
            float fLIZIZ = ((height - top) - ((int) C497740JfY.LIZIZ(36.0f))) / 2.0f;
            C1390410mHn c1390410mHn3 = this.LLJJJJLIIL;
            if (c1390410mHn3 != null) {
                C500260Jjc.LJLJL((int) fLIZIZ, c1390410mHn3);
            }
        } else {
            C1390410mHn c1390410mHn4 = this.LLJJJJLIIL;
            if (c1390410mHn4 != null) {
                C500260Jjc.LJLJL(C497740JfY.LJIILLIIL() / 4, c1390410mHn4);
            }
        }
        View view3 = this.LLJJJJJIL;
        if (view3 != null) {
            C12ES.LJIILL(0, view3);
        }
        viewGroup.addView(this.LLJJJJJIL);
        C1390410mHn c1390410mHn5 = this.LLJJJJLIIL;
        if (c1390410mHn5 != null) {
            C12ES.LJIILL(0, c1390410mHn5);
        }
        C1390410mHn c1390410mHn6 = this.LLJJJJLIIL;
        if (c1390410mHn6 != null) {
            c1390410mHn6.LIZJ();
        }
    }

    public final void mp(Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlayCardFeedAssemV2 showErrorStatus: ");
        sbLIZ.append(th.getMessage());
        C20441214yg.LIZIZ("MultiTopLivePlayCardFeedAssemV2", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.hangout.common.contract.LiveHangoutV2SelectableListContentAssem, com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C479450Ir9 c479450Ir9;
        C20441214yg.LIZIZ("MultiTopLivePlayCardFeedAssemV2", "PlayCardFeedAssemV2 onViewCreated start");
        super.onViewCreated(view);
        this.LLJJL = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        C478090Iox c478090IoxVo = Vo();
        if (c478090IoxVo != null) {
            c478090IoxVo.LIZ(Go());
        }
        DataChannelGlobal.LLILZ.DQ2(GlobalLiveEndChannel.class, this, new AwS586S0100000_7(this, 221));
        this.LLJ.LIZIZ = new AwS586S0100000_7(this, 222);
        this.LLJI.LIZIZ = new AwS586S0100000_7(this, 223);
        this.LLJIJIL.LIZIZ = new AwS586S0100000_7(this, 224);
        C481030Ith c481030IthZo = Zo();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
        AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(this, 223);
        c481030IthZo.LLLFZ = viewOnAttachStateChangeListenerC20604515jvGo;
        c481030IthZo.LLLI = awS551S0100000_7;
        this.LLJJJJ = (FrameLayout) LJJIJL().findViewById(R.id.oab);
        if (!TiktokLiveHangoutPerformanceOptSetting.isPlayFeedLazyCenterLoadingOpt()) {
            So();
        }
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.0IrG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C479490IrD c479490IrD = (C479490IrD) obj;
                c479490IrD.getClass();
                return C627260Oiy.LIZLLL(c479490IrD);
            }
        }, this, null, new AwS586S0100000_7(this, 225), new AwS551S0100000_7(this, 224), new AwS586S0100000_7(this, 226), 4, null);
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.0IrH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C479490IrD c479490IrD = (C479490IrD) obj;
                c479490IrD.getClass();
                return C627260Oiy.LIZJ(c479490IrD);
            }
        }, this, null, new AwS586S0100000_7(this, 218), new AwS551S0100000_7(this, 221), new AwS586S0100000_7(this, 219), 4, null);
        Zo().setOnRefreshListener(new AwS551S0100000_7(this, 222));
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0IrK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C479490IrD) obj).LLILZIL);
            }
        }, null, new AwS621S0100000_7(this, 28), 6);
        C16GX c16gx = (C16GX) this.LLJJIII.getValue();
        if (c16gx != null) {
            c16gx.LIZ((InterfaceC1324370kZH) this.LLLFF.getValue());
        }
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0IrL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C479490IrD) obj).LLILZLL;
            }
        }, null, new AwS621S0100000_7(this, 29), 6);
        if (TiktokLiveTopLiveArchitectureOptSetting.INSTANCE.isArchOpt()) {
            if (!ip().DQ2(EnumC479370Ir1.PRELOAD)) {
                C479440Ir8 c479440Ir8 = C478750Iq1.LIZ;
                if (c479440Ir8 != null && (c479450Ir9 = c479440Ir8.LIZIZ) != null) {
                    c479450Ir9.LJFF(System.currentTimeMillis());
                }
                ip().BQ2(EnumC479370Ir1.INIT, "landing_init", true);
            }
        } else if (ip().DQ2(EnumC479370Ir1.PRELOAD)) {
            C20441214yg.LIZIZ("MultiTopLivePlayCardFeedAssemV2", "PlayCardFeedAssemV2 Using pre-render data for instant display");
        } else if (!DisablePreloadHangoutTabFeedDataSetting.INSTANCE.isEnable()) {
            ip().BQ2(EnumC479370Ir1.INIT, "landing_init", false);
        }
        DataChannelGlobal.LLILZ.BQ2(this, this, TopLiveRandomMatchFragmentDismissEvent.class, new AwS586S0100000_7(this, 220));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Lo(RecyclerView recyclerView, View view) {
        PlayCardFeedCellV2 playCardFeedCellV2;
        C0IM1 c0im1Bp1;
        C479170Iqh c479170Iqh;
        RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
        Long lValueOf = null;
        if ((childViewHolder instanceof PlayCardFeedCellV2) && (playCardFeedCellV2 = (PlayCardFeedCellV2) childViewHolder) != null) {
            if (TtliveHangoutEnableLiveCardAudioPlayerSetting.INSTANCE.isEnable()) {
                Long l = this.LLJLLIL;
                C479150Iqf c479150Iqf = (C479150Iqf) playCardFeedCellV2.getItem();
                if (c479150Iqf != null && (c479170Iqh = c479150Iqf.LLILLL) != null) {
                    lValueOf = Long.valueOf(c479170Iqh.LIZ);
                }
                if (Intrinsics.LJFF(l, lValueOf)) {
                    MultiTopLivePlayFeedListViewModel multiTopLivePlayFeedListViewModelIp = ip();
                    if (!multiTopLivePlayFeedListViewModelIp.LLILZ && (c0im1Bp1 = multiTopLivePlayFeedListViewModelIp.bp1()) != null) {
                        C479320Iqw c479320Iqw = (C479320Iqw) c0im1Bp1;
                        c479320Iqw.LJII = 0L;
                        c479320Iqw.LJFF = Long.valueOf(System.currentTimeMillis());
                    }
                }
            }
            playCardFeedCellV2.N5();
            this.LLJLL = playCardFeedCellV2;
        }
    }

    public final void op(RecyclerView recyclerView, int i) {
        View viewFindViewByPosition;
        View viewFindViewByPosition2;
        if (this.LLLFZ == i) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (!(layoutManager instanceof LinearLayoutManager) || layoutManager == null || (viewFindViewByPosition2 = layoutManager.findViewByPosition(i)) == null) {
                return;
            }
            Lo(recyclerView, viewFindViewByPosition2);
            return;
        }
        Oo(recyclerView);
        this.LLLFZ = i;
        RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
        if (!(layoutManager2 instanceof LinearLayoutManager) || layoutManager2 == null || (viewFindViewByPosition = layoutManager2.findViewByPosition(i)) == null) {
            return;
        }
        Lo(recyclerView, viewFindViewByPosition);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC479210Iql
    public final void u(boolean z, boolean z2) {
        PlayCardFeedCell playCardFeedCell;
        C479450Ir9 c479450Ir9;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSelected, hasInitTopTab: ");
        sbLIZ.append(z2);
        sbLIZ.append(", MultiTopLivePlayFeedState::refreshState: ");
        sbLIZ.append(new C2217381BqS() { // from class: X.0IrF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C479490IrD c479490IrD = (C479490IrD) obj;
                c479490IrD.getClass();
                return C627260Oiy.LIZLLL(c479490IrD);
            }
        });
        C20441214yg.LIZIZ("MultiTopLivePlayCardFeedAssemV2", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJLIL = z2;
        this.LLJJLIIIJLLLLLLLZ = true;
        this.LLJLILLLLZIIL = true;
        this.LLL = false;
        if (TtliveHangoutEnableLiveCardAudioPlayerSetting.INSTANCE.isEnable()) {
            ip().LLILZ = false;
        }
        if (z) {
            MultiTopLivePlayFeedListViewModel multiTopLivePlayFeedListViewModelIp = ip();
            C23250099c.LIZLLL(multiTopLivePlayFeedListViewModelIp.getAssemVMScope(), C0PEM.LIZJ, null, new C478790Iq5(multiTopLivePlayFeedListViewModelIp, null), 2);
        }
        No();
        C479490IrD c479490IrD = (C479490IrD) ip().getState();
        c479490IrD.getClass();
        if (!(c479490IrD.getListState().LL instanceof C491101vh)) {
            C479490IrD c479490IrD2 = (C479490IrD) ip().getState();
            c479490IrD2.getClass();
            if (!(c479490IrD2.getListState().LL instanceof C1623606Xi)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("checkLastRefreshState, refreshState: ");
                C479490IrD c479490IrD3 = (C479490IrD) ip().getState();
                c479490IrD3.getClass();
                sbLIZ2.append(c479490IrD3.getListState().LL);
                C20441214yg.LIZIZ("MultiTopLivePlayCardFeedAssemV2", C2188811AlT.LIZIZ(sbLIZ2));
                C479440Ir8 c479440Ir8 = C478750Iq1.LIZ;
                if (c479440Ir8 != null && (c479450Ir9 = c479440Ir8.LIZIZ) != null) {
                    c479450Ir9.LJFF(System.currentTimeMillis());
                }
                ip().BQ2(EnumC479370Ir1.INIT, "landing_init", true);
            }
        }
        hp("MultiTopLivePlayFeedAssemV2#onViewResumed");
        ip();
        if (MultiHangoutLiveCardOptimizeSetting.INSTANCE.isEnable()) {
            if (this.LLJJJIL) {
                this.LLJJJIL = false;
                cp(Go());
            } else {
                PlayCardFeedCellV2 playCardFeedCellV2 = this.LLJLL;
                if (playCardFeedCellV2 != null) {
                    playCardFeedCellV2.N5();
                }
            }
        }
        Iterator<View> it2 = new C09RD(Go()).iterator();
        while (true) {
            C09RE c09re = (C09RE) it2;
            if (c09re.hasNext()) {
                View view = (View) c09re.next();
                if (MultiHangoutLiveCardOptimizeSetting.INSTANCE.isEnable()) {
                    RecyclerView.ViewHolder childViewHolder = Go().getChildViewHolder(view);
                    if (childViewHolder instanceof PlayCardFeedCell) {
                        ((PlayCardFeedCell) childViewHolder).LLIZLLLIL = this.LLJLIL;
                    } else if (childViewHolder instanceof PlayCardFeedCellV2) {
                        PlayCardFeedCellV2 playCardFeedCellV22 = (PlayCardFeedCellV2) childViewHolder;
                        playCardFeedCellV22.LLJJIII = this.LLJLIL;
                        playCardFeedCellV22.LLJJIJIIJIL = Vo();
                    }
                } else {
                    RecyclerView.ViewHolder childViewHolder2 = Go().getChildViewHolder(view);
                    if ((childViewHolder2 instanceof PlayCardFeedCell) && (playCardFeedCell = (PlayCardFeedCell) childViewHolder2) != null) {
                        playCardFeedCell.LLIZLLLIL = this.LLJLIL;
                    }
                }
            } else {
                return;
            }
        }
    }
}
