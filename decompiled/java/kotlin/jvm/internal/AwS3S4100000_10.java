package kotlin.jvm.internal;

import X.C09AY;
import X.C1397620mTQ;
import X.C684410Qsx;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet.OpenAlertMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public class AwS3S4100000_10 extends C09AY implements Function1 {
    public final int $t;
    public Object l4;
    public String s0;
    public String s1;
    public String s2;
    public String s3;

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

    public static final Object invoke$0(AwS3S4100000_10 awS3S4100000_10, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        String str = "";
        if (!TextUtils.isEmpty(awS3S4100000_10.s0)) {
            String str2 = awS3S4100000_10.s0;
            if (str2 == null) {
                str2 = "";
            }
            c1397620mTQ.LIZJ(0, str2, new AwS124S1100000_10((OpenAlertMethod) awS3S4100000_10.l4, awS3S4100000_10.s3, 6));
        }
        if (!TextUtils.isEmpty(awS3S4100000_10.s1)) {
            c1397620mTQ.LJFF = true;
            String str3 = awS3S4100000_10.s1;
            if (str3 == null) {
                str3 = "";
            }
            c1397620mTQ.LIZJ(0, str3, new AwS124S1100000_10((OpenAlertMethod) awS3S4100000_10.l4, awS3S4100000_10.s3, 7));
        }
        if (!TextUtils.isEmpty(awS3S4100000_10.s2)) {
            String str4 = awS3S4100000_10.s2;
            if (str4 != null) {
                str = str4;
            }
            c1397620mTQ.LIZJ(1, str, new AwS124S1100000_10((OpenAlertMethod) awS3S4100000_10.l4, awS3S4100000_10.s3, 8));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS3S4100000_10 awS3S4100000_10, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        String str = "";
        if (!TextUtils.isEmpty(awS3S4100000_10.s0)) {
            String str2 = awS3S4100000_10.s0;
            if (str2 == null) {
                str2 = "";
            }
            c1397620mTQ.LIZJ(0, str2, new AwS124S1100000_10((C684410Qsx) awS3S4100000_10.l4, awS3S4100000_10.s3, 22));
        }
        if (!TextUtils.isEmpty(awS3S4100000_10.s1)) {
            c1397620mTQ.LJFF = true;
            String str3 = awS3S4100000_10.s1;
            if (str3 == null) {
                str3 = "";
            }
            c1397620mTQ.LIZJ(0, str3, new AwS124S1100000_10((C684410Qsx) awS3S4100000_10.l4, awS3S4100000_10.s3, 23));
        }
        if (!TextUtils.isEmpty(awS3S4100000_10.s2)) {
            String str4 = awS3S4100000_10.s2;
            if (str4 != null) {
                str = str4;
            }
            c1397620mTQ.LIZJ(1, str, new AwS124S1100000_10((C684410Qsx) awS3S4100000_10.l4, awS3S4100000_10.s3, 24));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S4100000_10(String str, String str2, String str3, C684410Qsx c684410Qsx, String str4, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.l4 = c684410Qsx;
        this.s3 = str4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S4100000_10(String str, String str2, String str3, OpenAlertMethod openAlertMethod, String str4, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.l4 = openAlertMethod;
        this.s3 = str4;
    }
}
