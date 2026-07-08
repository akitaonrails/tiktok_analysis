package kotlin.jvm.internal;

import X.C09AY;
import X.C1816130xMR;
import X.C1826640xdO;
import X.C1842420y2q;
import X.C1851530yHX;
import X.C1853060yK0;
import X.C1853070yK1;
import X.C1863800ybK;
import X.C291001Au;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.UpdateSettingState;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public class AwS39S0001000_27 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f995i0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS39S0001000_27(int i, int i2) {
        super(1);
        this.$t = i2;
        this.f995i0 = i;
    }

    public static final Object invoke$0(AwS39S0001000_27 awS39S0001000_27, Object obj) {
        return C1826640xdO.LIZ((C1826640xdO) obj, null, null, Integer.valueOf(awS39S0001000_27.f995i0), null, null, 27);
    }

    public static final Object invoke$1(AwS39S0001000_27 awS39S0001000_27, Object obj) {
        return C1826640xdO.LIZ((C1826640xdO) obj, null, null, null, Integer.valueOf(awS39S0001000_27.f995i0), null, 23);
    }

    public static final Object invoke$2(AwS39S0001000_27 awS39S0001000_27, Object obj) {
        return C1851530yHX.LIZ((C1851530yHX) obj, null, null, null, null, Integer.valueOf(awS39S0001000_27.f995i0), null, null, 111);
    }

    public static final Object invoke$3(AwS39S0001000_27 awS39S0001000_27, Object obj) {
        return C1816130xMR.LIZ((C1816130xMR) obj, null, null, null, null, new C291001Au(new UpdateSettingState(true, awS39S0001000_27.f995i0)), null, null, null, 495);
    }

    public static final Object invoke$4(AwS39S0001000_27 awS39S0001000_27, Object obj) {
        return C1816130xMR.LIZ((C1816130xMR) obj, null, null, null, null, new C291001Au(new UpdateSettingState(false, awS39S0001000_27.f995i0)), null, null, null, 495);
    }

    public static final Object invoke$5(AwS39S0001000_27 awS39S0001000_27, Object obj) {
        boolean z;
        if (((AnchorPublishStruct) obj).type == awS39S0001000_27.f995i0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$6(AwS39S0001000_27 awS39S0001000_27, Object obj) {
        return C1853070yK1.LIZ((C1853070yK1) obj, null, null, null, null, null, new C291001Au(Integer.valueOf(awS39S0001000_27.f995i0)), 127);
    }

    public static final Object invoke$7(AwS39S0001000_27 awS39S0001000_27, Object obj) {
        boolean z;
        C1842420y2q c1842420y2q = (C1842420y2q) obj;
        if (c1842420y2q.LJ && c1842420y2q.LIZ.LIZIZ.type == awS39S0001000_27.f995i0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$8(AwS39S0001000_27 awS39S0001000_27, Object obj) {
        return C1853060yK0.LIZ((C1853060yK0) obj, null, null, false, null, null, null, null, false, null, null, null, null, null, awS39S0001000_27.f995i0, null, 49151);
    }

    public static final Object invoke$9(AwS39S0001000_27 awS39S0001000_27, Object obj) {
        C1863800ybK c1863800ybK = (C1863800ybK) obj;
        c1863800ybK.LJFF = Long.valueOf(System.currentTimeMillis());
        c1863800ybK.LJIIIZ = Integer.valueOf(awS39S0001000_27.f995i0);
        return Unit.LIZ;
    }
}
