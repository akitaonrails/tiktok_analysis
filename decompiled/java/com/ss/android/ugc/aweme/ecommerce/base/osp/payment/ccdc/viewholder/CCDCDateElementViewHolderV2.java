package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03H8;
import X.C03IJ;
import X.C03K6;
import X.C04JW;
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
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C2341109Fh;
import X.C452080Ho6;
import X.C452501pT;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C869503aX;
import X.C870703aj;
import X.C878903c3;
import X.C889003dg;
import X.C890603dw;
import X.C942603mK;
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
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS100S0400000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS37S0500000_1;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CCDCDateElementViewHolderV2 extends PowerCell<C889003dg> implements InterfaceC724530SbT, C03H8, InterfaceC998610c5r {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final AssemVMLazy LL;
    public int LLILLJJLI;
    public final String LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CCDCDateElementViewHolderV2.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/payment/ccdc/CCDCAddCardViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    public CCDCDateElementViewHolderV2() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CCDCAddCardViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 1104);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(205);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 1114), awS545S0100000_1, AFwS207S0000000_19.get$arr$(215), new AwS545S0100000_1((C03K6) this, 1096), new AwS545S0100000_1((C03K6) this, 1098), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1100), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1327), null, new AwS545S0100000_1((C03K6) this, 1102));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS545S0100000_1 awS545S0100000_12 = new AwS545S0100000_1((C03K6) this, 1097);
            AwS545S0100000_1 awS545S0100000_13 = new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1099);
            AwS545S0100000_1 awS545S0100000_14 = new AwS545S0100000_1(c19719912DlLIZ, 1101);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS545S0100000_12, 80));
            AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c01gwLIZIZ, 1328);
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c01gwLIZIZ, 1329);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c01gwLIZIZ, 1330);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c01gwLIZIZ, 1331);
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 1332);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS545S0100000_14, awS545S0100000_1, new C452080Ho6(), awS563S0100000_19, awS563S0100000_192, awS545S0100000_13, aFwS228S0000000_1, awS563S0100000_193, awS563S0100000_194, awS563S0100000_195);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 1103), awS545S0100000_1, AFwS207S0000000_19.get$arr$(213), new AwS545S0100000_1((C03K6) this, 1105), new AwS545S0100000_1((C03K6) this, 1106), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1107), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1333), null, new AwS545S0100000_1((C03K6) this, 1108));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 1109), awS545S0100000_1, AFwS207S0000000_19.get$arr$(214), new AwS545S0100000_1((C03K6) this, 1110), new AwS545S0100000_1((C03K6) this, 1111), new AwS545S0100000_1((C03K6) this, 1112), aFwS228S0000000_1, null, null, new AwS545S0100000_1((C03K6) this, 1113));
        }
        this.LL = assemVMLazy;
        this.LLILLL = "ccdc_date";
    }

    @Override // X.InterfaceC998610c5r
    /* JADX INFO: renamed from: I5, reason: merged with bridge method [inline-methods] */
    public final EditText l() {
        C942603mK c942603mK;
        View view = this.itemView;
        if (!(view instanceof C942603mK) || (c942603mK = (C942603mK) view) == null) {
            return null;
        }
        return c942603mK.getInputView();
    }

    public final CCDCAddCardViewModel L5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
        return (CCDCAddCardViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC998610c5r
    public final boolean w2() {
        EditText editTextL;
        Editable editableLLJILLL;
        String string;
        C869503aX c869503aX;
        C889003dg item = getItem();
        return C123100dR.LIZ((item == null || (c869503aX = item.LLILLJJLI) == null) ? null : c869503aX.LIZJ) || !((editTextL = l()) == null || (editableLLJILLL = C2204961BRm.LLJILLL(editTextL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KwLk70s3LAv+ax35Zl7Ib+d7IIde9k7qJhFBRq0a6iy2AYg8NRv8et9l8NOdrpLc+jPSB/L8BY=", null))) == null || (string = editableLLJILLL.toString()) == null || string.length() != 0);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int iLIZIZ;
        C942603mK c942603mK;
        int iIntValue;
        int i;
        C889003dg c889003dg = (C889003dg) interfaceC1891350zJl;
        super.onBindItemView(c889003dg);
        C870703aj.LIZ(this.itemView, c889003dg.LLILZIL);
        boolean z = false;
        if (C13LP.LJJJJ(c889003dg.LLILLJJLI.LIZ.id, L5().LLJI)) {
            iLIZIZ = 0;
        } else {
            iLIZIZ = C0H9H.LIZIZ(16);
        }
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onGlobalLayout date height ");
        sbLIZ.append(c889003dg.LLILZIL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        this.itemView.setPadding(C0H9H.LIZIZ(16), this.itemView.getPaddingTop(), iLIZIZ, this.itemView.getPaddingBottom());
        if (C878903c3.LIZ()) {
            C786410Ut5.x3(this.itemView.getViewTreeObserver(), new C04JW(this, 2));
        }
        View view = this.itemView;
        if ((view instanceof C942603mK) && (c942603mK = (C942603mK) view) != null) {
            if (C878903c3.LIZ()) {
                CCDCAddCardViewModel cCDCAddCardViewModelL5 = L5();
                String str = this.LLILLL;
                C890603dw c890603dw = cCDCAddCardViewModelL5.LLJLILLLLZIIL;
                Integer num = (Integer) ((LinkedHashMap) c890603dw.LIZIZ).get(str);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                int i2 = c890603dw.LIZ;
                if (iIntValue < i2) {
                    i = i2 - iIntValue;
                } else {
                    i = 0;
                }
                c942603mK.setExtraPaddingTop(i);
            }
            String str2 = c889003dg.LL.id;
            if (str2 != null && (Intrinsics.LJFF(str2, "pm_pi_ccdc_bancontact_all") || Intrinsics.LJFF(str2, "pm_pi_ccdc_bancontact_c_d"))) {
                z = true;
            }
            c942603mK.setBancontact(z);
            ElementDTO elementDTO = c889003dg.LLILLJJLI.LIZ;
            PaymentMethod paymentMethod = c889003dg.LL;
            c942603mK.setFocusChange(new AwS367S0200000_1(this, elementDTO, 303));
            c942603mK.setOnValueChange(new AwS100S0400000_1(this, elementDTO, paymentMethod, c942603mK, 28));
            c942603mK.setAfterValueChanged(AFwS228S0000000_1.get$arr$(761));
            c942603mK.setOnVerify(new AwS37S0500000_1(elementDTO, paymentMethod, c942603mK, this, c889003dg, 14));
            c942603mK.setOnErrorClear(new AwS545S0100000_1(c889003dg, 1693));
            CCDCAddCardViewModel cCDCAddCardViewModelL52 = L5();
            String str3 = elementDTO.id;
            if (str3 == null) {
                str3 = "";
            }
            c942603mK.LIZLLL(elementDTO, cCDCAddCardViewModelL52.LQ2(str3), c889003dg.LLILLJJLI.LIZJ);
            c942603mK.getEditText().setImeOptions(c889003dg.LLILZ);
            c942603mK.getEditText().setSingleLine();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return new C942603mK(viewGroup.getContext());
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
