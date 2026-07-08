package kotlin.jvm.internal;

import X.C09AY;
import X.C0A43;
import X.C0ISJ;
import X.C0J37;
import X.C0J38;
import X.C0J67;
import X.C0PEM;
import X.C1537480q70;
import X.C1619720sFe;
import X.C1893370zN1;
import X.C1893470zNB;
import X.C1893540zNI;
import X.C19EG;
import X.C1DFH;
import X.C20743716Ff;
import X.C2107308Nj;
import X.C23250099c;
import X.C499490JiN;
import X.C771670UOv;
import X.C817503Hh;
import X.InterfaceC1541990qEH;
import com.bytedance.android.livesdk.signaling.model.BaseDownlinkData;
import com.bytedance.android.livesdk.signaling.model.UplinkMessageResponse;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.touchpoint.core.crossplatform.IncentiveTaskPageFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public class AwS125S0110000_7 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS125S0110000_7 awS125S0110000_7) {
        C0J67.LIZ(awS125S0110000_7.z1, (UplinkMessageResponse) awS125S0110000_7.l0, null);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS125S0110000_7 awS125S0110000_7) {
        C1893370zN1 c1893370zN1;
        SparkContext sparkContext;
        InterfaceC1541990qEH kitView;
        C1537480q70 hybridContext = null;
        if (awS125S0110000_7.z1) {
            C817503Hh c817503Hh = C817503Hh.LL;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C0J38((IncentiveTaskPageFragment) awS125S0110000_7.l0, null), 2);
        } else {
            C817503Hh c817503Hh2 = C817503Hh.LL;
            C1DFH c1dfh2 = C0PEM.LIZ;
            C23250099c.LIZLLL(c817503Hh2, C2107308Nj.LIZ, null, new C0J37((IncentiveTaskPageFragment) awS125S0110000_7.l0, null), 2);
            SparkFragment sparkFragment = (SparkFragment) ((IncentiveTaskPageFragment) awS125S0110000_7.l0).LL.getValue();
            if (sparkFragment != null && (kitView = sparkFragment.getKitView()) != null) {
                hybridContext = kitView.getHybridContext();
            }
            if ((hybridContext instanceof SparkContext) && (sparkContext = (SparkContext) hybridContext) != null) {
                if (((Number) C0A43.LIZ.getValue()).intValue() > 0) {
                    C1893470zNB.LIZIZ.LJ(sparkContext, "pa_incentive");
                } else {
                    C1893470zNB.LIZIZ.getClass();
                    C1893470zNB.LJIIIZ(sparkContext);
                    C1893540zNI.LIZ.getClass();
                    C1893540zNI.LIZ(sparkContext, true);
                }
            }
            C19EG activity = ((IncentiveTaskPageFragment) awS125S0110000_7.l0).getActivity();
            if (activity != null && (c1893370zN1 = (C1893370zN1) C1619720sFe.LIZ.LIZ(1003)) != null) {
                c1893370zN1.LIZIZ(activity);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS125S0110000_7 awS125S0110000_7) {
        ((C20743716Ff) awS125S0110000_7.l0).setChecked(!awS125S0110000_7.z1);
        ((C20743716Ff) awS125S0110000_7.l0).setEnabled(true);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS125S0110000_7 awS125S0110000_7) {
        int i = 1;
        ((C20743716Ff) awS125S0110000_7.l0).setEnabled(true);
        C499490JiN c499490JiNLIZJ = C771670UOv.LIZJ();
        if (c499490JiNLIZJ != null) {
            if (!awS125S0110000_7.z1) {
                i = 2;
            }
            c499490JiNLIZJ.LIZ = Integer.valueOf(i);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS125S0110000_7 awS125S0110000_7) {
        C0ISJ c0isj = (C0ISJ) awS125S0110000_7.l0;
        c0isj.LLLLLLJ = false;
        c0isj.LJJJJJ(10);
        if (awS125S0110000_7.z1 && ((C0ISJ) awS125S0110000_7.l0).LJJJJL()) {
            ((C0ISJ) awS125S0110000_7.l0).LJJJJLI().LIZ();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S0110000_7(C0ISJ c0isj, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0isj;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S0110000_7(C20743716Ff c20743716Ff, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c20743716Ff;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS125S0110000_7(boolean z, IncentiveTaskPageFragment incentiveTaskPageFragment, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = incentiveTaskPageFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS125S0110000_7(boolean z, boolean z2, UplinkMessageResponse uplinkMessageResponse, BaseDownlinkData baseDownlinkData) {
        super(0);
        this.$t = baseDownlinkData;
        this.z1 = z;
        this.l0 = z2;
    }
}
