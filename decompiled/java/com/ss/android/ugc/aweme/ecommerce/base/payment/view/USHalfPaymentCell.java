package com.ss.android.ugc.aweme.ecommerce.base.payment.view;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03C8;
import X.C03IJ;
import X.C03K6;
import X.C03O0;
import X.C03PI;
import X.C03S8;
import X.C03SE;
import X.C03XA;
import X.C03Z8;
import X.C0H1U;
import X.C12ES;
import X.C1308910kAL;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C13LE;
import X.C13LP;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452080Ho6;
import X.C452501pT;
import X.C703302op;
import X.C737910Sx3;
import X.C7768031q;
import X.C786410Ut5;
import X.C814420VxA;
import X.C928203k0;
import X.C960203pA;
import X.InterfaceC1334290kpH;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC869803aa;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentTip;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.module.ModuleManager;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.zhiliaoapp.musically.R;
import g1c.AjS20S0300000_1;
import g1c.AjS40S0200000_1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes2.dex */
public final class USHalfPaymentCell extends ECPowerCell<C7768031q> implements InterfaceC869803aa {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AssemVMLazy LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(USHalfPaymentCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public USHalfPaymentCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 1302);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(323);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 1312), awS545S0100000_1, AFwS207S0000000_19.get$arr$(228), new AwS545S0100000_1((C03K6) this, 1294), new AwS545S0100000_1((C03K6) this, 1296), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1298), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1362), null, new AwS545S0100000_1((C03K6) this, 1300));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS545S0100000_1 awS545S0100000_12 = new AwS545S0100000_1((C03K6) this, 1295);
            AwS545S0100000_1 awS545S0100000_13 = new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1297);
            AwS545S0100000_1 awS545S0100000_14 = new AwS545S0100000_1(c19719912DlLIZ, 1299);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS545S0100000_12, 85));
            AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c01gwLIZIZ, 1363);
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c01gwLIZIZ, 1364);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c01gwLIZIZ, 1365);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c01gwLIZIZ, 1366);
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 1367);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS545S0100000_14, awS545S0100000_1, new C452080Ho6(), awS563S0100000_19, awS563S0100000_192, awS545S0100000_13, aFwS228S0000000_1, awS563S0100000_193, awS563S0100000_194, awS563S0100000_195);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 1301), awS545S0100000_1, AFwS207S0000000_19.get$arr$(229), new AwS545S0100000_1((C03K6) this, 1303), new AwS545S0100000_1((C03K6) this, 1304), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 1305), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1368), null, new AwS545S0100000_1((C03K6) this, 1306));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 1307), awS545S0100000_1, AFwS207S0000000_19.get$arr$(230), new AwS545S0100000_1((C03K6) this, 1308), new AwS545S0100000_1((C03K6) this, 1309), new AwS545S0100000_1((C03K6) this, 1310), aFwS228S0000000_1, null, null, new AwS545S0100000_1((C03K6) this, 1311));
        }
        this.LLJ = assemVMLazy;
    }

    public final OrderSubmitAssemViewModel V5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    public final void c6() {
        View view = this.itemView;
        a6(view, null);
        C786410Ut5.LJJJJJL((LinearLayout) view.findViewById(R.id.q5d));
        View viewT5 = T5((ViewGroup) view.findViewById(R.id.q5d));
        C0H1U.LIZIZ(viewT5.findViewById(R.id.q5_));
        C12ES.LJIILL(0, viewT5.findViewById(R.id.q5b));
        ((TextView) viewT5.findViewById(R.id.q5b)).setText(viewT5.getContext().getString(2131832760));
        C12ES.LJIILL(0, viewT5.findViewById(R.id.q4r));
        C0H1U.LIZIZ(viewT5.findViewById(R.id.q4s));
        C12ES.LJIILL(0, viewT5.findViewById(R.id.q4u));
        C0H1U.LIZIZ(viewT5.findViewById(R.id.q53));
        C0H1U.LIZIZ(viewT5.findViewById(R.id.zl6));
        C786410Ut5.I7(new AjS40S0200000_1(this, viewT5, 45), viewT5);
        ((ViewGroup) view.findViewById(R.id.q5d)).addView(viewT5);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
        ModuleManager moduleManager = V5().LLZIL;
        if (moduleManager != null) {
            View view = this.itemView;
            System.currentTimeMillis();
            moduleManager.LIZ("payment_methods", view);
        }
    }

    public static String S5(PaymentInfo paymentInfo) {
        String strLJJIIZ;
        String strLJJLIIIJ;
        String strLJJIIZ2 = null;
        if (paymentInfo != null && paymentInfo.LIZLLL()) {
            PaymentMethod paymentMethod = paymentInfo.LIZ;
            if (paymentMethod != null) {
                strLJJIIZ = paymentMethod.LJJIIZ();
            } else {
                strLJJIIZ = null;
            }
            PaymentMethod paymentMethod2 = paymentInfo.paymentMethod;
            if (paymentMethod2 != null) {
                strLJJIIZ2 = paymentMethod2.LJJIIZ();
            }
            if (strLJJIIZ != null && (strLJJLIIIJ = C13LP.LJJLIIIJ(C1697810uHb.LJIIJJI(strLJJIIZ, strLJJIIZ2), ",", null, null, 0, null, null, 62)) != null) {
                return strLJJLIIIJ;
            }
        }
        return strLJJIIZ2;
    }

    public final View T5(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = this.itemView.getContext();
        c03xa.getClass();
        return C03XA.LIZJ(context, R.layout.amp, viewGroup, false);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        boolean zBooleanValue;
        boolean z2;
        int i;
        String priceStr;
        String priceStr2;
        C7768031q c7768031q = (C7768031q) interfaceC1891350zJl;
        super.onBindItemView(c7768031q);
        if (V5().LLZILL) {
            if (Intrinsics.LJFF(c7768031q.LLJJIII, Boolean.TRUE)) {
                C786410Ut5.LJLLLLLL(4, this.itemView);
                return;
            }
            C786410Ut5.LJLLLLLL(0, this.itemView);
        }
        boolean z3 = !Intrinsics.LJFF(c7768031q.LLJJI, Boolean.TRUE);
        if (!this.LLJIJIL && z3) {
            z = true;
        } else {
            z = false;
        }
        Boolean bool = c7768031q.LLJJI;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        View view = this.itemView;
        if (zBooleanValue) {
            C786410Ut5.LJLLLLLL(0, view.findViewById(R.id.q5s));
            C786410Ut5.LJLLLLLL(0, view.findViewById(R.id.q5c));
            C786410Ut5.LLLLZLL((TuxTextView) view.findViewById(R.id.q5k), 8);
            C786410Ut5.LJZL(8, (LinearLayout) view.findViewById(R.id.q5d));
        } else {
            C786410Ut5.LJLLLLLL(8, view.findViewById(R.id.q5s));
            C786410Ut5.LJLLLLLL(8, view.findViewById(R.id.q5c));
            C786410Ut5.LLLLZLL((TuxTextView) view.findViewById(R.id.q5k), 0);
            C786410Ut5.LJZL(0, (LinearLayout) view.findViewById(R.id.q5d));
        }
        PaymentInfo paymentInfo = c7768031q.LLIZ;
        if (paymentInfo != null && paymentInfo.LIZLLL()) {
            View view2 = this.itemView;
            a6(view2, paymentInfo);
            C786410Ut5.LJJJJJL((LinearLayout) view2.findViewById(R.id.q5d));
            if (paymentInfo.LJI()) {
                View viewT5 = T5((ViewGroup) view2.findViewById(R.id.q5d));
                PaymentMethod paymentMethod = paymentInfo.LIZ;
                Amount amountLJII = C03S8.LJII(paymentMethod);
                if (amountLJII != null) {
                    priceStr = amountLJII.getPriceStr();
                } else {
                    priceStr = null;
                }
                String strU5 = U5(paymentInfo.LIZ, false);
                getClass();
                W5(viewT5, paymentMethod, priceStr, true, null, null, null, null, strU5);
                View viewT52 = T5((ViewGroup) view2.findViewById(R.id.q5d));
                PaymentMethod paymentMethod2 = paymentInfo.paymentMethod;
                Amount amountLJIIIIZZ = C03S8.LJIIIIZZ(C03S8.LJIIJ(paymentInfo), paymentInfo.LIZ, paymentMethod2);
                if (amountLJIIIIZZ != null) {
                    priceStr2 = amountLJIIIIZZ.getPriceStr();
                } else {
                    priceStr2 = null;
                }
                W5(viewT52, paymentMethod2, priceStr2, false, N5(null, paymentInfo), L5(null, paymentInfo), R5(null, paymentInfo), P5(null, paymentInfo), U5(paymentInfo.paymentMethod, false));
                ((ViewGroup) view2.findViewById(R.id.q5d)).addView(viewT5);
                ((ViewGroup) view2.findViewById(R.id.q5d)).addView(viewT52);
                if (z) {
                    b6(paymentInfo.LIZ, 0, c7768031q);
                    b6(paymentInfo.paymentMethod, 1, c7768031q);
                    this.LLJIJIL = true;
                }
                i = R.id.q5d;
            } else {
                View viewT53 = T5((ViewGroup) view2.findViewById(R.id.q5d));
                PaymentMethod paymentMethod3 = paymentInfo.paymentMethod;
                String strN5 = N5(null, paymentInfo);
                String strL5 = L5(null, paymentInfo);
                String strR5 = R5(null, paymentInfo);
                String strP5 = P5(null, paymentInfo);
                String strU52 = U5(paymentInfo.paymentMethod, false);
                getClass();
                W5(viewT53, paymentMethod3, null, true, strN5, strL5, strR5, strP5, strU52);
                i = R.id.q5d;
                ((ViewGroup) view2.findViewById(R.id.q5d)).addView(viewT53);
                if (z) {
                    b6(paymentInfo.paymentMethod, 0, c7768031q);
                    this.LLJIJIL = true;
                }
            }
            C786410Ut5.I7(new AjS20S0300000_1(this, paymentInfo, view2, 27), view2.findViewById(i));
        } else {
            c6();
        }
        C928203k0 c928203k0 = C928203k0.LIZ;
        String str = V5().n;
        c928203k0.getClass();
        if (C928203k0.LJIILL(str)) {
            C0H1U.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), this.itemView);
            C0H1U.LJIIIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), this.itemView);
        }
        BillInfoData billInfoData = V5().LLJJI;
        if (z3 && billInfoData != null && billInfoData.LJIILJJIL() && billInfoData.paymentMethods != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.LLJI || !z2) {
            return;
        }
        this.LLJI = true;
        C03O0 c03o0 = C03O0.LIZ;
        HashMap<String, Object> mapHi1 = V5().hi1(false);
        mapHi1.put("is_clickable", "1");
        C03O0.LJJJZ(c03o0, "payment_method", mapHi1, null, S5(c7768031q.LLIZ), null, null, null, null, null, null, null, null, null, 1048508);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        return C03XA.LIZJ(context, R.layout.amq, viewGroup, false);
    }

    @Override // X.InterfaceC869803aa
    public final InstallmentPlan xe(PaymentInfo paymentInfo) {
        return C03Z8.LIZ(paymentInfo);
    }

    public final String L5(InstallmentPlan installmentPlan, PaymentInfo paymentInfo) {
        return C03Z8.LIZIZ(this, paymentInfo, installmentPlan);
    }

    public final String N5(InstallmentPlan installmentPlan, PaymentInfo paymentInfo) {
        return C03Z8.LIZLLL(this, paymentInfo, installmentPlan);
    }

    public final String P5(InstallmentPlan installmentPlan, PaymentInfo paymentInfo) {
        return C03Z8.LJ(this, paymentInfo, installmentPlan);
    }

    public final String R5(InstallmentPlan installmentPlan, PaymentInfo paymentInfo) {
        return C03Z8.LJFF(this, paymentInfo, installmentPlan);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0107 A[PHI: r1
      0x0107: PHI (r1v2 java.lang.String) = (r1v1 java.lang.String), (r1v3 java.lang.String) binds: [B:68:0x0102, B:70:0x0105] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String U5(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r7, boolean r8) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.payment.view.USHalfPaymentCell.U5(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, boolean):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a6(android.view.View r7, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r8) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.payment.view.USHalfPaymentCell.a6(android.view.View, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo):void");
    }

    public final void b6(PaymentMethod paymentMethod, int i, C7768031q c7768031q) {
        String str;
        boolean z;
        boolean z2;
        String str2;
        String str3;
        PaymentMethodsData paymentMethodsData;
        PaymentMethod paymentMethodLJIIIZ;
        if (paymentMethod == null) {
            return;
        }
        C03O0 c03o0 = C03O0.LIZ;
        boolean zLIZ = C703302op.LIZ(paymentMethod.extraInfo);
        BillInfoData billInfoData = V5().LLJJI;
        Boolean boolValueOf = null;
        if (billInfoData != null && (paymentMethodsData = billInfoData.paymentMethods) != null && (paymentMethodLJIIIZ = paymentMethodsData.LJIIIZ()) != null) {
            str = paymentMethodLJIIIZ.id;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, paymentMethod.id)) {
            z = true;
        } else {
            List<PaymentMethod> list = c7768031q.LLJI;
            if (list != null && !list.isEmpty()) {
                Iterator<PaymentMethod> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next().id, paymentMethod.id)) {
                        z = true;
                        break;
                    }
                }
                z = false;
            } else {
                z = false;
            }
        }
        boolean zLIZ2 = C703302op.LIZ(paymentMethod.balance);
        if (!paymentMethod.LIZIZ) {
            z2 = true;
        } else {
            z2 = false;
        }
        Availability availability = paymentMethod.availability;
        if (availability != null) {
            str2 = availability.unavailableCode;
            str3 = availability.statusCode;
        } else {
            str2 = null;
            str3 = null;
        }
        Boolean boolValueOf2 = Boolean.valueOf(paymentMethod.LJJJJZI());
        if (paymentMethod.missingElements != null) {
            boolValueOf = Boolean.valueOf(!r0.isEmpty());
        }
        Boolean bool = paymentMethod.isInstallment;
        String strLJJIIZI = paymentMethod.LJJIIZI(false);
        C03SE c03se = C03PI.LJIJI;
        BillInfoData billInfoData2 = V5().LLJJI;
        c03se.getClass();
        C03O0.LJJZZIII(c03o0, paymentMethod, i, zLIZ, z, zLIZ2, z2, str2, str3, boolValueOf2, boolValueOf, bool, null, strLJJIIZI, C03SE.LJIILLIIL(billInfoData2, paymentMethod), V5().LLLIL, V5().LLLZLZ.LJIIJ(), null, null, false, 921600);
    }

    public static void W5(View view, PaymentMethod paymentMethod, String str, boolean z, String str2, String str3, String str4, String str5, String str6) {
        String str7;
        String str8;
        boolean z2;
        String str9;
        PaymentTip paymentTip;
        String str10;
        Integer numLIZIZ;
        ECRichText eCRichText;
        String strLJJ;
        String str11 = null;
        if (paymentMethod != null) {
            str7 = paymentMethod.id;
        } else {
            str7 = null;
        }
        boolean zLJFF = Intrinsics.LJFF(str7, "pm_pi_ins_pipobnpl_c_d");
        boolean z3 = false;
        C12ES.LJIILL(0, view.findViewById(R.id.q5_));
        if (paymentMethod != null && (strLJJ = paymentMethod.LJJ(C960203pA.LIZIZ(view.getContext()))) != null) {
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(strLJJ);
            c1331670kl3LIZLLL.LJJIIZI(C1308910kAL.LJ(R.attr.bv, view.getContext()));
            c1331670kl3LIZLLL.LJJ((InterfaceC1334290kpH) view.findViewById(R.id.q5_));
            C786410Ut5.h3(c1331670kl3LIZLLL);
        }
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.q5_);
        if (smartImageView != null) {
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LJ = C12ES.LIZJ(2.0f, view.getContext());
            smartImageView.setCircleOptions(new C1331730kl9(c1331750klB));
        }
        C12ES.LJIILL(0, view.findViewById(R.id.q5b));
        TextView textView = (TextView) view.findViewById(R.id.q5b);
        if (paymentMethod == null || (str8 = paymentMethod.displayName) == null) {
            str8 = "";
        }
        textView.setText(str8);
        if (paymentMethod != null && (eCRichText = paymentMethod.subDisplayName) != null) {
            C12ES.LJIILL(0, view.findViewById(R.id.wgz));
            C03C8.LIZJ((TextView) view.findViewById(R.id.wgz), eCRichText, "payment_sub_title", null);
        } else {
            C0H1U.LIZIZ(view.findViewById(R.id.wgz));
        }
        C0H1U.LIZIZ(view.findViewById(R.id.q4r));
        if (str != null) {
            C12ES.LJIILL(0, view.findViewById(R.id.q4s));
            ((TextView) view.findViewById(R.id.q4s)).setText(str);
        } else {
            C0H1U.LIZIZ(view.findViewById(R.id.q4s));
        }
        if (z) {
            C12ES.LJIILL(0, view.findViewById(R.id.q4u));
        } else {
            C12ES.LJIILL(4, view.findViewById(R.id.q4u));
        }
        if (zLJFF) {
            if (C703302op.LIZ(str2) || C703302op.LIZ(str3) || C703302op.LIZ(str4) || C703302op.LIZ(str5)) {
                C12ES.LJIILL(0, view.findViewById(R.id.q4y));
            }
            if (str2 != null) {
                C12ES.LJIILL(0, view.findViewById(R.id.c65));
                ((TextView) view.findViewById(R.id.c65)).setText(str2);
            } else {
                C0H1U.LIZIZ(view.findViewById(R.id.c65));
            }
            if (str3 != null) {
                C12ES.LJIILL(0, view.findViewById(R.id.c4u));
                ((TextView) view.findViewById(R.id.c4u)).setText(str3);
            } else {
                C0H1U.LIZIZ(view.findViewById(R.id.c4u));
            }
            if (str4 != null) {
                C12ES.LJIILL(0, view.findViewById(R.id.c67));
                ((TextView) view.findViewById(R.id.c67)).setText(str4);
            } else {
                C0H1U.LIZIZ(view.findViewById(R.id.c67));
            }
            if (str5 != null) {
                C12ES.LJIILL(0, view.findViewById(R.id.c4s));
                ((TextView) view.findViewById(R.id.c4s)).setText(str5);
            } else {
                C0H1U.LIZIZ(view.findViewById(R.id.c4s));
            }
        } else if (str2 != null) {
            C12ES.LJIILL(0, view.findViewById(R.id.q4y));
            C12ES.LJIILL(0, view.findViewById(R.id.q53));
            ((TextView) view.findViewById(R.id.q53)).setText(str2);
        } else {
            C0H1U.LIZIZ(view.findViewById(R.id.q53));
        }
        if (str6 != null) {
            C12ES.LJIILL(0, view.findViewById(R.id.q4y));
            C12ES.LJIILL(0, view.findViewById(R.id.q5g));
            ((TextView) view.findViewById(R.id.q5g)).setText(str6);
        } else {
            C0H1U.LIZIZ(view.findViewById(R.id.q5g));
        }
        if (paymentMethod != null && paymentMethod.LIZIZ) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && (str9 = paymentMethod.id) != null && u.LJJIIJZLJL(str9, "pm_pi_ccdc_", false) && (paymentTip = paymentMethod.paymentTip) != null && (str10 = paymentTip.tips) != null && C703302op.LIZ(str10)) {
            PaymentTip paymentTip2 = paymentMethod.paymentTip;
            C12ES.LJIILL(0, view.findViewById(R.id.q4y));
            C12ES.LJIILL(0, view.findViewById(R.id.zl6));
            TextView textView2 = (TextView) view.findViewById(R.id.zl6);
            if (paymentTip2 != null) {
                str11 = paymentTip2.tips;
            }
            textView2.setText(str11);
            if (paymentTip2 != null && (numLIZIZ = PaymentTip.LIZIZ(paymentTip2, C960203pA.LIZIZ(view.getContext()), 2)) != null) {
                ((TextView) view.findViewById(R.id.zl6)).setTextColor(numLIZIZ.intValue());
            } else {
                ((TuxTextView) view.findViewById(R.id.zl6)).setTextColorRes(R.attr.vd);
            }
            z3 = true;
        } else {
            C0H1U.LIZIZ(view.findViewById(R.id.zl6));
        }
        if (!zLJFF && str2 == null && str6 == null && !z3) {
            C0H1U.LIZIZ(view.findViewById(R.id.q4y));
        }
    }
}
