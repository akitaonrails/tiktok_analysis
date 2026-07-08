package com.ss.android.ugc.aweme.story.userpanel.ui.mention;

import X.C01GW;
import X.C03H5;
import X.C0HZQ;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C1308910kAL;
import X.C1388190mED;
import X.C13LE;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C20094213jo;
import X.C20673215v0;
import X.C2217381BqS;
import X.C317160Cby;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.app.Activity;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.userpanel.vm.StoryUserListContainerViewModel;
import com.ss.android.ugc.aweme.story.userpanel.vm.StoryUserListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS645S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: loaded from: classes32.dex */
public final class MentionAfterPublishListCell extends PowerCell<C317160Cby> implements InterfaceC724530SbT {
    public final C01GW LL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1074));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1076));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1077));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1075));
    public final C736950SvV LLILZIL;
    public final C736950SvV LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public boolean LLJ;

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

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        ((View) this.LL.getValue()).setClickable(false);
        L5().setClickable(false);
        ((AvatarComponentView) this.LL.getValue()).getAvatar().setForeground(new StateListDrawable());
        L5().setForeground(new StateListDrawable());
        q0.LJIJ(L5(), new C20094213jo() { // from class: X.15mR
            @Override // X.C20094213jo
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                accessibilityNodeInfoCompat.setClassName(Button.class.getName());
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            }
        });
        C736680Sv4.LJIIIIZZ(this, N5(), new C2217381BqS() { // from class: X.15lZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20614415lW) obj).LLILZIL;
            }
        }, null, new AwS645S0100000_31(this, 60), 6);
    }

    public final void I5() {
        this.itemView.setClickable(false);
        C786410Ut5.T4(this.itemView, 0.34f);
    }

    public final C0HZQ L5() {
        return (C0HZQ) this.LLILZ.getValue();
    }

    public final StoryUserListContainerViewModel N5() {
        return (StoryUserListContainerViewModel) this.LLILZLL.getValue();
    }

    public final StoryUserListViewModel P5() {
        return (StoryUserListViewModel) this.LLILZIL.getValue();
    }

    public MentionAfterPublishListCell() {
        AFwS221S0000000_31 aFwS221S0000000_31 = AFwS221S0000000_31.get$arr$(269);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoryUserListViewModel.class);
        AFwS276S0000000_31 aFwS276S0000000_31 = AFwS276S0000000_31.get$arr$(209);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLILZIL = new C736950SvV(c19719912DlLIZ, aFwS221S0000000_31, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS276S0000000_31, null, null, null);
        AFwS221S0000000_31 aFwS221S0000000_312 = AFwS221S0000000_31.get$arr$(267);
        this.LLILZLL = new C736950SvV(C13LE.LIZ(StoryUserListContainerViewModel.class), aFwS221S0000000_312, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS276S0000000_31.get$arr$(210), null, null, null);
        this.LLIZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(268));
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(270));
    }

    public final void R5(C317160Cby c317160Cby) {
        boolean z;
        boolean zContains = P5().LLIZLLLIL.contains(c317160Cby.LL.getUid());
        boolean z2 = c317160Cby.LLILZ;
        StoryUserListContainerViewModel storyUserListContainerViewModelN5 = N5();
        if (storyUserListContainerViewModelN5.getState().LLILLL.LIZ.LIZ.size() + P5().LLIZLLLIL.size() >= 30) {
            z = true;
        } else {
            z = false;
        }
        if (zContains) {
            I5();
            return;
        }
        if (z && !this.LLJ) {
            I5();
        } else if (z2) {
            I5();
        } else {
            this.itemView.setClickable(true);
            C786410Ut5.T4(this.itemView, 1.0f);
        }
    }

    public final void S5(C317160Cby c317160Cby) {
        int i;
        boolean z = true;
        if (P5().LLIZLLLIL.contains(c317160Cby.LL.getUid())) {
            this.LLJ = true;
            L5().setChecked(true);
            I5();
            if (C960203pA.LIZIZ(this.itemView.getContext())) {
                i = R.attr.zk;
            } else {
                i = R.attr.zh;
            }
            Integer numLIZJ = C1308910kAL.LIZJ(i, L5().getContext());
            if (numLIZJ != null) {
                L5().setCheckBoxCheckedColor(numLIZJ.intValue());
                return;
            }
            return;
        }
        User user = c317160Cby.LL;
        Iterator<User> it2 = N5().getState().LLILLL.LIZ.LIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            User next = it2.next();
            if (Intrinsics.LJFF(user.getUid(), next.getUid())) {
                if (next == null) {
                    break;
                }
            }
        }
        z = false;
        this.LLJ = z;
        L5().setChecked(this.LLJ);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a04, L5().getContext());
        if (numLIZJ2 == null) {
            return;
        }
        L5().setCheckBoxCheckedColor(numLIZJ2.intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0101  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r11) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.userpanel.ui.mention.MentionAfterPublishListCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewLIZJ;
        Activity activityLIZ = C1388190mED.LIZ(viewGroup.getContext());
        if (activityLIZ == null || (viewLIZJ = C20673215v0.LIZJ(R.layout.fdf, activityLIZ)) == null) {
            return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fdf, viewGroup, false);
        }
        return viewLIZJ;
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
