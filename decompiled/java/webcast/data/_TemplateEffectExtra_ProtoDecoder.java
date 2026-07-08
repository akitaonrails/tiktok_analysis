package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TemplateEffectExtra_ProtoDecoder implements C0IMD<TemplateEffectExtra> {
    public static TemplateEffectExtra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TemplateEffectExtra templateEffectExtra = new TemplateEffectExtra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    templateEffectExtra.resourceId = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return templateEffectExtra;
            }
        }
    }

    @Override // X.C0IMD
    public final TemplateEffectExtra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(TemplateEffectExtra templateEffectExtra) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TemplateEffectExtra templateEffectExtra, List list) {
    }
}
