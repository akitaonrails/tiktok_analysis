package com.bytedance.android.livesdk.model.message.linker.invite_message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AuthenticationInfo_ProtoDecoder implements C0IMD<AuthenticationInfo> {
    public static AuthenticationInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AuthenticationInfo authenticationInfo = new AuthenticationInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            authenticationInfo.authenticationBadge = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        authenticationInfo.enterpriseVerifyReason = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    authenticationInfo.custom_verify = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return authenticationInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AuthenticationInfo authenticationInfo) {
        ImageModel imageModel = authenticationInfo.authenticationBadge;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final AuthenticationInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AuthenticationInfo authenticationInfo, List list) {
    }
}
