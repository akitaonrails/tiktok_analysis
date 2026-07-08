package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.minute_game.model.MinuteGameGameplay;
import com.bytedance.android.livesdk.minute_game.model.TriggerGift;
import com.bytedance.android.livesdk.minute_game.model._MinuteGameGameplay_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.MinuteGameUpdateMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MinuteGameUpdateMessage_ProtoDecoder implements C0IMD<MinuteGameUpdateMessage> {
    @Override // X.C0IMD
    public final void LIZ(MinuteGameUpdateMessage minuteGameUpdateMessage) {
        GiftMessage giftMessage;
        TriggerGift triggerGift;
        ImageModel imageModel;
        MinuteGameUpdateMessage minuteGameUpdateMessage2 = minuteGameUpdateMessage;
        CommonMessageData commonMessageData = minuteGameUpdateMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        MinuteGameGameplay minuteGameGameplay = minuteGameUpdateMessage2.gameplay;
        if (minuteGameGameplay != null && (triggerGift = minuteGameGameplay.triggerGift) != null && (imageModel = triggerGift.image) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        MinuteGameUpdateMessage.TimedPropData timedPropData = minuteGameUpdateMessage2.timedPropData;
        if (timedPropData != null && (giftMessage = timedPropData.giftMessage) != null) {
            _GiftMessage_ProtoDecoder.LJ(giftMessage);
        }
    }

    @Override // X.C0IMD
    public final MinuteGameUpdateMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        MinuteGameUpdateMessage minuteGameUpdateMessage = new MinuteGameUpdateMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                minuteGameUpdateMessage.timedPropData = _MinuteGameUpdateMessage_TimedPropData_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            minuteGameUpdateMessage.gameplay = _MinuteGameGameplay_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        minuteGameUpdateMessage.updateType = c1516680pZS.LJIIJ();
                    }
                } else {
                    minuteGameUpdateMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return minuteGameUpdateMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MinuteGameUpdateMessage minuteGameUpdateMessage, List list) {
    }
}
