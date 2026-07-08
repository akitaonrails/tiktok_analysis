package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import com.bytedance.android.livesdk.model.message._PollOptionInfo_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PollData_ProtoDecoder implements C0IMD<PollData> {
    public static PollData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PollData pollData = new PollData();
        pollData.pollOptionList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        pollData.pollId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        pollData.pollStatus = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        pollData.startTime = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        pollData.endTime = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        pollData.pollOptionList.add(_PollOptionInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 6:
                        pollData.pollKind = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        pollData.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        pollData.operator = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        pollData.templateId = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    case BdTuring.TYPE_EMAIL /* 11 */:
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case 14:
                        pollData.voteLimit = _PollVoteLimit_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 15:
                        pollData.giftId = c1516680pZS.LJIIJJI();
                        break;
                    case 16:
                        pollData.pollIndex = c1516680pZS.LJIIJJI();
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        pollData.pollSponsor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        pollData.pollUserCnt = c1516680pZS.LJIIJJI();
                        break;
                    case 19:
                        pollData.gift = _Gift_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        pollData.endType = c1516680pZS.LJIIJ();
                        break;
                    case 21:
                        pollData.suggestedQuestionKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 22:
                        pollData.isSuggestedQuestion = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 23:
                        pollData.originalPollDurationMs = c1516680pZS.LJIIJJI();
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return pollData;
            }
        }
    }

    public static void LJ(PollData pollData) {
        List<PollOptionInfo> list = pollData.pollOptionList;
        if (list == null) {
            pollData.pollOptionList = new ArrayList();
        } else if (!list.isEmpty()) {
            for (PollOptionInfo pollOptionInfo : pollData.pollOptionList) {
                if (pollOptionInfo != null) {
                    _PollOptionInfo_ProtoDecoder.LJ(pollOptionInfo);
                }
            }
        }
        User user = pollData.operator;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        Gift gift = pollData.gift;
        if (gift != null) {
            _Gift_ProtoDecoder.LJ(gift);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PollData pollData) {
        LJ(pollData);
    }

    @Override // X.C0IMD
    public final PollData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PollData pollData, List list) {
    }
}
