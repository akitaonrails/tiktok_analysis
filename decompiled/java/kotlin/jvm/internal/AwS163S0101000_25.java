package kotlin.jvm.internal;

import X.C09AY;
import X.C1623940sMS;
import X.C1629630sVd;
import X.C1636710sh3;
import X.C1654440t9e;
import X.C1654500t9k;
import X.C1657180tE4;
import X.C1692300u8i;
import X.C1695880uEU;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.onlygiftselect.MatchOnlyGiftViewModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes26.dex */
public class AwS163S0101000_25 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public Object l0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS163S0101000_25 awS163S0101000_25) {
        return Integer.valueOf(((C1692300u8i) awS163S0101000_25.l0).LJFF.LJII(awS163S0101000_25.i1));
    }

    public static final Object invoke$1(AwS163S0101000_25 awS163S0101000_25) {
        ((MatchOnlyGiftViewModel) awS163S0101000_25.l0).vQ2(awS163S0101000_25.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS163S0101000_25 awS163S0101000_25) {
        C1629630sVd c1629630sVd = (C1629630sVd) awS163S0101000_25.l0;
        c1629630sVd.LIZIZ.onProgress(c1629630sVd.LIZ, awS163S0101000_25.i1, c1629630sVd.LJI);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS163S0101000_25 awS163S0101000_25) {
        ((C1654440t9e) awS163S0101000_25.l0).LLLIL(awS163S0101000_25.i1);
        ((C1654440t9e) awS163S0101000_25.l0).LLJI.LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS163S0101000_25 awS163S0101000_25) {
        int i = awS163S0101000_25.i1;
        if (i < -88) {
            ((C1654440t9e) awS163S0101000_25.l0).LLLII(-1);
        } else if (i > 88) {
            ((C1654440t9e) awS163S0101000_25.l0).LLLII(1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS163S0101000_25 awS163S0101000_25) {
        int i = awS163S0101000_25.i1;
        C1657180tE4 c1657180tE4 = (C1657180tE4) awS163S0101000_25.l0;
        int i2 = c1657180tE4.LLILZIL;
        if (i != i2) {
            c1657180tE4.notifyItemChanged(i2, Boolean.FALSE);
            ((C1657180tE4) awS163S0101000_25.l0).notifyItemChanged(awS163S0101000_25.i1, Boolean.TRUE);
            ((C1657180tE4) awS163S0101000_25.l0).LLILZIL = awS163S0101000_25.i1;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS163S0101000_25 awS163S0101000_25) {
        ((C1654500t9k) awS163S0101000_25.l0).LLLIL(awS163S0101000_25.i1);
        ((C1654500t9k) awS163S0101000_25.l0).LLJI.LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS163S0101000_25 awS163S0101000_25) {
        int i = awS163S0101000_25.i1;
        if (i < -88) {
            ((C1654500t9k) awS163S0101000_25.l0).LLLII(-1);
        } else if (i > 88) {
            ((C1654500t9k) awS163S0101000_25.l0).LLLII(1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS163S0101000_25 awS163S0101000_25) {
        ((C1695880uEU) awS163S0101000_25.l0).getClass();
        throw null;
    }

    public static final Object invoke$8(AwS163S0101000_25 awS163S0101000_25) {
        ((C1623940sMS) awS163S0101000_25.l0).LJIILLIIL("effect", awS163S0101000_25.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS163S0101000_25 awS163S0101000_25) {
        ((C1636710sh3) awS163S0101000_25.l0).LLILZIL.LJIIZILJ(awS163S0101000_25.i1);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS163S0101000_25(int r3, X.C1654440t9e r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 2 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.i1 = r3
            r1.l0 = r4
            r0 = 0
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.l0 = r4
            r1.i1 = r3
            r0 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS163S0101000_25.<init>(int, X.0t9e, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS163S0101000_25(int r3, X.C1654500t9k r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 5 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.i1 = r3
            r1.l0 = r4
            r0 = 0
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.l0 = r4
            r1.i1 = r3
            r0 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS163S0101000_25.<init>(int, X.0t9k, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS163S0101000_25(int i, C1657180tE4 c1657180tE4, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c1657180tE4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS163S0101000_25(C1623940sMS c1623940sMS, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1623940sMS;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS163S0101000_25(C1629630sVd c1629630sVd, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1629630sVd;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS163S0101000_25(C1636710sh3 c1636710sh3, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1636710sh3;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS163S0101000_25(C1692300u8i c1692300u8i, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1692300u8i;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS163S0101000_25(MatchOnlyGiftViewModel matchOnlyGiftViewModel, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = matchOnlyGiftViewModel;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS163S0101000_25(C1695880uEU c1695880uEU, long j, int i, Canvas canvas, Paint paint, int i2, float f, int i3) {
        super(0);
        this.$t = i3;
        this.l0 = c1695880uEU;
        this.i1 = i;
    }
}
