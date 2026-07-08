package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TemplateContent_ProtoDecoder implements C0IMD<TemplateContent> {
    public static TemplateContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TemplateContent templateContent = new TemplateContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        templateContent.templateId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        templateContent.templateIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        templateContent.status = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        templateContent.pollKind = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        templateContent.appealStatus = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        templateContent.violationIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return templateContent;
            }
        }
    }

    @Override // X.C0IMD
    public final TemplateContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(TemplateContent templateContent) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TemplateContent templateContent, List list) {
    }
}
