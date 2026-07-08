package kotlin.jvm.internal;

import X.C09AY;
import X.C1387490mD5;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public class AwS3S3100000_6 extends C09AY implements Function1 {
    public final int $t;
    public Object l3;
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

    public static final Object invoke$0(AwS3S3100000_6 awS3S3100000_6, Object obj) {
        C1387490mD5.LJFF(false, (Aweme) awS3S3100000_6.l3, awS3S3100000_6.s0, awS3S3100000_6.s1, awS3S3100000_6.s2, null, 224);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS3S3100000_6 awS3S3100000_6, Object obj) {
        C1387490mD5.LJFF(false, (Aweme) awS3S3100000_6.l3, awS3S3100000_6.s0, awS3S3100000_6.s1, awS3S3100000_6.s2, null, 224);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S3100000_6(String str, String str2, String str3, Aweme aweme, int i) {
        super(1);
        this.$t = i;
        this.l3 = aweme;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
    }
}
