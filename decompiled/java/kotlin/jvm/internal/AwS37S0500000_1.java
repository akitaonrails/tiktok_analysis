package kotlin.jvm.internal;

import X.C013C;
import X.C039K;
import X.C03KT;
import X.C03LE;
import X.C03WH;
import X.C03Y0;
import X.C03Y2;
import X.C03Y3;
import X.C03ZA;
import X.C03ZH;
import X.C044Z;
import X.C09AY;
import X.C0PEM;
import X.C0WZX;
import X.C10380044c;
import X.C10465047j;
import X.C10516049i;
import X.C1054104Ah;
import X.C1063304Dv;
import X.C1397580mTM;
import X.C1397620mTQ;
import X.C1397630mTR;
import X.C13LP;
import X.C13LQ;
import X.C15438062q;
import X.C1748720vbi;
import X.C197039127h;
import X.C19EG;
import X.C1DFH;
import X.C2107308Nj;
import X.C2204961BRm;
import X.C2296808zG;
import X.C23250099c;
import X.C23271099x;
import X.C259800zU;
import X.C818903Hv;
import X.C834300Wo8;
import X.C860903Xz;
import X.C862703Yr;
import X.C866803a6;
import X.C866903a7;
import X.C869503aX;
import X.C869603aY;
import X.C877303bn;
import X.C883303cl;
import X.C888803de;
import X.C889003dg;
import X.C889203di;
import X.C889403dk;
import X.C890103dr;
import X.C890903dz;
import X.C894003eU;
import X.C901403fg;
import X.C904203g8;
import X.C933403kq;
import X.C942603mK;
import X.C943103mP;
import X.C948503nH;
import X.InterfaceC746802vq;
import X.InterfaceC866403a2;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogButton;
import com.ss.android.ugc.aweme.ecommerce.base.osp.assem.module.address.identity.CpfEnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.OspAddressViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.OcrStatus;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder.CCDCCardNumberElementViewHolderV2;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder.CCDCDateElementViewHolderV2;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder.CCDCNormalElementViewHolderV2;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Balance;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BalanceCode;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommonRetainDisplayInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentPopUpInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.PaymentMethodViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CutPriceSKUPanel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPaymentModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.u;
import oqa.h;

/* JADX INFO: loaded from: classes2.dex */
public class AwS37S0500000_1 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfo] */
    public static final Object invoke$0(AwS37S0500000_1 awS37S0500000_1, Object obj) {
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = ((C818903Hv) obj).LLILLL;
        Context context = (Context) awS37S0500000_1.l0;
        if ((context instanceof C19EG) && (c19eg = (C19EG) context) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null) {
            OspAddressViewModel ospAddressViewModel = (OspAddressViewModel) awS37S0500000_1.l2;
            C948503nH.LJI(ospAddressViewModel, C23271099x.INSTANCE, new C03KT(supportFragmentManager, (View) awS37S0500000_1.l1, (CpfEnterParams) awS37S0500000_1.l3, ospAddressViewModel, c259800zU, (Function1) awS37S0500000_1.l4, null));
        }
        C1748720vbi.LIZLLL((View) awS37S0500000_1.l1, new C10516049i(), new AwS580S0100000_1(c259800zU, (C259800zU<String>) 24));
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [T, java.util.ArrayList] */
    public static final Object invoke$1(AwS37S0500000_1 awS37S0500000_1, Object obj) {
        Boolean boolIsAvailable;
        Availability availabilityCopy;
        C866803a6 c866803a6;
        Boolean boolIsAvailable2;
        Availability availabilityCopy2;
        List<PaymentMethod> list;
        List<PaymentMethod> list2;
        PaymentState paymentState = (PaymentState) obj;
        List<Balance> list3 = (List) awS37S0500000_1.l0;
        if (list3 != null) {
            EnterParams enterParams = (EnterParams) awS37S0500000_1.l4;
            C013C c013c = (C013C) awS37S0500000_1.l1;
            C259800zU c259800zU = (C259800zU) awS37S0500000_1.l2;
            for (Balance balance : list3) {
                BalanceCode balanceCode = balance.balanceCode;
                if (balanceCode == BalanceCode.BALANCE_INSUFFICIENT || balanceCode == BalanceCode.BALANCE_SUFFICIENT) {
                    PaymentMethodsData paymentMethodsData = enterParams.paymentData;
                    if (paymentMethodsData != null && (list2 = paymentMethodsData.paymentMethods) != null) {
                        Iterator<PaymentMethod> it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            PaymentMethod next = it2.next();
                            if (Intrinsics.LJFF(next.id, balance.paymentMethodId)) {
                                if (next != null) {
                                    c013c.element = true;
                                }
                            }
                        }
                    }
                    PaymentMethodsData paymentMethodsData2 = enterParams.paymentData;
                    if (paymentMethodsData2 != null && (list = paymentMethodsData2.storedMethods) != null) {
                        Iterator<PaymentMethod> it3 = list.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            PaymentMethod next2 = it3.next();
                            if (Intrinsics.LJFF(next2.id, balance.paymentMethodId)) {
                                if (next2 != null) {
                                    c013c.element = true;
                                }
                            }
                        }
                    }
                    if (c013c.element) {
                        List<Object> paymentList = paymentState.getPaymentList();
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(paymentList, 10));
                        for (Object objLIZ : paymentList) {
                            if (objLIZ instanceof C866803a6) {
                                C866803a6 c866803a62 = (C866803a6) objLIZ;
                                if (Intrinsics.LJFF(c866803a62.LIZIZ.id, balance.paymentMethodId)) {
                                    if (balance.balanceCode == BalanceCode.BALANCE_INSUFFICIENT) {
                                        boolIsAvailable2 = Boolean.FALSE;
                                    } else {
                                        Availability availability = c866803a62.LIZIZ.availability;
                                        if (availability != null) {
                                            boolIsAvailable2 = availability.isAvailable();
                                        } else {
                                            boolIsAvailable2 = null;
                                        }
                                    }
                                    Availability availability2 = c866803a62.LIZIZ.availability;
                                    if (availability2 != null) {
                                        availabilityCopy2 = availability2.copy(boolIsAvailable2, availability2.unavailableCode, availability2.unavailableReason, availability2.unavailablePopupTitle, availability2.statusCode);
                                    } else {
                                        availabilityCopy2 = null;
                                    }
                                    c866803a6 = new C866803a6(c866803a62.LIZ, PaymentMethod.LIZJ(c866803a62.LIZIZ, null, null, null, null, null, balance.balance, availabilityCopy2, null, null, false, null, null, null, null, null, null, -3145729, -1, -1), c866803a62.LIZJ, c866803a62.LIZLLL);
                                } else {
                                    c866803a6 = new C866803a6(c866803a62.LIZ, c866803a62.LIZIZ, c866803a62.LIZJ, c866803a62.LIZLLL);
                                }
                                objLIZ = c866803a6;
                            } else if (objLIZ instanceof C03ZA) {
                                C03ZA c03za = (C03ZA) objLIZ;
                                if (Intrinsics.LJFF(c03za.LIZ.id, balance.paymentMethodId)) {
                                    if (balance.balanceCode == BalanceCode.BALANCE_INSUFFICIENT) {
                                        boolIsAvailable = Boolean.FALSE;
                                    } else {
                                        Availability availability3 = c03za.LIZ.availability;
                                        if (availability3 != null) {
                                            boolIsAvailable = availability3.isAvailable();
                                        } else {
                                            boolIsAvailable = null;
                                        }
                                    }
                                    Availability availability4 = c03za.LIZ.availability;
                                    if (availability4 != null) {
                                        availabilityCopy = availability4.copy(boolIsAvailable, availability4.unavailableCode, availability4.unavailableReason, availability4.unavailablePopupTitle, availability4.statusCode);
                                    } else {
                                        availabilityCopy = null;
                                    }
                                    objLIZ = C03ZA.LIZ(c03za, PaymentMethod.LIZJ(c03za.LIZ, null, null, null, null, null, balance.balance, availabilityCopy, null, null, false, null, null, null, null, null, null, -3145729, -1, -1), null, 1022);
                                } else {
                                    objLIZ = C03ZA.LIZ(c03za, null, null, 1023);
                                }
                            }
                            arrayList.add(objLIZ);
                        }
                        c259800zU.element = new ArrayList(arrayList);
                    }
                }
            }
        }
        if (((C013C) awS37S0500000_1.l1).element && (!((Collection) ((C259800zU) awS37S0500000_1.l2).element).isEmpty())) {
            ((PaymentViewModel) awS37S0500000_1.l3).setState(new AwS580S0100000_1((C259800zU) awS37S0500000_1.l2, (C259800zU<String>) 209));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$10(kotlin.jvm.internal.AwS37S0500000_1 r9, java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS37S0500000_1.invoke$10(kotlin.jvm.internal.AwS37S0500000_1, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$11(kotlin.jvm.internal.AwS37S0500000_1 r9, java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS37S0500000_1.invoke$11(kotlin.jvm.internal.AwS37S0500000_1, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00df A[Catch: all -> 0x010c, TryCatch #0 {all -> 0x010c, blocks: (B:22:0x0065, B:24:0x006b, B:37:0x0085, B:38:0x0087, B:41:0x008f, B:43:0x0099, B:45:0x00a3, B:47:0x00ad, B:49:0x00b7, B:51:0x00bd, B:54:0x00ea, B:56:0x00ee, B:57:0x00f2, B:59:0x00f8, B:61:0x0107, B:52:0x00df, B:40:0x008d, B:30:0x0075, B:33:0x007a, B:35:0x0080, B:21:0x0063), top: B:84:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ea A[Catch: all -> 0x010c, TryCatch #0 {all -> 0x010c, blocks: (B:22:0x0065, B:24:0x006b, B:37:0x0085, B:38:0x0087, B:41:0x008f, B:43:0x0099, B:45:0x00a3, B:47:0x00ad, B:49:0x00b7, B:51:0x00bd, B:54:0x00ea, B:56:0x00ee, B:57:0x00f2, B:59:0x00f8, B:61:0x0107, B:52:0x00df, B:40:0x008d, B:30:0x0075, B:33:0x007a, B:35:0x0080, B:21:0x0063), top: B:84:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$12(kotlin.jvm.internal.AwS37S0500000_1 r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS37S0500000_1.invoke$12(kotlin.jvm.internal.AwS37S0500000_1, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$13(AwS37S0500000_1 awS37S0500000_1, Object obj) throws Throwable {
        int length;
        String str;
        boolean z;
        String strLJJIFFI;
        List list = (List) obj;
        String str2 = null;
        String strLIZIZ = C888803de.LIZIZ((ElementDTO) awS37S0500000_1.l0, (PaymentMethod) awS37S0500000_1.l1, list, null);
        Editable editableLLJILLL = C2204961BRm.LLJILLL(((C933403kq) awS37S0500000_1.l2).getEditText(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KwLk70s3LAv+ax35Zl7Ib+d7IIde9k7qJhFBRq0a6iy3wYm8d92+eT+1n04O9pKBAu916/Yg+o2sNG9r94=", null));
        if (editableLLJILLL != null) {
            length = editableLLJILLL.length();
        } else {
            length = 0;
        }
        CCDCCardNumberElementViewHolderV2 cCDCCardNumberElementViewHolderV2 = (CCDCCardNumberElementViewHolderV2) awS37S0500000_1.l3;
        int i = length - cCDCCardNumberElementViewHolderV2.LLILLJJLI;
        cCDCCardNumberElementViewHolderV2.L5();
        if (i > 0) {
            str = "add";
        } else if (i < 0) {
            str = "del";
        } else {
            str = "auto";
            if (!Intrinsics.LJFF("", "auto")) {
                str = "";
            }
        }
        C890103dr c890103dr = C890103dr.LIZ;
        String simpleName = ((CCDCCardNumberElementViewHolderV2) awS37S0500000_1.l3).getClass().getSimpleName();
        c890103dr.getClass();
        long jLIZ = C890103dr.LIZ(simpleName);
        boolean z2 = true;
        if (strLIZIZ == null) {
            z = true;
        } else {
            z = false;
        }
        C890103dr.LJIIJJI(jLIZ, Boolean.valueOf(z), "card_number", str);
        String strLJJIIZ = ((PaymentMethod) awS37S0500000_1.l1).LJJIIZ();
        if (strLIZIZ != null) {
            z2 = false;
        }
        String str3 = ((ElementDTO) awS37S0500000_1.l0).id;
        if (str3 != null) {
            strLJJIFFI = u.LJJIFFI(str3, "eg_ccdc_global_", "", false);
        } else {
            strLJJIFFI = null;
        }
        C904203g8 c904203g8KQ2 = ((CCDCCardNumberElementViewHolderV2) awS37S0500000_1.l3).L5().KQ2();
        PaymentElement paymentElement = (PaymentElement) C13LP.LJJJLL(list);
        if (paymentElement != null) {
            str2 = paymentElement.paramValue;
        }
        C890103dr.LJIIIZ(c904203g8KQ2.LIZJ(str2), strLJJIIZ, strLJJIFFI, str, z2);
        ((C889403dk) awS37S0500000_1.l4).LLILLJJLI.LIZJ = strLIZIZ;
        return strLIZIZ;
    }

    public static final Object invoke$14(AwS37S0500000_1 awS37S0500000_1, Object obj) throws Throwable {
        int length;
        String str;
        boolean z;
        boolean z2;
        Object next;
        String str2;
        Object next2;
        List list = (List) obj;
        Boolean boolValueOf = null;
        String str3 = null;
        boolValueOf = null;
        String strLIZIZ = C888803de.LIZIZ((ElementDTO) awS37S0500000_1.l0, (PaymentMethod) awS37S0500000_1.l1, list, null);
        Editable editableLLJILLL = C2204961BRm.LLJILLL(((C942603mK) awS37S0500000_1.l2).getEditText(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KwLk70s3LAv+ax35Zl7Ib+d7IIde9k7qJhFBRq0a6iy2AYg8NRv8et9l8NOdrpLc+jPSB/L8BY=", null));
        boolean z3 = false;
        if (editableLLJILLL != null) {
            length = editableLLJILLL.length();
        } else {
            length = 0;
        }
        CCDCDateElementViewHolderV2 cCDCDateElementViewHolderV2 = (CCDCDateElementViewHolderV2) awS37S0500000_1.l3;
        int i = length - cCDCDateElementViewHolderV2.LLILLJJLI;
        cCDCDateElementViewHolderV2.L5();
        if (i > 0) {
            str = "add";
        } else if (i < 0) {
            str = "del";
        } else {
            str = "";
            if (Intrinsics.LJFF("", "auto")) {
                str = "auto";
            }
        }
        C890103dr c890103dr = C890103dr.LIZ;
        String str4 = ((ElementDTO) awS37S0500000_1.l0).paramName;
        c890103dr.getClass();
        String strLJIIZILJ = C890103dr.LJIIZILJ(str4);
        long jLIZ = C890103dr.LIZ(((ElementDTO) awS37S0500000_1.l0).paramName);
        if (strLIZIZ == null) {
            z = true;
        } else {
            z = false;
        }
        C890103dr.LJIIJJI(jLIZ, Boolean.valueOf(z), strLJIIZILJ, str);
        String strLJJIIZ = ((PaymentMethod) awS37S0500000_1.l1).LJJIIZ();
        if (strLIZIZ == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        String strLJIIZILJ2 = C890103dr.LJIIZILJ(((ElementDTO) awS37S0500000_1.l0).paramName);
        C894003eU c894003eU = ((CCDCDateElementViewHolderV2) awS37S0500000_1.l3).L5().KQ2().LIZLLL;
        if (c894003eU != null && c894003eU.LIZIZ.LIZ()) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(((PaymentElement) next).element, "eg_ccdc_global_expiration_month")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            PaymentElement paymentElement = (PaymentElement) next;
            if (paymentElement != null) {
                str2 = paymentElement.paramValue;
            } else {
                str2 = null;
            }
            Iterator it3 = list.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next2 = it3.next();
                    if (Intrinsics.LJFF(((PaymentElement) next2).element, "eg_ccdc_global_expiration_year")) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            PaymentElement paymentElement2 = (PaymentElement) next2;
            if (paymentElement2 != null) {
                str3 = paymentElement2.paramValue;
            }
            if (Intrinsics.LJFF(c894003eU.LIZIZ.LIZ, str3) && Intrinsics.LJFF(c894003eU.LIZIZ.LIZIZ, str2)) {
                z3 = true;
            }
            boolValueOf = Boolean.valueOf(z3);
        }
        C890103dr.LJIIIZ(boolValueOf, strLJJIIZ, strLJIIZILJ2, str, z2);
        ((C889003dg) awS37S0500000_1.l4).LLILLJJLI.LIZJ = strLIZIZ;
        return strLIZIZ;
    }

    public static final Object invoke$15(AwS37S0500000_1 awS37S0500000_1, Object obj) {
        PaymentViewModel paymentViewModelW5 = ((PaymentMethodViewHolder) awS37S0500000_1.l0).W5();
        C1DFH c1dfh = C0PEM.LIZ;
        return C948503nH.LJFF(paymentViewModelW5, C2107308Nj.LIZ, new C03ZH((InterfaceC866403a2) awS37S0500000_1.l1, (h) awS37S0500000_1.l2, (PaymentState) obj, (C03ZA) awS37S0500000_1.l3, (PaymentMethodViewHolder) awS37S0500000_1.l0, (Function0) awS37S0500000_1.l4, null));
    }

    public static final Object invoke$2(AwS37S0500000_1 awS37S0500000_1, Object obj) {
        C03WH c03wh;
        PaymentElement next;
        PaymentElement next2;
        String strLJJIIZ;
        String strLJJI;
        String strLJJIIZ2;
        List<Object> paymentList = ((PaymentState) obj).getPaymentList();
        C894003eU c894003eU = (C894003eU) awS37S0500000_1.l1;
        PaymentViewModel paymentViewModel = (PaymentViewModel) awS37S0500000_1.l0;
        PaymentMethod paymentMethod = (PaymentMethod) awS37S0500000_1.l2;
        OcrStatus ocrStatus = (OcrStatus) awS37S0500000_1.l3;
        OcrStatus ocrStatus2 = (OcrStatus) awS37S0500000_1.l4;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(paymentList, 10));
        for (Object c869503aX : paymentList) {
            String strLJJIIZ3 = null;
            String str = "";
            if (c869503aX instanceof C866903a7) {
                C866903a7 c866903a7 = (C866903a7) c869503aX;
                PaymentElement paymentElementLIZ = c866903a7.LIZ.LIZ();
                paymentElementLIZ.setParamValue(c894003eU.LIZ);
                PaymentMethod paymentMethod2 = c866903a7.LIZIZ;
                String str2 = c866903a7.LIZ.id;
                if (str2 != null) {
                    str = str2;
                }
                paymentViewModel.UR2(paymentMethod2, str, Collections.singletonList(paymentElementLIZ));
                C03WH c03wh2 = paymentViewModel.LLJI;
                if (c03wh2 != null) {
                    if (paymentMethod != null) {
                        strLJJIIZ2 = paymentMethod.LJJIIZ();
                    } else {
                        strLJJIIZ2 = null;
                    }
                    c03wh2.LJIIJ(paymentViewModel.LLJ, C890903dz.LIZ(ocrStatus2.cardNumber), strLJJIIZ2, paymentElementLIZ.paramName, paymentViewModel.LLJIJIL, Intrinsics.LJFF(ocrStatus.cardNumber, "1"));
                }
                c869503aX = new C866903a7(c866903a7.LIZ, c866903a7.LIZIZ, C888803de.LIZIZ(c866903a7.LIZ, c866903a7.LIZIZ, Collections.singletonList(paymentElementLIZ), null), c866903a7.LIZLLL);
            } else if (c869503aX instanceof C869503aX) {
                C862703Yr c862703Yr = (C862703Yr) c869503aX;
                List<PaymentElement> listLIZIZ = c862703Yr.LIZ.LIZIZ();
                Iterator<PaymentElement> it2 = listLIZIZ.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.element, "eg_ccdc_global_expiration_month")) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                PaymentElement paymentElement = next;
                Iterator<PaymentElement> it3 = listLIZIZ.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (Intrinsics.LJFF(next2.element, "eg_ccdc_global_expiration_year")) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                PaymentElement paymentElement2 = next2;
                if (paymentElement != null) {
                    paymentElement.setParamValue(c894003eU.LIZIZ.LIZIZ);
                }
                if (paymentElement2 != null) {
                    paymentElement2.setParamValue(c894003eU.LIZIZ.LIZ);
                }
                PaymentMethod paymentMethod3 = c862703Yr.LIZIZ;
                String str3 = c862703Yr.LIZ.id;
                if (str3 != null) {
                    str = str3;
                }
                paymentViewModel.UR2(paymentMethod3, str, C13LQ.LJIJI(new PaymentElement[]{paymentElement, paymentElement2}));
                C03WH c03wh3 = paymentViewModel.LLJI;
                if (c03wh3 != null) {
                    if (paymentMethod != null) {
                        strLJJIIZ = paymentMethod.LJJIIZ();
                    } else {
                        strLJJIIZ = null;
                    }
                    boolean zLJFF = Intrinsics.LJFF(ocrStatus.date, "1");
                    if (paymentViewModel.LLJI != null) {
                        strLJJI = C03WH.LJJI(c862703Yr.LIZ.paramName);
                    } else {
                        strLJJI = null;
                    }
                    c03wh3.LJIIJ(paymentViewModel.LLJ, C890903dz.LIZ(ocrStatus2.date), strLJJIIZ, strLJJI, paymentViewModel.LLJIJIL, zLJFF);
                }
                c869503aX = new C869503aX(c862703Yr.LIZ, c862703Yr.LIZIZ, C888803de.LIZIZ(c862703Yr.LIZ, c862703Yr.LIZIZ, C13LQ.LJIJI(new PaymentElement[]{paymentElement, paymentElement2}), null));
            } else if (c869503aX instanceof C869603aY) {
                ElementDTO elementDTO = ((C862703Yr) c869503aX).LIZ;
                if (Intrinsics.LJFF(elementDTO.id, "eg_ccdc_global_holder_name") && (c03wh = paymentViewModel.LLJI) != null) {
                    if (paymentMethod != null) {
                        strLJJIIZ3 = paymentMethod.LJJIIZ();
                    }
                    c03wh.LJIIJ(paymentViewModel.LLJ, C890903dz.LIZ(ocrStatus2.holder), strLJJIIZ3, elementDTO.paramName, paymentViewModel.LLJIJIL, Intrinsics.LJFF(ocrStatus.holder, "1"));
                }
            }
            arrayList.add(c869503aX);
        }
        ((PaymentViewModel) awS37S0500000_1.l0).setState(new AwS580S0100000_1(arrayList, (List<InterfaceC746802vq>) 183));
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, X.0956] */
    public static final Object invoke$3(AwS37S0500000_1 awS37S0500000_1, Object obj) {
        C197039127h c197039127h = (C197039127h) obj;
        c197039127h.setLoading(true);
        c197039127h.setEnabled(false);
        C259800zU c259800zU = (C259800zU) awS37S0500000_1.l0;
        C1DFH c1dfh = C0PEM.LIZ;
        c259800zU.element = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C03LE((Function1) awS37S0500000_1.l1, (CommonRetainDisplayInfo) awS37S0500000_1.l2, (C19EG) awS37S0500000_1.l3, c197039127h, (Function0) awS37S0500000_1.l4, null), 3);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x016e A[PHI: r6
      0x016e: PHI (r6v3 java.lang.String) = (r6v0 java.lang.String), (r6v4 java.lang.String) binds: [B:19:0x0039, B:17:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AwS37S0500000_1 r53, java.lang.Object r54) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS37S0500000_1.invoke$4(kotlin.jvm.internal.AwS37S0500000_1, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$5(AwS37S0500000_1 awS37S0500000_1, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LIZJ(2, ((Context) awS37S0500000_1.l0).getString(2131833171), new AwS210S0300000_1((C877303bn) awS37S0500000_1.l1, (C877303bn) awS37S0500000_1.l2, (PaymentPopUpInfo) awS37S0500000_1.l3, (Function0<Unit>) 43));
        c1397620mTQ.LIZJ(1, ((Context) awS37S0500000_1.l0).getString(2131833170), new AwS210S0300000_1((C877303bn) awS37S0500000_1.l1, (C877303bn) awS37S0500000_1.l2, (PaymentPopUpInfo) awS37S0500000_1.l4, (Function0<Unit>) 44));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS37S0500000_1 awS37S0500000_1, Object obj) {
        C834300Wo8 c834300Wo8 = (C834300Wo8) obj;
        int i = C03Y3.LIZ[c834300Wo8.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                ((Function1) awS37S0500000_1.l1).invoke(new C860903Xz(C03Y2.PAY_ERROR, 14));
                ((Function0) awS37S0500000_1.l4).invoke();
            }
        } else {
            C03Y0 c03y0 = C03Y0.LIZ;
            PaymentMethodInfo paymentMethodInfo = (PaymentMethodInfo) awS37S0500000_1.l0;
            String str = paymentMethodInfo.id;
            String str2 = paymentMethodInfo.token;
            c03y0.getClass();
            PaymentMethodInfo paymentMethodInfoLIZLLL = C03Y0.LIZLLL(c834300Wo8, str, str2);
            ((Function1) awS37S0500000_1.l1).invoke(new C860903Xz(C03Y2.SUCCESS, paymentMethodInfoLIZLLL, (PaymentMethod) awS37S0500000_1.l2, (PaymentInfo) awS37S0500000_1.l3));
            ((Function0) awS37S0500000_1.l4).invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS37S0500000_1 awS37S0500000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054104Ah) awS37S0500000_1.l0).LIZIZ);
        laneParams.compareTo(laneParams, (Map) awS37S0500000_1.l1);
        Map<String, ? extends Object> map = (Map) awS37S0500000_1.l2;
        if (map != null) {
            laneParams.compareTo(laneParams, map);
        }
        Map<String, ? extends Object> map2 = (Map) awS37S0500000_1.l3;
        if (map2 != null) {
            laneParams.compareTo(laneParams, map2);
        }
        Map<String, ? extends Object> map3 = (Map) awS37S0500000_1.l4;
        if (map3 != null) {
            laneParams.compareTo(laneParams, map3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS37S0500000_1 awS37S0500000_1, Object obj) {
        C1397630mTR c1397630mTR = (C1397630mTR) obj;
        String str = "";
        if (C13LP.LJJJLL((List) awS37S0500000_1.l0) != null) {
            String str2 = ((DialogButton) C13LP.LJJJJZI((List) awS37S0500000_1.l0)).text;
            if (str2 == null) {
                str2 = "";
            }
            c1397630mTR.LIZJ(0, str2, new C039K(((C1397580mTM) awS37S0500000_1.l1).LIZ, ((DialogButton) C13LP.LJJJJZI((List) awS37S0500000_1.l0)).buttonAction, (Function0) awS37S0500000_1.l2, (Function1) awS37S0500000_1.l3, (Function1) awS37S0500000_1.l4));
        }
        if (C13LP.LJJJLZIJ(1, (List) awS37S0500000_1.l0) != null) {
            String str3 = ((DialogButton) ListProtector.get((List) awS37S0500000_1.l0, 1)).text;
            if (str3 != null) {
                str = str3;
            }
            c1397630mTR.LIZJ(1, str, new C039K(((C1397580mTM) awS37S0500000_1.l1).LIZ, ((DialogButton) ListProtector.get((List) awS37S0500000_1.l0, 1)).buttonAction, (Function0) awS37S0500000_1.l2, (Function1) awS37S0500000_1.l3, (Function1) awS37S0500000_1.l4));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS37S0500000_1 awS37S0500000_1, Object obj) {
        C1063304Dv c1063304DvLIZ;
        SeaPdpMainState seaPdpMainState = (SeaPdpMainState) obj;
        List<Object> listCR2 = ((SeaPdpViewModel) awS37S0500000_1.l0).CR2((ProductPackStruct) awS37S0500000_1.l1, false, false, false, false, false, false);
        ProductPackStruct productPackStruct = (ProductPackStruct) awS37S0500000_1.l1;
        if (productPackStruct != null) {
            Integer num = ((C10380044c) awS37S0500000_1.l2).LIZIZ;
            C10380044c c10380044c = (C10380044c) awS37S0500000_1.l3;
            c1063304DvLIZ = C10465047j.LIZ(productPackStruct, num, null, null, c10380044c.LJIIIIZZ, c10380044c.LJIILLIIL, c10380044c.LJIIZILJ, true);
        } else {
            c1063304DvLIZ = null;
        }
        return seaPdpMainState.copy(seaPdpMainState.isFullScreen, c1063304DvLIZ, ((SeaPdpViewModel) awS37S0500000_1.l0).BR2(((SkuItem) awS37S0500000_1.l4).skuId, "fetch_sku_info", true), seaPdpMainState.tabs, seaPdpMainState.dismiss, seaPdpMainState.sheetState, listCR2, seaPdpMainState.bottomSheetSlideOffset, seaPdpMainState.creatorSheetVO, seaPdpMainState.scrollOrientation, seaPdpMainState.creatorSheetSlideOffset, seaPdpMainState.scrollOffset, seaPdpMainState.seaFocusTabAction, seaPdpMainState.seaFocusTabActionNew, seaPdpMainState.selectedTabName, seaPdpMainState.loadingStatus, seaPdpMainState.flashSaleState, seaPdpMainState.flashSaleCountDown, seaPdpMainState.cartTip, seaPdpMainState.cartEntry, seaPdpMainState.bodyContent, seaPdpMainState.shareInfo, seaPdpMainState.showLoadingDialog, seaPdpMainState.blockInfo, seaPdpMainState.showFloatShop, seaPdpMainState.bizEnvChange, seaPdpMainState.slideToPaymentModule, seaPdpMainState.lynxAirItemName, seaPdpMainState.exceptionUX, seaPdpMainState.lynxPopupState, seaPdpMainState.bottomFloatingState, seaPdpMainState.seaEntranceBubble, seaPdpMainState.bottomMynaBannerState, seaPdpMainState.mediaWindow);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS37S0500000_1(X.C933403kq r3, X.C889403dk r4, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder.CCDCCardNumberElementViewHolderV2 r5, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r6, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r7, int r8) {
        /*
            r2 = this;
            r2.$t = r8
            switch(r8) {
                case 11: goto L15;
                case 12: goto L22;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r6
            r1.l1 = r7
            r1.l2 = r3
            r1.l3 = r5
            r1.l4 = r4
            r0 = 1
        L11:
            r1.<init>(r0)
            return
        L15:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r1.l2 = r5
            r1.l3 = r7
            r1.l4 = r6
            r0 = 1
            goto L11
        L22:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r4
            r1.l2 = r7
            r1.l3 = r6
            r1.l4 = r3
            r0 = 1
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS37S0500000_1.<init>(X.03kq, X.03dk, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder.CCDCCardNumberElementViewHolderV2, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS37S0500000_1(C259800zU c259800zU, C901403fg c901403fg, CommonRetainDisplayInfo commonRetainDisplayInfo, C19EG c19eg, AwS402S0200000_1 awS402S0200000_1, int i) {
        super(1);
        this.$t = i;
        this.l0 = c259800zU;
        this.l1 = c901403fg;
        this.l2 = commonRetainDisplayInfo;
        this.l3 = c19eg;
        this.l4 = awS402S0200000_1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS37S0500000_1(C1054104Ah c1054104Ah, C1054104Ah c1054104Ah2, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3, Map<String, ? extends Object> map4) {
        super(1);
        this.$t = map4;
        this.l0 = c1054104Ah;
        this.l1 = c1054104Ah2;
        this.l2 = map;
        this.l3 = map2;
        this.l4 = map3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS37S0500000_1(Context context, C877303bn c877303bn, PaymentPopUpInfo paymentPopUpInfo, AwS121S0110000_1 awS121S0110000_1, AwS545S0100000_1 awS545S0100000_1, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = c877303bn;
        this.l2 = paymentPopUpInfo;
        this.l3 = awS121S0110000_1;
        this.l4 = awS545S0100000_1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS37S0500000_1(Context context, View view, OspAddressViewModel ospAddressViewModel, CpfEnterParams cpfEnterParams, AwS367S0200000_1 awS367S0200000_1, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = view;
        this.l2 = ospAddressViewModel;
        this.l3 = cpfEnterParams;
        this.l4 = awS367S0200000_1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS37S0500000_1(PaymentViewModel paymentViewModel, C894003eU c894003eU, PaymentMethod paymentMethod, OcrStatus ocrStatus, OcrStatus ocrStatus2, int i) {
        super(1);
        this.$t = i;
        this.l0 = paymentViewModel;
        this.l1 = c894003eU;
        this.l2 = paymentMethod;
        this.l3 = ocrStatus;
        this.l4 = ocrStatus2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS37S0500000_1(CCDCNormalElementViewHolderV2 cCDCNormalElementViewHolderV2, PaymentMethod paymentMethod, ElementDTO elementDTO, C943103mP c943103mP, C889203di c889203di, int i) {
        super(1);
        this.$t = i;
        this.l0 = cCDCNormalElementViewHolderV2;
        this.l1 = paymentMethod;
        this.l2 = elementDTO;
        this.l3 = c943103mP;
        this.l4 = c889203di;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS37S0500000_1(ElementDTO elementDTO, PaymentMethod paymentMethod, C942603mK c942603mK, CCDCDateElementViewHolderV2 cCDCDateElementViewHolderV2, C889003dg c889003dg, int i) {
        super(1);
        this.$t = i;
        this.l0 = elementDTO;
        this.l1 = paymentMethod;
        this.l2 = c942603mK;
        this.l3 = cCDCDateElementViewHolderV2;
        this.l4 = c889003dg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS37S0500000_1(PaymentMethodInfo paymentMethodInfo, AwS367S0200000_1 awS367S0200000_1, PaymentMethod paymentMethod, PaymentInfo paymentInfo, Function0 function0, int i) {
        super(1);
        this.$t = i;
        this.l0 = paymentMethodInfo;
        this.l1 = awS367S0200000_1;
        this.l2 = paymentMethod;
        this.l3 = paymentInfo;
        this.l4 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS37S0500000_1(PaymentMethodViewHolder paymentMethodViewHolder, C883303cl c883303cl, h hVar, C03ZA c03za, Function0 function0, int i) {
        super(1);
        this.$t = i;
        this.l0 = paymentMethodViewHolder;
        this.l1 = c883303cl;
        this.l2 = hVar;
        this.l3 = c03za;
        this.l4 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS37S0500000_1(ProductPrice productPrice, ProductPrice productPrice2, SkuPanelState skuPanelState, C044Z<VM> c044z, PdpPaymentModule pdpPaymentModule, CutPriceSKUPanel cutPriceSKUPanel) {
        super(1);
        this.$t = cutPriceSKUPanel;
        this.l0 = productPrice;
        this.l1 = productPrice2;
        this.l2 = skuPanelState;
        this.l3 = c044z;
        this.l4 = pdpPaymentModule;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS37S0500000_1(SeaPdpViewModel seaPdpViewModel, ProductPackStruct productPackStruct, C10380044c c10380044c, C10380044c c10380044c2, SkuItem skuItem, int i) {
        super(1);
        this.$t = i;
        this.l0 = seaPdpViewModel;
        this.l1 = productPackStruct;
        this.l2 = c10380044c;
        this.l3 = c10380044c2;
        this.l4 = skuItem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS37S0500000_1(List list, List<Balance> list2, C013C c013c, C259800zU<List<Object>> c259800zU, PaymentViewModel paymentViewModel, EnterParams enterParams) {
        super(1);
        this.$t = enterParams;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = c013c;
        this.l3 = c259800zU;
        this.l4 = paymentViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS37S0500000_1(List list, C1397580mTM c1397580mTM, Function0 function0, AwS580S0100000_1 awS580S0100000_1, Function1 function1, int i) {
        super(1);
        this.$t = i;
        this.l0 = list;
        this.l1 = c1397580mTM;
        this.l2 = function0;
        this.l3 = awS580S0100000_1;
        this.l4 = function1;
    }
}
