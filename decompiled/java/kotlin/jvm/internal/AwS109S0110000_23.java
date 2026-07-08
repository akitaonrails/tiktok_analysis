package kotlin.jvm.internal;

import X.AbstractC1534220q1k;
import X.AbstractC1541140qCu;
import X.C09AY;
import X.C0VSP;
import X.C1533790q13;
import X.C1540930qCZ;
import X.C1618770sE7;
import X.C2188811AlT;
import java.io.File;
import java.io.InputStream;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes24.dex */
public class AwS109S0110000_23 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS109S0110000_23 awS109S0110000_23, Object obj) {
        boolean zLIZ;
        AbstractC1541140qCu abstractC1541140qCu = (AbstractC1541140qCu) obj;
        if (awS109S0110000_23.z1) {
            zLIZ = abstractC1541140qCu.LIZJ((C1540930qCZ) awS109S0110000_23.l0);
        } else {
            zLIZ = abstractC1541140qCu.LIZ((C1540930qCZ) awS109S0110000_23.l0);
        }
        return Boolean.valueOf(zLIZ);
    }

    public static final Object invoke$1(AwS109S0110000_23 awS109S0110000_23, Object obj) {
        Object obj2;
        C0VSP c0vsp;
        C1533790q13 c1533790q13 = (C1533790q13) obj;
        File file = null;
        if (!c1533790q13.LIZIZ || (c1533790q13.LIZLLL() == null && c1533790q13.LIZ() == null)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ProInboxUpgradeGuidePopupTask fetchGeckoResource fail, ");
            sbLIZ.append(c1533790q13.LIZLLL);
            C1618770sE7.LJFF(C2188811AlT.LIZIZ(sbLIZ));
            Function1 function1 = (Function1) awS109S0110000_23.l0;
            if (function1 != null) {
                function1.invoke(null);
            }
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("ProInboxUpgradeGuidePopupTask fetchGeckoResource success, from: ");
            sbLIZ2.append(c1533790q13.LJ);
            sbLIZ2.append(" response.filePath: ");
            sbLIZ2.append(c1533790q13.LIZLLL());
            C1618770sE7.LJFF(C2188811AlT.LIZIZ(sbLIZ2));
            if (awS109S0110000_23.z1) {
                String strLIZLLL = c1533790q13.LIZLLL();
                AbstractC1534220q1k<?> abstractC1534220q1kLIZ = c1533790q13.LIZ();
                if (abstractC1534220q1kLIZ != null) {
                    obj2 = abstractC1534220q1kLIZ.LIZLLL;
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof File) {
                    file = (File) obj2;
                }
                if (file != null) {
                    c0vsp = new C0VSP(file);
                } else {
                    c0vsp = new C0VSP(strLIZLLL);
                }
                Function1 function12 = (Function1) awS109S0110000_23.l0;
                if (function12 != null) {
                    function12.invoke(new Pair(c0vsp, strLIZLLL));
                }
            } else {
                Function1 function13 = (Function1) awS109S0110000_23.l0;
                if (function13 != null) {
                    function13.invoke(null);
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS109S0110000_23(Function1 function1, Function1<? super Pair<? extends InputStream, String>, Unit> function12, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = function1;
        this.z1 = function12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS109S0110000_23(boolean z, C1540930qCZ c1540930qCZ, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c1540930qCZ;
    }
}
