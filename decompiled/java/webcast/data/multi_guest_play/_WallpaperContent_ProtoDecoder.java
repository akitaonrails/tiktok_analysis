package webcast.data.multi_guest_play;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _WallpaperContent_ProtoDecoder implements C0IMD<WallpaperContent> {
    public static WallpaperContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        WallpaperContent wallpaperContent = new WallpaperContent();
        wallpaperContent.playUserList = new ArrayList();
        wallpaperContent.finishedUserList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        wallpaperContent.roomId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        wallpaperContent.channelId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        wallpaperContent.wallpaperId = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        wallpaperContent.status = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        wallpaperContent.sendTimestamp = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        wallpaperContent.playUserId = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        wallpaperContent.wallpaperUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        wallpaperContent.finishedUserList.add(_WallpaperContext_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        wallpaperContent.playUserList.add(_WallpaperContext_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return wallpaperContent;
            }
        }
    }

    public static void LJ(WallpaperContent wallpaperContent) {
        ImageModel imageModel;
        ImageModel imageModel2;
        List<WallpaperContext> list = wallpaperContent.finishedUserList;
        if (list == null) {
            wallpaperContent.finishedUserList = new ArrayList();
        } else if (!list.isEmpty()) {
            for (WallpaperContext wallpaperContext : wallpaperContent.finishedUserList) {
                if (wallpaperContext != null && (imageModel = wallpaperContext.avatarThumb) != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel);
                }
            }
        }
        List<WallpaperContext> list2 = wallpaperContent.playUserList;
        if (list2 == null) {
            wallpaperContent.playUserList = new ArrayList();
            return;
        }
        if (list2.isEmpty()) {
            return;
        }
        for (WallpaperContext wallpaperContext2 : wallpaperContent.playUserList) {
            if (wallpaperContext2 != null && (imageModel2 = wallpaperContext2.avatarThumb) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel2);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(WallpaperContent wallpaperContent) {
        LJ(wallpaperContent);
    }

    @Override // X.C0IMD
    public final WallpaperContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, WallpaperContent wallpaperContent, List list) {
    }
}
