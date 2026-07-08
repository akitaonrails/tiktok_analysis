package tikcast.api.anchor;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.livesdk.replay.proto.Caption;
import com.bytedance.android.livesdk.replay.proto.HashtagStickerConfig;
import com.bytedance.android.livesdk.replay.proto.InfoStickerConfig;
import com.bytedance.android.livesdk.replay.proto.Mention;
import com.bytedance.android.livesdk.replay.proto.PublishPageParams;
import com.bytedance.android.livesdk.replay.proto.SpecialEffectConfig;
import com.bytedance.android.livesdk.replay.proto.SpriteImageItem;
import com.bytedance.android.livesdk.replay.proto.TextStickerConfig;
import com.bytedance.android.livesdk.replay.proto._Caption_ProtoEncoder;
import com.bytedance.android.livesdk.replay.proto._HashtagStickerConfig_ProtoEncoder;
import com.bytedance.android.livesdk.replay.proto._InfoStickerConfig_ProtoEncoder;
import com.bytedance.android.livesdk.replay.proto._PublishPageParams_ProtoEncoder;
import com.bytedance.android.livesdk.replay.proto._SpriteImageItem_ProtoEncoder;
import com.bytedance.android.livesdk.replay.proto._TextStickerConfig_ProtoEncoder;
import com.bytedance.android.livesdk.replay.proto._VideoMetaInfo_ProtoEncoder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class _LiveFragmentDetail_ProtoEncoder implements InterfaceC1132110fZB<LiveFragmentDetail> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, LiveFragmentDetail liveFragmentDetail) {
        int i;
        int iLIZIZ;
        int iLIZIZ2;
        int iLIZIZ3;
        int iLIZIZ4;
        int iLIZIZ5;
        int iLIZIZ6;
        int iLIZ;
        LiveFragmentDetail liveFragmentDetail2 = liveFragmentDetail;
        long j = liveFragmentDetail2.fragmentId;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJFF(j);
        C1142340fpg.LJFF(c1142350fph, 2, liveFragmentDetail2.fragmentIdStr);
        long j2 = liveFragmentDetail2.roomId;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJFF(j2);
        C1142340fpg.LJFF(c1142350fph, 4, liveFragmentDetail2.vid);
        C1142340fpg.LJFF(c1142350fph, 5, liveFragmentDetail2.downloadUrl);
        C1142340fpg.LJFF(c1142350fph, 6, liveFragmentDetail2.coverUrl);
        long j3 = liveFragmentDetail2.ownerUserId;
        c1142350fph.LIZLLL(7, 0);
        c1142350fph.LJFF(j3);
        long j4 = liveFragmentDetail2.startTime;
        c1142350fph.LIZLLL(8, 0);
        c1142350fph.LJFF(j4);
        long j5 = liveFragmentDetail2.endTime;
        c1142350fph.LIZLLL(9, 0);
        c1142350fph.LJFF(j5);
        C1142340fpg.LJFF(c1142350fph, 10, liveFragmentDetail2.extra);
        long j6 = liveFragmentDetail2.createTime;
        c1142350fph.LIZLLL(11, 0);
        c1142350fph.LJFF(j6);
        long j7 = liveFragmentDetail2.updateTime;
        c1142350fph.LIZLLL(12, 0);
        c1142350fph.LJFF(j7);
        C1142340fpg.LJFF(c1142350fph, 13, liveFragmentDetail2.title);
        long j8 = liveFragmentDetail2.markTime;
        c1142350fph.LIZLLL(14, 0);
        c1142350fph.LJFF(j8);
        long j9 = liveFragmentDetail2.opTime;
        c1142350fph.LIZLLL(15, 0);
        c1142350fph.LJFF(j9);
        C1142340fpg.LJFF(c1142350fph, 16, liveFragmentDetail2.streamUrl);
        C1142340fpg.LJFF(c1142350fph, 17, liveFragmentDetail2.previewPicUrl);
        C1142340fpg.LJFF(c1142350fph, 18, liveFragmentDetail2.roomIdStr);
        C1142340fpg.LJFF(c1142350fph, 19, liveFragmentDetail2.ownerUserIdStr);
        long j10 = liveFragmentDetail2.replayCreateTime;
        c1142350fph.LIZLLL(20, 0);
        c1142350fph.LJFF(j10);
        int i2 = liveFragmentDetail2.isEdit;
        c1142350fph.LIZLLL(21, 0);
        c1142350fph.LIZJ(i2);
        boolean z = liveFragmentDetail2.isPosted;
        c1142350fph.LIZLLL(22, 0);
        c1142350fph.LJ(z ? 1 : 0);
        int i3 = liveFragmentDetail2.fragmentType;
        c1142350fph.LIZLLL(23, 0);
        c1142350fph.LIZJ(i3);
        long j11 = liveFragmentDetail2.height;
        c1142350fph.LIZLLL(24, 0);
        c1142350fph.LJFF(j11);
        long j12 = liveFragmentDetail2.witdh;
        c1142350fph.LIZLLL(25, 0);
        c1142350fph.LJFF(j12);
        boolean z2 = liveFragmentDetail2.isMuted;
        c1142350fph.LIZLLL(26, 0);
        c1142350fph.LJ(z2 ? 1 : 0);
        C1142340fpg.LJFF(c1142350fph, 27, liveFragmentDetail2.businessExtra);
        long j13 = liveFragmentDetail2.businessScore;
        c1142350fph.LIZLLL(28, 0);
        c1142350fph.LJFF(j13);
        long j14 = liveFragmentDetail2.videoSize;
        c1142350fph.LIZLLL(29, 0);
        c1142350fph.LJFF(j14);
        C1142340fpg.LIZJ(c1142350fph, 30, liveFragmentDetail2.videoDuration);
        long j15 = liveFragmentDetail2.forecastGenNeedTime;
        c1142350fph.LIZLLL(31, 0);
        c1142350fph.LJFF(j15);
        long j16 = liveFragmentDetail2.replayRelativeTime;
        c1142350fph.LIZLLL(32, 0);
        c1142350fph.LJFF(j16);
        LiveFragmentShowInfo liveFragmentShowInfo = liveFragmentDetail2.showInfo;
        if (liveFragmentShowInfo != null) {
            c1142350fph.LIZLLL(33, 2);
            int iLJIILL = C1142340fpg.LJIILL(1, liveFragmentShowInfo.icon) + C1142340fpg.LJIILL(2, liveFragmentShowInfo.desc) + C1142340fpg.LJIILL(3, liveFragmentShowInfo.subTitle) + C1142340fpg.LJIILL(4, liveFragmentShowInfo.popUpPageInfo);
            if (liveFragmentShowInfo.singleGiftHighlightShowInfo == null) {
                iLIZ = 0;
            } else {
                int iLJI = C1142340fpg.LJI(1) + C1142340fpg.LJI(2);
                iLIZ = C1142350fph.LIZ(5) + iLJI + C1142350fph.LIZIZ(iLJI);
            }
            c1142350fph.LJ(iLJIILL + iLIZ + C1142340fpg.LJIILL(6, liveFragmentShowInfo.businessShowInfo) + C1142340fpg.LJIILL(7, liveFragmentShowInfo.name));
            _LiveFragmentShowInfo_ProtoEncoder.LIZIZ(c1142350fph, liveFragmentShowInfo);
        }
        _VideoMetaInfo_ProtoEncoder.LIZJ(c1142350fph, 34, liveFragmentDetail2.mp4VideoMetaInfo);
        int i4 = liveFragmentDetail2.fragmentTypeNew;
        c1142350fph.LIZLLL(35, 0);
        c1142350fph.LIZJ(i4);
        List<SpriteImageItem> list = liveFragmentDetail2.spriteList;
        if (list != null && !list.isEmpty()) {
            for (int i5 = 0; i5 < liveFragmentDetail2.spriteList.size(); i5++) {
                SpriteImageItem spriteImageItem = (SpriteImageItem) ListProtector.get(liveFragmentDetail2.spriteList, i5);
                if (spriteImageItem != null) {
                    c1142350fph.LIZLLL(36, 2);
                    c1142350fph.LJ(C1142340fpg.LJIILL(1, spriteImageItem.url) + C1142340fpg.LJIIL(2, spriteImageItem.spriteNum) + C1142340fpg.LJIIL(3, spriteImageItem.imageXNum) + C1142340fpg.LJIIL(4, spriteImageItem.imageYNum) + C1142340fpg.LJIIL(5, spriteImageItem.imageHeight) + C1142340fpg.LJIIL(6, spriteImageItem.imageWidth) + C1142340fpg.LJIIL(7, spriteImageItem.fps));
                    _SpriteImageItem_ProtoEncoder.LIZIZ(c1142350fph, spriteImageItem);
                }
            }
        }
        PublishPageParams publishPageParams = liveFragmentDetail2.publishPageParams;
        if (publishPageParams != null) {
            c1142350fph.LIZLLL(37, 2);
            List<TextStickerConfig> list2 = publishPageParams.textStickerConfig;
            if (list2 != null && !list2.isEmpty()) {
                i = 0;
                for (int i6 = 0; i6 < publishPageParams.textStickerConfig.size(); i6++) {
                    TextStickerConfig textStickerConfig = (TextStickerConfig) ListProtector.get(publishPageParams.textStickerConfig, i6);
                    if (textStickerConfig == null) {
                        iLIZIZ6 = 0;
                    } else {
                        int iLIZJ = _TextStickerConfig_ProtoEncoder.LIZJ(textStickerConfig);
                        iLIZIZ6 = iLIZJ + C1142350fph.LIZIZ(iLIZJ) + C1142350fph.LIZ(1);
                    }
                    i += iLIZIZ6;
                }
            } else {
                i = 0;
            }
            int iLJIILL2 = i + C1142340fpg.LJIILL(2, publishPageParams.musicId);
            List<SpecialEffectConfig> list3 = publishPageParams.specialEffectConfig;
            if (list3 != null && !list3.isEmpty()) {
                for (int i7 = 0; i7 < publishPageParams.specialEffectConfig.size(); i7++) {
                    SpecialEffectConfig specialEffectConfig = (SpecialEffectConfig) ListProtector.get(publishPageParams.specialEffectConfig, i7);
                    if (specialEffectConfig == null) {
                        iLIZIZ5 = 0;
                    } else {
                        int iLJIILL3 = C1142340fpg.LJIILL(1, specialEffectConfig.effectId);
                        iLIZIZ5 = iLJIILL3 + C1142350fph.LIZIZ(iLJIILL3) + C1142350fph.LIZ(3);
                    }
                    iLJIILL2 += iLIZIZ5;
                }
            }
            int iLJIILL4 = iLJIILL2 + C1142340fpg.LJIILL(4, publishPageParams.defaultText);
            List<String> list4 = publishPageParams.challenges;
            if (list4 != null && !list4.isEmpty()) {
                for (int i8 = 0; i8 < publishPageParams.challenges.size(); i8++) {
                    iLJIILL4 += C1142340fpg.LJIILL(5, (String) ListProtector.get(publishPageParams.challenges, i8));
                }
            }
            List<Mention> list5 = publishPageParams.mentions;
            if (list5 != null && !list5.isEmpty()) {
                for (int i9 = 0; i9 < publishPageParams.mentions.size(); i9++) {
                    Mention mention = (Mention) ListProtector.get(publishPageParams.mentions, i9);
                    if (mention == null) {
                        iLIZIZ4 = 0;
                    } else {
                        int iLJIILL5 = C1142340fpg.LJIILL(1, mention.userId) + C1142340fpg.LJIILL(2, mention.nickname);
                        iLIZIZ4 = iLJIILL5 + C1142350fph.LIZIZ(iLJIILL5) + C1142350fph.LIZ(6);
                    }
                    iLJIILL4 += iLIZIZ4;
                }
            }
            List<HashtagStickerConfig> list6 = publishPageParams.hashtagStickerConfig;
            if (list6 != null && !list6.isEmpty()) {
                for (int i10 = 0; i10 < publishPageParams.hashtagStickerConfig.size(); i10++) {
                    HashtagStickerConfig hashtagStickerConfig = (HashtagStickerConfig) ListProtector.get(publishPageParams.hashtagStickerConfig, i10);
                    if (hashtagStickerConfig == null) {
                        iLIZIZ3 = 0;
                    } else {
                        int iLIZIZ7 = _HashtagStickerConfig_ProtoEncoder.LIZIZ(hashtagStickerConfig);
                        iLIZIZ3 = iLIZIZ7 + C1142350fph.LIZIZ(iLIZIZ7) + C1142350fph.LIZ(7);
                    }
                    iLJIILL4 += iLIZIZ3;
                }
            }
            int iLJI2 = iLJIILL4 + C1142340fpg.LJI(8);
            List<InfoStickerConfig> list7 = publishPageParams.infoStickerConfig;
            if (list7 != null && !list7.isEmpty()) {
                for (int i11 = 0; i11 < publishPageParams.infoStickerConfig.size(); i11++) {
                    InfoStickerConfig infoStickerConfig = (InfoStickerConfig) ListProtector.get(publishPageParams.infoStickerConfig, i11);
                    if (infoStickerConfig == null) {
                        iLIZIZ2 = 0;
                    } else {
                        int iLIZIZ8 = _InfoStickerConfig_ProtoEncoder.LIZIZ(infoStickerConfig);
                        iLIZIZ2 = iLIZIZ8 + C1142350fph.LIZIZ(iLIZIZ8) + C1142350fph.LIZ(9);
                    }
                    iLJI2 += iLIZIZ2;
                }
            }
            List<Caption> list8 = publishPageParams.captions;
            if (list8 != null && !list8.isEmpty()) {
                for (int i12 = 0; i12 < publishPageParams.captions.size(); i12++) {
                    Caption caption = (Caption) ListProtector.get(publishPageParams.captions, i12);
                    if (caption == null) {
                        iLIZIZ = 0;
                    } else {
                        int iLIZJ2 = _Caption_ProtoEncoder.LIZJ(caption);
                        iLIZIZ = iLIZJ2 + C1142350fph.LIZIZ(iLIZJ2) + C1142350fph.LIZ(10);
                    }
                    iLJI2 += iLIZIZ;
                }
            }
            c1142350fph.LJ(iLJI2 + C1142340fpg.LJIILL(11, publishPageParams.transitionEffectId) + C1142340fpg.LJI(12) + C1142340fpg.LJIIIZ(13, publishPageParams.captionStatus) + C1142340fpg.LJI(14));
            _PublishPageParams_ProtoEncoder.LIZIZ(c1142350fph, publishPageParams);
        }
        long j17 = liveFragmentDetail2.businessId;
        c1142350fph.LIZLLL(38, 0);
        c1142350fph.LJFF(j17);
        C1142340fpg.LJFF(c1142350fph, 39, liveFragmentDetail2.subType);
        C1142340fpg.LJFF(c1142350fph, 40, liveFragmentDetail2.fragmentIdEncode);
        boolean z3 = liveFragmentDetail2.rendered;
        c1142350fph.LIZLLL(41, 0);
        c1142350fph.LJ(z3 ? 1 : 0);
        boolean z4 = liveFragmentDetail2.resolutionChanged;
        c1142350fph.LIZLLL(42, 0);
        c1142350fph.LJ(z4 ? 1 : 0);
        int i13 = liveFragmentDetail2.videoStatus;
        c1142350fph.LIZLLL(43, 0);
        c1142350fph.LIZJ(i13);
        C1142340fpg.LJFF(c1142350fph, 44, liveFragmentDetail2.messageContentPb);
        C1142340fpg.LJFF(c1142350fph, 45, liveFragmentDetail2.originalVid);
        _VideoMetaInfo_ProtoEncoder.LIZJ(c1142350fph, 46, liveFragmentDetail2.originalMp4VideoMetaInfo);
        C1142340fpg.LJFF(c1142350fph, 47, liveFragmentDetail2.messageShareScene);
        int i14 = liveFragmentDetail2.postStatus;
        c1142350fph.LIZLLL(48, 0);
        c1142350fph.LIZJ(i14);
        int i15 = liveFragmentDetail2.revertStatus;
        c1142350fph.LIZLLL(49, 0);
        c1142350fph.LIZJ(i15);
        boolean z5 = liveFragmentDetail2.showRevertVideo;
        c1142350fph.LIZLLL(50, 0);
        c1142350fph.LJ(z5 ? 1 : 0);
        _VideoMetaInfo_ProtoEncoder.LIZJ(c1142350fph, 51, liveFragmentDetail2.revertMp4VideoMetaInfo);
        C1142340fpg.LJFF(c1142350fph, 52, liveFragmentDetail2.revertVid);
        int i16 = liveFragmentDetail2.videoQualityStrategy;
        c1142350fph.LIZLLL(55, 0);
        c1142350fph.LIZJ(i16);
        C1142340fpg.LJFF(c1142350fph, 56, liveFragmentDetail2.gifCoverUrl);
        int i17 = liveFragmentDetail2.postByScene;
        c1142350fph.LIZLLL(57, 0);
        c1142350fph.LIZJ(i17);
        C1142340fpg.LJFF(c1142350fph, 58, liveFragmentDetail2.itemIdStr);
        boolean z6 = liveFragmentDetail2.isGifCover;
        c1142350fph.LIZLLL(59, 0);
        c1142350fph.LJ(z6 ? 1 : 0);
        C1142340fpg.LJFF(c1142350fph, 60, liveFragmentDetail2.smallCoverUrl);
        List<String> list9 = liveFragmentDetail2.coverThemeColor;
        if (list9 != null && !list9.isEmpty()) {
            for (int i18 = 0; i18 < liveFragmentDetail2.coverThemeColor.size(); i18++) {
                C1142340fpg.LJFF(c1142350fph, 61, (String) ListProtector.get(liveFragmentDetail2.coverThemeColor, i18));
            }
        }
        boolean z7 = liveFragmentDetail2.hasDetectedMusic;
        c1142350fph.LIZLLL(62, 0);
        c1142350fph.LJ(z7 ? 1 : 0);
        C1142340fpg.LJFF(c1142350fph, 63, liveFragmentDetail2.longTitle);
        AiClipWidget aiClipWidget = liveFragmentDetail2.aiClipWidget;
        if (aiClipWidget != null) {
            c1142350fph.LIZLLL(64, 2);
            c1142350fph.LJ(C1142340fpg.LJIILL(1, aiClipWidget.iconUrl) + C1142340fpg.LJIILL(2, aiClipWidget.text));
            C1142340fpg.LJFF(c1142350fph, 1, aiClipWidget.iconUrl);
            C1142340fpg.LJFF(c1142350fph, 2, aiClipWidget.text);
        }
    }
}
