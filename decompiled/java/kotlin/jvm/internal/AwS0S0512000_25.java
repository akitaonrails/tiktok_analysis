package kotlin.jvm.internal;

import X.C09AY;
import X.C1378605aS;
import X.C1669600tY6;
import X.C1679240tne;
import X.C1679280tni;
import X.C1682380tsi;
import X.C2097608Jq;
import X.C341440Da2;
import X.InterfaceC1631620sYq;
import X.InterfaceC1665870tS5;
import X.InterfaceC1672350tcX;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS0S0512000_25 extends C09AY implements Function2 {
    public final int $t;
    public int i6;
    public int i7;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public boolean z5;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS0S0512000_25 awS0S0512000_25, Object obj, Object obj2) {
        InterfaceC1672350tcX interfaceC1672350tcX = (InterfaceC1672350tcX) obj;
        long j = ((C1682380tsi) obj2).LIZ;
        int iLJIIIIZZ = C1682380tsi.LJIIIIZZ(j);
        int iLJII = C1682380tsi.LJII(j);
        return interfaceC1672350tcX.LJLJJL(iLJIIIIZZ, iLJII, C2097608Jq.LJ(), new C1679280tni(interfaceC1672350tcX, (Function2) awS0S0512000_25.l0, (Function2) awS0S0512000_25.l1, (Function2) awS0S0512000_25.l2, awS0S0512000_25.i6, iLJIIIIZZ, awS0S0512000_25.z5, iLJII, C1682380tsi.LIZ(0, C1682380tsi.LJIIIIZZ(j), 0, C1682380tsi.LJII(j)), (Function2) awS0S0512000_25.l3, awS0S0512000_25.i7, (InterfaceC1631620sYq) awS0S0512000_25.l4));
    }

    public static final Object invoke$1(AwS0S0512000_25 awS0S0512000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1679240tne.LIZIZ(awS0S0512000_25.z5, awS0S0512000_25.i6, (Function2) awS0S0512000_25.l0, (InterfaceC1631620sYq) awS0S0512000_25.l1, (Function2) awS0S0512000_25.l2, (Function2) awS0S0512000_25.l3, (Function2) awS0S0512000_25.l4, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S0512000_25.i7 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS0S0512000_25 awS0S0512000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1669600tY6.LIZIZ((InterfaceC1685750ty9) awS0S0512000_25.l0, (SocMediaResource) awS0S0512000_25.l1, awS0S0512000_25.z5, (Function1) awS0S0512000_25.l2, (Function2) awS0S0512000_25.l3, (InterfaceC1631620sYq) awS0S0512000_25.l4, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S0512000_25.i6 | 1), awS0S0512000_25.i7);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS0S0512000_25(int r3, int r4, kotlin.jvm.functions.Function2 r5, kotlin.jvm.functions.Function2 r6, kotlin.jvm.functions.Function2 r7, kotlin.jvm.functions.Function2 r8, X.InterfaceC1631620sYq r9, boolean r10, int r11) {
        /*
            r2 = this;
            r2.$t = r11
            if (r11 == 0) goto L1a
            r1 = r2
            r1.z5 = r10
            r1.i6 = r3
            r1.l0 = r5
            r1.l1 = r9
            r1.l2 = r6
            r1.l3 = r7
            r1.l4 = r8
            r1.i7 = r4
            r0 = 2
        L16:
            r1.<init>(r0)
            return
        L1a:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r6
            r1.l2 = r7
            r1.i6 = r3
            r1.z5 = r10
            r1.l3 = r8
            r1.i7 = r4
            r1.l4 = r9
            r0 = 2
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS0S0512000_25.<init>(int, int, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, X.0sYq, boolean, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S0512000_25(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1685750ty9 interfaceC1685750ty92, SocMediaResource socMediaResource, boolean z, Function1<? super SocMediaResource, Unit> function1, Function2<? super C1378605aS, ? super SocMediaResource, Unit> function2, InterfaceC1631620sYq<? super InterfaceC1665870tS5, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = interfaceC1685750ty9;
        this.l1 = interfaceC1685750ty92;
        this.z5 = socMediaResource;
        this.l2 = z;
        this.l3 = function1;
        this.l4 = function2;
        this.i6 = interfaceC1631620sYq;
        this.i7 = i;
    }
}
