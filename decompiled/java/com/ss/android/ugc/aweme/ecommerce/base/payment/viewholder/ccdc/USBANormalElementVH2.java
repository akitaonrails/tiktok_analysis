package com.ss.android.ugc.aweme.ecommerce.base.payment.viewholder.ccdc;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03H8;
import X.C03IJ;
import X.C03K6;
import X.C0H9H;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13LE;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C870703aj;
import X.C889103dh;
import X.C943103mP;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS100S0400000_1;
import kotlin.jvm.internal.AwS210S0300000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class USBANormalElementVH2 extends PowerCell<C889103dh> implements InterfaceC724530SbT, C03H8 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final AssemVMLazy LL;
    public int LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(USBANormalElementVH2.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/payment/ccdc/CCDCAddCardViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.C03H8
    public final View LJJIJL() {
        throw null;
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

    public USBANormalElementVH2() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CCDCAddCardViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 1321);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(324);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 1331), awS545S0100000_1, AFwS207S0000000_19.get$arr$(233), new AwS545S0100000_1((C03K6) this, 1313), new AwS545S0100000_1((C03K6) this, 1315), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1317), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1369), null, new AwS545S0100000_1((C03K6) this, 1319));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS545S0100000_1 awS545S0100000_12 = new AwS545S0100000_1((C03K6) this, 1314);
            AwS545S0100000_1 awS545S0100000_13 = new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1316);
            AwS545S0100000_1 awS545S0100000_14 = new AwS545S0100000_1(c19719912DlLIZ, 1318);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS545S0100000_12, 86));
            AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c01gwLIZIZ, 1370);
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c01gwLIZIZ, 1371);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c01gwLIZIZ, 1372);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c01gwLIZIZ, 1373);
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 1374);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS545S0100000_14, awS545S0100000_1, new C452080Ho6(), awS563S0100000_19, awS563S0100000_192, awS545S0100000_13, aFwS228S0000000_1, awS563S0100000_193, awS563S0100000_194, awS563S0100000_195);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 1320), awS545S0100000_1, AFwS207S0000000_19.get$arr$(231), new AwS545S0100000_1((C03K6) this, 1322), new AwS545S0100000_1((C03K6) this, 1323), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1324), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1375), null, new AwS545S0100000_1((C03K6) this, 1325));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 1326), awS545S0100000_1, AFwS207S0000000_19.get$arr$(232), new AwS545S0100000_1((C03K6) this, 1327), new AwS545S0100000_1((C03K6) this, 1328), new AwS545S0100000_1((C03K6) this, 1329), aFwS228S0000000_1, null, null, new AwS545S0100000_1((C03K6) this, 1330));
        }
        this.LL = assemVMLazy;
    }

    public final CCDCAddCardViewModel I5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLL;
        return (CCDCAddCardViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C943103mP c943103mP;
        C889103dh c889103dh = (C889103dh) interfaceC1891350zJl;
        super.onBindItemView(c889103dh);
        C870703aj.LIZ(this.itemView, c889103dh.LLILZ);
        if (Intrinsics.LJFF(c889103dh.LLILLJJLI.LIZ.id, "eg_ccdc_global_billing_address_city")) {
            this.itemView.setPadding(C0H9H.LIZIZ(16), this.itemView.getPaddingTop(), C0H9H.LIZIZ(0), this.itemView.getPaddingBottom());
        } else {
            this.itemView.setPadding(C0H9H.LIZIZ(16), this.itemView.getPaddingTop(), C0H9H.LIZIZ(16), this.itemView.getPaddingBottom());
        }
        View view = this.itemView;
        if ((view instanceof C943103mP) && (c943103mP = (C943103mP) view) != null) {
            ElementDTO elementDTO = c889103dh.LLILLJJLI.LIZ;
            PaymentMethod paymentMethod = c889103dh.LL;
            c943103mP.setOnValueChange(new AwS367S0200000_1(this, elementDTO, 244));
            c943103mP.setOnVerify(new AwS100S0400000_1(this, paymentMethod, elementDTO, c943103mP, 24));
            c943103mP.setOnErrorClear(new AwS545S0100000_1(c889103dh, 1609));
            c943103mP.setOnFocusChange(new AwS210S0300000_1(this, c943103mP, elementDTO, 78));
            CCDCAddCardViewModel cCDCAddCardViewModelI5 = I5();
            String str = elementDTO.id;
            if (str == null) {
                str = "";
            }
            c943103mP.LIZLLL(elementDTO, cCDCAddCardViewModelI5.LQ2(str), c889103dh.LLILLJJLI.LIZJ);
            c943103mP.getInputView().setSingleLine();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return new C943103mP(viewGroup.getContext());
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
