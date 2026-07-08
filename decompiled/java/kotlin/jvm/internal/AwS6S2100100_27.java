package kotlin.jvm.internal;

import X.C09AY;
import X.C1786680waw;
import X.C1786910wbJ;
import X.C1788740weG;
import X.C1789660wfk;
import X.C2097608Jq;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public class AwS6S2100100_27 extends C09AY implements Function1 {
    public final int $t;
    public long j3;
    public Object l2;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AwS6S2100100_27 awS6S2100100_27, Object obj) {
        String str;
        Integer numValueOf;
        C1786680waw c1786680waw;
        C1789660wfk c1789660wfk = (C1789660wfk) obj;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair(c1789660wfk.LIZIZ, awS6S2100100_27.s0);
        pairArr[1] = new Pair(c1789660wfk.LIZJ, awS6S2100100_27.s1);
        pairArr[2] = new Pair(c1789660wfk.LIZLLL, String.valueOf(System.currentTimeMillis() - awS6S2100100_27.j3));
        String str2 = c1789660wfk.LJ;
        Throwable th = (Throwable) awS6S2100100_27.l2;
        String strValueOf = CardStruct.IStatusCode.DEFAULT;
        if (th == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "201";
        }
        pairArr[3] = new Pair(str2, str);
        String str3 = c1789660wfk.LJFF;
        Throwable th2 = (Throwable) awS6S2100100_27.l2;
        String message = null;
        if (th2 != null) {
            if ((th2 instanceof C1786680waw) && (c1786680waw = (C1786680waw) th2) != null) {
                numValueOf = Integer.valueOf(c1786680waw.getErrorCode());
            } else {
                numValueOf = null;
            }
            strValueOf = String.valueOf(numValueOf);
        }
        pairArr[4] = new Pair(str3, strValueOf);
        String str4 = c1789660wfk.LJI;
        Throwable th3 = (Throwable) awS6S2100100_27.l2;
        if ((th3 instanceof C1786680waw) && th3 != null) {
            message = th3.getMessage();
        }
        pairArr[5] = new Pair(str4, message);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public static final Object invoke$1(AwS6S2100100_27 awS6S2100100_27, Object obj) {
        Integer numValueOf;
        C1788740weG c1788740weG = (C1788740weG) obj;
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair(c1788740weG.LIZJ, awS6S2100100_27.s0);
        pairArr[1] = new Pair(c1788740weG.LIZIZ, awS6S2100100_27.s1);
        String str = c1788740weG.LJ;
        C1786910wbJ c1786910wbJ = (C1786910wbJ) awS6S2100100_27.l2;
        String errorMessage = null;
        if (c1786910wbJ != null) {
            numValueOf = Integer.valueOf(c1786910wbJ.getErrorCode());
        } else {
            numValueOf = null;
        }
        pairArr[2] = new Pair(str, String.valueOf(numValueOf));
        String str2 = c1788740weG.LJFF;
        C1786910wbJ c1786910wbJ2 = (C1786910wbJ) awS6S2100100_27.l2;
        if (c1786910wbJ2 != null) {
            errorMessage = c1786910wbJ2.getErrorMessage();
        }
        pairArr[3] = new Pair(str2, errorMessage);
        pairArr[4] = new Pair(c1788740weG.LJI, String.valueOf(awS6S2100100_27.j3));
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S2100100_27(long j, C1786910wbJ c1786910wbJ, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = c1786910wbJ;
        this.j3 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S2100100_27(Throwable th, String str, String str2, long j, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.j3 = j;
        this.l2 = th;
    }
}
