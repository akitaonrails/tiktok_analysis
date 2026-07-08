package kotlin.jvm.internal;

import X.C09AY;
import X.C1156670gCn;
import X.C1165480gR0;
import X.C1185430gxB;
import X.C1207400hWc;
import X.C1207520hWo;
import X.C1207920hXS;
import X.C12QB;
import X.C1716310ulR;
import X.C2097608Jq;
import X.EnumC1201990hNt;
import android.os.SystemClock;
import com.bytedance.pipo.stellar.base.card.MynaViewData;
import com.bytedance.pipo.stellar.base.model.prop.StellarActionDO;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class AwS31S0200100_18 extends C09AY implements Function1 {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS31S0200100_18 awS31S0200100_18, Object obj) {
        String str;
        C1207400hWc c1207400hWc = C1207400hWc.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis() - awS31S0200100_18.j2;
        C1207520hWo c1207520hWo = ((C1207920hXS) awS31S0200100_18.l0).LIZ;
        String str2 = null;
        if (c1207520hWo != null) {
            str = c1207520hWo.LIZ;
            str2 = c1207520hWo.LIZIZ;
        } else {
            str = null;
        }
        c1207400hWc.getClass();
        C1207400hWc.LIZJ(jCurrentTimeMillis, str, str2, true);
        ((C12QB) awS31S0200100_18.l1).LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS31S0200100_18 awS31S0200100_18, Object obj) {
        String str;
        if (obj instanceof C1156670gCn) {
            C1165480gR0 c1165480gR0 = (C1165480gR0) awS31S0200100_18.l0;
            Map<String, StellarActionDO> actionMap = ((MynaViewData) awS31S0200100_18.l1).getActionMap();
            if (actionMap == null) {
                actionMap = C2097608Jq.LJ();
            }
            c1165480gR0.LJI(actionMap);
            C1165480gR0 c1165480gR02 = (C1165480gR0) awS31S0200100_18.l0;
            long j = awS31S0200100_18.j2;
            MynaViewData mynaViewData = (MynaViewData) awS31S0200100_18.l1;
            c1165480gR02.getClass();
            C1716310ulR c1716310ulR = C1716310ulR.LIZ;
            Pair[] pairArr = new Pair[3];
            pairArr[0] = new Pair("step", "myna_render");
            pairArr[1] = new Pair("duration", Long.valueOf(System.currentTimeMillis() - j));
            if (c1165480gR02.LLILZ) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            pairArr[2] = new Pair("first_render", str);
            Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            Map<String, Object> trackingParams = mynaViewData.getTrackingParams();
            if (trackingParams != null) {
                mapLJIIJ.putAll(trackingParams);
            }
            c1716310ulR.getClass();
            C1716310ulR.LIZLLL("rd_pipo_stellar_render", mapLJIIJ);
            c1165480gR02.LLILZ = false;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS31S0200100_18 awS31S0200100_18, Object obj) {
        String str = (String) obj;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - awS31S0200100_18.j2;
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        String scene = ((EnumC1201990hNt) awS31S0200100_18.l0).getScene();
        c1185430gxB.getClass();
        C1185430gxB.LJJJJIZL(str, jElapsedRealtime, scene, true, false);
        Function1 function1 = (Function1) awS31S0200100_18.l1;
        if (function1 != null) {
            function1.invoke(str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS31S0200100_18 awS31S0200100_18, Object obj) {
        String str = (String) obj;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - awS31S0200100_18.j2;
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        String scene = ((EnumC1201990hNt) awS31S0200100_18.l0).getScene();
        c1185430gxB.getClass();
        C1185430gxB.LJJJJIZL(str, jElapsedRealtime, scene, false, true);
        Function1 function1 = (Function1) awS31S0200100_18.l1;
        if (function1 != null) {
            function1.invoke(str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS31S0200100_18 awS31S0200100_18, Object obj) {
        String str = (String) obj;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - awS31S0200100_18.j2;
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        String scene = ((EnumC1201990hNt) awS31S0200100_18.l0).getScene();
        c1185430gxB.getClass();
        C1185430gxB.LJJJJIZL(str, jElapsedRealtime, scene, false, false);
        Function1 function1 = (Function1) awS31S0200100_18.l1;
        if (function1 != null) {
            function1.invoke(str);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0003: IPUT (r3 I:long), (r1 I:kotlin.jvm.internal.AwS31S0200100_18) (LINE:67108867) kotlin.jvm.internal.AwS31S0200100_18.j2 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0005: IPUT (r5 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS31S0200100_18) (LINE:67108869) kotlin.jvm.internal.AwS31S0200100_18.l0 java.lang.Object, block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.09AY, kotlin.jvm.internal.AwS31S0200100_18] */
    public AwS31S0200100_18(long j, long j2, EnumC1201990hNt enumC1201990hNt, Function1<? super String, Unit> function1) {
        long j3;
        Object obj;
        c09ay.$t = function1;
        c09ay.j2 = j3;
        c09ay.l0 = obj;
        c09ay.l1 = enumC1201990hNt;
        ?? c09ay = new C09AY(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS31S0200100_18(long j, C1207920hXS c1207920hXS, C12QB c12qb, int i) {
        super(1);
        this.$t = i;
        this.j2 = j;
        this.l0 = c1207920hXS;
        this.l1 = c12qb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS31S0200100_18(C1165480gR0 c1165480gR0, MynaViewData mynaViewData, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1165480gR0;
        this.l1 = mynaViewData;
        this.j2 = j;
    }
}
