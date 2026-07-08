package com.ss.android.ugc.aweme.plugin.journey;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class JourneyContentLanguageWrapper {

    @C09CT("content_lang_dialog")
    public final JourneyContentLanguageExtra content_lang_dialog;

    @C09CT("content_languages")
    public final List<JourneyContentLanguage> content_languages;

    public JourneyContentLanguageWrapper(List<JourneyContentLanguage> list, JourneyContentLanguageExtra journeyContentLanguageExtra) {
        this.content_languages = list;
        this.content_lang_dialog = journeyContentLanguageExtra;
    }
}
