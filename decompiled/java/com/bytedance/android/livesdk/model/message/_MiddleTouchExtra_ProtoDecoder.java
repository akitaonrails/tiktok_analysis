package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api.SubWaveImMsg;
import com.bytedance.android.livesdk.chatroom.api._SubWaveImMsg_ProtoDecoder;
import com.bytedance.android.livesdk.game.model.GuessWidgets;
import com.bytedance.android.livesdk.game.model._GuessWidgets_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoal;
import com.bytedance.android.livesdk.gift.model._LiveStreamGoal_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model.GalleryMiddleTouchInfo;
import com.bytedance.android.livesdk.goal.model._GalleryMiddleTouchInfo_ProtoDecoder;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MiddleTouchExtra_ProtoDecoder implements C0IMD<MiddleTouchExtra> {
    public static MiddleTouchExtra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MiddleTouchExtra middleTouchExtra = new MiddleTouchExtra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        middleTouchExtra.subWaveData = _SubWaveData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        middleTouchExtra.subGoalData = _SubGoalData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        middleTouchExtra.liveGoalIndicatorStreamGoal = _StreamGoalData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        middleTouchExtra.guessWidgetsData = _GuessWidgetsData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        middleTouchExtra.playTogetherWidgetsData = _PlayTogetherWidgetsData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        middleTouchExtra.subQueueData = _SubQueueData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        middleTouchExtra.galleryGoalData = _GalleryGoalData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        middleTouchExtra.unifiedGoalData = _UnifiedGoalData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        middleTouchExtra.galleryMiddleTouchMessage = _GalleryMiddleTouchMessage_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return middleTouchExtra;
            }
        }
    }

    public static void LJ(MiddleTouchExtra middleTouchExtra) {
        GalleryMiddleTouchInfo galleryMiddleTouchInfo;
        LiveStreamGoal liveStreamGoal;
        LiveStreamGoal liveStreamGoal2;
        User user;
        GuessWidgets guessWidgets;
        LiveStreamGoal liveStreamGoal3;
        LiveStreamGoal liveStreamGoal4;
        SubWaveImMsg subWaveImMsg;
        SubWaveData subWaveData = middleTouchExtra.subWaveData;
        if (subWaveData != null && (subWaveImMsg = subWaveData.subWaveImMsg) != null) {
            _SubWaveImMsg_ProtoDecoder.LJ(subWaveImMsg);
        }
        SubGoalData subGoalData = middleTouchExtra.subGoalData;
        if (subGoalData != null && (liveStreamGoal4 = subGoalData.goal) != null) {
            _LiveStreamGoal_ProtoDecoder.LJ(liveStreamGoal4);
        }
        StreamGoalData streamGoalData = middleTouchExtra.liveGoalIndicatorStreamGoal;
        if (streamGoalData != null && (liveStreamGoal3 = streamGoalData.goal) != null) {
            _LiveStreamGoal_ProtoDecoder.LJ(liveStreamGoal3);
        }
        GuessWidgetsData guessWidgetsData = middleTouchExtra.guessWidgetsData;
        if (guessWidgetsData != null && (guessWidgets = guessWidgetsData.guessWidgets) != null) {
            _GuessWidgets_ProtoDecoder.LJ(guessWidgets);
        }
        SubQueueData subQueueData = middleTouchExtra.subQueueData;
        if (subQueueData != null && (user = subQueueData.currentUser) != null) {
            _User_ProtoDecoder.LJ(user);
        }
        GalleryGoalData galleryGoalData = middleTouchExtra.galleryGoalData;
        if (galleryGoalData != null && (liveStreamGoal2 = galleryGoalData.goal) != null) {
            _LiveStreamGoal_ProtoDecoder.LJ(liveStreamGoal2);
        }
        UnifiedGoalData unifiedGoalData = middleTouchExtra.unifiedGoalData;
        if (unifiedGoalData != null && (liveStreamGoal = unifiedGoalData.goal) != null) {
            _LiveStreamGoal_ProtoDecoder.LJ(liveStreamGoal);
        }
        GalleryMiddleTouchMessage galleryMiddleTouchMessage = middleTouchExtra.galleryMiddleTouchMessage;
        if (galleryMiddleTouchMessage != null && (galleryMiddleTouchInfo = galleryMiddleTouchMessage.galleryMiddleTouchInfo) != null) {
            _GalleryMiddleTouchInfo_ProtoDecoder.LJ(galleryMiddleTouchInfo);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MiddleTouchExtra middleTouchExtra) {
        LJ(middleTouchExtra);
    }

    @Override // X.C0IMD
    public final MiddleTouchExtra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MiddleTouchExtra middleTouchExtra, List list) {
    }
}
