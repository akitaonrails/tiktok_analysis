package kotlin.jvm.internal;

import X.C09AY;
import X.C0HTT;
import X.C1387490mD5;
import X.C1397620mTQ;
import X.C737030Svd;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public class AwS0S3310000_6 extends C09AY implements Function1 {
    public final int $t;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;
    public String s1;
    public String s2;
    public boolean z6;

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

    public static final Object invoke$0(AwS0S3310000_6 awS0S3310000_6, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJ(2131830529, new AwS0S3310000_6((C0HTT) awS0S3310000_6.l3, (Aweme) awS0S3310000_6.l4, awS0S3310000_6.z6, (Function0) awS0S3310000_6.l5, awS0S3310000_6.s0, awS0S3310000_6.s1, awS0S3310000_6.s2, 1));
        c1397620mTQ.LJII(R.string.f1_, new AwS3S3100000_6(awS0S3310000_6.s0, awS0S3310000_6.s1, awS0S3310000_6.s2, (Aweme) awS0S3310000_6.l4, 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S3310000_6 awS0S3310000_6, Object obj) {
        C0HTT c0htt = (C0HTT) awS0S3310000_6.l3;
        if (c0htt != null) {
            C737030Svd c737030Svd = new C737030Svd(2, (Aweme) awS0S3310000_6.l4);
            c737030Svd.LJIJ = Boolean.valueOf(awS0S3310000_6.z6);
            c0htt.LLIIL(c737030Svd);
        }
        Function0 function0 = (Function0) awS0S3310000_6.l5;
        if (function0 != null) {
            function0.invoke();
        }
        C1387490mD5.LJFF(true, (Aweme) awS0S3310000_6.l4, awS0S3310000_6.s0, awS0S3310000_6.s1, awS0S3310000_6.s2, null, 224);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S3310000_6(C0HTT c0htt, C0HTT<C737030Svd> c0htt2, Aweme aweme, boolean z, Function0<Unit> function0, String str, String str2, String str3) {
        super(1);
        this.$t = str3;
        this.l3 = c0htt;
        this.l4 = c0htt2;
        this.z6 = aweme;
        this.l5 = z;
        this.s0 = function0;
        this.s1 = str;
        this.s2 = str2;
    }
}
