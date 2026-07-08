package kotlin.jvm.internal;

import X.C03N1;
import X.C03SE;
import X.C03ZB;
import X.C049X;
import X.C09AY;
import X.C1003603wA;
import X.C10513049f;
import X.C1308910kAL;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C1748720vbi;
import X.C2188811AlT;
import X.C2341109Fh;
import X.C259800zU;
import X.C786410Ut5;
import X.C808903Dz;
import X.C831303Mp;
import X.C996103ux;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentBreakdown;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.router.ECRouterInterceptor;
import com.ss.android.ugc.aweme.ecommerce.us.logistic.module.USLogisticVH;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public class AwS118S1200000_1 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS118S1200000_1 awS118S1200000_1) {
        Map<String, String> mapNQ2;
        Object next;
        InstallmentBreakdown installmentBreakdown;
        Iterable iterable = (Iterable) ((C259800zU) awS118S1200000_1.l1).element;
        String str = awS118S1200000_1.s0;
        Iterator it2 = iterable.iterator();
        while (true) {
            mapNQ2 = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((InstallmentPlan) next).tenure, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        InstallmentPlan installmentPlan = (InstallmentPlan) next;
        if (installmentPlan != null) {
            C03ZB c03zb = (C03ZB) awS118S1200000_1.l2;
            InstallmentPlan installmentPlan2 = installmentPlan.displayInstallmentPlan;
            if (installmentPlan2 == null || (installmentBreakdown = installmentPlan2.breakdown) == null) {
                installmentBreakdown = installmentPlan.breakdown;
            }
            if (c03zb.getOspMiniVM() == null) {
                OrderSubmitAssemViewModel ospAssemViewModel = c03zb.getOspAssemViewModel();
                if (ospAssemViewModel != null) {
                    mapNQ2 = ospAssemViewModel.FR2();
                }
            } else {
                MiniOspViewModel ospMiniVM = c03zb.getOspMiniVM();
                if (ospMiniVM != null) {
                    mapNQ2 = ospMiniVM.NQ2();
                }
            }
            C808903Dz.LIZ(c03zb.getContext(), installmentBreakdown, mapNQ2);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS118S1200000_1 awS118S1200000_1) {
        C1326790kdB c1326790kdB = C1326790kdB.LIZ;
        String str = awS118S1200000_1.s0;
        c1326790kdB.getClass();
        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str);
        c1331670kl3LIZLLL.LJJIIZI(C1308910kAL.LJ(R.attr.bv, ((ViewGroup) awS118S1200000_1.l1).getContext()));
        c1331670kl3LIZLLL.LJJ((SmartImageView) awS118S1200000_1.l2);
        C786410Ut5.h3(c1331670kl3LIZLLL);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$2(AwS118S1200000_1 awS118S1200000_1) {
        boolean z;
        String strLJI;
        StringBuilder sb = new StringBuilder("pmInRec is null: ");
        boolean z2 = true;
        if (((C259800zU) awS118S1200000_1.l1).element == 0) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(", pmInAll is null: ");
        if (((C259800zU) awS118S1200000_1.l2).element != 0) {
            z2 = false;
        }
        sb.append(z2);
        sb.append(", pmInRec == pmInAll: ");
        sb.append(Intrinsics.LJFF(((C259800zU) awS118S1200000_1.l1).element, ((C259800zU) awS118S1200000_1.l2).element));
        sb.append(", pmInRec supported_commute_types: ");
        PaymentMethod paymentMethod = (PaymentMethod) ((C259800zU) awS118S1200000_1.l1).element;
        String strLJI2 = null;
        if (paymentMethod != null) {
            strLJI = C03SE.LJI(paymentMethod);
        } else {
            strLJI = null;
        }
        sb.append(strLJI);
        sb.append(", pmInAll supported_commute_types: ");
        PaymentMethod paymentMethod2 = (PaymentMethod) ((C259800zU) awS118S1200000_1.l2).element;
        if (paymentMethod2 != null) {
            strLJI2 = C03SE.LJI(paymentMethod2);
        }
        sb.append(strLJI2);
        sb.append(", bill_info_log_id: ");
        sb.append(awS118S1200000_1.s0);
        String string = sb.toString();
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkCommuteType: ");
        sbLIZ.append(string);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS118S1200000_1 r6) {
        /*
            X.03k0 r5 = X.C928203k0.LIZ
            java.lang.Object r1 = r6.l1
            com.ss.android.ugc.aweme.ecommerce.core.router.ECRouterInterceptor r1 = (com.ss.android.ugc.aweme.ecommerce.core.router.ECRouterInterceptor) r1
            java.lang.Object r0 = r6.l2
            com.bytedance.router.RouteIntent r0 = (com.bytedance.router.RouteIntent) r0
            r1.getClass()
            java.lang.String r4 = com.ss.android.ugc.aweme.ecommerce.core.router.ECRouterInterceptor.LJIIL(r0)
            java.lang.Object r0 = r6.l1
            com.ss.android.ugc.aweme.ecommerce.core.router.ECRouterInterceptor r0 = (com.ss.android.ugc.aweme.ecommerce.core.router.ECRouterInterceptor) r0
            java.lang.Object r1 = r6.l2
            com.bytedance.router.RouteIntent r1 = (com.bytedance.router.RouteIntent) r1
            r0.getClass()
            java.lang.String r0 = com.ss.android.ugc.aweme.ecommerce.core.router.ECRouterInterceptor.LJIIL(r1)
            com.ss.android.ugc.aweme.ecommerce.base.osp.starter.OrderSubmitRequestParam r3 = com.ss.android.ugc.aweme.ecommerce.core.router.ECRouterInterceptor.LJIIIZ(r1, r0)
            kotlin.jvm.internal.AwS580S0100000_1 r2 = new kotlin.jvm.internal.AwS580S0100000_1
            java.lang.Object r1 = r6.l1
            com.ss.android.ugc.aweme.ecommerce.core.router.ECRouterInterceptor r1 = (com.ss.android.ugc.aweme.ecommerce.core.router.ECRouterInterceptor) r1
            r0 = 344(0x158, float:4.82E-43)
            r2.<init>(r1, r0)
            r5.getClass()
            boolean r0 = X.C928203k0.LIZIZ(r4, r3, r2)
            if (r0 == 0) goto L66
            java.lang.Object r0 = r6.l1
            com.ss.android.ugc.aweme.ecommerce.core.router.ECRouterInterceptor r0 = (com.ss.android.ugc.aweme.ecommerce.core.router.ECRouterInterceptor) r0
            java.lang.String r1 = r6.s0
            r0.getClass()
            java.lang.String r0 = "bill_info_request"
            java.lang.Object r3 = X.C993603uY.LIZ(r1, r0)
            boolean r0 = r3 instanceof com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest
            if (r0 == 0) goto L64
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest r3 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest) r3
        L4d:
            kotlin.jvm.internal.AwS580S0100000_1 r2 = new kotlin.jvm.internal.AwS580S0100000_1
            java.lang.Object r1 = r6.l1
            com.ss.android.ugc.aweme.ecommerce.core.router.ECRouterInterceptor r1 = (com.ss.android.ugc.aweme.ecommerce.core.router.ECRouterInterceptor) r1
            r0 = 345(0x159, float:4.83E-43)
            r2.<init>(r1, r0)
            boolean r0 = X.C928203k0.LIZ(r3, r2)
            if (r0 == 0) goto L66
            r0 = 1
        L5f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L64:
            r3 = 0
            goto L4d
        L66:
            r0 = 0
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS118S1200000_1.invoke$3(kotlin.jvm.internal.AwS118S1200000_1):java.lang.Object");
    }

    public static final Object invoke$4(AwS118S1200000_1 awS118S1200000_1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMiniOspPayResult, result: ");
        sbLIZ.append((C03N1) awS118S1200000_1.l1);
        sbLIZ.append(", for object: ");
        sbLIZ.append(System.identityHashCode((C831303Mp) awS118S1200000_1.l2));
        sbLIZ.append(", scene: ");
        sbLIZ.append(awS118S1200000_1.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$5(AwS118S1200000_1 awS118S1200000_1) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(' ');
        sbLIZ.append(((C1003603wA) awS118S1200000_1.l1).hashCode());
        sbLIZ.append(" get key = ");
        sbLIZ.append(awS118S1200000_1.s0);
        sbLIZ.append(" skuId ");
        C996103ux c996103ux = (C996103ux) awS118S1200000_1.l2;
        String str2 = null;
        if (c996103ux != null) {
            str = c996103ux.LIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(" bottom ");
        C996103ux c996103ux2 = (C996103ux) awS118S1200000_1.l2;
        if (c996103ux2 != null) {
            str2 = c996103ux2.LIZLLL;
        }
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$6(AwS118S1200000_1 awS118S1200000_1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(' ');
        sbLIZ.append(((C1003603wA) awS118S1200000_1.l1).hashCode());
        sbLIZ.append(" save key = ");
        sbLIZ.append(awS118S1200000_1.s0);
        sbLIZ.append(" skuId ");
        sbLIZ.append(((C996103ux) awS118S1200000_1.l2).LIZ);
        sbLIZ.append(" bottom ");
        sbLIZ.append(((C996103ux) awS118S1200000_1.l2).LIZLLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$7(AwS118S1200000_1 awS118S1200000_1) {
        C1748720vbi.LIZLLL(((USLogisticVH) awS118S1200000_1.l1).itemView, new C049X(), new AwS115S1100000_1((LogisticDTO) awS118S1200000_1.l2, awS118S1200000_1.s0, 48));
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS118S1200000_1 awS118S1200000_1) {
        C1748720vbi.LIZLLL(((USLogisticVH) awS118S1200000_1.l1).itemView, new C10513049f(), new AwS115S1100000_1((LogisticDTO) awS118S1200000_1.l2, awS118S1200000_1.s0, 49));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS118S1200000_1(C259800zU c259800zU, C259800zU<PaymentMethod> c259800zU2, C259800zU<PaymentMethod> c259800zU3, String str) {
        super(0);
        this.$t = str;
        this.l1 = c259800zU;
        this.l2 = c259800zU2;
        this.s0 = c259800zU3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS118S1200000_1(C259800zU c259800zU, C259800zU<List<InstallmentPlan>> c259800zU2, String str, C03ZB c03zb) {
        super(0);
        this.$t = c03zb;
        this.l1 = c259800zU;
        this.s0 = c259800zU2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS118S1200000_1(C03N1 c03n1, C831303Mp c831303Mp, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c03n1;
        this.l2 = c831303Mp;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS118S1200000_1(C1003603wA c1003603wA, String str, C996103ux c996103ux, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1003603wA;
        this.s0 = str;
        this.l2 = c996103ux;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS118S1200000_1(ECRouterInterceptor eCRouterInterceptor, RouteIntent routeIntent, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = eCRouterInterceptor;
        this.l2 = routeIntent;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS118S1200000_1(USLogisticVH uSLogisticVH, LogisticDTO logisticDTO, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = uSLogisticVH;
        this.l2 = logisticDTO;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS118S1200000_1(String str, ViewGroup viewGroup, SmartImageView smartImageView, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = viewGroup;
        this.l2 = smartImageView;
    }
}
