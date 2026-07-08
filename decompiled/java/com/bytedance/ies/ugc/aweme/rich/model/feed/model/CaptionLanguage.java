package com.bytedance.ies.ugc.aweme.rich.model.feed.model;

import X.C09CT;
import X.C164I;
import X.C164J;
import java.io.Serializable;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes32.dex */
public final class CaptionLanguage implements Serializable {

    @C09CT("can_translate_realtime")
    public final boolean canTranslateRealtime;

    @C09CT("can_translate_realtime_skip_translation_lang_check")
    public final Boolean canTranslateRealtimeSkipTranslationLangCheck;

    @C09CT("first_subtitle_time")
    public final Long firstSubtitleTime;

    @C09CT("is_burnin_caption")
    public final Boolean isBurninCaption;

    @C09CT("language_code")
    public final String languageCode;

    @C09CT("language_id")
    public final long languageId;

    @C09CT("lang")
    public final String languageName;

    @C09CT("original_caption_type")
    public final Integer originalCaptionType;

    public CaptionLanguage() {
        this("", 0L, "", false, null, null, null, null);
    }

    public final C164J getOriginalCaptionType() {
        C164I c164i = C164J.Companion;
        Integer num = this.originalCaptionType;
        c164i.getClass();
        if (num == null) {
            return C164J.CLA_ORIGINAL_CAPTION_TYPE_UNSPECIFIED;
        }
        num.intValue();
        for (C164J c164j : C164J.values()) {
            if (c164j.getValue() == num.intValue()) {
                return c164j;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
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
