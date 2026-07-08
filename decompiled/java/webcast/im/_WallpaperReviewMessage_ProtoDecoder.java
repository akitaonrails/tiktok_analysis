package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class _WallpaperReviewMessage_ProtoDecoder implements C0IMD<WallpaperReviewMessage> {
    @Override // X.C0IMD
    public final void LIZ(WallpaperReviewMessage wallpaperReviewMessage) {
        CommonMessageData commonMessageData = wallpaperReviewMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final WallpaperReviewMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        WallpaperReviewMessage wallpaperReviewMessage = new WallpaperReviewMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        wallpaperReviewMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        wallpaperReviewMessage.aiPicUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        wallpaperReviewMessage.reviewResult = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        wallpaperReviewMessage.contextKeywords = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        wallpaperReviewMessage.keywords = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        wallpaperReviewMessage.roomId = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        wallpaperReviewMessage.channelId = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        wallpaperReviewMessage.wallpaperId = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return wallpaperReviewMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, WallpaperReviewMessage wallpaperReviewMessage, List list) {
    }
}
