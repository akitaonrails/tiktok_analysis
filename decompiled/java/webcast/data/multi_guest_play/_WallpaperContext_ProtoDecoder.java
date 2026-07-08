package webcast.data.multi_guest_play;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_EnigmaInfo_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _WallpaperContext_ProtoDecoder implements C0IMD<WallpaperContext> {
    public static WallpaperContext LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        WallpaperContext wallpaperContext = new WallpaperContext();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        wallpaperContext.userId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        wallpaperContext.wallpaperStartTime = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        wallpaperContext.nickname = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        wallpaperContext.avatarThumb = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        wallpaperContext.userKeywords = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        wallpaperContext.linkmicIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        wallpaperContext.enigmaInfo = _User_EnigmaInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return wallpaperContext;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(WallpaperContext wallpaperContext) {
        ImageModel imageModel = wallpaperContext.avatarThumb;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final WallpaperContext LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, WallpaperContext wallpaperContext, List list) {
    }
}
