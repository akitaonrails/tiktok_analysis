package kotlin.jvm.internal;

import X.C09AY;
import X.C1161090gJv;
import X.C1161100gJw;
import X.C1161140gK0;
import X.C1191440h6s;
import X.C1191450h6t;
import X.C1331660kl2;
import X.C13LP;
import X.C1749280vcc;
import X.C19HL;
import X.C2188811AlT;
import X.InterfaceC1325460kb2;
import android.net.Uri;
import com.bytedance.hybrid.spark.raven.data.RavenVm;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes19.dex */
public class AwS23S0401000_18 extends C09AY implements Function0 {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    public static final Object invoke$0(AwS23S0401000_18 awS23S0401000_18) {
        String strLJJLIIIJ;
        String strLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("insert merge summary insertStartIndex=");
        sbLIZ.append(awS23S0401000_18.i4);
        sbLIZ.append(" existingBody=");
        sbLIZ.append(RavenVm.CQ2((RavenVm) awS23S0401000_18.l0, ((C1161090gJv) awS23S0401000_18.l1).LIZ()));
        sbLIZ.append(" insertBody=");
        sbLIZ.append(RavenVm.CQ2((RavenVm) awS23S0401000_18.l0, (List) awS23S0401000_18.l2));
        sbLIZ.append(" mergedBody=");
        sbLIZ.append(RavenVm.CQ2((RavenVm) awS23S0401000_18.l0, ((C1161090gJv) awS23S0401000_18.l3).LIZ()));
        sbLIZ.append(" mergedLayouts=");
        RavenVm ravenVm = (RavenVm) awS23S0401000_18.l0;
        List<C1161100gJw> list = ((C1161090gJv) awS23S0401000_18.l3).LIZJ;
        ravenVm.getClass();
        if (list != null && !list.isEmpty()) {
            List listLL = C13LP.LL(list, 16);
            if (list.size() > 16) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(", ... total=");
                sbLIZ2.append(list.size());
                sbLIZ2.append(']');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            } else {
                strLIZIZ = e3.f;
            }
            strLJJLIIIJ = C13LP.LJJLIIIJ(listLL, null, e3.e, strLIZIZ, 0, null, AFwS256S0000000_18.get$arr$(899), 25);
        } else {
            strLJJLIIIJ = "[]";
        }
        sbLIZ.append(strLJJLIIIJ);
        sbLIZ.append(" ts=");
        sbLIZ.append(System.currentTimeMillis());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS23S0401000_18 awS23S0401000_18) {
        Uri uri = (Uri) awS23S0401000_18.l0;
        if (uri != null) {
            C1191440h6s c1191440h6s = (C1191440h6s) awS23S0401000_18.l1;
            int i = awS23S0401000_18.i4;
            C19HL c19hl = (C19HL) awS23S0401000_18.l2;
            C1749280vcc c1749280vcc = (C1749280vcc) awS23S0401000_18.l3;
            c1191440h6s.getClass();
            InterfaceC1325460kb2 interfaceC1325460kb2LIZJ = C1331660kl2.LIZJ();
            if (interfaceC1325460kb2LIZJ != null) {
                interfaceC1325460kb2LIZJ.LJIIL(uri, new C1191450h6t(i, uri, c1749280vcc, c19hl, c1191440h6s));
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS23S0401000_18(int i, Uri uri, C1749280vcc c1749280vcc, C19HL c19hl, C1191440h6s c1191440h6s, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = uri;
        this.l1 = c1191440h6s;
        this.i4 = i;
        this.l2 = c19hl;
        this.l3 = c1749280vcc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS23S0401000_18(int i, int i2, RavenVm ravenVm, C1161090gJv c1161090gJv, List<C1161140gK0> list, C1161090gJv c1161090gJv2) {
        super(0);
        this.$t = c1161090gJv2;
        this.i4 = i;
        this.l0 = i2;
        this.l1 = ravenVm;
        this.l2 = c1161090gJv;
        this.l3 = list;
    }
}
