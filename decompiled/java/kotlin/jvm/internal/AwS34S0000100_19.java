package kotlin.jvm.internal;

import X.C09AY;
import X.C1218150hnx;
import X.C1235970iGh;
import X.C1258560ir8;
import X.C291001Au;
import X.C627660Ojc;
import com.ss.android.ugc.now.interaction.assem.LikeItem;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public class AwS34S0000100_19 extends C09AY implements Function1 {
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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS34S0000100_19(long j, int i) {
        super(1);
        this.$t = i;
        this.j0 = j;
    }

    public static final Object invoke$0(AwS34S0000100_19 awS34S0000100_19, Object obj) {
        C1218150hnx c1218150hnx = (C1218150hnx) obj;
        C291001Au c291001Au = new C291001Au(Long.valueOf(awS34S0000100_19.j0));
        C627660Ojc<LikeItem> c627660Ojc = c1218150hnx.LL;
        c1218150hnx.getClass();
        return new C1218150hnx(c291001Au, c627660Ojc);
    }

    public static final Object invoke$1(AwS34S0000100_19 awS34S0000100_19, Object obj) {
        return C1258560ir8.LIZ((C1258560ir8) obj, null, null, null, null, null, null, null, false, null, new C291001Au(Long.valueOf(awS34S0000100_19.j0)), 1023);
    }

    public static final Object invoke$2(AwS34S0000100_19 awS34S0000100_19, Object obj) {
        return C1235970iGh.LIZ((C1235970iGh) obj, awS34S0000100_19.j0, null, null, null, 14);
    }
}
