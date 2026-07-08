package com.ss.android.ugc.aweme.story.userpanel.ui.dm;

import X.C01GW;
import X.C03H5;
import X.C0S1B;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C1388190mED;
import X.C13LE;
import X.C1408930mlf;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C1954807lC;
import X.C197039127h;
import X.C19719912Dl;
import X.C20615315lf;
import X.C20673215v0;
import X.C2217381BqS;
import X.C317160Cby;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.EnumC20615215le;
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
import Y.AObserverS190S0200000_31;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.story.userpanel.vm.DmViewModel;
import com.ss.android.ugc.aweme.story.userpanel.vm.StoryUserListContainerViewModel;
import com.ss.android.ugc.aweme.story.userpanel.vm.StoryUserListViewModel;
import com.zhiliaoapp.musically.R;
import irm.AkS97S0100000_31;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS240S0300000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS645S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class DmListCell extends PowerCell<C317160Cby> implements InterfaceC724530SbT {
    public final C01GW LL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1069));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1071));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1073));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1072));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1070));
    public final C736950SvV LLILZLL;
    public final C736950SvV LLIZ;
    public final C01GW LLIZLLLIL;

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
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLILZLL.getValue(), new C2217381BqS() { // from class: X.15lc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20614415lW) obj).LLILZLL;
            }
        }, null, new AwS645S0100000_31(this, 59), 6);
    }

    public final StoryUserListViewModel I5() {
        return (StoryUserListViewModel) this.LLIZ.getValue();
    }

    public final C197039127h L5() {
        return (C197039127h) this.LLILZ.getValue();
    }

    public DmListCell() {
        AFwS221S0000000_31 aFwS221S0000000_31 = AFwS221S0000000_31.get$arr$(263);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoryUserListContainerViewModel.class);
        AFwS276S0000000_31 aFwS276S0000000_31 = AFwS276S0000000_31.get$arr$(206);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLILZLL = new C736950SvV(c19719912DlLIZ, aFwS221S0000000_31, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS276S0000000_31, null, null, null);
        AFwS221S0000000_31 aFwS221S0000000_312 = AFwS221S0000000_31.get$arr$(265);
        this.LLIZ = new C736950SvV(C13LE.LIZ(StoryUserListViewModel.class), aFwS221S0000000_312, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS276S0000000_31.get$arr$(207), null, null, null);
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(264));
    }

    public final void N5(EnumC20615215le enumC20615215le) {
        String string;
        String string2;
        String string3;
        int i = C20615315lf.LIZ[enumC20615215le.ordinal()];
        String string4 = null;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (I5().LLJILJIL) {
                        C197039127h c197039127hL5 = L5();
                        Context context = this.itemView.getContext();
                        if (context != null) {
                            string3 = context.getString(2131836997);
                        } else {
                            string3 = null;
                        }
                        c197039127hL5.setText(string3);
                        L5().setButtonVariant(1);
                        L5().setEnabled(true);
                        L5().setButtonStartIcon(null);
                        C786410Ut5.I7(new AkS97S0100000_31(this, 7), L5());
                        return;
                    }
                    C197039127h c197039127hL52 = L5();
                    Context context2 = this.itemView.getContext();
                    if (context2 != null) {
                        string2 = context2.getString(2131831626);
                    } else {
                        string2 = null;
                    }
                    c197039127hL52.setText(string2);
                    L5().setButtonVariant(0);
                    L5().setEnabled(false);
                    L5().setButtonStartIcon(null);
                    C786410Ut5.I7(null, L5());
                    return;
                }
                throw new C1954807lC();
            }
            C197039127h c197039127hL53 = L5();
            Context context3 = this.itemView.getContext();
            if (context3 != null) {
                string4 = context3.getString(2131857730);
            }
            c197039127hL53.setText(string4);
            L5().setButtonVariant(1);
            L5().setEnabled(true);
            L5().setButtonStartIcon(Integer.valueOf(R.raw.icon_arrow_counter_clockwise_fill));
            C786410Ut5.I7(new AkS97S0100000_31(this, 6), L5());
            return;
        }
        C197039127h c197039127hL54 = L5();
        Context context4 = this.itemView.getContext();
        if (context4 != null) {
            string = context4.getString(2131848218);
        } else {
            string = null;
        }
        c197039127hL54.setText(string);
        L5().setButtonVariant(0);
        L5().setEnabled(true);
        L5().setButtonStartIcon(null);
        C786410Ut5.I7(new AkS97S0100000_31(this, 5), L5());
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        EnumC20615215le enumC20615215le;
        String uniqueId;
        MutableLiveData<Map<String, EnumC20615215le>> mutableLiveData;
        Map<String, EnumC20615215le> value;
        C317160Cby c317160Cby = (C317160Cby) interfaceC1891350zJl;
        User user = c317160Cby.LL;
        DmViewModel dmViewModel = (DmViewModel) this.LLILZIL.getValue();
        if (dmViewModel == null || (mutableLiveData = dmViewModel.LL) == null || (value = mutableLiveData.getValue()) == null || (enumC20615215le = value.get(user.getUid())) == null) {
            enumC20615215le = EnumC20615215le.NOT_SENT;
        }
        N5(enumC20615215le);
        StoryUserListContainerViewModel storyUserListContainerViewModel = (StoryUserListContainerViewModel) this.LLILZLL.getValue();
        storyUserListContainerViewModel.withState(new AwS240S0300000_31(user, enumC20615215le, storyUserListContainerViewModel, 47));
        DmViewModel dmViewModel2 = (DmViewModel) this.LLILZIL.getValue();
        if (dmViewModel2 != null) {
            dmViewModel2.LL.observe(this, new AObserverS190S0200000_31(c317160Cby, this, 0));
        }
        C0S1B.LIZ((AvatarComponentView) this.LL.getValue(), user.getUid(), user, this, false, null, 56);
        String nickname = user.getNickname();
        if (nickname.length() == 0) {
            nickname = user.getUniqueId();
        }
        if (user.getNickname().length() == 0) {
            uniqueId = "";
        } else {
            uniqueId = user.getUniqueId();
        }
        ((TextView) this.LLILLJJLI.getValue()).setText(nickname);
        ((TextView) this.LLILLL.getValue()).setText(uniqueId);
        if (c317160Cby.LLILLJJLI.length() > 0) {
            IIMService iIMService = (IIMService) this.LLIZLLLIL.getValue();
            if (iIMService != null) {
                iIMService.setHighlightText((TextView) this.LLILLJJLI.getValue(), nickname, c317160Cby.LLILLJJLI);
            }
            IIMService iIMService2 = (IIMService) this.LLIZLLLIL.getValue();
            if (iIMService2 != null) {
                iIMService2.setHighlightText((TextView) this.LLILLL.getValue(), uniqueId, c317160Cby.LLILLJJLI);
            }
        }
        String str = I5().LLILZLL;
        if (Intrinsics.LJFF(str, "dm_primary")) {
            C1408930mlf c1408930mlf = C1408930mlf.LIZ;
            VideoPublishEditModel videoPublishEditModel = I5().LLJ;
            String str2 = I5().LLJI;
            c1408930mlf.getClass();
            C1408930mlf.LIZIZ(videoPublishEditModel, str2, "story_edit_page_message_panel_head_show");
            return;
        }
        if (!Intrinsics.LJFF(str, "dm_followup")) {
            return;
        }
        C1408930mlf c1408930mlf2 = C1408930mlf.LIZ;
        VideoPublishEditModel videoPublishEditModel2 = I5().LLJ;
        c1408930mlf2.getClass();
        C1408930mlf.LIZIZ(videoPublishEditModel2, null, "story_edit_page_also_share_to_panel_head_show");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewLIZJ;
        Activity activityLIZ = C1388190mED.LIZ(viewGroup.getContext());
        if (activityLIZ == null || (viewLIZJ = C20673215v0.LIZJ(R.layout.fde, activityLIZ)) == null) {
            return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fde, viewGroup, false);
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
