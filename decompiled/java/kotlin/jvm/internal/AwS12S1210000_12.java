package kotlin.jvm.internal;

import X.C09AY;
import X.C0HTT;
import X.C1375980luW;
import X.C1387490mD5;
import X.C1397620mTQ;
import X.C1397660mTU;
import X.C737030Svd;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public class AwS12S1210000_12 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

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

    public static final Object invoke$0(AwS12S1210000_12 awS12S1210000_12, Object obj) {
        C1397660mTU c1397660mTU = (C1397660mTU) obj;
        C0HTT<C737030Svd> c0htt = ((C1375980luW) awS12S1210000_12.l1).LLILZLL.get();
        if (c0htt != null) {
            C737030Svd c737030Svd = new C737030Svd(2, (Aweme) awS12S1210000_12.l2);
            c737030Svd.LJIJ = Boolean.valueOf(awS12S1210000_12.z3);
            c0htt.LLIIL(c737030Svd);
        }
        C1387490mD5.LJFF(true, (Aweme) awS12S1210000_12.l2, ((C1375980luW) awS12S1210000_12.l1).LLILLJJLI, awS12S1210000_12.s0, "", null, 224);
        c1397660mTU.LIZ().LIZIZ(null);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS12S1210000_12 awS12S1210000_12, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF = true;
        c1397620mTQ.LJFF(R.string.fte, new AwS12S1210000_12((C1375980luW) awS12S1210000_12.l1, (Aweme) awS12S1210000_12.l2, awS12S1210000_12.z3, awS12S1210000_12.s0, 0));
        c1397620mTQ.LJII(2131828348, null);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS12S1210000_12(C1375980luW c1375980luW, Aweme aweme, boolean z, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1375980luW;
        this.l2 = aweme;
        this.z3 = z;
        this.s0 = str;
    }
}
