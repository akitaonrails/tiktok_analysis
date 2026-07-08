package webcast.api.game;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.android.livesdk.model._BannerInRoom_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GameBanner_ProtoDecoder implements C0IMD<GameBanner> {
    public static GameBanner LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GameBanner gameBanner = new GameBanner();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    gameBanner.activityId = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                gameBanner.activityEndTime = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            gameBanner.activityStartTime = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        gameBanner.bannerImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    gameBanner.livechatBanner = _BannerInRoom_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gameBanner;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GameBanner gameBanner) {
        GameBanner gameBanner2 = gameBanner;
        BannerInRoom bannerInRoom = gameBanner2.livechatBanner;
        if (bannerInRoom != null) {
            _BannerInRoom_ProtoDecoder.LJ(bannerInRoom);
        }
        ImageModel imageModel = gameBanner2.bannerImage;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final GameBanner LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GameBanner gameBanner, List list) {
    }
}
