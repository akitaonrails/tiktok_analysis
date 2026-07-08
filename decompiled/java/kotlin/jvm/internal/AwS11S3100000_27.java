package kotlin.jvm.internal;

import X.C09AY;
import com.bytedance.i18n.region.RegionManager;
import com.google.gson.n;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes28.dex */
public class AwS11S3100000_27 extends C09AY implements Function0 {
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

    public static final Object invoke$0(AwS11S3100000_27 awS11S3100000_27) {
        n nVarLIZJ = ((RegionManager) awS11S3100000_27.l3).LIZJ(awS11S3100000_27.s0, awS11S3100000_27.s1);
        if (nVarLIZJ == null) {
            return ((RegionManager) awS11S3100000_27.l3).LJ(awS11S3100000_27.s0, awS11S3100000_27.s1, awS11S3100000_27.s2).LIZ;
        }
        return nVarLIZJ;
    }

    public static final Object invoke$1(AwS11S3100000_27 awS11S3100000_27) {
        n nVarLIZJ = ((RegionManager) awS11S3100000_27.l3).LIZJ(awS11S3100000_27.s0, awS11S3100000_27.s1);
        if (nVarLIZJ == null) {
            return ((RegionManager) awS11S3100000_27.l3).LJ(awS11S3100000_27.s0, awS11S3100000_27.s1, awS11S3100000_27.s2).LIZ;
        }
        return nVarLIZJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS11S3100000_27(RegionManager regionManager, String str, String str2, String str3, int i) {
        super(0);
        this.$t = i;
        this.l3 = regionManager;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
    }
}
