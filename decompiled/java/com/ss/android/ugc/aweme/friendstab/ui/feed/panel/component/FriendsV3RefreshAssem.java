package com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0W17;
import X.C1223490hwZ;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1581380rFo;
import X.C1581390rFp;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452501pT;
import X.C481090Itn;
import X.C724240Sb0;
import X.C724750Sbp;
import X.InterfaceC19341710lj;
import X.InterfaceC2217461Bqa;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3RepostEntranceVM;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.inbox.InsertStory;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS146S0201000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS77S0301000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsV3RefreshAssem extends UIContentAssem implements InterfaceC19341710lj, IFriendsV3RefreshAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public C481090Itn LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final AssemVMLazy LLJI;
    public final C01GW LLJIJIL;
    public int LLJILJIL;
    public C1223490hwZ LLJILJILJ;
    public InsertStory LLJILLL;
    public AwS77S0301000_24 LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsV3RefreshAssem.class, "feedViewModel", "getFeedViewModel()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3FeedListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(FriendsV3RefreshAssem.class, "repostVM", "getRepostVM()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3RepostEntranceVM;", 0);
        c09r3.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public FriendsV3RefreshAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FriendsV3FeedListViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ, 527), AFwS264S0000000_24.get$arr$(158), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FriendsV3RepostEntranceVM.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ2, 528), AFwS264S0000000_24.get$arr$(159), null, true);
        this.LLJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 525));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.IFriendsV3RefreshAbility
    public final void Ep1() {
        C481090Itn c481090Itn = this.LLIZLLLIL;
        if (c481090Itn != null) {
            c481090Itn.LLJJI = false;
        }
    }

    public final FriendsV3FeedListViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        return (FriendsV3FeedListViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.IFriendsV3RefreshAbility
    public final boolean LJJIIJZLJL() {
        C481090Itn c481090Itn = this.LLIZLLLIL;
        if (c481090Itn != null) {
            return c481090Itn.LLLFF;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.IFriendsV3RefreshAbility
    public final void t12() {
        C481090Itn c481090Itn = this.LLIZLLLIL;
        if (c481090Itn != null) {
            c481090Itn.LJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    @Override // X.InterfaceC19341710lj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF() {
        /*
            r4 = this;
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onRefresh, refreshSource="
            r1.append(r0)
            int r0 = r4.LLJILJIL
            r1.append(r0)
            java.lang.String r0 = ", storyToInsert="
            r1.append(r0)
            com.ss.android.ugc.aweme.story.inbox.InsertStory r0 = r4.LLJILLL
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "refresh"
            X.C0W17.LIZJ(r0, r1)
            int r1 = r4.LLJILJIL
            r2 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            boolean r1 = Jo(r1, r0)
            r0 = 2
            if (r1 == 0) goto L87
            int r1 = r4.LLJILJIL
            if (r1 != r0) goto L3b
        L33:
            X.0e0i r0 = new X.0e0i
            r0.<init>()
            X.C1440005kM.LIZ(r0)
        L3b:
            com.ss.android.ugc.aweme.story.inbox.InsertStory r0 = r4.LLJILLL
            kotlin.jvm.internal.AwS146S0201000_24 r2 = r4.Ho(r2, r1, r0)
            boolean r0 = X.C296410Bjb.LIZ()
            if (r0 != 0) goto L60
            X.01GW r0 = X.C1582270rHF.LIZIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3RecUserConfig r0 = (com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3RecUserConfig) r0
            boolean r0 = r0.addBottomUserCard
            if (r0 == 0) goto L60
            X.01GW r0 = r4.LLJIJIL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility r0 = (com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility) r0
            if (r0 == 0) goto L60
            r0.NO0()
        L60:
            com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel r1 = r4.Go()
            X.0hwZ r0 = r4.LLJILJILJ
            r1.DQ2(r0)
            r3 = 0
            r4.LLJILJILJ = r3
            if (r2 == 0) goto L71
            r2.invoke()
        L71:
            com.bytedance.assem.arch.viewModel.AssemVMLazy r1 = r4.LLJI
            X.1Bqa<java.lang.Object>[] r0 = com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3RefreshAssem.LLJJI
            com.bytedance.assem.arch.viewModel.AssemViewModel r2 = r1.getValue()
            com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3RepostEntranceVM r2 = (com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3RepostEntranceVM) r2
            com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel r0 = r4.Go()
            long r0 = r0.LLILZLL
            r2.vQ2(r0)
            r4.LLJILLL = r3
            return
        L87:
            r1 = 2
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3RefreshAssem.LJFF():void");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        this.LLJJ = null;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IFriendsV3RefreshAbility.class, null);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IFriendsV3RefreshAbility.class, null, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ac  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r11) {
        /*
            r10 = this;
            r5 = r10
            super.onViewCreated(r11)
            X.0rQ4 r0 = X.C1587740rQ4.LIZ
            r0.getClass()
            boolean r0 = X.C1587740rQ4.LJIJI
            if (r0 != 0) goto L13
            long r0 = android.os.SystemClock.elapsedRealtime()
            X.C1587740rQ4.LIZLLL = r0
        L13:
            r0 = 2131388041(0x7f0a6689, float:1.8396586E38)
            android.view.View r0 = r11.findViewById(r0)
            X.0Itn r0 = (X.C481090Itn) r0
            r5.LLIZLLLIL = r0
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onViewCreated, refreshLayout="
            r1.append(r0)
            X.0Itn r0 = r5.LLIZLLLIL
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "refresh"
            X.C0W17.LIZJ(r0, r1)
            X.0Itn r1 = r5.LLIZLLLIL
            r0 = 1
            if (r1 == 0) goto L4a
            r1.setOnRefreshListener(r5)
            r1.setNestedScrollEnabledWhenNonTouch(r0)
            X.0Itk r0 = X.EnumC481060Itk.REFRESH
            r1.setScrollMode(r0)
            X.10o9 r0 = X.EnumC19356710o9.ALWAYS
            r1.setOverScrollMode(r0)
        L4a:
            X.01GW r0 = X.C1558040qeA.LIZIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3NavHideOnScrollConfig r0 = (com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3NavHideOnScrollConfig) r0
            boolean r0 = r0.enable
            if (r0 == 0) goto L89
            r0 = 2131373659(0x7f0a2e5b, float:1.8367415E38)
            android.view.View r0 = r11.findViewById(r0)
            r4 = 0
            if (r0 == 0) goto Lac
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 == 0) goto Lac
            int r0 = r0.height
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 <= 0) goto Lac
            int r3 = r1.intValue()
        L76:
            X.0Itn r2 = r5.LLIZLLLIL
            if (r2 == 0) goto L89
            r2.setClipChildren(r4)
            X.0mHp r1 = new X.0mHp
            android.content.Context r0 = r2.getContext()
            r1.<init>(r0, r3)
            r2.setNestedHeader(r1)
        L89:
            com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel r3 = r5.Go()
            X.0qwo r4 = new X.C2217381BqS() { // from class: X.0qwo
                static {
                    /*
                        X.0qwo r0 = new X.0qwo
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0qwo) X.0qwo.LL X.0qwo
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1569600qwo.<clinit>():void");
                }

                {
                    /*
                        r4 = this;
                        java.lang.Class<X.0hwT> r3 = X.C1223430hwT.class
                        java.lang.String r2 = "getRefreshState()Lcom/bytedance/assem/arch/extensions/Async;"
                        r1 = 0
                        java.lang.String r0 = "refreshState"
                        r4.<init>(r3, r0, r2, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1569600qwo.<init>():void");
                }

                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final java.lang.Object get(java.lang.Object r2) {
                    /*
                        r1 = this;
                        X.0hwT r2 = (X.C1223430hwT) r2
                        r2.getClass()
                        X.06Xk r0 = X.C627260Oiy.LIZLLL(r2)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1569600qwo.get(java.lang.Object):java.lang.Object");
                }
            }
            X.0wBP r6 = X.C736820SvI.LIZLLL()
            kotlin.jvm.internal.AwS603S0100000_24 r7 = new kotlin.jvm.internal.AwS603S0100000_24
            r0 = 78
            r7.<init>(r5, r0)
            kotlin.jvm.internal.AwS568S0100000_24 r8 = new kotlin.jvm.internal.AwS568S0100000_24
            r0 = 526(0x20e, float:7.37E-43)
            r8.<init>(r5, r0)
            kotlin.jvm.internal.AwS603S0100000_24 r9 = new kotlin.jvm.internal.AwS603S0100000_24
            r0 = 79
            r9.<init>(r5, r0)
            r3.asyncSubscribe(r4, r5, r6, r7, r8, r9)
            return
        Lac:
            r0 = 44
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r3 = X.C814420VxA.LIZIZ(r0)
            goto L76
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3RefreshAssem.onViewCreated(android.view.View):void");
    }

    public static boolean Jo(int i, Integer num) {
        switch (i) {
            case 1:
            case 3:
            case 7:
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
                return true;
            case 2:
            case 5:
            default:
                return false;
            case 4:
            case 6:
                if (num == null || num.intValue() != 0) {
                    return false;
                }
                return true;
        }
    }

    public final AwS146S0201000_24 Ho(boolean z, int i, InsertStory insertStory) {
        Long lValueOf;
        AwS146S0201000_24 awS146S0201000_24 = new AwS146S0201000_24(this, insertStory, i, 0);
        if (Go().LLIZLLLIL == null) {
            return awS146S0201000_24;
        }
        C1581380rFo c1581380rFo = Go().LLIZLLLIL;
        if (c1581380rFo != null) {
            lValueOf = Long.valueOf(c1581380rFo.LIZ);
        } else {
            lValueOf = null;
        }
        AwS77S0301000_24 awS77S0301000_24 = new AwS77S0301000_24(this, insertStory, i, lValueOf, 1);
        Go().LLIZLLLIL = null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refreshSkylightList, need delay to fetch skylight data, excludeFeedsRefresh: ");
        sbLIZ.append(z);
        C0W17.LIZJ("refresh", C2188811AlT.LIZIZ(sbLIZ));
        C1581390rFp.LIZIZ(C724240Sb0.LJI(this));
        if (z) {
            awS77S0301000_24.invoke();
            return null;
        }
        this.LLJJ = awS77S0301000_24;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0188 A[PHI: r5
      0x0188: PHI (r5v1 java.lang.String) = (r5v0 java.lang.String), (r5v3 java.lang.String), (r5v3 java.lang.String) binds: [B:70:0x0184, B:10:0x005a, B:12:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.IFriendsV3RefreshAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void lv1(int r10, boolean r11, com.ss.android.ugc.aweme.story.inbox.InsertStory r12, X.C1581400rFq r13, int r14) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3RefreshAssem.lv1(int, boolean, com.ss.android.ugc.aweme.story.inbox.InsertStory, X.0rFq, int):void");
    }
}
