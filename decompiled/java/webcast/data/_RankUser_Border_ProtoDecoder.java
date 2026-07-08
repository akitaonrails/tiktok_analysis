package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._PrivilegeLogExtra_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import webcast.data.RankUser;

/* JADX INFO: loaded from: classes.dex */
public final class _RankUser_Border_ProtoDecoder implements C0IMD<RankUser.Border> {
    public static RankUser.Border LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RankUser.Border border = new RankUser.Border();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        border.icon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        border.level = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        border.source = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        border.profileDecorationRibbon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        border.borderPrivilegeLogExtra = _PrivilegeLogExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        border.profilePrivilegeLogExtra = _PrivilegeLogExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return border;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RankUser.Border border) {
        RankUser.Border border2 = border;
        ImageModel imageModel = border2.icon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        ImageModel imageModel2 = border2.profileDecorationRibbon;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
    }

    @Override // X.C0IMD
    public final RankUser.Border LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RankUser.Border border, List list) {
    }
}
