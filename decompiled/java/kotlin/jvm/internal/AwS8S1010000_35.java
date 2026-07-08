package kotlin.jvm.internal;

import X.C09AY;
import X.C1002190cBd;
import X.C1023640ckE;
import X.C123100dR;
import X.C2265501Dls;
import X.C2265511Dlt;
import X.C2265531Dlv;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes36.dex */
public class AwS8S1010000_35 extends C09AY implements Function1 {
    public final int $t;
    public String s0;
    public boolean z1;

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

    public static final Object invoke$0(AwS8S1010000_35 awS8S1010000_35, Object obj) {
        long j;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2265531Dlv.LIZ.getClass();
        c1023640ckE.withParam(C2265531Dlv.LJJIIJZLJL, awS8S1010000_35.s0);
        C1002190cBd c1002190cBd = C2265531Dlv.LJIIIZ;
        if (awS8S1010000_35.z1) {
            j = 1;
        } else {
            j = 0;
        }
        c1023640ckE.withParam(c1002190cBd, Long.valueOf(j));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS8S1010000_35 awS8S1010000_35, Object obj) {
        String str;
        String str2;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2265501Dls.LIZ.getClass();
        C1002190cBd c1002190cBd = C2265501Dls.LIZJ;
        if (awS8S1010000_35.z1) {
            str = "act";
        } else {
            str = "boc";
        }
        c1023640ckE.withParam(c1002190cBd, str);
        c1023640ckE.withParam(C2265501Dls.LIZLLL, awS8S1010000_35.s0);
        C1002190cBd c1002190cBd2 = C2265501Dls.LIZIZ;
        if (C123100dR.LIZ(awS8S1010000_35.s0)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c1023640ckE.withParam(c1002190cBd2, str2);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS8S1010000_35 awS8S1010000_35, Object obj) {
        String str;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2265511Dlt.LIZ.getClass();
        C1002190cBd c1002190cBd = C2265511Dlt.LIZIZ;
        if (awS8S1010000_35.z1) {
            str = "act";
        } else {
            str = "boc";
        }
        c1023640ckE.withParam(c1002190cBd, str);
        c1023640ckE.withParam(C2265511Dlt.LIZJ, awS8S1010000_35.s0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS8S1010000_35(String str, boolean z, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS8S1010000_35(boolean z, String str, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.s0 = str;
    }
}
