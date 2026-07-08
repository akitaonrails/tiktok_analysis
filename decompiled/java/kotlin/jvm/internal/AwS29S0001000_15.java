package kotlin.jvm.internal;

import X.C09AY;
import X.C933610aP1;
import X.C933680aP8;
import X.C948130amR;
import X.C948300ami;
import X.C948400ams;
import X.InterfaceC954910axN;
import android.view.View;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AwS29S0001000_15 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f984i0;

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
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS29S0001000_15(int i, int i2) {
        super(1);
        this.$t = i2;
        this.f984i0 = i;
    }

    public static final Object invoke$0(AwS29S0001000_15 awS29S0001000_15, Object obj) {
        return C933680aP8.LIZ((C933680aP8) obj, null, null, new C933610aP1(awS29S0001000_15.f984i0), 3);
    }

    public static final Object invoke$1(AwS29S0001000_15 awS29S0001000_15, Object obj) {
        boolean z;
        if (((C948400ams) obj).LIZIZ == awS29S0001000_15.f984i0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$10(AwS29S0001000_15 awS29S0001000_15, Object obj) {
        return C948130amR.LIZ((C948130amR) obj, null, awS29S0001000_15.f984i0, 5);
    }

    public static final Object invoke$11(AwS29S0001000_15 awS29S0001000_15, Object obj) {
        return C948130amR.LIZ((C948130amR) obj, null, awS29S0001000_15.f984i0, 5);
    }

    public static final Object invoke$12(AwS29S0001000_15 awS29S0001000_15, Object obj) {
        return C948130amR.LIZ((C948130amR) obj, null, awS29S0001000_15.f984i0, 5);
    }

    public static final Object invoke$13(AwS29S0001000_15 awS29S0001000_15, Object obj) {
        C948130amR c948130amR = (C948130amR) obj;
        return C948130amR.LIZ(c948130amR, C948300ami.LIZ(c948130amR.LIZ, null, 0, false, awS29S0001000_15.f984i0, false, false, 39), 0, 6);
    }

    public static final Object invoke$14(AwS29S0001000_15 awS29S0001000_15, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((View) obj).getTag(), Integer.valueOf(awS29S0001000_15.f984i0)));
    }

    public static final Object invoke$2(AwS29S0001000_15 awS29S0001000_15, Object obj) {
        C948130amR c948130amR = (C948130amR) obj;
        return C948130amR.LIZ(c948130amR, C948300ami.LIZ(c948130amR.LIZ, null, 0, false, awS29S0001000_15.f984i0, false, false, 55), 0, 6);
    }

    public static final Object invoke$3(AwS29S0001000_15 awS29S0001000_15, Object obj) {
        C948130amR c948130amR = (C948130amR) obj;
        return C948130amR.LIZ(c948130amR, C948300ami.LIZ(c948130amR.LIZ, null, 0, false, awS29S0001000_15.f984i0, false, false, 55), 0, 6);
    }

    public static final Object invoke$4(AwS29S0001000_15 awS29S0001000_15, Object obj) {
        C948130amR c948130amR = (C948130amR) obj;
        return C948130amR.LIZ(c948130amR, C948300ami.LIZ(c948130amR.LIZ, null, 0, false, awS29S0001000_15.f984i0, false, false, 55), 0, 6);
    }

    public static final Object invoke$5(AwS29S0001000_15 awS29S0001000_15, Object obj) {
        return UserState.LIZ((UserState) obj, 0, awS29S0001000_15.f984i0, 0, 0, 0, 0, 0L, 2015);
    }

    public static final Object invoke$6(AwS29S0001000_15 awS29S0001000_15, Object obj) {
        return UserState.LIZ((UserState) obj, 0, 0, 0, 0, awS29S0001000_15.f984i0, 0, 0L, 1791);
    }

    public static final Object invoke$7(AwS29S0001000_15 awS29S0001000_15, Object obj) {
        return UserState.LIZ((UserState) obj, awS29S0001000_15.f984i0, 0, 0, 0, 0, 0, 0L, 2031);
    }

    public static final Object invoke$8(AwS29S0001000_15 awS29S0001000_15, Object obj) {
        return UserState.LIZ((UserState) obj, 0, 0, awS29S0001000_15.f984i0, 0, 0, 0, 0L, 1983);
    }

    public static final Object invoke$9(AwS29S0001000_15 awS29S0001000_15, Object obj) {
        ((InterfaceC954910axN) obj).LJIILIIL(Integer.valueOf(awS29S0001000_15.f984i0), "linked_host_size");
        return Unit.LIZ;
    }
}
