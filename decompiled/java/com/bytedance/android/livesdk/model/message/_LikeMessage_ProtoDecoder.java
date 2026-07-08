package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.model.LikeEffect;
import com.bytedance.android.livesdk.model._LikeEffect_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LikeMessage_ProtoDecoder implements C0IMD<LikeMessage> {
    @Override // X.C0IMD
    public final void LIZ(LikeMessage likeMessage) {
        Text text;
        LikeMessage likeMessage2 = likeMessage;
        CommonMessageData commonMessageData = likeMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        User user = likeMessage2.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        List<ImageModel> list = likeMessage2.icons;
        if (list == null) {
            likeMessage2.icons = new ArrayList();
        } else if (!list.isEmpty()) {
            for (ImageModel imageModel : likeMessage2.icons) {
                if (imageModel != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel);
                }
            }
        }
        List<SpecifiedDisplayText> list2 = likeMessage2.specifiedDisplayText;
        if (list2 == null) {
            likeMessage2.specifiedDisplayText = new ArrayList();
        } else if (!list2.isEmpty()) {
            for (SpecifiedDisplayText specifiedDisplayText : likeMessage2.specifiedDisplayText) {
                if (specifiedDisplayText != null && (text = specifiedDisplayText.displayText) != null) {
                    _Text_ProtoDecoder.LJ(text);
                }
            }
        }
        List<LikeEffect> list3 = likeMessage2.likeEffect;
        if (list3 == null) {
            likeMessage2.likeEffect = new ArrayList();
        } else if (!list3.isEmpty()) {
            Iterator<LikeEffect> it2 = likeMessage2.likeEffect.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        PublicAreaMessageCommon publicAreaMessageCommon = likeMessage2.publicAreaMessageCommon;
        if (publicAreaMessageCommon != null) {
            _PublicAreaMessageCommon_ProtoDecoder.LJ(publicAreaMessageCommon);
        }
    }

    @Override // X.C0IMD
    public final LikeMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LikeMessage likeMessage = new LikeMessage();
        likeMessage.specifiedDisplayText = new ArrayList();
        likeMessage.likeEffect = new ArrayList();
        likeMessage.icons = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        likeMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        likeMessage.count = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        likeMessage.total = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        likeMessage.color = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        likeMessage.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        likeMessage.icon = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        likeMessage.icons.add(_ImageModel_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 8:
                        likeMessage.specifiedDisplayText.add(_SpecifiedDisplayText_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        likeMessage.effectCnt = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        likeMessage.likeEffect.add(_LikeEffect_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        likeMessage.publicAreaMessageCommon = _PublicAreaMessageCommon_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        likeMessage.roomMessageHeatLevel = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return likeMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LikeMessage likeMessage, List list) {
    }
}
