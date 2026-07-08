package kotlin.jvm.internal;

import X.C09AY;
import X.C1174440gfS;
import X.C1174450gfT;
import X.C1440005kM;
import X.C614900O9w;
import com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseActivityAssem;
import com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiLandmark;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class AwS7S3100000_18 extends C09AY implements Function1 {
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
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS7S3100000_18 awS7S3100000_18, Object obj) {
        return C1174440gfS.LIZ((C1174440gfS) obj, null, null, new C1174450gfT(awS7S3100000_18.s0, (PoiLandmark) awS7S3100000_18.l3, awS7S3100000_18.s1, awS7S3100000_18.s2), 3);
    }

    public static final Object invoke$1(AwS7S3100000_18 awS7S3100000_18, Object obj) {
        C1440005kM.LIZ(new C614900O9w(((Boolean) obj).booleanValue(), awS7S3100000_18.s0, awS7S3100000_18.s1, awS7S3100000_18.s2, String.valueOf(((PoiCollectStatusBaseActivityAssem) awS7S3100000_18.l3).hashCode()), false, false, false, false, 480));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS7S3100000_18 awS7S3100000_18, Object obj) {
        C1440005kM.LIZ(new C614900O9w(((Boolean) obj).booleanValue(), awS7S3100000_18.s0, awS7S3100000_18.s1, awS7S3100000_18.s2, String.valueOf(((PoiCollectStatusBaseAssem) awS7S3100000_18.l3).hashCode()), false, false, false, false, 480));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S3100000_18(String str, PoiLandmark poiLandmark, String str2, String str3, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l3 = poiLandmark;
        this.s1 = str2;
        this.s2 = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S3100000_18(String str, String str2, String str3, PoiCollectStatusBaseActivityAssem poiCollectStatusBaseActivityAssem, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.l3 = poiCollectStatusBaseActivityAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S3100000_18(String str, String str2, String str3, PoiCollectStatusBaseAssem poiCollectStatusBaseAssem, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.l3 = poiCollectStatusBaseAssem;
    }
}
