package kotlin.jvm.internal;

import X.C09AY;
import X.C1641170soF;
import X.C1668200tVq;
import X.C1671190taf;
import X.C1675860tiC;
import X.C1675910tiH;
import X.C1676680tjW;
import X.C1681030tqX;
import X.C1685910tyP;
import X.C1695210uDP;
import X.C1697810uHb;
import X.C418440Gaw;
import X.C814420VxA;
import X.InterfaceC1669010tX9;
import X.InterfaceC1679550to9;
import com.ss.android.vesdk.VECameraSettings;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AwS11S0000001_25 extends C09AY implements Function1 {
    public final int $t;
    public float f0;

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
    public AwS11S0000001_25(float f, int i) {
        super(1);
        this.$t = i;
        this.f0 = f;
    }

    public static final Object invoke$0(AwS11S0000001_25 awS11S0000001_25, Object obj) {
        InterfaceC1679550to9 interfaceC1679550to9 = (InterfaceC1679550to9) obj;
        interfaceC1679550to9.LJJLIIIIJ(C1676680tjW.LIZIZ);
        interfaceC1679550to9.LJIIJ(awS11S0000001_25.f0);
        interfaceC1679550to9.LJIIJJI(awS11S0000001_25.f0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS11S0000001_25 awS11S0000001_25, Object obj) {
        ((InterfaceC1679550to9) obj).setAlpha(awS11S0000001_25.f0);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS11S0000001_25 awS11S0000001_25, Object obj) {
        C1681030tqX c1681030tqX = (C1681030tqX) obj;
        return c1681030tqX.LIZLLL(new AwS604S0100000_25(C1668200tVq.LIZ(C1697810uHb.LJIIJJI(new C1685910tyP(C1685910tyP.LJIIIZ), new C1685910tyP(C1685910tyP.LIZIZ)), awS11S0000001_25.f0 * c1681030tqX.getDensity(), 8), 532));
    }

    public static final Object invoke$3(AwS11S0000001_25 awS11S0000001_25, Object obj) {
        InterfaceC1679550to9 interfaceC1679550to9 = (InterfaceC1679550to9) obj;
        interfaceC1679550to9.LJI(awS11S0000001_25.f0);
        interfaceC1679550to9.LJIILIIL(false);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS11S0000001_25 awS11S0000001_25, Object obj) {
        ((InterfaceC1679550to9) obj).LJI(awS11S0000001_25.f0);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS11S0000001_25 awS11S0000001_25, Object obj) {
        C1641170soF c1641170soF = (C1641170soF) obj;
        c1641170soF.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(awS11S0000001_25.f0)));
        c1641170soF.LJIIIZ = false;
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS11S0000001_25 awS11S0000001_25, Object obj) {
        VECameraSettings.Builder builder = (VECameraSettings.Builder) obj;
        builder.setDefaultZoomRatio(awS11S0000001_25.f0);
        builder.setDefaultZoomUsingZoomV2(true);
        builder.setCameraZoomLimitFactor(1.0f);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS11S0000001_25 awS11S0000001_25, Object obj) {
        InterfaceC1669010tX9 interfaceC1669010tX9 = (InterfaceC1669010tX9) obj;
        interfaceC1669010tX9.LLIIJLIL();
        float f = C1675910tiH.LIZIZ;
        float f2 = C1675910tiH.LIZ;
        float f3 = f2 / 2;
        float fLJJJJLL = interfaceC1669010tX9.LJJJJLL(f3 + f);
        float fLJJJJLL2 = interfaceC1669010tX9.LJJJJLL(f2);
        float fLJJJJLL3 = interfaceC1669010tX9.LJJJJLL(awS11S0000001_25.f0 + f + f3);
        float f4 = -fLJJJJLL;
        float f5 = fLJJJJLL * 2.0f;
        C1675860tiC.LJIIJJI(interfaceC1669010tX9, C1675910tiH.LJ, (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC1669010tX9.LIZIZ() >> 32)) + f5)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC1669010tX9.LIZIZ() & 4294967295L)) + f5)) & 4294967295L), (((long) Float.floatToRawIntBits(fLJJJJLL3)) << 32) | (((long) Float.floatToRawIntBits(fLJJJJLL3)) & 4294967295L), new C1695210uDP(fLJJJJLL2, 0.0f, 0, 0, null, 30), 208);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS11S0000001_25 awS11S0000001_25, Object obj) {
        ((InterfaceC1679550to9) obj).LJFF(awS11S0000001_25.f0);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS11S0000001_25 awS11S0000001_25, Object obj) {
        InterfaceC1679550to9 interfaceC1679550to9 = (InterfaceC1679550to9) obj;
        interfaceC1679550to9.LJIIJ(awS11S0000001_25.f0);
        interfaceC1679550to9.LJIIJJI(awS11S0000001_25.f0);
        interfaceC1679550to9.LJJLIIIIJ(C1671190taf.LIZ(0.0f, 0.0f));
        return Unit.LIZ;
    }
}
