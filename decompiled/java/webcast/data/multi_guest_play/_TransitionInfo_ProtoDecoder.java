package webcast.data.multi_guest_play;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TransitionInfo_ProtoDecoder implements C0IMD<TransitionInfo> {
    public static TransitionInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TransitionInfo transitionInfo = new TransitionInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        transitionInfo.userId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        transitionInfo.linkmicIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        transitionInfo.nickname = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        transitionInfo.avatarThumb = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        transitionInfo.transitionDurationOfCurrent = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        transitionInfo.transitionStartTime = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return transitionInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TransitionInfo transitionInfo) {
        ImageModel imageModel = transitionInfo.avatarThumb;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final TransitionInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TransitionInfo transitionInfo, List list) {
    }
}
