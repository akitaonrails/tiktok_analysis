package kotlin.jvm.internal;

import X.C09AY;
import X.C0BSO;
import X.C0L76;
import X.C0M8O;
import X.C201955140j;
import X.C534250KxL;
import com.bytedance.keva.Keva;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public class AwS52S0010000_8 extends C09AY implements Function0 {
    public final int $t;
    public boolean z0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS52S0010000_8 awS52S0010000_8) {
        C534250KxL c534250KxL = C534250KxL.LIZ;
        boolean z = awS52S0010000_8.z0;
        c534250KxL.getClass();
        return C534250KxL.LIZIZ(z);
    }

    public static final Object invoke$1(AwS52S0010000_8 awS52S0010000_8) {
        C534250KxL c534250KxL = C534250KxL.LIZ;
        boolean z = awS52S0010000_8.z0;
        c534250KxL.getClass();
        return C534250KxL.LIZIZ(z);
    }

    public static final Object invoke$2(AwS52S0010000_8 awS52S0010000_8) {
        if (awS52S0010000_8.z0) {
            C0M8O.LIZ.getClass();
            C0M8O.LIZIZ.storeLong("BANNER_SHOW_TIME_MS", System.currentTimeMillis());
            return Boolean.TRUE;
        }
        if (C0BSO.LIZ == 1) {
            C0M8O.LIZ.getClass();
            Keva keva = C0M8O.LIZIZ;
            if (keva.getBoolean("RECORD_BANNER_FOREVER_QUIT", false)) {
                C201955140j.LIZLLL(C0L76.LIZIZ, "RecordAIAliveTooltipController", "banner: forever quit");
                return Boolean.FALSE;
            }
            if (System.currentTimeMillis() - keva.getLong("BANNER_SHOW_TIME_MS", 0L) <= 86400000) {
                C201955140j.LIZLLL(C0L76.LIZIZ, "RecordAIAliveTooltipController", "banner quit: once per day");
                return Boolean.FALSE;
            }
            if (System.currentTimeMillis() - keva.getLong("RECORD_BANNER_TEMPORARY_QUIT_TIME_MS", 0L) <= 259200000) {
                C201955140j.LIZLLL(C0L76.LIZIZ, "RecordAIAliveTooltipController", "banner quit: temporary in 3 days");
                return Boolean.FALSE;
            }
            keva.storeLong("BANNER_SHOW_TIME_MS", System.currentTimeMillis());
            C201955140j.LIZLLL(C0L76.LIZIZ, "RecordAIAliveTooltipController", "banner: show");
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS52S0010000_8(boolean z, int i) {
        super(0);
        this.$t = i;
        this.z0 = z;
    }
}
