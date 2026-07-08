package kotlin.jvm.internal;

import X.AnonymousClass0310;
import X.AnonymousClass0311;
import X.AnonymousClass0376;
import X.C031A;
import X.C03JV;
import X.C03NJ;
import X.C09AY;
import X.C1054004Ag;
import X.C1741890vQh;
import X.C719202rO;
import X.C719902rV;
import X.C7768031q;
import X.C897703f5;
import X.C907803gi;
import X.C948003nC;
import X.C957403oi;
import X.InterfaceC1891350zJl;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.eu.ageconfirm.AgeConfirmCell;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS28S1110000_1 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS28S1110000_1 awS28S1110000_1, Object obj) {
        String str;
        C957403oi c957403oi = (C957403oi) obj;
        Map<String, Object> map = ((C897703f5) awS28S1110000_1.l1).LJII;
        c957403oi.getClass();
        ((HashMap) c957403oi.LIZ).putAll(map);
        C907803gi c907803gi = C907803gi.LIZ;
        String str2 = awS28S1110000_1.s0;
        c907803gi.getClass();
        c957403oi.LIZJ("page_name", C907803gi.LJJJJZ(str2));
        c957403oi.LIZJ("EVENT_ORIGIN_FEATURE", "TEMAI");
        if (awS28S1110000_1.z2) {
            str = "app";
        } else {
            str = "h5";
        }
        c957403oi.LIZJ("pay_route", str);
        return Unit.LIZ;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Object invoke$1(AwS28S1110000_1 awS28S1110000_1, Object obj) {
        int i;
        C03JV c03jv = (C03JV) obj;
        String str = awS28S1110000_1.s0;
        switch (str.hashCode()) {
            case -2133484533:
                if (str.equals("age_confirm_module")) {
                    Iterator<InterfaceC1891350zJl> it2 = c03jv.LLILLJJLI.iterator();
                    int i2 = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            if (!(it2.next() instanceof C719902rV)) {
                                i2++;
                            }
                        } else {
                            i2 = -1;
                        }
                    }
                    return C03JV.LIZ(c03jv, 0, null, null, false, null, false, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, new C948003nC(new C03NJ(i2, awS28S1110000_1.s0, null, awS28S1110000_1.z2)), false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -1, -1, -257, 1048575);
                }
                return c03jv;
            case -1847017863:
                if (str.equals("payment_methods")) {
                    Iterator<InterfaceC1891350zJl> it3 = c03jv.LLILLJJLI.iterator();
                    int i3 = 0;
                    while (true) {
                        if (it3.hasNext()) {
                            InterfaceC1891350zJl next = it3.next();
                            if (!(next instanceof C7768031q) && !(next instanceof C031A)) {
                                i3++;
                            }
                        } else {
                            i3 = -1;
                        }
                    }
                    return C03JV.LIZ(c03jv, 0, null, null, false, null, false, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, new C948003nC(new C03NJ(i3, awS28S1110000_1.s0, null, awS28S1110000_1.z2)), false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -1, -1, -257, 1048575);
                }
                return c03jv;
            case -1742660056:
                if (str.equals("shop_orders_new_logistics_module")) {
                    Iterator<InterfaceC1891350zJl> it4 = c03jv.LLILLJJLI.iterator();
                    int i4 = 0;
                    while (true) {
                        if (it4.hasNext()) {
                            if (!(it4.next() instanceof C719202rO)) {
                                i4++;
                            }
                        } else {
                            i4 = -1;
                        }
                    }
                    String str2 = (String) ((Map) awS28S1110000_1.l1).get("shop_index");
                    if (str2 != null) {
                        i = CastIntegerProtector.parseInt(str2);
                    } else {
                        i = 0;
                    }
                    return C03JV.LIZ(c03jv, 0, null, null, false, null, false, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, new C948003nC(new C03NJ(i4 + i, awS28S1110000_1.s0, (Map) awS28S1110000_1.l1, awS28S1110000_1.z2)), false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -1, -1, -257, 1048575);
                }
                return c03jv;
            case 699961955:
                if (str.equals("shipping_address")) {
                    Iterator<InterfaceC1891350zJl> it5 = c03jv.LLILLJJLI.iterator();
                    int i5 = 0;
                    while (true) {
                        if (it5.hasNext()) {
                            InterfaceC1891350zJl next2 = it5.next();
                            if (!(next2 instanceof AnonymousClass0376) && !(next2 instanceof AnonymousClass0310) && !(next2 instanceof AnonymousClass0311)) {
                                i5++;
                            }
                        } else {
                            i5 = -1;
                        }
                    }
                    return C03JV.LIZ(c03jv, 0, null, null, false, null, false, null, null, null, null, null, null, null, null, 0, null, null, 0, null, null, false, 0L, false, false, null, null, false, null, null, null, null, null, false, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, 0, false, null, new C948003nC(new C03NJ(i5, awS28S1110000_1.s0, null, awS28S1110000_1.z2)), false, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, null, null, null, null, null, null, -1, -1, -257, 1048575);
                }
                return c03jv;
            default:
                return c03jv;
        }
    }

    public static final Object invoke$2(AwS28S1110000_1 awS28S1110000_1, Object obj) {
        LaneParams laneParams = (LaneParams) obj;
        laneParams.withParamsGroup(((C1054004Ag) awS28S1110000_1.l1).LIZIZ);
        ((C1054004Ag) awS28S1110000_1.l1).LIZIZ(laneParams);
        laneParams.minus("is_success", Integer.valueOf(awS28S1110000_1.z2 ? 1 : 0));
        laneParams.minus("remind_name", awS28S1110000_1.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS28S1110000_1 awS28S1110000_1, Object obj) {
        Object obj2;
        String str;
        HashMap<String, Object> mapLJIIJ;
        HashMap map = (HashMap) obj;
        map.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        HashMap<String, Object> map2 = ((AgeConfirmCell) awS28S1110000_1.l1).L5().LLLIL;
        Object obj3 = null;
        if (map2 != null) {
            obj2 = map2.get("enter_from_info");
        } else {
            obj2 = null;
        }
        map.put("enter_from_info", obj2);
        HashMap<String, Object> map3 = ((AgeConfirmCell) awS28S1110000_1.l1).L5().LLLIL;
        if (map3 != null) {
            obj3 = map3.get("entrance_info");
        }
        map.put("entrance_info", obj3);
        map.put("page_name", "order_submit");
        map.put("module_name", "age_confirm_module");
        if (awS28S1110000_1.z2) {
            str = "check";
        } else {
            str = "uncheck";
        }
        map.put("action_type", str);
        String str2 = awS28S1110000_1.s0;
        if (str2 != null && (mapLJIIJ = C1741890vQh.LJIIJ(str2)) != null) {
            map.putAll(mapLJIIJ);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS28S1110000_1(C897703f5 c897703f5, String str, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l1 = c897703f5;
        this.s0 = str;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS28S1110000_1(C1054004Ag c1054004Ag, boolean z, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1054004Ag;
        this.z2 = z;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS28S1110000_1(AgeConfirmCell ageConfirmCell, boolean z, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = ageConfirmCell;
        this.z2 = z;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS28S1110000_1(String str, String str2, boolean z, Map<String, String> map) {
        super(1);
        this.$t = map;
        this.s0 = str;
        this.z2 = str2;
        this.l1 = z;
    }
}
