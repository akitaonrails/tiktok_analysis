package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicSearchHintInfo implements Serializable {

    @C09CT("suggest_words")
    public final List<Scene> suggestWords;
    public String word = "";
    public String wordId = "";

    private final void initWord() {
        List<Scene> list;
        if (this.suggestWords == null) {
            return;
        }
        if ((this.word.length() <= 0 || this.wordId.length() <= 0) && (list = this.suggestWords) != null) {
            for (Scene scene : list) {
                String str = scene.scene;
                List<Word> list2 = scene.words;
                if (Intrinsics.LJFF(str, "search_hint") && list2 != null) {
                    for (Word word : list2) {
                        String str2 = word.word;
                        String str3 = "";
                        if (str2 == null) {
                            str2 = "";
                        }
                        this.word = str2;
                        String str4 = word.wordId;
                        if (str4 != null) {
                            str3 = str4;
                        }
                        this.wordId = str3;
                    }
                }
            }
        }
    }

    public final String getWord() {
        initWord();
        return this.word;
    }

    public final String getWordId() {
        initWord();
        return this.wordId;
    }
}
