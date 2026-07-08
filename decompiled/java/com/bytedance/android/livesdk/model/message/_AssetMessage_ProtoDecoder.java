package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets._AssetsModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AssetMessage_ProtoDecoder implements C0IMD<AssetMessage> {
    @Override // X.C0IMD
    public final void LIZ(AssetMessage assetMessage) {
        AssetMessage assetMessage2 = assetMessage;
        CommonMessageData commonMessageData = assetMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        Text text = assetMessage2.panelDisplayText;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        User user = assetMessage2.fromUser;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        User user2 = assetMessage2.toUser;
        if (user2 != null) {
            _User_ProtoDecoder.LJ(user2);
        }
        GiftIMPriority giftIMPriority = assetMessage2.priority;
        if (giftIMPriority != null) {
            _GiftIMPriority_ProtoDecoder.LJ(giftIMPriority);
        }
        AssetsModel assetsModel = assetMessage2.assets;
        if (assetsModel != null) {
            _AssetsModel_ProtoDecoder.LJ(assetsModel);
        }
    }

    @Override // X.C0IMD
    public final AssetMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        AssetMessage assetMessage = new AssetMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        assetMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        assetMessage.assetId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        assetMessage.panelDisplayText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        assetMessage.showMessage = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 5:
                        assetMessage.showPanel = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 6:
                        assetMessage.fromUser = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        assetMessage.toUser = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        assetMessage.priority = _GiftIMPriority_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        assetMessage.logId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        assetMessage.assets = _AssetsModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return assetMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AssetMessage assetMessage, List list) {
    }
}
