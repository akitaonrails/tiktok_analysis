package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import webcast.im.JoinGroupMessageExtra;

/* JADX INFO: loaded from: classes.dex */
public final class _JoinGroupMessageExtra_RivalGuestExtra_ProtoDecoder implements C0IMD<JoinGroupMessageExtra.RivalGuestExtra> {
    public static JoinGroupMessageExtra.RivalGuestExtra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        JoinGroupMessageExtra.RivalGuestExtra rivalGuestExtra = new JoinGroupMessageExtra.RivalGuestExtra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            rivalGuestExtra.nickname = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        rivalGuestExtra.avatarThumb = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    rivalGuestExtra.userId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return rivalGuestExtra;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(JoinGroupMessageExtra.RivalGuestExtra rivalGuestExtra) {
        ImageModel imageModel = rivalGuestExtra.avatarThumb;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final JoinGroupMessageExtra.RivalGuestExtra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, JoinGroupMessageExtra.RivalGuestExtra rivalGuestExtra, List list) {
    }
}
