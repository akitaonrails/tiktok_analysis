package com.ss.android.ugc.aweme.ecommerce.base.payment.viewholder.cashier;

import X.C01GW;
import X.C03S8;
import X.C03SY;
import X.C03Z4;
import X.C03ZA;
import X.C13LE;
import X.C19719912Dl;
import X.C452501pT;
import X.C755502xF;
import X.C887503dR;
import X.C894803ec;
import X.C924703jR;
import X.EnumC837803Pc;
import X.EnumC865103Zp;
import X.EnumC872903b5;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CciCashierDisplayType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentGuaranteeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.RetentionDialogInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import java.util.HashMap;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS402S0200000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class USCashierPaymentMethodVH extends ECJediViewHolder<C03ZA> {
    public final C924703jR LLJILJIL;
    public final LifecycleOwner LLJILJILJ;
    public final C01GW LLJILLL;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final PaymentViewModel W5() {
        return (PaymentViewModel) this.LLJILLL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rr(java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.payment.viewholder.cashier.USCashierPaymentMethodVH.rr(java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a6(Fragment fragment, HashMap<String, Object> map) {
        PaymentGuaranteeInfo paymentGuaranteeInfo;
        String str;
        boolean z;
        BillInfoData billInfoData;
        String str2;
        ButtonInfo buttonInfo;
        C887503dR c887503dR;
        EnumC837803Pc enumC837803Pc;
        EnumC872903b5 enumC872903b5;
        EnterParams enterParams;
        Summary summary;
        EnterParams enterParams2;
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        PaymentMethod paymentMethod = ((C03ZA) this.LLILLJJLI).LIZ;
        Address address = W5().LLILZLL;
        PaymentMethodsData paymentMethodsData = W5().LLJJIJIL;
        String str3 = null;
        PaymentInfo paymentInfoQR2 = W5().qR2(null);
        String str4 = W5().LLJJJ;
        HashMap map2 = new HashMap();
        if (map != null) {
            map2.putAll(map);
        }
        map2.put("previous_page", "payment_method");
        map2.put("page_info", "add");
        PaymentMethodsData paymentMethodsData2 = W5().LLJJIJIL;
        if (paymentMethodsData2 != null) {
            paymentGuaranteeInfo = paymentMethodsData2.guaranteeInfo;
        } else {
            paymentGuaranteeInfo = null;
        }
        boolean z2 = W5().LLJILJIL;
        n nVar = W5().LLJJJJLIIL;
        String strLIZJ = W5().LLJJLIIIJLLLLLLLZ.LIZJ("a2270.b8168", null);
        RetentionDialogInfo retentionDialogInfo = W5().LLJLLIL;
        EnterParams enterParams3 = W5().LLJ;
        if (enterParams3 != null) {
            str = enterParams3.LJIIIIZZ;
        } else {
            str = null;
        }
        EnterParams enterParams4 = W5().LLJ;
        if (enterParams4 != null && Intrinsics.LJFF(enterParams4.LJIIJ, Boolean.TRUE) && (enterParams2 = W5().LLJ) != null && !enterParams2.LIZLLL()) {
            z = true;
        } else {
            z = false;
        }
        EnterParams enterParams5 = W5().LLJ;
        if (enterParams5 != null) {
            billInfoData = enterParams5.LJIILLIIL;
        } else {
            billInfoData = null;
        }
        EnterParams enterParams6 = W5().LLJ;
        if (enterParams6 != null) {
            str2 = enterParams6.LJIIL;
        } else {
            str2 = null;
        }
        EnterParams enterParams7 = W5().LLJ;
        if (enterParams7 != null) {
            buttonInfo = enterParams7.LJIILIIL;
        } else {
            buttonInfo = null;
        }
        EnterParams enterParams8 = W5().LLJ;
        if (enterParams8 != null) {
            str3 = enterParams8.LJJI;
        }
        C755502xF c755502xF = null;
        EnterParams enterParams9 = new EnterParams(null, null, null, paymentMethodsData, null, false, paymentInfoQR2, map2, null, null, address, null, null, str4, null, null, retentionDialogInfo, null, paymentGuaranteeInfo, strLIZJ, z2, nVar, null, Boolean.FALSE, str, null, Boolean.valueOf(z), false, str2, buttonInfo, null, null, billInfoData, null, null, null, null, null, null, null, str3, false, null, null, false, false, null, false, false, false);
        EnterParams enterParams10 = W5().LLJ;
        if (enterParams10 != null) {
            c887503dR = enterParams10.LJJIJL;
        } else {
            c887503dR = null;
        }
        enterParams9.LJJIJL = c887503dR;
        EnterParams enterParams11 = W5().LLJ;
        if (enterParams11 != null) {
            enumC837803Pc = enterParams11.LJJIJIIJI;
        } else {
            enumC837803Pc = null;
        }
        enterParams9.LJJIJIIJI = enumC837803Pc;
        if (enumC837803Pc == EnumC837803Pc.OCP && (enterParams = W5().LLJ) != null && Intrinsics.LJFF(enterParams.LJIIJ, Boolean.TRUE)) {
            EnterParams enterParams12 = W5().LLJ;
            if (enterParams12 != null) {
                summary = enterParams12.LJIJI;
            } else {
                summary = null;
            }
            enterParams9.LJIJI = summary;
            EnterParams enterParams13 = W5().LLJ;
            if (enterParams13 != null) {
                c755502xF = enterParams13.LJIJJ;
            }
            enterParams9.LJIJJ = c755502xF;
        }
        AwS402S0200000_1 awS402S0200000_1 = new AwS402S0200000_1(fragment, this, 23);
        if (C03S8.LJIL(((C03ZA) this.LLILLJJLI).LIZ.id)) {
            enumC872903b5 = EnumC872903b5.ADD_HSAFSA;
        } else {
            enumC872903b5 = EnumC872903b5.ADD_CCDC;
        }
        C894803ec.LIZ(childFragmentManager, paymentMethod, enterParams9, awS402S0200000_1, "ADD_NEW_CARD", enumC872903b5);
    }

    public USCashierPaymentMethodVH(ViewGroup viewGroup, C924703jR c924703jR, LifecycleOwner lifecycleOwner) {
        super(new C03Z4(viewGroup.getContext()));
        this.LLJILJIL = c924703jR;
        this.LLJILJILJ = lifecycleOwner;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PaymentViewModel.class);
        this.LLJILLL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 56));
    }

    public final void X5(Fragment fragment, PaymentMethod paymentMethod, HashMap<String, Object> map) {
        CciCashierDisplayType cciCashierDisplayType;
        String str;
        boolean z;
        boolean z2;
        String priceVal;
        EnterParams enterParams;
        String currency;
        EnterParams enterParams2;
        PaymentGuaranteeInfo paymentGuaranteeInfo;
        String str2;
        BillInfoData billInfoData;
        String str3;
        ButtonInfo buttonInfo;
        EnterParams enterParams3;
        Price price;
        Price price2;
        PaymentMethodsData paymentMethodsData;
        C03SY c03sy = C03SY.LIZ;
        PaymentMethodsData paymentMethodsData2 = W5().LLJJIJIL;
        String str4 = null;
        if (paymentMethodsData2 != null) {
            cciCashierDisplayType = paymentMethodsData2.cciCashierDisplayType;
        } else {
            cciCashierDisplayType = null;
        }
        c03sy.getClass();
        EnumC865103Zp enumC865103ZpLJIIIIZZ = C03SY.LJIIIIZZ(cciCashierDisplayType);
        if (enumC865103ZpLJIIIIZZ == null) {
            return;
        }
        EnterParams enterParams4 = W5().LLJ;
        if (enterParams4 != null) {
            str = enterParams4.paySource;
        } else {
            str = null;
        }
        boolean z3 = true;
        if (!Intrinsics.LJFF(str, "orderlist") && !Intrinsics.LJFF(str, "orderdetail")) {
            z = false;
        } else {
            z = true;
        }
        EnterParams enterParams5 = W5().LLJ;
        if (enterParams5 != null && (paymentMethodsData = enterParams5.paymentData) != null && paymentMethodsData.LJJ() && z) {
            z2 = true;
        } else {
            z2 = false;
        }
        Summary summary = W5().LLIZLLLIL;
        if (summary == null || (price2 = summary.total) == null || (priceVal = price2.getPriceVal()) == null) {
            if (z2 && (enterParams = W5().LLJ) != null) {
                priceVal = enterParams.totalPriceVal;
            } else {
                priceVal = null;
            }
        }
        Summary summary2 = W5().LLIZLLLIL;
        if (summary2 == null || (price = summary2.total) == null || (currency = price.getCurrency()) == null) {
            if (z2 && (enterParams2 = W5().LLJ) != null) {
                currency = enterParams2.currency;
            } else {
                currency = null;
            }
        }
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Address address = W5().LLILZLL;
        PaymentMethodsData paymentMethodsData3 = W5().LLJJIJIL;
        PaymentInfo paymentInfoQR2 = W5().qR2(null);
        String str5 = W5().LLJJJ;
        HashMap map2 = new HashMap();
        if (map != null) {
            map2.putAll(map);
        }
        map2.put("previous_page", "payment_method");
        map2.put("page_info", "add");
        PaymentMethodsData paymentMethodsData4 = W5().LLJJIJIL;
        if (paymentMethodsData4 != null) {
            paymentGuaranteeInfo = paymentMethodsData4.guaranteeInfo;
        } else {
            paymentGuaranteeInfo = null;
        }
        n nVar = W5().LLJJJJLIIL;
        boolean z4 = W5().LLJILJIL;
        EnterParams enterParams6 = W5().LLJ;
        if (enterParams6 != null) {
            str2 = enterParams6.LJIIIIZZ;
        } else {
            str2 = null;
        }
        EnterParams enterParams7 = W5().LLJ;
        if (enterParams7 == null || !Intrinsics.LJFF(enterParams7.LJIIJ, Boolean.TRUE) || (enterParams3 = W5().LLJ) == null || enterParams3.LIZLLL()) {
            z3 = false;
        }
        EnterParams enterParams8 = W5().LLJ;
        if (enterParams8 != null) {
            billInfoData = enterParams8.LJIILLIIL;
        } else {
            billInfoData = null;
        }
        EnterParams enterParams9 = W5().LLJ;
        if (enterParams9 != null) {
            str3 = enterParams9.LJIIL;
        } else {
            str3 = null;
        }
        EnterParams enterParams10 = W5().LLJ;
        if (enterParams10 != null) {
            buttonInfo = enterParams10.LJIILIIL;
        } else {
            buttonInfo = null;
        }
        EnterParams enterParams11 = new EnterParams(null, null, null, paymentMethodsData3, null, false, paymentInfoQR2, map2, null, null, address, priceVal, currency, str5, null, null, null, null, paymentGuaranteeInfo, null, z4, nVar, null, Boolean.FALSE, str2, null, Boolean.valueOf(z3), false, str3, buttonInfo, null, null, billInfoData, null, null, null, null, null, null, null, null, false, null, null, false, false, null, false, false, false);
        AwS402S0200000_1 awS402S0200000_1 = new AwS402S0200000_1(fragment, this, 22);
        EnumC872903b5 enumC872903b5 = EnumC872903b5.ADD_CCI;
        PaymentMethodsData paymentMethodsData5 = W5().LLJJIJIL;
        if (paymentMethodsData5 != null) {
            str4 = paymentMethodsData5.countryCode;
        }
        C894803ec.LIZIZ(childFragmentManager, paymentMethod, enterParams11, awS402S0200000_1, enumC865103ZpLJIIIIZZ, enumC872903b5, str4, null, null, null, null, null, null, 8064);
    }
}
