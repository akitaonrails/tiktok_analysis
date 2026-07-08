package com.bytedance.android.livesdk.chatroom.api;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api.SimplePinCardInfo;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SimplePinCardInfo_ProtoDecoder implements C0IMD<SimplePinCardInfo> {
    public static SimplePinCardInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SimplePinCardInfo simplePinCardInfo = new SimplePinCardInfo();
        simplePinCardInfo.backgrounds = new ArrayList();
        simplePinCardInfo.icons = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        simplePinCardInfo.id = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case 3:
                        simplePinCardInfo.type = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        simplePinCardInfo.content = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        simplePinCardInfo.auditStatus = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        simplePinCardInfo.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        simplePinCardInfo.icons.add(_ImageModel_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 8:
                        simplePinCardInfo.backgrounds.add(_SimplePinCardInfo_Background_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        simplePinCardInfo.platformKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return simplePinCardInfo;
            }
        }
    }

    public static void LJ(SimplePinCardInfo simplePinCardInfo) {
        List<ImageModel> list = simplePinCardInfo.icons;
        if (list == null) {
            simplePinCardInfo.icons = new ArrayList();
        } else if (!list.isEmpty()) {
            for (ImageModel imageModel : simplePinCardInfo.icons) {
                if (imageModel != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel);
                }
            }
        }
        List<SimplePinCardInfo.Background> list2 = simplePinCardInfo.backgrounds;
        if (list2 == null) {
            simplePinCardInfo.backgrounds = new ArrayList();
            return;
        }
        if (list2.isEmpty()) {
            return;
        }
        for (SimplePinCardInfo.Background background : simplePinCardInfo.backgrounds) {
            if (background != null) {
                _SimplePinCardInfo_Background_ProtoDecoder.LJ(background);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SimplePinCardInfo simplePinCardInfo) {
        LJ(simplePinCardInfo);
    }

    @Override // X.C0IMD
    public final SimplePinCardInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SimplePinCardInfo simplePinCardInfo, List list) {
    }
}
