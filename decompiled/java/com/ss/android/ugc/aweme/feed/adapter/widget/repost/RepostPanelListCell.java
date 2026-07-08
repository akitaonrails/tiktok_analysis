package com.ss.android.ugc.aweme.feed.adapter.widget.repost;

import X.AbstractC2211791BhR;
import X.C01GW;
import X.C03H5;
import X.C0ZP4;
import X.C10EU;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1387050mCN;
import X.C1770850wBP;
import X.C1842120y2M;
import X.C19474211Gy;
import X.C197039127h;
import X.C20639815pc;
import X.C20684815ws;
import X.C20736316Cj;
import X.C2211751BhN;
import X.C426750GoL;
import X.C427660Gpo;
import X.C438710HIf;
import X.C444910HcX;
import X.C444920HcY;
import X.C452501pT;
import X.C456801qA;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C946803n0;
import X.EnumC1387060mCO;
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
import Y.ACListenerS161S0100000_27;
import Y.ARunnableS96S0200000_27;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveRepostNewPanelSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import irm.AkS50S0200000_2;
import irm.AkS79S0100000_7;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import webcast.api.room.WebcastRoomRepostRepostersResponse;

/* JADX INFO: loaded from: classes28.dex */
public final class RepostPanelListCell extends PowerCell<C1842120y2M> implements InterfaceC724530SbT {
    public final C01GW LL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 247));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 254));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 255));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 253));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 250));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 252));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 248));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 251));

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

    public final RelationButton P5() {
        return (RelationButton) this.LLILZIL.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        C2211751BhN.LIZ(this.itemView, new AbstractC2211791BhR(this) { // from class: X.0y2N
            public final AFwS216S0000000_27 LJ = AFwS216S0000000_27.get$arr$(113);
            public Function0<String> LJFF;
            public final C1864800ycw LJI;

            @Override // X.AbstractC2211791BhR
            public final /* bridge */ /* synthetic */ Map LJII() {
                return null;
            }

            @Override // X.AbstractC2211791BhR
            public final Function0<String> LIZIZ() {
                return this.LJ;
            }

            @Override // X.AbstractC2211791BhR
            public final Function0<String> LIZLLL() {
                return this.LJFF;
            }

            @Override // X.AbstractC2211791BhR
            public final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF() {
                return this.LJI;
            }

            {
                this.LJFF = new AwS571S0100000_27(this, 249);
                this.LJI = new C1864800ycw(this, 1);
            }

            @Override // X.AbstractC2211791BhR
            public final void LJIILL(Function0<String> function0) {
                this.LJFF = function0;
            }
        });
    }

    public final String N5() {
        WebcastRoomRepostRepostersResponse.Reposter reposter;
        User user;
        FollowInfo followInfo;
        WebcastRoomRepostRepostersResponse.Reposter reposter2;
        User user2;
        C1842120y2M item = getItem();
        String strValueOf = String.valueOf((item == null || (reposter2 = item.LLILLJJLI) == null || (user2 = reposter2.user) == null) ? null : Long.valueOf(user2.getId()));
        C1842120y2M item2 = getItem();
        long followStatus = (item2 == null || (reposter = item2.LLILLJJLI) == null || (user = reposter.user) == null || (followInfo = user.getFollowInfo()) == null) ? 0L : followInfo.getFollowStatus();
        return C10EU.LJIIZILJ(strValueOf) ? "reposted" : followStatus == 2 ? "message" : followStatus == 1 ? "following" : followStatus == 3 ? "follow_back" : "follow";
    }

    public final void R5(String str) {
        Map<String, String> map;
        C1842120y2M item = getItem();
        if (item != null && (map = item.LLILZ) != null) {
            map.put("repost_click_status", N5());
            map.put("click_area", str);
        } else {
            map = null;
        }
        C20684815ws.LJIILLIIL("livesdk_repost_user_head_click", map);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        User user;
        C1842120y2M c1842120y2M = (C1842120y2M) interfaceC1891350zJl;
        WebcastRoomRepostRepostersResponse.Reposter reposter = c1842120y2M.LLILLJJLI;
        if (reposter != null) {
            user = reposter.user;
        } else {
            user = null;
        }
        com.ss.android.ugc.aweme.profile.model.User userLIZJ = C20639815pc.LIZJ(user);
        C786410Ut5.I7(new AkS50S0200000_2(this, userLIZJ, 2), this.itemView);
        if (userLIZJ != null) {
            C427660Gpo.LJIIJJI((C427660Gpo) this.LL.getValue(), C438710HIf.LIZ(userLIZJ.getAvatarThumb()), false, null, null, false, false, null, null, false, null, 1022);
        }
        C786410Ut5.I7(new AkS79S0100000_7(this, 6), (View) this.LL.getValue());
        if (userLIZJ != null) {
            ((TextView) this.LLILLJJLI.getValue()).setText(userLIZJ.getNickname());
        }
        C786410Ut5.I7(new AkS79S0100000_7(this, 7), (View) this.LLILLJJLI.getValue());
        if (userLIZJ != null) {
            C786410Ut5.LLLLLLJ((C197039127h) this.LLILZLL.getValue(), 8);
            C786410Ut5.t0(P5(), 8);
            if (LiveRepostNewPanelSetting.INSTANCE.getValue()) {
                C426750GoL.LJIIIZ(P5(), 12, null, null, null, false, 30);
            }
            if (userLIZJ.getUid() != null && C10EU.LJIIZILJ(userLIZJ.getUid())) {
                C786410Ut5.LLLLLLJ((C197039127h) this.LLILZLL.getValue(), 0);
                C786410Ut5.I7(new AkS79S0100000_7(this, 8), (View) this.LLILZLL.getValue());
                C786410Ut5.O7((FrameLayout) this.LLILZ.getValue(), new ACListenerS161S0100000_27(this, 130));
            } else {
                C786410Ut5.t0(P5(), 0);
                RelationButton relationButtonP5 = P5();
                if (relationButtonP5 != null) {
                    Fragment fragmentLIZ = C946803n0.LIZ(relationButtonP5);
                    C1387050mCN c1387050mCN = new C1387050mCN(userLIZJ);
                    c1387050mCN.LJIIJ = true;
                    c1387050mCN.LJ = EnumC1387060mCO.MESSAGE_AFTER_NUDGE;
                    c1387050mCN.LJIIJJI = fragmentLIZ;
                    relationButtonP5.LLLLZIL(c1387050mCN.LIZ());
                }
                C786410Ut5.O7((FrameLayout) this.LLILZ.getValue(), new ACListenerS161S0100000_27(this, 129));
                P5().setDataChangeListener(new AwS606S0100000_27(this, 371));
                P5().setFollowClickInterceptor(new C456801qA(this, null));
            }
        }
        if (LiveRepostNewPanelSetting.INSTANCE.getValue()) {
            HandlerHook.viewPost((View) this.LLILLL.getValue(), new ARunnableS96S0200000_27(c1842120y2M.LLILLJJLI, this, 18));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        int i;
        if (LiveRepostNewPanelSetting.INSTANCE.getValue()) {
            i = R.layout.dh8;
        } else {
            i = R.layout.dh7;
        }
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), i, viewGroup, false);
    }

    public static StaticLayout L5(TuxTextView tuxTextView, CharSequence charSequence) {
        String str = (String) charSequence;
        return StaticLayout.Builder.obtain(str, 0, str.length(), tuxTextView.getPaint(), (tuxTextView.getWidth() - tuxTextView.getPaddingLeft()) - tuxTextView.getPaddingRight()).setAlignment(Layout.Alignment.ALIGN_NORMAL).setMaxLines(2).setEllipsize(null).build();
    }

    public static C444910HcX I5(TuxTextView tuxTextView, String str, String str2) {
        int iLIZIZ = C20736316Cj.LIZIZ(R.attr.a1h, tuxTextView.getContext());
        int iLIZIZ2 = C20736316Cj.LIZIZ(R.attr.a1k, tuxTextView.getContext());
        C444910HcX c444910HcX = new C444910HcX(str);
        C786410Ut5.s2(c444910HcX, new ForegroundColorSpan(iLIZIZ), 0, str2.length(), 33);
        C786410Ut5.s2(c444910HcX, new C444920HcY(41, true), 0, str2.length(), 33);
        C786410Ut5.s2(c444910HcX, new ForegroundColorSpan(iLIZIZ2), str2.length() + 1, str.length(), 33);
        C786410Ut5.s2(c444910HcX, new C444920HcY(71, true), str2.length() + 1, str.length(), 33);
        return c444910HcX;
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
