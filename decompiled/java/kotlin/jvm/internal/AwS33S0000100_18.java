package kotlin.jvm.internal;

import X.C09AY;
import X.C1005830cHV;
import X.C1158800gGE;
import X.C1182980gtE;
import X.C1190560h5S;
import X.C1191400h6o;
import X.C1196140hES;
import X.C1623606Xi;
import X.EnumC1190580h5U;
import X.EnumC1191410h6p;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class AwS33S0000100_18 extends C09AY implements Function1 {
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
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS33S0000100_18(long j, int i) {
        super(1);
        this.$t = i;
        this.j0 = j;
    }

    public static final Object invoke$0(AwS33S0000100_18 awS33S0000100_18, Object obj) {
        return C1158800gGE.LIZ((C1158800gGE) obj, null, null, null, null, null, new C1623606Xi(Long.valueOf(awS33S0000100_18.j0)), null, 95);
    }

    public static final Object invoke$1(AwS33S0000100_18 awS33S0000100_18, Object obj) {
        return C1158800gGE.LIZ((C1158800gGE) obj, null, null, null, null, new C1623606Xi(Long.valueOf(awS33S0000100_18.j0)), null, null, 111);
    }

    public static final Object invoke$10(AwS33S0000100_18 awS33S0000100_18, Object obj) {
        ((C1196140hES) obj).LJI((int) awS33S0000100_18.j0, "spend time");
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS33S0000100_18 awS33S0000100_18, Object obj) {
        ((C1196140hES) obj).LJI((int) awS33S0000100_18.j0, "spend time");
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS33S0000100_18 awS33S0000100_18, Object obj) {
        ((C1196140hES) obj).LJI((int) awS33S0000100_18.j0, "diff ms from first onTrigger to preload");
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS33S0000100_18 awS33S0000100_18, Object obj) {
        return C1158800gGE.LIZ((C1158800gGE) obj, null, null, null, null, null, null, new C1623606Xi(Long.valueOf(awS33S0000100_18.j0)), 63);
    }

    public static final Object invoke$3(AwS33S0000100_18 awS33S0000100_18, Object obj) {
        C1182980gtE c1182980gtE = (C1182980gtE) obj;
        c1182980gtE.LIZLLL = "/tiktok/poi/api/place/recommend";
        c1182980gtE.LJ = "default_search_poi_request";
        c1182980gtE.LIZ = Long.valueOf(awS33S0000100_18.j0);
        c1182980gtE.LIZIZ = Long.valueOf(System.currentTimeMillis());
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS33S0000100_18 awS33S0000100_18, Object obj) {
        EnumC1190580h5U enumC1190580h5U = EnumC1190580h5U.NEUTRAL;
        long j = awS33S0000100_18.j0;
        if (j <= 0) {
            j = 0;
        }
        Long lValueOf = Long.valueOf(j);
        obj.getClass();
        return new C1190560h5S(enumC1190580h5U, lValueOf);
    }

    public static final Object invoke$5(AwS33S0000100_18 awS33S0000100_18, Object obj) {
        EnumC1190580h5U enumC1190580h5U = EnumC1190580h5U.NEUTRAL;
        Long lValueOf = Long.valueOf(awS33S0000100_18.j0);
        obj.getClass();
        return new C1190560h5S(enumC1190580h5U, lValueOf);
    }

    public static final Object invoke$6(AwS33S0000100_18 awS33S0000100_18, Object obj) {
        EnumC1191410h6p enumC1191410h6p = EnumC1191410h6p.NEUTRAL;
        long j = awS33S0000100_18.j0;
        if (j <= 0) {
            j = 0;
        }
        Long lValueOf = Long.valueOf(j);
        obj.getClass();
        return new C1191400h6o(enumC1191410h6p, lValueOf);
    }

    public static final Object invoke$7(AwS33S0000100_18 awS33S0000100_18, Object obj) {
        EnumC1191410h6p enumC1191410h6p = EnumC1191410h6p.NEUTRAL;
        Long lValueOf = Long.valueOf(awS33S0000100_18.j0);
        obj.getClass();
        return new C1191400h6o(enumC1191410h6p, lValueOf);
    }

    public static final Object invoke$8(AwS33S0000100_18 awS33S0000100_18, Object obj) {
        Long lValueOf = Long.valueOf(awS33S0000100_18.j0);
        obj.getClass();
        return new C1005830cHV(lValueOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$9(kotlin.jvm.internal.AwS33S0000100_18 r5, java.lang.Object r6) {
        /*
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = r5.j0
            long r3 = r3 - r0
            r1 = 5000(0x1388, double:2.4703E-320)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r2 = 0
            if (r0 >= 0) goto L37
            boolean r0 = com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastPingAnchorOpt.inExperimentV2()
            if (r0 != 0) goto L36
            boolean r0 = r6 instanceof X.C501470JlZ
            if (r0 == 0) goto L37
            X.0Jle r6 = (X.C501520Jle) r6
            if (r6 == 0) goto L37
            java.lang.String[] r1 = com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastPingAnchorRetryErrorCode.getValue()
            int r0 = r6.getErrorCode()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = X.C13LQ.LJIILLIIL(r0, r1)
            if (r0 == 0) goto L37
            boolean r0 = com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastPingAnchorOpt.inExperimentV1()
            if (r0 == 0) goto L37
        L36:
            r2 = 1
        L37:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS33S0000100_18.invoke$9(kotlin.jvm.internal.AwS33S0000100_18, java.lang.Object):java.lang.Object");
    }
}
