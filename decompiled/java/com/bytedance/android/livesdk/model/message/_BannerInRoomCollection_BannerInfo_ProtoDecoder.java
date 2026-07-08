package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.android.livesdk.model._BannerInRoom_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.BannerInRoomCollection;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BannerInRoomCollection_BannerInfo_ProtoDecoder implements C0IMD<BannerInRoomCollection.BannerInfo> {
    public static BannerInRoomCollection.BannerInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BannerInRoomCollection.BannerInfo bannerInfo = new BannerInRoomCollection.BannerInfo();
        bannerInfo.bannerList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        bannerInfo.url = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        bannerInfo.bannerList.add(_BannerInRoom_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 3:
                        bannerInfo.animationImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        bannerInfo.collapseInfo = _BannerCollapseInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        bannerInfo.height = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        bannerInfo.width = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        bannerInfo.lynxContainerUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        bannerInfo.containerType = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bannerInfo;
            }
        }
    }

    public static void LJ(BannerInRoomCollection.BannerInfo bannerInfo) {
        List<BannerInRoom> list = bannerInfo.bannerList;
        if (list == null) {
            bannerInfo.bannerList = new ArrayList();
        } else if (!list.isEmpty()) {
            for (BannerInRoom bannerInRoom : bannerInfo.bannerList) {
                if (bannerInRoom != null) {
                    _BannerInRoom_ProtoDecoder.LJ(bannerInRoom);
                }
            }
        }
        ImageModel imageModel = bannerInfo.animationImage;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        BannerCollapseInfo bannerCollapseInfo = bannerInfo.collapseInfo;
        if (bannerCollapseInfo != null) {
            Text text = bannerCollapseInfo.title;
            if (text != null) {
                _Text_ProtoDecoder.LJ(text);
            }
            ImageModel imageModel2 = bannerCollapseInfo.image;
            if (imageModel2 != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel2);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BannerInRoomCollection.BannerInfo bannerInfo) {
        LJ(bannerInfo);
    }

    @Override // X.C0IMD
    public final BannerInRoomCollection.BannerInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BannerInRoomCollection.BannerInfo bannerInfo, List list) {
    }
}
