package com.ss.android.ugc.aweme.friendstab.ui.feed.panel.player;

import X.C019F;
import X.C01GW;
import X.C03H5;
import X.C09R3;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1608260rxA;
import X.C1608290rxD;
import X.C1637806bA;
import X.C1637906bB;
import X.C1699360uK6;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C1ACD;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452501pT;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.EnumC1913520ztW;
import X.InterfaceC0148002o;
import X.InterfaceC1582750rI1;
import X.InterfaceC1588310rQz;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2175541ACi;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.live.FriendsV3LivePlayerHandleAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3AudioMuteViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3PageViewModel;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsV3LivePlayerComponent extends BasePanelComponent implements FriendsV3LivePlayerAbility, InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public InterfaceC1588310rQz LL;
    public final AssemVMLazy LLILLJJLI;
    public final AssemVMLazy LLILLL;
    public C1ACD LLILZ;
    public final C01GW LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsV3LivePlayerComponent.class, "audioMuteVM", "getAudioMuteVM()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3AudioMuteViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(FriendsV3LivePlayerComponent.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3PageViewModel;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public FriendsV3LivePlayerComponent() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FriendsV3AudioMuteViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLILLJJLI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ, 550), AFwS264S0000000_24.get$arr$(164), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FriendsV3PageViewModel.class);
        this.LLILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ2, 551), AFwS264S0000000_24.get$arr$(165), null, true);
        this.LLILZIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 549));
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0rxB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1608260rxA) obj).LLILLL);
            }
        }, null, new AwS638S0100000_24(this, 38), 6);
        C736680Sv4.LJIIIIZZ(this, this.LLILLL.getValue(), new C2217381BqS() { // from class: X.0rGz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0O2L) obj).LLILLJJLI;
            }
        }, null, new AwS638S0100000_24(this, 39), 6);
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        this.LLILZ = iLiveOuterService != null ? iLiveOuterService.generateLivePlayHelper((InterfaceC2175541ACi) this.LLILZIL.getValue(), EnumC1913520ztW.SEARCH) : null;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.player.FriendsV3LivePlayerAbility
    public final Boolean b50() {
        C1608290rxD c1608290rxDLJIIL;
        C1ACD c1acd = this.LLILZ;
        if (c1acd == null || (c1608290rxDLJIIL = c1acd.LJIIL()) == null) {
            return null;
        }
        return Boolean.valueOf(c1608290rxDLJIIL.LIZIZ > 0);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.player.FriendsV3LivePlayerAbility
    public final int be0() {
        C1608290rxD c1608290rxDLJIIL;
        C1ACD c1acd = this.LLILZ;
        if (c1acd == null || (c1608290rxDLJIIL = c1acd.LJIIL()) == null) {
            return 0;
        }
        return c1608290rxDLJIIL.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.live.FriendsV3LivePlayerHandleAbility bo() {
        /*
            r4 = this;
            X.0rQz r3 = r4.LL
            boolean r0 = r3 instanceof com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.live.FriendsV3LiveCell
            r2 = 0
            if (r0 == 0) goto L4f
            com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.live.FriendsV3LiveCell r3 = (com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.live.FriendsV3LiveCell) r3
            if (r3 == 0) goto L4f
        Lb:
            boolean r0 = r3 instanceof com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility
            if (r0 == 0) goto L26
            if (r3 == 0) goto L26
            r3.Fz2()
            X.0Q7z r1 = X.C1558420qem.LIZIZ(r3)
            if (r1 == 0) goto L26
            java.lang.Class<com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.live.FriendsV3LivePlayerHandleAbility> r0 = com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.live.FriendsV3LivePlayerHandleAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r2)
            if (r0 == 0) goto L26
            r2 = r0
        L23:
            com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.live.FriendsV3LivePlayerHandleAbility r2 = (com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.live.FriendsV3LivePlayerHandleAbility) r2
            return r2
        L26:
            boolean r0 = r3 instanceof X.C0SZ8
            if (r0 == 0) goto L4d
            X.0SZ8 r3 = (X.C0SZ8) r3
            if (r3 == 0) goto L4d
            X.0SZ8 r1 = r3.LLJLLL()
        L32:
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility
            if (r0 == 0) goto L23
            com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility r1 = (com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility) r1
            if (r1 == 0) goto L23
            X.0RyY r0 = r1.Fz2()
            if (r0 == 0) goto L23
            X.0Q7z r1 = X.C1558420qem.LIZIZ(r0)
            if (r1 == 0) goto L23
            java.lang.Class<com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.live.FriendsV3LivePlayerHandleAbility> r0 = com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.live.FriendsV3LivePlayerHandleAbility.class
            X.01wD r2 = X.C1558520qew.LIZ(r1, r0, r2)
            goto L23
        L4d:
            r1 = r2
            goto L32
        L4f:
            r3 = r2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.ui.feed.panel.player.FriendsV3LivePlayerComponent.bo():com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.live.FriendsV3LivePlayerHandleAbility");
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.player.FriendsV3LivePlayerAbility
    public final String z9() {
        C1608290rxD c1608290rxDLJIIL;
        String str;
        C1ACD c1acd = this.LLILZ;
        return (c1acd == null || (c1608290rxDLJIIL = c1acd.LJIIL()) == null || (str = c1608290rxDLJIIL.LIZ) == null) ? "normal" : str;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), FriendsV3LivePlayerAbility.class, null);
        }
        C1ACD c1acd = this.LLILZ;
        if (c1acd != null) {
            c1acd.LIZIZ();
        }
        C1ACD c1acd2 = this.LLILZ;
        if (c1acd2 != null) {
            c1acd2.LJJIJIL(null, true);
        }
        this.LLILZ = null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, FriendsV3LivePlayerAbility.class, null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.player.FriendsV3LivePlayerAbility
    public final void oT0(InterfaceC1588310rQz interfaceC1588310rQz) {
        if (!Intrinsics.LJFF(this.LL, interfaceC1588310rQz)) {
            return;
        }
        C1ACD c1acd = this.LLILZ;
        if (c1acd != null) {
            c1acd.LIZIZ();
        }
        C1ACD c1acd2 = this.LLILZ;
        if (c1acd2 != null) {
            c1acd2.LJJIJIL(null, true);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.player.FriendsV3LivePlayerAbility
    public final void k71(InterfaceC1588310rQz interfaceC1588310rQz, boolean z) {
        String strGq;
        String aid;
        FrameLayout playViewContainer;
        Aweme aweme;
        RoomFeedCellStruct roomFeedCellStruct;
        LiveRoomStruct newLiveRoomData;
        Aweme aweme2;
        String aid2 = null;
        if (interfaceC1588310rQz != null) {
            strGq = interfaceC1588310rQz.gq();
        } else {
            strGq = null;
        }
        if (!Intrinsics.LJFF(strGq, "cell_live")) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryPlay, cell aid= ");
        if (interfaceC1588310rQz != null && (aweme2 = interfaceC1588310rQz.getAweme()) != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        if (interfaceC1588310rQz.LLIZLLLIL() == null) {
            this.LL = null;
            return;
        }
        if (z && !Intrinsics.LJFF(interfaceC1588310rQz, this.LL)) {
            return;
        }
        this.LL = interfaceC1588310rQz;
        FriendsV3LivePlayerHandleAbility friendsV3LivePlayerHandleAbilityBo = bo();
        if (friendsV3LivePlayerHandleAbilityBo != null) {
            friendsV3LivePlayerHandleAbilityBo.bj2();
        }
        FriendsV3LivePlayerHandleAbility friendsV3LivePlayerHandleAbilityBo2 = bo();
        if (friendsV3LivePlayerHandleAbilityBo2 != null && friendsV3LivePlayerHandleAbilityBo2.Zr()) {
            InterfaceC1582750rI1 interfaceC1582750rI1LLIZLLLIL = interfaceC1588310rQz.LLIZLLLIL();
            if (interfaceC1582750rI1LLIZLLLIL != null && (playViewContainer = interfaceC1582750rI1LLIZLLLIL.getPlayViewContainer()) != null && (aweme = interfaceC1588310rQz.getAweme()) != null && (roomFeedCellStruct = aweme.getRoomFeedCellStruct()) != null && (newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData()) != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("play, request roomid= ");
                sbLIZ2.append(newLiveRoomData.id);
                C2188811AlT.LIZIZ(sbLIZ2);
                C1ACD c1acd = this.LLILZ;
                if (c1acd != null) {
                    c1acd.LJIILIIL(new C1699360uK6("getEnterFrom()", "getEnterMethod()", "", null, false, true, 40));
                    AssemVMLazy assemVMLazy = this.LLILLJJLI;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
                    c1acd.LJJIIJZLJL(((C1608260rxA) assemVMLazy.getValue().getState()).LLILLL, newLiveRoomData, playViewContainer, false, null, "", false, null);
                }
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("tryPlay, cell = ");
            sbLIZ3.append(interfaceC1588310rQz);
            sbLIZ3.append(",aweme:");
            Aweme aweme3 = interfaceC1588310rQz.getAweme();
            if (aweme3 != null) {
                aid2 = aweme3.getAid();
            }
            sbLIZ3.append(aid2);
            C2188811AlT.LIZIZ(sbLIZ3);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.player.FriendsV3LivePlayerAbility
    public final void ph2(InterfaceC1588310rQz interfaceC1588310rQz, boolean z) {
        String aid;
        InterfaceC1582750rI1 interfaceC1582750rI1LLIZLLLIL;
        InterfaceC1582750rI1 interfaceC1582750rI1LLIZLLLIL2;
        InterfaceC1588310rQz interfaceC1588310rQz2;
        boolean zBooleanValue;
        Aweme aweme;
        if (z && !Intrinsics.LJFF(interfaceC1588310rQz, this.LL)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryPause, cell aid= ");
        if (interfaceC1588310rQz != null && (aweme = interfaceC1588310rQz.getAweme()) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
        FriendsV3LivePlayerHandleAbility friendsV3LivePlayerHandleAbilityBo = bo();
        if (friendsV3LivePlayerHandleAbilityBo != null) {
            Boolean boolB50 = b50();
            if (boolB50 != null) {
                zBooleanValue = boolB50.booleanValue();
            } else {
                zBooleanValue = false;
            }
            friendsV3LivePlayerHandleAbilityBo.df(zBooleanValue);
        }
        FriendsV3LivePlayerHandleAbility friendsV3LivePlayerHandleAbilityBo2 = bo();
        if (friendsV3LivePlayerHandleAbilityBo2 != null && friendsV3LivePlayerHandleAbilityBo2.Zr()) {
            InterfaceC1588310rQz interfaceC1588310rQz3 = this.LL;
            if (interfaceC1588310rQz3 != null) {
                interfaceC1582750rI1LLIZLLLIL = interfaceC1588310rQz3.LLIZLLLIL();
            } else {
                interfaceC1582750rI1LLIZLLLIL = null;
            }
            if (interfaceC1588310rQz != null) {
                interfaceC1582750rI1LLIZLLLIL2 = interfaceC1588310rQz.LLIZLLLIL();
            } else {
                interfaceC1582750rI1LLIZLLLIL2 = null;
            }
            if (Intrinsics.LJFF(interfaceC1582750rI1LLIZLLLIL, interfaceC1582750rI1LLIZLLLIL2) && (interfaceC1588310rQz2 = this.LL) != null && interfaceC1588310rQz2.LLIZLLLIL() != null) {
                C1ACD c1acd = this.LLILZ;
                if (c1acd != null) {
                    c1acd.LIZIZ();
                }
                C1ACD c1acd2 = this.LLILZ;
                if (c1acd2 != null) {
                    c1acd2.LJJIJIL(null, true);
                }
            }
        }
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
