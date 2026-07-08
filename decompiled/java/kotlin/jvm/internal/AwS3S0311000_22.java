package kotlin.jvm.internal;

import X.C09AY;
import X.C0ET4;
import X.C1422560n7e;
import X.C1422960n8I;
import X.C1422980n8K;
import X.C1424180nAG;
import X.C1424220nAK;
import X.C559610Lx9;
import android.os.SystemClock;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public class AwS3S0311000_22 extends C09AY implements Function1 {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS3S0311000_22 awS3S0311000_22, Object obj) {
        String str;
        String strLIZIZ;
        long jUptimeMillis = SystemClock.uptimeMillis();
        C1424220nAK c1424220nAK = (C1424220nAK) awS3S0311000_22.l1;
        C1422560n7e c1422560n7e = (C1422560n7e) awS3S0311000_22.l2;
        if (c1422560n7e.LLJJIII == 3) {
            str = "create_tab_search_result_page";
        } else {
            str = "create_tab_template_detail";
        }
        int i = awS3S0311000_22.i4;
        boolean z = awS3S0311000_22.z3;
        C1422960n8I c1422960n8IN5 = c1422560n7e.n5();
        if (c1422960n8IN5 != null) {
            strLIZIZ = c1422960n8IN5.LIZIZ(awS3S0311000_22.z3);
        } else {
            strLIZIZ = null;
        }
        C1424180nAG c1424180nAG = new C1424180nAG(c1424220nAK, str, i, z, strLIZIZ);
        ((C559610Lx9) awS3S0311000_22.l0).getClass();
        c1424180nAG.afterInit$als_release(jUptimeMillis);
        return c1424180nAG;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS3S0311000_22 awS3S0311000_22, Object obj) {
        String strLIZIZ;
        long jUptimeMillis = SystemClock.uptimeMillis();
        C1422960n8I c1422960n8I = ((C1422980n8K) awS3S0311000_22.l1).LLJLILLLLZIIL;
        if (c1422960n8I != null) {
            strLIZIZ = c1422960n8I.LIZIZ(awS3S0311000_22.z3);
        } else {
            strLIZIZ = null;
        }
        C1424180nAG c1424180nAG = new C1424180nAG((C1424220nAK) awS3S0311000_22.l2, "create_tab", awS3S0311000_22.i4, awS3S0311000_22.z3, strLIZIZ);
        ((C559610Lx9) awS3S0311000_22.l0).getClass();
        c1424180nAG.afterInit$als_release(jUptimeMillis);
        return c1424180nAG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S0311000_22(C0ET4 c0et4, C559610Lx9 c559610Lx9, C1422980n8K c1422980n8K, boolean z, C1424220nAK c1424220nAK, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c559610Lx9;
        this.l1 = c1422980n8K;
        this.z3 = z;
        this.l2 = c1424220nAK;
        this.i4 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S0311000_22(C0ET4 c0et4, C559610Lx9 c559610Lx9, C1424220nAK c1424220nAK, C1422560n7e c1422560n7e, int i, boolean z, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c559610Lx9;
        this.l1 = c1424220nAK;
        this.l2 = c1422560n7e;
        this.i4 = i;
        this.z3 = z;
    }
}
