package kotlin.jvm.internal;

import X.C09AY;
import X.C1DHY;
import X.C1DHZ;
import X.C1DUJ;
import X.C1DYM;
import X.C1DYV;
import X.C1DYW;
import X.C1DYZ;
import X.C2251071D8v;
import X.C2277261EBo;
import X.C786410Ut5;
import X.EnumC804650VhP;
import X.InterfaceC2277271EBp;
import com.ss.solution.gear_center.LyraxProbeNetworkType;
import com.ss.ttlivestreamer.livestreamv2.videoquality.controler.VideoQualityStrategyManagerV2;
import com.ss.ttlivestreamer.livestreamv2.videoquality.controler.VideoQualityStrategyManagerV2$setNetworkTypeCode$1$WhenMappings;
import com.tiktok.ttm.ttmparam.container.TTMContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes36.dex */
public class AwS172S0101000_35 extends C09AY implements Function0 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS172S0101000_35 awS172S0101000_35) {
        C2251071D8v c2251071D8v = (C2251071D8v) awS172S0101000_35.l0;
        c2251071D8v.LJIIL(c2251071D8v.LJII, ((C2251071D8v) awS172S0101000_35.l0).LJIIIIZZ, awS172S0101000_35.i1, true);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS172S0101000_35 awS172S0101000_35) {
        LyraxProbeNetworkType lyraxProbeNetworkType;
        VideoQualityStrategyManagerV2 videoQualityStrategyManagerV2 = (VideoQualityStrategyManagerV2) awS172S0101000_35.l0;
        EnumC804650VhP enumC804650VhPFromNetworkTypeInt = EnumC804650VhP.fromNetworkTypeInt(awS172S0101000_35.i1);
        if (enumC804650VhPFromNetworkTypeInt != null && VideoQualityStrategyManagerV2$setNetworkTypeCode$1$WhenMappings.LIZ[enumC804650VhPFromNetworkTypeInt.ordinal()] == 1) {
            lyraxProbeNetworkType = LyraxProbeNetworkType.Mobile;
        } else {
            lyraxProbeNetworkType = LyraxProbeNetworkType.Wifi;
        }
        videoQualityStrategyManagerV2.LJII = lyraxProbeNetworkType;
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS172S0101000_35 awS172S0101000_35) {
        C1DUJ c1duj = TTMContainer.Companion;
        long nativeAddress$machine_core_release = ((C1DYW) awS172S0101000_35.l0).getNativeAddress$machine_core_release();
        int i = awS172S0101000_35.i1;
        int value = C1DYV.TTM_MAP_TYPE.getValue();
        c1duj.getClass();
        return new C1DYZ(TTMContainer.ttmNativeGetAddress(nativeAddress$machine_core_release, null, i, value));
    }

    public static final Object invoke$3(AwS172S0101000_35 awS172S0101000_35) {
        C1DUJ c1duj = TTMContainer.Companion;
        long nativeAddress$machine_core_release = ((C1DYW) awS172S0101000_35.l0).getNativeAddress$machine_core_release();
        int i = awS172S0101000_35.i1;
        c1duj.getClass();
        return Boolean.valueOf(TTMContainer.ttmNativeRemove(nativeAddress$machine_core_release, null, i));
    }

    public static final Object invoke$4(AwS172S0101000_35 awS172S0101000_35) {
        C1DHZ c1dhz = ((C1DHY) awS172S0101000_35.l0).LIZIZ;
        if (c1dhz != null) {
            c1dhz.LJIIJ(awS172S0101000_35.i1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS172S0101000_35 awS172S0101000_35) {
        C1DHZ c1dhz = ((C1DHY) awS172S0101000_35.l0).LIZIZ;
        if (c1dhz != null) {
            c1dhz.LIZLLL(awS172S0101000_35.i1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS172S0101000_35 awS172S0101000_35) {
        InterfaceC2277271EBp interfaceC2277271EBp;
        if (awS172S0101000_35.i1 == 36 && (interfaceC2277271EBp = ((C2277261EBo) awS172S0101000_35.l0).LIZ) != null) {
            interfaceC2277271EBp.LJJIII();
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(AwS172S0101000_35 awS172S0101000_35) {
        C786410Ut5.LJLLLLLL(awS172S0101000_35.i1, ((C1DYM) awS172S0101000_35.l0).LIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS172S0101000_35(int i, C2251071D8v c2251071D8v, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c2251071D8v;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS172S0101000_35(C1DHY c1dhy, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1dhy;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS172S0101000_35(C1DYM c1dym, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1dym;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS172S0101000_35(C1DYW c1dyw, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1dyw;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS172S0101000_35(VideoQualityStrategyManagerV2 videoQualityStrategyManagerV2, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = videoQualityStrategyManagerV2;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS172S0101000_35(int i, C2277261EBo c2277261EBo, long j, long j2, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c2277261EBo;
    }
}
