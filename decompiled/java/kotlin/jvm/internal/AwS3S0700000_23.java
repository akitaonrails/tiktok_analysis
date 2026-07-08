package kotlin.jvm.internal;

import X.AbstractC1522680pj8;
import X.AbstractC1534540q2G;
import X.C09AY;
import X.C1487880op0;
import X.C1487910op3;
import X.C1487940op6;
import X.C1533490q0Z;
import X.C1533790q13;
import X.C1534070q1V;
import X.C1534080q1W;
import X.C1534110q1Z;
import X.C1534250q1n;
import X.C2188811AlT;
import X.C2341109Fh;
import X.C259800zU;
import com.ss.android.ugc.aweme.ecommerce.action.EcommerceActionDto;
import com.ss.android.ugc.aweme.ecommerce.action.EcommerceActionNextDto;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* JADX INFO: loaded from: classes24.dex */
public class AwS3S0700000_23 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, X.0q1Z] */
    public static final Object invoke$0(AwS3S0700000_23 awS3S0700000_23, Object obj) {
        ?? r5 = (C1534110q1Z) obj;
        if (!r5.LIZ()) {
            r5.LIZJ(true);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("invalid cdn cache for ");
            sbLIZ.append(((AbstractC1522680pj8) ((C259800zU) awS3S0700000_23.l0).element).LIZ);
            C1534250q1n.LIZIZ("CDN_FETCHER", C2188811AlT.LIZIZ(sbLIZ), null);
            return Boolean.FALSE;
        }
        if (((C1533790q13) awS3S0700000_23.l1).LIZ.LIZ()) {
            ((C259800zU) awS3S0700000_23.l2).element = r5.LJ();
            if (!C1534080q1W.LIZLLL((Map) ((C259800zU) awS3S0700000_23.l2).element, ((AbstractC1522680pj8) ((C259800zU) awS3S0700000_23.l0).element).LJ)) {
                return Boolean.FALSE;
            }
        }
        if (!((C1533490q0Z) awS3S0700000_23.l3).LJJIIJ && (((C1534070q1V) awS3S0700000_23.l4).LJIIJ || r5.LIZLLL())) {
            C259800zU c259800zU = (C259800zU) awS3S0700000_23.l5;
            T t = c259800zU.element;
            T t2 = r5;
            if (t != 0) {
                t2 = t;
            }
            c259800zU.element = t2;
            return Boolean.FALSE;
        }
        C1534250q1n.LIZ.LJIIJ(new AwS567S0100000_23((C259800zU) awS3S0700000_23.l0, (C259800zU<AbstractC1534540q2G>) 59));
        ((C259800zU) awS3S0700000_23.l6).element = r5;
        return Boolean.TRUE;
    }

    public static final Object invoke$1(AwS3S0700000_23 awS3S0700000_23, Object obj) throws JSONException {
        Object obj2;
        C1487910op3 c1487910op3 = (C1487910op3) awS3S0700000_23.l0;
        EcommerceActionDto ecommerceActionDto = (EcommerceActionDto) awS3S0700000_23.l1;
        Map map = (Map) awS3S0700000_23.l2;
        c1487910op3.getClass();
        Map<String, ? extends Object> mapLIZJ = C1487910op3.LIZJ(ecommerceActionDto, (Map) obj, map);
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        AwS424S0200000_23 awS424S0200000_23 = new AwS424S0200000_23((EcommerceActionDto) awS3S0700000_23.l1, (EcommerceActionDto) awS3S0700000_23.l2, (Map<String, ? extends Object>) 4);
        c2341109Fh.getClass();
        C2341109Fh.LJFF(awS424S0200000_23);
        C1487910op3 c1487910op32 = (C1487910op3) awS3S0700000_23.l0;
        EcommerceActionNextDto ecommerceActionNextDto = ((EcommerceActionDto) awS3S0700000_23.l1).next;
        Object objLIZIZ = null;
        if (ecommerceActionNextDto != null) {
            obj2 = ecommerceActionNextDto.fail;
        } else {
            obj2 = null;
        }
        if ((obj2 instanceof String) && obj2 != null) {
            objLIZIZ = obj2;
        } else if (obj2 instanceof List) {
            objLIZIZ = C1487880op0.LIZIZ((List) obj2);
        }
        c1487910op32.LIZ(objLIZIZ, (Map) awS3S0700000_23.l3, mapLIZJ, (Map) awS3S0700000_23.l4, awS3S0700000_23.l5, (C1487940op6) awS3S0700000_23.l6);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS3S0700000_23 awS3S0700000_23, Object obj) throws JSONException {
        Object obj2;
        C1487910op3 c1487910op3 = (C1487910op3) awS3S0700000_23.l0;
        EcommerceActionDto ecommerceActionDto = (EcommerceActionDto) awS3S0700000_23.l1;
        Map map = (Map) awS3S0700000_23.l2;
        c1487910op3.getClass();
        Map<String, ? extends Object> mapLIZJ = C1487910op3.LIZJ(ecommerceActionDto, (Map) obj, map);
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        AwS424S0200000_23 awS424S0200000_23 = new AwS424S0200000_23((EcommerceActionDto) awS3S0700000_23.l1, (EcommerceActionDto) awS3S0700000_23.l2, (Map<String, ? extends Object>) 5);
        c2341109Fh.getClass();
        C2341109Fh.LJFF(awS424S0200000_23);
        C1487910op3 c1487910op32 = (C1487910op3) awS3S0700000_23.l0;
        EcommerceActionNextDto ecommerceActionNextDto = ((EcommerceActionDto) awS3S0700000_23.l1).next;
        Object objLIZIZ = null;
        if (ecommerceActionNextDto != null) {
            obj2 = ecommerceActionNextDto.success;
        } else {
            obj2 = null;
        }
        if ((obj2 instanceof String) && obj2 != null) {
            objLIZIZ = obj2;
        } else if (obj2 instanceof List) {
            objLIZIZ = C1487880op0.LIZIZ((List) obj2);
        }
        c1487910op32.LIZ(objLIZIZ, (Map) awS3S0700000_23.l3, mapLIZJ, (Map) awS3S0700000_23.l4, awS3S0700000_23.l5, (C1487940op6) awS3S0700000_23.l6);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS3S0700000_23(C259800zU c259800zU, C259800zU<AbstractC1522680pj8> c259800zU2, C1533790q13 c1533790q13, C259800zU<Map<String, String>> c259800zU3, C1533490q0Z c1533490q0Z, C1534070q1V c1534070q1V, C259800zU<C1534110q1Z> c259800zU4, C259800zU<C1534110q1Z> c259800zU5) {
        super(1);
        this.$t = c259800zU5;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = c1533790q13;
        this.l3 = c259800zU3;
        this.l4 = c1533490q0Z;
        this.l5 = c1534070q1V;
        this.l6 = c259800zU4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S0700000_23(C1487940op6 c1487940op6, C1487910op3 c1487910op3, EcommerceActionDto ecommerceActionDto, Object obj, Map map, Map map2, Map map3, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1487910op3;
        this.l1 = ecommerceActionDto;
        this.l2 = map;
        this.l3 = map2;
        this.l4 = map3;
        this.l5 = obj;
        this.l6 = c1487940op6;
    }
}
