package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public class AwS10S3100000_3 extends C09AY implements Function0 {
    public final int $t;
    public Object l3;
    public String s0;
    public String s1;
    public String s2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS10S3100000_3 awS10S3100000_3) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pbNaPrefetch new handler hit, path=");
        sbLIZ.append(awS10S3100000_3.s0);
        sbLIZ.append(", apiPath=");
        sbLIZ.append(awS10S3100000_3.s1);
        sbLIZ.append(", mimeType=");
        sbLIZ.append(awS10S3100000_3.s2);
        sbLIZ.append(", cached=");
        if (((Map) awS10S3100000_3.l3) != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS10S3100000_3 awS10S3100000_3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handle response uniqueId=");
        sbLIZ.append(awS10S3100000_3.s0);
        sbLIZ.append(" requestId=");
        sbLIZ.append(awS10S3100000_3.s1);
        sbLIZ.append(" apiPath=");
        sbLIZ.append(awS10S3100000_3.s2);
        sbLIZ.append(" dataKeyCount=");
        sbLIZ.append(((Map) awS10S3100000_3.l3).keySet().size());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS10S3100000_3(String str, String str2, String str3, String str4, Map<String, ? extends Object> map) {
        super(0);
        this.$t = map;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.l3 = str4;
    }
}
