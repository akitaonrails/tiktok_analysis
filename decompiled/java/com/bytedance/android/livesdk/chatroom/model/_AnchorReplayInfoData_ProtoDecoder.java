package com.bytedance.android.livesdk.chatroom.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import webcast.data.RoomShortVideoStatsWithDate;
import webcast.data._ExcellentHighLightUser_ProtoDecoder;
import webcast.data._RoomShortVideoStatsWithDate_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorReplayInfoData_ProtoDecoder implements C0IMD<AnchorReplayInfoData> {
    public static AnchorReplayInfoData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorReplayInfoData anchorReplayInfoData = new AnchorReplayInfoData();
        anchorReplayInfoData.replays = new ArrayList();
        anchorReplayInfoData.roomShortVideoStatsWithDate = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        anchorReplayInfoData.replays.add(_RoomReplay_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 2:
                        anchorReplayInfoData.style = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        anchorReplayInfoData.hasMore = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 4:
                        anchorReplayInfoData.nextOffset = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        anchorReplayInfoData.amplifyStatus = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        anchorReplayInfoData.showInboxSubPopUp = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 7:
                        anchorReplayInfoData.glipBannerInfo = _GlipBannerInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        anchorReplayInfoData.fragmentListReturned = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        anchorReplayInfoData.roomShortVideoStatsWithDate.add(_RoomShortVideoStatsWithDate_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        anchorReplayInfoData.excellentHighlightUser = _ExcellentHighLightUser_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        anchorReplayInfoData.hasPostedLast7d = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        anchorReplayInfoData.fragmentRevertSwitch = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        anchorReplayInfoData.shareWithViewersSwitch = c1516680pZS.LJIIJ();
                        break;
                    case 14:
                        anchorReplayInfoData.reminderInfo = _PlaylistReminderInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 15:
                        anchorReplayInfoData.funcData = _FuncData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 16:
                        anchorReplayInfoData.shareWithFansClubSwitch = c1516680pZS.LJIIJ();
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        anchorReplayInfoData.shareWithFansClubStrongReach = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        anchorReplayInfoData.supportShareWithFansClub = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 19:
                        anchorReplayInfoData.canStrongReachAutopostLiving = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        anchorReplayInfoData.autopostLivingSwitch = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorReplayInfoData;
            }
        }
    }

    public static void LJ(AnchorReplayInfoData anchorReplayInfoData) {
        List<RoomReplay> list = anchorReplayInfoData.replays;
        if (list == null) {
            anchorReplayInfoData.replays = new ArrayList();
        } else if (!list.isEmpty()) {
            for (RoomReplay roomReplay : anchorReplayInfoData.replays) {
                if (roomReplay != null) {
                    _RoomReplay_ProtoDecoder.LJ(roomReplay);
                }
            }
        }
        List<RoomShortVideoStatsWithDate> list2 = anchorReplayInfoData.roomShortVideoStatsWithDate;
        if (list2 == null) {
            anchorReplayInfoData.roomShortVideoStatsWithDate = new ArrayList();
        } else if (!list2.isEmpty()) {
            Iterator<RoomShortVideoStatsWithDate> it2 = anchorReplayInfoData.roomShortVideoStatsWithDate.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        FuncData funcData = anchorReplayInfoData.funcData;
        if (funcData != null) {
            _FuncData_ProtoDecoder.LJ(funcData);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AnchorReplayInfoData anchorReplayInfoData) {
        LJ(anchorReplayInfoData);
    }

    @Override // X.C0IMD
    public final AnchorReplayInfoData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorReplayInfoData anchorReplayInfoData, List list) {
    }
}
