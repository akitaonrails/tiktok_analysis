package com.ss.android.ugc.aweme.feed.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import java.io.Serializable;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class CaptionLanguage implements Serializable {

    @C09CT("can_translate_realtime")
    public boolean canTranslateRealtime;

    @C09CT("can_translate_realtime_skip_translation_lang_check")
    public Boolean canTranslateRealtimeSkipTranslationLangCheck;

    @C09CT("first_subtitle_time")
    public Long firstSubtitleTime;

    @C09CT("is_burnin_caption")
    public Boolean isBurninCaption;

    @C09CT("language_code")
    public String languageCode;

    @C09CT("language_id")
    public long languageId;

    @C09CT("lang")
    public String languageName;

    @C09CT("original_caption_type")
    public Integer originalCaptionType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes32.dex */
    public static final class ClaOriginalCaptionType {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ ClaOriginalCaptionType[] $VALUES;
        public static final Companion Companion;
        public String captionName;
        public final int value;
        public static final ClaOriginalCaptionType CLA_ORIGINAL_CAPTION_TYPE_UNSPECIFIED = new ClaOriginalCaptionType("CLA_ORIGINAL_CAPTION_TYPE_UNSPECIFIED", 0, 0, "unspecified");
        public static final ClaOriginalCaptionType CLA_ORIGINAL_CAPTION_TYPE_ASR = new ClaOriginalCaptionType("CLA_ORIGINAL_CAPTION_TYPE_ASR", 1, 1, "asr");
        public static final ClaOriginalCaptionType CLA_ORIGINAL_CAPTION_TYPE_CEC = new ClaOriginalCaptionType("CLA_ORIGINAL_CAPTION_TYPE_CEC", 2, 2, "cec");
        public static final ClaOriginalCaptionType CLA_ORIGINAL_CAPTION_TYPE_STICKER_CREATOR = new ClaOriginalCaptionType("CLA_ORIGINAL_CAPTION_TYPE_STICKER_CREATOR", 3, 3, "sticker_creator");
        public static final ClaOriginalCaptionType CLA_ORIGINAL_CAPTION_TYPE_CAPCUT_CREATOR = new ClaOriginalCaptionType("CLA_ORIGINAL_CAPTION_TYPE_CAPCUT_CREATOR", 4, 4, "capcut_creator");
        public static final ClaOriginalCaptionType CLA_ORIGINAL_CAPTION_TYPE_THIRD_PARTY_CREATOR = new ClaOriginalCaptionType("CLA_ORIGINAL_CAPTION_TYPE_THIRD_PARTY_CREATOR", 5, 5, "tp_creator");
        public static final ClaOriginalCaptionType CLA_ORIGINAL_CAPTION_TYPE_CLOSED_CREATOR = new ClaOriginalCaptionType("CLA_ORIGINAL_CAPTION_TYPE_CLOSED_CREATOR", 6, 6, "closed_creator");

        public static final /* synthetic */ ClaOriginalCaptionType[] $values() {
            return new ClaOriginalCaptionType[]{CLA_ORIGINAL_CAPTION_TYPE_UNSPECIFIED, CLA_ORIGINAL_CAPTION_TYPE_ASR, CLA_ORIGINAL_CAPTION_TYPE_CEC, CLA_ORIGINAL_CAPTION_TYPE_STICKER_CREATOR, CLA_ORIGINAL_CAPTION_TYPE_CAPCUT_CREATOR, CLA_ORIGINAL_CAPTION_TYPE_THIRD_PARTY_CREATOR, CLA_ORIGINAL_CAPTION_TYPE_CLOSED_CREATOR};
        }

        public static InterfaceC2044707zh<ClaOriginalCaptionType> getEntries() {
            return $ENTRIES;
        }

        static {
            ClaOriginalCaptionType[] claOriginalCaptionTypeArr$values = $values();
            $VALUES = claOriginalCaptionTypeArr$values;
            $ENTRIES = new C2254308sP(claOriginalCaptionTypeArr$values);
            Companion = new Companion();
        }

        public static ClaOriginalCaptionType[] values() {
            return (ClaOriginalCaptionType[]) $VALUES.clone();
        }

        public final String getCaptionName() {
            return this.captionName;
        }

        public final int getValue() {
            return this.value;
        }

        public static final class Companion {
            public final ClaOriginalCaptionType fromInt(Integer num) {
                if (num != null) {
                    num.intValue();
                    for (ClaOriginalCaptionType claOriginalCaptionType : ClaOriginalCaptionType.values()) {
                        if (claOriginalCaptionType.getValue() == num.intValue()) {
                            return claOriginalCaptionType;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
                return ClaOriginalCaptionType.CLA_ORIGINAL_CAPTION_TYPE_UNSPECIFIED;
            }
        }

        public static ClaOriginalCaptionType valueOf(String str) {
            return (ClaOriginalCaptionType) C08FF.LIZ(ClaOriginalCaptionType.class, str);
        }

        public final void setCaptionName(String str) {
            this.captionName = str;
        }

        public ClaOriginalCaptionType(String str, int i, int i2, String str2) {
            this.value = i2;
            this.captionName = str2;
        }
    }

    public CaptionLanguage() {
        this("", 0L, "", false, null, null, null, null);
    }

    public final ClaOriginalCaptionType getOriginalCaptionType() {
        return ClaOriginalCaptionType.Companion.fromInt(this.originalCaptionType);
    }

    public final Boolean isBurninCaption() {
        return this.isBurninCaption;
    }

    public CaptionLanguage(String str, long j, String str2, boolean z, Integer num, Boolean bool, Boolean bool2, Long l) {
        this.languageName = str;
        this.languageId = j;
        this.languageCode = str2;
        this.canTranslateRealtime = z;
        this.originalCaptionType = num;
        this.isBurninCaption = bool;
        this.canTranslateRealtimeSkipTranslationLangCheck = bool2;
        this.firstSubtitleTime = l;
    }
}
