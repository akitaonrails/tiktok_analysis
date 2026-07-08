package kotlin.jvm.internal;

import X.C09AY;
import X.C20441214yg;
import X.C2188811AlT;
import X.C915980Zwa;
import X.C954460awe;
import X.C974090bSJ;
import X.C974120bSM;
import X.C974490bSx;
import X.C974990bTl;
import X.C981960bf0;
import X.C983180bgy;
import X.EnumC983140bgu;
import android.os.SystemClock;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes16.dex */
public class AwS52S0200100_15 extends C09AY implements Function2 {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS52S0200100_15 awS52S0200100_15, Object obj, Object obj2) {
        EnumC983140bgu enumC983140bgu = (EnumC983140bgu) obj;
        long jLongValue = ((Number) obj2).longValue();
        int i = C983180bgy.LIZ[enumC983140bgu.ordinal()];
        if (i != 1) {
            if (i == 2) {
                ((Function2) awS52S0200100_15.l1).invoke(enumC983140bgu, Long.valueOf(jLongValue));
            }
        } else {
            ((C981960bf0) awS52S0200100_15.l0).LJJJJLI(awS52S0200100_15.j2, jLongValue, 1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS52S0200100_15 awS52S0200100_15, Object obj, Object obj2) {
        MultiMatchPrepareResponse multiMatchPrepareResponse = (MultiMatchPrepareResponse) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        C974990bTl c974990bTl = (C974990bTl) awS52S0200100_15.l0;
        C974090bSJ c974090bSJ = (C974090bSJ) awS52S0200100_15.l1;
        c974990bTl.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("open Choose mode directly ---, params = ");
        sbLIZ.append(c974090bSJ);
        C20441214yg.LIZIZ("CompetitionAnchorLauncher", C2188811AlT.LIZIZ(sbLIZ));
        C974990bTl.LJIIIIZZ(c974990bTl, c974090bSJ.LIZIZ, c974090bSJ.LIZJ, c974090bSJ.LIZLLL, new C974120bSM(c974090bSJ, c974990bTl, listLLILZLL, multiMatchPrepareResponse), new AwS202S0000000_15(1), multiMatchPrepareResponse, null, null, 192);
        new C974490bSx().LJJIII(SystemClock.uptimeMillis() - awS52S0200100_15.j2, C915980Zwa.LJI().LJIIJ().LJJIJIIJI(), zBooleanValue);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS52S0200100_15(C974990bTl c974990bTl, C974090bSJ c974090bSJ, long j, int i) {
        super(2);
        this.$t = i;
        this.l0 = c974990bTl;
        this.l1 = c974090bSJ;
        this.j2 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS52S0200100_15(C981960bf0 c981960bf0, long j, AwS629S0100000_15 awS629S0100000_15, int i) {
        super(2);
        this.$t = i;
        this.l0 = c981960bf0;
        this.j2 = j;
        this.l1 = awS629S0100000_15;
    }
}
