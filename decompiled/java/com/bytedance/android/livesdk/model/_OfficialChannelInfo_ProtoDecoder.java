package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _OfficialChannelInfo_ProtoDecoder implements C0IMD<OfficialChannelInfo> {
    public static OfficialChannelInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        OfficialChannelInfo officialChannelInfo = new OfficialChannelInfo();
        officialChannelInfo.delayEnterTime = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        officialChannelInfo.channelUser = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        officialChannelInfo.channelName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        officialChannelInfo.endTimeStamp = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        officialChannelInfo.forbiddenBeforeEnd = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        officialChannelInfo.maxNextTime = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        Long lValueOf = null;
                        Long lValueOf2 = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 != -1) {
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        lValueOf2 = Long.valueOf(c1516680pZS.LJIIJJI());
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ2);
                                if (lValueOf != null) {
                                    if (lValueOf2 != null) {
                                        officialChannelInfo.delayEnterTime.put(lValueOf, lValueOf2);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                                break;
                            }
                        }
                        break;
                    case 7:
                        officialChannelInfo.backupRoomId = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        officialChannelInfo.backupRoomIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        officialChannelInfo.startTimeStamp = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        officialChannelInfo.roleType = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        officialChannelInfo.existLinkmic = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        officialChannelInfo.linkmicType = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return officialChannelInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(OfficialChannelInfo officialChannelInfo) {
        OfficialChannelInfo officialChannelInfo2 = officialChannelInfo;
        User user = officialChannelInfo2.channelUser;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        if (officialChannelInfo2.delayEnterTime == null) {
            officialChannelInfo2.delayEnterTime = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final OfficialChannelInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, OfficialChannelInfo officialChannelInfo, List list) {
    }
}
