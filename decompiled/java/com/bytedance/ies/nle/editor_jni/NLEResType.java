package com.bytedance.ies.nle.editor_jni;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public enum NLEResType {
    NONE(0),
    DRAFT(1),
    VIDEO(2),
    AUDIO(3),
    IMAGE(4),
    TRANSITION(5),
    EFFECT(6),
    FILTER(7),
    STICKER(8),
    FLOWER(9),
    FONT(10),
    SRT(11),
    ADJUST(12),
    ANIMATION_STICKER(15),
    ANIMATION_VIDEO(16),
    MASK(17),
    PIN(18),
    INFO_STICKER(19),
    IMAGE_STICKER(20),
    TEXT_STICKER(21),
    SUBTITLE_STICKER(22),
    EMOJI_STICKER(23),
    TIME_EFFECT(24),
    CHER_EFFECT(25),
    CHROMA(26),
    ANIMATION_TEXT(27),
    LYRIC_STICKER(28),
    COMPOSER(29),
    AUTOSUBTITLE_STICKER(30),
    TEXT_TEMPLATE(31),
    MIX_MODE(32),
    BUBBLE(33),
    TEXT_SHAPE(34),
    BEAUTY(35),
    SOUND(36),
    RECORD(37),
    ALGORITHM_MV_AUDIO(38),
    MUSIC_MV_AUDIO(39),
    NORMAL_MV_AUDIO(40),
    VOICE_CHANGER_FILTER(41),
    KARAOKE_USER_AUDIO(42),
    ALGORITHM_AUDIO(43),
    AUDIO_DSP_FILTER(44),
    IMAGE_RAW(45),
    EFFECT_STICKER(46),
    AI_MATTING(47),
    AUTO_FILL_FRAME(48),
    CHART_DATA(49),
    COMPOSITE(50),
    ANIMATION_VIDEO_IN(51),
    ANIMATION_VIDEO_OUT(52),
    ANIMATION_VIDEO_COMBO(53),
    AI_MATTING_BLEND(54),
    COMPOSER_ADJUSTMENT(55),
    TEXT_GLOW(56),
    BORDER_STICKER(57);

    public final int swigValue;

    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEResType swigToEnum(int i) {
        NLEResType[] nLEResTypeArr = (NLEResType[]) NLEResType.class.getEnumConstants();
        if (i < nLEResTypeArr.length && i >= 0) {
            NLEResType nLEResType = nLEResTypeArr[i];
            if (nLEResType.swigValue == i) {
                return nLEResType;
            }
        }
        for (NLEResType nLEResType2 : nLEResTypeArr) {
            if (nLEResType2.swigValue == i) {
                return nLEResType2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No enum ");
        sbLIZ.append(NLEResType.class);
        sbLIZ.append(" with value ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static NLEResType valueOf(String str) {
        return (NLEResType) C08FF.LIZ(NLEResType.class, str);
    }

    NLEResType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    NLEResType(NLEResType nLEResType) {
        int i = nLEResType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    NLEResType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
