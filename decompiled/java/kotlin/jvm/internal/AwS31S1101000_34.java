package kotlin.jvm.internal;

import X.C09AY;
import X.C1BVD;
import X.C1BVI;
import X.C849850XVn;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes35.dex */
public class AwS31S1101000_34 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

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

    public static final Object invoke$0(AwS31S1101000_34 awS31S1101000_34, Object obj) {
        C1BVD c1bvd = C1BVD.LIZ;
        String str = awS31S1101000_34.s0;
        C1BVI c1bvi = (C1BVI) awS31S1101000_34.l1;
        int i = awS31S1101000_34.i2;
        c1bvd.getClass();
        C1BVD.LIZIZ.storeInt("not_now_time", 0);
        C1BVD.LIZIZ(str, c1bvi, i, "verify", "1");
        C1BVD.LIZJ(c1bvi);
        C849850XVn.LIZIZ.LIZJ().LJIJI("94", "positive", true);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS31S1101000_34 awS31S1101000_34, Object obj) {
        C1BVD c1bvd = C1BVD.LIZ;
        String str = awS31S1101000_34.s0;
        C1BVI c1bvi = (C1BVI) awS31S1101000_34.l1;
        int i = awS31S1101000_34.i2;
        c1bvd.getClass();
        Keva keva = C1BVD.LIZIZ;
        keva.storeInt("not_now_time", keva.getInt("not_now_time", 0) + 1);
        C1BVD.LIZIZ(str, c1bvi, i, "not_now", CardStruct.IStatusCode.DEFAULT);
        C849850XVn.LIZIZ.LIZJ().LJIJI("94", "negative", false);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS31S1101000_34 awS31S1101000_34, Object obj) {
        C1BVD c1bvd = C1BVD.LIZ;
        String str = awS31S1101000_34.s0;
        C1BVI c1bvi = (C1BVI) awS31S1101000_34.l1;
        int i = awS31S1101000_34.i2;
        c1bvd.getClass();
        C1BVD.LIZIZ.storeInt("not_now_time", 0);
        C1BVD.LIZIZ(str, c1bvi, i, "verify", "1");
        C1BVD.LIZJ(c1bvi);
        C849850XVn.LIZIZ.LIZJ().LJIJI("94", "positive", true);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS31S1101000_34(String str, C1BVI c1bvi, int i, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.l1 = c1bvi;
        this.i2 = i;
    }
}
