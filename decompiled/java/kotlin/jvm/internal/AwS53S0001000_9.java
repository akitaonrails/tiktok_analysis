package kotlin.jvm.internal;

import X.AbstractC1387200mCc;
import X.C098200Yq;
import X.C09AY;
import X.C0NWL;
import X.C0X35;
import X.C13LZ;
import X.C189200o6;
import X.C1906580ziK;
import X.C2188811AlT;
import X.C587360N1y;
import X.C632670Orh;
import X.C786410Ut5;
import X.C799570VYd;
import Y.ARunnableS3S0001000_9;
import android.app.Activity;
import android.os.Looper;
import android.provider.Settings;
import android.view.WindowManager;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.boost.CpusetManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public class AwS53S0001000_9 extends C09AY implements Function0 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f1011i0;

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
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS53S0001000_9 awS53S0001000_9) {
        C632670Orh.LIZ(awS53S0001000_9.f1011i0);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS53S0001000_9 awS53S0001000_9) {
        if (C587360N1y.LIZ().mainThreadResetDelay > 0) {
            C786410Ut5.LJLIIL(((long) C587360N1y.LIZ().mainThreadResetDelay) * 1000, C799570VYd.LIZIZ(), new ARunnableS3S0001000_9(awS53S0001000_9.f1011i0, 0));
        } else {
            int i = awS53S0001000_9.f1011i0;
            if (JatoXL.isInited()) {
                AtomicBoolean atomicBoolean = C0X35.LIZLLL;
                if (atomicBoolean.get()) {
                    CpusetManager.resetCoreBind(i);
                    atomicBoolean.set(false);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS53S0001000_9 awS53S0001000_9) {
        C632670Orh.LIZ(awS53S0001000_9.f1011i0);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS53S0001000_9 awS53S0001000_9) {
        C632670Orh.LIZ(awS53S0001000_9.f1011i0);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS53S0001000_9 awS53S0001000_9) {
        Object c098200Yq;
        if (awS53S0001000_9.f1011i0 == C0NWL.LIZJ.get() && !C0NWL.LIZLLL) {
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            Activity activityLIZIZ = null;
            if (abstractC1387200mCcLJ != null) {
                activityLIZIZ = abstractC1387200mCcLJ.LIZIZ();
            }
            if ((activityLIZIZ instanceof Activity) && activityLIZIZ != null) {
                WindowManager.LayoutParams attributes = activityLIZIZ.getWindow().getAttributes();
                float fFloatValue = attributes.screenBrightness;
                if (0.0f > fFloatValue || fFloatValue > 1.0f) {
                    C0NWL.LIZ.getClass();
                    try {
                        c098200Yq = Float.valueOf(C13LZ.LIZLLL(Settings.System.getInt(activityLIZIZ.getContentResolver(), "screen_brightness") / 255.0f, 0.0f, 1.0f));
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    Float fValueOf = Float.valueOf(0.5f);
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = fValueOf;
                    }
                    fFloatValue = ((Number) c098200Yq).floatValue();
                }
                float fLIZLLL = C13LZ.LIZLLL(fFloatValue * 0.3f, 0.0f, 1.0f);
                attributes.screenBrightness = fLIZLLL;
                activityLIZIZ.getWindow().setAttributes(attributes);
                C0NWL.LJ = fLIZLLL;
                C0NWL.LIZLLL = true;
                C0NWL.LJI = System.currentTimeMillis();
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS53S0001000_9 awS53S0001000_9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("processPopupByIntelligence.needInitPitaya1st.Round#");
        sbLIZ.append(awS53S0001000_9.f1011i0 + 1);
        sbLIZ.append("(true) - before delay; ");
        sbLIZ.append(C786410Ut5.u3());
        sbLIZ.append(" is main? ");
        sbLIZ.append(Intrinsics.LJFF(Looper.getMainLooper().getThread(), C786410Ut5.u3()));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS53S0001000_9 awS53S0001000_9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("processPopupByIntelligence.needInitPitaya1st.Round#");
        sbLIZ.append(awS53S0001000_9.f1011i0 + 1);
        sbLIZ.append("(true) - after delay; ");
        sbLIZ.append(C786410Ut5.u3());
        sbLIZ.append(" is main? ");
        sbLIZ.append(Intrinsics.LJFF(Looper.getMainLooper().getThread(), C786410Ut5.u3()));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(AwS53S0001000_9 awS53S0001000_9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("processPopupByIntelligence.needInitPitaya1st.Round#");
        sbLIZ.append(awS53S0001000_9.f1011i0 + 1);
        sbLIZ.append("(true);");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$5(AwS53S0001000_9 awS53S0001000_9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("processPopupByIntelligence.needInitPitaya1st.Round#");
        sbLIZ.append(awS53S0001000_9.f1011i0 + 1);
        sbLIZ.append("(false);");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AwS53S0001000_9 awS53S0001000_9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("processPopupByIntelligence.needInitPitaya1st.Round#");
        sbLIZ.append(awS53S0001000_9.f1011i0 + 1);
        sbLIZ.append("(true) - before delay; ");
        sbLIZ.append(C786410Ut5.u3());
        sbLIZ.append(" is main? ");
        sbLIZ.append(Intrinsics.LJFF(Looper.getMainLooper().getThread(), C786410Ut5.u3()));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(AwS53S0001000_9 awS53S0001000_9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("processPopupByIntelligence.needInitPitaya1st.Round#");
        sbLIZ.append(awS53S0001000_9.f1011i0 + 1);
        sbLIZ.append("(true) - after delay; ");
        sbLIZ.append(C786410Ut5.u3());
        sbLIZ.append(" is main? ");
        sbLIZ.append(Intrinsics.LJFF(Looper.getMainLooper().getThread(), C786410Ut5.u3()));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$8(AwS53S0001000_9 awS53S0001000_9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("processPopupByIntelligence.needInitPitaya1st.Round#");
        sbLIZ.append(awS53S0001000_9.f1011i0 + 1);
        sbLIZ.append("(true);");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$9(AwS53S0001000_9 awS53S0001000_9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("processPopupByIntelligence.needInitPitaya1st.Round#");
        sbLIZ.append(awS53S0001000_9.f1011i0 + 1);
        sbLIZ.append("(false);");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS53S0001000_9(int i, int i2) {
        super(0);
        this.$t = i2;
        this.f1011i0 = i;
    }
}
