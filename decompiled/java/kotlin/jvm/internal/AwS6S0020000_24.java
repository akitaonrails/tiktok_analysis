package kotlin.jvm.internal;

import X.C05K0;
import X.C09AY;
import X.C0NCI;
import X.C13LE;
import X.C1575830r6r;
import X.C1583670rJV;
import X.C1595530rcd;
import X.C1595780rd2;
import X.C1611580s2W;
import X.C1612160s3S;
import X.C291001Au;
import X.C440140HNs;
import X.EnumC1579210rCJ;
import com.ss.android.ugc.feed.platform.panel.clearmode.ClearModePanelComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes25.dex */
public class AwS6S0020000_24 extends C09AY implements Function1 {
    public final int $t;
    public boolean z0;
    public boolean z1;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS6S0020000_24 awS6S0020000_24, Object obj) {
        return C1575830r6r.LIZ((C1575830r6r) obj, null, false, null, new C291001Au(new C1583670rJV(awS6S0020000_24.z0, awS6S0020000_24.z1)), false, null, false, 119);
    }

    public static final Object invoke$1(AwS6S0020000_24 awS6S0020000_24, Object obj) {
        return C1595530rcd.LIZ((C1595530rcd) obj, null, null, false, false, false, 0, 0, null, null, 0, new C291001Au(new C1595780rd2(awS6S0020000_24.z0, awS6S0020000_24.z1)), 2047);
    }

    public static final Object invoke$2(AwS6S0020000_24 awS6S0020000_24, Object obj) {
        boolean z = awS6S0020000_24.z0;
        boolean z2 = awS6S0020000_24.z1;
        obj.getClass();
        return new C440140HNs(z, z2);
    }

    public static final Object invoke$3(AwS6S0020000_24 awS6S0020000_24, Object obj) {
        C05K0 c05k0 = (C05K0) obj;
        c05k0.LIZJ = C13LE.LIZ(ClearModePanelComponent.class);
        c05k0.LIZ = new C0NCI(awS6S0020000_24.z0, awS6S0020000_24.z1);
        c05k0.LIZIZ = EnumC1579210rCJ.SPARSE;
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS6S0020000_24 awS6S0020000_24, Object obj) {
        return C1612160s3S.LIZ((C1612160s3S) obj, new C1611580s2W(awS6S0020000_24.z0, awS6S0020000_24.z1, false, 0, false, 28), null, null, null, null, false, false, null, null, null, null, null, false, null, null, null, 262142);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S0020000_24(boolean z, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
        this.z1 = z2;
    }
}
