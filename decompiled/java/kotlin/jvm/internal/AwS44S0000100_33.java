package kotlin.jvm.internal;

import X.C09AY;
import X.C1AHW;
import X.C1AIE;
import X.C2180171AUd;
import X.InterfaceC2179191AQj;
import com.bytedance.android.livesdk.viewer_picks.model.GiftPick;
import com.bytedance.android.livesdk.viewer_picks.model.GiftPickWithStatus;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes34.dex */
public class AwS44S0000100_33 extends C09AY implements Function1 {
    public final int $t;
    public long j0;

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
    public AwS44S0000100_33(long j, int i) {
        super(1);
        this.$t = i;
        this.j0 = j;
    }

    public static final Object invoke$0(AwS44S0000100_33 awS44S0000100_33, Object obj) {
        boolean z;
        if (((C1AHW) obj).LIZ == awS44S0000100_33.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$1(AwS44S0000100_33 awS44S0000100_33, Object obj) {
        ((InterfaceC2179191AQj) obj).onPlaybackTimeChanged(awS44S0000100_33.j0);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS44S0000100_33 awS44S0000100_33, Object obj) {
        ((InterfaceC2179191AQj) obj).LJIIZILJ(awS44S0000100_33.j0);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS44S0000100_33 awS44S0000100_33, Object obj) {
        boolean z;
        if (((C1AIE) obj).LIZIZ == awS44S0000100_33.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$4(AwS44S0000100_33 awS44S0000100_33, Object obj) {
        boolean z;
        GiftPick giftPick = ((GiftPickWithStatus) obj).giftPick;
        if (giftPick != null && giftPick.giftId == awS44S0000100_33.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$5(AwS44S0000100_33 awS44S0000100_33, Object obj) {
        boolean z;
        if (((C1AIE) obj).LIZIZ == awS44S0000100_33.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$6(AwS44S0000100_33 awS44S0000100_33, Object obj) {
        boolean z;
        GiftPick giftPick = ((GiftPickWithStatus) obj).giftPick;
        if (giftPick != null && giftPick.giftId == awS44S0000100_33.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$7(AwS44S0000100_33 awS44S0000100_33, Object obj) {
        ((InterfaceC2179191AQj) obj).onPlaybackTimeChanged(awS44S0000100_33.j0);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS44S0000100_33 awS44S0000100_33, Object obj) {
        ((InterfaceC2179191AQj) obj).LJIIZILJ(awS44S0000100_33.j0);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS44S0000100_33 awS44S0000100_33, Object obj) {
        boolean z;
        if (awS44S0000100_33.j0 - ((C2180171AUd) obj).LJ > 120000) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
