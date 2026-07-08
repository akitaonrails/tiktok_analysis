package com.ss.android.ugc.feed.platform.panel.pip;

import X.C01GW;
import X.C0N0Y;
import X.C0N3W;
import X.C0O0H;
import X.C0O0I;
import X.C0RD6;
import X.C0RUJ;
import X.C0S4J;
import X.C0SR4;
import X.C0SZ8;
import X.C1017070cZd;
import X.C10IT;
import X.C1566140qrE;
import X.C1620040sGA;
import X.C2188811AlT;
import X.C2189821An6;
import X.C299750Boz;
import X.C452501pT;
import X.C589960NBy;
import X.C630740Ooa;
import X.C786410Ut5;
import X.EnumC1620090sGF;
import X.EnumC452301pR;
import X.InterfaceC1554640qYg;
import X.InterfaceC1565950qqv;
import X.InterfaceC1603160row;
import X.InterfaceC1616070s9l;
import X.InterfaceC1620010sG7;
import X.InterfaceC494301wD;
import Y.ARunnableS109S0100000_9;
import Y.ARunnableS124S0100000_24;
import android.os.Handler;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService;
import com.ss.android.ugc.aweme.pipfeed.vm.shared.FeedPipViewModel;
import com.ss.android.ugc.feed.platform.fragment.IRecommendFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS127S0110000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class RecommendFeedPipComponent extends BasePanelComponent implements InterfaceC1616070s9l, InterfaceC1620010sG7, IPipAbility, C0RUJ, InterfaceC1554640qYg {
    public static final C0S4J LLJJIJIIJIL = new C0S4J("FypPipCmp");
    public final C01GW LL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(209));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1563));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1620));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1618));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1617));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 651));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1616));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 652));
    public final C01GW LLJ;
    public C0O0H LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public final C01GW LLJJI;
    public boolean LLJJIII;
    public final C0O0I LLJJIJI;

    @Override // X.C0RUJ
    public final void Ie() {
    }

    @Override // X.C0RUJ
    public final String T1() {
        return "panel_pip_component";
    }

    @Override // X.C0RUJ
    public final void a6() {
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pip.IPipAbility
    public final void ac1() {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.C0RUJ
    public final boolean m8() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo() {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.pip.RecommendFeedPipComponent.mo():void");
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onBeforePageChange() {
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageScrolledEnd(int i, float f, int i2) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageSelected(int i, boolean z) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageUnSelected(C0SZ8 c0sz8) {
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onScrollToItemStart(int i) {
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onScrollToItemStart(int i, boolean z) {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -168195021) {
            return null;
        }
        return this;
    }

    public final IFeedPanelPlatformAbility bo() {
        return (IFeedPanelPlatformAbility) this.LLILZIL.getValue();
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final IPipFeedService m346do() {
        return (IPipFeedService) this.LL.getValue();
    }

    public final IPlayerComponentAbility fo() {
        return (IPlayerComponentAbility) this.LLILZ.getValue();
    }

    public final FeedPipViewModel ho() {
        return (FeedPipViewModel) this.LLILLJJLI.getValue();
    }

    public final IViewPagerComponentAbility ko() {
        return (IViewPagerComponentAbility) this.LLILLL.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [X.0O0I] */
    public RecommendFeedPipComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS553S0100000_9((InterfaceC1565950qqv) this, 1619), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS127S0110000_9(false, (InterfaceC1565950qqv) this, 15));
        }
        this.LLJ = c01gwLIZIZ;
        this.LLJJI = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(357));
        this.LLJJIJI = new InterfaceC1603160row() { // from class: X.0O0I
            @Override // X.InterfaceC1603160row
            public final void onEmpty() {
                C0O0H c0o0h = this.LIZ.LLJI;
                if (c0o0h != null) {
                    c0o0h.onEmpty();
                }
                this.LIZ.LLJI = null;
            }

            @Override // X.InterfaceC1603160row
            public final void onFailed() {
                C0O0H c0o0h = this.LIZ.LLJI;
                if (c0o0h != null) {
                    c0o0h.LIZ(null);
                }
                this.LIZ.LLJI = null;
            }
        };
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pip.IPipAbility
    public final void cq() {
        ho().LLJ = this;
        m346do().LJIIZILJ("For You");
    }

    @Override // X.C0RUJ
    public final void lj() {
        ho().LLJ = this;
        m346do().LJIIZILJ("For You");
        m346do().LIZ();
        m346do().LJIILJJIL("stitch", "duet", "disable_ad_videos", "fyp_whitelist_video", "sub_aweme", "photo_sensitive");
    }

    public final void lo() {
        C0SZ8 c0sz8LJLIL;
        VideoViewCell videoViewCell;
        C0N0Y playerManager;
        if (ho().LLJJJ) {
            boolean z = false;
            ho().LLJJJ = false;
            this.LLJIJIL = false;
            this.LLJILJILJ = false;
            IPlayerComponentAbility iPlayerComponentAbilityFo = fo();
            if (iPlayerComponentAbilityFo != null && (playerManager = iPlayerComponentAbilityFo.getPlayerManager()) != null) {
                playerManager.setSpeed(ho().LLJJIJIL.LIZJ);
            }
            C589960NBy c589960NBy = C589960NBy.LIZ;
            Aweme value = ho().LL.getValue();
            float f = ho().LLJJIJIL.LIZJ;
            float f2 = ho().LLJJIJIL.LIZLLL;
            c589960NBy.getClass();
            C589960NBy.LIZIZ = value;
            C589960NBy.LIZJ = f;
            C589960NBy.LIZLLL = f2;
            IPlayerComponentAbility iPlayerComponentAbilityFo2 = fo();
            if (iPlayerComponentAbilityFo2 != null && iPlayerComponentAbilityFo2.uz1() == 3) {
                z = true;
            }
            if (ho().LLJJIJIL.LIZIZ) {
                if (!z) {
                    C786410Ut5.LJLIIL(0L, (Handler) this.LLJJI.getValue(), new ARunnableS124S0100000_24(this, 85));
                }
                this.LLJJ = true;
                IViewPagerComponentAbility iViewPagerComponentAbilityKo = ko();
                C0SZ8 c0sz8LJLIL2 = iViewPagerComponentAbilityKo != null ? iViewPagerComponentAbilityKo.LJLIL() : null;
                if ((c0sz8LJLIL2 instanceof VideoViewCell) && (videoViewCell = (VideoViewCell) c0sz8LJLIL2) != null) {
                    videoViewCell.l0(2);
                }
            } else if (z) {
                IPlayerComponentAbility iPlayerComponentAbilityFo3 = fo();
                if (iPlayerComponentAbilityFo3 != null) {
                    iPlayerComponentAbilityFo3.tryResumePlay();
                }
                IPlayButtonAbility iPlayButtonAbility = (IPlayButtonAbility) this.LLILZLL.getValue();
                if (iPlayButtonAbility != null) {
                    iPlayButtonAbility.cx1(true);
                }
            }
            IViewPagerComponentAbility iViewPagerComponentAbilityKo2 = ko();
            if (iViewPagerComponentAbilityKo2 != null && (c0sz8LJLIL = iViewPagerComponentAbilityKo2.LJLIL()) != null) {
                c0sz8LJLIL.G();
            }
            C0S4J c0s4j = LLJJIJIIJIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resumed state with ");
            Aweme value2 = ho().LL.getValue();
            sbLIZ.append(value2 != null ? value2.getAid() : null);
            sbLIZ.append(", some info: (prog: ");
            sbLIZ.append(ho().LLJJIJIL.LIZ);
            sbLIZ.append(" speed: ");
            sbLIZ.append(ho().LLJJIJIL.LIZJ);
            sbLIZ.append(')');
            c0s4j.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        IViewPagerComponentAbility iViewPagerComponentAbilityKo = ko();
        if (iViewPagerComponentAbilityKo != null) {
            iViewPagerComponentAbilityKo.Bv0(this);
        }
        ho().LLJ = this;
        m346do().LJIIZILJ("For You");
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        String from;
        Aweme awemeLJIIIIZZ;
        String aid;
        String aid2;
        C0SR4 c0sr4Zv0;
        List<Aweme> listFg;
        super.onPause();
        if (m346do().LJ()) {
            FeedPipViewModel feedPipViewModelHo = ho();
            feedPipViewModelHo.LLILZIL = "For You";
            IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBo = bo();
            if (iFeedPanelPlatformAbilityBo != null) {
                iFeedPanelPlatformAbilityBo.LJLJJL();
                feedPipViewModelHo.LLJJIJIL.getClass();
            }
            IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBo2 = bo();
            String eventType = null;
            if (iFeedPanelPlatformAbilityBo2 == null || (c0sr4Zv0 = iFeedPanelPlatformAbilityBo2.Zv0()) == null || (listFg = c0sr4Zv0.Fg()) == null) {
                C589960NBy.LIZ.getClass();
                C589960NBy.LIZIZ = null;
                C589960NBy.LIZLLL = 1.0f;
                C589960NBy.LIZJ = 1.0f;
            } else {
                ((ArrayList) feedPipViewModelHo.LLJI).clear();
                ((ArrayList) feedPipViewModelHo.LLJI).addAll(listFg);
                feedPipViewModelHo.zQ2(listFg);
                feedPipViewModelHo.LLJILJIL.setValue(feedPipViewModelHo.wQ2());
            }
            IFeedFetchDataAbility iFeedFetchDataAbility = (IFeedFetchDataAbility) this.LLJ.getValue();
            int pageType = 0;
            feedPipViewModelHo.LLILZLL = iFeedFetchDataAbility != null ? iFeedFetchDataAbility.isLoading() : false;
            IPlayerComponentAbility iPlayerComponentAbilityFo = fo();
            feedPipViewModelHo.LLJJIJIL.LIZIZ = iPlayerComponentAbilityFo != null && iPlayerComponentAbilityFo.uz1() == 3 && this.LLJJ;
            IViewPagerComponentAbility iViewPagerComponentAbilityKo = ko();
            if (iViewPagerComponentAbilityKo != null && (awemeLJIIIIZZ = iViewPagerComponentAbilityKo.LJIIIIZZ()) != null) {
                C589960NBy.LIZ.getClass();
                feedPipViewModelHo.LLJJIJIL.LIZJ = C589960NBy.LIZJ(awemeLJIIIIZZ);
                feedPipViewModelHo.LLJJIJIL.LIZLLL = C589960NBy.LIZIZ(awemeLJIIIIZZ);
                C10IT.LIZ.getClass();
                if (C10IT.LJIILIIL(awemeLJIIIIZZ) && (aid2 = awemeLJIIIIZZ.getAid()) != null) {
                    feedPipViewModelHo.LLJJIJIIJIL.add(aid2);
                }
                if (C1017070cZd.LLIZLLLIL(awemeLJIIIIZZ) && (aid = awemeLJIIIIZZ.getAid()) != null) {
                    feedPipViewModelHo.LLJJIJIIJIL.add(aid);
                }
                feedPipViewModelHo.LL.setValue(awemeLJIIIIZZ);
                feedPipViewModelHo.LLILLL = awemeLJIIIIZZ;
            }
            IPlayerComponentAbility iPlayerComponentAbilityFo2 = fo();
            if (iPlayerComponentAbilityFo2 != null) {
                feedPipViewModelHo.LLJJIJIL.LIZ = iPlayerComponentAbilityFo2.An2() / 100.0f;
            }
            feedPipViewModelHo.LLJJI.setValue(EnumC1620090sGF.SUCCEED);
            C2189821An6 c2189821An6 = getPanelContext().LIZJ;
            C0N3W c0n3w = feedPipViewModelHo.LLIZLLLIL;
            if (c2189821An6 != null) {
                from = c2189821An6.getFrom();
                pageType = c2189821An6.getPageType();
                eventType = c2189821An6.getEventType();
            } else {
                from = null;
            }
            c0n3w.getClass();
            feedPipViewModelHo.LLIZLLLIL = new C0N3W(from, pageType, eventType);
            feedPipViewModelHo.LLIZ = c2189821An6;
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
        if (m346do().LJ() && ho().LLJJJ) {
            if (!m346do().md()) {
                mo();
                return;
            }
            m346do().LIZLLL();
            LLJJIJIIJIL.LJIILL("after-Start window destroy, calling restore process");
            mo();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pip.IPipAbility
    public final boolean ty2() {
        return m346do().md();
    }

    @Override // X.InterfaceC1620010sG7
    public final void Fa(C1620040sGA c1620040sGA) {
        if (!this.LLJJIII) {
            ILoadMoreAbility iLoadMoreAbility = (ILoadMoreAbility) this.LLIZ.getValue();
            if (iLoadMoreAbility != null) {
                iLoadMoreAbility.u31(this.LLJJIJI);
            }
            this.LLJJIII = true;
        }
        IRecommendFeedFragmentAbility iRecommendFeedFragmentAbility = (IRecommendFeedFragmentAbility) this.LLIZLLLIL.getValue();
        if (iRecommendFeedFragmentAbility != null) {
            iRecommendFeedFragmentAbility.mx0();
        }
        this.LLJI = c1620040sGA;
        C786410Ut5.LJLIIL(3000L, (Handler) this.LLJJI.getValue(), new ARunnableS109S0100000_9(this, 22));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pip.IPipAbility
    public final void To2(boolean z) {
        this.LLJJ = z;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pip.IPipAbility
    public final int ek1(Aweme aweme) {
        String aid;
        if (!m346do().LJ() || aweme == null) {
            return 0;
        }
        FeedPipViewModel feedPipViewModelHo = ho();
        Aweme aweme2 = feedPipViewModelHo.LLJJIII;
        if (aweme2 != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        if (!Intrinsics.LJFF(aid, aweme.getAid()) || !feedPipViewModelHo.LLJJJ || aweme.getVideo() == null) {
            return 0;
        }
        return (int) (ho().LLJJIJIL.LIZ * aweme.getVideo().getDuration());
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        c0rd6.LIZIZ("event_on_render_first_frame", new AwS603S0100000_24(this, 404));
        c0rd6.LIZIZ("event_on_play_pause", new AwS603S0100000_24(this, 405));
        c0rd6.LIZIZ("event_on_request_resume_play", new AwS603S0100000_24(this, 406));
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        C0SR4 c0sr4Zv0;
        this.LLJJ = false;
        if (!m346do().LJ()) {
            return;
        }
        if (m346do().md()) {
            C0O0H c0o0h = this.LLJI;
            if (c0o0h != null) {
                IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBo = bo();
                if (iFeedPanelPlatformAbilityBo != null && (c0sr4Zv0 = iFeedPanelPlatformAbilityBo.Zv0()) != null) {
                    c0o0h.LIZIZ(c0sr4Zv0.LJJJLZIJ(), c0sr4Zv0.LLJILLL);
                }
                this.LLJI = null;
                return;
            }
            return;
        }
        this.LLJI = null;
        if (!this.LLJILJIL) {
            return;
        }
        m346do().LJIJJLI();
        this.LLJILJIL = false;
        this.LLJILJILJ = true;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pip.IPipAbility
    public final boolean tW1(Aweme aweme) {
        String aid;
        String aid2;
        C0S4J c0s4j = LLJJIJIIJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Checking Video Play Event: aweme: ");
        sbLIZ.append(aweme.getAid());
        sbLIZ.append(", lastPipAweme: ");
        Aweme aweme2 = ho().LLJJIII;
        if (aweme2 != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(", beforeRestore: ");
        sbLIZ.append(ho().LLJJJ);
        c0s4j.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        String aid3 = aweme.getAid();
        Aweme aweme3 = ho().LLJJIII;
        if (aweme3 != null) {
            aid2 = aweme3.getAid();
        } else {
            aid2 = null;
        }
        if (Intrinsics.LJFF(aid3, aid2)) {
            ho().xQ2(null);
            return true;
        }
        return false;
    }
}
