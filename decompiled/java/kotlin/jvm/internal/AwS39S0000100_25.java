package kotlin.jvm.internal;

import X.C09AY;
import X.C1665850tS3;
import X.C1665860tS4;
import X.C1675860tiC;
import X.C1680380tpU;
import X.C1680770tq7;
import X.C1680900tqK;
import X.C1681030tqX;
import X.C1692000u8E;
import X.C1692110u8P;
import X.C1695210uDP;
import X.C1695940uEa;
import X.C1695950uEb;
import X.EnumC1692010u8F;
import X.EnumC1692020u8G;
import X.InterfaceC1669010tX9;
import X.InterfaceC1675870tiD;
import X.InterfaceC1692460u8y;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AwS39S0000100_25 extends C09AY implements Function1 {
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
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS39S0000100_25(long j, int i) {
        super(1);
        this.$t = i;
        this.j0 = j;
    }

    public static final Object invoke$0(AwS39S0000100_25 awS39S0000100_25, Object obj) {
        InterfaceC1669010tX9 interfaceC1669010tX9 = (InterfaceC1669010tX9) obj;
        interfaceC1669010tX9.LLIIJLIL();
        C1675860tiC.LJIIJ(interfaceC1669010tX9, awS39S0000100_25.j0, 0L, 0L, 0.0f, null, null, 0, 126);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS39S0000100_25 awS39S0000100_25, Object obj) {
        InterfaceC1675870tiD interfaceC1675870tiD = (InterfaceC1675870tiD) obj;
        float f = 2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC1675870tiD.LIZIZ() >> 32)) / f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC1675870tiD.LIZIZ() & 4294967295L)) / f)) & 4294967295L);
        C1665850tS3 c1665850tS3 = C1665860tS4.LIZJ;
        C1675860tiC.LIZLLL(interfaceC1675870tiD, awS39S0000100_25.j0, interfaceC1675870tiD.LJJJJLL(c1665850tS3.LIZIZ), jFloatToRawIntBits, 0.0f, new C1695210uDP(interfaceC1675870tiD.LJJJJLL(c1665850tS3.LIZJ), 0.0f, 0, 0, null, 30), 104);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS39S0000100_25 awS39S0000100_25, Object obj) {
        C1675860tiC.LJIIJ((InterfaceC1675870tiD) obj, awS39S0000100_25.j0, 0L, 0L, 0.0f, null, null, 0, 126);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS39S0000100_25 awS39S0000100_25, Object obj) {
        C1675860tiC.LIZLLL((InterfaceC1675870tiD) obj, awS39S0000100_25.j0, 0.0f, 0L, 0.0f, null, 126);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS39S0000100_25 awS39S0000100_25, Object obj) {
        C1675860tiC.LIZLLL((InterfaceC1675870tiD) obj, awS39S0000100_25.j0, 0.0f, 0L, 0.0f, null, 126);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS39S0000100_25 awS39S0000100_25, Object obj) {
        InterfaceC1675870tiD interfaceC1675870tiD = (InterfaceC1675870tiD) obj;
        C1695950uEb c1695950uEbLIZ = C1695940uEa.LIZ();
        c1695950uEbLIZ.LIZJ(Float.intBitsToFloat((int) (interfaceC1675870tiD.LIZIZ() >> 32)) * 0.16f, Float.intBitsToFloat((int) (interfaceC1675870tiD.LIZIZ() & 4294967295L)) * 0.52f);
        c1695950uEbLIZ.LJIIL(Float.intBitsToFloat((int) (interfaceC1675870tiD.LIZIZ() >> 32)) * 0.42f, Float.intBitsToFloat((int) (interfaceC1675870tiD.LIZIZ() & 4294967295L)) * 0.76f);
        c1695950uEbLIZ.LJIIL(Float.intBitsToFloat((int) (interfaceC1675870tiD.LIZIZ() >> 32)) * 0.86f, Float.intBitsToFloat((int) (interfaceC1675870tiD.LIZIZ() & 4294967295L)) * 0.22f);
        C1675860tiC.LJIIIIZZ(interfaceC1675870tiD, c1695950uEbLIZ, awS39S0000100_25.j0, 0.0f, new C1695210uDP(C1680770tq7.LIZJ(interfaceC1675870tiD.LIZIZ()) * 0.16f, 0.0f, 0, 0, null, 30), 52);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS39S0000100_25 awS39S0000100_25, Object obj) {
        InterfaceC1675870tiD interfaceC1675870tiD = (InterfaceC1675870tiD) obj;
        C1695210uDP c1695210uDP = new C1695210uDP(0.5f, 0.0f, 0, 0, null, 30);
        C1675860tiC.LJI(interfaceC1675870tiD, awS39S0000100_25.j0, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC1675870tiD.LIZIZ() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), c1695210uDP.LIZ, 0, 496);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS39S0000100_25 awS39S0000100_25, Object obj) {
        InterfaceC1675870tiD interfaceC1675870tiD = (InterfaceC1675870tiD) obj;
        C1695950uEb c1695950uEbLIZ = C1695940uEa.LIZ();
        long jLIZIZ = interfaceC1675870tiD.LIZIZ();
        c1695950uEbLIZ.reset();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jLIZIZ >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jLIZIZ & 4294967295L));
        float fMin = Math.min(fIntBitsToFloat / 306.0f, fIntBitsToFloat2 / 306.0f);
        float f = 306.0f * fMin;
        float f2 = 2;
        float f3 = (fIntBitsToFloat - f) / f2;
        float f4 = (fIntBitsToFloat2 - f) / f2;
        float f5 = (123.79f * fMin) + f3;
        float f6 = (13.73f * fMin) + f4;
        c1695950uEbLIZ.LIZJ(f5, f6);
        float f7 = (141.71f * fMin) + f3;
        float f8 = (3.42f * fMin) + f4;
        float f9 = (163.76f * fMin) + f3;
        float f10 = (181.69f * fMin) + f3;
        c1695950uEbLIZ.LJI(f7, f8, f9, f8, f10, f6);
        float f11 = (262.51f * fMin) + f3;
        float f12 = (60.22f * fMin) + f4;
        c1695950uEbLIZ.LJIIL(f11, f12);
        float f13 = (278.57f * fMin) + f3;
        float f14 = (69.46f * fMin) + f4;
        float f15 = (288.48f * fMin) + f3;
        float f16 = (86.57f * fMin) + f4;
        float f18 = (105.11f * fMin) + f4;
        c1695950uEbLIZ.LJI(f13, f14, f15, f16, f15, f18);
        float f19 = (201.33f * fMin) + f4;
        c1695950uEbLIZ.LJIIL(f15, f19);
        float f20 = (219.87f * fMin) + f4;
        float f21 = (236.99f * fMin) + f4;
        float f22 = (246.22f * fMin) + f4;
        c1695950uEbLIZ.LJI(f15, f20, f13, f21, f11, f22);
        float f23 = (292.71f * fMin) + f4;
        c1695950uEbLIZ.LJIIL(f10, f23);
        float f24 = (303.02f * fMin) + f4;
        c1695950uEbLIZ.LJI(f9, f24, f7, f24, f5, f23);
        float f25 = (42.97f * fMin) + f3;
        c1695950uEbLIZ.LJIIL(f25, f22);
        float f26 = (26.9f * fMin) + f3;
        float f27 = (fMin * 17.0f) + f3;
        c1695950uEbLIZ.LJI(f26, f21, f27, f20, f27, f19);
        c1695950uEbLIZ.LJIIL(f27, f18);
        c1695950uEbLIZ.LJI(f27, f16, f26, f14, f25, f12);
        c1695950uEbLIZ.LJIIL(f5, f6);
        c1695950uEbLIZ.close();
        C1675860tiC.LJIIIIZZ(interfaceC1675870tiD, c1695950uEbLIZ, awS39S0000100_25.j0, 1.0f, new C1695210uDP(interfaceC1675870tiD.LJJJJLL((float) 5.3d), 0.0f, 1, 0, null, 26), 48);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS39S0000100_25 awS39S0000100_25, Object obj) {
        InterfaceC1675870tiD interfaceC1675870tiD = (InterfaceC1675870tiD) obj;
        float f = 2;
        float fLJJJJLL = interfaceC1675870tiD.LJJJJLL(f);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC1675870tiD.LIZIZ() & 4294967295L)) - (fLJJJJLL / f);
        C1675860tiC.LJI(interfaceC1675870tiD, awS39S0000100_25.j0, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC1675870tiD.LIZIZ() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), fLJJJJLL, 0, 496);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS39S0000100_25 awS39S0000100_25, Object obj) {
        C1681030tqX c1681030tqX = (C1681030tqX) obj;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c1681030tqX.LIZIZ() >> 32)) / 2.0f;
        return c1681030tqX.LIZLLL(new AwS12S0200001_25(fIntBitsToFloat, C1680380tpU.LIZLLL(c1681030tqX, fIntBitsToFloat), C1680900tqK.LIZ(awS39S0000100_25.j0), 2));
    }

    public static final Object invoke$6(AwS39S0000100_25 awS39S0000100_25, Object obj) {
        ((InterfaceC1692460u8y) obj).LIZJ(C1692110u8P.LIZJ, new C1692000u8E(EnumC1692020u8G.Cursor, awS39S0000100_25.j0, EnumC1692010u8F.Middle, true));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS39S0000100_25 awS39S0000100_25, Object obj) {
        C1675860tiC.LIZLLL((InterfaceC1675870tiD) obj, awS39S0000100_25.j0, 0.0f, 0L, 0.0f, null, 126);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS39S0000100_25 awS39S0000100_25, Object obj) {
        C1675860tiC.LIZLLL((InterfaceC1675870tiD) obj, awS39S0000100_25.j0, 0.0f, 0L, 0.0f, null, 126);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS39S0000100_25 awS39S0000100_25, Object obj) {
        C1675860tiC.LJIIJ((InterfaceC1675870tiD) obj, awS39S0000100_25.j0, 0L, 0L, 0.0f, null, null, 0, 126);
        return Unit.LIZ;
    }
}
