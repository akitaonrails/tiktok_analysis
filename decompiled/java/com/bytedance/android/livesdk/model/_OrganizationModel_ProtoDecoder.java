package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _OrganizationModel_ProtoDecoder implements C0IMD<OrganizationModel> {
    public static OrganizationModel LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        OrganizationModel organizationModel = new OrganizationModel();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        organizationModel.name = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        organizationModel.desc = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        organizationModel.detailUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        organizationModel.donateLink = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        organizationModel.icon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        organizationModel.organizationId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return organizationModel;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(OrganizationModel organizationModel) {
        ImageModel imageModel = organizationModel.icon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final OrganizationModel LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, OrganizationModel organizationModel, List list) {
    }
}
