package kotlin.jvm.internal;

import X.C09AY;
import X.C1212320heY;
import X.C1647860sz2;
import X.C1648000szG;
import X.C1686610tzX;
import X.C1692000u8E;
import X.C1692110u8P;
import X.C21593019ey;
import X.C2267561DpC;
import X.C2267581DpE;
import X.C375830EoP;
import X.EnumC1679580toC;
import X.EnumC1692010u8F;
import X.EnumC1692020u8G;
import X.InterfaceC1680040tow;
import X.InterfaceC1692460u8y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AwS11S0120000_25 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public boolean z1;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS11S0120000_25 awS11S0120000_25, Object obj) {
        EnumC1692020u8G enumC1692020u8G;
        EnumC1692010u8F enumC1692010u8F;
        boolean z;
        InterfaceC1692460u8y interfaceC1692460u8y = (InterfaceC1692460u8y) obj;
        long jLIZ = ((InterfaceC1680040tow) awS11S0120000_25.l0).LIZ();
        C1212320heY<C1692000u8E> c1212320heY = C1692110u8P.LIZJ;
        if (awS11S0120000_25.z1) {
            enumC1692020u8G = EnumC1692020u8G.SelectionStart;
        } else {
            enumC1692020u8G = EnumC1692020u8G.SelectionEnd;
        }
        if (awS11S0120000_25.z2) {
            enumC1692010u8F = EnumC1692010u8F.Left;
        } else {
            enumC1692010u8F = EnumC1692010u8F.Right;
        }
        if ((9223372034707292159L & jLIZ) != 9205357640488583168L) {
            z = true;
        } else {
            z = false;
        }
        interfaceC1692460u8y.LIZJ(c1212320heY, new C1692000u8E(enumC1692020u8G, jLIZ, enumC1692010u8F, z));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS11S0120000_25 awS11S0120000_25, Object obj) {
        return C21593019ey.LIZ((C21593019ey) obj, null, null, null, null, null, new C375830EoP(new C1648000szG(((C1647860sz2) awS11S0120000_25.l0).v5(awS11S0120000_25.z1), awS11S0120000_25.z2)), null, 191);
    }

    public static final Object invoke$2(AwS11S0120000_25 awS11S0120000_25, Object obj) {
        C1686610tzX c1686610tzX = (C1686610tzX) obj;
        c1686610tzX.getClass();
        C2267581DpE c2267581DpE = new C2267581DpE("voiceHintText");
        C2267581DpE c2267581DpE2 = new C2267581DpE("changeToText");
        C2267581DpE c2267581DpE3 = new C2267581DpE("inputText");
        C2267581DpE c2267581DpE4 = new C2267581DpE("changeToVoice");
        C2267581DpE c2267581DpE5 = new C2267581DpE("sendButton");
        C2267581DpE c2267581DpE6 = new C2267581DpE("background");
        C2267581DpE c2267581DpE7 = new C2267581DpE("imeSpacer");
        C2267581DpE c2267581DpE8 = new C2267581DpE("sendShadow");
        c1686610tzX.LIZ(c2267581DpE, new AwS614S0100000_35((EnumC1679580toC) awS11S0120000_25.l0, 139));
        c1686610tzX.LIZ(c2267581DpE2, new AwS614S0100000_35((EnumC1679580toC) awS11S0120000_25.l0, 140));
        c1686610tzX.LIZ(c2267581DpE8, new AwS244S0300000_35(c2267581DpE7, c2267581DpE3, (EnumC1679580toC) awS11S0120000_25.l0, 5));
        c1686610tzX.LIZ(c2267581DpE7, new AwS614S0100000_35((EnumC1679580toC) awS11S0120000_25.l0, 141));
        c1686610tzX.LIZ(c2267581DpE3, new C2267561DpC(c2267581DpE7, c2267581DpE6, (EnumC1679580toC) awS11S0120000_25.l0, awS11S0120000_25.z1, c2267581DpE5));
        c1686610tzX.LIZ(c2267581DpE6, new AwS85S0210000_35(c2267581DpE3, (EnumC1679580toC) awS11S0120000_25.l0, awS11S0120000_25.z2, 1));
        c1686610tzX.LIZ(c2267581DpE4, new AwS401S0200000_35(c2267581DpE7, (EnumC1679580toC) awS11S0120000_25.l0, 45));
        c1686610tzX.LIZ(c2267581DpE5, new AwS85S0210000_35(c2267581DpE6, (EnumC1679580toC) awS11S0120000_25.l0, awS11S0120000_25.z1, 2));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS11S0120000_25(C1647860sz2 c1647860sz2, boolean z, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1647860sz2;
        this.z1 = z;
        this.z2 = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS11S0120000_25(EnumC1679580toC enumC1679580toC, boolean z, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.l0 = enumC1679580toC;
        this.z1 = z;
        this.z2 = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS11S0120000_25(InterfaceC1680040tow interfaceC1680040tow, boolean z, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC1680040tow;
        this.z1 = z;
        this.z2 = z2;
    }
}
