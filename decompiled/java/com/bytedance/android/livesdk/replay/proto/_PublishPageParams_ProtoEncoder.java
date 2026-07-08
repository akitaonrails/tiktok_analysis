package com.bytedance.android.livesdk.replay.proto;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _PublishPageParams_ProtoEncoder implements InterfaceC1132110fZB<PublishPageParams> {
    public static void LIZIZ(C1142350fph c1142350fph, PublishPageParams publishPageParams) {
        List<TextStickerConfig> list = publishPageParams.textStickerConfig;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < publishPageParams.textStickerConfig.size(); i++) {
                TextStickerConfig textStickerConfig = (TextStickerConfig) ListProtector.get(publishPageParams.textStickerConfig, i);
                if (textStickerConfig != null) {
                    c1142350fph.LIZLLL(1, 2);
                    c1142350fph.LJ(_TextStickerConfig_ProtoEncoder.LIZJ(textStickerConfig));
                    _TextStickerConfig_ProtoEncoder.LIZIZ(c1142350fph, textStickerConfig);
                }
            }
        }
        C1142340fpg.LJFF(c1142350fph, 2, publishPageParams.musicId);
        List<SpecialEffectConfig> list2 = publishPageParams.specialEffectConfig;
        if (list2 != null && !list2.isEmpty()) {
            for (int i2 = 0; i2 < publishPageParams.specialEffectConfig.size(); i2++) {
                SpecialEffectConfig specialEffectConfig = (SpecialEffectConfig) ListProtector.get(publishPageParams.specialEffectConfig, i2);
                if (specialEffectConfig != null) {
                    c1142350fph.LIZLLL(3, 2);
                    c1142350fph.LJ(C1142340fpg.LJIILL(1, specialEffectConfig.effectId));
                    C1142340fpg.LJFF(c1142350fph, 1, specialEffectConfig.effectId);
                }
            }
        }
        C1142340fpg.LJFF(c1142350fph, 4, publishPageParams.defaultText);
        List<String> list3 = publishPageParams.challenges;
        if (list3 != null && !list3.isEmpty()) {
            for (int i3 = 0; i3 < publishPageParams.challenges.size(); i3++) {
                C1142340fpg.LJFF(c1142350fph, 5, (String) ListProtector.get(publishPageParams.challenges, i3));
            }
        }
        List<Mention> list4 = publishPageParams.mentions;
        if (list4 != null && !list4.isEmpty()) {
            for (int i4 = 0; i4 < publishPageParams.mentions.size(); i4++) {
                Mention mention = (Mention) ListProtector.get(publishPageParams.mentions, i4);
                if (mention != null) {
                    c1142350fph.LIZLLL(6, 2);
                    c1142350fph.LJ(C1142340fpg.LJIILL(1, mention.userId) + C1142340fpg.LJIILL(2, mention.nickname));
                    C1142340fpg.LJFF(c1142350fph, 1, mention.userId);
                    C1142340fpg.LJFF(c1142350fph, 2, mention.nickname);
                }
            }
        }
        List<HashtagStickerConfig> list5 = publishPageParams.hashtagStickerConfig;
        if (list5 != null && !list5.isEmpty()) {
            for (int i5 = 0; i5 < publishPageParams.hashtagStickerConfig.size(); i5++) {
                HashtagStickerConfig hashtagStickerConfig = (HashtagStickerConfig) ListProtector.get(publishPageParams.hashtagStickerConfig, i5);
                if (hashtagStickerConfig != null) {
                    c1142350fph.LIZLLL(7, 2);
                    c1142350fph.LJ(_HashtagStickerConfig_ProtoEncoder.LIZIZ(hashtagStickerConfig));
                    C1142340fpg.LJFF(c1142350fph, 1, hashtagStickerConfig.text);
                    C1142340fpg.LIZIZ(c1142350fph, 2, hashtagStickerConfig.centerX);
                    C1142340fpg.LIZIZ(c1142350fph, 3, hashtagStickerConfig.centerY);
                }
            }
        }
        boolean z = publishPageParams.isCaptionOn;
        c1142350fph.LIZLLL(8, 0);
        c1142350fph.LJ(z ? 1 : 0);
        List<InfoStickerConfig> list6 = publishPageParams.infoStickerConfig;
        if (list6 != null && !list6.isEmpty()) {
            for (int i6 = 0; i6 < publishPageParams.infoStickerConfig.size(); i6++) {
                InfoStickerConfig infoStickerConfig = (InfoStickerConfig) ListProtector.get(publishPageParams.infoStickerConfig, i6);
                if (infoStickerConfig != null) {
                    c1142350fph.LIZLLL(9, 2);
                    c1142350fph.LJ(_InfoStickerConfig_ProtoEncoder.LIZIZ(infoStickerConfig));
                    C1142340fpg.LJFF(c1142350fph, 1, infoStickerConfig.stickerId);
                    C1142340fpg.LIZIZ(c1142350fph, 2, infoStickerConfig.centerX);
                    C1142340fpg.LIZIZ(c1142350fph, 3, infoStickerConfig.centerY);
                }
            }
        }
        List<Caption> list7 = publishPageParams.captions;
        if (list7 != null && !list7.isEmpty()) {
            for (int i7 = 0; i7 < publishPageParams.captions.size(); i7++) {
                Caption caption = (Caption) ListProtector.get(publishPageParams.captions, i7);
                if (caption != null) {
                    c1142350fph.LIZLLL(10, 2);
                    c1142350fph.LJ(_Caption_ProtoEncoder.LIZJ(caption));
                    _Caption_ProtoEncoder.LIZIZ(c1142350fph, caption);
                }
            }
        }
        C1142340fpg.LJFF(c1142350fph, 11, publishPageParams.transitionEffectId);
        boolean z2 = publishPageParams.isPreGenCaption;
        c1142350fph.LIZLLL(12, 0);
        c1142350fph.LJ(z2 ? 1 : 0);
        int i8 = publishPageParams.captionStatus;
        c1142350fph.LIZLLL(13, 0);
        c1142350fph.LIZJ(i8);
        boolean z3 = publishPageParams.canAddSticker;
        c1142350fph.LIZLLL(14, 0);
        c1142350fph.LJ(z3 ? 1 : 0);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, PublishPageParams publishPageParams) {
        LIZIZ(c1142350fph, publishPageParams);
    }
}
