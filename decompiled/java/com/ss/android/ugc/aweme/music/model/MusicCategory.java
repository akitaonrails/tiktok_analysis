package com.ss.android.ugc.aweme.music.model;

/* JADX INFO: loaded from: classes32.dex */
public final class MusicCategory {
    public final String categoryId;
    public final String categoryName;

    public MusicCategory() {
        this("", "");
    }

    public MusicCategory(String str) {
        this(str, "");
    }

    public MusicCategory(String str, String str2) {
        this.categoryName = str;
        this.categoryId = str2;
    }
}
