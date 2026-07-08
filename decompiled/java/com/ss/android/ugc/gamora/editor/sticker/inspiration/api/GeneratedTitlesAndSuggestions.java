package com.ss.android.ugc.gamora.editor.sticker.inspiration.api;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class GeneratedTitlesAndSuggestions {

    @C09CT("content_directions_suggestions")
    public final LinkedHashMap<String, String> contentDirectionsSuggestions;

    @C09CT("title_suggestions")
    public final List<String> titleSuggestions;

    public GeneratedTitlesAndSuggestions(List<String> list, LinkedHashMap<String, String> linkedHashMap) {
        this.titleSuggestions = list;
        this.contentDirectionsSuggestions = linkedHashMap;
    }
}
