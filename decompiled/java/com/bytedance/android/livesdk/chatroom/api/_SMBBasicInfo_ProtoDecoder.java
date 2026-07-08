package com.bytedance.android.livesdk.chatroom.api;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SMBBasicInfo_ProtoDecoder implements C0IMD<SMBBasicInfo> {
    public static SMBBasicInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SMBBasicInfo sMBBasicInfo = new SMBBasicInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        sMBBasicInfo.name = _ContentAuditStatus_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        sMBBasicInfo.desc = _ContentAuditStatus_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        sMBBasicInfo.phoneNum = _ContentAuditStatus_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        sMBBasicInfo.email = _ContentAuditStatus_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        sMBBasicInfo.emailIcon = _IconInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        sMBBasicInfo.phoneIcon = _IconInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        sMBBasicInfo.phoneCountryCode = _ContentAuditStatus_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return sMBBasicInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SMBBasicInfo sMBBasicInfo) {
        SMBBasicInfo sMBBasicInfo2 = sMBBasicInfo;
        IconInfo iconInfo = sMBBasicInfo2.emailIcon;
        if (iconInfo != null) {
            ImageModel imageModel = iconInfo.lightImage;
            if (imageModel != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
            ImageModel imageModel2 = iconInfo.darkImage;
            if (imageModel2 != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel2);
            }
        }
        IconInfo iconInfo2 = sMBBasicInfo2.phoneIcon;
        if (iconInfo2 != null) {
            ImageModel imageModel3 = iconInfo2.lightImage;
            if (imageModel3 != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel3);
            }
            ImageModel imageModel4 = iconInfo2.darkImage;
            if (imageModel4 != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel4);
            }
        }
    }

    @Override // X.C0IMD
    public final SMBBasicInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SMBBasicInfo sMBBasicInfo, List list) {
    }
}
