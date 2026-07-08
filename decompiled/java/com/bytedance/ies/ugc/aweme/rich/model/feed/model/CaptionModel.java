package com.bytedance.ies.ugc.aweme.rich.model.feed.model;

import X.C09CT;
import X.C20699715zH;
import X.C20702415zi;
import X.EnumC20699615zG;
import X.EnumC20702315zh;
import java.io.Serializable;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes32.dex */
public final class CaptionModel implements Serializable {

    @C09CT("appearance")
    public final CaptionAppearance appearance;

    @C09CT("caption_infos")
    public final List<Object> captionList;

    @C09CT("captions_type")
    public final Integer captionsType;

    @C09CT("creator_edited_caption_id")
    public final Long creatorEditedCaptionId;

    @C09CT("enable_auto_caption")
    public final int enableAutoCaption;

    @C09CT("has_original_audio")
    public final int hasOriginalAudio;

    @C09CT("no_caption_reason")
    public final Integer noCaptionReason;

    @C09CT("original_language_info")
    public final CaptionLanguage originalCaptionLanguage;

    @C09CT("position")
    public final CaptionPosition position;

    public CaptionModel() {
        this(0, 0, null, null, null, null, null, null, null);
    }

    public final EnumC20702315zh getCaptionsType() {
        C20702415zi c20702415zi = EnumC20702315zh.Companion;
        Integer num = this.captionsType;
        c20702415zi.getClass();
        if (num == null) {
            return EnumC20702315zh.CLA_CAPTIONS_TYPE_UNSPECIFIED;
        }
        num.intValue();
        for (EnumC20702315zh enumC20702315zh : EnumC20702315zh.values()) {
            if (enumC20702315zh.getValue() == num.intValue()) {
                return enumC20702315zh;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public final EnumC20699615zG getNoCaptionReason() {
        C20699715zH c20699715zH = EnumC20699615zG.Companion;
        Integer num = this.noCaptionReason;
        c20699715zH.getClass();
        if (num == null) {
            return EnumC20699615zG.CLA_NO_CAPTION_REASON_NO_OP;
        }
        num.intValue();
        for (EnumC20699615zG enumC20699615zG : EnumC20699615zG.values()) {
            if (enumC20699615zG.getValue() == num.intValue()) {
                return enumC20699615zG;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public CaptionModel(int i, int i2, CaptionLanguage captionLanguage, List<Object> list, Long l, CaptionAppearance captionAppearance, CaptionPosition captionPosition, Integer num, Integer num2) {
        this.hasOriginalAudio = i;
        this.enableAutoCaption = i2;
        this.originalCaptionLanguage = captionLanguage;
        this.captionList = list;
        this.creatorEditedCaptionId = l;
        this.appearance = captionAppearance;
        this.position = captionPosition;
        this.captionsType = num;
        this.noCaptionReason = num2;
    }
}
