package webcast.api.game;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.android.livesdk.model._BannerInRoom_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GameBannerContainer_ProtoDecoder implements C0IMD<GameBannerContainer> {
    public static GameBannerContainer LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GameBannerContainer gameBannerContainer = new GameBannerContainer();
        gameBannerContainer.bannerList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    gameBannerContainer.bannerList.add(_GameBanner_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gameBannerContainer;
            }
        }
    }

    public static void LJ(GameBannerContainer gameBannerContainer) {
        List<GameBanner> list = gameBannerContainer.bannerList;
        if (list == null) {
            gameBannerContainer.bannerList = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (GameBanner gameBanner : gameBannerContainer.bannerList) {
            if (gameBanner != null) {
                BannerInRoom bannerInRoom = gameBanner.livechatBanner;
                if (bannerInRoom != null) {
                    _BannerInRoom_ProtoDecoder.LJ(bannerInRoom);
                }
                ImageModel imageModel = gameBanner.bannerImage;
                if (imageModel != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel);
                }
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GameBannerContainer gameBannerContainer) {
        LJ(gameBannerContainer);
    }

    @Override // X.C0IMD
    public final GameBannerContainer LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GameBannerContainer gameBannerContainer, List list) {
    }
}
