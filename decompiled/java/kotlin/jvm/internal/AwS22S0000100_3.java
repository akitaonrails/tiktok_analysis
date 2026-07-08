package kotlin.jvm.internal;

import X.C09AY;
import X.C0OPQ;
import X.C1899307cF;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2344009Gk;
import java.io.File;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.u;

/* JADX INFO: loaded from: classes4.dex */
public class AwS22S0000100_3 extends C09AY implements Function1 {
    public final int $t;
    public long j0;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS22S0000100_3(long j, int i) {
        super(1);
        this.$t = i;
        this.j0 = j;
    }

    public static final Object invoke$0(AwS22S0000100_3 awS22S0000100_3, Object obj) {
        if (obj == null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - awS22S0000100_3.j0;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
            C20684815ws.LJIILLIIL("comment_external_share_acl_cost", c2344009Gk.LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS22S0000100_3 awS22S0000100_3, Object obj) {
        C0OPQ c0opq = C0OPQ.LIZ;
        String strValueOf = String.valueOf(awS22S0000100_3.j0);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("action_type", "click"), new Pair("click_type", "cancel"));
        c0opq.getClass();
        C0OPQ.LJIIJJI(strValueOf, mapLJIIIIZZ);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS22S0000100_3 awS22S0000100_3, Object obj) {
        File file = (File) obj;
        boolean z = false;
        if (!u.LJIIZILJ(file.getName(), ".published", false) && file.lastModified() < awS22S0000100_3.j0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$3(AwS22S0000100_3 awS22S0000100_3, Object obj) {
        boolean z;
        if (((C1899307cF) ((Map.Entry) obj).getValue()).LIZ <= awS22S0000100_3.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
