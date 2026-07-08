package kotlin.jvm.internal;

import X.C09AY;
import X.C1833500xoS;
import X.C1908260zl2;
import X.C1908300zl6;
import X.C19319810iC;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.services.edit.CachedAutoMuteStripSettingStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes29.dex */
public class AwS40S0001000_28 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f997i0;

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS40S0001000_28(int i, int i2) {
        super(1);
        this.$t = i2;
        this.f997i0 = i;
    }

    public static final Object invoke$0(AwS40S0001000_28 awS40S0001000_28, Object obj) {
        C1908260zl2 c1908260zl2 = (C1908260zl2) obj;
        c1908260zl2.LJIIIIZZ = SystemClock.uptimeMillis();
        if (awS40S0001000_28.f997i0 == 0) {
            if (c1908260zl2.LJII != 1) {
                c1908260zl2.LJII = 2;
            }
            AFwS271S0000000_28 aFwS271S0000000_28 = AFwS271S0000000_28.get$arr$(252);
            C1908260zl2 c1908260zl22 = C1908300zl6.LIZ;
            if (c1908260zl22 != null) {
                aFwS271S0000000_28.invoke(c1908260zl22);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS40S0001000_28 awS40S0001000_28, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ComplianceServiceProvider.LJIJI().LJII("kr_market_ms_d", "v20200906", "pop", null, Integer.valueOf(awS40S0001000_28.f997i0), 0, Boolean.TRUE, null, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS40S0001000_28 awS40S0001000_28, Object obj) {
        boolean z;
        C19319810iC c19319810iC = (C19319810iC) obj;
        if (awS40S0001000_28.f997i0 == CachedAutoMuteStripSettingStatus.ON.getValue()) {
            z = true;
        } else {
            z = false;
        }
        return C1833500xoS.LIZ(c19319810iC, z);
    }

    public static final Object invoke$3(AwS40S0001000_28 awS40S0001000_28, Object obj) {
        C19319810iC c19319810iC = (C19319810iC) obj;
        boolean z = true;
        if (awS40S0001000_28.f997i0 != 1) {
            z = false;
        }
        return C19319810iC.LJJIJL(c19319810iC, z, null, null, false, null, true, false, false, false, null, false, 129022);
    }

    public static final Object invoke$4(AwS40S0001000_28 awS40S0001000_28, Object obj) {
        boolean z;
        C19319810iC c19319810iC = (C19319810iC) obj;
        if (awS40S0001000_28.f997i0 == CachedAutoMuteStripSettingStatus.ON.getValue()) {
            z = true;
        } else {
            z = false;
        }
        return C1833500xoS.LIZ(c19319810iC, z);
    }
}
