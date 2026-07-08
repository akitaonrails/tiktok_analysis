package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ScreenMessage_ProtoDecoder implements C0IMD<ScreenMessage> {
    @Override // X.C0IMD
    public final void LIZ(ScreenMessage screenMessage) {
        ImageModel imageModel;
        ScreenMessage screenMessage2 = screenMessage;
        CommonMessageData commonMessageData = screenMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        User user = screenMessage2.userInfo;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        CeremonyEffect ceremonyEffect = screenMessage2.effect;
        if (ceremonyEffect != null) {
            ImageModel imageModel2 = ceremonyEffect.gradeBackground;
            if (imageModel2 != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel2);
            }
            ImageModel imageModel3 = ceremonyEffect.avatarBorder;
            if (imageModel3 != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel3);
            }
        }
        ImageModel imageModel4 = screenMessage2.backgroundImage;
        if (imageModel4 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel4);
        }
        CeremonyEffect ceremonyEffect2 = screenMessage2.ceremonyEffect;
        if (ceremonyEffect2 != null) {
            ImageModel imageModel5 = ceremonyEffect2.gradeBackground;
            if (imageModel5 != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel5);
            }
            ImageModel imageModel6 = ceremonyEffect2.avatarBorder;
            if (imageModel6 != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel6);
            }
        }
        ImageModel imageModel7 = screenMessage2.background;
        if (imageModel7 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel7);
        }
        PublicAreaCommon publicAreaCommon = screenMessage2.publicAreaCommon;
        if (publicAreaCommon != null && (imageModel = publicAreaCommon.userLabel) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final ScreenMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        ScreenMessage screenMessage = new ScreenMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        screenMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        screenMessage.userInfo = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        screenMessage.chatType = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        screenMessage.content = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        screenMessage.priority = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        screenMessage.effect = _CeremonyEffect_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        screenMessage.backgroundImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        screenMessage.ceremonyEffect = _CeremonyEffect_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        screenMessage.background = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        screenMessage.publicAreaCommon = _PublicAreaCommon_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return screenMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ScreenMessage screenMessage, List list) {
    }
}
