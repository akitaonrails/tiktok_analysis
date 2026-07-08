package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C0HTT;
import X.C1387490mD5;
import X.C1397620mTQ;
import X.C737030Svd;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public class AwS4S3400000_6 extends C09AY implements Function1 {
    public final int $t;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public String s0;
    public String s1;
    public String s2;

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

    public static final Object invoke$0(AwS4S3400000_6 awS4S3400000_6, Object obj) {
        C0HTT c0htt = (C0HTT) awS4S3400000_6.l3;
        if (c0htt != null) {
            C737030Svd c737030Svd = new C737030Svd(2, (Aweme) awS4S3400000_6.l4);
            c737030Svd.LJIJ = Boolean.valueOf(((C013C) awS4S3400000_6.l5).element);
            c0htt.LLIIL(c737030Svd);
        }
        C1387490mD5.LJFF(true, (Aweme) awS4S3400000_6.l4, awS4S3400000_6.s0, awS4S3400000_6.s1, awS4S3400000_6.s2, null, 224);
        Function0 function0 = (Function0) awS4S3400000_6.l6;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS4S3400000_6 awS4S3400000_6, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJ(2131844904, new AwS4S3400000_6((C0HTT) awS4S3400000_6.l3, (Aweme) awS4S3400000_6.l4, (C013C) awS4S3400000_6.l5, awS4S3400000_6.s0, awS4S3400000_6.s1, awS4S3400000_6.s2, (Function0) awS4S3400000_6.l6, 0));
        c1397620mTQ.LJII(2131844905, new AwS3S3100000_6(awS4S3400000_6.s0, awS4S3400000_6.s1, awS4S3400000_6.s2, (Aweme) awS4S3400000_6.l4, 0));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS4S3400000_6(C0HTT c0htt, C0HTT<C737030Svd> c0htt2, Aweme aweme, C013C c013c, String str, String str2, String str3, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l3 = c0htt;
        this.l4 = c0htt2;
        this.l5 = aweme;
        this.s0 = c013c;
        this.s1 = str;
        this.s2 = str2;
        this.l6 = str3;
    }
}
