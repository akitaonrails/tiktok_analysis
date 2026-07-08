package kotlin.jvm.internal;

import X.C09AY;
import X.C1494600ozq;
import X.C1771590wCb;
import X.C2188811AlT;
import X.C259800zU;
import java.net.URL;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes27.dex */
public class AwS17S0120000_26 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public boolean z1;
    public boolean z2;

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

    public static final Object invoke$0(AwS17S0120000_26 awS17S0120000_26) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PAGE_TAKE firstFetch=true hitPreload=");
        sbLIZ.append(awS17S0120000_26.z1);
        sbLIZ.append(" hitPreRead=");
        sbLIZ.append(awS17S0120000_26.z2);
        sbLIZ.append(" tag=");
        sbLIZ.append(((C1771590wCb) awS17S0120000_26.l0).LJFF);
        sbLIZ.append(" reason=");
        sbLIZ.append(((C1771590wCb) awS17S0120000_26.l0).LJI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS17S0120000_26 awS17S0120000_26) {
        boolean z;
        String host;
        URL url;
        URL url2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PAGE_FIRST_CHUNK hitPreload=");
        sbLIZ.append(awS17S0120000_26.z1);
        sbLIZ.append(" hitPreread=");
        sbLIZ.append(awS17S0120000_26.z2);
        sbLIZ.append(" urlPresent=");
        C1494600ozq c1494600ozq = (C1494600ozq) ((C259800zU) awS17S0120000_26.l0).element;
        String path = null;
        if (c1494600ozq != null && c1494600ozq.LJIIZILJ != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(" host=");
        C1494600ozq c1494600ozq2 = (C1494600ozq) ((C259800zU) awS17S0120000_26.l0).element;
        if (c1494600ozq2 != null && (url2 = c1494600ozq2.LJIIZILJ) != null) {
            host = url2.getHost();
        } else {
            host = null;
        }
        sbLIZ.append(host);
        sbLIZ.append(" path=");
        C1494600ozq c1494600ozq3 = (C1494600ozq) ((C259800zU) awS17S0120000_26.l0).element;
        if (c1494600ozq3 != null && (url = c1494600ozq3.LJIIZILJ) != null) {
            path = url.getPath();
        }
        sbLIZ.append(path);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS17S0120000_26(boolean z, boolean z2, boolean z3, C259800zU<C1494600ozq<?>> c259800zU) {
        super(0);
        this.$t = c259800zU;
        this.z1 = z;
        this.z2 = z2;
        this.l0 = z3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS17S0120000_26(boolean z, boolean z2, C1771590wCb c1771590wCb, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.z2 = z2;
        this.l0 = c1771590wCb;
    }
}
