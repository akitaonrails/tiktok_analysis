package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03H8;
import X.C03IJ;
import X.C03K6;
import X.C0H9H;
import X.C0WZX;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C123100dR;
import X.C13LE;
import X.C13LP;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C21588719eH;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C679280Qkg;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C866903a7;
import X.C870703aj;
import X.C889403dk;
import X.C933403kq;
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
import X.InterfaceC998610c5r;
import Y.ARunnableS70S0200000_1;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS37S0500000_1;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CCDCCardNumberElementViewHolderV2 extends PowerCell<C889403dk> implements InterfaceC724530SbT, InterfaceC998610c5r, C03H8 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final AssemVMLazy LL;
    public int LLILLJJLI;
    public boolean LLILLL;
    public String LLILZ;
    public boolean LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CCDCCardNumberElementViewHolderV2.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/payment/ccdc/CCDCAddCardViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    public CCDCCardNumberElementViewHolderV2() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CCDCAddCardViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 1085);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(204);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 1095), awS545S0100000_1, AFwS207S0000000_19.get$arr$(212), new AwS545S0100000_1((C03K6) this, 1077), new AwS545S0100000_1((C03K6) this, 1079), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1081), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1320), null, new AwS545S0100000_1((C03K6) this, 1083));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS545S0100000_1 awS545S0100000_12 = new AwS545S0100000_1((C03K6) this, 1078);
            AwS545S0100000_1 awS545S0100000_13 = new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1080);
            AwS545S0100000_1 awS545S0100000_14 = new AwS545S0100000_1(c19719912DlLIZ, 1082);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS545S0100000_12, 79));
            AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c01gwLIZIZ, 1321);
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c01gwLIZIZ, 1322);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c01gwLIZIZ, 1323);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c01gwLIZIZ, 1324);
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 1325);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS545S0100000_14, awS545S0100000_1, new C452080Ho6(), awS563S0100000_19, awS563S0100000_192, awS545S0100000_13, aFwS228S0000000_1, awS563S0100000_193, awS563S0100000_194, awS563S0100000_195);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 1084), awS545S0100000_1, AFwS207S0000000_19.get$arr$(210), new AwS545S0100000_1((C03K6) this, 1086), new AwS545S0100000_1((C03K6) this, 1087), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1088), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1326), null, new AwS545S0100000_1((C03K6) this, 1089));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 1090), awS545S0100000_1, AFwS207S0000000_19.get$arr$(211), new AwS545S0100000_1((C03K6) this, 1091), new AwS545S0100000_1((C03K6) this, 1092), new AwS545S0100000_1((C03K6) this, 1093), aFwS228S0000000_1, null, null, new AwS545S0100000_1((C03K6) this, 1094));
        }
        this.LL = assemVMLazy;
    }

    @Override // X.InterfaceC998610c5r
    /* JADX INFO: renamed from: I5, reason: merged with bridge method [inline-methods] */
    public final EditText l() {
        C933403kq c933403kq;
        View view = this.itemView;
        if (!(view instanceof C933403kq) || (c933403kq = (C933403kq) view) == null) {
            return null;
        }
        return c933403kq.getInputView();
    }

    public final CCDCAddCardViewModel L5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
        return (CCDCAddCardViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC998610c5r
    public final boolean w2() {
        EditText editTextL;
        Editable editableLLJILLL;
        String string;
        C866903a7 c866903a7;
        C889403dk item = getItem();
        return C123100dR.LIZ((item == null || (c866903a7 = item.LLILLJJLI) == null) ? null : c866903a7.LIZJ) || !((editTextL = l()) == null || (editableLLJILLL = C2204961BRm.LLJILLL(editTextL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KwLk70s3LAv+ax35Zl7Ib+d7IIde9k7qJhFBRq0a6iy3wYm8d92+eT+1n04O9pKBAu916/Yg+o2sNG9r94=", null))) == null || (string = editableLLJILLL.toString()) == null || string.length() != 0);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C933403kq c933403kq;
        boolean z;
        String str;
        EditText editText;
        Editable editableLLJILLL;
        String string;
        C889403dk c889403dk = (C889403dk) interfaceC1891350zJl;
        super.onBindItemView(c889403dk);
        C870703aj.LIZ(this.itemView, new C21588719eH(C679280Qkg.LIZ(25), 0, 0, 0, false, 0, true, 254));
        this.itemView.setPadding(C0H9H.LIZIZ(16), this.itemView.getPaddingTop(), C0H9H.LIZIZ(16), this.itemView.getPaddingBottom());
        View view = this.itemView;
        if ((view instanceof C933403kq) && (c933403kq = (C933403kq) view) != null) {
            ElementDTO elementDTO = c889403dk.LLILLJJLI.LIZ;
            PaymentMethod paymentMethod = c889403dk.LL;
            if (paymentMethod.LJJJJIZL()) {
                z = true;
            } else {
                z = false;
            }
            c933403kq.setCCI(z);
            c933403kq.setParentPaymentMethod(c889403dk.LL);
            c933403kq.setPaymentSubPaymentMethodList(c889403dk.LL.subPaymentMethods);
            c933403kq.setIconsProvider(new AwS545S0100000_1(c889403dk, 1689));
            c933403kq.setOnFocusChange(new AwS367S0200000_1(this, elementDTO, 302));
            c933403kq.setOnPaymentMethodIdentify(new AwS580S0100000_1(this, 821));
            this.LLILZIL = false;
            CCDCAddCardViewModel cCDCAddCardViewModelL5 = L5();
            String str2 = elementDTO.id;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            PaymentElement paymentElement = (PaymentElement) C13LP.LJJJLL(cCDCAddCardViewModelL5.LQ2(str2));
            if (paymentElement != null) {
                str = paymentElement.paramValue;
            } else {
                str = null;
            }
            this.LLILZ = str;
            c933403kq.setAfterValueChanged(new AwS37S0500000_1(c933403kq, c889403dk, this, elementDTO, paymentMethod, 11));
            c933403kq.setOnValueChange(new AwS37S0500000_1(c933403kq, c889403dk, this, elementDTO, paymentMethod, 12));
            c933403kq.setOnVerify(new AwS37S0500000_1(c933403kq, c889403dk, this, elementDTO, paymentMethod, 13));
            c933403kq.setOnErrorClear(new AwS545S0100000_1(c889403dk, 1690));
            c933403kq.setRequestOCR(new AwS545S0100000_1(this, 1691));
            this.LLILZIL = true;
            C866903a7 c866903a7 = c889403dk.LLILLJJLI;
            String str4 = c866903a7.LIZLLL;
            if (str4 == null) {
                str4 = c866903a7.LIZJ;
            }
            CCDCAddCardViewModel cCDCAddCardViewModelL52 = L5();
            String str5 = elementDTO.id;
            if (str5 != null) {
                str3 = str5;
            }
            c933403kq.LIZLLL(elementDTO, cCDCAddCardViewModelL52.LQ2(str3), str4);
            this.LLILZIL = false;
            EditText editTextL = l();
            if (editTextL != null) {
                editTextL.setImeOptions(c889403dk.LLILZ);
            }
            EditText editTextL2 = l();
            if (editTextL2 != null) {
                editTextL2.setSingleLine();
            }
            if (!this.LLILLL && (editableLLJILLL = C2204961BRm.LLJILLL((editText = c933403kq.getEditText()), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KwLk70s3LAv+ax35Zl7Ib+d7IIde9k7qJhFBRq0a6iy3wYm8d92+eT+1n04O9pKBAu916/Yg+o2sNG9r94=", null))) != null && (string = editableLLJILLL.toString()) != null && string.length() == 0) {
                HandlerHook.viewPostDelay(editText, new ARunnableS70S0200000_1(editText, this, 26), 400L);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return new C933403kq(viewGroup.getContext());
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
