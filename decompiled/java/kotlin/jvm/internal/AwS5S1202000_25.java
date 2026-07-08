package kotlin.jvm.internal;

import X.C09AY;
import X.C1449000noI;
import X.C1626480sQY;
import X.C1663400tO6;
import X.InterfaceC1625470sOv;
import X.InterfaceC1626470sQX;
import X.InterfaceC1627120sRa;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VERecorder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes26.dex */
public class AwS5S1202000_25 extends C09AY implements Function0 {
    public final int $t;
    public int i3;
    public int i4;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS5S1202000_25 awS5S1202000_25) {
        ((C1663400tO6) awS5S1202000_25.l1).LLILLJJLI.invoke(Integer.valueOf(awS5S1202000_25.i3), Integer.valueOf(awS5S1202000_25.i4), awS5S1202000_25.s0, (VERecorder) awS5S1202000_25.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS5S1202000_25 awS5S1202000_25) {
        boolean z;
        InterfaceC1627120sRa interfaceC1627120sRa;
        Effect effectLIZ;
        String parentId;
        InterfaceC1627120sRa interfaceC1627120sRa2;
        Effect effectLIZ2;
        InterfaceC1626470sQX interfaceC1626470sQXLJLZ = ((C1626480sQY) awS5S1202000_25.l1).LLIZ.LJLZ();
        String effectId = null;
        if ((interfaceC1626470sQXLJLZ instanceof InterfaceC1627120sRa) && (interfaceC1627120sRa2 = (InterfaceC1627120sRa) interfaceC1626470sQXLJLZ) != null && (effectLIZ2 = interfaceC1627120sRa2.LIZ()) != null) {
            effectId = effectLIZ2.getEffectId();
        }
        if (!Intrinsics.LJFF(effectId, awS5S1202000_25.s0)) {
            InterfaceC1625470sOv interfaceC1625470sOvLJII = ((C1626480sQY) awS5S1202000_25.l1).yq().C0().LJII();
            Effect effectLIZ3 = ((InterfaceC1627120sRa) ((InterfaceC1626470sQX) awS5S1202000_25.l2)).LIZ();
            InterfaceC1626470sQX interfaceC1626470sQX = (InterfaceC1626470sQX) awS5S1202000_25.l2;
            if ((interfaceC1626470sQX instanceof InterfaceC1627120sRa) && (interfaceC1627120sRa = (InterfaceC1627120sRa) interfaceC1626470sQX) != null && (effectLIZ = interfaceC1627120sRa.LIZ()) != null && (parentId = effectLIZ.getParentId()) != null && parentId.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            interfaceC1625470sOvLJII.LJIIIZ(new C1449000noI(effectLIZ3, awS5S1202000_25.i3, awS5S1202000_25.i4, false, z, false, true, "half_width_scroll_carousel", "carousel", "carousel", 1056));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S1202000_25(C1626480sQY c1626480sQY, String str, InterfaceC1626470sQX interfaceC1626470sQX, int i, int i2, int i3) {
        super(0);
        this.$t = i3;
        this.l1 = c1626480sQY;
        this.s0 = str;
        this.l2 = interfaceC1626470sQX;
        this.i3 = i;
        this.i4 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S1202000_25(C1663400tO6 c1663400tO6, int i, int i2, String str, VERecorder vERecorder, int i3) {
        super(0);
        this.$t = i3;
        this.l1 = c1663400tO6;
        this.i3 = i;
        this.i4 = i2;
        this.s0 = str;
        this.l2 = vERecorder;
    }
}
