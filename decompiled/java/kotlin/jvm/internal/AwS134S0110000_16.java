package kotlin.jvm.internal;

import X.C09AY;
import X.C1023960ckk;
import X.C1055330dZL;
import X.C1055340dZM;
import X.C1563370qml;
import X.C19322810ig;
import X.C19EG;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C814420VxA;
import X.EnumC682280QpW;
import X.InterfaceC1008670cM5;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.main.assems.main.MainActivityLogAssem;
import com.ss.android.ugc.aweme.tracker.TrackerImpl;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes17.dex */
public class AwS134S0110000_16 extends C09AY implements Function0 {
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
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS134S0110000_16 awS134S0110000_16) {
        C1055330dZL c1055330dZL;
        C1055340dZM c1055340dZM = (C1055340dZM) awS134S0110000_16.l0;
        if (c1055340dZM.LIZJ && (c1055330dZL = c1055340dZM.LIZ) != null) {
            boolean z = awS134S0110000_16.z1;
            if (c1055330dZL.LJI != -1) {
                c1055330dZL.logAd(c1055330dZL.LJIIJJI, new AwS103S0110000_16(z, c1055330dZL, 0));
                c1055330dZL.LJI = -1L;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS134S0110000_16 awS134S0110000_16) {
        C1023960ckk c1023960ckk;
        C1055330dZL c1055330dZL = ((C1055340dZM) awS134S0110000_16.l0).LIZ;
        if (c1055330dZL != null) {
            if (awS134S0110000_16.z1) {
                c1055330dZL.LJ = System.currentTimeMillis();
                c1023960ckk = c1055330dZL.LJIIL;
            } else {
                if (c1055330dZL.LJ != -1) {
                    c1055330dZL.LIZLLL += System.currentTimeMillis() - c1055330dZL.LJ;
                    c1055330dZL.LJ = -1L;
                }
                c1023960ckk = c1055330dZL.LJIILIIL;
            }
            c1055330dZL.logAd(c1023960ckk);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS134S0110000_16 awS134S0110000_16) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReleaseInstance ");
        sbLIZ.append((MainActivityLogAssem) awS134S0110000_16.l0);
        sbLIZ.append(' ');
        sbLIZ.append(awS134S0110000_16.z1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS134S0110000_16 awS134S0110000_16) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStop ");
        sbLIZ.append((MainActivityLogAssem) awS134S0110000_16.l0);
        sbLIZ.append(" isConfigurationChanging=");
        sbLIZ.append(awS134S0110000_16.z1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(AwS134S0110000_16 awS134S0110000_16) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((TrackerImpl) awS134S0110000_16.l0).LLILLJJLI);
        sbLIZ.append(" end render with all lcp node finish end, manual = ");
        sbLIZ.append(awS134S0110000_16.z1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$5(AwS134S0110000_16 awS134S0110000_16) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((TrackerImpl) awS134S0110000_16.l0).LLILLJJLI);
        sbLIZ.append(" end render, start listen lcp, manual = ");
        sbLIZ.append(awS134S0110000_16.z1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$6(AwS134S0110000_16 awS134S0110000_16) {
        C19EG activity = ((Fragment) awS134S0110000_16.l0).getActivity();
        if (activity != null) {
            return C1563370qml.LIZ(activity, EnumC682280QpW.MAIN, new AwS124S0110000_6((Fragment) awS134S0110000_16.l0, awS134S0110000_16.z1, 0));
        }
        return null;
    }

    public static final Object invoke$7(AwS134S0110000_16 awS134S0110000_16) {
        C19EG activity = ((Fragment) awS134S0110000_16.l0).getActivity();
        if (activity != null) {
            return C1563370qml.LIZ(activity, EnumC682280QpW.MAIN, new AwS124S0110000_6((Fragment) awS134S0110000_16.l0, awS134S0110000_16.z1, 1));
        }
        return null;
    }

    public static final Object invoke$8(AwS134S0110000_16 awS134S0110000_16) {
        InterfaceC1008670cM5 interfaceC1008670cM5;
        if (!awS134S0110000_16.z1 && (interfaceC1008670cM5 = (InterfaceC1008670cM5) awS134S0110000_16.l0) != null) {
            interfaceC1008670cM5.enable(true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS134S0110000_16 awS134S0110000_16) {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(27));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        if (awS134S0110000_16.z1) {
            ((C19322810ig) awS134S0110000_16.l0).getShapeContentContainer().setPadding(iLIZIZ2, ((C19322810ig) awS134S0110000_16.l0).getShapeContentContainer().getPaddingTop(), iLIZIZ, ((C19322810ig) awS134S0110000_16.l0).getShapeContentContainer().getPaddingBottom());
        } else {
            ((C19322810ig) awS134S0110000_16.l0).getShapeContentContainer().setPadding(iLIZIZ, ((C19322810ig) awS134S0110000_16.l0).getShapeContentContainer().getPaddingTop(), iLIZIZ2, ((C19322810ig) awS134S0110000_16.l0).getShapeContentContainer().getPaddingBottom());
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS134S0110000_16(Fragment fragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = fragment;
        this.z1 = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS134S0110000_16(C1055340dZM c1055340dZM, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1055340dZM;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS134S0110000_16(MainActivityLogAssem mainActivityLogAssem, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = mainActivityLogAssem;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS134S0110000_16(TrackerImpl trackerImpl, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = trackerImpl;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS134S0110000_16(boolean z, InterfaceC1008670cM5 interfaceC1008670cM5, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = interfaceC1008670cM5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS134S0110000_16(boolean z, C19322810ig c19322810ig, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = c19322810ig;
    }
}
