package com.ss.android.ugc.aweme;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class IMTranslationData {

    @C09CT("source_language")
    public final String sourceLanguage;

    @C09CT("cache")
    public final List<IMTranslationTextData> translations;

    public IMTranslationData(String str, List<IMTranslationTextData> list) {
        this.sourceLanguage = str;
        this.translations = list;
    }

    public IMTranslationData(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
