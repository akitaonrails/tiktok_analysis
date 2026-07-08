package com.ss.android.ugc.aweme.discover.model.suggest;

import X.C09CT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes11.dex */
public final class TypeWords {
    public static final Companion Companion = new Companion();
    public boolean fromCache;
    public String imprId = "";
    public String logId;

    @C09CT("source")
    public final String source;

    @C09CT("type")
    public final String type;

    @C09CT("params")
    public final TypeWordsParams typeWordsParams;

    @C09CT("words")
    public List<Word> words;

    public static final class Companion {
    }

    public final boolean getFromCache() {
        return this.fromCache;
    }

    public final String getImprId() {
        return this.imprId;
    }

    public final String getLogId() {
        return this.logId;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getType() {
        return this.type;
    }

    public final TypeWordsParams getTypeWordsParams() {
        return this.typeWordsParams;
    }

    public final List<Word> getWords() {
        return this.words;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TypeWords)) {
            return false;
        }
        if (u.LJIJI(this.source, "inbox", false)) {
            TypeWords typeWords = (TypeWords) obj;
            if (u.LJIJI(typeWords.source, "inbox", false)) {
                return Intrinsics.LJFF(this.words, typeWords.words);
            }
        }
        return super.equals(obj);
    }

    public final void setFromCache(boolean z) {
        this.fromCache = z;
    }

    public final void setImprId(String str) {
        this.imprId = str;
    }

    public final void setLogId(String str) {
        this.logId = str;
    }

    public final void setWords(List<Word> list) {
        this.words = list;
    }
}
