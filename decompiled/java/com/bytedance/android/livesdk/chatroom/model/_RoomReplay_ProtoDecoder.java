package com.bytedance.android.livesdk.chatroom.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.replay.proto.SpriteImageItem;
import com.bytedance.android.livesdk.replay.proto._SpriteImageItem_ProtoDecoder;
import com.bytedance.android.livesdk.replay.proto._VideoMetaInfo_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tikcast.api.anchor.AnchorFragmentListResult;
import tikcast.api.anchor._AnchorFragmentListResult_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _RoomReplay_ProtoDecoder implements C0IMD<RoomReplay> {
    public static RoomReplay LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RoomReplay roomReplay = new RoomReplay();
        roomReplay.moments = new ArrayList();
        roomReplay.spriteList = new ArrayList();
        roomReplay.endOffsets = new ArrayList();
        roomReplay.startOffsets = new ArrayList();
        roomReplay.fragmentCountWithType = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        roomReplay.id = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        roomReplay.createTime = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        roomReplay.finishTime = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        roomReplay.momentGenStats = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        roomReplay.pushStatus = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        roomReplay.moments.add(_RoomReplayMoment_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 7:
                        roomReplay.available = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 8:
                        roomReplay.cover = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        roomReplay.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        roomReplay.fragmentId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        roomReplay.liveMode = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        roomReplay.playUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        roomReplay.downloadUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 14:
                        roomReplay.fanTicket = c1516680pZS.LJIIJJI();
                        break;
                    case 15:
                        roomReplay.totalUser = c1516680pZS.LJIIJJI();
                        break;
                    case 16:
                        roomReplay.punishType = c1516680pZS.LJIIJJI();
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        roomReplay.fragmentCount = c1516680pZS.LJIIJJI();
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        roomReplay.markCount = c1516680pZS.LJIIJJI();
                        break;
                    case 19:
                        roomReplay.playUrlVcodec = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        roomReplay.startTime = c1516680pZS.LJIIJJI();
                        break;
                    case 21:
                        roomReplay.failedReason = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 22:
                        roomReplay.generateDuration = c1516680pZS.LJIIJJI();
                        break;
                    case 23:
                        roomReplay.replayPrompt = c1516680pZS.LJIIJ();
                        break;
                    case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                        roomReplay.status = c1516680pZS.LJIIJ();
                        break;
                    case 25:
                        roomReplay.m3u8Url = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 26:
                        roomReplay.videoInfo = _VideoInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 27:
                        roomReplay.watchStatus = c1516680pZS.LJIIJ();
                        break;
                    case 28:
                        roomReplay.vid = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 29:
                        roomReplay.fragmentCountWithType.add(_FragmentTypeCount_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 30:
                        roomReplay.mp4VideoMetaInfo = _VideoMetaInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 31:
                        roomReplay.spriteList.add(_SpriteImageItem_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 32:
                        roomReplay.remuxInfo = _RemuxInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                        roomReplay.hlsVideoMetaInfo = _VideoMetaInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                        roomReplay.transcodeInfo = _TranscodeInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 35:
                        roomReplay.downloadMode = c1516680pZS.LJIIJ();
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                        roomReplay.roomIdEncode = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 37:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case 38:
                        roomReplay.messageContentPb = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 39:
                        roomReplay.startOffsets.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                        break;
                    case 40:
                        roomReplay.endOffsets.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                        break;
                    case 41:
                        roomReplay.anchorFragmentListResult = _AnchorFragmentListResult_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 42:
                        roomReplay.resolutionRatioInfo = _ResolutionRatioInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 43:
                        roomReplay.musicCopyrightStatus = c1516680pZS.LJIIJ();
                        break;
                    case 44:
                        roomReplay.supportBbDownload = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 45:
                        roomReplay.clipDisable = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 46:
                        roomReplay.isGameRoom = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 47:
                        roomReplay.replayStats = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return roomReplay;
            }
        }
    }

    public static void LJ(RoomReplay roomReplay) {
        ImageModel imageModel;
        List<RoomReplayMoment> list = roomReplay.moments;
        if (list == null) {
            roomReplay.moments = new ArrayList();
        } else if (!list.isEmpty()) {
            for (RoomReplayMoment roomReplayMoment : roomReplay.moments) {
                if (roomReplayMoment != null) {
                    RoomReplayReason roomReplayReason = roomReplayMoment.reason;
                    if (roomReplayReason != null && (imageModel = roomReplayReason.typeIcon) != null) {
                        _ImageModel_ProtoDecoder.LJ(imageModel);
                    }
                    ImageModel imageModel2 = roomReplayMoment.cover;
                    if (imageModel2 != null) {
                        _ImageModel_ProtoDecoder.LJ(imageModel2);
                    }
                }
            }
        }
        ImageModel imageModel3 = roomReplay.cover;
        if (imageModel3 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel3);
        }
        List<FragmentTypeCount> list2 = roomReplay.fragmentCountWithType;
        if (list2 == null) {
            roomReplay.fragmentCountWithType = new ArrayList();
        } else if (!list2.isEmpty()) {
            Iterator<FragmentTypeCount> it2 = roomReplay.fragmentCountWithType.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        List<SpriteImageItem> list3 = roomReplay.spriteList;
        if (list3 == null) {
            roomReplay.spriteList = new ArrayList();
        } else if (!list3.isEmpty()) {
            Iterator<SpriteImageItem> it3 = roomReplay.spriteList.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
        if (roomReplay.startOffsets == null) {
            roomReplay.startOffsets = new ArrayList();
        }
        if (roomReplay.endOffsets == null) {
            roomReplay.endOffsets = new ArrayList();
        }
        AnchorFragmentListResult anchorFragmentListResult = roomReplay.anchorFragmentListResult;
        if (anchorFragmentListResult != null) {
            _AnchorFragmentListResult_ProtoDecoder.LJ(anchorFragmentListResult);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RoomReplay roomReplay) {
        LJ(roomReplay);
    }

    @Override // X.C0IMD
    public final RoomReplay LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RoomReplay roomReplay, List list) {
    }
}
