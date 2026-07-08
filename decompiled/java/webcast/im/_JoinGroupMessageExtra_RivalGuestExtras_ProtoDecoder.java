package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import webcast.im.JoinGroupMessageExtra;

/* JADX INFO: loaded from: classes.dex */
public final class _JoinGroupMessageExtra_RivalGuestExtras_ProtoDecoder implements C0IMD<JoinGroupMessageExtra.RivalGuestExtras> {
    public static JoinGroupMessageExtra.RivalGuestExtras LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        JoinGroupMessageExtra.RivalGuestExtras rivalGuestExtras = new JoinGroupMessageExtra.RivalGuestExtras();
        rivalGuestExtras.rivalGuests = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    rivalGuestExtras.rivalGuests.add(_JoinGroupMessageExtra_RivalGuestExtra_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return rivalGuestExtras;
            }
        }
    }

    public static void LJ(JoinGroupMessageExtra.RivalGuestExtras rivalGuestExtras) {
        ImageModel imageModel;
        List<JoinGroupMessageExtra.RivalGuestExtra> list = rivalGuestExtras.rivalGuests;
        if (list == null) {
            rivalGuestExtras.rivalGuests = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (JoinGroupMessageExtra.RivalGuestExtra rivalGuestExtra : rivalGuestExtras.rivalGuests) {
            if (rivalGuestExtra != null && (imageModel = rivalGuestExtra.avatarThumb) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(JoinGroupMessageExtra.RivalGuestExtras rivalGuestExtras) {
        LJ(rivalGuestExtras);
    }

    @Override // X.C0IMD
    public final JoinGroupMessageExtra.RivalGuestExtras LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, JoinGroupMessageExtra.RivalGuestExtras rivalGuestExtras, List list) {
    }
}
