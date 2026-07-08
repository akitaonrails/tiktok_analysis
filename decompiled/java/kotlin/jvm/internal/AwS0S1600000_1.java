package kotlin.jvm.internal;

import X.C09AY;
import X.C1397630mTR;
import X.C1697810uHb;
import X.C883303cl;
import X.C957403oi;
import X.InterfaceC883403cm;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.VoucherRetainDisplayInfo;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS0S1600000_1 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS0S1600000_1 awS0S1600000_1, Object obj) {
        C1397630mTR c1397630mTR = (C1397630mTR) obj;
        String str = ((VoucherRetainDisplayInfo) awS0S1600000_1.l1).primaryButton;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c1397630mTR.LIZJ(0, str, new AwS20S1400000_1((InterfaceC883403cm) awS0S1600000_1.l2, (InterfaceC883403cm) awS0S1600000_1.s0, (String) awS0S1600000_1.l3, (Map<String, String>) awS0S1600000_1.l4, (C883303cl) awS0S1600000_1.l5, (Function0<Unit>) 6));
        String str3 = ((VoucherRetainDisplayInfo) awS0S1600000_1.l1).secondaryButton;
        if (str3 != null) {
            str2 = str3;
        }
        c1397630mTR.LIZJ(1, str2, new AwS20S1400000_1((InterfaceC883403cm) awS0S1600000_1.l2, (InterfaceC883403cm) awS0S1600000_1.s0, (String) awS0S1600000_1.l3, (Map<String, String>) awS0S1600000_1.l4, (C883303cl) awS0S1600000_1.l6, (Function0<Unit>) 7));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S1600000_1 awS0S1600000_1, Object obj) {
        Object obj2;
        String string;
        C957403oi c957403oi = (C957403oi) obj;
        c957403oi.LJ((HashMap) awS0S1600000_1.l1);
        c957403oi.LIZLLL("is_success", Integer.valueOf(Intrinsics.LJFF((Boolean) awS0S1600000_1.l2, Boolean.TRUE) ? 1 : 0));
        String str = awS0S1600000_1.s0;
        if (str != null) {
            c957403oi.LIZLLL("fail_reason", str);
        }
        Integer num = (Integer) awS0S1600000_1.l3;
        if (num != null) {
            c957403oi.LIZLLL("sku_num_before", num);
        }
        Integer num2 = (Integer) awS0S1600000_1.l4;
        if (num2 != null) {
            c957403oi.LIZLLL("sku_num_after", num2);
        }
        Map map = (Map) awS0S1600000_1.l5;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null || (string = value.toString()) == null) {
                    string = "";
                }
                c957403oi.LIZLLL(str2, string);
            }
        }
        for (String str3 : C1697810uHb.LJIIJJI("enter_from_merge", "entrance_form", "list_item_id", "search_result_id")) {
            HashMap map2 = (HashMap) awS0S1600000_1.l6;
            if (map2 != null && !c957403oi.LIZ(str3) && (obj2 = map2.get(str3)) != null) {
                c957403oi.LIZLLL(str3, obj2);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S1600000_1(VoucherRetainDisplayInfo voucherRetainDisplayInfo, VoucherRetainDisplayInfo voucherRetainDisplayInfo2, InterfaceC883403cm interfaceC883403cm, String str, Map<String, String> map, C883303cl c883303cl, Function0<Unit> function0, Function0<Unit> function02) {
        super(1);
        this.$t = function02;
        this.l1 = voucherRetainDisplayInfo;
        this.l2 = voucherRetainDisplayInfo2;
        this.s0 = interfaceC883403cm;
        this.l3 = str;
        this.l4 = map;
        this.l5 = c883303cl;
        this.l6 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S1600000_1(HashMap map, HashMap<String, Object> map2, Boolean bool, String str, Integer num, Integer num2, Map<String, ? extends Object> map3, HashMap<String, Object> map4) {
        super(1);
        this.$t = map4;
        this.l1 = map;
        this.l2 = map2;
        this.s0 = bool;
        this.l3 = str;
        this.l4 = num;
        this.l5 = num2;
        this.l6 = map3;
    }
}
