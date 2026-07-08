package com.ss.android.ugc.aweme.feed.model;

import X.C08FF;
import X.C09CT;
import X.C2097908Jt;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes32.dex */
public final class CaptionModel implements Serializable {

    @C09CT("appearance")
    public CaptionAppearance appearance;

    @C09CT("caption_infos")
    public List<CaptionItemModel> captionList;

    @C09CT("captions_type")
    public Integer captionsType;

    @C09CT("creator_edited_caption_id")
    public Long creatorEditedCaptionId;

    @C09CT("duplicate_languages")
    public List<String> duplicateLanguages;

    @C09CT("enable_auto_caption")
    public int enableAutoCaption;

    @C09CT("has_original_audio")
    public int hasOriginalAudio;

    @C09CT("is_author_dubbing_qualified")
    public Boolean isAuthorDubbingQualified;

    @C09CT(alternate = {"no_caption_reason"}, value = "no_caption_reason_v2")
    public Integer noOriginalCaptionReasonV2;

    @C09CT("original_language_info")
    public CaptionLanguage originalCaptionLanguage;

    @C09CT("position")
    public CaptionPosition position;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CaptionsTypeEnum {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ CaptionsTypeEnum[] $VALUES;
        public static final Companion Companion;
        public final int value;
        public static final CaptionsTypeEnum CLA_CAPTIONS_TYPE_UNSPECIFIED = new CaptionsTypeEnum("CLA_CAPTIONS_TYPE_UNSPECIFIED", 0, 0);
        public static final CaptionsTypeEnum CLA_CAPTIONS_TYPE_ORIGINAL = new CaptionsTypeEnum("CLA_CAPTIONS_TYPE_ORIGINAL", 1, 1);
        public static final CaptionsTypeEnum CLA_CAPTIONS_TYPE_ORIGINAL_WITH_TRANSLATION = new CaptionsTypeEnum("CLA_CAPTIONS_TYPE_ORIGINAL_WITH_TRANSLATION", 2, 2);

        public static final /* synthetic */ CaptionsTypeEnum[] $values() {
            return new CaptionsTypeEnum[]{CLA_CAPTIONS_TYPE_UNSPECIFIED, CLA_CAPTIONS_TYPE_ORIGINAL, CLA_CAPTIONS_TYPE_ORIGINAL_WITH_TRANSLATION};
        }

        public static InterfaceC2044707zh<CaptionsTypeEnum> getEntries() {
            return $ENTRIES;
        }

        static {
            CaptionsTypeEnum[] captionsTypeEnumArr$values = $values();
            $VALUES = captionsTypeEnumArr$values;
            $ENTRIES = new C2254308sP(captionsTypeEnumArr$values);
            Companion = new Companion();
        }

        public static CaptionsTypeEnum[] values() {
            return (CaptionsTypeEnum[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }

        public static final class Companion {
            public final CaptionsTypeEnum fromInt(Integer num) {
                if (num != null) {
                    num.intValue();
                    for (CaptionsTypeEnum captionsTypeEnum : CaptionsTypeEnum.values()) {
                        if (captionsTypeEnum.getValue() == num.intValue()) {
                            return captionsTypeEnum;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
                return CaptionsTypeEnum.CLA_CAPTIONS_TYPE_UNSPECIFIED;
            }
        }

        public static CaptionsTypeEnum valueOf(String str) {
            return (CaptionsTypeEnum) C08FF.LIZ(CaptionsTypeEnum.class, str);
        }

        public CaptionsTypeEnum(String str, int i, int i2) {
            this.value = i2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class NoCaptionReasonEnum {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ NoCaptionReasonEnum[] $VALUES;
        public static final Companion Companion;
        public static final Map<Integer, NoCaptionReasonEnum> valueMap;
        public final int value;
        public static final NoCaptionReasonEnum CLA_NO_CAPTION_REASON_NO_OP = new NoCaptionReasonEnum("CLA_NO_CAPTION_REASON_NO_OP", 0, 0);
        public static final NoCaptionReasonEnum CLA_NO_CAPTION_REASON_OTHER = new NoCaptionReasonEnum("CLA_NO_CAPTION_REASON_OTHER", 1, 1);
        public static final NoCaptionReasonEnum CLA_NO_CAPTION_REASON_NOT_AUTHORIZED = new NoCaptionReasonEnum("CLA_NO_CAPTION_REASON_NOT_AUTHORIZED", 2, 2);
        public static final NoCaptionReasonEnum CLA_NO_CAPTION_REASON_SPEECH_UNRECOGNIZED = new NoCaptionReasonEnum("CLA_NO_CAPTION_REASON_SPEECH_UNRECOGNIZED", 3, 3);
        public static final NoCaptionReasonEnum CLA_NO_CAPTION_REASON_LANG_NOT_SUPPORTED = new NoCaptionReasonEnum("CLA_NO_CAPTION_REASON_LANG_NOT_SUPPORTED", 4, 4);
        public static final NoCaptionReasonEnum CLA_NO_CAPTION_REASON_BEING_GENERATED = new NoCaptionReasonEnum("CLA_NO_CAPTION_REASON_BEING_GENERATED", 5, 5);

        public static final /* synthetic */ NoCaptionReasonEnum[] $values() {
            return new NoCaptionReasonEnum[]{CLA_NO_CAPTION_REASON_NO_OP, CLA_NO_CAPTION_REASON_OTHER, CLA_NO_CAPTION_REASON_NOT_AUTHORIZED, CLA_NO_CAPTION_REASON_SPEECH_UNRECOGNIZED, CLA_NO_CAPTION_REASON_LANG_NOT_SUPPORTED, CLA_NO_CAPTION_REASON_BEING_GENERATED};
        }

        public static InterfaceC2044707zh<NoCaptionReasonEnum> getEntries() {
            return $ENTRIES;
        }

        static {
            NoCaptionReasonEnum[] noCaptionReasonEnumArr$values = $values();
            $VALUES = noCaptionReasonEnumArr$values;
            $ENTRIES = new C2254308sP(noCaptionReasonEnumArr$values);
            Companion = new Companion();
            NoCaptionReasonEnum[] noCaptionReasonEnumArrValues = values();
            int iLIZIZ = C2097908Jt.LIZIZ(noCaptionReasonEnumArrValues.length);
            LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
            for (NoCaptionReasonEnum noCaptionReasonEnum : noCaptionReasonEnumArrValues) {
                linkedHashMap.put(Integer.valueOf(noCaptionReasonEnum.value), noCaptionReasonEnum);
            }
            valueMap = linkedHashMap;
        }

        public static NoCaptionReasonEnum[] values() {
            return (NoCaptionReasonEnum[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }

        public static final class Companion {
            public final NoCaptionReasonEnum fromInt(Integer num) {
                NoCaptionReasonEnum noCaptionReasonEnum = NoCaptionReasonEnum.valueMap.get(num);
                if (noCaptionReasonEnum == null) {
                    return NoCaptionReasonEnum.CLA_NO_CAPTION_REASON_NO_OP;
                }
                return noCaptionReasonEnum;
            }
        }

        public static NoCaptionReasonEnum valueOf(String str) {
            return (NoCaptionReasonEnum) C08FF.LIZ(NoCaptionReasonEnum.class, str);
        }

        public NoCaptionReasonEnum(String str, int i, int i2) {
            this.value = i2;
        }
    }

    public CaptionModel() {
        this(0, 0, null, null, null, null, null, null, null, null, null);
    }

    public final CaptionModel copy(int i, int i2, CaptionLanguage captionLanguage, List<CaptionItemModel> list, Long l, CaptionAppearance captionAppearance, CaptionPosition captionPosition, Integer num, Integer num2, List<String> list2, Boolean bool) {
        return new CaptionModel(i, i2, captionLanguage, list, l, captionAppearance, captionPosition, num, num2, list2, bool);
    }

    public final CaptionsTypeEnum getCaptionsType() {
        return CaptionsTypeEnum.Companion.fromInt(this.captionsType);
    }

    public final NoCaptionReasonEnum getNoCaptionReason() {
        return NoCaptionReasonEnum.Companion.fromInt(this.noOriginalCaptionReasonV2);
    }

    public final Boolean isAuthorDubbingQualified() {
        return this.isAuthorDubbingQualified;
    }

    public CaptionModel(int i, int i2, CaptionLanguage captionLanguage, List<CaptionItemModel> list, Long l, CaptionAppearance captionAppearance, CaptionPosition captionPosition, Integer num, Integer num2, List<String> list2, Boolean bool) {
        this.hasOriginalAudio = i;
        this.enableAutoCaption = i2;
        this.originalCaptionLanguage = captionLanguage;
        this.captionList = list;
        this.creatorEditedCaptionId = l;
        this.appearance = captionAppearance;
        this.position = captionPosition;
        this.captionsType = num;
        this.noOriginalCaptionReasonV2 = num2;
        this.duplicateLanguages = list2;
        this.isAuthorDubbingQualified = bool;
    }
}
