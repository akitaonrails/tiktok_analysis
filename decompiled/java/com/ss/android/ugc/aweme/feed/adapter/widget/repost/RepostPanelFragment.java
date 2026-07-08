package com.ss.android.ugc.aweme.feed.adapter.widget.repost;

import X.AbstractC21673619ry;
import X.AbstractC329610Cw3;
import X.AbstractC471570IeR;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0OM1;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C21578619ce;
import X.C2187701Ajg;
import X.C339190DRl;
import X.C423520Gj8;
import X.C452501pT;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1809520xBm;
import X.InterfaceC2217241BqE;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewTreeObserverOnGlobalLayoutListenerC1864770yct;
import Y.ACListenerS161S0100000_27;
import Y.AObserverS229S0100000_27;
import Y.ARunnableS127S0100000_27;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveRepostNewPanelSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.feed.adapter.widget.repost.LiveRepostVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.repost.RepostPanelFragment;
import com.zhiliaoapp.musically.R;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.room.WebcastRoomRepostRepostersResponse;

/* JADX INFO: loaded from: classes28.dex */
public final class RepostPanelFragment extends BaseFragment implements InterfaceC724530SbT {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiMpLCt9KSEtOTs2HELIOSOms7ICs0LTFiOyojJzY4Zx02OCo/PR8yJiAgDz0yLygpJzs=";
    public LiveRepostVM LLIZ;
    public LinearLayout LLIZLLLIL;
    public TuxNavBar LLJ;
    public View LLJI;
    public C21578619ce LLJIJIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJILJIL;
    public View LLJILJILJ;
    public C197039127h LLJILLL;
    public View LLJJ;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 246));

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

    public final Map<String, String> SR() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("panel_source", "repost_panel");
        if (!UR()) {
            linkedHashMap.put("button_status", "repost");
        }
        LiveRepostVM liveRepostVM = this.LLIZ;
        if (liveRepostVM != null) {
            linkedHashMap.putAll(liveRepostVM.wQ2());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void VR() {
        /*
            r4 = this;
            android.view.View r3 = r4.LLJILJILJ
            if (r3 == 0) goto L2b
            boolean r0 = r4.UR()
            if (r0 != 0) goto L2c
            boolean r0 = X.C1096600edu.LIZ()
            r2 = 0
            if (r0 == 0) goto L2c
            boolean r0 = X.C1096600edu.LIZIZ()
            if (r0 == 0) goto L2c
            android.view.View r0 = r4.LLJILJILJ
            boolean r0 = X.C500260Jjc.LJJJJIZL(r0)
            if (r0 != 0) goto L28
            java.util.Map r1 = r4.SR()
            java.lang.String r0 = "livesdk_repost_icon_show"
            X.C20684815ws.LJIILLIIL(r0, r1)
        L28:
            X.C786410Ut5.LJLLLLLL(r2, r3)
        L2b:
            return
        L2c:
            r2 = 8
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.widget.repost.RepostPanelFragment.VR():void");
    }

    public final boolean UR() {
        Boolean boolValueOf;
        MutableLiveData<List<WebcastRoomRepostRepostersResponse.Reposter>> mutableLiveDataXQ2;
        List<WebcastRoomRepostRepostersResponse.Reposter> value;
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        LiveRepostVM liveRepostVM = this.LLIZ;
        if (liveRepostVM == null || (mutableLiveDataXQ2 = liveRepostVM.xQ2()) == null || (value = mutableLiveDataXQ2.getValue()) == null) {
            boolValueOf = null;
        } else {
            boolean z = false;
            if (!value.isEmpty()) {
                Iterator<WebcastRoomRepostRepostersResponse.Reposter> it2 = value.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    User user = it2.next().user;
                    if (user != null && currentUserId == user.getId()) {
                        z = true;
                        break;
                    }
                }
            }
            boolValueOf = Boolean.valueOf(z);
        }
        return Intrinsics.LJFF(boolValueOf, Boolean.TRUE);
    }

    public final void WR(int i) {
        long j = i;
        if (j < 0) {
            j = 0;
        }
        String quantityString = getResources().getQuantityString(2131755957, i, new DecimalFormat(",###", new DecimalFormatSymbols(Locale.getDefault())).format(j));
        if (LiveRepostNewPanelSetting.INSTANCE.getValue()) {
            TuxNavBar tuxNavBar = this.LLJ;
            if (tuxNavBar != null) {
                C1250250idj c1250250idj = new C1250250idj();
                c1250250idj.LIZJ = quantityString;
                c1250250idj.LIZLLL = getResources().getString(2131855707);
                tuxNavBar.LJIJJ(c1250250idj);
                return;
            }
            return;
        }
        TuxNavBar tuxNavBar2 = this.LLJ;
        if (tuxNavBar2 == null) {
            return;
        }
        C1250250idj c1250250idj2 = new C1250250idj();
        c1250250idj2.LIZJ = quantityString;
        tuxNavBar2.LJIJJ(c1250250idj2);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int size;
        MutableLiveData<List<WebcastRoomRepostRepostersResponse.Reposter>> mutableLiveDataXQ2;
        ViewTreeObserver viewTreeObserver;
        AbstractC21673619ry adapter;
        MutableLiveData<List<WebcastRoomRepostRepostersResponse.Reposter>> mutableLiveDataXQ22;
        List<WebcastRoomRepostRepostersResponse.Reposter> value;
        super.onViewCreated(view, bundle);
        this.LLIZLLLIL = (LinearLayout) view.findViewById(R.id.y_b);
        this.LLJ = (TuxNavBar) view.findViewById(R.id.p15);
        this.LLJI = view.findViewById(R.id.yd3);
        this.LLJIJIL = (C21578619ce) view.findViewById(R.id.pgd);
        this.LLJILJIL = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.t_z);
        this.LLJILJILJ = view.findViewById(R.id.ccd);
        this.LLJILLL = (C197039127h) view.findViewById(R.id.cu_);
        this.LLJJ = view.findViewById(R.id.cgo);
        TuxNavBar tuxNavBar = this.LLJ;
        if (tuxNavBar != null) {
            tuxNavBar.LJIIZILJ(false);
        }
        TuxNavBar tuxNavBar2 = this.LLJ;
        if (tuxNavBar2 != null) {
            tuxNavBar2.setNavBackground(0);
        }
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS571S0100000_27(this, 1138));
        c0om1.LIZIZ(c1251150ifB);
        TuxNavBar tuxNavBar3 = this.LLJ;
        if (tuxNavBar3 != null) {
            tuxNavBar3.setNavActions(c0om1);
        }
        LiveRepostVM liveRepostVM = this.LLIZ;
        if (liveRepostVM != null && (mutableLiveDataXQ22 = liveRepostVM.xQ2()) != null && (value = mutableLiveDataXQ22.getValue()) != null) {
            size = value.size();
        } else {
            size = 0;
        }
        WR(size);
        C197039127h c197039127h = this.LLJILLL;
        if (c197039127h != null) {
            c197039127h.setButtonStartIcon(Integer.valueOf(R.raw.icon_repost_fill));
        }
        C197039127h c197039127h2 = this.LLJILLL;
        if (c197039127h2 != null) {
            C786410Ut5.U8(c197039127h2, new ACListenerS161S0100000_27(this, 128));
        }
        VR();
        C21578619ce c21578619ce = this.LLJIJIL;
        if (c21578619ce != null) {
            c21578619ce.setOnScrollChangeListener(new InterfaceC1809520xBm() { // from class: X.0y2H
                @Override // X.InterfaceC1809520xBm
                public final void LIZ(C21578619ce c21578619ce2, int i, int i2, int i3, int i4) {
                    if (i2 == 0) {
                        View view2 = this.LIZ.LLJI;
                        if (view2 != null) {
                            C339190DRl.LIZIZ(view2);
                        }
                    } else {
                        View view3 = this.LIZ.LLJI;
                        if (view3 != null) {
                            C339190DRl.LIZLLL(view3);
                        }
                    }
                    if (c21578619ce2.getChildAt(0).getBottom() <= c21578619ce2.getHeight() + i2) {
                        C339190DRl.LIZIZ(this.LIZ.LLJJ);
                    } else {
                        C339190DRl.LIZLLL(this.LIZ.LLJJ);
                    }
                }
            });
        }
        View view2 = this.LLJI;
        if (view2 != null) {
            C339190DRl.LIZIZ(view2);
        }
        C339190DRl.LIZLLL(this.LLJJ);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJILJIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(new C423520Gj8() { // from class: X.0GjB
                @Override // X.AbstractC21673719rz
                public final long LJIILIIL() {
                    return 50L;
                }

                @Override // X.AbstractC21673719rz
                public final long LJIILLIIL() {
                    return 0L;
                }

                @Override // X.C423520Gj8, X.AbstractC21674919sB
                public final boolean LJJIII(RecyclerView.ViewHolder viewHolder) {
                    ViewPropertyAnimator viewPropertyAnimatorAnimate;
                    super.LJJIII(viewHolder);
                    View view3 = viewHolder.itemView;
                    if (view3 != null && (viewPropertyAnimatorAnimate = view3.animate()) != null) {
                        viewPropertyAnimatorAnimate.setInterpolator(new LinearInterpolator());
                        return true;
                    }
                    return true;
                }
            });
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJILJIL;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null && (adapter = viewOnAttachStateChangeListenerC20604515jv2.getAdapter()) != null) {
            adapter.registerAdapterDataObserver(new AbstractC471570IeR() { // from class: X.0y2I
                @Override // X.AbstractC471570IeR
                public final void LIZLLL(int i, int i2) {
                    LiveRepostVM liveRepostVM2;
                    MutableLiveData<List<WebcastRoomRepostRepostersResponse.Reposter>> mutableLiveDataXQ23;
                    List<WebcastRoomRepostRepostersResponse.Reposter> value2;
                    C21578619ce c21578619ce2;
                    if (i == 0 && (liveRepostVM2 = this.LIZ.LLIZ) != null && (mutableLiveDataXQ23 = liveRepostVM2.xQ2()) != null && (value2 = mutableLiveDataXQ23.getValue()) != null && !value2.isEmpty()) {
                        WebcastRoomRepostRepostersResponse.Reposter reposter = (WebcastRoomRepostRepostersResponse.Reposter) ListProtector.get(value2, 0);
                        RepostPanelFragment repostPanelFragment = this.LIZ;
                        long currentUserId = UserService.getInstance().user().getCurrentUserId();
                        User user = reposter.user;
                        if (user != null && currentUserId == user.getId() && (c21578619ce2 = repostPanelFragment.LLJIJIL) != null) {
                            HandlerHook.viewPost(c21578619ce2, new ARunnableS127S0100000_27(repostPanelFragment, 44));
                        }
                    }
                }
            });
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJILJIL;
        if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
            viewOnAttachStateChangeListenerC20604515jv3.LJIILJJIL(RepostPanelListCell.class);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLJILJIL;
        if (viewOnAttachStateChangeListenerC20604515jv4 != null) {
            viewOnAttachStateChangeListenerC20604515jv4.LJIIL((AbstractC329610Cw3) this.LLJJI.getValue());
        }
        LinearLayout linearLayout = this.LLIZLLLIL;
        if (linearLayout != null && (viewTreeObserver = linearLayout.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC1864770yct viewTreeObserverOnGlobalLayoutListenerC1864770yct = new ViewTreeObserverOnGlobalLayoutListenerC1864770yct(this, 7);
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1864770yct);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1864770yct, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        LiveRepostVM liveRepostVM2 = this.LLIZ;
        if (liveRepostVM2 != null && (mutableLiveDataXQ2 = liveRepostVM2.xQ2()) != null) {
            mutableLiveDataXQ2.observe(this, new AObserverS229S0100000_27(this, 27));
        }
        C20684815ws.LJIILLIIL("livesdk_repost_user_panel_show", SR());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dh5, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
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
