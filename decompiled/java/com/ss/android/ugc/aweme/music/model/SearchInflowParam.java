package com.ss.android.ugc.aweme.music.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class SearchInflowParam implements Serializable {
    public final String searchId;
    public final String searchKeyword;
    public final String searchType;
    public final String tokenType;

    public int hashCode() {
        return (((((this.searchId.hashCode() * 31) + this.searchKeyword.hashCode()) * 31) + this.searchType.hashCode()) * 31) + this.tokenType.hashCode();
    }

    public SearchInflowParam(String str, String str2, String str3, String str4) {
        this.searchId = str;
        this.searchKeyword = str2;
        this.searchType = str3;
        this.tokenType = str4;
    }
}
