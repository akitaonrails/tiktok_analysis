package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class _RoomStats_ProtoDecoder implements C0IMD<RoomStats> {
    public static RoomStats LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RoomStats roomStats = new RoomStats();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 5) {
                                if (iLJI != 6) {
                                    if (iLJI != 7) {
                                        if (iLJI != 9) {
                                            if (iLJI != 11) {
                                                switch (iLJI) {
                                                    case 16:
                                                        roomStats.replayViewers = (int) c1516680pZS.LJIIJJI();
                                                        break;
                                                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                                        roomStats.shareCount = (int) c1516680pZS.LJIIJJI();
                                                        break;
                                                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                                        roomStats.commentCount = c1516680pZS.LJIIJJI();
                                                        break;
                                                    case 19:
                                                        roomStats.watchUserCount = c1516680pZS.LJIIJJI();
                                                        break;
                                                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                                        roomStats.roomFollowCount = c1516680pZS.LJIIJJI();
                                                        break;
                                                    default:
                                                        C1516700pZU.LJ(c1516680pZS);
                                                        break;
                                                }
                                            } else {
                                                roomStats.enterCount = (int) c1516680pZS.LJIIJJI();
                                            }
                                        } else {
                                            roomStats.watermelon = (int) c1516680pZS.LJIIJJI();
                                        }
                                    } else {
                                        roomStats.followCount = (int) c1516680pZS.LJIIJJI();
                                    }
                                } else {
                                    roomStats.giftUVCount = (int) c1516680pZS.LJIIJJI();
                                }
                            } else {
                                roomStats.totalUser = (int) c1516680pZS.LJIIJJI();
                            }
                        } else {
                            roomStats.ticket = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        roomStats.idStr = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    roomStats.id = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return roomStats;
            }
        }
    }

    @Override // X.C0IMD
    public final RoomStats LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(RoomStats roomStats) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RoomStats roomStats, List list) {
    }
}
