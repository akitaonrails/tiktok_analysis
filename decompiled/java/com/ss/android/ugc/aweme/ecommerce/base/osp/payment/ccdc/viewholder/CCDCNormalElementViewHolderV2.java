package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03H8;
import X.C03IJ;
import X.C03K6;
import X.C04JX;
import X.C0H9H;
import X.C0WZX;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C123100dR;
import X.C13LE;
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
import X.C869603aY;
import X.C870703aj;
import X.C878903c3;
import X.C889203di;
import X.C890603dw;
import X.C943103mP;
import X.C943903mX;
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
import kotlin.jvm.internal.AwS210S0300000_1;
import kotlin.jvm.internal.AwS37S0500000_1;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CCDCNormalElementViewHolderV2 extends PowerCell<C889203di> implements InterfaceC724530SbT, InterfaceC998610c5r, C03H8 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final AssemVMLazy LL;
    public int LLILLJJLI;
    public final String LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CCDCNormalElementViewHolderV2.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/payment/ccdc/CCDCAddCardViewModel;", 0);
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

    public CCDCNormalElementViewHolderV2() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CCDCAddCardViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 1123);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(206);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 1133), awS545S0100000_1, AFwS207S0000000_19.get$arr$(218), new AwS545S0100000_1((C03K6) this, 1115), new AwS545S0100000_1((C03K6) this, 1117), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1119), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1334), null, new AwS545S0100000_1((C03K6) this, 1121));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS545S0100000_1 awS545S0100000_12 = new AwS545S0100000_1((C03K6) this, 1116);
            AwS545S0100000_1 awS545S0100000_13 = new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1118);
            AwS545S0100000_1 awS545S0100000_14 = new AwS545S0100000_1(c19719912DlLIZ, 1120);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS545S0100000_12, 81));
            AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c01gwLIZIZ, 1335);
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c01gwLIZIZ, 1336);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c01gwLIZIZ, 1337);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c01gwLIZIZ, 1338);
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 1339);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS545S0100000_14, awS545S0100000_1, new C452080Ho6(), awS563S0100000_19, awS563S0100000_192, awS545S0100000_13, aFwS228S0000000_1, awS563S0100000_193, awS563S0100000_194, awS563S0100000_195);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 1122), awS545S0100000_1, AFwS207S0000000_19.get$arr$(216), new AwS545S0100000_1((C03K6) this, 1124), new AwS545S0100000_1((C03K6) this, 1125), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1126), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1340), null, new AwS545S0100000_1((C03K6) this, 1127));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 1128), awS545S0100000_1, AFwS207S0000000_19.get$arr$(217), new AwS545S0100000_1((C03K6) this, 1129), new AwS545S0100000_1((C03K6) this, 1130), new AwS545S0100000_1((C03K6) this, 1131), aFwS228S0000000_1, null, null, new AwS545S0100000_1((C03K6) this, 1132));
        }
        this.LL = assemVMLazy;
        this.LLILLL = "ccdc_cvv";
    }

    public final CCDCAddCardViewModel I5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
        return (CCDCAddCardViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC998610c5r
    public final View l() {
        C943103mP c943103mP;
        View view = this.itemView;
        if (!(view instanceof C943103mP) || (c943103mP = (C943103mP) view) == null) {
            return null;
        }
        return c943103mP.getInputView();
    }

    @Override // X.InterfaceC998610c5r
    public final boolean w2() {
        C943103mP c943103mP;
        EditText inputView;
        Editable editableLLJILLL;
        String string;
        C869603aY c869603aY;
        C889203di item = getItem();
        if (!C123100dR.LIZ((item == null || (c869603aY = item.LLILLJJLI) == null) ? null : c869603aY.LIZJ)) {
            View view = this.itemView;
            if (!(view instanceof C943103mP) || (c943103mP = (C943103mP) view) == null || (inputView = c943103mP.getInputView()) == null || (editableLLJILLL = C2204961BRm.LLJILLL(inputView, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KwLk70s3LAv+ax35Zl7Ib+d7IIde9k7qJhFBRq0a6iy0ggm+PBv0erhcznw+Kx09JNoncx7Zy+iww==", null))) == null || (string = editableLLJILLL.toString()) == null || string.length() != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int iLIZIZ;
        C943103mP c943103mP;
        int iIntValue;
        C889203di c889203di = (C889203di) interfaceC1891350zJl;
        super.onBindItemView(c889203di);
        C870703aj.LIZ(this.itemView, c889203di.LLILZLL);
        int i = 0;
        if (Intrinsics.LJFF(c889203di.LLILLJJLI.LIZ.id, "eg_ccdc_global_cvv")) {
            iLIZIZ = 0;
        } else {
            iLIZIZ = C0H9H.LIZIZ(16);
        }
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onGlobalLayout normal height ");
        sbLIZ.append(c889203di.LLILZLL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        View view = this.itemView;
        view.setPadding(iLIZIZ, view.getPaddingTop(), C0H9H.LIZIZ(16), this.itemView.getPaddingBottom());
        if (Intrinsics.LJFF(c889203di.LLILLJJLI.LIZ.id, "eg_ccdc_global_cvv") && C878903c3.LIZ()) {
            C786410Ut5.x3(this.itemView.getViewTreeObserver(), new C04JX(c889203di, this, 4));
        }
        View view2 = this.itemView;
        if ((view2 instanceof C943103mP) && (c943103mP = (C943103mP) view2) != null) {
            if (Intrinsics.LJFF(c889203di.LLILLJJLI.LIZ.id, "eg_ccdc_global_cvv") && C878903c3.LIZ()) {
                CCDCAddCardViewModel cCDCAddCardViewModelI5 = I5();
                String str = this.LLILLL;
                C890603dw c890603dw = cCDCAddCardViewModelI5.LLJLILLLLZIIL;
                Integer num = (Integer) ((LinkedHashMap) c890603dw.LIZIZ).get(str);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                int i2 = c890603dw.LIZ;
                if (iIntValue < i2) {
                    i = i2 - iIntValue;
                }
                c943103mP.setExtraPaddingTop(i);
            }
            ElementDTO elementDTO = c889203di.LLILLJJLI.LIZ;
            PaymentMethod paymentMethod = c889203di.LL;
            c943103mP.setOnValueChange(new AwS210S0300000_1(this, paymentMethod, elementDTO, 88));
            c943103mP.setOnVerify(new AwS37S0500000_1(this, paymentMethod, elementDTO, c943103mP, c889203di, 10));
            c943103mP.setOnErrorClear(new AwS545S0100000_1(c889203di, 1688));
            c943103mP.setAfterValueChanged(AFwS228S0000000_1.get$arr$(760));
            c943103mP.setOnFocusChange(new AwS210S0300000_1(elementDTO, this, c943103mP, 89));
            CCDCAddCardViewModel cCDCAddCardViewModelI52 = I5();
            String str2 = elementDTO.id;
            if (str2 == null) {
                str2 = "";
            }
            c943103mP.LIZLLL(elementDTO, cCDCAddCardViewModelI52.LQ2(str2), c889203di.LLILLJJLI.LIZJ);
            if (Intrinsics.LJFF(c889203di.LLILLJJLI.LIZ.id, "eg_ccdc_global_cvv")) {
                c943103mP.getInputView().setInputType(2);
                C943903mX.LIZ(c943103mP.getInputView(), 4);
                c943103mP.getInputView().setSingleLine();
            } else {
                c943103mP.getInputView().setInputType(1);
                C943903mX.LIZ(c943103mP.getInputView(), Integer.MAX_VALUE);
                c943103mP.getInputView().setSingleLine();
            }
            c943103mP.getInputView().setImeOptions(c889203di.LLILZIL);
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
