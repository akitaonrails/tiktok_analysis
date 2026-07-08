package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import webcast.data.multi_guest_play.WallpaperContent;
import webcast.data.multi_guest_play._WallpaperContent_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _WallpaperMessage_ProtoDecoder implements C0IMD<WallpaperMessage> {
    @Override // X.C0IMD
    public final void LIZ(WallpaperMessage wallpaperMessage) {
        WallpaperMessage wallpaperMessage2 = wallpaperMessage;
        CommonMessageData commonMessageData = wallpaperMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        WallpaperContent wallpaperContent = wallpaperMessage2.wallpaperContent;
        if (wallpaperContent != null) {
            _WallpaperContent_ProtoDecoder.LJ(wallpaperContent);
        }
    }

    @Override // X.C0IMD
    public final WallpaperMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        WallpaperMessage wallpaperMessage = new WallpaperMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            wallpaperMessage.wallpaperContent = _WallpaperContent_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        wallpaperMessage.messageType = c1516680pZS.LJIIJ();
                    }
                } else {
                    wallpaperMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return wallpaperMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, WallpaperMessage wallpaperMessage, List list) {
    }
}
