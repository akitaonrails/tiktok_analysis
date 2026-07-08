package kotlin.jvm.internal;

import X.AbstractC1864010ybf;
import X.C09AY;
import X.C1318505Dz;
import X.C1786680waw;
import X.C1789460wfQ;
import X.C1789610wff;
import X.C1789650wfj;
import X.C1856090yOt;
import X.C2097608Jq;
import X.EnumC1864410ycJ;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public class AwS3S1300100_27 extends C09AY implements Function1 {
    public final int $t;
    public long j4;
    public Object l1;
    public Object l2;
    public Object l3;
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

    public static final Object invoke$0(AwS3S1300100_27 awS3S1300100_27, Object obj) {
        String str;
        Integer numValueOf;
        C1786680waw c1786680waw;
        C1789650wfj c1789650wfj = (C1789650wfj) obj;
        Pair[] pairArr = new Pair[6];
        String str2 = c1789650wfj.LIZIZ;
        C1789610wff c1789610wff = (C1789610wff) awS3S1300100_27.l1;
        C1789460wfQ c1789460wfQ = (C1789460wfQ) awS3S1300100_27.l2;
        c1789610wff.getClass();
        pairArr[0] = new Pair(str2, C1789610wff.LIZIZ(c1789460wfQ));
        pairArr[1] = new Pair(c1789650wfj.LIZJ, awS3S1300100_27.s0);
        pairArr[2] = new Pair(c1789650wfj.LIZLLL, String.valueOf(System.currentTimeMillis() - awS3S1300100_27.j4));
        String str3 = c1789650wfj.LJ;
        Throwable th = (Throwable) awS3S1300100_27.l3;
        String strValueOf = CardStruct.IStatusCode.DEFAULT;
        if (th == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "201";
        }
        pairArr[3] = new Pair(str3, str);
        String str4 = c1789650wfj.LJFF;
        Throwable th2 = (Throwable) awS3S1300100_27.l3;
        String message = null;
        if (th2 != null) {
            if ((th2 instanceof C1786680waw) && (c1786680waw = (C1786680waw) th2) != null) {
                numValueOf = Integer.valueOf(c1786680waw.getErrorCode());
            } else {
                numValueOf = null;
            }
            strValueOf = String.valueOf(numValueOf);
        }
        pairArr[4] = new Pair(str4, strValueOf);
        String str5 = c1789650wfj.LJI;
        Throwable th3 = (Throwable) awS3S1300100_27.l3;
        if ((th3 instanceof C1786680waw) && th3 != null) {
            message = th3.getMessage();
        }
        pairArr[5] = new Pair(str5, message);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public static final Object invoke$1(AwS3S1300100_27 awS3S1300100_27, Object obj) {
        AbstractC1864010ybf abstractC1864010ybf = (AbstractC1864010ybf) obj;
        abstractC1864010ybf.LIZ = awS3S1300100_27.j4;
        abstractC1864010ybf.LJFF(EnumC1864410ycJ.FULL_SCREEN, AFwS274S0000000_30.get$arr$(30));
        C1318505Dz c1318505Dz = (C1318505Dz) awS3S1300100_27.l1;
        abstractC1864010ybf.LIZJ(c1318505Dz.LIZ, "click_tryon", new AwS63S1300000_27((List) awS3S1300100_27.l2, (List<String>) c1318505Dz, (C1318505Dz) awS3S1300100_27.l3, (C1856090yOt) awS3S1300100_27.s0, (String) 0));
        abstractC1864010ybf.LIZLLL(new AwS110S1200000_27((C1856090yOt) awS3S1300100_27.l3, (C1318505Dz) awS3S1300100_27.l1, awS3S1300100_27.s0, 0));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0003: IPUT (r3 I:long), (r1 I:kotlin.jvm.internal.AwS3S1300100_27) (LINE:100663299) kotlin.jvm.internal.AwS3S1300100_27.j4 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0005: IPUT (r5 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS3S1300100_27) (LINE:100663301) kotlin.jvm.internal.AwS3S1300100_27.l1 java.lang.Object, block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.09AY, kotlin.jvm.internal.AwS3S1300100_27] */
    public AwS3S1300100_27(long j, long j2, C1318505Dz c1318505Dz, List<String> list, C1856090yOt c1856090yOt, String str) {
        long j3;
        Object obj;
        c09ay.$t = str;
        c09ay.j4 = j3;
        c09ay.l1 = obj;
        c09ay.l2 = c1318505Dz;
        c09ay.l3 = list;
        c09ay.s0 = c1856090yOt;
        ?? c09ay = new C09AY(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S1300100_27(C1789610wff c1789610wff, C1789460wfQ c1789460wfQ, String str, long j, Throwable th, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1789610wff;
        this.l2 = c1789460wfQ;
        this.s0 = str;
        this.j4 = j;
        this.l3 = th;
    }
}
