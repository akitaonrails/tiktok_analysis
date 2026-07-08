package com.bytedance.android.livesdk.chatroom.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class _UpdateStatusReqMessage_ProtoDecoder implements C0IMD<UpdateStatusReqMessage> {
    @Override // X.C0IMD
    public final UpdateStatusReqMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        UpdateStatusReqMessage updateStatusReqMessage = new UpdateStatusReqMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        updateStatusReqMessage.roomId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        updateStatusReqMessage.streamId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        updateStatusReqMessage.status = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        updateStatusReqMessage.reasonNo = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        updateStatusReqMessage.source = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        updateStatusReqMessage.frameRate = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        updateStatusReqMessage.bitRate = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        updateStatusReqMessage.pushFps = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        updateStatusReqMessage.thermalValue = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        updateStatusReqMessage.thermalLevel = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        updateStatusReqMessage.pssAppUsage = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        updateStatusReqMessage.memoryUsageRateAndroid = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        updateStatusReqMessage.memoryUsageRateIos = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                        break;
                    case 14:
                        updateStatusReqMessage.cpuSpeed = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                        break;
                    case 15:
                        updateStatusReqMessage.cpuRate = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                        break;
                    case 16:
                        updateStatusReqMessage.broadcastScene = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        updateStatusReqMessage.resolutionHeight = c1516680pZS.LJIIJJI();
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        updateStatusReqMessage.resolutionWidth = c1516680pZS.LJIIJJI();
                        break;
                    case 19:
                        updateStatusReqMessage.isCharging = c1516680pZS.LJIIJJI();
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        updateStatusReqMessage.isHw = c1516680pZS.LJIIJJI();
                        break;
                    case 21:
                        updateStatusReqMessage.drop3DurationRatio = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                        break;
                    case 22:
                        updateStatusReqMessage.uiFps = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                        break;
                    case 23:
                        updateStatusReqMessage.batteryLevel = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                        break;
                    case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                        updateStatusReqMessage.batteryValue = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                        break;
                    case 25:
                        updateStatusReqMessage.pushParamInvalid = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 26:
                        updateStatusReqMessage.eventKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 27:
                        updateStatusReqMessage.cameraMode = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 28:
                        updateStatusReqMessage.reportMode = c1516680pZS.LJIIJJI();
                        break;
                    case 29:
                        updateStatusReqMessage.transportSendVideoStallTime = c1516680pZS.LJIIJJI();
                        break;
                    case 30:
                        updateStatusReqMessage.dropCount = c1516680pZS.LJIIJJI();
                        break;
                    case 31:
                        updateStatusReqMessage.transportSendVideoStallCount = c1516680pZS.LJIIJJI();
                        break;
                    case 32:
                        updateStatusReqMessage.pusherType = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                        updateStatusReqMessage.reconnectCount = c1516680pZS.LJIIJJI();
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                        updateStatusReqMessage.requestTimeMs = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 35:
                        updateStatusReqMessage.volume = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                        updateStatusReqMessage.cameraTargetFps = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                        break;
                    case 37:
                        updateStatusReqMessage.outCapFps = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                        break;
                    case 38:
                        updateStatusReqMessage.effectProcessTime = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                        break;
                    case 39:
                        updateStatusReqMessage.realtimeCpuSpeedScoreHost = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                        break;
                    case 40:
                        updateStatusReqMessage.realtimeThermalScoreHost = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                        break;
                    case 41:
                        updateStatusReqMessage.realtimeStreamDropScore = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                        break;
                    case 42:
                        updateStatusReqMessage.realtimeEffectProcessScore = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                        break;
                    case 43:
                        updateStatusReqMessage.realtimePerformanceHostScore = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                        break;
                    case 44:
                        updateStatusReqMessage.realtimePerformanceNormalizedHostScore = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return updateStatusReqMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(UpdateStatusReqMessage updateStatusReqMessage) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UpdateStatusReqMessage updateStatusReqMessage, List list) {
    }
}
