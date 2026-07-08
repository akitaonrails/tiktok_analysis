package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.powerlist;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C03K6;
import X.C09R3;
import X.C0H1U;
import X.C0H9H;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1295960jpS;
import X.C12ES;
import X.C1308910kAL;
import X.C1389890mGx;
import X.C13LE;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C197039127h;
import X.C19719912Dl;
import X.C20642515q3;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C341940Daq;
import X.C452080Ho6;
import X.C452501pT;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C946803n0;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1730270v7x;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.BillboardGlobalViewModel;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.TemplateListViewModel;
import com.zhiliaoapp.musically.R;
import g1c.AjS22S0300000_26;
import g1c.AjS70S0100000_26;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public class BaseTemplateCell<T extends TemplateItem> extends PowerCell<T> implements InterfaceC724530SbT, InterfaceC1730270v7x {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final AssemVMLazy LL;
    public final AssemVMLazy LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BaseTemplateCell.class, "globalViewModel", "getGlobalViewModel()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/effect2/viewmodel/BillboardGlobalViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BaseTemplateCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/effect2/viewmodel/TemplateListViewModel;", 0);
        c09r3.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
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

    public BaseTemplateCell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BillboardGlobalViewModel.class);
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(c19719912DlLIZ, 815);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(367);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 802), awS570S0100000_26, AFwS215S0000000_26.get$arr$(205), new AwS570S0100000_26((C03K6) this, 792), new AwS570S0100000_26((C03K6) this, 803), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 806), aFwS268S0000000_26, new AwS570S0100000_26((C03K6) this, 809), null, new AwS570S0100000_26((C03K6) this, 812));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS570S0100000_26 awS570S0100000_262 = new AwS570S0100000_26((C03K6) this, 788);
            AwS570S0100000_26 awS570S0100000_263 = new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 790);
            AwS570S0100000_26 awS570S0100000_264 = new AwS570S0100000_26(c19719912DlLIZ, 793);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS427S0200000_26((InterfaceC451590HnJ) obj, awS570S0100000_262, 43));
            AwS570S0100000_26 awS570S0100000_265 = new AwS570S0100000_26(c01gwLIZIZ, 798);
            AwS570S0100000_26 awS570S0100000_266 = new AwS570S0100000_26(c01gwLIZIZ, 801);
            AwS570S0100000_26 awS570S0100000_267 = new AwS570S0100000_26(c01gwLIZIZ, 804);
            AwS570S0100000_26 awS570S0100000_268 = new AwS570S0100000_26(c01gwLIZIZ, 807);
            AwS570S0100000_26 awS570S0100000_269 = new AwS570S0100000_26(c01gwLIZIZ, 810);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS570S0100000_264, awS570S0100000_26, new C452080Ho6(), awS570S0100000_265, awS570S0100000_266, awS570S0100000_263, aFwS268S0000000_26, awS570S0100000_267, awS570S0100000_268, awS570S0100000_269);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 813), awS570S0100000_26, AFwS215S0000000_26.get$arr$(204), new AwS570S0100000_26((C03K6) this, 817), new AwS570S0100000_26((C03K6) this, 819), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 821), aFwS268S0000000_26, new AwS570S0100000_26((C03K6) this, 823), null, new AwS570S0100000_26((C03K6) this, 825));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ, 826), awS570S0100000_26, AFwS215S0000000_26.get$arr$(206), new AwS570S0100000_26((C03K6) this, 828), new AwS570S0100000_26((C03K6) this, 830), new AwS570S0100000_26((C03K6) this, 833), aFwS268S0000000_26, null, null, new AwS570S0100000_26((C03K6) this, 835));
        }
        this.LL = assemVMLazy;
        Object obj2 = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TemplateListViewModel.class);
        AwS570S0100000_26 awS570S0100000_2610 = new AwS570S0100000_26(c19719912DlLIZ2, 837);
        AFwS268S0000000_26 aFwS268S0000000_262 = AFwS268S0000000_26.get$arr$(366);
        if (Intrinsics.LJFF(obj2, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ2, 787), awS570S0100000_2610, AFwS215S0000000_26.get$arr$(203), new AwS570S0100000_26((C03K6) this, 791), new AwS570S0100000_26((C03K6) this, 794), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 796), aFwS268S0000000_262, new AwS570S0100000_26((C03K6) this, 799), null, new AwS570S0100000_26((C03K6) this, 805));
        } else if (obj2 instanceof InterfaceC451590HnJ) {
            AwS570S0100000_26 awS570S0100000_2611 = new AwS570S0100000_26((C03K6) this, StrategyCenter.ENABLE_SMART_SERVICE);
            AwS570S0100000_26 awS570S0100000_2612 = new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 811);
            AwS570S0100000_26 awS570S0100000_2613 = new AwS570S0100000_26(c19719912DlLIZ2, 814);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS427S0200000_26((InterfaceC451590HnJ) obj2, awS570S0100000_2611, 44));
            AwS570S0100000_26 awS570S0100000_2614 = new AwS570S0100000_26(c01gwLIZIZ2, 816);
            AwS570S0100000_26 awS570S0100000_2615 = new AwS570S0100000_26(c01gwLIZIZ2, 818);
            AwS570S0100000_26 awS570S0100000_2616 = new AwS570S0100000_26(c01gwLIZIZ2, 820);
            AwS570S0100000_26 awS570S0100000_2617 = new AwS570S0100000_26(c01gwLIZIZ2, 822);
            AwS570S0100000_26 awS570S0100000_2618 = new AwS570S0100000_26(c01gwLIZIZ2, 824);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS570S0100000_2613, awS570S0100000_2610, new C452080Ho6(), awS570S0100000_2614, awS570S0100000_2615, awS570S0100000_2612, aFwS268S0000000_262, awS570S0100000_2616, awS570S0100000_2617, awS570S0100000_2618);
        } else if (Intrinsics.LJFF(obj2, obj2)) {
            assemVMLazy2 = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ2, 827), awS570S0100000_2610, AFwS215S0000000_26.get$arr$(207), new AwS570S0100000_26((C03K6) this, 829), new AwS570S0100000_26((C03K6) this, 831), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 832), aFwS268S0000000_262, new AwS570S0100000_26((C03K6) this, 834), null, new AwS570S0100000_26((C03K6) this, 836));
        } else {
            if (!Intrinsics.LJFF(obj2, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj2);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS570S0100000_26(c19719912DlLIZ2, 786), awS570S0100000_2610, AFwS215S0000000_26.get$arr$(202), new AwS570S0100000_26((C03K6) this, 789), new AwS570S0100000_26((C03K6) this, 795), new AwS570S0100000_26((C03K6) this, 797), aFwS268S0000000_262, null, null, new AwS570S0100000_26((C03K6) this, 800));
        }
        this.LLILLJJLI = assemVMLazy2;
    }

    public final BillboardGlobalViewModel L5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLL;
        return (BillboardGlobalViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC1730270v7x
    public final void LIZ() {
        Fragment fragmentLIZ = C946803n0.LIZ(this.itemView);
        if (fragmentLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(fragmentLIZ);
            c1389890mGx.LJIIIZ(2131846798);
            c1389890mGx.LJIIJJI();
        }
        N5().LLJILJILJ = null;
        N5().manualListRefresh();
    }

    public final TemplateListViewModel N5() {
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLL;
        return (TemplateListViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC1730270v7x
    public void O1() {
        N5().LLJILJILJ = null;
    }

    public static void R5(ViewGroup viewGroup) {
        int iMin;
        int iLJIIJ = (((C12ES.LJIIJ(viewGroup.getContext()) - (C341940Daq.LIZ(6.0d) * 4)) / 2) - C341940Daq.LIZ(164.0d)) / 2;
        if (iLJIIJ > 0) {
            iMin = Math.min(iLJIIJ, C341940Daq.LIZ(7.0d));
        } else {
            iMin = 0;
        }
        C0H9H.LJI(iMin, viewGroup);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0043 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void I5(final android.view.View r22, java.util.List r23) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.powerlist.BaseTemplateCell.I5(android.view.View, java.util.List):void");
    }

    public final void P5(ViewGroup viewGroup, T t) {
        if (t.b0()) {
            C12ES.LJIILL(0, this.itemView.findViewById(R.id.l7q));
            this.itemView.findViewById(R.id.l7q).setBackgroundResource(R.drawable.blr);
            C12ES.LJIILL(0, this.itemView.findViewById(R.id.i1y));
            C12ES.LJIILL(0, this.itemView.findViewById(R.id.nr7));
            ((C1295960jpS) this.itemView.findViewById(R.id.nr7)).playAnimation();
            ((TextView) this.itemView.findViewById(R.id.cm2)).setText(C20642515q3.LJI(2131821364));
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, this.itemView.getContext());
            if (numLIZJ != null) {
                ((TextView) this.itemView.findViewById(R.id.cm2)).setTextColor(numLIZJ.intValue());
            }
            ((C197039127h) this.itemView.findViewById(R.id.cm2)).setButtonVariant(1);
            C786410Ut5.I7(new AjS22S0300000_26(this, viewGroup, t, 3), this.itemView.findViewById(R.id.cm2));
            return;
        }
        C0H1U.LIZIZ(this.itemView.findViewById(R.id.l7q));
        this.itemView.findViewById(R.id.l7q).setBackgroundResource(0);
        C0H1U.LIZIZ(this.itemView.findViewById(R.id.i1y));
        ((C1295960jpS) this.itemView.findViewById(R.id.nr7)).cancelAnimation();
        C0H1U.LIZIZ(this.itemView.findViewById(R.id.nr7));
        ((TextView) this.itemView.findViewById(R.id.cm2)).setText(C20642515q3.LJI(2131830715));
        if (t.Sm()) {
            ((C197039127h) this.itemView.findViewById(R.id.cm2)).setEnabled(true);
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ee, this.itemView.getContext());
            if (numLIZJ2 != null) {
                ((TextView) this.itemView.findViewById(R.id.cm2)).setTextColor(numLIZJ2.intValue());
            }
            ((C197039127h) this.itemView.findViewById(R.id.cm2)).setButtonVariant(0);
            C786410Ut5.I7(new AjS22S0300000_26(this, viewGroup, t, 4), this.itemView.findViewById(R.id.cm2));
            return;
        }
        ((C197039127h) this.itemView.findViewById(R.id.cm2)).setButtonVariant(0);
        ((C197039127h) this.itemView.findViewById(R.id.cm2)).setEnabled(false);
        ((C197039127h) this.itemView.findViewById(R.id.cm2)).setSupportClickWhenDisable(true);
        C786410Ut5.I7(new AjS70S0100000_26(this, 35), this.itemView.findViewById(R.id.cm2));
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
