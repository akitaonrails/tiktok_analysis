package com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem;

import X.C03QL;
import X.C03WH;
import X.C03Z8;
import X.C0H1U;
import X.C12ES;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C1744700vVE;
import X.C1939607ik;
import X.C20642515q3;
import X.C2217381BqS;
import X.C679280Qkg;
import X.C703302op;
import X.C704502p1;
import X.C770702zh;
import X.C7767031p;
import X.C786410Ut5;
import X.C874503bL;
import X.C884903d1;
import X.C885003d2;
import X.C885203d4;
import X.C885403d6;
import X.C903403g0;
import X.C943103mP;
import X.C943903mX;
import X.C958503ot;
import X.EnumC903503g1;
import X.InterfaceC1334290kpH;
import X.InterfaceC884803d0;
import X.InterfaceC885103d3;
import X.InterfaceC885803dA;
import android.content.Context;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.oneclickpay.CombinationPaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.oneclickpay.OneClickPayContext;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState;
import com.zhiliaoapp.musically.R;
import g1c.AjS20S0300000_1;
import g1c.AjS40S0200000_1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS210S0300000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuPaymentMethodReusedAssem extends SkuPanelBaseReusedAssem<SkuPaymentMethodReusedAssem, C704502p1> implements InterfaceC885103d3 {
    public boolean LLJLIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuPanelBaseReusedAssem
    public final void Ap() {
        on(null);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b3e;
    }

    @Override // X.InterfaceC885103d3, X.InterfaceC885803dA
    public final C874503bL LLLIIL() {
        return new C874503bL(this);
    }

    @Override // X.InterfaceC885803dA
    public final C885403d6 wf() {
        return new C885403d6(this);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuPanelBaseReusedAssem
    public final void zp() {
        getViewModel().s60(new C2217381BqS() { // from class: X.03d8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getTotalPrice();
            }
        }, new AwS580S0100000_1((InterfaceC885103d3) this, 558));
        C03QL c03ql = getViewModel().LLJJJJ;
        if (c03ql == null || !c03ql.LJIIL()) {
            return;
        }
        getViewModel().TQ2(new C2217381BqS() { // from class: X.03d7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getPaymentInfo();
            }
        }, new C2217381BqS() { // from class: X.03dB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getRefreshFlag();
            }
        }, new AwS615S0100000_1(this, 161));
        getViewModel().s60(new C2217381BqS() { // from class: X.03dC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getHidePaymentMethodView();
            }
        }, new AwS580S0100000_1((InterfaceC885103d3) this, 560));
    }

    public final void Up(View view) {
        C0H1U.LIZIZ(view.findViewById(R.id.q5_));
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.q5b);
        C12ES.LJIILL(0, tuxTextView);
        tuxTextView.setText(tuxTextView.getContext().getString(2131832760));
        tuxTextView.setTextColorRes(R.attr.a1h);
        C12ES.LJIILL(0, view.findViewById(R.id.q4r));
        C0H1U.LIZIZ(view.findViewById(R.id.q4s));
        C12ES.LJIILL(0, view.findViewById(R.id.q4u));
        C0H1U.LIZIZ(view.findViewById(R.id.q53));
        C0H1U.LIZIZ(view.findViewById(R.id.q54));
        C0H1U.LIZIZ(view.findViewById(R.id.q5g));
        C0H1U.LIZIZ(view.findViewById(R.id.zl6));
        C786410Ut5.I7(new AjS40S0200000_1(this, view, 66), view);
    }

    @Override // X.InterfaceC885103d3
    public final void on(PaymentInfo paymentInfo) {
        C03QL c03ql;
        OneClickPayContext oneClickPayContext;
        boolean z;
        String str;
        boolean z2;
        PaymentMethodsData paymentMethodsData;
        C03QL c03ql2;
        Map<String, ? extends Object> map;
        boolean z3;
        String str2;
        boolean z4;
        String str3;
        Boolean boolValueOf;
        BillInfoData billInfoData;
        PaymentMethodsData paymentMethodsData2;
        List<PaymentMethod> list;
        BillInfoData billInfoData2;
        View contentView = getContentView();
        if (contentView != null && (c03ql = getViewModel().LLJJJJ) != null && (oneClickPayContext = c03ql.LLILLL) != null) {
            C03QL c03ql3 = getViewModel().LLJJJJ;
            boolean z5 = true;
            if (c03ql3 != null && c03ql3.LJIIL()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C03QL c03ql4 = getViewModel().LLJJJJ;
                if (c03ql4 != null && c03ql4.LLJJJJLIIL != null) {
                    C885003d2.LIZ(contentView, true);
                    C786410Ut5.LL(8, (ConstraintLayout) contentView.findViewById(R.id.mdh));
                    C786410Ut5.LLIZLLLIL((RecyclerView) contentView.findViewById(R.id.tue), 8);
                    C786410Ut5.LL(0, (ConstraintLayout) contentView.findViewById(R.id.q5q));
                    if (paymentInfo != null && paymentInfo.LIZLLL()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        LinearLayout linearLayout = (LinearLayout) contentView.findViewById(R.id.q5d);
                        C786410Ut5.LJJJJJL(linearLayout);
                        View viewTd = C786410Ut5.Td(C786410Ut5.ne(contentView.getContext()), R.layout.ale, linearLayout, false);
                        Up(viewTd);
                        linearLayout.addView(viewTd);
                        return;
                    }
                    TextView textView = (TextView) contentView.findViewById(R.id.q5f);
                    C03QL c03ql5 = getViewModel().LLJJJJ;
                    if (c03ql5 != null && (billInfoData2 = c03ql5.LLJJJJLIIL) != null) {
                        paymentMethodsData = billInfoData2.paymentMethods;
                    } else {
                        paymentMethodsData = null;
                    }
                    if (Vp(paymentInfo, paymentMethodsData)) {
                        textView.setText(contentView.getContext().getString(2131828605));
                        C12ES.LJIILL(0, textView);
                    } else {
                        C0H1U.LIZIZ(textView);
                    }
                    LinearLayout linearLayout2 = (LinearLayout) contentView.findViewById(R.id.q5d);
                    C786410Ut5.LJJJJJL(linearLayout2);
                    View viewTd2 = C786410Ut5.Td(C786410Ut5.ne(contentView.getContext()), R.layout.ale, linearLayout2, false);
                    Tp(viewTd2, paymentInfo.paymentMethod, null, true, Fp(null, paymentInfo), Ep(null, paymentInfo), Ip(null, paymentInfo), Gp(null, paymentInfo), Jp(paymentInfo.paymentMethod, false), paymentInfo);
                    linearLayout2.addView(viewTd2);
                    C786410Ut5.I7(new AjS20S0300000_1(this, linearLayout2, paymentInfo, 32), linearLayout2);
                    if (this.LLJLIL) {
                        return;
                    }
                    this.LLJLIL = true;
                    PaymentMethod paymentMethod = paymentInfo.paymentMethod;
                    if (paymentMethod == null || (c03ql2 = getViewModel().LLJJJJ) == null) {
                        return;
                    }
                    SkuPanelStarter.SkuEnterParams skuEnterParams = getViewModel().LLJI;
                    if (skuEnterParams != null) {
                        map = skuEnterParams.trackParams;
                    } else {
                        map = null;
                    }
                    C03WH c03whLIZLLL = c03ql2.LIZLLL(map);
                    if (c03whLIZLLL == null) {
                        return;
                    }
                    boolean zLIZIZ = C770702zh.LIZIZ(paymentMethod.extraInfo);
                    C03QL c03ql6 = getViewModel().LLJJJJ;
                    if (c03ql6 != null && (billInfoData = c03ql6.LLJJJJLIIL) != null && (paymentMethodsData2 = billInfoData.paymentMethods) != null && (list = paymentMethodsData2.storedMethods) != null) {
                        Iterator<PaymentMethod> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            PaymentMethod next = it2.next();
                            if (Intrinsics.LJFF(next.id, paymentMethod.id)) {
                                if (next != null) {
                                    z3 = true;
                                }
                            }
                        }
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    boolean zLIZIZ2 = C770702zh.LIZIZ(paymentMethod.balance);
                    Availability availability = paymentMethod.availability;
                    if (availability != null) {
                        str2 = availability.unavailableCode;
                        str3 = availability.statusCode;
                        z4 = false;
                    } else {
                        str2 = null;
                        z4 = false;
                        str3 = null;
                    }
                    Boolean boolValueOf2 = Boolean.valueOf(C770702zh.LIZIZ(paymentMethod.LJIJJ(z4)));
                    if (paymentMethod.missingElements != null) {
                        boolValueOf = Boolean.valueOf(paymentMethod.LJJIFFI());
                    } else {
                        boolValueOf = null;
                    }
                    c03whLIZLLL.LJIILL(paymentMethod, 0, zLIZIZ, z3, zLIZIZ2, true, str2, str3, boolValueOf2, boolValueOf, null, null, paymentMethod.LJJIJ());
                    return;
                }
                C885003d2.LIZ(contentView, false);
                return;
            }
            List<CombinationPaymentMethodInfo> list2 = oneClickPayContext.combinationPaymentList;
            if (list2 != null && !list2.isEmpty()) {
                C786410Ut5.LLIZLLLIL((RecyclerView) contentView.findViewById(R.id.tue), 0);
                C786410Ut5.LL(8, (ConstraintLayout) contentView.findViewById(R.id.mdh));
                C786410Ut5.LL(8, (ConstraintLayout) contentView.findViewById(R.id.q5q));
                String str4 = oneClickPayContext.combinationPaymentDes;
                if (str4 != null && str4.length() != 0) {
                    z5 = false;
                }
                if (z5) {
                    C786410Ut5.LLLLZLL((TuxTextView) contentView.findViewById(R.id.z4q), 8);
                } else {
                    C786410Ut5.LLLLZLL((TuxTextView) contentView.findViewById(R.id.z4q), 0);
                    ((TextView) contentView.findViewById(R.id.z4q)).setText(oneClickPayContext.combinationPaymentDes);
                }
                C885203d4 c885203d4 = new C885203d4(contentView.getContext());
                List<CombinationPaymentMethodInfo> list3 = oneClickPayContext.combinationPaymentList;
                ((ArrayList) c885203d4.LLILLJJLI).clear();
                ((ArrayList) c885203d4.LLILLJJLI).addAll(list3);
                c885203d4.notifyDataSetChanged();
                ((RecyclerView) contentView.findViewById(R.id.tue)).setAdapter(c885203d4);
                ((RecyclerView) contentView.findViewById(R.id.tue)).setLayoutManager(new LinearLayoutManager(contentView.getContext()));
                return;
            }
            C786410Ut5.LL(0, (ConstraintLayout) contentView.findViewById(R.id.mdh));
            C786410Ut5.LLIZLLLIL((RecyclerView) contentView.findViewById(R.id.tue), 8);
            C786410Ut5.LL(8, (ConstraintLayout) contentView.findViewById(R.id.q5q));
            if (C1744700vVE.LJ(contentView.getContext(), null)) {
                str = oneClickPayContext.paymentCardUrlDark;
            } else {
                str = oneClickPayContext.paymentCardUrl;
            }
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str);
            c1331670kl3LIZLLL.LJJ((InterfaceC1334290kpH) contentView.findViewById(R.id.l6y));
            C786410Ut5.h3(c1331670kl3LIZLLL);
            SmartImageView smartImageView = (SmartImageView) contentView.findViewById(R.id.l6y);
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LJ = C679280Qkg.LIZ(2);
            smartImageView.setCircleOptions(new C1331730kl9(c1331750klB));
            String str5 = oneClickPayContext.paymentCardNum;
            if (str5 != null && str5.length() != 0) {
                z5 = false;
            }
            if (!z5) {
                ((TextView) contentView.findViewById(R.id.z5_)).setText(u.LJJIFFI(C20642515q3.LJI(2131832781), "{####}", oneClickPayContext.paymentCardNum, false));
            } else {
                ((TextView) contentView.findViewById(R.id.z5_)).setText(oneClickPayContext.paymentMethodText);
            }
        }
    }

    @Override // X.InterfaceC869803aa
    public final InstallmentPlan xe(PaymentInfo paymentInfo) {
        return C03Z8.LIZ(paymentInfo);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String Bp(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r7, boolean r8) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuPaymentMethodReusedAssem.Bp(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, boolean):java.lang.String");
    }

    public final String Ep(InstallmentPlan installmentPlan, PaymentInfo paymentInfo) {
        return C03Z8.LIZIZ(this, paymentInfo, installmentPlan);
    }

    public final String Fp(InstallmentPlan installmentPlan, PaymentInfo paymentInfo) {
        return C03Z8.LIZLLL(this, paymentInfo, installmentPlan);
    }

    public final String Gp(InstallmentPlan installmentPlan, PaymentInfo paymentInfo) {
        return C03Z8.LJ(this, paymentInfo, installmentPlan);
    }

    public final String Ip(InstallmentPlan installmentPlan, PaymentInfo paymentInfo) {
        return C03Z8.LJFF(this, paymentInfo, installmentPlan);
    }

    public final String Jp(PaymentMethod paymentMethod, boolean z) {
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("pipo_express_checkout_enable_osp_promotion", true) && paymentMethod != null) {
            String strBp = Bp(paymentMethod, z);
            String strLJJII = paymentMethod.LJJII();
            if (strBp == null) {
                strBp = strLJJII;
                if (strLJJII == null) {
                    return null;
                }
            }
            if (strBp.length() > 0) {
                return strBp;
            }
            return null;
        }
        return null;
    }

    public final boolean Vp(PaymentInfo paymentInfo, PaymentMethodsData paymentMethodsData) {
        PaymentMethod paymentMethod;
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("pipo_express_checkout_enable_osp_promotion", true)) {
            PaymentMethod paymentMethod2 = null;
            if (paymentInfo != null) {
                paymentMethod = paymentInfo.LIZ;
            } else {
                paymentMethod = null;
            }
            String strJp = Jp(paymentMethod, false);
            if (paymentInfo != null) {
                paymentMethod2 = paymentInfo.paymentMethod;
            }
            String strJp2 = Jp(paymentMethod2, false);
            if (!C703302op.LIZ(strJp) && !C703302op.LIZ(strJp2)) {
                ArrayList arrayList = new ArrayList();
                if (paymentMethodsData != null) {
                    PaymentMethod paymentMethodLJIIIZ = paymentMethodsData.LJIIIZ();
                    if (paymentMethodLJIIIZ != null) {
                        arrayList.add(paymentMethodLJIIIZ);
                        C7767031p c7767031p = paymentMethodLJIIIZ.LJFF;
                        if (c7767031p != null) {
                            List<PaymentMethod> list = c7767031p.LJFF;
                            if (list != null) {
                                arrayList.addAll(list);
                            }
                            List<PaymentMethod> list2 = c7767031p.LJI;
                            if (list2 != null) {
                                arrayList.addAll(list2);
                            }
                        }
                    }
                    List<PaymentMethod> list3 = paymentMethodsData.storedMethods;
                    if (list3 != null) {
                        arrayList.addAll(list3);
                    }
                    List<PaymentMethod> list4 = paymentMethodsData.paymentMethods;
                    if (list4 != null) {
                        arrayList.addAll(list4);
                    }
                }
                Iterator<Object> it2 = new C1939607ik(arrayList).iterator();
                while (it2.hasNext()) {
                    String strJp3 = Jp((PaymentMethod) it2.next(), true);
                    if (strJp3 != null && C703302op.LIZ(strJp3)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void Qp(C884903d1 c884903d1, PaymentInfo paymentInfo, ElementDTO elementDTO) {
        C943103mP c943103mP;
        List<PaymentElement> list;
        C958503ot c958503ot;
        EditText editText;
        C943103mP c943103mP2;
        if (paymentInfo != null) {
            C12ES.LJIILL(0, c884903d1);
            c884903d1.setOnPaymentInfoChangeListener(new AwS580S0100000_1((InterfaceC885803dA) this, 742));
            c884903d1.setLogVerify(new AwS580S0100000_1(this, elementDTO, 743));
            C958503ot element = c884903d1.getElement();
            if ((element instanceof C943103mP) && (c943103mP2 = (C943103mP) element) != null) {
                c943103mP2.setOnFocusChange(new AwS580S0100000_1(this, elementDTO, 744));
            }
            c884903d1.LL = elementDTO;
            c884903d1.LLILLJJLI = paymentInfo;
            PaymentMethod paymentMethod = paymentInfo.paymentMethod;
            if (paymentMethod != null) {
                C903403g0 c903403g0 = InterfaceC884803d0.LJIL;
                Context context = c884903d1.getContext();
                c903403g0.getClass();
                Integer num = elementDTO.styleType;
                int iOrdinal = EnumC903503g1.Normal.ordinal();
                if (num != null && num.intValue() == iOrdinal) {
                    c943103mP = new C943103mP(context);
                } else {
                    c943103mP = null;
                }
                c884903d1.LLILLL = c943103mP;
                if (c943103mP != null) {
                    c943103mP.setSizeVariantForInputBox(3);
                }
                C958503ot c958503ot2 = c884903d1.LLILLL;
                if (c958503ot2 != null) {
                    c958503ot2.setNoTitle(true);
                }
                C958503ot c958503ot3 = c884903d1.LLILLL;
                if (c958503ot3 != null) {
                    c958503ot3.setInlineNotification(true);
                }
                if (Intrinsics.LJFF(elementDTO.id, "eg_ccdc_global_cvv") && (c958503ot = c884903d1.LLILLL) != null && (editText = c958503ot.getEditText()) != null) {
                    editText.setInputType(2);
                    C943903mX.LIZ(editText, 4);
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(c884903d1, null);
                c884903d1.removeAllViews();
                C958503ot c958503ot4 = c884903d1.LLILLL;
                if ((c958503ot4 instanceof View) && c958503ot4 != null) {
                    c884903d1.addView(c958503ot4);
                }
                List<ElementDTO> listLIZJ = elementDTO.LIZJ();
                ArrayList arrayList = new ArrayList();
                for (ElementDTO elementDTO2 : listLIZJ) {
                    PaymentMethodInfo paymentMethodInfo = paymentInfo.paymentMethodInfo;
                    if (paymentMethodInfo != null && (list = paymentMethodInfo.paymentElements) != null) {
                        Iterator<PaymentElement> it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                PaymentElement next = it2.next();
                                if (Intrinsics.LJFF(next.element, elementDTO2.id)) {
                                    if (next != null) {
                                        arrayList.add(next);
                                    }
                                }
                            }
                        }
                    }
                }
                C958503ot c958503ot5 = c884903d1.LLILLL;
                if (c958503ot5 != null) {
                    c958503ot5.LIZLLL(elementDTO, arrayList, null);
                    c958503ot5.setOnVerify(new AwS210S0300000_1(elementDTO, paymentMethod, c884903d1, 81));
                    return;
                }
                return;
            }
            return;
        }
        C0H1U.LIZIZ(c884903d1);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Tp(android.view.View r13, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r14, java.lang.String r15, boolean r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r22) {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuPaymentMethodReusedAssem.Tp(android.view.View, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo):void");
    }
}
