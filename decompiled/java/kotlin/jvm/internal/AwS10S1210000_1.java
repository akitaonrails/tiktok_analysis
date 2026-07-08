package kotlin.jvm.internal;

import X.C03JV;
import X.C09AY;
import X.C1397630mTR;
import X.C1397650mTT;
import X.C722002rq;
import X.C722302rt;
import X.InterfaceC1891350zJl;
import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressAdapter$AddressViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS10S1210000_1 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS10S1210000_1 awS10S1210000_1, Object obj) {
        Object objValueOf;
        Object string;
        Object obj2;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("page_name", "shipping_info");
        laneParams.plusAssign("EVENT_ORIGIN_FEATURE", "TEMAI");
        laneParams.plusAssign("module_name", "address");
        Boolean bool = ((ReachableAddress) awS10S1210000_1.l1).reachable;
        Object obj3 = null;
        if (bool != null) {
            objValueOf = Integer.valueOf(bool.booleanValue() ? 1 : 0);
        } else {
            objValueOf = null;
        }
        laneParams.plusAssign("is_address_deliverable", objValueOf);
        laneParams.plusAssign("is_default", Integer.valueOf(awS10S1210000_1.z3 ? 1 : 0));
        laneParams.plusAssign("rank", Integer.valueOf(((AddressAdapter$AddressViewHolder) awS10S1210000_1.l2).LLJI - 1));
        laneParams.plusAssign("is_selected", Integer.valueOf(((ReachableAddress) awS10S1210000_1.l1).isSelect ? 1 : 0));
        Integer num = ((ReachableAddress) awS10S1210000_1.l1).addressInvalidType;
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        laneParams.plusAssign("invalid_reason", string);
        laneParams.plusAssign("click_area", awS10S1210000_1.s0);
        laneParams.plusAssign("is_valid", Integer.valueOf(((ReachableAddress) awS10S1210000_1.l1).LIZIZ()));
        Map<String, String> map = ((ReachableAddress) awS10S1210000_1.l1).daInfo;
        if (map != null && (obj2 = map.get("invalid_reason_code")) != null) {
            obj3 = obj2;
        }
        laneParams.plusAssign("invalid_reason_code", obj3);
        laneParams.putAll(((AddressAdapter$AddressViewHolder) awS10S1210000_1.l2).W5().gv().LIZ("c2393.d5331"));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS10S1210000_1 awS10S1210000_1, Object obj) {
        C1397630mTR c1397630mTR = (C1397630mTR) obj;
        c1397630mTR.LJ(2131840236, new AwS115S1100000_1((Function0) awS10S1210000_1.l1, (Function0<Unit>) awS10S1210000_1.s0, (String) 10));
        if (awS10S1210000_1.z3) {
            List<C1397650mTT> list = c1397630mTR.LJ;
            Context context = (Context) awS10S1210000_1.l2;
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                ((C1397650mTT) it2.next()).LIZ(new AwS580S0100000_1(context, 136));
            }
        }
        c1397630mTR.LJI(2131840237, null);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0712 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x07b2  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0862  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x08d0  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x08d3  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x08d6  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x08d9  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x08dc  */
    /* JADX WARN: Type inference failed for: r8v100 */
    /* JADX WARN: Type inference failed for: r8v101, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v120 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS10S1210000_1 r47, java.lang.Object r48) {
        /*
            Method dump skipped, instruction units count: 2274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS10S1210000_1.invoke$2(kotlin.jvm.internal.AwS10S1210000_1, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS10S1210000_1 r15, java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 783
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS10S1210000_1.invoke$3(kotlin.jvm.internal.AwS10S1210000_1, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$4(AwS10S1210000_1 awS10S1210000_1, Object obj) {
        C722302rt c722302rtLJFF;
        String strLJIIIIZZ;
        C03JV c03jv = (C03JV) obj;
        MiniOspViewModel miniOspViewModel = (MiniOspViewModel) awS10S1210000_1.l1;
        List<InterfaceC1891350zJl> listIQ2 = miniOspViewModel.IQ2(miniOspViewModel.LLIZ, miniOspViewModel.LLJILLL, true);
        BillInfoData billInfoData = ((MiniOspViewModel) awS10S1210000_1.l1).LLIZ;
        if (billInfoData != null) {
            c722302rtLJFF = C722002rq.LJFF(billInfoData, awS10S1210000_1.s0, awS10S1210000_1.z3, 0, (List) awS10S1210000_1.l2, null, null, 52);
        } else {
            c722302rtLJFF = null;
        }
        BillInfoData billInfoData2 = ((MiniOspViewModel) awS10S1210000_1.l1).LLIZ;
        if (billInfoData2 != null) {
            strLJIIIIZZ = BillInfoData.LJIIIIZZ(billInfoData2, awS10S1210000_1.s0, awS10S1210000_1.z3, (List) awS10S1210000_1.l2, 8);
        } else {
            strLJIIIIZZ = "";
        }
        return C03JV.LIZ(c03jv, 0, listIQ2, c722302rtLJFF, false, null, false, null, null, null, null, strLJIIIIZZ, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -1031, -1, -1, 1048575);
    }

    public static final Object invoke$5(AwS10S1210000_1 awS10S1210000_1, Object obj) {
        C722302rt c722302rtLJFF;
        String strLJIIIIZZ;
        C03JV c03jv = (C03JV) obj;
        MiniOspViewModel miniOspViewModel = (MiniOspViewModel) awS10S1210000_1.l1;
        List<InterfaceC1891350zJl> listIQ2 = miniOspViewModel.IQ2(miniOspViewModel.LLIZ, miniOspViewModel.LLJILLL, true);
        BillInfoData billInfoData = ((MiniOspViewModel) awS10S1210000_1.l1).LLIZ;
        if (billInfoData != null) {
            c722302rtLJFF = C722002rq.LJFF(billInfoData, awS10S1210000_1.s0, awS10S1210000_1.z3, 0, (List) awS10S1210000_1.l2, null, null, 52);
        } else {
            c722302rtLJFF = null;
        }
        BillInfoData billInfoData2 = ((MiniOspViewModel) awS10S1210000_1.l1).LLIZ;
        if (billInfoData2 != null) {
            strLJIIIIZZ = BillInfoData.LJIIIIZZ(billInfoData2, awS10S1210000_1.s0, awS10S1210000_1.z3, (List) awS10S1210000_1.l2, 8);
        } else {
            strLJIIIIZZ = "";
        }
        return C03JV.LIZ(c03jv, 0, listIQ2, c722302rtLJFF, false, null, false, null, null, null, null, strLJIIIIZZ, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, null, false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -1031, -1, -1, 1048575);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS10S1210000_1(Context context, String str, Function0 function0, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z3 = z;
        this.l1 = function0;
        this.s0 = str;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS10S1210000_1(ReachableAddress reachableAddress, boolean z, AddressAdapter$AddressViewHolder addressAdapter$AddressViewHolder, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = reachableAddress;
        this.z3 = z;
        this.l2 = addressAdapter$AddressViewHolder;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS10S1210000_1(CCDCAddCardViewModel cCDCAddCardViewModel, CCDCAddCardViewModel cCDCAddCardViewModel2, boolean z, String str, Function1<? super PaymentInfo, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l1 = cCDCAddCardViewModel;
        this.z3 = cCDCAddCardViewModel2;
        this.s0 = z;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS10S1210000_1(PaymentInfo paymentInfo, PaymentViewModel paymentViewModel, String str, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l1 = paymentInfo;
        this.l2 = paymentViewModel;
        this.s0 = str;
        this.z3 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS10S1210000_1(MiniOspViewModel miniOspViewModel, MiniOspViewModel miniOspViewModel2, String str, boolean z, List<String> list) {
        super(1);
        this.$t = list;
        this.l1 = miniOspViewModel;
        this.s0 = miniOspViewModel2;
        this.z3 = str;
        this.l2 = z;
    }
}
