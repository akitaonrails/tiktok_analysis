package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class TranslationInfo implements Serializable {

    @C09CT("image_major_language")
    public String iamgeMajorLanguage;

    @C09CT("target_language")
    public String targetLanguage;

    @C09CT("translatable")
    public boolean translatable;

    public TranslationInfo() {
        this(false, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TranslationInfo)) {
            return false;
        }
        TranslationInfo translationInfo = (TranslationInfo) obj;
        return this.translatable == translationInfo.translatable && Intrinsics.LJFF(this.targetLanguage, translationInfo.targetLanguage) && Intrinsics.LJFF(this.iamgeMajorLanguage, translationInfo.iamgeMajorLanguage);
    }

    public TranslationInfo(boolean z, String str, String str2) {
        this.translatable = z;
        this.targetLanguage = str;
        this.iamgeMajorLanguage = str2;
    }
}
