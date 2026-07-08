package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.chatroom.model.interact._GiftGalleryBadgeInfo_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _MultiInviteResponse_ProtoDecoder implements C0IMD<MultiInviteResponse> {
    @Override // X.C0IMD
    public final void LIZ(MultiInviteResponse multiInviteResponse) {
        MultiInviteResponse multiInviteResponse2 = multiInviteResponse;
        List<TeamUser> list = multiInviteResponse2.battleTeamUser;
        if (list == null) {
            multiInviteResponse2.battleTeamUser = new ArrayList();
        } else if (!list.isEmpty()) {
            for (TeamUser teamUser : multiInviteResponse2.battleTeamUser) {
                if (teamUser != null && teamUser.userIds == null) {
                    teamUser.userIds = new ArrayList();
                }
            }
        }
        GiftModeMeta giftModeMeta = multiInviteResponse2.giftModeMeta;
        if (giftModeMeta != null) {
            _GiftModeMeta_ProtoDecoder.LJ(giftModeMeta);
        }
        Map<Long, GiftGalleryBadgeInfo> map = multiInviteResponse2.leagueInfoMap;
        if (map == null) {
            multiInviteResponse2.leagueInfoMap = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<Long, GiftGalleryBadgeInfo>> it2 = multiInviteResponse2.leagueInfoMap.entrySet().iterator();
            while (it2.hasNext()) {
                GiftGalleryBadgeInfo value = it2.next().getValue();
                if (value != null) {
                    _GiftGalleryBadgeInfo_ProtoDecoder.LJ(value);
                }
            }
        }
        GiftModeMetaV2 giftModeMetaV2 = multiInviteResponse2.giftModeMetaV2;
        if (giftModeMetaV2 != null) {
            _GiftModeMetaV2_ProtoDecoder.LJ(giftModeMetaV2);
        }
    }

    @Override // X.C0IMD
    public final MultiInviteResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        MultiInviteResponse multiInviteResponse = new MultiInviteResponse();
        multiInviteResponse.battleTeamUser = new ArrayList();
        multiInviteResponse.leagueInfoMap = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        multiInviteResponse.battleId = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 2:
                        multiInviteResponse.meanwhileInviteScene = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        multiInviteResponse.battleTeamUser.add(_TeamUser_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 4:
                        multiInviteResponse.giftModeMeta = _GiftModeMeta_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        Long lValueOf = null;
                        GiftGalleryBadgeInfo giftGalleryBadgeInfoLIZLLL = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 != -1) {
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        giftGalleryBadgeInfoLIZLLL = _GiftGalleryBadgeInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ2);
                                if (lValueOf != null) {
                                    if (giftGalleryBadgeInfoLIZLLL != null) {
                                        multiInviteResponse.leagueInfoMap.put(lValueOf, giftGalleryBadgeInfoLIZLLL);
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
                    case 6:
                        multiInviteResponse.giftModeMetaV2 = _GiftModeMetaV2_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return multiInviteResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MultiInviteResponse multiInviteResponse, List list) {
    }
}
