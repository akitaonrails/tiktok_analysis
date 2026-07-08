package com.ss.android.ugc.aweme.comment.quickmention;

import X.C01GW;
import X.C03H5;
import X.C0DK7;
import X.C0S78;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1209980ham;
import X.C1218650hol;
import X.C1339840kyE;
import X.C1345120l6k;
import X.C1347810lB5;
import X.C1350680lFi;
import X.C1350700lFk;
import X.C1350710lFl;
import X.C1350720lFm;
import X.C1351410lGt;
import X.C1351420lGu;
import X.C13LE;
import X.C14EU;
import X.C1566140qrE;
import X.C1637806bA;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C275950Arh;
import X.C299750Boz;
import X.C451640HnO;
import X.C452230HoL;
import X.C452250HoN;
import X.C452501pT;
import X.C622680Oba;
import X.C628500Oky;
import X.C630740Ooa;
import X.C736680Sv4;
import X.EnumC1347820lB6;
import X.EnumC452301pR;
import X.InterfaceC0148002o;
import X.InterfaceC1565950qqv;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes22.dex */
public final class QuickMentionLogicComponent extends BasePanelComponent implements IQuickMentionLogicAbility, InterfaceC724530SbT {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C630740Ooa LLILLL;
    public final C01GW LLILZ;

    public QuickMentionLogicComponent() {
        C01GW c01gwLIZIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(QuickMentionVM.class);
        this.LL = C452501pT.LIZIZ(new C1218650hol(this, c19719912DlLIZ, C1637806bA.LIZ, new C452230HoL(c19719912DlLIZ), new C452250HoN(), null));
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS565S0100000_21((InterfaceC1565950qqv) this, 218), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new C1350700lFk(false, this));
        }
        this.LLILLJJLI = c01gwLIZIZ;
        this.LLILLL = C628500Oky.LIZ(new C1350710lFl(this));
        this.LLILZ = C452501pT.LIZIZ(new C1350720lFm(this));
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

    public final IFeedPanelPlatformAbility bo() {
        return (IFeedPanelPlatformAbility) this.LLILLJJLI.getValue();
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final void m170do() {
        if (((C1347810lB5) ((AssemViewModel) this.LL.getValue()).getState()).LL == EnumC1347820lB6.SHOW) {
            IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBo = bo();
            if (C1351410lGt.LIZLLL(iFeedPanelPlatformAbilityBo != null ? iFeedPanelPlatformAbilityBo.LJIIIIZZ() : null) == null) {
                C0DK7.LIZ().LIZIZ();
            }
        }
        ((QuickMentionVM) this.LL.getValue()).vQ2(EnumC1347820lB6.HIDE);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C622680Oba.LIZLLL(this);
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLILLL.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Xl0((C1350680lFi) this.LLILZ.getValue());
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        C0S78.LJFF(true, new C451640HnO(this));
    }

    @Override // com.ss.android.ugc.aweme.comment.quickmention.IQuickMentionLogicAbility
    public final void eA1(C1345120l6k c1345120l6k) {
        List<TextExtraStruct> list;
        String uid;
        Aweme awemeLJIIIIZZ;
        Aweme awemeLJIIIIZZ2;
        User userLIZLLL;
        List<TextExtraStruct> list2 = c1345120l6k.LIZIZ;
        if (list2 != null && !list2.isEmpty()) {
            m170do();
            if (((Boolean) C275950Arh.LIZ.getValue()).booleanValue() && (list = c1345120l6k.LIZIZ) != null && !list.isEmpty()) {
                Iterator<TextExtraStruct> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (it2.next().isTakoUser()) {
                        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBo = bo();
                        String aid = null;
                        if (iFeedPanelPlatformAbilityBo != null && (awemeLJIIIIZZ2 = iFeedPanelPlatformAbilityBo.LJIIIIZZ()) != null && (userLIZLLL = C1351410lGt.LIZLLL(awemeLJIIIIZZ2)) != null) {
                            uid = userLIZLLL.getUid();
                        } else {
                            uid = null;
                        }
                        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBo2 = bo();
                        if (iFeedPanelPlatformAbilityBo2 != null && (awemeLJIIIIZZ = iFeedPanelPlatformAbilityBo2.LJIIIIZZ()) != null) {
                            aid = awemeLJIIIIZZ.getAid();
                        }
                        C1351420lGu.LIZIZ(uid, aid);
                        return;
                    }
                }
            }
            C0DK7.LIZ().LJ();
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCommentSend(C1209980ham c1209980ham) {
        Object[] objArr;
        String aid;
        Comment comment;
        List<TextExtraStruct> textExtra;
        Comment comment2;
        String uid;
        Aweme awemeLJIIIIZZ;
        Aweme awemeLJIIIIZZ2;
        User userLIZLLL;
        Aweme awemeLJIIIIZZ3;
        if (c1209980ham.LIZ != 3) {
            return;
        }
        Object obj = c1209980ham.LIZIZ;
        String aid2 = null;
        if ((obj instanceof Object[]) && (objArr = (Object[]) obj) != null && objArr.length == 2) {
            Object obj2 = objArr[0];
            IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBo = bo();
            if (iFeedPanelPlatformAbilityBo != null && (awemeLJIIIIZZ3 = iFeedPanelPlatformAbilityBo.LJIIIIZZ()) != null) {
                aid = awemeLJIIIIZZ3.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(obj2, aid)) {
                Object obj3 = objArr[1];
                if ((obj3 instanceof Comment) && (comment = (Comment) obj3) != null && (textExtra = comment.getTextExtra()) != null && !textExtra.isEmpty()) {
                    if (((Boolean) C275950Arh.LIZ.getValue()).booleanValue()) {
                        Object obj4 = objArr[1];
                        if (obj4 instanceof Comment) {
                            comment2 = (Comment) obj4;
                        } else {
                            comment2 = null;
                        }
                        if (Intrinsics.LJFF(C1339840kyE.LIZ(comment2), "1")) {
                            IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBo2 = bo();
                            if (iFeedPanelPlatformAbilityBo2 != null && (awemeLJIIIIZZ2 = iFeedPanelPlatformAbilityBo2.LJIIIIZZ()) != null && (userLIZLLL = C1351410lGt.LIZLLL(awemeLJIIIIZZ2)) != null) {
                                uid = userLIZLLL.getUid();
                            } else {
                                uid = null;
                            }
                            IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBo3 = bo();
                            if (iFeedPanelPlatformAbilityBo3 != null && (awemeLJIIIIZZ = iFeedPanelPlatformAbilityBo3.LJIIIIZZ()) != null) {
                                aid2 = awemeLJIIIIZZ.getAid();
                            }
                            C1351420lGu.LIZIZ(uid, aid2);
                        }
                    }
                    m170do();
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
