package com.ss.android.ugc.aweme.explore.assem;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C03K6;
import X.C0BK2;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C1308910kAL;
import X.C13EL;
import X.C13LE;
import X.C15S1;
import X.C15SN;
import X.C15TA;
import X.C15V2;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C1A5L;
import X.C20521215Rq;
import X.C20522415Sc;
import X.C20526015Tm;
import X.C20605115k1;
import X.C20606915kJ;
import X.C20607915kT;
import X.C21681819tI;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C2493709pv;
import X.C418440Gaw;
import X.C452070Ho5;
import X.C452080Ho6;
import X.C452501pT;
import X.C627260Oiy;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC452301pR;
import X.InterfaceC0148002o;
import X.InterfaceC1585190rLx;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.explore.vm.ExploreFeedStateSharedVM;
import com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS645S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreTopicFeedFooterCell extends PowerLoadingCell implements InterfaceC724530SbT, C15S1 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final AssemVMLazy LL;
    public final C736950SvV LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public volatile boolean LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ExploreTopicFeedFooterCell.class, "exploreFeedListViewModel", "getExploreFeedListViewModel()Lcom/ss/android/ugc/aweme/explore/vm/ExploreTopicGeneralFeedListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C736680Sv4.LJIIIIZZ(this, this.LLILLJJLI.getValue(), new C2217381BqS() { // from class: X.15SF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C15SI) obj).LLILLJJLI;
            }
        }, null, new AwS645S0100000_31(this, 34), 6);
        HomeTabAbility homeTabAbility = (HomeTabAbility) this.LLILZIL.getValue();
        if (homeTabAbility != null) {
            homeTabAbility.Ss2(new InterfaceC1585190rLx() { // from class: X.15SE
                @Override // X.InterfaceC1585190rLx
                public final void p1(String str, String str2) {
                    if (!Intrinsics.LJFF(str2, "homepage_explore")) {
                        return;
                    }
                    this.LL.U5();
                }
            });
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        C20606915kJ c20606915kJ;
        super.onViewAttachedToWindow();
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (layoutParams instanceof C21681819tI) {
            ((C21681819tI) layoutParams).LLILLJJLI = true;
        }
        C736680Sv4.LJIIIIZZ(this, S5(), new C2217381BqS() { // from class: X.15S9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C15SN c15sn = (C15SN) obj;
                c15sn.getClass();
                return C627260Oiy.LIZJ(c15sn);
            }
        }, null, new AwS645S0100000_31(this, 35), 6);
        C736680Sv4.LJIIIIZZ(this, S5(), new C2217381BqS() { // from class: X.15S8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C15SN) obj).LLIZ);
            }
        }, null, new AwS645S0100000_31(this, 36), 6);
        C20605115k1 item = getItem();
        if (!(((item == null || (c20606915kJ = item.LLILLL) == null) ? null : c20606915kJ.LIZIZ) instanceof C20607915kT)) {
            this.LLIZ = false;
            return;
        }
        this.LLIZ = true;
        if (this.LLIZLLLIL) {
            return;
        }
        this.LLIZLLLIL = true;
        C15TA c15ta = C15TA.LIZ;
        C15V2 c15v2T5 = T5();
        String str = c15v2T5 != null ? c15v2T5.LIZ : null;
        C15V2 c15v2T52 = T5();
        Long l = c15v2T52 != null ? c15v2T52.LIZIZ : null;
        C20521215Rq c20521215Rq = (C20521215Rq) this.LLILZ.getValue();
        String str2 = c20521215Rq != null ? c20521215Rq.LIZIZ : null;
        C20521215Rq c20521215Rq2 = (C20521215Rq) this.LLILZ.getValue();
        String str3 = c20521215Rq2 != null ? c20521215Rq2.LIZ : null;
        c15ta.getClass();
        C15TA.LJFF(l, str, str2, str3);
        V5();
    }

    public ExploreTopicFeedFooterCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ExploreTopicGeneralFeedListViewModel.class);
        AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(c19719912DlLIZ, 601);
        AFwS276S0000000_31 aFwS276S0000000_31 = AFwS276S0000000_31.get$arr$(86);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 585), awS575S0100000_31, AFwS221S0000000_31.get$arr$(168), new AwS575S0100000_31((C03K6) this, 587), new AwS575S0100000_31((C03K6) this, 589), new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 591), aFwS276S0000000_31, new AwS575S0100000_31((C03K6) this, 593), null, new AwS575S0100000_31((C03K6) this, 594));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS575S0100000_31 awS575S0100000_312 = new AwS575S0100000_31((C03K6) this, 588);
            AwS575S0100000_31 awS575S0100000_313 = new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 590);
            AwS575S0100000_31 awS575S0100000_314 = new AwS575S0100000_31(c19719912DlLIZ, 592);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS432S0200000_31((InterfaceC451590HnJ) obj, awS575S0100000_312, 47));
            AwS575S0100000_31 awS575S0100000_315 = new AwS575S0100000_31(c01gwLIZIZ, 595);
            AwS575S0100000_31 awS575S0100000_316 = new AwS575S0100000_31(c01gwLIZIZ, 596);
            AwS575S0100000_31 awS575S0100000_317 = new AwS575S0100000_31(c01gwLIZIZ, 597);
            AwS575S0100000_31 awS575S0100000_318 = new AwS575S0100000_31(c01gwLIZIZ, 598);
            AwS575S0100000_31 awS575S0100000_319 = new AwS575S0100000_31(c01gwLIZIZ, 599);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS575S0100000_314, awS575S0100000_31, new C452080Ho6(), awS575S0100000_315, awS575S0100000_316, awS575S0100000_313, aFwS276S0000000_31, awS575S0100000_317, awS575S0100000_318, awS575S0100000_319);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 600), awS575S0100000_31, AFwS221S0000000_31.get$arr$(169), new AwS575S0100000_31((C03K6) this, 602), new AwS575S0100000_31((C03K6) this, 603), new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 604), aFwS276S0000000_31, new AwS575S0100000_31((C03K6) this, 576), null, new AwS575S0100000_31((C03K6) this, 577));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 579), awS575S0100000_31, AFwS221S0000000_31.get$arr$(167), new AwS575S0100000_31((C03K6) this, 581), new AwS575S0100000_31((C03K6) this, 582), new AwS575S0100000_31((C03K6) this, 583), aFwS276S0000000_31, null, null, new AwS575S0100000_31((C03K6) this, 584));
        }
        this.LL = assemVMLazy;
        AFwS221S0000000_31 aFwS221S0000000_31 = AFwS221S0000000_31.get$arr$(166);
        this.LLILLJJLI = new C736950SvV(C13LE.LIZ(ExploreFeedStateSharedVM.class), aFwS221S0000000_31, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS276S0000000_31.get$arr$(87), null, null, null);
        this.LLILLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 586));
        this.LLILZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 580));
        this.LLILZIL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS575S0100000_31(this, 578));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0043  */
    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L5() {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.explore.assem.ExploreTopicFeedFooterCell.L5():void");
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void LIZJ() {
        View view = this.itemView;
        C786410Ut5.LLLLZLL((TuxTextView) view.findViewById(R.id.zmm), 0);
        this.LLILZLL = false;
        C786410Ut5.LLZILL((TuxSpinner) view.findViewById(R.id.vuk), 8);
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void N5() {
        View view = this.itemView;
        this.LLILZLL = true;
        C786410Ut5.LLZILL((TuxSpinner) view.findViewById(R.id.vuk), 0);
        C786410Ut5.LLLLZLL((TuxTextView) view.findViewById(R.id.zmm), 8);
        C20522415Sc c20522415Sc = S5().LLJJ;
        c20522415Sc.getClass();
        c20522415Sc.LIZ = SystemClock.elapsedRealtime();
    }

    public final ExploreTopicGeneralFeedListViewModel S5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        return (ExploreTopicGeneralFeedListViewModel) assemVMLazy.getValue();
    }

    public final C15V2 T5() {
        return (C15V2) this.LLILLL.getValue();
    }

    public final void U5() {
        C20606915kJ c20606915kJ;
        if (this.LLIZ) {
            C20605115k1 item = getItem();
            if (((item == null || (c20606915kJ = item.LLILLL) == null) ? null : c20606915kJ.LIZIZ) instanceof C20607915kT) {
                C15TA c15ta = C15TA.LIZ;
                C15V2 c15v2T5 = T5();
                String str = c15v2T5 != null ? c15v2T5.LIZ : null;
                C15V2 c15v2T52 = T5();
                Long l = c15v2T52 != null ? c15v2T52.LIZIZ : null;
                C20521215Rq c20521215Rq = (C20521215Rq) this.LLILZ.getValue();
                String str2 = c20521215Rq != null ? c20521215Rq.LIZIZ : null;
                C20521215Rq c20521215Rq2 = (C20521215Rq) this.LLILZ.getValue();
                String str3 = c20521215Rq2 != null ? c20521215Rq2.LIZ : null;
                c15ta.getClass();
                C15TA.LJFF(l, str, str2, str3);
                V5();
            }
        }
        this.LLIZLLLIL = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String P5() {
        Object next;
        Aweme aweme;
        C15SN c15sn = (C15SN) S5().getState();
        c15sn.getClass();
        List listLIZ = C627260Oiy.LIZ(c15sn);
        if (listLIZ == null) {
            return null;
        }
        Iterator<T> it2 = new C13EL(listLIZ).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            String aid = ((C20526015Tm) next).LL.getAid();
            if (aid != null && aid.length() != 0) {
                break;
            }
        }
        C20526015Tm c20526015Tm = (C20526015Tm) next;
        if (c20526015Tm == null || (aweme = c20526015Tm.LL) == null) {
            return null;
        }
        return aweme.getAid();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String R5() {
        Object next;
        C15SN c15sn = (C15SN) S5().getState();
        c15sn.getClass();
        List listLIZ = C627260Oiy.LIZ(c15sn);
        if (listLIZ == null) {
            return null;
        }
        Iterator<T> it2 = new C13EL(listLIZ).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            String str = ((C20526015Tm) next).LLILLL;
            if (str != null && str.length() != 0) {
                break;
            }
        }
        C20526015Tm c20526015Tm = (C20526015Tm) next;
        if (c20526015Tm != null) {
            return c20526015Tm.LLILLL;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void V5() {
        if (C0BK2.LIZ()) {
            C15SN c15sn = (C15SN) S5().getState();
            c15sn.getClass();
            List<C20526015Tm> list = c15sn.getListState().LLILZ;
            if (S5().LLJLIL != 0 || list == null || list.isEmpty()) {
                return;
            }
            C15TA c15ta = C15TA.LIZ;
            C15V2 c15v2T5 = T5();
            Long l = c15v2T5 != null ? c15v2T5.LIZIZ : null;
            C15V2 c15v2T52 = T5();
            String str = c15v2T52 != null ? c15v2T52.LIZ : null;
            String strP5 = P5();
            String strR5 = R5();
            c15ta.getClass();
            C15TA.LIZJ(l, "ttexp_explore_end_of_feed_button_show", str, strP5, strR5);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        this.LLIZ = false;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void dispatchResume(boolean z) {
        super.dispatchResume(z);
        if (z) {
            U5();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        int iIntValue;
        C2493709pv c2493709pv = C2493709pv.LIZ;
        Context context = viewGroup.getContext();
        c2493709pv.getClass();
        View viewLIZ = C2493709pv.LIZ(context, R.layout.c5g, viewGroup);
        ViewGroup.LayoutParams layoutParams = viewLIZ.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            C786410Ut5.W5(viewLIZ, layoutParams);
            viewLIZ.setMinimumHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64)));
            TuxSpinner tuxSpinner = (TuxSpinner) viewLIZ.findViewById(R.id.vuk);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1p, viewLIZ.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = -16777216;
            }
            tuxSpinner.LIZ(R.raw.icon_spinner_normal, iIntValue);
            View viewFindViewById = viewLIZ.findViewById(R.id.zmm);
            if (viewFindViewById != null) {
                C2271391DvN.LIZ(viewFindViewById, (C1A5L) C2271381DvM.f253i0.getValue());
            }
            return viewLIZ;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
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
