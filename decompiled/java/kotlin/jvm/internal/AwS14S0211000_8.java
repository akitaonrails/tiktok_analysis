package kotlin.jvm.internal;

import X.C09AY;
import X.C528910Koj;
import X.C529210KpD;
import X.C532650Kul;
import X.C554100LoG;
import X.InterfaceC1631630sYr;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public class AwS14S0211000_8 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
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

    public static final Object invoke$0(AwS14S0211000_8 awS14S0211000_8, Object obj) {
        C529210KpD c529210KpD = (C529210KpD) obj;
        if (awS14S0211000_8.z2) {
            C528910Koj.LIZ(((C532650Kul) awS14S0211000_8.l0).LIZ, c529210KpD.LJ, awS14S0211000_8.i3, 0, 24);
        }
        ((InterfaceC1631630sYr) awS14S0211000_8.l1).invoke(c529210KpD.LIZIZ, Long.valueOf(c529210KpD.LIZJ), Integer.valueOf(c529210KpD.LJ), c529210KpD.LJFF);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS14S0211000_8 awS14S0211000_8, Object obj) {
        C529210KpD c529210KpD = (C529210KpD) obj;
        if (awS14S0211000_8.z2) {
            C528910Koj.LIZ(((C532650Kul) awS14S0211000_8.l0).LIZ, c529210KpD.LJ, awS14S0211000_8.i3, 0, 24);
        }
        Function1 function1 = (Function1) awS14S0211000_8.l1;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(c529210KpD.LJ));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS14S0211000_8 awS14S0211000_8, Object obj) {
        MentionDataItem mentionDataItem = (MentionDataItem) obj;
        if (awS14S0211000_8.z2) {
            ((C554100LoG) awS14S0211000_8.l0).K4((MentionDataItem) awS14S0211000_8.l1, awS14S0211000_8.i3);
        } else {
            ((C554100LoG) awS14S0211000_8.l0).U5(mentionDataItem, awS14S0211000_8.i3);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS14S0211000_8(boolean z, C532650Kul c532650Kul, int i, int i2) {
        super(1);
        this.$t = i2;
        this.z2 = z;
        this.l0 = c532650Kul;
        this.i3 = i;
        this.l1 = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS14S0211000_8(boolean z, boolean z2, C532650Kul c532650Kul, int i, InterfaceC1631630sYr<? super String, ? super Long, ? super Integer, ? super String, Unit> interfaceC1631630sYr) {
        super(1);
        this.$t = interfaceC1631630sYr;
        this.z2 = z;
        this.l0 = z2;
        this.i3 = c532650Kul;
        this.l1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS14S0211000_8(boolean z, C554100LoG c554100LoG, MentionDataItem mentionDataItem, int i, int i2) {
        super(1);
        this.$t = i2;
        this.z2 = z;
        this.l0 = c554100LoG;
        this.l1 = mentionDataItem;
        this.i3 = i;
    }
}
