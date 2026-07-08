package com.ss.android.ugc.aweme.ui.cell.publish;

import X.AbstractC2211791BhR;
import X.C01GW;
import X.C03H5;
import X.C0HZQ;
import X.C0S1B;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C1388190mED;
import X.C13LE;
import X.C1770850wBP;
import X.C1908030zkf;
import X.C19474211Gy;
import X.C20673215v0;
import X.C2211751BhN;
import X.C2217381BqS;
import X.C317150Cbx;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.service.ISearchUserService;
import com.ss.android.ugc.aweme.vm.publish.CollabEditPageContainerViewModel;
import com.zhiliaoapp.musically.R;
import irm.AkS61S0200000_24;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class CollabInviteEditCell extends PowerCell<C317150Cbx> implements InterfaceC724530SbT {
    public final C01GW LL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1465));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1468));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1467));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1466));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1470));
    public final C736950SvV LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public int LLJ;
    public boolean LLJI;

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
        AvatarComponentView avatarComponentView = (AvatarComponentView) this.LL.getValue();
        avatarComponentView.setClickable(false);
        new AwS603S0100000_24(this, 379).invoke(avatarComponentView.getConfig().LIZ);
        avatarComponentView.LJFF(avatarComponentView.getConfig());
        ((View) this.LLILZ.getValue()).setClickable(false);
        C2211751BhN.LIZ(this.itemView, new AbstractC2211791BhR(this) { // from class: X.0r7y
            public Function0<String> LJ;
            public final boolean LJFF = true;
            public final C1620890sHX LJI;

            @Override // X.AbstractC2211791BhR
            public final Function0<String> LIZLLL() {
                return this.LJ;
            }

            @Override // X.AbstractC2211791BhR
            public final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF() {
                return this.LJI;
            }

            @Override // X.AbstractC2211791BhR
            public final boolean LJIIIZ() {
                return this.LJFF;
            }

            {
                this.LJ = new AwS568S0100000_24(this, 1469);
                this.LJI = new C1620890sHX(this, 4);
            }

            @Override // X.AbstractC2211791BhR
            public final void LJIILL(Function0<String> function0) {
                this.LJ = function0;
            }
        });
        C736680Sv4.LJIIIIZZ(this, I5(), new C2217381BqS() { // from class: X.0r1g
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1572540r1Y) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 118), 4);
    }

    public final CollabEditPageContainerViewModel I5() {
        return (CollabEditPageContainerViewModel) this.LLILZLL.getValue();
    }

    public CollabInviteEditCell() {
        AFwS213S0000000_24 aFwS213S0000000_24 = AFwS213S0000000_24.get$arr$(387);
        this.LLILZLL = new C736950SvV(C13LE.LIZ(CollabEditPageContainerViewModel.class), aFwS213S0000000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(499), null, null, null);
        this.LLIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(385));
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(386));
    }

    public final void L5(User user) {
        int i;
        float f;
        int size = ((ArrayList) I5().LLILLJJLI).size();
        SettingsManager.LIZLLL().getClass();
        if (size >= SettingsManager.LJ("collab_invite_max", 5)) {
            i = 1;
        } else {
            i = 0;
        }
        View view = this.itemView;
        if (i != 0 && !I5().vQ2(user)) {
            f = 0.34f;
        } else {
            f = 1.0f;
        }
        C786410Ut5.T4(view, f);
        this.LLJ = i;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C317150Cbx c317150Cbx = (C317150Cbx) interfaceC1891350zJl;
        L5(c317150Cbx.LL);
        this.LLJI = I5().vQ2(c317150Cbx.LL);
        ((C0HZQ) this.LLILZ.getValue()).setChecked(this.LLJI);
        C0S1B.LIZ((AvatarComponentView) this.LL.getValue(), c317150Cbx.LL.getUid(), c317150Cbx.LL, this, false, null, 56);
        TextView textView = (TextView) this.LLILLJJLI.getValue();
        String nickname = c317150Cbx.LL.getNickname();
        int i = 0;
        if (nickname.length() == 0) {
            nickname = c317150Cbx.LL.getUniqueId();
        }
        textView.setText(nickname);
        ((TextView) this.LLILLL.getValue()).setText(c317150Cbx.LL.getUniqueId());
        C1908030zkf.LJI(this.itemView.getContext(), c317150Cbx.LL.getCustomVerify(), c317150Cbx.LL.getEnterpriseVerifyReason(), (TextView) this.LLILLJJLI.getValue());
        if (c317150Cbx.LLILLJJLI.length() > 0) {
            IIMService iIMService = (IIMService) this.LLIZ.getValue();
            if (iIMService != null) {
                TextView textView2 = (TextView) this.LLILLJJLI.getValue();
                String nickname2 = c317150Cbx.LL.getNickname();
                if (nickname2.length() == 0) {
                    nickname2 = c317150Cbx.LL.getUniqueId();
                }
                iIMService.setHighlightText(textView2, nickname2, c317150Cbx.LLILLJJLI);
            }
            IIMService iIMService2 = (IIMService) this.LLIZ.getValue();
            if (iIMService2 != null) {
                iIMService2.setHighlightText((TextView) this.LLILLL.getValue(), c317150Cbx.LL.getUniqueId(), c317150Cbx.LLILLJJLI);
            }
        }
        if (((ISearchUserService) this.LLIZLLLIL.getValue()).LIZLLL()) {
            TuxIconView tuxIconView = (TuxIconView) this.LLILZIL.getValue();
            if (c317150Cbx.LL.getFollowStatus() != 2) {
                i = 8;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView, i);
        }
        C786410Ut5.I7(new AkS61S0200000_24(this, c317150Cbx, 2), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewLIZJ;
        Activity activityLIZ = C1388190mED.LIZ(viewGroup.getContext());
        if (activityLIZ == null || (viewLIZJ = C20673215v0.LIZJ(R.layout.agg, activityLIZ)) == null) {
            return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.agg, viewGroup, false);
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
