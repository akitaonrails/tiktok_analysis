package kotlin.jvm.internal;

import X.C09AY;
import X.C14Y4;
import X.C1555940qam;
import X.C20038513ap;
import X.C20042913bX;
import X.C341440Da2;
import X.EnumC19320810iM;
import X.InterfaceC1631620sYq;
import X.InterfaceC1680500tpg;
import com.ss.android.ugc.aweme.setting.serverpush.compose.login.PushSettingsLoginComposeFragment;
import com.ss.android.ugc.aweme.setting.serverpush.compose.unlogin.PushSettingsUnLoginComposeFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes31.dex */
public class AwS183S0101000_30 extends C09AY implements Function2 {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS183S0101000_30(int i, InterfaceC1631620sYq interfaceC1631620sYq, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = interfaceC1631620sYq;
        this.i1 = i;
    }

    public static final Object invoke$0(AwS183S0101000_30 awS183S0101000_30, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((PushSettingsLoginComposeFragment) awS183S0101000_30.l0).MR((InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS183S0101000_30.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS183S0101000_30 awS183S0101000_30, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((PushSettingsLoginComposeFragment) awS183S0101000_30.l0).NR((InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS183S0101000_30.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS183S0101000_30 awS183S0101000_30, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((PushSettingsUnLoginComposeFragment) awS183S0101000_30.l0).NR((InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS183S0101000_30.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS183S0101000_30 awS183S0101000_30, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((C20038513ap) awS183S0101000_30.l0).LIZ((InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS183S0101000_30.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS183S0101000_30 awS183S0101000_30, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C14Y4.LIZIZ((EnumC19320810iM) awS183S0101000_30.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS183S0101000_30.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS183S0101000_30 awS183S0101000_30, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C14Y4.LJFF((C1555940qam) awS183S0101000_30.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS183S0101000_30.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS183S0101000_30 awS183S0101000_30, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C20042913bX.LIZ((InterfaceC1631620sYq) awS183S0101000_30.l0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS183S0101000_30.i1 | 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS183S0101000_30(C1555940qam c1555940qam, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c1555940qam;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS183S0101000_30(EnumC19320810iM enumC19320810iM, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = enumC19320810iM;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS183S0101000_30(C20038513ap c20038513ap, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c20038513ap;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS183S0101000_30(PushSettingsLoginComposeFragment pushSettingsLoginComposeFragment, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = pushSettingsLoginComposeFragment;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS183S0101000_30(PushSettingsUnLoginComposeFragment pushSettingsUnLoginComposeFragment, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = pushSettingsUnLoginComposeFragment;
        this.i1 = i;
    }
}
