package kotlin.jvm.internal;

import X.C09AY;
import X.C955450ayF;
import X.C955590ayT;
import X.C977550bXt;
import X.C977560bXu;
import X.C977580bXw;
import X.C977590bXx;
import X.C977620bY0;
import X.C977630bY1;
import X.C977760bYE;
import X.EnumC919170a1j;
import X.InterfaceC955990az7;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class AwS3S0210100_15 extends C09AY implements Function0 {
    public final int $t;
    public long j3;
    public Object l0;
    public Object l1;
    public boolean z2;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS3S0210100_15 awS3S0210100_15) {
        C977590bXx c977590bXx = ((C977580bXw) awS3S0210100_15.l0).LJ;
        if (c977590bXx != null) {
            c977590bXx.LJJI = C977760bYE.LIZ(true);
        }
        C977590bXx c977590bXx2 = ((C977580bXw) awS3S0210100_15.l0).LJ;
        if (c977590bXx2 != null) {
            c977590bXx2.LJIILJJIL(awS3S0210100_15.z2, Long.valueOf(awS3S0210100_15.j3), (EnumC919170a1j) awS3S0210100_15.l1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS3S0210100_15 awS3S0210100_15) {
        C977630bY1 c977630bY1 = ((C977560bXu) awS3S0210100_15.l0).LJII;
        if (c977630bY1 != null) {
            c977630bY1.LJJJJIZL = C977760bYE.LIZ(true);
        }
        C977630bY1 c977630bY12 = ((C977560bXu) awS3S0210100_15.l0).LJII;
        if (c977630bY12 != null) {
            c977630bY12.LJJIII(awS3S0210100_15.z2, Long.valueOf(awS3S0210100_15.j3), (EnumC919170a1j) awS3S0210100_15.l1, false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS3S0210100_15 awS3S0210100_15) {
        C955450ayF c955450ayF = C955450ayF.LIZ;
        InterfaceC955990az7 interfaceC955990az7 = (InterfaceC955990az7) awS3S0210100_15.l0;
        C955590ayT c955590ayT = (C955590ayT) awS3S0210100_15.l1;
        boolean z = awS3S0210100_15.z2;
        long j = awS3S0210100_15.j3;
        c955450ayF.getClass();
        C955450ayF.LIZ(interfaceC955990az7, c955590ayT, z, j);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS3S0210100_15 awS3S0210100_15) {
        C977620bY0 c977620bY0 = ((C977550bXt) awS3S0210100_15.l0).LIZLLL;
        if (c977620bY0 != null) {
            c977620bY0.LJJIIZI = C977760bYE.LIZ(true);
        }
        C977620bY0 c977620bY02 = ((C977550bXt) awS3S0210100_15.l0).LIZLLL;
        if (c977620bY02 != null) {
            c977620bY02.LJIJJLI(awS3S0210100_15.z2, Long.valueOf(awS3S0210100_15.j3), (EnumC919170a1j) awS3S0210100_15.l1);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S0210100_15(InterfaceC955990az7 interfaceC955990az7, C955590ayT c955590ayT, boolean z, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC955990az7;
        this.l1 = c955590ayT;
        this.z2 = z;
        this.j3 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S0210100_15(C977550bXt c977550bXt, boolean z, long j, EnumC919170a1j enumC919170a1j, int i) {
        super(0);
        this.$t = i;
        this.l0 = c977550bXt;
        this.z2 = z;
        this.j3 = j;
        this.l1 = enumC919170a1j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S0210100_15(C977560bXu c977560bXu, boolean z, long j, EnumC919170a1j enumC919170a1j, int i) {
        super(0);
        this.$t = i;
        this.l0 = c977560bXu;
        this.z2 = z;
        this.j3 = j;
        this.l1 = enumC919170a1j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S0210100_15(C977580bXw c977580bXw, boolean z, long j, EnumC919170a1j enumC919170a1j, int i) {
        super(0);
        this.$t = i;
        this.l0 = c977580bXw;
        this.z2 = z;
        this.j3 = j;
        this.l1 = enumC919170a1j;
    }
}
