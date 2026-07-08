package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C876970Yal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes15.dex */
public final class EcommerceTypeWords {
    public static final C876970Yal Companion = new Object() { // from class: X.0Yal
    };
    public boolean fromCache;
    public String imprId = "";
    public String logId;

    @C09CT("source")
    public final String source;

    @C09CT("type")
    public final String type;

    @C09CT("params")
    public final EcommerceTypeWordsParams typeWordsParams;

    @C09CT("words")
    public List<EcommerceSuggestWord> words;

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

    public final EcommerceTypeWordsParams getTypeWordsParams() {
        return this.typeWordsParams;
    }

    public final List<EcommerceSuggestWord> getWords() {
        return this.words;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof EcommerceTypeWords)) {
            return false;
        }
        if (u.LJIJI(this.source, "inbox", false)) {
            EcommerceTypeWords ecommerceTypeWords = (EcommerceTypeWords) obj;
            if (u.LJIJI(ecommerceTypeWords.source, "inbox", false)) {
                return Intrinsics.LJFF(this.words, ecommerceTypeWords.words);
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

    public final void setWords(List<EcommerceSuggestWord> list) {
        this.words = list;
    }
}
