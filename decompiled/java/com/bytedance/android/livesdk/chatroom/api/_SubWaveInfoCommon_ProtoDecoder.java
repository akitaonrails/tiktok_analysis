package com.bytedance.android.livesdk.chatroom.api;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SubWaveInfoCommon_ProtoDecoder implements C0IMD<SubWaveInfoCommon> {
    public static SubWaveInfoCommon LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SubWaveInfoCommon subWaveInfoCommon = new SubWaveInfoCommon();
        subWaveInfoCommon.subWaveStrikes = new ArrayList();
        subWaveInfoCommon.thanksList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        subWaveInfoCommon.subWaveSettings = _AnchorSubWaveCurrentSettings_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        subWaveInfoCommon.waveSubCount = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        subWaveInfoCommon.totalSubCount = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        subWaveInfoCommon.startTime = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        subWaveInfoCommon.endTime = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        subWaveInfoCommon.waveStatus = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        subWaveInfoCommon.thanksList.add(_SubWaveSubscriberInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 8:
                        subWaveInfoCommon.waveTargetSubCount = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        subWaveInfoCommon.waveOpenRecordId = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        subWaveInfoCommon.subWaveStrikes.add(_SubWaveStrikeInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return subWaveInfoCommon;
            }
        }
    }

    public static void LJ(SubWaveInfoCommon subWaveInfoCommon) {
        AnchorSubWaveChallengeSettings anchorSubWaveChallengeSettings;
        AnchorSubWaveCurrentSettings anchorSubWaveCurrentSettings = subWaveInfoCommon.subWaveSettings;
        if (anchorSubWaveCurrentSettings != null && (anchorSubWaveChallengeSettings = anchorSubWaveCurrentSettings.anchorSubWaveChallengeSettings) != null) {
            _AnchorSubWaveChallengeSettings_ProtoDecoder.LJ(anchorSubWaveChallengeSettings);
        }
        List<SubWaveSubscriberInfo> list = subWaveInfoCommon.thanksList;
        if (list == null) {
            subWaveInfoCommon.thanksList = new ArrayList();
        } else if (!list.isEmpty()) {
            for (SubWaveSubscriberInfo subWaveSubscriberInfo : subWaveInfoCommon.thanksList) {
                if (subWaveSubscriberInfo != null) {
                    _SubWaveSubscriberInfo_ProtoDecoder.LJ(subWaveSubscriberInfo);
                }
            }
        }
        List<SubWaveStrikeInfo> list2 = subWaveInfoCommon.subWaveStrikes;
        if (list2 == null) {
            subWaveInfoCommon.subWaveStrikes = new ArrayList();
            return;
        }
        if (list2.isEmpty()) {
            return;
        }
        for (SubWaveStrikeInfo subWaveStrikeInfo : subWaveInfoCommon.subWaveStrikes) {
            if (subWaveStrikeInfo != null) {
                _SubWaveStrikeInfo_ProtoDecoder.LJ(subWaveStrikeInfo);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SubWaveInfoCommon subWaveInfoCommon) {
        LJ(subWaveInfoCommon);
    }

    @Override // X.C0IMD
    public final SubWaveInfoCommon LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SubWaveInfoCommon subWaveInfoCommon, List list) {
    }
}
