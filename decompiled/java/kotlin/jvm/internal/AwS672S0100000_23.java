package kotlin.jvm.internal;

import X.C098200Yq;
import X.C09AY;
import X.C1018703yb;
import X.C1484960okI;
import X.C1487920op4;
import X.C1523090pjn;
import X.C1534030q1R;
import X.C1540870qCT;
import X.C1542120qEU;
import X.C1545590qK5;
import X.C1547880qNm;
import X.C1548760qPC;
import X.C1548800qPG;
import X.C1549940qR6;
import X.C189200o6;
import X.C2097608Jq;
import X.EnumC1502480pCY;
import X.InterfaceC1487930op5;
import X.InterfaceC1631620sYq;
import android.os.SystemClock;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes24.dex */
public class AwS672S0100000_23 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS672S0100000_23(C1484960okI c1484960okI, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1484960okI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS672S0100000_23(C1487920op4 c1487920op4, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1487920op4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS672S0100000_23(C1534030q1R c1534030q1R, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1534030q1R;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS672S0100000_23(C1540870qCT c1540870qCT, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1540870qCT;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS672S0100000_23(C1547880qNm c1547880qNm, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1547880qNm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS672S0100000_23(C1548760qPC c1548760qPC, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1548760qPC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS672S0100000_23(SparkContext sparkContext, int i) {
        super(3);
        this.$t = i;
        this.l0 = sparkContext;
    }

    public static final Object invoke$0(AwS672S0100000_23 awS672S0100000_23, Object obj, Object obj2, Object obj3) {
        ((C1484960okI) awS672S0100000_23.l0).LJIJ(((Number) obj).intValue(), ((Number) obj2).intValue(), (String) obj3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS672S0100000_23 awS672S0100000_23, Object obj, Object obj2, Object obj3) {
        return ((C1540870qCT) awS672S0100000_23.l0).LIZLLL.LJIIL().invoke(obj);
    }

    public static final Object invoke$2(AwS672S0100000_23 awS672S0100000_23, Object obj, Object obj2, Object obj3) {
        long jLongValue;
        int i;
        boolean zBooleanValue;
        String str;
        String str2 = (String) obj;
        Map map = (Map) obj2;
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        C1548760qPC c1548760qPC = (C1548760qPC) awS672S0100000_23.l0;
        c1548760qPC.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int iLIZ = C1548760qPC.LIZ(str2);
        Long l = c1548760qPC.LLILZ.get(str2);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = -1;
        }
        Object obj4 = map.get("usePreload");
        if ((obj4 instanceof String) && (str = (String) obj4) != null) {
            i = CastIntegerProtector.parseInt(str);
        } else {
            i = 0;
        }
        Boolean bool = c1548760qPC.LLIZ.get(str2);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        C1018703yb.LIZLLL("rd_tiktokec_pdp_lynx_dur", new C1548800qPG(i, iLIZ, jElapsedRealtime, jLongValue, str2, zBooleanValue2, zBooleanValue));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS672S0100000_23 awS672S0100000_23, Object obj, Object obj2, Object obj3) {
        int i;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int iIntValue = ((Number) obj2).intValue();
        byte[] bArr = (byte[]) obj3;
        if (iIntValue == 0) {
            i = 0;
        } else {
            C1534030q1R c1534030q1R = (C1534030q1R) awS672S0100000_23.l0;
            i = ((iIntValue - 1) * c1534030q1R.LJII) + c1534030q1R.LJIIJJI;
        }
        if (bArr.length + i >= ((C1534030q1R) awS672S0100000_23.l0).LJIILIIL) {
            if (zBooleanValue) {
                C1534030q1R c1534030q1R2 = (C1534030q1R) awS672S0100000_23.l0;
                c1534030q1R2.LJIILLIIL(bArr, c1534030q1R2.LJIIIZ, i);
            } else {
                ((C1534030q1R) awS672S0100000_23.l0).LJIILLIIL(bArr, bArr.length, i);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS672S0100000_23 awS672S0100000_23, Object obj, Object obj2, Object obj3) {
        int iIntValue;
        C1542120qEU c1542120qEU = (C1542120qEU) obj3;
        SparkContext sparkContext = (SparkContext) awS672S0100000_23.l0;
        int status = C1549940qR6.LIZIZ.getStatus();
        Integer num = c1542120qEU.LIZ;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        String str = c1542120qEU.LIZIZ;
        if (str == null) {
            str = "unknown";
        }
        C1523090pjn.LIZJ(sparkContext, status, iIntValue, str, 0L, 132);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS672S0100000_23 awS672S0100000_23, Object obj, Object obj2, Object obj3) {
        Object c098200Yq;
        String strLIZIZ;
        String str = (String) obj2;
        ((C1547880qNm) awS672S0100000_23.l0).getClass();
        try {
            C1545590qK5 c1545590qK5 = C1545590qK5.LIZIZ;
            if (c1545590qK5.LIZLLL(str)) {
                strLIZIZ = c1545590qK5.LIZIZ(str, C2097608Jq.LJ());
            } else {
                strLIZIZ = str;
            }
            c098200Yq = Boolean.valueOf(Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(strLIZIZ), "enable_lite_mode"), "1"));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        if (((Boolean) c098200Yq).booleanValue()) {
            return ((C1547880qNm) awS672S0100000_23.l0).LLILZIL.invoke(obj, str, obj3);
        }
        return ((C1547880qNm) awS672S0100000_23.l0).LLILZ.invoke(obj, str, obj3);
    }

    public static final Object invoke$6(AwS672S0100000_23 awS672S0100000_23, Object obj, Object obj2, Object obj3) {
        boolean z;
        Integer num = (Integer) obj;
        String str = (String) obj2;
        Map map = (Map) obj3;
        InterfaceC1487930op5 interfaceC1487930op5 = (InterfaceC1487930op5) awS672S0100000_23.l0;
        if (interfaceC1487930op5 != null) {
            int value = EnumC1502480pCY.SUCCESS.getValue();
            if (num != null && num.intValue() == value) {
                z = true;
            } else {
                z = false;
            }
            interfaceC1487930op5.LIZ(num, str, z, map);
        }
        return Unit.LIZ;
    }
}
