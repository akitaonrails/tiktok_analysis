package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class HighlightWord implements Serializable {

    @C09CT("name")
    public final String name;

    @C09CT("placeholder")
    public final String placeholder;

    @C09CT("schema")
    public final String schema;

    @C09CT("text")
    public final String text;

    public HighlightWord() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HighlightWord)) {
            return false;
        }
        HighlightWord highlightWord = (HighlightWord) obj;
        return Intrinsics.LJFF(this.text, highlightWord.text) && Intrinsics.LJFF(this.schema, highlightWord.schema) && Intrinsics.LJFF(this.name, highlightWord.name) && Intrinsics.LJFF(this.placeholder, highlightWord.placeholder);
    }

    public int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.schema;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.placeholder;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public HighlightWord(String str, String str2, String str3, String str4) {
        this.text = str;
        this.schema = str2;
        this.name = str3;
        this.placeholder = str4;
    }
}
