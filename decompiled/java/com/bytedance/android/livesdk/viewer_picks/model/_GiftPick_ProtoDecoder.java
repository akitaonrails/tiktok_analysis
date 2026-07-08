package com.bytedance.android.livesdk.viewer_picks.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftPick_ProtoDecoder implements C0IMD<GiftPick> {
    public static GiftPick LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftPick giftPick = new GiftPick();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        giftPick.giftId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        giftPick.customizedDesc = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        giftPick.giftIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        giftPick.giftPrice = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        giftPick.giftPickId = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        giftPick.giftPickIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        giftPick.isPriorityRequest = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 8:
                        giftPick.descSource = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        giftPick.extra = _GiftPickExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftPick;
            }
        }
    }

    public static void LJ(GiftPick giftPick) {
        GiftPickExtraGameTricks giftPickExtraGameTricks;
        GiftPickExtraGameTricksStorage giftPickExtraGameTricksStorage;
        ControlChaosInfo controlChaosInfo;
        ImageModel imageModel = giftPick.giftIcon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        GiftPickExtra giftPickExtra = giftPick.extra;
        if (giftPickExtra != null && (giftPickExtraGameTricks = giftPickExtra.gameTricks) != null && (giftPickExtraGameTricksStorage = giftPickExtraGameTricks.storage) != null && (controlChaosInfo = giftPickExtraGameTricksStorage.controlChaosInfo) != null) {
            _ControlChaosInfo_ProtoDecoder.LJ(controlChaosInfo);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftPick giftPick) {
        LJ(giftPick);
    }

    @Override // X.C0IMD
    public final GiftPick LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftPick giftPick, List list) {
    }
}
